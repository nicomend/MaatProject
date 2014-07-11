package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import play.db.ebean.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category extends Model {

	@Id
	public long id;

	public String name;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Product> items;

	public static Finder<Long, Category> find = new Finder<>(Long.class,
			Category.class);

	@Transient
	private int itemsCount;

	public int getItemsCount() {
		return items.size();
	}
}
