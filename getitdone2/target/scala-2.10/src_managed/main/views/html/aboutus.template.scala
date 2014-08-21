
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
object aboutus extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

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
            <h3><strong>About Us</strong></h3>
			<form action="aboutus" method="get">
            <div id="getitdone">
				<fieldset>
					<h2 style="text-align:center";>
						GetitDone
					</h2>
					<p style="text-align:left";>
						Get-It-Done is a consumer-to-consumer (C2C) brokerage platform to help people find others to assist them with certain tasks or problems with a rewarding and friendly community. In this paper, we discuss the project idea and the business model of Get-It-Done.
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
						&diams; The Team
					</h3>
					<p style="text-align:left";>
						Our co-founders, Dominik, Roc, Parisa and Andreas came across the idea for Getitdone in 2014 when they were participating in SEBA course.
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
                <IMG SRC=""""),_display_(Seq[Any](/*96.28*/routes/*96.34*/.Assets.at("images/soft-logo.png"))),format.raw/*96.68*/("""" vspace="70px" align="center" HEIGHT=30px>
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
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/aboutus.scala.html
                    HASH: 5b27ebb9d578496ba044ea8645c387862fe6560a
                    MATRIX: 587->1|777->97|864->149|890->154|987->216|1001->222|1061->261|1152->317|1166->323|1221->357|1312->413|1326->419|1383->455|1480->516|1495->522|1549->554|1610->579|1625->585|1692->630|1870->772|1885->778|1936->807|2254->1089|2289->1101|2504->1280|2551->1311|2591->1313|2653->1339|2695->1372|2735->1374|2832->1435|2844->1438|2869->1441|2909->1445|2921->1448|2948->1453|3002->1489|3015->1494|3054->1495|3131->1536|3143->1539|3168->1542|3208->1546|3220->1549|3247->1554|3310->1585|3364->1607|3513->1720|3541->1739|3581->1741|3692->1834|3705->1839|3744->1840|3810->1870|3826->1877|3841->1883|3851->1917|3876->1933|3916->1935|3973->2006|3991->2015|4031->2017|4097->2047|4126->2054|4166->2058|4195->2065|4234->2101|4292->2127|6541->4340|6556->4346|6612->4380
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|114->96|114->96|114->96
                    -- GENERATED --
                */
            