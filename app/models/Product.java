package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import play.db.ebean.Model;

@Entity
public class Product extends Model {
	@Id
	public long id;

	public String name;

	@ManyToOne
	@JoinColumn(name = "categoryID")
	@NotNull
	public Category category;

	public int price;

	public static Finder<Long, Product> finder = new Finder<>(Long.class,
			Product.class);
}
