package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import play.mvc.*;
import play.data.Form;
import static play.data.Form.*;

import models.*;

public class ViewTask extends Controller {
	
	private static String[] errors;

		public static boolean validateDate(String date) {
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    try {
		        sdf.parse(date);
		        return true;
		    }
		    catch(Exception ex) {
		        return false;
		    }
		}
		
		public static boolean isNumeric(String str){  
		  try{
		  	double d = Double.parseDouble(str);  
		  } 
		  catch(NumberFormatException e)
		  {  
			return false;
		  }  
		  	return true;  
		  }
		
		
		
	      public static void createTask() throws Exception{
	      	int cat = Integer.parseInt(form().bindFromRequest().get("category"));
	      	//int cat = 1;
	      	
	      	String error = "";
	      	errors = new String[3]; //to know which values whould be inserted and which no
	      	errors[0] = form().bindFromRequest().get("price");
	      	errors[1] = form().bindFromRequest().get("zipcode");
	      	errors[2] = form().bindFromRequest().get("deadline");
	      	if(!isNumeric(form().bindFromRequest().get("price"))){
	      		error = error + "The price is not a number <br>";
	      		errors[0] = "";
	      	}
	      	if(!isNumeric(form().bindFromRequest().get("zipcode"))){
	      		error = error + "The Zipcode is not a number <br>";
	      		errors[1] = "";
	      	}
	      	if(!validateDate(form().bindFromRequest().get("deadline"))) {
	      		error = error + "The Date doesn't follow the rules yyyy-MM-dd <br>";
	      		errors[2] = "";
	      	}
	      	
	      	if(!"no".equals(form().bindFromRequest().get("accept"))) error = error + "Please accept the terms and conditions to proceed <br>";
	      	if(!error.equals("")) throw new Exception(error);


	  		  
	      	Task t = new Task(form().bindFromRequest().get("title"),
	      			false,
	      			form().bindFromRequest().get("description"),
	      			cat,
	      			form().bindFromRequest().get("zipcode"),
	      			form().bindFromRequest().get("price"),
	      			form().bindFromRequest().get("deadline"),
	      			User.findByName("Loremipsum"));
	      	Task.create(t, cat); //not sure about this line
	      	
	      }

	      public static Result index()  {
	      	try{
	  	    	createTask();
	  	    	String cat = Category.findById(Integer.parseInt(form().bindFromRequest().get("category"))).name;
	  	    	
	  	        return ok(views.html.viewtasks.render("You've successfully created the task!", 
	  	        		form().bindFromRequest().get("title"),
	  	        		form().bindFromRequest().get("description"),
	  	    			form().bindFromRequest().get("zipcode"),
	  	    			form().bindFromRequest().get("deadline"),
	  	    			form().bindFromRequest().get("price"),
	  	    			cat,
                        "",
                        0, session("userid")
	  	    			));
	      	}
	      	catch (Exception e){
	      		
				System.out.println("I'm the error2");
				return ok(views.html.createtasks.render("Create a Task", 
					e.toString().substring(21),
					form().bindFromRequest().get("title"),
					form().bindFromRequest().get("description"),
					errors[1],
					errors[2],
					errors[0],
					form().bindFromRequest().get("category"),
                    "",
                    0, session("userid")));
	      	}
	      	
	      }
	      

	      public static Result userTasks(){
	      	String name = form().bindFromRequest().get("name");
	      	String done = form().bindFromRequest().get("done");
	      	return ok(views.html.usertasks.render(name, done, session("userid")));
	      }

        public static Result getTask(int taskid){
             String name = form().bindFromRequest().get("name");
             String done = form().bindFromRequest().get("done");
        return ok(views.html.viewtaskdetail.render("", "", 0, taskid, session("userid")));
    }


	  }
