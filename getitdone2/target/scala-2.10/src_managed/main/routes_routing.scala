// @SOURCE:/home/roc/workspace/seba2/getitdone2/conf/routes
// @HASH:34c5ce3c2ce2a69a01cddddcf6913cd5ddb7498b
// @DATE:Mon Jun 30 09:46:23 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_CreateTasks_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createtasks"))))
        

// @LINE:10
private[this] lazy val controllers_ViewTask_index2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewtask"))))
        

// @LINE:11
private[this] lazy val controllers_CreateUser_viewUser3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewuser"))))
        

// @LINE:12
private[this] lazy val controllers_CreateUser_viewUser4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:13
private[this] lazy val controllers_ViewTask_userTasks5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usertasks"))))
        

// @LINE:14
private[this] lazy val controllers_ViewFeedback_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("givefeedback"))))
        

// @LINE:15
private[this] lazy val controllers_ViewRequest_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request"))))
        

// @LINE:16
private[this] lazy val controllers_ViewRequest_index8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("request"))))
        

// @LINE:17
private[this] lazy val controllers_ViewRequest_selfRequests9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("personalrequests"))))
        

// @LINE:18
private[this] lazy val controllers_ViewFeedback_showFeedback10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showfeedback"))))
        

// @LINE:19
private[this] lazy val controllers_ViewFeedback_showFeedback11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showfeedback"))))
        

// @LINE:22
private[this] lazy val controllers_SearchTasks_search12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchtasks"))))
        

// @LINE:23
private[this] lazy val controllers_ViewTask_getTask13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewtaskdetail/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_SearchTasks_searchAll14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("all"))))
        

// @LINE:27
private[this] lazy val controllers_SearchTasks_searchHousework15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("housework"))))
        

// @LINE:28
private[this] lazy val controllers_SearchTasks_searchCleaning16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cleaning"))))
        

// @LINE:29
private[this] lazy val controllers_SearchTasks_searchShopping17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shopping"))))
        

// @LINE:30
private[this] lazy val controllers_SearchTasks_searchComputerHelp18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computerhelp"))))
        

// @LINE:31
private[this] lazy val controllers_SearchTasks_searchDesign19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("design"))))
        

// @LINE:32
private[this] lazy val controllers_SearchTasks_searchSomethingElse20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("somethingelse"))))
        

// @LINE:35
private[this] lazy val controllers_Login_newLogin21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:36
private[this] lazy val controllers_Login_login22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:37
private[this] lazy val controllers_Login_logout23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:38
private[this] lazy val controllers_Application_editProfile24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editprofile"))))
        

// @LINE:41
private[this] lazy val controllers_Assets_at25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:44
private[this] lazy val controllers_Application_help26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("help"))))
        

// @LINE:45
private[this] lazy val controllers_Application_faq27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faq"))))
        

// @LINE:46
private[this] lazy val controllers_Application_support28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("support"))))
        

// @LINE:47
private[this] lazy val controllers_Application_contactus29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contactus"))))
        

// @LINE:50
private[this] lazy val controllers_Application_privacypolicy30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("privacypolicy"))))
        

// @LINE:51
private[this] lazy val controllers_Application_aboutus31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:52
private[this] lazy val controllers_Application_imprint32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("imprint"))))
        

// @LINE:53
private[this] lazy val controllers_Application_useofdata33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("useofdata"))))
        

// @LINE:56
private[this] lazy val controllers_ViewMessages_viewmessages34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewmessages"))))
        

