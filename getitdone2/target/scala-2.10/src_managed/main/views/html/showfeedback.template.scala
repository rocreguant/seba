
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
object showfeedback extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userid: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.82*/("""
<!DOCTYPE html>

<html>
    <head>
        
        <title>Feedback selection</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/create.css"))),format.raw/*10.96*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*17.40*/routes/*17.46*/.Assets.at("images/logo.png"))),format.raw/*17.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="/searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*23.94*/searchstring)),format.raw/*23.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                    """),_display_(Seq[Any](/*26.22*/for(cat <- Category.find.all()) yield /*26.53*/ {_display_(Seq[Any](format.raw/*26.55*/("""
                        """),_display_(Seq[Any](/*27.26*/if(searchcategory.equals(cat.id))/*27.59*/ {_display_(Seq[Any](format.raw/*27.61*/("""
                        	<option selected="selected" value=""""),_display_(Seq[Any](/*28.62*/cat/*28.65*/.id)),format.raw/*28.68*/(""""> """),_display_(Seq[Any](/*28.72*/cat/*28.75*/.name)),format.raw/*28.80*/("""</option>
                        """)))}/*29.27*/else/*29.32*/{_display_(Seq[Any](format.raw/*29.33*/("""
                       	 	<option value=""""),_display_(Seq[Any](/*30.43*/cat/*30.46*/.id)),format.raw/*30.49*/(""""> """),_display_(Seq[Any](/*30.53*/cat/*30.56*/.name)),format.raw/*30.61*/("""</option>
                    	""")))})),format.raw/*31.23*/("""
                    """)))})),format.raw/*32.22*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*35.26*/if(session == null)/*35.45*/ {_display_(Seq[Any](format.raw/*35.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*37.27*/else/*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
                            """),_display_(Seq[Any](/*38.30*/session/*38.37*/ match/*38.43*/{/*39.33*/case "logout" =>/*39.49*/ {_display_(Seq[Any](format.raw/*39.51*/("""<a href="/login"> Login/Register </a>""")))}/*40.33*/case _ =>/*40.42*/ {_display_(Seq[Any](format.raw/*40.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*40.74*/session)),format.raw/*40.81*/(""""> """),_display_(Seq[Any](/*40.85*/session)),format.raw/*40.92*/(""" </a>""")))}})),format.raw/*41.30*/("""
                        """)))})),format.raw/*42.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
        <a href="usertasks?userid="""),_display_(Seq[Any](/*49.36*/session)),format.raw/*49.43*/("""&done=true"> My Tasks </a>
        <br>
        <a href="personalrequests?userid="""),_display_(Seq[Any](/*51.43*/session)),format.raw/*51.50*/("""&taskid=0"> View Pending Requests </a>
        <br>
        <a href="viewmessages?userid="""),_display_(Seq[Any](/*53.39*/session)),format.raw/*53.46*/(""""> View Messages </a>
        <br>
        <a href="editprofile?userid="""),_display_(Seq[Any](/*55.38*/session)),format.raw/*55.45*/(""""> Settings </a>
        <br>
        <a href="logout"> Logout </a>
        	
        	"""),_display_(Seq[Any](/*59.11*/if(Feedback.find.where().eq("t0.reciever_name", userid).findList().size() == 0)/*59.90*/{_display_(Seq[Any](format.raw/*59.91*/("""
        		<h3> Sorry but you still have no feedback </h3>
        	""")))}/*61.12*/else/*61.17*/{_display_(Seq[Any](format.raw/*61.18*/("""
	        	<h3> Your average grade is: """),_display_(Seq[Any](/*62.40*/Feedback/*62.48*/.getAVG(userid))),format.raw/*62.63*/(""" </h3>
	        	"""),_display_(Seq[Any](/*63.12*/for(item <- Feedback.find.where().eq("t0.reciever_name", userid).findList()) yield /*63.88*/ {_display_(Seq[Any](format.raw/*63.90*/("""

	                            <fieldset>
	                            	<h3> Given stars: """),_display_(Seq[Any](/*66.50*/item/*66.54*/.stars)),format.raw/*66.60*/("""</h3>
	                            	<h4>Commentary: """),_display_(Seq[Any](/*67.48*/item/*67.52*/.commentary)),format.raw/*67.63*/("""</h4>
	                           	</fieldset>
	           """)))})),format.raw/*69.14*/("""
        	""")))})),format.raw/*70.11*/("""
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
                    <IMG SRC=""""),_display_(Seq[Any](/*99.32*/routes/*99.38*/.Assets.at("images/soft-logo.png"))),format.raw/*99.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(userid:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(userid)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (userid) => (searchstring) => (searchcategory) => (session) => apply(userid)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 14:20:22 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/showfeedback.scala.html
                    HASH: 4d884fd01e47056a71aaaeb2485d535d2e4bedbe
                    MATRIX: 585->1|759->81|934->221|948->227|1008->266|1099->322|1113->328|1168->362|1260->418|1275->424|1333->460|1430->521|1445->527|1499->559|1560->584|1575->590|1642->635|1820->777|1835->783|1886->812|2205->1095|2240->1107|2455->1286|2502->1317|2542->1319|2604->1345|2646->1378|2686->1380|2784->1442|2796->1445|2821->1448|2861->1452|2873->1455|2900->1460|2954->1496|2967->1501|3006->1502|3085->1545|3097->1548|3122->1551|3162->1555|3174->1558|3201->1563|3265->1595|3319->1617|3468->1730|3496->1749|3536->1751|3647->1844|3660->1849|3699->1850|3765->1880|3781->1887|3796->1893|3806->1927|3831->1943|3871->1945|3928->2016|3946->2025|3986->2027|4052->2057|4081->2064|4121->2068|4150->2075|4189->2111|4247->2137|4437->2291|4466->2298|4584->2380|4613->2387|4739->2477|4768->2484|4876->2556|4905->2563|5029->2651|5117->2730|5156->2731|5244->2801|5257->2806|5296->2807|5372->2847|5389->2855|5426->2870|5480->2888|5572->2964|5612->2966|5739->3057|5752->3061|5780->3067|5869->3120|5882->3124|5915->3135|6007->3195|6050->3206|7458->4578|7473->4584|7529->4618
                    LINES: 19->1|22->1|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|38->17|38->17|38->17|44->23|44->23|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|51->30|51->30|51->30|52->31|53->32|56->35|56->35|56->35|58->37|58->37|58->37|59->38|59->38|59->38|59->39|59->39|59->39|59->40|59->40|59->40|59->40|59->40|59->40|59->40|59->41|60->42|67->49|67->49|69->51|69->51|71->53|71->53|73->55|73->55|77->59|77->59|77->59|79->61|79->61|79->61|80->62|80->62|80->62|81->63|81->63|81->63|84->66|84->66|84->66|85->67|85->67|85->67|87->69|88->70|117->99|117->99|117->99
                    -- GENERATED --
                */
            