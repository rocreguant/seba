
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
object viewmessages extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(useridr: String)(userids: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.100*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>Messages</title>
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
        """),_display_(Seq[Any](/*48.10*/if(Message.findByUser(userids, session).size()== 0)/*48.61*/{_display_(Seq[Any](format.raw/*48.62*/("""
        	<h3><strong>There is no messages to show!</strong></h3>
        """)))}/*50.10*/else/*50.14*/{_display_(Seq[Any](format.raw/*50.15*/("""
            
            <h3><strong>Messages</strong></h3>
            <div id="wrap2">
				"""),_display_(Seq[Any](/*54.6*/for(item <- Message.findByUser(userids, session)) yield /*54.55*/{_display_(Seq[Any](format.raw/*54.56*/("""
				
				<fieldset>
				
					<div>
				  		<label for="title">Title</label>
                        <input id="title" class="depth" type="text" name="title" value=""""),_display_(Seq[Any](/*60.90*/item/*60.94*/.title)),format.raw/*60.100*/(""""  readonly>
                        <br>
                        <label for="message">Message</label>
                        <input id="message" class="depth" type="text" name="message" value=""""),_display_(Seq[Any](/*63.94*/item/*63.98*/.message)),format.raw/*63.106*/(""""  readonly>
                        <br>
                        <label for="message">Sender</label>
                        <input id="sender" class="depth" type="text" name="sender" value=""""),_display_(Seq[Any](/*66.92*/session)),format.raw/*66.99*/(""""  readonly>
                    </div>
                    
                </fieldset>
                    
				""")))})),format.raw/*71.6*/("""
		""")))})),format.raw/*72.4*/("""
		<form action="viewmessages" method="POST">
					<div class="inputform">
                        <p>Leave a Message</p>
                         <input id="userids" class="depth" type="hidden" name="userids" value=""""),_display_(Seq[Any](/*76.97*/session)),format.raw/*76.104*/("""">
                        <hr width=60%>
                         To: <input style='text-align:left' type='text' name='useridr' id='useridr' /><br />
                         Title: <input style='text-align:left' type='text' name='title' id='title' /><br />
                          message:<br />
 								 <textarea name='message' id='message' /></textarea><br />
                    	<input type="submit" id="send" class="btn btn-default" value="Send Message"/>
                    	</div>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*115.32*/routes/*115.38*/.Assets.at("images/soft-logo.png"))),format.raw/*115.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(useridr:String,userids:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(useridr)(userids)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (useridr) => (userids) => (searchstring) => (searchcategory) => (session) => apply(useridr)(userids)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 14:42:19 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/viewmessages.scala.html
                    HASH: 8c47bdb98883907bf448bac9101169238634d0e6
                    MATRIX: 592->1|785->99|941->220|955->226|1015->265|1106->321|1120->327|1175->361|1266->417|1280->423|1337->459|1434->520|1449->526|1503->558|1564->583|1579->589|1646->634|1824->776|1839->782|1890->811|2208->1093|2243->1105|2458->1284|2505->1315|2545->1317|2607->1343|2649->1376|2689->1378|2786->1439|2798->1442|2823->1445|2863->1449|2875->1452|2902->1457|2956->1493|2969->1498|3008->1499|3085->1540|3097->1543|3122->1546|3162->1550|3174->1553|3201->1558|3264->1589|3318->1611|3467->1724|3495->1743|3535->1745|3646->1838|3659->1843|3698->1844|3764->1874|3780->1881|3795->1887|3805->1921|3830->1937|3870->1939|3927->2010|3945->2019|3985->2021|4051->2051|4080->2058|4120->2062|4149->2069|4188->2105|4246->2131|4410->2259|4470->2310|4509->2311|4603->2386|4616->2390|4655->2391|4785->2486|4850->2535|4889->2536|5092->2703|5105->2707|5134->2713|5366->2909|5379->2913|5410->2921|5639->3114|5668->3121|5814->3236|5849->3240|6103->3458|6133->3465|8072->5367|8088->5373|8145->5407
                    LINES: 19->1|22->1|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|66->48|66->48|66->48|68->50|68->50|68->50|72->54|72->54|72->54|78->60|78->60|78->60|81->63|81->63|81->63|84->66|84->66|89->71|90->72|94->76|94->76|133->115|133->115|133->115
                    -- GENERATED --
                */
            