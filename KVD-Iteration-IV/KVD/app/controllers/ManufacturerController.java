package controllers;

import models.Product;
import play.*;
import play.mvc.*;
import play.data.Form;
import actions.*;
import models.*;

import views.html.*;

import java.util.List;

/**
 * Created by npatel on 4/3/14.
 */
public class ManufacturerController extends Controller{
    public static Result create(Long id) {
        Form<Manufacturer> form = null;
        if(id == 0)
            form = Form.form(Manufacturer.class).fill(new Manufacturer());
        else
            form = Form.form(Manufacturer.class).fill(Manufacturer.findById(id.intValue()));
        return ok(views.html.manufacturer.form.render(form));
    }

    public static Result save() {
        if(request().method() == "POST")
        {
            // Read form data
            Form<Manufacturer> form = Form.form(Manufacturer.class).bindFromRequest();

            Manufacturer m = form.get();
            if(m.id == 0)
                m.save();
            else
                m.update();
            flash("success", "Manufacturer created/updated successfully!!!");
            return redirect(routes.ManufacturerController.list());
        }
        else{
            flash("danger", "Invalid Manufacturer edit request!!!");
            return redirect(routes.ManufacturerController.list());
        }
    }

    public static Result list() {
        List<Manufacturer> manufacturers = Manufacturer.find.all();
        return ok(views.html.manufacturer.list.render(manufacturers));
    }



}
