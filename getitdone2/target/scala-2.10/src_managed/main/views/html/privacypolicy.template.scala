
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
object privacypolicy extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

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
            <h3><strong>Privacy Policy:</strong></h3>
			<form action="privacypolicy" method="get">
            <div id="getitdone">
				<fieldset>
					<h3 style="text-align:left";>
						 1. Collection and Use of Your Personal Information
					</h3>
					<p style="text-align:left";>
						You are not anonymous to us when you log into the Site or post any content (including tasks, items to be supplied, bids, comments or feedback) on the Site or any associated forum. To enable us to improve our existing services and to create new service features, Getitdone may collect, and share with other users and service providers on Getitdone, information about the way you use our services, including (but not limited to) the transactions you enter into on the Site, your feedback rating (including any references requested using our Reference feature), the bids you make, the comments you post, and the transactions you enter into with our valued affiliate service providers.
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
						2. Cookies and Anonymous Identifiers
					</h3>
					<p style="text-align:left";>
						If you have registered on the Site then your computer or device may store an identifying cookie or anonymous identifier, which can save you time each time you re-visit the Site, by accessing your information when you sign-in to Getitdone.Getitdone may use cookies and anonymous identifiers for a number of purposes including to access your information when you sign in, keep track of your preferences, direct specific content to you, report on Getitdoner s user base, and to improve Getitdone s services. We may also use cookies or anonymous identifiers when you interact with our affiliate service providers (for example, when you integrate your Getitdone account with your Facebook profile).
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
					    3. Protecting and Maintaining Personal Information
					</h3>
					<p style="text-align:left";>
						Your account is protected by a password for your privacy and security. We will take all reasonable steps to protect the information We hold about you from unauthorized access, use and disclosure, however We cannot guarantee the absolute security of that information, or that our systems will be completely free from third party interception or are incorruptible from viruses. We cannot and do not guarantee that information you send from your computer to us over the Internet will be protected by any form of encryption (encoding software). In light of this, We cannot and do not ensure or warrant the security or privacy of your personal information, including payment and account details. You transmit your personal information to us at your own risk.
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
					   4. Third Parties
					</h3>
					<p style="text-align:left";>
						The Site may contain links to third party websites including the networks of our valued affiliate service providers, advertisers, and PayPal. If you follow a link to any of these websites, for instance PayPal payment system, note that they have their own privacy policies. If you use our website to link to another site you will be subject to that site s terms and conditions of use, privacy policy and security statement. We strongly encourage you to view these before disclosing any of your personal information on such sites.
					</p>
					<hr width=60%>
					<h3 style="text-align:left";>
					   5. Privacy Concerns
					</h3>
					<p style="text-align:left";>
						If you have concerns about how We handle your personal information or require further information, please email Getitdone using the contact Us provided on the Site. If you make a formal written complaint in relation to our compliance with this Privacy Policy, We will contact you to follow up on that complaint. Other than material that you voluntarily choose to post on the Site (such as Sender postings, bids and comments on other users), the only information about you that We will post publicly is your Getitdone public profile.
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
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/privacypolicy.scala.html
                    HASH: 63ecfa4ee153281d1ff281e01ace520d3ed1efe2
                    MATRIX: 593->1|783->97|870->149|896->154|993->216|1007->222|1067->261|1158->317|1172->323|1227->357|1318->413|1332->419|1389->455|1486->516|1501->522|1555->554|1616->579|1631->585|1698->630|1876->772|1891->778|1942->807|2260->1089|2295->1101|2510->1280|2557->1311|2597->1313|2659->1339|2701->1372|2741->1374|2838->1435|2850->1438|2875->1441|2915->1445|2927->1448|2954->1453|3008->1489|3021->1494|3060->1495|3137->1536|3149->1539|3174->1542|3214->1546|3226->1549|3253->1554|3316->1585|3370->1607|3519->1720|3547->1739|3587->1741|3698->1834|3711->1839|3750->1840|3816->1870|3832->1877|3847->1883|3857->1917|3882->1933|3922->1935|3979->2006|3997->2015|4037->2017|4103->2047|4132->2054|4172->2058|4201->2065|4240->2101|4298->2127|9985->7777|10001->7783|10058->7817
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|135->117|135->117|135->117
                    -- GENERATED --
                */
            