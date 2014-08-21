// @SOURCE:/home/roc/workspace/seba2/getitdone2/conf/routes
// @HASH:34c5ce3c2ce2a69a01cddddcf6913cd5ddb7498b
// @DATE:Mon Jun 30 09:46:23 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:41
class ReverseAssets {
    

// @LINE:41
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseViewRequest {
    

// @LINE:17
def selfRequests(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "personalrequests")
}
                                                

// @LINE:16
// @LINE:15
def index(): Call = {
   () match {
// @LINE:15
case () if true => Call("GET", _prefix + { _defaultPrefix } + "request")
                                                        
// @LINE:16
case () if true => Call("POST", _prefix + { _defaultPrefix } + "request")
                                                        
   }
}
                                                
    
}
                          

// @LINE:57
// @LINE:56
class ReverseViewMessages {
    

// @LINE:56
def viewmessages(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "viewmessages")
}
                                                

// @LINE:57
def savemessages(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "viewmessages")
}
                                                
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:22
class ReverseSearchTasks {
    

// @LINE:30
def searchComputerHelp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computerhelp")
}
                                                

// @LINE:27
def searchHousework(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "housework")
}
                                                

// @LINE:26
def searchAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "all")
}
                                                

// @LINE:31
def searchDesign(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "design")
}
                                                

// @LINE:28
def searchCleaning(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cleaning")
}
                                                

// @LINE:22
def search(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "searchtasks")
}
                                                

// @LINE:32
def searchSomethingElse(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "somethingelse")
}
                                                

// @LINE:29
def searchShopping(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shopping")
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
class ReverseCreateUser {
    

// @LINE:12
// @LINE:11
def viewUser(): Call = {
   () match {
// @LINE:11
case () if true => Call("GET", _prefix + { _defaultPrefix } + "viewuser")
                                                        
// @LINE:12
case () if true => Call("POST", _prefix + { _defaultPrefix } + "register")
                                                        
   }
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:14
class ReverseViewFeedback {
    

// @LINE:19
// @LINE:18
def showFeedback(): Call = {
   () match {
// @LINE:18
case () if true => Call("POST", _prefix + { _defaultPrefix } + "showfeedback")
                                                        
// @LINE:19
case () if true => Call("GET", _prefix + { _defaultPrefix } + "showfeedback")
                                                        
   }
}
                                                

// @LINE:14
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "givefeedback")
}
                                                
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseLogin {
    

// @LINE:35
def newLogin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:37
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:36
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:38
// @LINE:6
class ReverseApplication {
    

// @LINE:44
def help(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "help")
}
                                                

// @LINE:52
def imprint(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "imprint")
}
                                                

// @LINE:47
def contactus(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contactus")
}
                                                

// @LINE:46
def support(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "support")
}
                                                

// @LINE:45
def faq(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "faq")
}
                                                

// @LINE:38
def editProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editprofile")
}
                                                

// @LINE:50
def privacypolicy(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "privacypolicy")
}
                                                

// @LINE:51
def aboutus(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:53
def useofdata(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "useofdata")
}
                                                
    
}
                          

// @LINE:9
class ReverseCreateTasks {
    

// @LINE:9
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createtasks")
}
                                                
    
}
                          

// @LINE:23
// @LINE:13
// @LINE:10
class ReverseViewTask {
    

// @LINE:13
def userTasks(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usertasks")
}
                                                

// @LINE:10
def index(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "viewtask")
}
                                                

// @LINE:23
def getTask(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "viewtaskdetail/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                
    
}
                          
}
                  


// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:41
class ReverseAssets {
    

// @LINE:41
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseViewRequest {
    

// @LINE:17
def selfRequests : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewRequest.selfRequests",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personalrequests"})
      }
   """
)
                        

// @LINE:16
// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewRequest.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "request"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "request"})
      }
      }
   """
)
                        
    
}
              

// @LINE:57
// @LINE:56
class ReverseViewMessages {
    

// @LINE:56
def viewmessages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewMessages.viewmessages",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewmessages"})
      }
   """
)
                        

// @LINE:57
def savemessages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewMessages.savemessages",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewmessages"})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:22
class ReverseSearchTasks {
    

// @LINE:30
def searchComputerHelp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.searchComputerHelp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computerhelp"})
      }
   """
)
                        

