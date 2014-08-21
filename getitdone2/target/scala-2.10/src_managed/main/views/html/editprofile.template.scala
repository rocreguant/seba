
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
object editprofile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(userid: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.97*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>Edit your profile</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*15.40*/routes/*15.46*/.Assets.at("images/logo.png"))),format.raw/*15.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*21.94*/searchstring)),format.raw/*21.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                        """),_display_(Seq[Any](/*24.26*/for(cat <- Category.find.all()) yield /*24.57*/ {_display_(Seq[Any](format.raw/*24.59*/("""
                            """),_display_(Seq[Any](/*25.30*/if(searchcategory.equals(cat.id))/*25.63*/ {_display_(Seq[Any](format.raw/*25.65*/("""
                                <option selected="selected" value=""""),_display_(Seq[Any](/*26.69*/cat/*26.72*/.id)),format.raw/*26.75*/(""""> """),_display_(Seq[Any](/*26.79*/cat/*26.82*/.name)),format.raw/*26.87*/("""</option>
                            """)))}/*27.31*/else/*27.36*/{_display_(Seq[Any](format.raw/*27.37*/("""
                                <option value=""""),_display_(Seq[Any](/*28.49*/cat/*28.52*/.id)),format.raw/*28.55*/(""""> """),_display_(Seq[Any](/*28.59*/cat/*28.62*/.name)),format.raw/*28.67*/("""</option>
                            """)))})),format.raw/*29.30*/("""
                        """)))})),format.raw/*30.26*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*33.26*/if(session == null)/*33.45*/ {_display_(Seq[Any](format.raw/*33.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*35.27*/else/*35.32*/{_display_(Seq[Any](format.raw/*35.33*/("""
                            """),_display_(Seq[Any](/*36.30*/session/*36.37*/ match/*36.43*/{/*37.33*/case "logout" =>/*37.49*/ {_display_(Seq[Any](format.raw/*37.51*/("""<a href="/login"> Login/Register </a>""")))}/*38.33*/case _ =>/*38.42*/ {_display_(Seq[Any](format.raw/*38.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*38.74*/session)),format.raw/*38.81*/(""""> """),_display_(Seq[Any](/*38.85*/session)),format.raw/*38.92*/(""" </a>""")))}})),format.raw/*39.30*/("""
                        """)))})),format.raw/*40.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
        	"""),_display_(Seq[Any](/*47.11*/if(title.equals("-1"))/*47.33*/{_display_(Seq[Any](format.raw/*47.34*/("""
        		<h3><strong>The changes on your profile have been saved!</strong></h3>
        	""")))}/*49.12*/else/*49.17*/{_display_(Seq[Any](format.raw/*49.18*/("""
        		"""),_display_(Seq[Any](/*50.12*/if(title.equals("-2"))/*50.34*/{_display_(Seq[Any](format.raw/*50.35*/("""
        			<h3><strong>The profile couldn't be saved</strong></h3>
        		""")))})),format.raw/*52.12*/("""
	            <div id="viewtask">
	            	<form action="editprofile" method="GET">
					<div class="inputform">

						<input id="old" class="depth" type="hidden" name="old" value=""""),_display_(Seq[Any](/*57.70*/userid)),format.raw/*57.76*/("""">

	                	<label for="userid">Username </label>
	                    <input id="userid" class="depth" type="text" name="userid" value=""""),_display_(Seq[Any](/*60.89*/userid)),format.raw/*60.95*/("""">
	                </div>
	                
	                <div class="inputform">
	                	<label for="pass">New password (can be left empty) </label>
	                    <input id="pass" class="depth" type="password" name="pass" value="">
	                </div>
	                
	                <div class="inputform">
	                	<label for="email">Email </label>
	                    <input id="email" class="depth" type="text" name="email" value=""""),_display_(Seq[Any](/*70.87*/User/*70.91*/.findByName(session).email)),format.raw/*70.117*/("""">
	                </div>
	                
	                <div class="inputform">
	                	<label for="zip">Zipcode</label>
	                    <input id="zip" class="depth" type="text" name="zip" value=""""),_display_(Seq[Any](/*75.83*/User/*75.87*/.findByName(session).zipcode)),format.raw/*75.115*/("""">
	                </div>
	                
	                <div class="inputform">
	                	<label for="password">If you want the changes to be saved please enter your current password</label>
	                    <input id="password" class="depth" type="password" name="password" value="">
	                </div>
	                
	                <div class="submitbox">
		                <p><input type="submit" id="submit" class="btn btn-default" value="Submit changes"/></p>
	                </div>
	          """)))})),format.raw/*86.13*/("""

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
                    <IMG SRC=""""),_display_(Seq[Any](/*116.32*/routes/*116.38*/.Assets.at("images/soft-logo.png"))),format.raw/*116.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>
"""))}
    }
    
    def render(title:String,userid:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(title)(userid)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (userid) => (searchstring) => (searchcategory) => (session) => apply(title)(userid)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 14:33:58 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/editprofile.scala.html
                    HASH: 3cdd6726d1f7ab5a7655a6666a920f1f2ea750c5
                    MATRIX: 591->1|780->96|945->226|959->232|1019->271|1110->327|1124->333|1179->367|1275->428|1289->434|1342->466|1403->491|1418->497|1485->542|1663->684|1678->690|1729->719|2047->1001|2082->1013|2301->1196|2348->1227|2388->1229|2454->1259|2496->1292|2536->1294|2641->1363|2653->1366|2678->1369|2718->1373|2730->1376|2757->1381|2815->1421|2828->1426|2867->1427|2952->1476|2964->1479|2989->1482|3029->1486|3041->1489|3068->1494|3139->1533|3197->1559|3346->1672|3374->1691|3414->1693|3525->1786|3538->1791|3577->1792|3643->1822|3659->1829|3674->1835|3684->1869|3709->1885|3749->1887|3806->1958|3824->1967|3864->1969|3930->1999|3959->2006|3999->2010|4028->2017|4067->2053|4125->2079|4290->2208|4321->2230|4360->2231|4471->2324|4484->2329|4523->2330|4571->2342|4602->2364|4641->2365|4752->2444|4976->2632|5004->2638|5188->2786|5216->2792|5727->3267|5740->3271|5789->3297|6044->3516|6057->3520|6108->3548|6669->4077|8079->5450|8095->5456|8152->5490
                    LINES: 19->1|22->1|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|36->15|36->15|36->15|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|49->28|49->28|49->28|50->29|51->30|54->33|54->33|54->33|56->35|56->35|56->35|57->36|57->36|57->36|57->37|57->37|57->37|57->38|57->38|57->38|57->38|57->38|57->38|57->38|57->39|58->40|65->47|65->47|65->47|67->49|67->49|67->49|68->50|68->50|68->50|70->52|75->57|75->57|78->60|78->60|88->70|88->70|88->70|93->75|93->75|93->75|104->86|134->116|134->116|134->116
                    -- GENERATED --
                */
            