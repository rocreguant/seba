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
@Table(name="task")
public class Task extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int task_id;

    @Constraints.MaxLength(50)
    @Constraints.Required
    public String title;

    public boolean done = false;

    @Constraints.MaxLength(250)
    @Constraints.Required
    public String description;

    @ManyToOne
    public int category;

    @Constraints.MaxLength(5)
    @Constraints.Required
    public String zipcode;

    @Constraints.Required
    public String reward;

    @Formats.DateTime(pattern="yyyy-mm-dd")
    public Date due_date;

    /* Task belonging to UserID */
    @ManyToOne
    public User assigned_to;

    /* Task belonging to UserID */
    @OneToOne
    @Constraints.Required
    public User worker = null;

    // -- Queries

    public static Model.Finder<Integer,Task> find = new Model.Finder<Integer,Task>(Integer.class, Task.class);

    public Task(String title, boolean done, String description, int category, 
    				   String zipcode, String reward, String date, User assigned_to){
    	this.title = title;
    	this.description = description;
    	this.done = done;
    	this.category = category;
    	this.zipcode = zipcode;
    	this.reward = reward;
    	this.due_date = new Date();
    	this.assigned_to = assigned_to;
    	worker = null;
    }
    

    
    /**
     * Retrieve tasks for the user.
     */
    public static List<Task> findTasksInvolvingUser(String user) {
        return find
                .where()
                .eq("t0.assigned_to_name", user)
                .findList();
    }

    /**
     * Find tasks related to a category
     */
    public static List<Task> findByCategory(int category) {
        return find
                .where()
                .eq("t0.category", category)
                .findList();
    }

    /**
     * Find tasks related to a category
     */
    public static List<Task> findByTitle(String title) {
        return find
                .where()
                .contains("t0.title", title)
                .findList();
    }

    /**
     * Find tasks related to a title and a category
     */
    public static List<Task> findByTitleAndCategory(String title, int category) {
        return find
                .where()
                .contains("t0.title", title)
                .eq("t0.category", category)
                .findList();
    }
    
    /**
     * Find tasks by id
     */
    public static Task findById(int _id) {
        return find
                .where()
                .eq("t0.task_id", _id)
                .findUnique();
    }

    /**
     * Create a task
     */
    public static Task create(Task task, int category) {
        task.category = category;
        task.save();
        return task;
    }

    /**
     * Mark a task as done or not
     */
    public static void markAsDone(int task_id, Boolean done) {
        Task task = Task.find.ref(task_id);
        task.done = done;
        task.update();
    }

    /**
     * Update the worker of a task
     */
    public static void updateWorker(int task_id, User user) {
        Task task = Task.find.ref(task_id);
        task.worker = user;
        task.update();
    }

    /**
     * Check if a user is the owner of this task
     */

    public String toString() {
        return "Task(" + task_id + ") assignedUser " + assigned_to;
    }


	/**
	 * Retrieve tasks for the user.
	 */
	public static List<Task> findTasksByUserDone(String user, String d) {
		boolean done = d.equals("yes");
	    return find
	            .where()
	            .eq("t0.assigned_to_name", user)
	            .eq("t0.done", done)
	            .findList();
	}
}
