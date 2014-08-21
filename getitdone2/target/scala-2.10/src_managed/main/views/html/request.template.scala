
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
object request extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(taskid: String)(userid: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.98*/("""
<!DOCTYPE html>

<html>
    <head>
        """),_display_(Seq[Any](/*6.10*/if(taskid.equals("-1"))/*6.33*/{_display_(Seq[Any](format.raw/*6.34*/("""
        	"""),_display_(Seq[Any](/*7.11*/if(userid.equals("-2"))/*7.34*/{_display_(Seq[Any](format.raw/*7.35*/("""
        		<title>Requests moderation has been done.</title>
        	""")))}/*9.12*/else/*9.17*/{_display_(Seq[Any](format.raw/*9.18*/("""
        		<title>Request submitted.</title>
        	""")))})),format.raw/*11.11*/("""
        """)))}/*12.11*/else/*12.16*/{_display_(Seq[Any](format.raw/*12.17*/("""
        	<title>Provide feedback</title>
        """)))})),format.raw/*14.10*/("""
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*15.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.54*/routes/*16.60*/.Assets.at("stylesheets/main.css"))),format.raw/*16.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.54*/routes/*17.60*/.Assets.at("stylesheets/create.css"))),format.raw/*17.96*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*18.59*/routes/*18.65*/.Assets.at("images/favicon.png"))),format.raw/*18.97*/("""">
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*19.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*24.40*/routes/*24.46*/.Assets.at("images/logo.png"))),format.raw/*24.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*30.94*/searchstring)),format.raw/*30.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                    """),_display_(Seq[Any](/*33.22*/for(cat <- Category.find.all()) yield /*33.53*/ {_display_(Seq[Any](format.raw/*33.55*/("""
                        """),_display_(Seq[Any](/*34.26*/if(searchcategory.equals(cat.id))/*34.59*/ {_display_(Seq[Any](format.raw/*34.61*/("""
                        <option selected="selected" value=""""),_display_(Seq[Any](/*35.61*/cat/*35.64*/.id)),format.raw/*35.67*/(""""> """),_display_(Seq[Any](/*35.71*/cat/*35.74*/.name)),format.raw/*35.79*/("""</option>
                        """)))}/*36.27*/else/*36.32*/{_display_(Seq[Any](format.raw/*36.33*/("""
                        <option value=""""),_display_(Seq[Any](/*37.41*/cat/*37.44*/.id)),format.raw/*37.47*/(""""> """),_display_(Seq[Any](/*37.51*/cat/*37.54*/.name)),format.raw/*37.59*/("""</option>
                    	""")))})),format.raw/*38.23*/("""
                    """)))})),format.raw/*39.22*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*42.26*/if(session == null)/*42.45*/ {_display_(Seq[Any](format.raw/*42.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*44.27*/else/*44.32*/{_display_(Seq[Any](format.raw/*44.33*/("""
                            """),_display_(Seq[Any](/*45.30*/session/*45.37*/ match/*45.43*/{/*46.33*/case "logout" =>/*46.49*/ {_display_(Seq[Any](format.raw/*46.51*/("""<a href="/login"> Login/Register </a>""")))}/*47.33*/case _ =>/*47.42*/ {_display_(Seq[Any](format.raw/*47.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*47.74*/session)),format.raw/*47.81*/(""""> """),_display_(Seq[Any](/*47.85*/session)),format.raw/*47.92*/(""" </a>""")))}})),format.raw/*48.30*/("""
                        """)))})),format.raw/*49.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
        """),_display_(Seq[Any](/*56.10*/if(taskid.equals("-1"))/*56.33*/{_display_(Seq[Any](format.raw/*56.34*/("""
        	"""),_display_(Seq[Any](/*57.11*/if(userid.equals("-2"))/*57.34*/{_display_(Seq[Any](format.raw/*57.35*/("""
	        	<h3><strong>The request has been accepted and you will be contacted soon.</strong></h3>
	        """)))}/*59.12*/else/*59.17*/{_display_(Seq[Any](format.raw/*59.18*/("""
	        	<h3><strong>If the user is interested in your request you will be contacted soon.</strong></h3>
	        """)))})),format.raw/*61.11*/("""
        """)))}/*62.11*/else/*62.16*/{_display_(Seq[Any](format.raw/*62.17*/("""
            <h3><strong>Tell us why you are the right person to complete this task.</strong></h3>
			<form action="request" method="POST">
            <div id="wrap2">

					<input id="taskid" class="depth" type="hidden" name="taskid" value = """"),_display_(Seq[Any](/*67.77*/taskid)),format.raw/*67.83*/("""">
					<input id="userid" class="depth" type="hidden" name="userid" value = """"),_display_(Seq[Any](/*68.77*/userid)),format.raw/*68.83*/("""">
					
                    <div class="inputform">
                        <p>Describe why you think that you're the right person.</p>
                        <label for="description">Explanation</label>
                        <input id="description" class="depth" type="text" name="description">
                    </div>
                    
                    <div class="inputform">
                    	<input type="submit" id="submittask" class="modern" value="Submit Request"/>
                    </div>
            </div>

            <div>
            </div>
			</form>
		""")))})),format.raw/*84.4*/("""
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
                    <IMG SRC=""""),_display_(Seq[Any](/*113.32*/routes/*113.38*/.Assets.at("images/soft-logo.png"))),format.raw/*113.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(taskid:String,userid:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(taskid)(userid)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (taskid) => (userid) => (searchstring) => (searchcategory) => (session) => apply(taskid)(userid)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:25 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/request.scala.html
                    HASH: 726cb7c57c18000309a2421986900aed4c049b3a
                    MATRIX: 587->1|777->97|857->142|888->165|926->166|972->177|1003->200|1041->201|1130->273|1142->278|1180->279|1267->334|1296->345|1309->350|1348->351|1431->402|1521->456|1536->462|1597->501|1689->557|1704->563|1760->597|1852->653|1867->659|1925->695|2022->756|2037->762|2091->794|2152->819|2167->825|2234->870|2412->1012|2427->1018|2478->1047|2796->1329|2831->1341|3046->1520|3093->1551|3133->1553|3195->1579|3237->1612|3277->1614|3374->1675|3386->1678|3411->1681|3451->1685|3463->1688|3490->1693|3544->1729|3557->1734|3596->1735|3673->1776|3685->1779|3710->1782|3750->1786|3762->1789|3789->1794|3853->1826|3907->1848|4056->1961|4084->1980|4124->1982|4235->2075|4248->2080|4287->2081|4353->2111|4369->2118|4384->2124|4394->2158|4419->2174|4459->2176|4516->2247|4534->2256|4574->2258|4640->2288|4669->2295|4709->2299|4738->2306|4777->2342|4835->2368|4999->2496|5031->2519|5070->2520|5117->2531|5149->2554|5188->2555|5316->2665|5329->2670|5368->2671|5517->2788|5546->2799|5559->2804|5598->2805|5880->3051|5908->3057|6023->3136|6051->3142|6670->3730|8079->5102|8095->5108|8152->5142
                    LINES: 19->1|22->1|27->6|27->6|27->6|28->7|28->7|28->7|30->9|30->9|30->9|32->11|33->12|33->12|33->12|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|45->24|45->24|45->24|51->30|51->30|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|56->35|56->35|56->35|57->36|57->36|57->36|58->37|58->37|58->37|58->37|58->37|58->37|59->38|60->39|63->42|63->42|63->42|65->44|65->44|65->44|66->45|66->45|66->45|66->46|66->46|66->46|66->47|66->47|66->47|66->47|66->47|66->47|66->47|66->48|67->49|74->56|74->56|74->56|75->57|75->57|75->57|77->59|77->59|77->59|79->61|80->62|80->62|80->62|85->67|85->67|86->68|86->68|102->84|131->113|131->113|131->113
                    -- GENERATED --
                */
            