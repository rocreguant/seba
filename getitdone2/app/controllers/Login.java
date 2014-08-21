package controllers;

import play.mvc.*;
import play.data.Form;
import static play.data.Form.*;

import models.*;

public class Login extends Controller {

    public static Result login() {
        String userid = form().bindFromRequest().get("userid");
        String password = form().bindFromRequest().get("password");
        String validation = "";
        String s = null;
        System.out.println("XXX "+session().get(ALLOW));
        if(User.findByName(userid) != null && User.findByName(userid).password.equals(password)){

        	session().put(ALLOW, ACCEPT);
        	s = session().get(ALLOW);
        	session("userid",userid);
        }
        else {
        	validation = "Invalid input";
        	session().put(ALLOW, COOKIE);
        	session("userid","logout");
        }
        
        return ok(views.html.login.render("Login/Register to GetItDone", validation,"", "", 0, session("userid")));
    }

    public static Result logout() {
        session().put(ALLOW, COOKIE);
        session("userid","logout");
        return ok(views.html.login.render("Login/Register to GetItDone", "Successfully logged out","", "", 0,  session("userid")));
    }

    public static Result newLogin() {
    	return ok(views.html.login.render("Login/Register to GetItDone", "Please login","", "", 0,  session("userid")));
    }

    
}
