
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
object viewtasks extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template10[String,String,String,String,String,String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(Ttitle: String)(Tdesc: String)(Tzipcode: String)(Tdeadline: String)(Tprice: String)(Tcat: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.179*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*6.17*/title)),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/view.css"))),format.raw/*9.94*/("""">
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
                        """),_display_(Seq[Any](/*25.26*/for(cat <- Category.find.all()) yield /*25.57*/ {_display_(Seq[Any](format.raw/*25.59*/("""
                            """),_display_(Seq[Any](/*26.30*/if(searchcategory.equals(cat.id))/*26.63*/ {_display_(Seq[Any](format.raw/*26.65*/("""
                                <option selected="selected" value=""""),_display_(Seq[Any](/*27.69*/cat/*27.72*/.id)),format.raw/*27.75*/(""""> """),_display_(Seq[Any](/*27.79*/cat/*27.82*/.name)),format.raw/*27.87*/("""</option>
                            """)))}/*28.31*/else/*28.36*/{_display_(Seq[Any](format.raw/*28.37*/("""
                                <option value=""""),_display_(Seq[Any](/*29.49*/cat/*29.52*/.id)),format.raw/*29.55*/(""""> """),_display_(Seq[Any](/*29.59*/cat/*29.62*/.name)),format.raw/*29.67*/("""</option>
                            """)))})),format.raw/*30.30*/("""
                        """)))})),format.raw/*31.26*/("""
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
            <h3><strong>View Task: """),_display_(Seq[Any](/*48.37*/Ttitle)),format.raw/*48.43*/("""</strong></h3>
            <div id="viewtask">

                    <div class="inputform">
                        <label for="title">Title</label>
                        <input id="title" class="depth" type="text" name="title" value=""""),_display_(Seq[Any](/*53.90*/Ttitle)),format.raw/*53.96*/("""" readonly>
                    </div>

                    <div class="inputform">
                        <label for="category">Category</label>
                        <input id="title" class="depth" type="text" name="title" value=""""),_display_(Seq[Any](/*58.90*/Tcat)),format.raw/*58.94*/("""" readonly>
                        </select>
                    </div>

                    <div class="inputform">
                        <label for="description">Description</label>
                        <input id="description" class="depth" type="text" name="description" value=""""),_display_(Seq[Any](/*64.102*/Tdesc)),format.raw/*64.107*/("""" readonly>
                    </div>

                    <div class="inputform">
                        <label for="zipcode">Zipcode</label>
                        <input id="zipcode" class="depth" type="text" name="zipcode" value=""""),_display_(Seq[Any](/*69.94*/Tzipcode)),format.raw/*69.102*/("""" readonly>
                    </div>

                    <div class="inputform">
                        <label for="price">Reward</label>
                        <input id="price" class="depth" type="text" name="price" value=""""),_display_(Seq[Any](/*74.90*/Tprice)),format.raw/*74.96*/("""" id= "price" readonly>
                    </div>

                    <div class="inputform">
                        <label for="deadline">Deadline</label>
                        <input class="depth" type="text" name="deadline" value=""""),_display_(Seq[Any](/*79.82*/if(Tdeadline.isEmpty)/*79.103*/ {_display_(Seq[Any](format.raw/*79.105*/("""No deadline""")))}/*79.118*/else/*79.123*/{_display_(Seq[Any](_display_(Seq[Any](/*79.125*/Tdeadline)),format.raw/*79.134*/("""" placeholder="yyyy-mm-dd" readonly> """)))})),format.raw/*79.172*/("""
                    </div>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*110.32*/routes/*110.38*/.Assets.at("images/soft-logo.png"))),format.raw/*110.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(title:String,Ttitle:String,Tdesc:String,Tzipcode:String,Tdeadline:String,Tprice:String,Tcat:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(title)(Ttitle)(Tdesc)(Tzipcode)(Tdeadline)(Tprice)(Tcat)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (String) => (String) => (String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (Ttitle) => (Tdesc) => (Tzipcode) => (Tdeadline) => (Tprice) => (Tcat) => (searchstring) => (searchcategory) => (session) => apply(title)(Ttitle)(Tdesc)(Tzipcode)(Tdeadline)(Tprice)(Tcat)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:26 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/viewtasks.scala.html
                    HASH: 9854274b9ceb0f89e65ad9822585e4e5711bc313
                    MATRIX: 625->1|897->178|984->230|1010->235|1107->297|1121->303|1181->342|1272->398|1286->404|1341->438|1432->494|1446->500|1501->534|1598->595|1613->601|1667->633|1728->658|1743->664|1810->709|1988->851|2003->857|2054->886|2372->1168|2407->1180|2626->1363|2673->1394|2713->1396|2779->1426|2821->1459|2861->1461|2966->1530|2978->1533|3003->1536|3043->1540|3055->1543|3082->1548|3140->1588|3153->1593|3192->1594|3277->1643|3289->1646|3314->1649|3354->1653|3366->1656|3393->1661|3464->1700|3522->1726|3671->1839|3699->1858|3739->1860|3850->1953|3863->1958|3902->1959|3968->1989|3984->1996|3999->2002|4009->2036|4034->2052|4074->2054|4131->2125|4149->2134|4189->2136|4255->2166|4284->2173|4324->2177|4353->2184|4392->2220|4450->2246|4641->2401|4669->2407|4943->2645|4971->2651|5243->2887|5269->2891|5594->3179|5622->3184|5896->3422|5927->3430|6194->3661|6222->3667|6498->3907|6529->3928|6570->3930|6602->3943|6616->3948|6665->3950|6697->3959|6768->3997|8223->5415|8239->5421|8296->5455
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|66->48|66->48|71->53|71->53|76->58|76->58|82->64|82->64|87->69|87->69|92->74|92->74|97->79|97->79|97->79|97->79|97->79|97->79|97->79|97->79|128->110|128->110|128->110
                    -- GENERATED --
                */
            