// @LINE:27
def searchHousework : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.searchHousework",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "housework"})
      }
   """
)
                        

// @LINE:26
def searchAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.searchAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all"})
      }
   """
)
                        

// @LINE:31
def searchDesign : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.searchDesign",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "design"})
      }
   """
)
                        

// @LINE:28
def searchCleaning : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.searchCleaning",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cleaning"})
      }
   """
)
                        

// @LINE:22
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchtasks"})
      }
   """
)
                        

// @LINE:32
def searchSomethingElse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.searchSomethingElse",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "somethingelse"})
      }
   """
)
                        

// @LINE:29
def searchShopping : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchTasks.searchShopping",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shopping"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
class ReverseCreateUser {
    

// @LINE:12
// @LINE:11
def viewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CreateUser.viewUser",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewuser"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:14
class ReverseViewFeedback {
    

// @LINE:19
// @LINE:18
def showFeedback : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewFeedback.showFeedback",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "showfeedback"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showfeedback"})
      }
      }
   """
)
                        

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewFeedback.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "givefeedback"})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseLogin {
    

// @LINE:35
def newLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.newLogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:37
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:36
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:38
// @LINE:6
class ReverseApplication {
    

// @LINE:44
def help : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.help",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
      }
   """
)
                        

// @LINE:52
def imprint : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.imprint",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "imprint"})
      }
   """
)
                        

// @LINE:47
def contactus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contactus",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactus"})
      }
   """
)
                        

// @LINE:46
def support : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.support",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "support"})
      }
   """
)
                        

// @LINE:45
def faq : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.faq",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faq"})
      }
   """
)
                        

// @LINE:38
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile"})
      }
   """
)
                        

// @LINE:50
def privacypolicy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.privacypolicy",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacypolicy"})
      }
   """
)
                        

// @LINE:51
def aboutus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aboutus",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:53
def useofdata : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.useofdata",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "useofdata"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseCreateTasks {
    

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CreateTasks.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createtasks"})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:13
// @LINE:10
class ReverseViewTask {
    

// @LINE:13
def userTasks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewTask.userTasks",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usertasks"})
      }
   """
)
                        

// @LINE:10
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewTask.index",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewtask"})
      }
   """
)
                        

// @LINE:23
def getTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ViewTask.getTask",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewtaskdetail/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:41
class ReverseAssets {
    

// @LINE:41
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseViewRequest {
    

// @LINE:17
def selfRequests(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewRequest.selfRequests(), HandlerDef(this, "controllers.ViewRequest", "selfRequests", Seq(), "GET", """""", _prefix + """personalrequests""")
)
                      

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewRequest.index(), HandlerDef(this, "controllers.ViewRequest", "index", Seq(), "GET", """""", _prefix + """request""")
)
                      
    
}
                          

// @LINE:57
// @LINE:56
class ReverseViewMessages {
    

// @LINE:56
def viewmessages(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewMessages.viewmessages(), HandlerDef(this, "controllers.ViewMessages", "viewmessages", Seq(), "GET", """ View Messages""", _prefix + """viewmessages""")
)
                      

// @LINE:57
def savemessages(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewMessages.savemessages(), HandlerDef(this, "controllers.ViewMessages", "savemessages", Seq(), "POST", """""", _prefix + """viewmessages""")
)
                      
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:22
class ReverseSearchTasks {
    

// @LINE:30
def searchComputerHelp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.searchComputerHelp(), HandlerDef(this, "controllers.SearchTasks", "searchComputerHelp", Seq(), "GET", """""", _prefix + """computerhelp""")
)
                      

// @LINE:27
def searchHousework(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.searchHousework(), HandlerDef(this, "controllers.SearchTasks", "searchHousework", Seq(), "GET", """""", _prefix + """housework""")
)
                      

// @LINE:26
def searchAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.searchAll(), HandlerDef(this, "controllers.SearchTasks", "searchAll", Seq(), "GET", """ Categories""", _prefix + """all""")
)
                      

// @LINE:31
def searchDesign(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.searchDesign(), HandlerDef(this, "controllers.SearchTasks", "searchDesign", Seq(), "GET", """""", _prefix + """design""")
)
                      

// @LINE:28
def searchCleaning(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.searchCleaning(), HandlerDef(this, "controllers.SearchTasks", "searchCleaning", Seq(), "GET", """""", _prefix + """cleaning""")
)
                      

