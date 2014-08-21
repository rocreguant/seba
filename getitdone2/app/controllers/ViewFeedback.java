package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import play.mvc.*;
import play.data.Form;
import static play.data.Form.*;

import models.*;

public class ViewFeedback extends Controller {

	//http://127.0.0.1:9000/givefeedback?taskid=2
	public static Result index(){
		String description = form().bindFromRequest().get("description");
		if(!(description == null || description.isEmpty())) return collect(description);
		//For the feedbck insertion
		return ok(views.html.feedbackcollection.render(form().bindFromRequest().get("taskid"),"",0, session("userid"))); 
	}
	
	//once the feedback is inserted
	//http://127.0.0.1:9000/givefeedback?taskid=2&description=oidjfkldf&stars=5
	public static Result collect(String description){
		int taskid = Integer.parseInt(form().bindFromRequest().get("taskid"));
		Task t = Task.findById(taskid);
		int stars = Integer.parseInt(form().bindFromRequest().get("stars"));
		Feedback f = new Feedback(t, description, stars );
		User u = User.findByName(form().bindFromRequest().get("userid"));
		f.setReciever(u);
		f.save();
		
        return ok(views.html.feedbackcollection.render("-1","",0, session("userid")));
    }
	
	
	//parameters userid
	public static Result showFeedback(){
		
        return ok(views.html.showfeedback.render(form().bindFromRequest().get("userid"),"",0, session("userid")));
    }
	
}
