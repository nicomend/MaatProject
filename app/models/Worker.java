package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Worker extends Model {

	@Id
	public String id;
	public String name;
	public Date hireDate;

	public static Finder<String, Worker> finder = new Finder<String, Worker>(String.class,
			Worker.class);
}
