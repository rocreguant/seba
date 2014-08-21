package controllers;

import static play.data.Form.form;
import models.Task;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;

public class CreateUser extends Controller {

	
   
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
	
	public static boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
 }
    
    
    public static void createUser() {
    	
    	
    	int zipcode = Integer.parseInt(form().bindFromRequest().get("zipcode"));
      
      	
     

  		  
      	User u = new User(form().bindFromRequest().get("username"),
      			form().bindFromRequest().get("email"),
      			form().bindFromRequest().get("password"),
      			zipcode);
      			
      	User.create(u);
      	
      }
   
    
    public static Result viewUser()   {
      	try {
    	String userid = form().bindFromRequest().get("username");
    	String email = form().bindFromRequest().get("email");
    	String password = form().bindFromRequest().get("password");
    	String confirm = form().bindFromRequest().get("password_2");
    	int zipcode = Integer.parseInt(form().bindFromRequest().get("zipcode"));
    	String validation = "";
    	String checkbox = form().bindFromRequest().get("accept");
    	
    	
    	if (userid.equals("") || email.equals("") || password.equals("") || confirm.equals("")) {
    		
    		validation = "Please fill out all fields";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
    	}
    	else if (User.findByName(userid) != null) {
    		
    		validation = "Username already taken";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
    	}
    	else if (!isValidEmailAddress(email)) {
    		
    		validation = "Please enter a valid email address";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
    	}
    	else if (User.findByName(email) != null) {
    		
    		validation = "This Email address is already used";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
    	}
    	
    	else if (!password.equals(confirm)) {
    		
    		validation = "Passwords have to match";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
    	}
    	else if (checkbox == null || !checkbox.equals("yes")) {
    		
    		validation = "Please accept the terms and conditions";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
    	}
    	else 
    	
  	    	createUser();
  	    	
  	    	
  	        return ok(views.html.viewuser.render("User created", "", "", 0, 
  	        		form().bindFromRequest().get("email"),
  	        		form().bindFromRequest().get("username"),
  	    			form().bindFromRequest().get("password"),
  	    			form().bindFromRequest().get("confirmpassword"),
  	    			zipcode
  	    			));
      	
      	}
      	catch (NumberFormatException e)
      	{
      		String validation = "Please enter a valid Zipcode";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
      	
      	}
      	catch (Exception e)
      	{
      		String validation = "Unknown error";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        	return ok(views.html.login.render("Login/Register to GetItDone", "",validation, "", 0, session("userid")));
      	
      	}
      	
      }

}        