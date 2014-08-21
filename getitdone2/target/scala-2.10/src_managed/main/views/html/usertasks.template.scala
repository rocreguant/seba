
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
object usertasks extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(done: String)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""
<!DOCTYPE html>

<html>
    <head>
    	<title>View 
        """),_display_(Seq[Any](/*7.10*/if(done.equals("true"))/*7.33*/ {_display_(Seq[Any](format.raw/*7.35*/("""
        	completed
        """)))}/*9.11*/else/*9.16*/{_display_(Seq[Any](format.raw/*9.17*/("""
        	uncompleted
        """)))})),format.raw/*11.10*/("""
        tasks of """),_display_(Seq[Any](/*12.19*/username)),format.raw/*12.27*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*13.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css"))),format.raw/*14.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("stylesheets/search.css"))),format.raw/*15.96*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*16.59*/routes/*16.65*/.Assets.at("images/favicon.png"))),format.raw/*16.97*/("""">
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*17.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*22.40*/routes/*22.46*/.Assets.at("images/logo.png"))),format.raw/*22.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value="">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                        """),_display_(Seq[Any](/*31.26*/for(cat <- Category.find.all()) yield /*31.57*/ {_display_(Seq[Any](format.raw/*31.59*/("""
                                <option value=""""),_display_(Seq[Any](/*32.49*/cat/*32.52*/.id)),format.raw/*32.55*/(""""> """),_display_(Seq[Any](/*32.59*/cat/*32.62*/.name)),format.raw/*32.67*/("""</option>
						""")))})),format.raw/*33.8*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*36.26*/if(session == null)/*36.45*/ {_display_(Seq[Any](format.raw/*36.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*38.27*/else/*38.32*/{_display_(Seq[Any](format.raw/*38.33*/("""
                            """),_display_(Seq[Any](/*39.30*/session/*39.37*/ match/*39.43*/{/*40.33*/case "logout" =>/*40.49*/ {_display_(Seq[Any](format.raw/*40.51*/("""<a href="/login"> Login/Register </a>""")))}/*41.33*/case _ =>/*41.42*/ {_display_(Seq[Any](format.raw/*41.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*41.74*/session)),format.raw/*41.81*/(""""> """),_display_(Seq[Any](/*41.85*/session)),format.raw/*41.92*/(""" </a>""")))}})),format.raw/*42.30*/("""
                        """)))})),format.raw/*43.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
            <h3><strong>My Tasks</strong></h3>
            <div style="background-color: #CCCCCC; padding: 1em; height: 100px; width: 100%;"> Placeholder for ads </div>
            <br>
            <legend><h3><strong>Finished Tasks</strong></h3></legend>
                    """),_display_(Seq[Any](/*54.22*/for(item <- Task.findTasksInvolvingUser(session)) yield /*54.71*/ {_display_(Seq[Any](format.raw/*54.73*/("""
                        """),_display_(Seq[Any](/*55.26*/if(item.done)/*55.39*/ {_display_(Seq[Any](format.raw/*55.41*/("""
                            <a href="viewtaskdetail/"""),_display_(Seq[Any](/*56.54*/item/*56.58*/.task_id)),format.raw/*56.66*/("""">
                            <div class="row" id="task">
                                <div class="col-sm-2" id="left3">
                                    """),_display_(Seq[Any](/*59.38*/item/*59.42*/.category.intValue()/*59.62*/ match/*59.68*/{/*60.33*/case 1 =>/*60.42*/ {_display_(Seq[Any](format.raw/*60.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*60.55*/routes/*60.61*/.Assets.at("images/houseworksmall.png"))),format.raw/*60.100*/("""">""")))}/*61.33*/case 2 =>/*61.42*/ {_display_(Seq[Any](format.raw/*61.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*61.55*/routes/*61.61*/.Assets.at("images/cleaningsmall.png"))),format.raw/*61.99*/("""">""")))}/*62.33*/case 3 =>/*62.42*/ {_display_(Seq[Any](format.raw/*62.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*62.55*/routes/*62.61*/.Assets.at("images/shoppingsmall.png"))),format.raw/*62.99*/("""">""")))}/*63.33*/case 4 =>/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*63.55*/routes/*63.61*/.Assets.at("images/computerhelpsmall.png"))),format.raw/*63.103*/("""">""")))}/*64.33*/case 5 =>/*64.42*/ {_display_(Seq[Any](format.raw/*64.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*64.55*/routes/*64.61*/.Assets.at("images/designsmall.png"))),format.raw/*64.97*/("""">""")))}/*65.33*/case 6 =>/*65.42*/ {_display_(Seq[Any](format.raw/*65.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*65.55*/routes/*65.61*/.Assets.at("images/somethingelsesmall.png"))),format.raw/*65.104*/("""">""")))}})),format.raw/*66.38*/("""
                                </div>
                                <div class="col-sm-10" id="right3">
                                    <h3>"""),_display_(Seq[Any](/*69.42*/item/*69.46*/.title)),format.raw/*69.52*/("""</h3><h4><strong>Description: </strong>"""),_display_(Seq[Any](/*69.92*/item/*69.96*/.description)),format.raw/*69.108*/("""</h4><h4><strong>Reward: </strong>"""),_display_(Seq[Any](/*69.143*/item/*69.147*/.reward)),format.raw/*69.154*/("""</h4>
                                </div>
                                <div class="clearBoth"></div>
                            </div>
                             </a>
                        """)))})),format.raw/*74.26*/("""
                    """)))})),format.raw/*75.22*/("""
            <br>
            <legend><h3><strong>Not yet finished Tasks</strong></h3></legend>
                    """),_display_(Seq[Any](/*78.22*/for(item <- Task.findTasksInvolvingUser(session)) yield /*78.71*/ {_display_(Seq[Any](format.raw/*78.73*/("""
                        """),_display_(Seq[Any](/*79.26*/if(!item.done)/*79.40*/ {_display_(Seq[Any](format.raw/*79.42*/("""
                            <a href="viewtaskdetail/"""),_display_(Seq[Any](/*80.54*/item/*80.58*/.task_id)),format.raw/*80.66*/("""">
                            <div class="row" id="task">
                                <div class="col-sm-2" id="left3">
                                    """),_display_(Seq[Any](/*83.38*/item/*83.42*/.category.intValue()/*83.62*/ match/*83.68*/{/*84.33*/case 1 =>/*84.42*/ {_display_(Seq[Any](format.raw/*84.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*84.55*/routes/*84.61*/.Assets.at("images/houseworksmall.png"))),format.raw/*84.100*/("""">""")))}/*85.33*/case 2 =>/*85.42*/ {_display_(Seq[Any](format.raw/*85.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*85.55*/routes/*85.61*/.Assets.at("images/cleaningsmall.png"))),format.raw/*85.99*/("""">""")))}/*86.33*/case 3 =>/*86.42*/ {_display_(Seq[Any](format.raw/*86.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*86.55*/routes/*86.61*/.Assets.at("images/shoppingsmall.png"))),format.raw/*86.99*/("""">""")))}/*87.33*/case 4 =>/*87.42*/ {_display_(Seq[Any](format.raw/*87.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*87.55*/routes/*87.61*/.Assets.at("images/computerhelpsmall.png"))),format.raw/*87.103*/("""">""")))}/*88.33*/case 5 =>/*88.42*/ {_display_(Seq[Any](format.raw/*88.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*88.55*/routes/*88.61*/.Assets.at("images/designsmall.png"))),format.raw/*88.97*/("""">""")))}/*89.33*/case 6 =>/*89.42*/ {_display_(Seq[Any](format.raw/*89.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*89.55*/routes/*89.61*/.Assets.at("images/somethingelsesmall.png"))),format.raw/*89.104*/("""">""")))}})),format.raw/*90.38*/("""
                                </div>
                                <div class="col-sm-10" id="right3">
                                    <h3>"""),_display_(Seq[Any](/*93.42*/item/*93.46*/.title)),format.raw/*93.52*/("""</h3><h4><strong>Description: </strong>"""),_display_(Seq[Any](/*93.92*/item/*93.96*/.description)),format.raw/*93.108*/("""</h4><h4><strong>Reward: </strong>"""),_display_(Seq[Any](/*93.143*/item/*93.147*/.reward)),format.raw/*93.154*/("""</h4>
                                </div>
                                <div class="clearBoth"></div>
                            </div>
                            </a>
                        """)))})),format.raw/*98.26*/("""
                    """)))})),format.raw/*99.22*/("""
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
                    <IMG SRC=""""),_display_(Seq[Any](/*128.32*/routes/*128.38*/.Assets.at("images/soft-logo.png"))),format.raw/*128.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(username:String,done:String,session:String): play.api.templates.HtmlFormat.Appendable = apply(username)(done)(session)
    
    def f:((String) => (String) => (String) => play.api.templates.HtmlFormat.Appendable) = (username) => (done) => (session) => apply(username)(done)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 14:20:21 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/usertasks.scala.html
                    HASH: f34ca8a7eca6b8ca2f9efa79c3193033b915fae7
                    MATRIX: 574->1|717->50|815->113|846->136|885->138|932->168|944->173|982->174|1045->205|1100->224|1130->232|1228->294|1243->300|1304->339|1396->395|1411->401|1467->435|1559->491|1574->497|1632->533|1729->594|1744->600|1798->632|1859->657|1874->663|1941->708|2119->850|2134->856|2185->885|2685->1349|2732->1380|2772->1382|2857->1431|2869->1434|2894->1437|2934->1441|2946->1444|2973->1449|3021->1466|3170->1579|3198->1598|3238->1600|3349->1693|3362->1698|3401->1699|3467->1729|3483->1736|3498->1742|3508->1776|3533->1792|3573->1794|3630->1865|3648->1874|3688->1876|3754->1906|3783->1913|3823->1917|3852->1924|3891->1960|3949->1986|4381->2382|4446->2431|4486->2433|4548->2459|4570->2472|4610->2474|4700->2528|4713->2532|4743->2540|4941->2702|4954->2706|4983->2726|4998->2732|5008->2766|5026->2775|5066->2777|5113->2788|5128->2794|5190->2833|5212->2869|5230->2878|5270->2880|5317->2891|5332->2897|5392->2935|5414->2971|5432->2980|5472->2982|5519->2993|5534->2999|5594->3037|5616->3073|5634->3082|5674->3084|5721->3095|5736->3101|5801->3143|5823->3179|5841->3188|5881->3190|5928->3201|5943->3207|6001->3243|6023->3279|6041->3288|6081->3290|6128->3301|6143->3307|6209->3350|6245->3391|6430->3540|6443->3544|6471->3550|6547->3590|6560->3594|6595->3606|6667->3641|6681->3645|6711->3652|6944->3853|6998->3875|7151->3992|7216->4041|7256->4043|7318->4069|7341->4083|7381->4085|7471->4139|7484->4143|7514->4151|7712->4313|7725->4317|7754->4337|7769->4343|7779->4377|7797->4386|7837->4388|7884->4399|7899->4405|7961->4444|7983->4480|8001->4489|8041->4491|8088->4502|8103->4508|8163->4546|8185->4582|8203->4591|8243->4593|8290->4604|8305->4610|8365->4648|8387->4684|8405->4693|8445->4695|8492->4706|8507->4712|8572->4754|8594->4790|8612->4799|8652->4801|8699->4812|8714->4818|8772->4854|8794->4890|8812->4899|8852->4901|8899->4912|8914->4918|8980->4961|9016->5002|9201->5151|9214->5155|9242->5161|9318->5201|9331->5205|9366->5217|9438->5252|9452->5256|9482->5263|9714->5463|9768->5485|11177->6857|11193->6863|11250->6897
                    LINES: 19->1|22->1|28->7|28->7|28->7|30->9|30->9|30->9|32->11|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|43->22|43->22|43->22|52->31|52->31|52->31|53->32|53->32|53->32|53->32|53->32|53->32|54->33|57->36|57->36|57->36|59->38|59->38|59->38|60->39|60->39|60->39|60->40|60->40|60->40|60->41|60->41|60->41|60->41|60->41|60->41|60->41|60->42|61->43|72->54|72->54|72->54|73->55|73->55|73->55|74->56|74->56|74->56|77->59|77->59|77->59|77->59|77->60|77->60|77->60|77->60|77->60|77->60|77->61|77->61|77->61|77->61|77->61|77->61|77->62|77->62|77->62|77->62|77->62|77->62|77->63|77->63|77->63|77->63|77->63|77->63|77->64|77->64|77->64|77->64|77->64|77->64|77->65|77->65|77->65|77->65|77->65|77->65|77->66|80->69|80->69|80->69|80->69|80->69|80->69|80->69|80->69|80->69|85->74|86->75|89->78|89->78|89->78|90->79|90->79|90->79|91->80|91->80|91->80|94->83|94->83|94->83|94->83|94->84|94->84|94->84|94->84|94->84|94->84|94->85|94->85|94->85|94->85|94->85|94->85|94->86|94->86|94->86|94->86|94->86|94->86|94->87|94->87|94->87|94->87|94->87|94->87|94->88|94->88|94->88|94->88|94->88|94->88|94->89|94->89|94->89|94->89|94->89|94->89|94->90|97->93|97->93|97->93|97->93|97->93|97->93|97->93|97->93|97->93|102->98|103->99|132->128|132->128|132->128
                    -- GENERATED --
                */
            