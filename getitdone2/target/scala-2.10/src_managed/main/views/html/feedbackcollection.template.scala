
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
object feedbackcollection extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(taskid: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.82*/("""
<!DOCTYPE html>

<html>
    <head>
        """),_display_(Seq[Any](/*6.10*/if(taskid.equals("-1"))/*6.33*/{_display_(Seq[Any](format.raw/*6.34*/("""
        	<title>Thank you for the feedback</title>
        """)))}/*8.11*/else/*8.16*/{_display_(Seq[Any](format.raw/*8.17*/("""
        	<title>Provide feedback</title>
        """)))})),format.raw/*10.10*/("""
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*11.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css"))),format.raw/*12.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/create.css"))),format.raw/*13.96*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.59*/routes/*14.65*/.Assets.at("images/favicon.png"))),format.raw/*14.97*/("""">
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*20.40*/routes/*20.46*/.Assets.at("images/logo.png"))),format.raw/*20.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="searchtasks" method="GET">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*26.94*/searchstring)),format.raw/*26.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                    """),_display_(Seq[Any](/*29.22*/for(cat <- Category.find.all()) yield /*29.53*/ {_display_(Seq[Any](format.raw/*29.55*/("""
                        """),_display_(Seq[Any](/*30.26*/if(searchcategory.equals(cat.id))/*30.59*/ {_display_(Seq[Any](format.raw/*30.61*/("""
                        <option selected="selected" value=""""),_display_(Seq[Any](/*31.61*/cat/*31.64*/.id)),format.raw/*31.67*/(""""> """),_display_(Seq[Any](/*31.71*/cat/*31.74*/.name)),format.raw/*31.79*/("""</option>
                        """)))}/*32.27*/else/*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
                        <option value=""""),_display_(Seq[Any](/*33.41*/cat/*33.44*/.id)),format.raw/*33.47*/(""""> """),_display_(Seq[Any](/*33.51*/cat/*33.54*/.name)),format.raw/*33.59*/("""</option>
                    """)))})),format.raw/*34.22*/("""
                    """)))})),format.raw/*35.22*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*38.26*/if(session == null)/*38.45*/ {_display_(Seq[Any](format.raw/*38.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*40.27*/else/*40.32*/{_display_(Seq[Any](format.raw/*40.33*/("""
                            """),_display_(Seq[Any](/*41.30*/session/*41.37*/ match/*41.43*/{/*42.33*/case "logout" =>/*42.49*/ {_display_(Seq[Any](format.raw/*42.51*/("""<a href="/login"> Login/Register </a>""")))}/*43.33*/case _ =>/*43.42*/ {_display_(Seq[Any](format.raw/*43.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*43.74*/session)),format.raw/*43.81*/(""""> """),_display_(Seq[Any](/*43.85*/session)),format.raw/*43.92*/(""" </a>""")))}})),format.raw/*44.30*/("""
                        """)))})),format.raw/*45.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
        """),_display_(Seq[Any](/*52.10*/if(taskid.equals("-1"))/*52.33*/{_display_(Seq[Any](format.raw/*52.34*/("""
        	<h3><strong>Thank you for the feedback!</strong></h3>
        """)))}/*54.10*/else/*54.14*/{_display_(Seq[Any](format.raw/*54.15*/("""
            <h3><strong>Give us feedback</strong></h3>
			<form action="givefeedback" method="GET">
            <div id="wrap2">

					<input id="taskid" class="depth" type="hidden" name="taskid" value = """"),_display_(Seq[Any](/*59.77*/taskid)),format.raw/*59.83*/("""">
					
                    <div class="inputform">
                        <p>Shortly describe your task as exactly as possible</p>
                        <label for="description">Description</label>
                        <input id="description" class="depth" type="text" name="description">
                    </div>

                    <div class="inputform">
                        <p>Select your valoration</p>
                    <label for="category">Category</label>
                        <select id="stars" class="depth" name= "stars" value = "5">
                            <option value="5"> *****</option>
                            <option value="4"> ****</option>
                            <option value="3"> ***</option>
                            <option value="2"> **</option>
                            <option value="1"> *</option>
                        </select>
                    </div>
                    
                    <div class="inputform">
                    	<input type="submit" id="submittask" class="modern" value="Submit Feedback"/>
                    </div>
            </div>

            <div>
            </div>
			</form>
		""")))})),format.raw/*87.4*/("""
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
</html>"""))}
    }
    
    def render(taskid:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(taskid)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (taskid) => (searchstring) => (searchcategory) => (session) => apply(taskid)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:28 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/feedbackcollection.scala.html
                    HASH: 701056e069992c80eeb81f9108730f296343ec78
                    MATRIX: 591->1|765->81|845->126|876->149|914->150|993->212|1005->217|1043->218|1126->269|1216->323|1231->329|1292->368|1384->424|1399->430|1455->464|1547->520|1562->526|1620->562|1717->623|1732->629|1786->661|1847->686|1862->692|1929->737|2107->879|2122->885|2173->914|2490->1195|2525->1207|2740->1386|2787->1417|2827->1419|2889->1445|2931->1478|2971->1480|3068->1541|3080->1544|3105->1547|3145->1551|3157->1554|3184->1559|3238->1595|3251->1600|3290->1601|3367->1642|3379->1645|3404->1648|3444->1652|3456->1655|3483->1660|3546->1691|3600->1713|3749->1826|3777->1845|3817->1847|3928->1940|3941->1945|3980->1946|4046->1976|4062->1983|4077->1989|4087->2023|4112->2039|4152->2041|4209->2112|4227->2121|4267->2123|4333->2153|4362->2160|4402->2164|4431->2171|4470->2207|4528->2233|4692->2361|4724->2384|4763->2385|4855->2458|4868->2462|4907->2463|5150->2670|5178->2676|6398->3865|7807->5237|7823->5243|7880->5277
                    LINES: 19->1|22->1|27->6|27->6|27->6|29->8|29->8|29->8|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|41->20|41->20|41->20|47->26|47->26|50->29|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|54->33|54->33|54->33|55->34|56->35|59->38|59->38|59->38|61->40|61->40|61->40|62->41|62->41|62->41|62->42|62->42|62->42|62->43|62->43|62->43|62->43|62->43|62->43|62->43|62->44|63->45|70->52|70->52|70->52|72->54|72->54|72->54|77->59|77->59|105->87|134->116|134->116|134->116
                    -- GENERATED --
                */
            