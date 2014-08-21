
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
object searchtasks extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.66*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>Search for tasks</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/search.css"))),format.raw/*9.96*/("""">
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
            <div id="searchbar" align="right">
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
            <h3><strong>Search Tasks</strong></h3>
            <div class="row">
            <div class="col-sm-2" id="categorybar">
                <h5> <a href="housework">Housework</a></h5>
                <h5> <a href="cleaning">Cleaning</a></h5>
                <h5> <a href="shopping">Shopping</a></h5>
                <h5> <a href="computerhelp">Computer Help</a></h5>
                <h5> <a href="design">Design</a></h5>
                <h5> <a href="somethingelse">Something Else</a></h5>
            </div>
            <div class="col-sm-10">

               <h3>
                   Results

                   """),_display_(Seq[Any](/*63.21*/if(searchstring.isEmpty())/*63.47*/{_display_(Seq[Any](format.raw/*63.48*/("""
                   in
                   """)))}/*65.22*/else/*65.27*/{_display_(Seq[Any](format.raw/*65.28*/("""
                   for """"),_display_(Seq[Any](/*66.26*/searchstring)),format.raw/*66.38*/("""" in
                   """)))})),format.raw/*67.21*/("""

                   """),_display_(Seq[Any](/*69.21*/searchcategory/*69.35*/.intValue()/*69.46*/ match/*69.52*/ {/*70.24*/case 0 =>/*70.33*/ {_display_(Seq[Any](format.raw/*70.35*/("""All Categories""")))}/*71.24*/case 1 =>/*71.33*/ {_display_(Seq[Any](format.raw/*71.35*/("""Housework""")))}/*72.24*/case 2 =>/*72.33*/ {_display_(Seq[Any](format.raw/*72.35*/("""Cleaning""")))}/*73.24*/case 3 =>/*73.33*/ {_display_(Seq[Any](format.raw/*73.35*/("""Shopping""")))}/*74.24*/case 4 =>/*74.33*/ {_display_(Seq[Any](format.raw/*74.35*/("""Computer Help""")))}/*75.24*/case 5 =>/*75.33*/ {_display_(Seq[Any](format.raw/*75.35*/("""Design""")))}/*76.24*/case 6 =>/*76.33*/ {_display_(Seq[Any](format.raw/*76.35*/("""Something Else""")))}})),format.raw/*77.17*/(""":
               </h3>

                """),_display_(Seq[Any](/*80.18*/if(searchstring.isEmpty())/*80.44*/{_display_(Seq[Any](format.raw/*80.45*/("""
                   """),_display_(Seq[Any](/*81.21*/if(searchcategory.intValue() == 0)/*81.55*/{_display_(Seq[Any](format.raw/*81.56*/("""
                       """),_display_(Seq[Any](/*82.25*/for(item <- Task.find.all()) yield /*82.53*/ {_display_(Seq[Any](format.raw/*82.55*/("""
                           """),_display_(Seq[Any](/*83.29*/if(!item.done)/*83.43*/ {_display_(Seq[Any](format.raw/*83.45*/("""
                           <a href="viewtaskdetail/"""),_display_(Seq[Any](/*84.53*/item/*84.57*/.task_id)),format.raw/*84.65*/("""">
                           <div class="row" id="task">
                               <div class="col-sm-2" id="left3">
                               """),_display_(Seq[Any](/*87.33*/item/*87.37*/.category/*87.46*/ match/*87.52*/{/*88.36*/case 1 =>/*88.45*/ {_display_(Seq[Any](format.raw/*88.47*/("""<IMG SRC=""""),_display_(Seq[Any](/*88.58*/routes/*88.64*/.Assets.at("images/houseworksmall.png"))),format.raw/*88.103*/("""">""")))}/*89.36*/case 2 =>/*89.45*/ {_display_(Seq[Any](format.raw/*89.47*/("""<IMG SRC=""""),_display_(Seq[Any](/*89.58*/routes/*89.64*/.Assets.at("images/cleaningsmall.png"))),format.raw/*89.102*/("""">""")))}/*90.36*/case 3 =>/*90.45*/ {_display_(Seq[Any](format.raw/*90.47*/("""<IMG SRC=""""),_display_(Seq[Any](/*90.58*/routes/*90.64*/.Assets.at("images/shoppingsmall.png"))),format.raw/*90.102*/("""">""")))}/*91.36*/case 4 =>/*91.45*/ {_display_(Seq[Any](format.raw/*91.47*/("""<IMG SRC=""""),_display_(Seq[Any](/*91.58*/routes/*91.64*/.Assets.at("images/computerhelpsmall.png"))),format.raw/*91.106*/("""">""")))}/*92.36*/case 5 =>/*92.45*/ {_display_(Seq[Any](format.raw/*92.47*/("""<IMG SRC=""""),_display_(Seq[Any](/*92.58*/routes/*92.64*/.Assets.at("images/designsmall.png"))),format.raw/*92.100*/("""">""")))}/*93.36*/case 6 =>/*93.45*/ {_display_(Seq[Any](format.raw/*93.47*/("""<IMG SRC=""""),_display_(Seq[Any](/*93.58*/routes/*93.64*/.Assets.at("images/somethingelsesmall.png"))),format.raw/*93.107*/("""">""")))}})),format.raw/*94.33*/("""
                               </div>
                               <div class="col-sm-10" id="right3">
                                   <h3>"""),_display_(Seq[Any](/*97.41*/item/*97.45*/.title)),format.raw/*97.51*/("""</h3><h4><strong>Description: </strong>"""),_display_(Seq[Any](/*97.91*/item/*97.95*/.description)),format.raw/*97.107*/("""</h4><h4><strong>Reward: </strong>"""),_display_(Seq[Any](/*97.142*/item/*97.146*/.reward)),format.raw/*97.153*/("""</h4>
                               </div>
                               <div class="clearBoth"></div>
                           </div>
                           </a>
                           """)))})),format.raw/*102.29*/("""
                       """)))})),format.raw/*103.25*/("""
                   """)))}/*104.22*/else/*104.27*/{_display_(Seq[Any](format.raw/*104.28*/("""
                    """),_display_(Seq[Any](/*105.22*/for(item <- Task.findByCategory(searchcategory.intValue())) yield /*105.81*/ {_display_(Seq[Any](format.raw/*105.83*/("""
                        """),_display_(Seq[Any](/*106.26*/if(!item.done)/*106.40*/ {_display_(Seq[Any](format.raw/*106.42*/("""
                        <a href="viewtaskdetail/"""),_display_(Seq[Any](/*107.50*/item/*107.54*/.task_id)),format.raw/*107.62*/("""">
                        <div class="row" id="task">
                            <div class="col-sm-2" id="left3">
                            """),_display_(Seq[Any](/*110.30*/searchcategory/*110.44*/.intValue()/*110.55*/ match/*110.61*/{/*111.29*/case 1 =>/*111.38*/ {_display_(Seq[Any](format.raw/*111.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*111.51*/routes/*111.57*/.Assets.at("images/houseworksmall.png"))),format.raw/*111.96*/("""">""")))}/*112.29*/case 2 =>/*112.38*/ {_display_(Seq[Any](format.raw/*112.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*112.51*/routes/*112.57*/.Assets.at("images/cleaningsmall.png"))),format.raw/*112.95*/("""">""")))}/*113.29*/case 3 =>/*113.38*/ {_display_(Seq[Any](format.raw/*113.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*113.51*/routes/*113.57*/.Assets.at("images/shoppingsmall.png"))),format.raw/*113.95*/("""">""")))}/*114.29*/case 4 =>/*114.38*/ {_display_(Seq[Any](format.raw/*114.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*114.51*/routes/*114.57*/.Assets.at("images/computerhelpsmall.png"))),format.raw/*114.99*/("""">""")))}/*115.29*/case 5 =>/*115.38*/ {_display_(Seq[Any](format.raw/*115.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*115.51*/routes/*115.57*/.Assets.at("images/designsmall.png"))),format.raw/*115.93*/("""">""")))}/*116.29*/case 6 =>/*116.38*/ {_display_(Seq[Any](format.raw/*116.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*116.51*/routes/*116.57*/.Assets.at("images/somethingelsesmall.png"))),format.raw/*116.100*/("""">""")))}})),format.raw/*117.30*/("""
                            </div>
                            <div class="col-sm-10" id="right3">
                                <h3>"""),_display_(Seq[Any](/*120.38*/item/*120.42*/.title)),format.raw/*120.48*/("""</h3><h4><strong>Description: </strong>"""),_display_(Seq[Any](/*120.88*/item/*120.92*/.description)),format.raw/*120.104*/("""</h4><h4><strong>Reward: </strong>"""),_display_(Seq[Any](/*120.139*/item/*120.143*/.reward)),format.raw/*120.150*/("""</h4>
                            </div>
                            <div class="clearBoth"></div>
                        </div>
                        </a>
                        """)))})),format.raw/*125.26*/("""
                    """)))})),format.raw/*126.22*/("""
                    """)))})),format.raw/*127.22*/("""
                    """),format.raw/*128.59*/("""
                    """)))}/*129.22*/else/*129.26*/{_display_(Seq[Any](format.raw/*129.27*/("""
                    """),_display_(Seq[Any](/*130.22*/if(searchcategory.intValue() == 0)/*130.56*/{_display_(Seq[Any](format.raw/*130.57*/("""
                    """),_display_(Seq[Any](/*131.22*/for(item <- Task.findByTitle(searchstring)) yield /*131.65*/ {_display_(Seq[Any](format.raw/*131.67*/("""
                        """),_display_(Seq[Any](/*132.26*/if(!item.done)/*132.40*/ {_display_(Seq[Any](format.raw/*132.42*/("""
                        <a href="viewtaskdetail/"""),_display_(Seq[Any](/*133.50*/item/*133.54*/.task_id)),format.raw/*133.62*/("""">
                        <div class="row" id="task">
                            <div class="col-sm-2" id="left3">
                            """),_display_(Seq[Any](/*136.30*/item/*136.34*/.category.intValue()/*136.54*/ match/*136.60*/{/*137.29*/case 1 =>/*137.38*/ {_display_(Seq[Any](format.raw/*137.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*137.51*/routes/*137.57*/.Assets.at("images/houseworksmall.png"))),format.raw/*137.96*/("""">""")))}/*138.29*/case 2 =>/*138.38*/ {_display_(Seq[Any](format.raw/*138.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*138.51*/routes/*138.57*/.Assets.at("images/cleaningsmall.png"))),format.raw/*138.95*/("""">""")))}/*139.29*/case 3 =>/*139.38*/ {_display_(Seq[Any](format.raw/*139.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*139.51*/routes/*139.57*/.Assets.at("images/shoppingsmall.png"))),format.raw/*139.95*/("""">""")))}/*140.29*/case 4 =>/*140.38*/ {_display_(Seq[Any](format.raw/*140.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*140.51*/routes/*140.57*/.Assets.at("images/computerhelpsmall.png"))),format.raw/*140.99*/("""">""")))}/*141.29*/case 5 =>/*141.38*/ {_display_(Seq[Any](format.raw/*141.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*141.51*/routes/*141.57*/.Assets.at("images/designsmall.png"))),format.raw/*141.93*/("""">""")))}/*142.29*/case 6 =>/*142.38*/ {_display_(Seq[Any](format.raw/*142.40*/("""<IMG SRC=""""),_display_(Seq[Any](/*142.51*/routes/*142.57*/.Assets.at("images/somethingelsesmall.png"))),format.raw/*142.100*/("""">""")))}})),format.raw/*143.30*/("""
                            </div>
                            <div class="col-sm-10" id="right3">
                                <h3>"""),_display_(Seq[Any](/*146.38*/item/*146.42*/.title)),format.raw/*146.48*/("""</h3><h4><strong>Description: </strong>"""),_display_(Seq[Any](/*146.88*/item/*146.92*/.description)),format.raw/*146.104*/("""</h4><h4><strong>Reward: </strong>"""),_display_(Seq[Any](/*146.139*/item/*146.143*/.reward)),format.raw/*146.150*/("""</h4>
                            </div>
                            <div class="clearBoth"></div>
                        </div>
                        </a>
                        """)))})),format.raw/*151.26*/("""
                    """)))})),format.raw/*152.22*/("""
                    """)))}/*153.22*/else/*153.27*/{_display_(Seq[Any](format.raw/*153.28*/("""
                        """),_display_(Seq[Any](/*154.26*/for(item <- Task.findByTitleAndCategory(searchstring, searchcategory)) yield /*154.96*/ {_display_(Seq[Any](format.raw/*154.98*/("""
                            """),_display_(Seq[Any](/*155.30*/if(!item.done)/*155.44*/ {_display_(Seq[Any](format.raw/*155.46*/("""
                            <a href="viewtaskdetail/"""),_display_(Seq[Any](/*156.54*/item/*156.58*/.task_id)),format.raw/*156.66*/("""">
                            <div class="row" id="task">
                                <div class="col-sm-2" id="left3">
                                """),_display_(Seq[Any](/*159.34*/item/*159.38*/.category.intValue()/*159.58*/ match/*159.64*/{/*160.33*/case 1 =>/*160.42*/ {_display_(Seq[Any](format.raw/*160.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*160.55*/routes/*160.61*/.Assets.at("images/houseworksmall.png"))),format.raw/*160.100*/("""">""")))}/*161.33*/case 2 =>/*161.42*/ {_display_(Seq[Any](format.raw/*161.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*161.55*/routes/*161.61*/.Assets.at("images/cleaningsmall.png"))),format.raw/*161.99*/("""">""")))}/*162.33*/case 3 =>/*162.42*/ {_display_(Seq[Any](format.raw/*162.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*162.55*/routes/*162.61*/.Assets.at("images/shoppingsmall.png"))),format.raw/*162.99*/("""">""")))}/*163.33*/case 4 =>/*163.42*/ {_display_(Seq[Any](format.raw/*163.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*163.55*/routes/*163.61*/.Assets.at("images/computerhelpsmall.png"))),format.raw/*163.103*/("""">""")))}/*164.33*/case 5 =>/*164.42*/ {_display_(Seq[Any](format.raw/*164.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*164.55*/routes/*164.61*/.Assets.at("images/designsmall.png"))),format.raw/*164.97*/("""">""")))}/*165.33*/case 6 =>/*165.42*/ {_display_(Seq[Any](format.raw/*165.44*/("""<IMG SRC=""""),_display_(Seq[Any](/*165.55*/routes/*165.61*/.Assets.at("images/somethingelsesmall.png"))),format.raw/*165.104*/("""">""")))}})),format.raw/*166.38*/("""
                                </div>
                                <div class="col-sm-10" id="right3">
                                    <h3>"""),_display_(Seq[Any](/*169.42*/item/*169.46*/.title)),format.raw/*169.52*/("""</h3><h4><strong>Description: </strong>"""),_display_(Seq[Any](/*169.92*/item/*169.96*/.description)),format.raw/*169.108*/("""</h4><h4><strong>Reward: </strong>"""),_display_(Seq[Any](/*169.143*/item/*169.147*/.reward)),format.raw/*169.154*/("""</h4>
                                </div>
                                <div class="clearBoth"></div>
                            </div>
                                </a>
                            """)))})),format.raw/*174.30*/("""
                        """)))})),format.raw/*175.26*/("""
                    """)))})),format.raw/*176.22*/("""
                """)))})),format.raw/*177.18*/("""

            </div>
            </div>
        </section>
        <footer>
            <div id="line"></div>
            <div id="wrap">
            <div id="row">
                <div class="col-xs-3">
                    <div class="footercol">
                        <h1><a href="all">Search Tasks</a></h1>
                        <p><a href="housework">Housework</a></p>
                        <p><a href="cleaning">Cleaning</a></p>
                        <p><a href="shopping">Shopping</a></p>
                        <p><a href="computerhelp">Computer Help</a></p>
                        <p><a href="design">Design</a></p>
                        <p><a href="somethingelse">Something Else</a></p>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="footercol">
                        <h1><a href="createtasks">Create Task</a></h1>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="footercol">
                        <h1><a href="help">Help</a></h1>
                        <p><a href="faq">FAQ</a></p>
                        <p><a href="support">Support</a></p>
                        <p><a href="contactus">Contact Us</a></p>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="footercol">
                        <h1 class=""><a href="aboutus">About Us</a></h1>
                        <p><a href="aboutus">About Us</a></p>
                        <p><a href="useofdata">Use of Data</a></p>
                        <p><a href="privacypolicy">Privacy Policy</a></p>
                        <p><a href="imprint">Imprint</a></p>
                        <IMG SRC=""""),_display_(Seq[Any](/*217.36*/routes/*217.42*/.Assets.at("images/soft-logo.png"))),format.raw/*217.76*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
            </div>
                <div class="clearBoth">
                </div>
            </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(searchstring)(searchcategory)(session)
    
    def f:((String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (searchstring) => (searchcategory) => (session) => apply(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 14:20:23 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/searchtasks.scala.html
                    HASH: 3b442ae406169d4383bbb9d3e6f0d38d81733926
                    MATRIX: 577->1|735->65|899->194|913->200|973->239|1064->295|1078->301|1133->335|1224->391|1238->397|1295->433|1392->494|1407->500|1461->532|1522->557|1537->563|1604->608|1782->750|1797->756|1848->785|2180->1081|2215->1093|2434->1276|2481->1307|2521->1309|2587->1339|2629->1372|2669->1374|2774->1443|2786->1446|2811->1449|2851->1453|2863->1456|2890->1461|2948->1501|2961->1506|3000->1507|3085->1556|3097->1559|3122->1562|3162->1566|3174->1569|3201->1574|3272->1613|3330->1639|3479->1752|3507->1771|3547->1773|3658->1866|3671->1871|3710->1872|3776->1902|3792->1909|3807->1915|3817->1949|3842->1965|3882->1967|3939->2038|3957->2047|3997->2049|4063->2079|4092->2086|4132->2090|4161->2097|4200->2133|4258->2159|5036->2901|5071->2927|5110->2928|5172->2972|5185->2977|5224->2978|5286->3004|5320->3016|5377->3041|5435->3063|5458->3077|5478->3088|5493->3094|5504->3120|5522->3129|5562->3131|5596->3170|5614->3179|5654->3181|5683->3215|5701->3224|5741->3226|5769->3259|5787->3268|5827->3270|5855->3303|5873->3312|5913->3314|5946->3352|5964->3361|6004->3363|6030->3394|6048->3403|6088->3405|6136->3437|6213->3478|6248->3504|6287->3505|6344->3526|6387->3560|6426->3561|6487->3586|6531->3614|6571->3616|6636->3645|6659->3659|6699->3661|6788->3714|6801->3718|6831->3726|7022->3881|7035->3885|7053->3894|7068->3900|7078->3937|7096->3946|7136->3948|7183->3959|7198->3965|7260->4004|7282->4043|7300->4052|7340->4054|7387->4065|7402->4071|7463->4109|7485->4148|7503->4157|7543->4159|7590->4170|7605->4176|7666->4214|7688->4253|7706->4262|7746->4264|7793->4275|7808->4281|7873->4323|7895->4362|7913->4371|7953->4373|8000->4384|8015->4390|8074->4426|8096->4465|8114->4474|8154->4476|8201->4487|8216->4493|8282->4536|8318->4572|8500->4718|8513->4722|8541->4728|8617->4768|8630->4772|8665->4784|8737->4819|8751->4823|8781->4830|9013->5029|9071->5054|9112->5076|9126->5081|9166->5082|9225->5104|9301->5163|9342->5165|9405->5191|9429->5205|9470->5207|9557->5257|9571->5261|9602->5269|9785->5415|9809->5429|9830->5440|9846->5446|9857->5476|9876->5485|9917->5487|9965->5498|9981->5504|10043->5543|10066->5575|10085->5584|10126->5586|10174->5597|10190->5603|10251->5641|10274->5673|10293->5682|10334->5684|10382->5695|10398->5701|10459->5739|10482->5771|10501->5780|10542->5782|10590->5793|10606->5799|10671->5841|10694->5873|10713->5882|10754->5884|10802->5895|10818->5901|10877->5937|10900->5969|10919->5978|10960->5980|11008->5991|11024->5997|11091->6040|11128->6073|11302->6210|11316->6214|11345->6220|11422->6260|11436->6264|11472->6276|11545->6311|11560->6315|11591->6322|11808->6506|11863->6528|11918->6550|11968->6609|12010->6631|12024->6635|12064->6636|12123->6658|12167->6692|12207->6693|12266->6715|12326->6758|12367->6760|12430->6786|12454->6800|12495->6802|12582->6852|12596->6856|12627->6864|12810->7010|12824->7014|12854->7034|12870->7040|12881->7070|12900->7079|12941->7081|12989->7092|13005->7098|13067->7137|13090->7169|13109->7178|13150->7180|13198->7191|13214->7197|13275->7235|13298->7267|13317->7276|13358->7278|13406->7289|13422->7295|13483->7333|13506->7365|13525->7374|13566->7376|13614->7387|13630->7393|13695->7435|13718->7467|13737->7476|13778->7478|13826->7489|13842->7495|13901->7531|13924->7563|13943->7572|13984->7574|14032->7585|14048->7591|14115->7634|14152->7667|14326->7804|14340->7808|14369->7814|14446->7854|14460->7858|14496->7870|14569->7905|14584->7909|14615->7916|14832->8100|14887->8122|14929->8144|14943->8149|14983->8150|15046->8176|15133->8246|15174->8248|15241->8278|15265->8292|15306->8294|15397->8348|15411->8352|15442->8360|15637->8518|15651->8522|15681->8542|15697->8548|15708->8582|15727->8591|15768->8593|15816->8604|15832->8610|15895->8649|15918->8685|15937->8694|15978->8696|16026->8707|16042->8713|16103->8751|16126->8787|16145->8796|16186->8798|16234->8809|16250->8815|16311->8853|16334->8889|16353->8898|16394->8900|16442->8911|16458->8917|16524->8959|16547->8995|16566->9004|16607->9006|16655->9017|16671->9023|16730->9059|16753->9095|16772->9104|16813->9106|16861->9117|16877->9123|16944->9166|16981->9207|17167->9356|17181->9360|17210->9366|17287->9406|17301->9410|17337->9422|17410->9457|17425->9461|17456->9468|17697->9676|17756->9702|17811->9724|17862->9742|19686->11529|19702->11535|19759->11569
                    LINES: 19->1|22->1|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|37->16|43->22|43->22|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|55->34|55->34|55->34|57->36|57->36|57->36|58->37|58->37|58->37|58->38|58->38|58->38|58->39|58->39|58->39|58->39|58->39|58->39|58->39|58->40|59->41|81->63|81->63|81->63|83->65|83->65|83->65|84->66|84->66|85->67|87->69|87->69|87->69|87->69|87->70|87->70|87->70|87->71|87->71|87->71|87->72|87->72|87->72|87->73|87->73|87->73|87->74|87->74|87->74|87->75|87->75|87->75|87->76|87->76|87->76|87->77|90->80|90->80|90->80|91->81|91->81|91->81|92->82|92->82|92->82|93->83|93->83|93->83|94->84|94->84|94->84|97->87|97->87|97->87|97->87|97->88|97->88|97->88|97->88|97->88|97->88|97->89|97->89|97->89|97->89|97->89|97->89|97->90|97->90|97->90|97->90|97->90|97->90|97->91|97->91|97->91|97->91|97->91|97->91|97->92|97->92|97->92|97->92|97->92|97->92|97->93|97->93|97->93|97->93|97->93|97->93|97->94|100->97|100->97|100->97|100->97|100->97|100->97|100->97|100->97|100->97|105->102|106->103|107->104|107->104|107->104|108->105|108->105|108->105|109->106|109->106|109->106|110->107|110->107|110->107|113->110|113->110|113->110|113->110|113->111|113->111|113->111|113->111|113->111|113->111|113->112|113->112|113->112|113->112|113->112|113->112|113->113|113->113|113->113|113->113|113->113|113->113|113->114|113->114|113->114|113->114|113->114|113->114|113->115|113->115|113->115|113->115|113->115|113->115|113->116|113->116|113->116|113->116|113->116|113->116|113->117|116->120|116->120|116->120|116->120|116->120|116->120|116->120|116->120|116->120|121->125|122->126|123->127|124->128|125->129|125->129|125->129|126->130|126->130|126->130|127->131|127->131|127->131|128->132|128->132|128->132|129->133|129->133|129->133|132->136|132->136|132->136|132->136|132->137|132->137|132->137|132->137|132->137|132->137|132->138|132->138|132->138|132->138|132->138|132->138|132->139|132->139|132->139|132->139|132->139|132->139|132->140|132->140|132->140|132->140|132->140|132->140|132->141|132->141|132->141|132->141|132->141|132->141|132->142|132->142|132->142|132->142|132->142|132->142|132->143|135->146|135->146|135->146|135->146|135->146|135->146|135->146|135->146|135->146|140->151|141->152|142->153|142->153|142->153|143->154|143->154|143->154|144->155|144->155|144->155|145->156|145->156|145->156|148->159|148->159|148->159|148->159|148->160|148->160|148->160|148->160|148->160|148->160|148->161|148->161|148->161|148->161|148->161|148->161|148->162|148->162|148->162|148->162|148->162|148->162|148->163|148->163|148->163|148->163|148->163|148->163|148->164|148->164|148->164|148->164|148->164|148->164|148->165|148->165|148->165|148->165|148->165|148->165|148->166|151->169|151->169|151->169|151->169|151->169|151->169|151->169|151->169|151->169|156->174|157->175|158->176|159->177|199->217|199->217|199->217
                    -- GENERATED --
                */
            