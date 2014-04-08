package controllers;

import models.Product;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class ProductController extends Controller {

    public static Result list() {
        List<Product> products = Product.find.all();
        return ok(views.html.product.list.render(products));
    }

    /**
     * Search Products
     */
    public static Result search(String queryString) {
        List<Product> products = null;
        if(queryString!=null && queryString.length()>0) {
            products = Product.find.where()
                    .ilike("name", "%" + queryString +"%")
                    .findList();
        }
        else
            products = Product.find.all();
        return ok(views.html.product.list.render(products));
    }


}