// @LINE:57
private[this] lazy val controllers_ViewMessages_savemessages35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewmessages"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createtasks""","""controllers.CreateTasks.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewtask""","""controllers.ViewTask.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewuser""","""controllers.CreateUser.viewUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.CreateUser.viewUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usertasks""","""controllers.ViewTask.userTasks()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """givefeedback""","""controllers.ViewFeedback.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request""","""controllers.ViewRequest.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """request""","""controllers.ViewRequest.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """personalrequests""","""controllers.ViewRequest.selfRequests()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showfeedback""","""controllers.ViewFeedback.showFeedback()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showfeedback""","""controllers.ViewFeedback.showFeedback()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchtasks""","""controllers.SearchTasks.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewtaskdetail/$id<[^/]+>""","""controllers.ViewTask.getTask(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """all""","""controllers.SearchTasks.searchAll()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """housework""","""controllers.SearchTasks.searchHousework()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cleaning""","""controllers.SearchTasks.searchCleaning()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shopping""","""controllers.SearchTasks.searchShopping()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computerhelp""","""controllers.SearchTasks.searchComputerHelp()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """design""","""controllers.SearchTasks.searchDesign()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """somethingelse""","""controllers.SearchTasks.searchSomethingElse()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.newLogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Login.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editprofile""","""controllers.Application.editProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """help""","""controllers.Application.help()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faq""","""controllers.Application.faq()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """support""","""controllers.Application.support()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contactus""","""controllers.Application.contactus()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """privacypolicy""","""controllers.Application.privacypolicy()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.Application.aboutus()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """imprint""","""controllers.Application.imprint()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """useofdata""","""controllers.Application.useofdata()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewmessages""","""controllers.ViewMessages.viewmessages()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewmessages""","""controllers.ViewMessages.savemessages()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_CreateTasks_index1(params) => {
   call { 
        invokeHandler(controllers.CreateTasks.index, HandlerDef(this, "controllers.CreateTasks", "index", Nil,"GET", """ Basic navigation""", Routes.prefix + """createtasks"""))
   }
}
        

// @LINE:10
case controllers_ViewTask_index2(params) => {
   call { 
        invokeHandler(controllers.ViewTask.index, HandlerDef(this, "controllers.ViewTask", "index", Nil,"POST", """""", Routes.prefix + """viewtask"""))
   }
}
        

// @LINE:11
case controllers_CreateUser_viewUser3(params) => {
   call { 
        invokeHandler(controllers.CreateUser.viewUser(), HandlerDef(this, "controllers.CreateUser", "viewUser", Nil,"GET", """""", Routes.prefix + """viewuser"""))
   }
}
        

// @LINE:12
case controllers_CreateUser_viewUser4(params) => {
   call { 
        invokeHandler(controllers.CreateUser.viewUser(), HandlerDef(this, "controllers.CreateUser", "viewUser", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:13
case controllers_ViewTask_userTasks5(params) => {
   call { 
        invokeHandler(controllers.ViewTask.userTasks(), HandlerDef(this, "controllers.ViewTask", "userTasks", Nil,"GET", """""", Routes.prefix + """usertasks"""))
   }
}
        

// @LINE:14
case controllers_ViewFeedback_index6(params) => {
   call { 
        invokeHandler(controllers.ViewFeedback.index(), HandlerDef(this, "controllers.ViewFeedback", "index", Nil,"GET", """""", Routes.prefix + """givefeedback"""))
   }
}
        

// @LINE:15
case controllers_ViewRequest_index7(params) => {
   call { 
        invokeHandler(controllers.ViewRequest.index(), HandlerDef(this, "controllers.ViewRequest", "index", Nil,"GET", """""", Routes.prefix + """request"""))
   }
}
        

// @LINE:16
case controllers_ViewRequest_index8(params) => {
   call { 
        invokeHandler(controllers.ViewRequest.index(), HandlerDef(this, "controllers.ViewRequest", "index", Nil,"POST", """""", Routes.prefix + """request"""))
   }
}
        

// @LINE:17
case controllers_ViewRequest_selfRequests9(params) => {
   call { 
        invokeHandler(controllers.ViewRequest.selfRequests(), HandlerDef(this, "controllers.ViewRequest", "selfRequests", Nil,"GET", """""", Routes.prefix + """personalrequests"""))
   }
}
        

// @LINE:18
case controllers_ViewFeedback_showFeedback10(params) => {
   call { 
        invokeHandler(controllers.ViewFeedback.showFeedback(), HandlerDef(this, "controllers.ViewFeedback", "showFeedback", Nil,"POST", """""", Routes.prefix + """showfeedback"""))
   }
}
        

// @LINE:19
case controllers_ViewFeedback_showFeedback11(params) => {
   call { 
        invokeHandler(controllers.ViewFeedback.showFeedback(), HandlerDef(this, "controllers.ViewFeedback", "showFeedback", Nil,"GET", """""", Routes.prefix + """showfeedback"""))
   }
}
        

// @LINE:22
case controllers_SearchTasks_search12(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.search(), HandlerDef(this, "controllers.SearchTasks", "search", Nil,"POST", """ Search tasks""", Routes.prefix + """searchtasks"""))
   }
}
        

// @LINE:23
case controllers_ViewTask_getTask13(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.ViewTask.getTask(id), HandlerDef(this, "controllers.ViewTask", "getTask", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """viewtaskdetail/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_SearchTasks_searchAll14(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.searchAll(), HandlerDef(this, "controllers.SearchTasks", "searchAll", Nil,"GET", """ Categories""", Routes.prefix + """all"""))
   }
}
        

// @LINE:27
case controllers_SearchTasks_searchHousework15(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.searchHousework(), HandlerDef(this, "controllers.SearchTasks", "searchHousework", Nil,"GET", """""", Routes.prefix + """housework"""))
   }
}
        

// @LINE:28
case controllers_SearchTasks_searchCleaning16(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.searchCleaning(), HandlerDef(this, "controllers.SearchTasks", "searchCleaning", Nil,"GET", """""", Routes.prefix + """cleaning"""))
   }
}
        

