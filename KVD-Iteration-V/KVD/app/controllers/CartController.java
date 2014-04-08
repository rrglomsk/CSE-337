package controllers;

import models.*;
import play.*;
import play.data.Form;
import play.mvc.*;

import java.util.List;

/**
 * Created by npatel on 4/7/14.
 */
public class CartController extends Controller {

    public static Result addProduct(Long pId)
    {
        Product p = Product.findById((int) (long) pId);
        String uuid = session().get("uuid");

        // Create cart if one doesn't exist
        Cart c = Cart.find.where().eq("sessionId", uuid).findUnique();
        if (c == null)
        {
            c = new Cart(uuid);
            c.save();
        }

        // If LineItem exist, update the quantity, else save new item.
        LineItem li = LineItem.find.where().eq("product_id", pId).findUnique();
        if(li == null) {
            li = new LineItem(p);
            li.cart = c;
            li.save();
        }
        else {
            li.quantity += 1;
            li.update();
        }

        // refresh the cart
        c.refresh();
        return redirect(routes.ProductController.list());
    }

    public static play.mvc.Result displayCart() {
        Cart c = Cart.find.where().eq("sessionId", session().get("uuid")).findUnique();
        return ok(views.html.cart.display.render(c));
    }

    public static play.mvc.Result deleteItem(Long item) {
        LineItem line = LineItem.find.byId(item);
        line.delete();
        Cart c = Cart.find.where().eq("sessionId", session().get("uuid")).findUnique();

        return ok(views.html.cart.display.render(c));
    }

}
