package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductInSale extends Model {
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "saleID")
    public Sale sale;

    @JoinColumn(name = "productID")
    @ManyToOne
    public Product product;
}
