package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Product;
import models.ProductInSale;
import models.Sale;
import models.Worker;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by Nicolas on 22/07/2014.
 */
public class Sales extends Controller {

    public static Result create()
    {
        Sale sale = new Sale();
        sale.date =  Calendar.getInstance().getTime();
        JsonNode params = request().body().asJson();
        Worker worker = Json.fromJson(params.get("worker"), Worker.class);
        sale.worker = worker;
        sale.save();
        Iterator<JsonNode> products = params.get("products").iterator();
        while (products.hasNext())
        {
            Product product = Json.fromJson(products.next(), Product.class);
            ProductInSale productInSale = new ProductInSale();
            productInSale.name = product.name;
            productInSale.price = product.price;
            productInSale.sale = sale;
            productInSale.save();
        }

        return ok(Json.toJson(sale));
    }

    public static Result getWithLimit(int limit)
    {
        return ok(Json.toJson(Sale.finder.orderBy("date desc").setMaxRows(limit).findList()));
    }

    public static Result getAll()
    {
        return ok(Json.toJson(Sale.finder.orderBy("date desc").findList()));
    }
}
