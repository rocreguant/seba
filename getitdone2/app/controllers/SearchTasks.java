package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import static play.data.Form.form;

public class SearchTasks extends Controller {

    public static Result index()  {
        return ok(views.html.searchtasks.render("",0, session("userid")));
    }

    public static Result search()  {
        return ok(views.html.searchtasks.render(form().bindFromRequest().get("searchstring"), Integer.parseInt(form().bindFromRequest().get("searchcategory")), session("userid")));
    }

    public static Result searchAll()  {
        return ok(views.html.searchtasks.render("", 0, session("userid")));
    }

    public static Result searchHousework()  {
        return ok(views.html.searchtasks.render("", 1, session("userid")));
    }

    public static Result searchCleaning()  {
        return ok(views.html.searchtasks.render("", 2, session("userid")));
    }

    public static Result searchShopping()  {
        return ok(views.html.searchtasks.render("", 3, session("userid")));
    }

    public static Result searchComputerHelp()  {
        return ok(views.html.searchtasks.render("", 4, session("userid")));
    }

    public static Result searchDesign()  {
        return ok(views.html.searchtasks.render("", 5, session("userid")));
    }

    public static Result searchSomethingElse()  {
        return ok(views.html.searchtasks.render("", 6, session("userid")));
    }
}
