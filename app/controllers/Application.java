package controllers;

import models.Worker;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Nicolas on 20/07/2014.
 */
public class Application extends Controller {
    public static Result start() {
        return ok("app is ready!");
    }

    public static Result preflight(String path) {
        return ok();
    }

    public static Result login()
    {
        String idNumber = request().body().asJson().asText();
        return ok(Json.toJson(Worker.finder.byId(idNumber)));
    }
}
