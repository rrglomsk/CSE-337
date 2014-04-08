package actions;

import models.User;
import play.*;
import play.mvc.*;
import play.libs.*;
import controllers.*;

/**
 * Created by npatel on 4/1/14.
 */
public class AuthAction extends Action<Auth>{

    @Override
    public F.Promise<SimpleResult> call(Http.Context context) throws Throwable
    {
        User.Role[] params = configuration.value();
        User user = User.findByEmail(context.session().get("email"));

        boolean found = false;
        if(params.length == 0) {
            found = true;
        }

        // Loop the given parameters(role names) to check that the user belongs to one of them
        if(user != null){
            for (User.Role role: params) {
                if(user.role == role) {
                    found = true;
                }
            }
        }

        // if the role is not found for the user, it means the user is not authorised
        if(!found) {
            // no access, redirect to home
            context.flash().put("danger", "You are not authorized to use this feature");
            return F.Promise.pure(redirect(routes.ProductController.list()));
        }

        // execute the action
        return delegate.call(context);
    }
}

