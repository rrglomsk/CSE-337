package controllers;
import play.mvc.Http.*;
import play.mvc.Security;
import play.mvc.*;
import play.*;
/**
* Created by npatel on 3/17/14.
*/
public class Secured extends Security.Authenticator {
	@Override
	public String getUsername(Context ctx) {
		return ctx.session().get("email");
	}
	@Override
	public Result onUnauthorized(Context ctx) {
		return redirect(routes.AuthenticationController.login());
	}
}
