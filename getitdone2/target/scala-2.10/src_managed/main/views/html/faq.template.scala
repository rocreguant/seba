
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
object faq extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.98*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*6.17*/title)),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/create.css"))),format.raw/*9.96*/("""">
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
                <form name="input" action="searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*22.94*/searchstring)),format.raw/*22.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                    """),_display_(Seq[Any](/*25.22*/for(cat <- Category.find.all()) yield /*25.53*/ {_display_(Seq[Any](format.raw/*25.55*/("""
                        """),_display_(Seq[Any](/*26.26*/if(searchcategory.equals(cat.id))/*26.59*/ {_display_(Seq[Any](format.raw/*26.61*/("""
                        <option selected="selected" value=""""),_display_(Seq[Any](/*27.61*/cat/*27.64*/.id)),format.raw/*27.67*/(""""> """),_display_(Seq[Any](/*27.71*/cat/*27.74*/.name)),format.raw/*27.79*/("""</option>
                        """)))}/*28.27*/else/*28.32*/{_display_(Seq[Any](format.raw/*28.33*/("""
                        <option value=""""),_display_(Seq[Any](/*29.41*/cat/*29.44*/.id)),format.raw/*29.47*/(""""> """),_display_(Seq[Any](/*29.51*/cat/*29.54*/.name)),format.raw/*29.59*/("""</option>
                    """)))})),format.raw/*30.22*/("""
                    """)))})),format.raw/*31.22*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*34.26*/if(session == null)/*34.45*/ {_display_(Seq[Any](format.raw/*34.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*36.27*/else/*36.32*/{_display_(Seq[Any](format.raw/*36.33*/("""
                            """),_display_(Seq[Any](/*37.30*/session/*37.37*/ match/*37.43*/{/*38.33*/case "logout" =>/*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""<a href="/login"> Login/Register </a>""")))}/*39.33*/case _ =>/*39.42*/ {_display_(Seq[Any](format.raw/*39.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*39.74*/session)),format.raw/*39.81*/(""""> """),_display_(Seq[Any](/*39.85*/session)),format.raw/*39.92*/(""" </a>""")))}})),format.raw/*40.30*/("""
                        """)))})),format.raw/*41.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
            <h3><strong>New User FAQ</strong></h3>
			<form action="faq" method="get">
            <div id="getitdone">
				<fieldset>
					<h3 style="text-align:left";>
						&diams; How do I get my tasks completed?
					</h3>
					<p style="text-align:left";>
						It's simple. Start by Posting a Task - takes just a few minutes. Check out the bidders profile and once you've found the person that's perfect for your job, you can assign them to the task. Once the job is completed to your satisfaction, mark the task as complete and you'll be pay the agreed amount. Easy!
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
						&diams; How do I choose the best person to complete my task?
					</h3>
					<p style="text-align:left";>
						On average, you'll receive offers from 2-3 people who can complete your task. You can ask them questions, request further info and check out their profile feedback to make sure that you find the right person for the job. 
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
					    &diams;	How do I receive payment for completing a task?
					</h3>
					<p style="text-align:left";>
						Depending on the payment method selected by the Task Poster, you will receive payment via PayPal or in person with Cash On Delivery (COD).
					</p>
					
				</fieldset>
			</form>
            </div>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*104.32*/routes/*104.38*/.Assets.at("images/soft-logo.png"))),format.raw/*104.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(title:String,content:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(title)(content)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => (searchstring) => (searchcategory) => (session) => apply(title)(content)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:25 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/faq.scala.html
                    HASH: e026a4b005a5716e0eb93ea4ab08c6a6db2874b6
                    MATRIX: 583->1|773->97|860->149|886->154|983->216|997->222|1057->261|1148->317|1162->323|1217->357|1308->413|1322->419|1379->455|1476->516|1491->522|1545->554|1606->579|1621->585|1688->630|1866->772|1881->778|1932->807|2250->1089|2285->1101|2500->1280|2547->1311|2587->1313|2649->1339|2691->1372|2731->1374|2828->1435|2840->1438|2865->1441|2905->1445|2917->1448|2944->1453|2998->1489|3011->1494|3050->1495|3127->1536|3139->1539|3164->1542|3204->1546|3216->1549|3243->1554|3306->1585|3360->1607|3509->1720|3537->1739|3577->1741|3688->1834|3701->1839|3740->1840|3806->1870|3822->1877|3837->1883|3847->1917|3872->1933|3912->1935|3969->2006|3987->2015|4027->2017|4093->2047|4122->2054|4162->2058|4191->2065|4230->2101|4288->2127|7177->4979|7193->4985|7250->5019
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|122->104|122->104|122->104
                    -- GENERATED --
                */
            