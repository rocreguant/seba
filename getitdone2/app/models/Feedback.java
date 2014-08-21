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
@Table(name="feedback")
public class Feedback extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int feedback_id;

//<-----------------------------------------------------------------NOT SURE!!!!!!!!! One task has 2 feedbacks, one each person!
    @ManyToOne
    public Task task;

    @Constraints.MaxLength(250)
    @Constraints.Required
    public String commentary;

    @Constraints.MinLength(1)
    @Constraints.MaxLength(1)
    @Constraints.Required
    public int stars; //1 to 5
    
    @ManyToOne
    @Constraints.Required
    public User reciever;
    //<-------------------------------------------------------------get it from the autentication???
    /*@Constraints.Required
    public User reviewer;*/
    

    public static Model.Finder<Integer,Feedback> find = new Model.Finder<Integer,Feedback>(Integer.class, Feedback.class);
    
    
    public Feedback(Task t, String c, int s){
    	task = t;
    	commentary = c;
    	stars = s;
    }

    /**
     * Sets the task for the feedback
     */
    public void setTask(int _id){
    	this.task = Task.findById(_id);
    }

    /**
     * Sets the commentary for the feedback
     */
    public void setCommentary(String commentary){
    	this.commentary = commentary;
    }

    /**
     * Sets the user reciever from the feedback
     */
    public void setReciever(User u){
    	this.reciever = u;
    }
    
    /**
     * Sets the rating for the feedback
     */
    public void setStars(int stars){
    	this.stars = stars;
    }

    public static double getAVG(String userid){
    	List<Feedback> f = Feedback.find.where()
    			.eq("t0.reciever_name", userid).findList();
    	double flo = 0.0;
    	for(int i=0; i< f.size(); ++i){
    		flo += (double) f.get(i).stars;
    	}
    	return flo/(double) f.size();
    	
    }
    
}

