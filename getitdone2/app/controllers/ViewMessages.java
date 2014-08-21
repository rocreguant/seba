package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import play.mvc.*;
import play.data.Form;
import static play.data.Form.*;

import models.*;

public class ViewMessages extends Controller {

    public static Result viewmessages()  {
        return ok(views.html.viewmessages.render(form().bindFromRequest().get("useridr"), 
        		form().bindFromRequest().get("userids"),"",0, session("userid")));
    }
    
    public static Result savemessages(){
    	String title = form().bindFromRequest().get("title");
    	String message = form().bindFromRequest().get("message");
    	if(message.equals("")){
    		return viewmessages();
    	}
    	User userids = User.findByName(form().bindFromRequest().get("userids"));
    	User useridr = User.findByName(form().bindFromRequest().get("useridr"));
    	Message m = new Message(title, message, userids, useridr);
    	m.save();
    	//m.update();
    	return viewmessages();
    }
}
