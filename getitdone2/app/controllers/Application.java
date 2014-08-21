package controllers;

import play.mvc.*;
import play.data.Form;
import static play.data.Form.*;

import models.*;

public class Application extends Controller {

   	
    public static Result index()  {
        return ok(views.html.main.render("Welcome to GetItDone", "Create a Task","", 0, session("userid")));
    }
    
    public static Result help()  {
        return ok(views.html.help.render("Welcome to GetItDone", "Help","",0, session("userid")));
    }

    public static Result faq()  {
        return ok(views.html.faq.render("Welcome to GetItDone", "Faq","",0, session("userid")));
    }
    
    public static Result support()  {
        return ok(views.html.support.render("Welcome to GetItDone", "Support","",0, session("userid")));
    }
    
    public static Result contactus()  {
        return ok(views.html.contactUs.render("Welcome to GetItDone", "Contactus","",0, session("userid")));
    }
    
    public static Result privacypolicy()  {
        return ok(views.html.privacypolicy.render("Welcome to GetItDone", "Privacy Policy","",0, session("userid")));
    }
    
    public static Result aboutus()  {
        return ok(views.html.aboutus.render("Welcome to GetItDone", "About Us","",0, session("userid")));
    }
    
    public static Result imprint()  {
        return ok(views.html.imprint.render("Welcome to GetItDone", "Imprint","",0, session("userid")));
    }
    
    public static Result useofdata()  {
        return ok(views.html.useofdata.render("Welcome to GetItDone", "Use of Data","",0, session("userid")));
    }
    
    
    public static Result editProfile()  {
    	if(form().bindFromRequest().get("password") == null){
    		return ok(views.html.editprofile.render("Edit your profile", 
        			form().bindFromRequest().get("userid"),"",0, session("userid")));	
    	}
    	User u = User.findByName(form().bindFromRequest().get("old"));
    	System.out.println("fioauhdsihfdshfuhu "+u.password+"++++"+form().bindFromRequest().get("password"));
    	if(u.password.equals(form().bindFromRequest().get("password"))){
    		u.name = form().bindFromRequest().get("userid");
    		u.email = form().bindFromRequest().get("email");
    		u.zipcode = Integer.parseInt(form().bindFromRequest().get("zip"));
    		if(!form().bindFromRequest().get("pass").equals("")){
    			u.password = form().bindFromRequest().get("pass");
    		}
    		u.update();
    		return ok(views.html.editprofile.render("-1","","",0, session("userid")));
    	}
    	return ok(views.html.editprofile.render("-2",form().bindFromRequest().get("old"),"",0, session("userid")));
    }
    
}
