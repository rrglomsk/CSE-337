package controllers;

import models.User;
import play.data.Form;
import play.mvc.Result;
import play.*;
import play.mvc.*;

import views.html.*;

/**
 * Created by npatel on 3/17/14.
 */
public class UserController extends Controller{

    public static Result register()
    {
        Form<User> userForm = Form.form(User.class).fill(new User());
        return ok(views.html.authentication.register.render(userForm));
    }

    /**
     * Create User
     */
    public static Result save() {
        if(request().method() == "POST")
        {
            // Read form data
            Form<User> form = Form.form(User.class).bindFromRequest();

            // Validate the password and confirm password
            if(!form.field("password").valueOr("").isEmpty()){
                if(!form.field("password").valueOr("")
                        .equals(form.field("confirmpassword").value())){
                    form.reject("confirmpassword", "Password Don't match");
                }
            }

            // If errors, return the form
            if(form.hasErrors()){
                return badRequest(views.html.authentication.register.render(form));
            }
            else{
                User user = form.get();
                user.save();
                flash("success", "Thank you for registering!!!");
                return redirect(routes.ProductController.list());
            }
        }
        else{
            return redirect(routes.UserController.register());
        }
    }

}
