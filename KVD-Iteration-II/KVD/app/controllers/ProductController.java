package controllers;

import models.Product;
import play.*;
import play.mvc.*;
import play.data.Form;
import views.html.*;

import java.util.List;
import actions.*;

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
    
    @Auth({User.Role.Admin})
    public static Result create(Long id) {
    	Form<Product> form = null;
    	if(id == 0)
    		form = Form.form(Product.class).fill(new Product());
    	else
    		form = Form.form(Product.class).fill(Product.findById(id.intValue()));
    	return ok(views.html.product.form.render(form));
    }
    
    @Auth({User.Role.Admin})
    public static Result save() {
    	if(request().method() == "POST") {

			// Read form data
			Form<Product> form = Form.form(Product.class).bindFromRequest();
			// Validate the name
			if(form.field("name").valueOr("").isEmpty()){
				Logger.info(form.field("name").valueOr(""));
				form.reject("name", "Product name cannot be empty!!");
			}
		// Validate the description
			if(form.field("description").valueOr("").isEmpty()){
				Logger.info(form.field("description").valueOr(""));
				form.reject("description", "Product description cannot be empty!!");
			}
			// If errors, return the form
			if(form.hasErrors()){
				flash("danger", "Product form submission has error!!!");
				return badRequest(views.html.product.form.render(form));
			}
			else {
				Product p = form.get();
				if(p.id == 0)
					p.save();
				else
					p.update();
				flash("success", "Product created/updated successfully!!!");
				return redirect(routes.ProductController.list());
			}
		}
		else{
			flash("danger", "Invalid product edit request!!!");
			return redirect(routes.ProductController.list());
		}
	}


}
