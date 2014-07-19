package controllers;

import models.Product;
import models.ProductInSale;
import models.Sale;
import models.Worker;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class Store extends Controller {
    public static Result index() {
        return ok(views.html.store.render());
    }

    public static Result checkoutCart(String workerID)
    {
        Worker worker = Worker.finder.byId(workerID);
        Sale sale = new Sale();
        sale.worker = worker;
        sale.save();
        List<Product> list = Json.fromJson(request().body().asJson(), List.class);
        for (Product product : list){
            ProductInSale productInSale = new ProductInSale();
            productInSale.product = product;
            productInSale.sale = sale;
            productInSale.save();
        }
        return ok(Json.toJson(sale));
    }
}
