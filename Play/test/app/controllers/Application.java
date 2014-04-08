package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
	static int pageCount = 0;

	public static Result index(){
		return ok(index.render("NO"));
	}
	
    public static Result greetme(String first_name, String last_name) {
    	pageCount += 1;
        return ok(index.render("Hello " + first_name + " " + last_name + "\n You have visited " + pageCount +" times"));
    }

}
