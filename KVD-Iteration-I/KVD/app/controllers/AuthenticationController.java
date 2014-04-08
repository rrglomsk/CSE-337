package controllers;
import models.Product;
import models.User;
import play.*;
import play.mvc.*;
import views.html.*;
import play.data.Form;

public class AuthenticationController extends Controller {
	
	public static Result login() {
		Form<AuthenticationController.Login> form = Form.form(AuthenticationController.Login.class);
		return ok(views.html.authentication.login.render(form));
	}
	
	public static Result authenticate() {
		Form<Login> form = Form.form(Login.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(views.html.authentication.login.render(form));
		} else {
			User user = User.findByEmail(form.get().email);
			session().clear();
			session("email", form.get().email);
			session("fullname", user.firstName + ", " + user.lastName);
			return redirect(routes.ProductController.list());
		}
	}
	
	public static Result logout() {
		session().clear();
		flash("success", "You've been logged out");
		return redirect(routes.AuthenticationController.login());
	}
	
	public static class Login{
		public String email;
		public String password;
		// Validate this data
		public String validate() {
		if (User.authenticate(email, password) == null) {
			return "Invalid email or password";
		}
		return null;
		}
	}
}


