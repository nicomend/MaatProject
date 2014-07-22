package models;

import org.springframework.format.annotation.DateTimeFormat;
import play.data.format.Formats;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Sale extends Model {
    @Id
    public long id;

    @JoinColumn(name = "workerID")
    @ManyToOne
    public Worker worker;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    public List<ProductInSale> products;

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date date;

    @Transient
    private int amount;

    public int getAmount()
    {
        int amount = 0;
        for (ProductInSale productInSale : products)
        {
            amount += productInSale.price;
        }

        return amount;
    }

    public static Finder<Long, Sale> finder = new Finder<Long, Sale>(Long.class, Sale.class);
}
