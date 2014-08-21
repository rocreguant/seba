
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
object help extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

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
            <h3><strong>Here's how it works:</strong></h3>
			<form action="help" method="get">
            <div id="getitdone">
				<fieldset>
					<h3>
					Describe your task
					</h3>
					<img src="https://d27r861tkvec9a.cloudfront.net/static/assets/corporate/how-it-works/pencil-cc826fd32ca412a7768aaaedb6283cd0.png" />
					<p>
						Just tell us what you need<br />done, plus when and where
					</p>
					<hr width=60%>
					<h3>
						Name your price or request bids
					</h3>
					<img src="https://d27r861tkvec9a.cloudfront.net/static/assets/corporate/how-it-works/bid-763a5fc6c64dfdec73493f1f41d7091c.png" />
					<p>
						Review our Pricing section<br />below for tips
					</p>
					<hr width=60%>
					<h3>
						Get a friendly Person for doing the task
					</h3>
					<img src="https://d27r861tkvec9a.cloudfront.net/static/assets/corporate/how-it-works/direct-hire-e3b91569d9ecccd44225c6cb944a69d0.png" />
					<p>
						You can choose the person<br />base on the the feedback
					</p>
					<hr width=60%>
					<h3>
						Pay only when the task is done
					</h3>
					<img src="https://d27r861tkvec9a.cloudfront.net/static/assets/corporate/how-it-works/pay-39530838acc7e69624c1e7fc7ac4de33.png" />
					<p>
						Once you're satisfied, you pay<br />securely through our site. It's easy!
					</p>
					<hr>
					<h1 style="text-align:left;color:gray;">Pricing</h1> 
					<p style="text-align:left;">You decide. You name your price and all transactions are done easily and securely through your getitdone account.5% of the TaskPrice plus 1 Euro on every completed Task is reserved for our Service Fee. </p>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*117.32*/routes/*117.38*/.Assets.at("images/soft-logo.png"))),format.raw/*117.72*/("""" vspace="70px" align="center" HEIGHT=30px>
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
                    DATE: Mon Jun 30 09:46:27 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/help.scala.html
                    HASH: b36a4a65b4255c70f253b5197648f3ffc63c83ec
                    MATRIX: 584->1|774->97|861->149|887->154|984->216|998->222|1058->261|1149->317|1163->323|1218->357|1309->413|1323->419|1380->455|1477->516|1492->522|1546->554|1607->579|1622->585|1689->630|1867->772|1882->778|1933->807|2251->1089|2286->1101|2501->1280|2548->1311|2588->1313|2650->1339|2692->1372|2732->1374|2829->1435|2841->1438|2866->1441|2906->1445|2918->1448|2945->1453|2999->1489|3012->1494|3051->1495|3128->1536|3140->1539|3165->1542|3205->1546|3217->1549|3244->1554|3307->1585|3361->1607|3510->1720|3538->1739|3578->1741|3689->1834|3702->1839|3741->1840|3807->1870|3823->1877|3838->1883|3848->1917|3873->1933|3913->1935|3970->2006|3988->2015|4028->2017|4094->2047|4123->2054|4163->2058|4192->2065|4231->2101|4289->2127|7491->5292|7507->5298|7564->5332
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|135->117|135->117|135->117
                    -- GENERATED --
                */
            