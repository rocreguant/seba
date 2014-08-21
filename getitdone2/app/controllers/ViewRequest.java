package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import play.mvc.*;
import play.data.Form;
import static play.data.Form.*;

import models.*;

public class ViewRequest extends Controller {

	//http://127.0.0.1:9000/request?requestid=1&status=accepted
	public static Result accepted(String requestid, String status){
		//accept the task, save the info, an cancell all the other tasks
		Request r = Request.findById(requestid);
		if(status.equals("declined")){
			r.accepted = -1;
			r.update();
			return selfRequests();
		}
		else{
			List<Request> lr = Request.findPendingRequestsByTaskId(r.task.task_id);
			for(int i =0; i< lr.size(); ++i){
				lr.get(i).accepted=-1;
				//it seems that it doesn't allow two updates in the same run, this prevents this
				if(r.request_id != lr.get(i).request_id) lr.get(i).update();
			}
			r.accepted = 1;
			r.update();
			
			Task t = r.task;
			t.worker = r.requester;
			t.update();
			
		}
		return ok(views.html.request.render(
				"-1",
				"-2",
				"",0, session("userid")));
	}
	
	//http://127.0.0.1:9000/request?taskid=2&userid=Loremipsum
	public static Result index(){
		String description = form().bindFromRequest().get("description");
		String status = form().bindFromRequest().get("status");
		
		if(status != null){
			return accepted(form().bindFromRequest().get("requestid"),
							status);
		}
		else if(description == null || description.isEmpty()){
			return ok(views.html.request.render(
						form().bindFromRequest().get("taskid"),
						form().bindFromRequest().get("userid"),
						"",0, session("userid")));
		}
		else{
			int taskid = Integer.parseInt(form().bindFromRequest().get("taskid"));
			Task t = Task.findById(taskid);
			User u = User.findByName(form().bindFromRequest().get("userid"));
			if(u == null) u = User.findByName(u.name); //making sure that the user is not null by exploding before saving
			Request r = new Request(description, t, u);
			r.save();
	        return ok(views.html.request.render("-1","","",0, session("userid")));
			
		}
	}
	
	public static Result selfRequests(){
		return ok(views.html.viewrequests.render(
				form().bindFromRequest().get("userid"),
				form().bindFromRequest().get("taskid"),
				"",0, session("userid")));
	}
	
	
}
