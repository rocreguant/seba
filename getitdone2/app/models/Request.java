package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Task entity managed by Ebean
 */
@Entity
@Table(name="request")
public class Request extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int request_id;

    @Constraints.MaxLength(250)
    @Constraints.Required
    public String message;
    
    @Constraints.Required
    public int accepted; //-1 denied, 0 undetermined, 1 accepted
    
    @ManyToOne
    public Task task;
    
    @OneToOne
    @Constraints.Required
    public User requester;



    // -- Queries

    public static Model.Finder<Integer,Request> find = new Model.Finder<Integer,Request>(Integer.class, Request.class);

    public Request(String message, Task t, User u){
    	this.message = message;
    	this.task = t;
    	this.requester = u;
    	accepted = 0;
    }

    /**
     * Finds pending Requests for certain Task id using int
     */
    public static List<Request> findPendingRequestsByTaskId(int _id) {
    	if(_id == 0){
    		return find
                    .where()
                    .eq("t0.accepted", "0")
                    .findList();
    	}
        return find
                .where()
                .eq("t0.task_task_id", _id)
                .eq("t0.accepted", "0")
                .findList();
    }
    
    /**
     * Finds pending Requests for certain Task id using string
     */
    public static List<Request> findPendingRequestsByTaskId(String _id) {
    	return findPendingRequestsByTaskId(Integer.parseInt(_id));

    }
    
    /**
     * Finds Request by its id
     */
    public static Request findById(String _id) {
    	return find
    			.where()
    			.eq("t0.request_id", Integer.parseInt(_id))
    			.findUnique();

    }
    

}