// @LINE:29
case controllers_SearchTasks_searchShopping17(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.searchShopping(), HandlerDef(this, "controllers.SearchTasks", "searchShopping", Nil,"GET", """""", Routes.prefix + """shopping"""))
   }
}
        

// @LINE:30
case controllers_SearchTasks_searchComputerHelp18(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.searchComputerHelp(), HandlerDef(this, "controllers.SearchTasks", "searchComputerHelp", Nil,"GET", """""", Routes.prefix + """computerhelp"""))
   }
}
        

// @LINE:31
case controllers_SearchTasks_searchDesign19(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.searchDesign(), HandlerDef(this, "controllers.SearchTasks", "searchDesign", Nil,"GET", """""", Routes.prefix + """design"""))
   }
}
        

// @LINE:32
case controllers_SearchTasks_searchSomethingElse20(params) => {
   call { 
        invokeHandler(controllers.SearchTasks.searchSomethingElse(), HandlerDef(this, "controllers.SearchTasks", "searchSomethingElse", Nil,"GET", """""", Routes.prefix + """somethingelse"""))
   }
}
        

// @LINE:35
case controllers_Login_newLogin21(params) => {
   call { 
        invokeHandler(controllers.Login.newLogin(), HandlerDef(this, "controllers.Login", "newLogin", Nil,"GET", """ Authentication + user management""", Routes.prefix + """login"""))
   }
}
        

// @LINE:36
case controllers_Login_login22(params) => {
   call { 
        invokeHandler(controllers.Login.login(), HandlerDef(this, "controllers.Login", "login", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:37
case controllers_Login_logout23(params) => {
   call { 
        invokeHandler(controllers.Login.logout(), HandlerDef(this, "controllers.Login", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:38
case controllers_Application_editProfile24(params) => {
   call { 
        invokeHandler(controllers.Application.editProfile(), HandlerDef(this, "controllers.Application", "editProfile", Nil,"GET", """""", Routes.prefix + """editprofile"""))
   }
}
        

// @LINE:41
case controllers_Assets_at25(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:44
case controllers_Application_help26(params) => {
   call { 
        invokeHandler(controllers.Application.help(), HandlerDef(this, "controllers.Application", "help", Nil,"GET", """ Global-Help""", Routes.prefix + """help"""))
   }
}
        

// @LINE:45
case controllers_Application_faq27(params) => {
   call { 
        invokeHandler(controllers.Application.faq(), HandlerDef(this, "controllers.Application", "faq", Nil,"GET", """""", Routes.prefix + """faq"""))
   }
}
        

// @LINE:46
case controllers_Application_support28(params) => {
   call { 
        invokeHandler(controllers.Application.support(), HandlerDef(this, "controllers.Application", "support", Nil,"GET", """""", Routes.prefix + """support"""))
   }
}
        

// @LINE:47
case controllers_Application_contactus29(params) => {
   call { 
        invokeHandler(controllers.Application.contactus(), HandlerDef(this, "controllers.Application", "contactus", Nil,"GET", """""", Routes.prefix + """contactus"""))
   }
}
        

// @LINE:50
case controllers_Application_privacypolicy30(params) => {
   call { 
        invokeHandler(controllers.Application.privacypolicy(), HandlerDef(this, "controllers.Application", "privacypolicy", Nil,"GET", """ Global- About Us""", Routes.prefix + """privacypolicy"""))
   }
}
        

// @LINE:51
case controllers_Application_aboutus31(params) => {
   call { 
        invokeHandler(controllers.Application.aboutus(), HandlerDef(this, "controllers.Application", "aboutus", Nil,"GET", """""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:52
case controllers_Application_imprint32(params) => {
   call { 
        invokeHandler(controllers.Application.imprint(), HandlerDef(this, "controllers.Application", "imprint", Nil,"GET", """""", Routes.prefix + """imprint"""))
   }
}
        

// @LINE:53
case controllers_Application_useofdata33(params) => {
   call { 
        invokeHandler(controllers.Application.useofdata(), HandlerDef(this, "controllers.Application", "useofdata", Nil,"GET", """""", Routes.prefix + """useofdata"""))
   }
}
        

// @LINE:56
case controllers_ViewMessages_viewmessages34(params) => {
   call { 
        invokeHandler(controllers.ViewMessages.viewmessages(), HandlerDef(this, "controllers.ViewMessages", "viewmessages", Nil,"GET", """ View Messages""", Routes.prefix + """viewmessages"""))
   }
}
        

// @LINE:57
case controllers_ViewMessages_savemessages35(params) => {
   call { 
        invokeHandler(controllers.ViewMessages.savemessages(), HandlerDef(this, "controllers.ViewMessages", "savemessages", Nil,"POST", """""", Routes.prefix + """viewmessages"""))
   }
}
        
}

}
     