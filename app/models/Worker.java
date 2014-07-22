package models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import play.db.ebean.Model;

@Entity
public class Worker extends Model {

    @Id
    public String id;

    public String name;

    public Date hireDate;

    @OneToMany(mappedBy = "worker")
    @JsonIgnore
    public List<Sale> sales;

    @Transient
    private int salesCount;

    @Transient
    private int salesAmount;

    public int getSalesCount() {
        return sales.size();
    }

    public int getSalesAmount() {
        int amount = 0;
        for (Sale sale : sales) {
            amount += sale.getAmount();
        }
        return amount;
    }

    public static Finder<String, Worker> finder = new Finder<String, Worker>(String.class,
            Worker.class);
}
