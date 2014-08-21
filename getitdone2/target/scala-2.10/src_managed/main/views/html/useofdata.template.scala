
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
object useofdata extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

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
            <h3><strong>Use Of Data</strong></h3>
			<form action=" useofdata" method="get">
            <div id="getitdone">
				<fieldset>
					<h3 style="text-align:left";>
						&diams; MEMBER OBLIGATIONS
					</h3>
					<p style="text-align:left";>
						<h4 style="text-align:left";> 1.You agree that at all times: </h4> 
						a. You will comply with this Agreement (including all Getitdone Policies) and all applicable laws and regulations;  <br>
						<br>
						b. You will post only accurate information on the Getitdone Site;  <br>
						<br>
						c. You will promptly and efficiently perform all your obligations to other Getitdone Members and to Getitdone ; <br>
						<br>
						d. all content posted on the Getitdone Site belongs to Getitdone and may not be used on third party sites or for other business purposes without Getitdone prior permission; and <br>
						<br>
						e. You will ensure that You are aware of any laws that apply to You as a Sender or a Runner, or in relation to any other ways that You use the Getitdone Site. <br>
						<br>
						<h4 style="text-align:left";> 2.You must not use the Getitdone Site for any illegal or immoral purpose. </h4> 
					<hr width=60%> 
					<h3 style="text-align:left";>
						&diams; POSTING AND BIDDING
					</h3>
					<p style="text-align:left";>
						<h4 style="text-align:left";>1.A post must include the following details in order to be accepted by Getitdone: </h4>
						a. Deadline for completion: the deadline for completion of the task or delivery of the goods; <br>
						<br>
						b. Price: the price that the Sender is prepared to pay for the goods or services required; <br>
						<br>
						c. Description a description of the goods or services; and <br>
						<br>
						d. Payment method: how Sender will pay the doer. <br>
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
						&diams; TERMINATION
					</h3>
					<p style="text-align:left";>
						 -Either party may terminate this Agreement at any time for any reason. 
						 <br> <br>
						-Third party Services are subject to Third Party Service Provider terms and conditions.
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
                    <IMG SRC=""""),_display_(Seq[Any](/*122.32*/routes/*122.38*/.Assets.at("images/soft-logo.png"))),format.raw/*122.72*/("""" vspace="70px" align="center" HEIGHT=30px>
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
                    DATE: Mon Jun 30 09:46:24 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/useofdata.scala.html
                    HASH: 25b44a18482e159bbfb90cf6e8f368419bacc934
                    MATRIX: 589->1|779->97|866->149|892->154|989->216|1003->222|1063->261|1154->317|1168->323|1223->357|1314->413|1328->419|1385->455|1482->516|1497->522|1551->554|1612->579|1627->585|1694->630|1872->772|1887->778|1938->807|2256->1089|2291->1101|2506->1280|2553->1311|2593->1313|2655->1339|2697->1372|2737->1374|2834->1435|2846->1438|2871->1441|2911->1445|2923->1448|2950->1453|3004->1489|3017->1494|3056->1495|3133->1536|3145->1539|3170->1542|3210->1546|3222->1549|3249->1554|3312->1585|3366->1607|3515->1720|3543->1739|3583->1741|3694->1834|3707->1839|3746->1840|3812->1870|3828->1877|3843->1883|3853->1917|3878->1933|3918->1935|3975->2006|3993->2015|4033->2017|4099->2047|4128->2054|4168->2058|4197->2065|4236->2101|4294->2127|8017->5813|8033->5819|8090->5853
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|140->122|140->122|140->122
                    -- GENERATED --
                */
            