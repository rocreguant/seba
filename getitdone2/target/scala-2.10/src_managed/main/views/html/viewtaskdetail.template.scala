
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
object viewtaskdetail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,Integer,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(searchstring: String)(searchcategory: Integer)(taskid: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.98*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*6.17*/title)),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/view.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
        <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
        <script>
            var geocoder;
            var map;
            function initialize() """),format.raw/*16.35*/("""{"""),format.raw/*16.36*/("""
            geocoder = new google.maps.Geocoder();
            var latlng = new google.maps.LatLng(48.262, 11.668);
            var mapOptions = """),format.raw/*19.30*/("""{"""),format.raw/*19.31*/("""
            zoom: 8,
            center: latlng
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""
            map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/("""

            function codeAddress() """),format.raw/*26.36*/("""{"""),format.raw/*26.37*/("""
            var address = document.getElementById('address').value;
            geocoder.geocode( """),format.raw/*28.31*/("""{"""),format.raw/*28.32*/(""" 'address': address + ", Deutschland""""),format.raw/*28.69*/("""}"""),format.raw/*28.70*/(""", function(results, status) """),format.raw/*28.98*/("""{"""),format.raw/*28.99*/("""
            if (status == google.maps.GeocoderStatus.OK) """),format.raw/*29.58*/("""{"""),format.raw/*29.59*/("""
            map.setCenter(results[0].geometry.location);
            var marker = new google.maps.Marker("""),format.raw/*31.49*/("""{"""),format.raw/*31.50*/("""
            map: map,
            position: results[0].geometry.location
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/(""");
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""" else """),format.raw/*35.20*/("""{"""),format.raw/*35.21*/("""
            alert('Geocode was not successful for the following reason: ' + status);
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""");
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""

            google.maps.event.addDomListener(window, 'load', initialize);

        </script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*48.40*/routes/*48.46*/.Assets.at("images/logo.png"))),format.raw/*48.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="/searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*54.94*/searchstring)),format.raw/*54.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                        """),_display_(Seq[Any](/*57.26*/for(cat <- Category.find.all()) yield /*57.57*/ {_display_(Seq[Any](format.raw/*57.59*/("""
                            """),_display_(Seq[Any](/*58.30*/if(searchcategory.equals(cat.id))/*58.63*/ {_display_(Seq[Any](format.raw/*58.65*/("""
                                <option selected="selected" value=""""),_display_(Seq[Any](/*59.69*/cat/*59.72*/.id)),format.raw/*59.75*/(""""> """),_display_(Seq[Any](/*59.79*/cat/*59.82*/.name)),format.raw/*59.87*/("""</option>
                            """)))}/*60.31*/else/*60.36*/{_display_(Seq[Any](format.raw/*60.37*/("""
                                <option value=""""),_display_(Seq[Any](/*61.49*/cat/*61.52*/.id)),format.raw/*61.55*/(""""> """),_display_(Seq[Any](/*61.59*/cat/*61.62*/.name)),format.raw/*61.67*/("""</option>
                            """)))})),format.raw/*62.30*/("""
                        """)))})),format.raw/*63.26*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*66.26*/if(session == null)/*66.45*/ {_display_(Seq[Any](format.raw/*66.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*68.27*/else/*68.32*/{_display_(Seq[Any](format.raw/*68.33*/("""
                            """),_display_(Seq[Any](/*69.30*/session/*69.37*/ match/*69.43*/{/*70.33*/case "logout" =>/*70.49*/ {_display_(Seq[Any](format.raw/*70.51*/("""<a href="/login"> Login/Register </a>""")))}/*71.33*/case _ =>/*71.42*/ {_display_(Seq[Any](format.raw/*71.44*/("""<a href="/showfeedback?userid="""),_display_(Seq[Any](/*71.75*/session)),format.raw/*71.82*/(""""> """),_display_(Seq[Any](/*71.86*/session)),format.raw/*71.93*/(""" </a>""")))}})),format.raw/*72.30*/("""
                        """)))})),format.raw/*73.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
        """),_display_(Seq[Any](/*80.10*/defining(Task.findById(taskid))/*80.41*/ { task =>_display_(Seq[Any](format.raw/*80.51*/("""
            <h3><strong>View Task: """),_display_(Seq[Any](/*81.37*/task/*81.41*/.title)),format.raw/*81.47*/("""</strong></h3>
            <div id="viewtask">
                <div class="row">
                    <div class="col-sm-5">
                        <div class="inputform">
                            <label for="title">Title</label>
                            <form>"""),_display_(Seq[Any](/*87.36*/task/*87.40*/.title)),format.raw/*87.46*/("""</form>
                        </div>

                        <div class="inputform">
                            <label for="category">Category</label>
                            <form>"""),_display_(Seq[Any](/*92.36*/task/*92.40*/.category.intValue()/*92.60*/ match/*92.66*/ {/*93.33*/case 0 =>/*93.42*/ {_display_(Seq[Any](format.raw/*93.44*/("""All Categories""")))}/*94.33*/case 1 =>/*94.42*/ {_display_(Seq[Any](format.raw/*94.44*/("""Housework""")))}/*95.33*/case 2 =>/*95.42*/ {_display_(Seq[Any](format.raw/*95.44*/("""Cleaning""")))}/*96.33*/case 3 =>/*96.42*/ {_display_(Seq[Any](format.raw/*96.44*/("""Shopping""")))}/*97.33*/case 4 =>/*97.42*/ {_display_(Seq[Any](format.raw/*97.44*/("""Computer Help""")))}/*98.33*/case 5 =>/*98.42*/ {_display_(Seq[Any](format.raw/*98.44*/("""Design""")))}/*99.33*/case 6 =>/*99.42*/ {_display_(Seq[Any](format.raw/*99.44*/("""Something Else""")))}})),format.raw/*99.60*/("""</form>
                        </div>

                        <div class="inputform">
                            <label for="description">Description</label>
                            <form>"""),_display_(Seq[Any](/*104.36*/task/*104.40*/.description)),format.raw/*104.52*/("""</form>
                        </div>

                        <div class="inputform">
                            <label for="zipcode">Zipcode</label>
                            <form>"""),_display_(Seq[Any](/*109.36*/task/*109.40*/.zipcode)),format.raw/*109.48*/("""</form>
                        </div>

                        <div class="inputform">
                            <label for="price">Reward</label>
                            <form>"""),_display_(Seq[Any](/*114.36*/task/*114.40*/.reward)),format.raw/*114.47*/("""</form>
                        </div>

                        <div class="inputform">
                            <label for="deadline">Deadline</label>
                            <form>"""),_display_(Seq[Any](/*119.36*/if(task.due_date == null)/*119.61*/ {_display_(Seq[Any](format.raw/*119.63*/("""No deadline""")))}/*119.76*/else/*119.81*/{_display_(Seq[Any](_display_(Seq[Any](/*119.83*/task/*119.87*/.due_date))))})),format.raw/*119.97*/("""</form>
                        </div>

                        <div id="panel">
                            <input id="address" type="hidden" type="textbox" onload="codeAddress()" value=""""),_display_(Seq[Any](/*123.109*/task/*123.113*/.zipcode)),format.raw/*123.121*/("""">
                            <script>
                            window.onload = codeAddress;
                            </script>
                        </div>

                        <br>
                        """),_display_(Seq[Any](/*130.26*/if(!task.assigned_to.name.equals(session))/*130.68*/ {_display_(Seq[Any](format.raw/*130.70*/("""
                        <div class="inputform">
                            <form name="input" action="/request" method="POST">
                                <input id="userid" class="depth" type="hidden" name="userid" value="Loremipsum" id= "userid" readonly>
                                <input id="taskid" class="depth" type="hidden" name="taskid" value=""""),_display_(Seq[Any](/*134.102*/taskid)),format.raw/*134.108*/("""" id= "taskid" readonly>
                                <input type="submit" value="Request this task">
                            </form>
                        </div>
                        """)))}/*138.27*/else/*138.32*/{_display_(Seq[Any](format.raw/*138.33*/("""
                            <legend> Pay Reward </legend>
                            <form action="https://www.paypal.com/cgi-bin/webscr" method="post">
                                <input type="hidden" name="cmd" value="_xclick">
                                <input type="hidden" name="business" value="payment&#64;getitdone.net">
                                <input type="hidden" name="item_name" value=""""),_display_(Seq[Any](/*143.79*/task/*143.83*/.title)),format.raw/*143.89*/("""">
                                <input type="hidden" name="item_number" value=""""),_display_(Seq[Any](/*144.81*/task/*144.85*/.task_id)),format.raw/*144.93*/("""">
                                <input type="hidden" name="amount" value=""""),_display_(Seq[Any](/*145.76*/task/*145.80*/.reward)),format.raw/*145.87*/("""">
                                <input type="hidden" name="currency_code" value="EUR">
                                <input type="hidden" name="zip" value=""""),_display_(Seq[Any](/*147.73*/task/*147.77*/.zipcode)),format.raw/*147.85*/("""">
                                <input type="image" name="submit" border="0"
                                src="https://www.paypalobjects.com/webstatic/en_US/developer/docs/ppp/AcceptanceMark_60x38.gif"
                                alt="PayPal - The safer, easier way to pay online">
                            </form>
                            """)))})),format.raw/*152.30*/("""

                    </div>
                    <div class="col-sm-7">
                        <div id="map-canvas"></div>
                    </div>
                </div>
            </div>
        """)))})),format.raw/*160.10*/("""
        </section>
        <footer>
            <div id="line"></div>
            <div id="wrap">
                <div class="left">
                    <h1><a href="/all">Search Tasks</a></h1>
                    <p><a href="/housework">Housework</a></p>
                    <p><a href="/cleaning">Cleaning</a></p>
                    <p><a href="/shopping">Shopping</a></p>
                    <p><a href="/computerhelp">Computer Help</a></p>
                    <p><a href="/design">Design</a></p>
                    <p><a href="/somethingelse">Something Else</a></p>
                </div>
                <div class="center">
                    <h1><a href="/createtasks">Create Task</a></h1>
                </div>
                <div class="center">
                    <h1><a href="/help">Help</a></h1>
                    <p><a href="/faq">FAQ</a></p>
                    <p><a href="/support">Support</a></p>
                    <p><a href="/contactus">Contact Us</a></p>
                </div>
                <div class="right">
                    <h1><a href="/aboutus">About Us</a></h1>
                    <p><a href="/aboutus">About Us</a></p>
                    <p><a href="/useofdata">Use of Data</a></p>
                    <p><a href="/privacypolicy">Privacy Policy</a></p>
                    <p><a href="/imprint">Imprint</a></p>
                    <IMG SRC=""""),_display_(Seq[Any](/*189.32*/routes/*189.38*/.Assets.at("images/soft-logo.png"))),format.raw/*189.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>
"""))}
    }
    
    def render(title:String,searchstring:String,searchcategory:Integer,taskid:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(title)(searchstring)(searchcategory)(taskid)(session)
    
    def f:((String) => (String) => (Integer) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (searchstring) => (searchcategory) => (taskid) => (session) => apply(title)(searchstring)(searchcategory)(taskid)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 14:20:23 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/viewtaskdetail.scala.html
                    HASH: 0a8c71ccc9c4915229781c947d68075f8f97841e
                    MATRIX: 595->1|785->97|872->149|898->154|995->216|1009->222|1069->261|1160->317|1174->323|1229->357|1320->413|1334->419|1389->453|1486->514|1501->520|1555->552|1616->577|1631->583|1698->628|1939->841|1968->842|2142->988|2171->989|2260->1050|2289->1051|2420->1154|2449->1155|2514->1192|2543->1193|2670->1292|2699->1293|2764->1330|2793->1331|2849->1359|2878->1360|2964->1418|2993->1419|3127->1525|3156->1526|3270->1612|3299->1613|3342->1628|3371->1629|3405->1635|3434->1636|3560->1734|3589->1735|3630->1748|3659->1749|3702->1764|3731->1765|3969->1967|3984->1973|4035->2002|4354->2285|4389->2297|4608->2480|4655->2511|4695->2513|4761->2543|4803->2576|4843->2578|4948->2647|4960->2650|4985->2653|5025->2657|5037->2660|5064->2665|5122->2705|5135->2710|5174->2711|5259->2760|5271->2763|5296->2766|5336->2770|5348->2773|5375->2778|5446->2817|5504->2843|5653->2956|5681->2975|5721->2977|5832->3070|5845->3075|5884->3076|5950->3106|5966->3113|5981->3119|5991->3153|6016->3169|6056->3171|6113->3242|6131->3251|6171->3253|6238->3284|6267->3291|6307->3295|6336->3302|6375->3338|6433->3364|6597->3492|6637->3523|6685->3533|6758->3570|6771->3574|6799->3580|7103->3848|7116->3852|7144->3858|7370->4048|7383->4052|7412->4072|7427->4078|7438->4113|7456->4122|7496->4124|7530->4172|7548->4181|7588->4183|7617->4226|7635->4235|7675->4237|7703->4279|7721->4288|7761->4290|7789->4332|7807->4341|7847->4343|7880->4390|7898->4399|7938->4401|7964->4441|7982->4450|8022->4452|8070->4468|8303->4664|8317->4668|8352->4680|8577->4868|8591->4872|8622->4880|8844->5065|8858->5069|8888->5076|9115->5266|9150->5291|9191->5293|9223->5306|9237->5311|9286->5313|9300->5317|9337->5327|9564->5516|9579->5520|9611->5528|9869->5749|9921->5791|9962->5793|10365->6158|10395->6164|10612->6362|10626->6367|10666->6368|11121->6786|11135->6790|11164->6796|11284->6879|11298->6883|11329->6891|11444->6969|11458->6973|11488->6980|11687->7142|11701->7146|11732->7154|12122->7511|12357->7713|13783->9102|13799->9108|13856->9142
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|40->19|40->19|43->22|43->22|45->24|45->24|47->26|47->26|49->28|49->28|49->28|49->28|49->28|49->28|50->29|50->29|52->31|52->31|55->34|55->34|56->35|56->35|56->35|56->35|58->37|58->37|59->38|59->38|60->39|60->39|69->48|69->48|69->48|75->54|75->54|78->57|78->57|78->57|79->58|79->58|79->58|80->59|80->59|80->59|80->59|80->59|80->59|81->60|81->60|81->60|82->61|82->61|82->61|82->61|82->61|82->61|83->62|84->63|87->66|87->66|87->66|89->68|89->68|89->68|90->69|90->69|90->69|90->70|90->70|90->70|90->71|90->71|90->71|90->71|90->71|90->71|90->71|90->72|91->73|98->80|98->80|98->80|99->81|99->81|99->81|105->87|105->87|105->87|110->92|110->92|110->92|110->92|110->93|110->93|110->93|110->94|110->94|110->94|110->95|110->95|110->95|110->96|110->96|110->96|110->97|110->97|110->97|110->98|110->98|110->98|110->99|110->99|110->99|110->99|115->104|115->104|115->104|120->109|120->109|120->109|125->114|125->114|125->114|130->119|130->119|130->119|130->119|130->119|130->119|130->119|130->119|134->123|134->123|134->123|141->130|141->130|141->130|145->134|145->134|149->138|149->138|149->138|154->143|154->143|154->143|155->144|155->144|155->144|156->145|156->145|156->145|158->147|158->147|158->147|163->152|171->160|200->189|200->189|200->189
                    -- GENERATED --
                */
            