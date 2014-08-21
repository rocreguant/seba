package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Category entity managed by Ebean
 */
@Entity
@Table(name="category")
public class Category extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public String description;

    // -- Queries
    
    
    public Category(){}
    
    public boolean set(Category c, String name, String desc){
    	this.name = name;
    	this.description = desc;
    	c.save();
    	return true;
    }
    

    public static Model.Finder<String, Category> find = new Model.Finder<String, Category>(String.class, Category.class);

    /**
     * Retrieve a Category from id
     */
    public static Category findById(int id) {
        return find.where().eq("t0.id", id).findUnique();
    }
    
	 /**
     * Retrieve a Category from name.
     */
    public static Category findByName(String name) {
        return find
        		.where()
        		.eq("t0.name", name)
        		.findUnique();
    }

    public String toString() {
        return "Category(" + name + ":" + description + ")";
    }

}

