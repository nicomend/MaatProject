package controllers;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

public class Admin extends Controller {
	public static Result index() {
		Logger.debug("Welcome to Admin Section");
		return ok(views.html.admin.render());
	}

	public static Result doSomething() {
		return ok();
	}
}
