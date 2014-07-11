package controllers;

import java.util.List;

import models.Category;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;

public class Categories extends Controller {
	public static Result add() {
		String catName = request().body().asJson().get("name").asText();
		Category cat = new Category();
		cat.name = catName;
		cat.save();
		Logger.debug("Category " + catName + " created");
		JsonNode json = Json.toJson(cat);
		return ok(json);
	}

	public static Result delete(long catID) {
		Category byId = Category.find.byId(catID);
		byId.delete();
		Logger.debug("Category " + byId.name + " deleted");
		return ok();
	}

	public static Result clear() {
		List<Category> all = Category.find.all();
		for (Category category : all) {
			category.delete();
		}
		Logger.debug("Categories clear");
		return ok();
	}

	public static Result update(long catID) {
		String catName = request().body().asJson().get("name").asText();
		Category byId = Category.find.byId(catID);
		byId.name = catName;
		byId.save();
		Logger.debug("Category " + byId.name + " changed");
		return ok();
	}

	public static Result getAll() {
		return ok(Json.toJson(Category.find.all()));
	}
}
