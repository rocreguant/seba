package controllers;

import static play.data.Form.form;
import models.Task;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;

public class CreateTasks extends Controller {

	
    public static Result index()  {
        return ok(views.html.createtasks.render("Create a Task", "","","","","","","","", 0, session("userid")));
    }

}