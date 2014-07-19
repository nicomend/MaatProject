package controllers;

import java.util.Calendar;

import models.Worker;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Workers extends Controller {
	public static Result getAll() {
		return ok(Json.toJson(Worker.finder.all()));
	}

	public static Result create() {
		Worker worker = Json.fromJson(request().body().asJson(), Worker.class);
		worker.hireDate = Calendar.getInstance().getTime();
		worker.save();
		return ok(Json.toJson(worker));
	}

    public static Result clear() {
        for (Worker worker : Worker.finder.all()) {
            worker.delete();
        }
        return ok();
    }
}
