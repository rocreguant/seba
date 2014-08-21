
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object viewrequests extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(taskid: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.100*/("""
<!DOCTYPE html>

<html>
    <head>
    	<title>View pending requests of """),_display_(Seq[Any](/*6.39*/username)),format.raw/*6.47*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/search.css"))),format.raw/*9.96*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*16.40*/routes/*16.46*/.Assets.at("images/logo.png"))),format.raw/*16.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="searchtasks" method="GET">
                    Search tasks <input type="text" id="textbar" name="searchstring" value="">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                        """),_display_(Seq[Any](/*25.26*/for(cat <- Category.find.all()) yield /*25.57*/ {_display_(Seq[Any](format.raw/*25.59*/("""
                                <option value=""""),_display_(Seq[Any](/*26.49*/cat/*26.52*/.id)),format.raw/*26.55*/(""""> """),_display_(Seq[Any](/*26.59*/cat/*26.62*/.name)),format.raw/*26.67*/("""</option>
						""")))})),format.raw/*27.8*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*30.26*/if(session == null)/*30.45*/ {_display_(Seq[Any](format.raw/*30.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*32.27*/else/*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
                            """),_display_(Seq[Any](/*33.30*/session/*33.37*/ match/*33.43*/{/*34.33*/case "logout" =>/*34.49*/ {_display_(Seq[Any](format.raw/*34.51*/("""<a href="/login"> Login/Register </a>""")))}/*35.33*/case _ =>/*35.42*/ {_display_(Seq[Any](format.raw/*35.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*35.74*/session)),format.raw/*35.81*/(""""> """),_display_(Seq[Any](/*35.85*/session)),format.raw/*35.92*/(""" </a>""")))}})),format.raw/*36.30*/("""
                        """)))})),format.raw/*37.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">

                    """),_display_(Seq[Any](/*45.22*/for(item <- models.Request.findPendingRequestsByTaskId(taskid)) yield /*45.85*/ {_display_(Seq[Any](format.raw/*45.87*/("""
                        <div class="task">
                            <div class="right3">
                            	<h3> """),_display_(Seq[Any](/*48.36*/item/*48.40*/.requester.name)),format.raw/*48.55*/("""</h3>
                            	<h4>Description: """),_display_(Seq[Any](/*49.48*/item/*49.52*/.message)),format.raw/*49.60*/("""</h4>
                            	<h5>
                            		<a href="request?requestid="""),_display_(Seq[Any](/*51.59*/item/*51.63*/.request_id)),format.raw/*51.74*/("""&status=accepted">Accept</a> 
									<a href="request?requestid="""),_display_(Seq[Any](/*52.38*/item/*52.42*/.request_id)),format.raw/*52.53*/("""&taskid="""),_display_(Seq[Any](/*52.62*/taskid)),format.raw/*52.68*/("""&userid="""),_display_(Seq[Any](/*52.77*/username)),format.raw/*52.85*/("""&status=declined">Declined</a>
								</h5>
                            </div>
                            <div class="clearBoth"></div>
                        </div>
                    """)))})),format.raw/*57.22*/("""
                    
        </section>
        <footer>
            <div id="line"></div>
            <div id="wrap">
                <div class="left">
                    <h1><a href="all">Search Tasks</a></h1>
                    <p><a href="housework">Housework</a></p>
                    <p><a href="cleaning">Cleaning</a></p>
                    <p><a href="shopping">Shopping</a></p>
                    <p><a href="computerhelp">Computer Help</a></p>
                    <p><a href="design">Design</a></p>
                    <p><a href="somethingelse">Something Else</a></p>
                </div>
                <div class="center">
                    <h1><a href="createtasks">Create Task</a></h1>
                </div>
                <div class="center">
                    <h1><a href="help">Help</a></h1>
                    <p><a href="faq">FAQ</a></p>
                    <p><a href="support">Support</a></p>
                    <p><a href="contactus">Contact Us</a></p>
                </div>
                <div class="right">
                    <h1><a href="aboutus">About Us</a></h1>
                    <p><a href="aboutus">About Us</a></p>
                    <p><a href="useofdata">Use of Data</a></p>
                    <p><a href="privacypolicy">Privacy Policy</a></p>
                    <p><a href="imprint">Imprint</a></p>
                    <IMG SRC=""""),_display_(Seq[Any](/*87.32*/routes/*87.38*/.Assets.at("images/soft-logo.png"))),format.raw/*87.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(username:String,taskid:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(username)(taskid)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (username) => (taskid) => (searchstring) => (searchcategory) => (session) => apply(username)(taskid)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:25 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/viewrequests.scala.html
                    HASH: 62514be3d037efc85fbdf39b1606e70d8090d689
                    MATRIX: 592->1|785->99|894->173|923->181|1020->243|1034->249|1094->288|1185->344|1199->350|1254->384|1345->440|1359->446|1416->482|1513->543|1528->549|1582->581|1643->606|1658->612|1725->657|1903->799|1918->805|1969->834|2468->1297|2515->1328|2555->1330|2640->1379|2652->1382|2677->1385|2717->1389|2729->1392|2756->1397|2804->1414|2953->1527|2981->1546|3021->1548|3132->1641|3145->1646|3184->1647|3250->1677|3266->1684|3281->1690|3291->1724|3316->1740|3356->1742|3413->1813|3431->1822|3471->1824|3537->1854|3566->1861|3606->1865|3635->1872|3674->1908|3732->1934|3909->2075|3988->2138|4028->2140|4192->2268|4205->2272|4242->2287|4331->2340|4344->2344|4374->2352|4508->2450|4521->2454|4554->2465|4657->2532|4670->2536|4703->2547|4748->2556|4776->2562|4821->2571|4851->2579|5073->2769|6502->4162|6517->4168|6573->4202
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|46->25|46->25|46->25|47->26|47->26|47->26|47->26|47->26|47->26|48->27|51->30|51->30|51->30|53->32|53->32|53->32|54->33|54->33|54->33|54->34|54->34|54->34|54->35|54->35|54->35|54->35|54->35|54->35|54->35|54->36|55->37|63->45|63->45|63->45|66->48|66->48|66->48|67->49|67->49|67->49|69->51|69->51|69->51|70->52|70->52|70->52|70->52|70->52|70->52|70->52|75->57|105->87|105->87|105->87
                    -- GENERATED --
                */
            