package models;

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
    public Date date;
}
