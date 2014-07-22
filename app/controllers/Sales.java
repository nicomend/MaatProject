package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Product;
import models.ProductInSale;
import models.Sale;
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
        sale.save();
        Iterator<JsonNode> iterator = request().body().asJson().iterator();
        while (iterator.hasNext())
        {
            Product product = Json.fromJson(iterator.next(), Product.class);
            ProductInSale productInSale = new ProductInSale();
            productInSale.product = product;
            productInSale.sale = sale;
            productInSale.save();
        }

        return ok(Json.toJson(sale));
    }

    public static Result getAll()
    {
        return ok(Json.toJson(Sale.finder.orderBy("date desc").setMaxRows(5).findList()));
    }
}
