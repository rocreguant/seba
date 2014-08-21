
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(error: String)(error2: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.112*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*6.17*/title)),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/login.css"))),format.raw/*9.95*/("""">
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
		        	<form class="form-horizontal" action="login" method="POST">
                        <div class="form-group">
	    					<legend><h3>Login</h3></legend>
                            <div id="error">"""),_display_(Seq[Any](/*51.46*/error)),format.raw/*51.51*/("""</div>
						    <label for="useridinput" class="col-sm-3">Username</label>
                            <div class="col-sm-5">
                                <input class="form-control" id="useridinput" type="text" name="userid">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="passwordinput" class="col-sm-3">Password</label>
                            <div class="col-sm-5">
                                <input class="form-control" id="passwordinput" type="password" name="password">
                            </div>
                        </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-5">
                                    <input class="btn btn-default" type="submit" value="Login" />
                                </div>
                            </div>
					</form>
                    <br>
                    <br>
	        		<form class="form-horizontal" action="register" method="post">
                            <div class="form-group">
                                <legend><h3>Register</h3></legend>
                            <div id="error">"""),_display_(Seq[Any](/*74.46*/error2)),format.raw/*74.52*/("""</div>
                                <label for="reguserinput" class="col-sm-3">Username</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="reguserinput" type="text" name="username">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="regemailinput" class="col-sm-3">Email</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="regemailinput" type="text" name="email">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="regpassinput" class="col-sm-3">Password</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="regpassinput" type="password" name="password">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="regconfirmpassinput" class="col-sm-3">Confirm Password</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="regconfirmpassinput" type="password" name="password_2">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="regzipinput" class="col-sm-3">Zipcode</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="regzipnput" type="text" name="zipcode">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-7">
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox" name="accept" value="yes">I <strong>accept the terms and conditions</strong> of Get-It-Done</br>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-5">
							        <input class="btn btn-default" type="submit" value="Register" />
                                </div>
                            </div>
					</form>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*147.32*/routes/*147.38*/.Assets.at("images/soft-logo.png"))),format.raw/*147.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>
"""))}
    }
    
    def render(title:String,error:String,error2:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(title)(error)(error2)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (error) => (error2) => (searchstring) => (searchcategory) => (session) => apply(title)(error)(error2)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:25 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/login.scala.html
                    HASH: 6293ae3b3f132279649f11089a4ce726db8d7175
                    MATRIX: 592->1|797->111|884->163|910->168|1007->230|1021->236|1081->275|1172->331|1186->337|1241->371|1332->427|1346->433|1402->468|1499->529|1514->535|1568->567|1629->592|1644->598|1711->643|1889->785|1904->791|1955->820|2273->1102|2308->1114|2527->1297|2574->1328|2614->1330|2680->1360|2722->1393|2762->1395|2867->1464|2879->1467|2904->1470|2944->1474|2956->1477|2983->1482|3041->1522|3054->1527|3093->1528|3178->1577|3190->1580|3215->1583|3255->1587|3267->1590|3294->1595|3365->1634|3423->1660|3572->1773|3600->1792|3640->1794|3751->1887|3764->1892|3803->1893|3869->1923|3885->1930|3900->1936|3910->1970|3935->1986|3975->1988|4032->2059|4050->2068|4090->2070|4156->2100|4185->2107|4225->2111|4254->2118|4293->2154|4351->2180|4713->2506|4740->2511|6038->3773|6066->3779|10228->7904|10244->7910|10301->7944
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|69->51|69->51|92->74|92->74|165->147|165->147|165->147
                    -- GENERATED --
                */
            