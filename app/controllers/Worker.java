package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Worker extends Controller {
    public static Result index() {
        return ok(views.html.worker.render());
    }
}
