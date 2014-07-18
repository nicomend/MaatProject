package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Worker extends Model {

    @Id
    public long id;

    @Column(unique = true)
    public String idNumber;

    public String name;

    public Date hireDate;

    public static Finder<String, Worker> finder = new Finder<>(String.class,
            Worker.class);
}
