package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

/**
 * User entity managed by Ebean
 */
@Entity 
@Table(name="account")
public class User extends Model {

    private static final long serialVersionUID = 1L;

    @Constraints.Email
    @Constraints.Required(message = "The email is required")
    @Formats.NonEmpty
    public String email;

    @Constraints.MinLength(3)
    @Constraints.MaxLength(15)
    @Id
    @Constraints.Required(message = "The name is required")
    public String name;
    
    @Constraints.Required(message = "The password is required")
    public String password;

    @Constraints.MaxLength(5)
	@Constraints.Required(message = "The zipcode is required")
	public int zipcode;
	
    // -- Queries
	
	public User(String name, String email, String password, int zipcode){
		this.name = name;
		this.email = email;
		this.password = password;
		this.zipcode = zipcode;
	}
	
    
    public static Model.Finder<String,User> find = new Model.Finder<String,User>(String.class, User.class);

    /**
     * Retrieve a User from email.
     */
    public static User findByEmail(String email) {
        return find
        		.where()
        		.eq("t0.email", email)
        		.findUnique();
    }
    
	 /**
     * Retrieve a User from name.
     */
    public static User findByName(String name) {
        return find.where().eq("t0.name", name).findUnique();
    }

    /**
     * Authenticate a User by email.
     */
    public static User authenticateEmail(String email, String password) {
        return find.where()
                .eq("t0.email", email)
                .eq("t0.password", password)
                .findUnique();
    }

    /**
     * Authenticate a User by name.
     */
    public static User authenticateName(String name, String password) {
        return find.where()
                .eq("t0.name", name)
                .eq("t0.password", password)
                .findUnique();
    }
    
    /**
     * Create a user.
     */
    public static User create(User user) {
        
        user.save();
        return user;
    }
    
    // --
    
    public String toString() {
        return "User(" + name + ":" + email + ")";
    }

}

