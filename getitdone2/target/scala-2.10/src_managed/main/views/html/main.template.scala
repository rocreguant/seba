
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

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
            <div id="getitdone">
                <IMG style="vertical-align: middle; max-width: 50%; height: auto;" SRC=""""),_display_(Seq[Any](/*48.90*/routes/*48.96*/.Assets.at("images/design.png"))),format.raw/*48.127*/("""">
                <strong>GetItDone</strong> helps you doing things <strong>that matter.</strong>
            </div>
            <div id="doingtasks">
            <h1> Let others do your tasks </h1>
            <h4> by creating a new Task</h4>
            <h2> or </h2>
            <h1> Do others tasks </h1>
            <h4> by searching for existing Tasks</h4>
            <div id="example">
                <form name="input" action="searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*59.94*/searchstring)),format.raw/*59.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                        """),_display_(Seq[Any](/*62.26*/for(cat <- Category.find.all()) yield /*62.57*/ {_display_(Seq[Any](format.raw/*62.59*/("""
                            """),_display_(Seq[Any](/*63.30*/if(searchcategory.equals(cat.id))/*63.63*/ {_display_(Seq[Any](format.raw/*63.65*/("""
                                <option selected="selected" value=""""),_display_(Seq[Any](/*64.69*/cat/*64.72*/.id)),format.raw/*64.75*/(""""> """),_display_(Seq[Any](/*64.79*/cat/*64.82*/.name)),format.raw/*64.87*/("""</option>
                            """)))}/*65.31*/else/*65.36*/{_display_(Seq[Any](format.raw/*65.37*/("""
                                <option value=""""),_display_(Seq[Any](/*66.49*/cat/*66.52*/.id)),format.raw/*66.55*/(""""> """),_display_(Seq[Any](/*66.59*/cat/*66.62*/.name)),format.raw/*66.67*/("""</option>
                            """)))})),format.raw/*67.30*/("""
                        """)))})),format.raw/*68.26*/("""
                    </select>
                    <input type="submit" value="Search">
                </form>
            </div>
            </div>
            <div id="categories">
            <p><h2> while selecting from multiple categories </h2></p>
             <IMG SRC=""""),_display_(Seq[Any](/*76.25*/routes/*76.31*/.Assets.at("images/houseworksmall.png"))),format.raw/*76.70*/("""">
             <IMG SRC=""""),_display_(Seq[Any](/*77.25*/routes/*77.31*/.Assets.at("images/cleaningsmall.png"))),format.raw/*77.69*/("""">
             <IMG SRC=""""),_display_(Seq[Any](/*78.25*/routes/*78.31*/.Assets.at("images/shoppingsmall.png"))),format.raw/*78.69*/("""">
             <IMG SRC=""""),_display_(Seq[Any](/*79.25*/routes/*79.31*/.Assets.at("images/computerhelpsmall.png"))),format.raw/*79.73*/("""">
             <IMG SRC=""""),_display_(Seq[Any](/*80.25*/routes/*80.31*/.Assets.at("images/designsmall.png"))),format.raw/*80.67*/("""">
             <IMG SRC=""""),_display_(Seq[Any](/*81.25*/routes/*81.31*/.Assets.at("images/somethingelsesmall.png"))),format.raw/*81.74*/("""">
            </div>
            <div class="signup"><a href="login"><div class="modern"><h2>Sign Up Now</h2></div></a>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*114.32*/routes/*114.38*/.Assets.at("images/soft-logo.png"))),format.raw/*114.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(title)(content)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => (searchstring) => (searchcategory) => (session) => apply(title)(content)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:26 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/main.scala.html
                    HASH: ebcf5f24eb1d6929021dc79fcf2a9760af3ce5e8
                    MATRIX: 584->1|774->97|861->149|887->154|984->216|998->222|1058->261|1149->317|1163->323|1218->357|1314->418|1328->424|1381->456|1442->481|1457->487|1524->532|1702->674|1717->680|1768->709|2086->991|2121->1003|2340->1186|2387->1217|2427->1219|2493->1249|2535->1282|2575->1284|2680->1353|2692->1356|2717->1359|2757->1363|2769->1366|2796->1371|2854->1411|2867->1416|2906->1417|2991->1466|3003->1469|3028->1472|3068->1476|3080->1479|3107->1484|3178->1523|3236->1549|3385->1662|3413->1681|3453->1683|3564->1776|3577->1781|3616->1782|3682->1812|3698->1819|3713->1825|3723->1859|3748->1875|3788->1877|3845->1948|3863->1957|3903->1959|3969->1989|3998->1996|4038->2000|4067->2007|4106->2043|4164->2069|4441->2310|4456->2316|4510->2347|5105->2906|5140->2918|5359->3101|5406->3132|5446->3134|5512->3164|5554->3197|5594->3199|5699->3268|5711->3271|5736->3274|5776->3278|5788->3281|5815->3286|5873->3326|5886->3331|5925->3332|6010->3381|6022->3384|6047->3387|6087->3391|6099->3394|6126->3399|6197->3438|6255->3464|6570->3743|6585->3749|6646->3788|6709->3815|6724->3821|6784->3859|6847->3886|6862->3892|6922->3930|6985->3957|7000->3963|7064->4005|7127->4032|7142->4038|7200->4074|7263->4101|7278->4107|7343->4150|8892->5662|8908->5668|8965->5702
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|36->15|36->15|36->15|42->21|42->21|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|49->28|49->28|49->28|50->29|51->30|54->33|54->33|54->33|56->35|56->35|56->35|57->36|57->36|57->36|57->37|57->37|57->37|57->38|57->38|57->38|57->38|57->38|57->38|57->38|57->39|58->40|66->48|66->48|66->48|77->59|77->59|80->62|80->62|80->62|81->63|81->63|81->63|82->64|82->64|82->64|82->64|82->64|82->64|83->65|83->65|83->65|84->66|84->66|84->66|84->66|84->66|84->66|85->67|86->68|94->76|94->76|94->76|95->77|95->77|95->77|96->78|96->78|96->78|97->79|97->79|97->79|98->80|98->80|98->80|99->81|99->81|99->81|132->114|132->114|132->114
                    -- GENERATED --
                */
            