
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
object viewuser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[String,String,String,Integer,String,String,String,String,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(error: String)(searchstring: String)(searchcategory: Integer)(Email: String)(Username: String)(Password: String)(ConfirmPassword: String)(Zipcode: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.173*/("""
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
                    <a href="login"> Login/Register </a>
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
            <h3><strong>Account created!</strong></h3>
            <div id="viewtask">

                    <div class="inputform">
                        <label for="title">Email</label>
                        <input id="title" class="depth" type="text" name="title" value=""""),_display_(Seq[Any](/*46.90*/Email)),format.raw/*46.95*/("""" readonly>
                    </div>

                    <div class="inputform">
                        <label for="category">Username</label>
                        <input id="title" class="depth" type="text" name="title" value=""""),_display_(Seq[Any](/*51.90*/Username)),format.raw/*51.98*/("""" readonly>
                        </select>
                    </div>

                    <div class="inputform">
                        <label for="description">Zipcode</label>
                        <input id="description" class="depth" type="text" name="description" value=""""),_display_(Seq[Any](/*57.102*/Zipcode)),format.raw/*57.109*/("""" readonly>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*88.32*/routes/*88.38*/.Assets.at("images/soft-logo.png"))),format.raw/*88.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(title:String,error:String,searchstring:String,searchcategory:Integer,Email:String,Username:String,Password:String,ConfirmPassword:String,Zipcode:Integer): play.api.templates.HtmlFormat.Appendable = apply(title)(error)(searchstring)(searchcategory)(Email)(Username)(Password)(ConfirmPassword)(Zipcode)
    
    def f:((String) => (String) => (String) => (Integer) => (String) => (String) => (String) => (String) => (Integer) => play.api.templates.HtmlFormat.Appendable) = (title) => (error) => (searchstring) => (searchcategory) => (Email) => (Username) => (Password) => (ConfirmPassword) => (Zipcode) => apply(title)(error)(searchstring)(searchcategory)(Email)(Username)(Password)(ConfirmPassword)(Zipcode)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:24 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/viewuser.scala.html
                    HASH: 2822c4ccd835e1365869ba443b55fbbeb3f14db1
                    MATRIX: 617->1|883->172|970->224|996->229|1093->291|1107->297|1167->336|1258->392|1272->398|1327->432|1418->488|1432->494|1487->528|1584->589|1599->595|1653->627|1714->652|1729->658|1796->703|1974->845|1989->851|2040->880|2358->1162|2393->1174|2612->1357|2659->1388|2699->1390|2765->1420|2807->1453|2847->1455|2952->1524|2964->1527|2989->1530|3029->1534|3041->1537|3068->1542|3126->1582|3139->1587|3178->1588|3263->1637|3275->1640|3300->1643|3340->1647|3352->1650|3379->1655|3450->1694|3508->1720|4085->2261|4112->2266|4384->2502|4414->2510|4735->2794|4765->2801|6230->4230|6245->4236|6301->4270
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|67->46|67->46|72->51|72->51|78->57|78->57|109->88|109->88|109->88
                    -- GENERATED --
                */
            