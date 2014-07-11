package controllers;

import java.util.List;

import models.Category;
import models.Product;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;

public class Products extends Controller {
	public static Result getAll() {
		return ok(Json.toJson(Product.finder.all()));
	}

	public static Result create() {
		JsonNode asJson = request().body().asJson();
		Category category = Json.fromJson(asJson.get("category"),
				Category.class);
		Product product = Json.fromJson(asJson, Product.class);
		product.category = category;
		product.save();
		Logger.debug("Item " + product.name + " added successfully");
		return ok(Json.toJson(product));
	}

	public static Result delete(long id) {
		Product.finder.byId(id).delete();
		Logger.debug("Product " + id + " deleted");
		return ok();
	}

	public static Result update() {
		try {
			Json.fromJson(request().body().asJson(), Product.class).update();
		} catch (Exception e) {
			Logger.debug("exception..");
		}
		Logger.debug("cool updated");
		return ok();
	}

	public static Result clear() {
		List<Product> products = Product.finder.all();
		for (Product product : products) {
			product.delete();
		}
		Logger.debug("Products clear");
		return ok();
	}
}