// @LINE:22
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.search(), HandlerDef(this, "controllers.SearchTasks", "search", Seq(), "POST", """ Search tasks""", _prefix + """searchtasks""")
)
                      

// @LINE:32
def searchSomethingElse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.searchSomethingElse(), HandlerDef(this, "controllers.SearchTasks", "searchSomethingElse", Seq(), "GET", """""", _prefix + """somethingelse""")
)
                      

// @LINE:29
def searchShopping(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchTasks.searchShopping(), HandlerDef(this, "controllers.SearchTasks", "searchShopping", Seq(), "GET", """""", _prefix + """shopping""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
class ReverseCreateUser {
    

// @LINE:11
def viewUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CreateUser.viewUser(), HandlerDef(this, "controllers.CreateUser", "viewUser", Seq(), "GET", """""", _prefix + """viewuser""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:14
class ReverseViewFeedback {
    

// @LINE:18
def showFeedback(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewFeedback.showFeedback(), HandlerDef(this, "controllers.ViewFeedback", "showFeedback", Seq(), "POST", """""", _prefix + """showfeedback""")
)
                      

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewFeedback.index(), HandlerDef(this, "controllers.ViewFeedback", "index", Seq(), "GET", """""", _prefix + """givefeedback""")
)
                      
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseLogin {
    

// @LINE:35
def newLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.newLogin(), HandlerDef(this, "controllers.Login", "newLogin", Seq(), "GET", """ Authentication + user management""", _prefix + """login""")
)
                      

// @LINE:37
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.logout(), HandlerDef(this, "controllers.Login", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:36
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.login(), HandlerDef(this, "controllers.Login", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:38
// @LINE:6
class ReverseApplication {
    

// @LINE:44
def help(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.help(), HandlerDef(this, "controllers.Application", "help", Seq(), "GET", """ Global-Help""", _prefix + """help""")
)
                      

// @LINE:52
def imprint(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.imprint(), HandlerDef(this, "controllers.Application", "imprint", Seq(), "GET", """""", _prefix + """imprint""")
)
                      

// @LINE:47
def contactus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contactus(), HandlerDef(this, "controllers.Application", "contactus", Seq(), "GET", """""", _prefix + """contactus""")
)
                      

// @LINE:46
def support(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.support(), HandlerDef(this, "controllers.Application", "support", Seq(), "GET", """""", _prefix + """support""")
)
                      

// @LINE:45
def faq(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.faq(), HandlerDef(this, "controllers.Application", "faq", Seq(), "GET", """""", _prefix + """faq""")
)
                      

// @LINE:38
def editProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editProfile(), HandlerDef(this, "controllers.Application", "editProfile", Seq(), "GET", """""", _prefix + """editprofile""")
)
                      

// @LINE:50
def privacypolicy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.privacypolicy(), HandlerDef(this, "controllers.Application", "privacypolicy", Seq(), "GET", """ Global- About Us""", _prefix + """privacypolicy""")
)
                      

// @LINE:51
def aboutus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aboutus(), HandlerDef(this, "controllers.Application", "aboutus", Seq(), "GET", """""", _prefix + """aboutus""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:53
def useofdata(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.useofdata(), HandlerDef(this, "controllers.Application", "useofdata", Seq(), "GET", """""", _prefix + """useofdata""")
)
                      
    
}
                          

// @LINE:9
class ReverseCreateTasks {
    

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CreateTasks.index(), HandlerDef(this, "controllers.CreateTasks", "index", Seq(), "GET", """ Basic navigation""", _prefix + """createtasks""")
)
                      
    
}
                          

// @LINE:23
// @LINE:13
// @LINE:10
class ReverseViewTask {
    

// @LINE:13
def userTasks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewTask.userTasks(), HandlerDef(this, "controllers.ViewTask", "userTasks", Seq(), "GET", """""", _prefix + """usertasks""")
)
                      

// @LINE:10
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewTask.index(), HandlerDef(this, "controllers.ViewTask", "index", Seq(), "POST", """""", _prefix + """viewtask""")
)
                      

// @LINE:23
def getTask(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ViewTask.getTask(id), HandlerDef(this, "controllers.ViewTask", "getTask", Seq(classOf[Integer]), "GET", """""", _prefix + """viewtaskdetail/$id<[^/]+>""")
)
                      
    
}
                          
}
        
    