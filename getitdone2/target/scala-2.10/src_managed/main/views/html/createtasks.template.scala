
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
object createtasks extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template11[String,String,String,String,String,String,String,String,String,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(error: String)(Ttitle: String)(Tdesc: String)(Tzipcode: String)(Tdeadline: String)(Tprice: String)(Tcat: String)(searchstring: String)(searchcategory: Integer)(session: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.194*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*6.17*/title)),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/create.css"))),format.raw/*9.96*/("""">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
        
		<script src="//code.jquery.com/jquery-1.10.2.js"></script>
		<script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
        
		<script type="text/javascript">
		function applyTax()"""),format.raw/*18.22*/("""{"""),format.raw/*18.23*/("""
		  var inputAmount = document.getElementById( 'price' ).value;
		  if(inputAmount && inputAmount>0)"""),format.raw/*20.37*/("""{"""),format.raw/*20.38*/("""
		  	var totalAmount = ((inputAmount*0.05) + 1 ).toFixed(2);
		  """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""
		  else totalAmount = 0;

		  document.getElementById( 'requestedTotal' ).innerHTML = totalAmount;
		"""),format.raw/*26.3*/("""}"""),format.raw/*26.4*/("""
		
		</script>
		<script>
			$(function() """),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
			$( "#datepicker" ).datepicker("""),format.raw/*31.34*/("""{"""),format.raw/*31.35*/("""
				dateFormat: 'yy-mm-dd'"""),format.raw/*32.27*/("""}"""),format.raw/*32.28*/(""");
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/(""");
		</script>
    </head>
    <body>
        <header>
            <div id="logo">
                <a href="/"><IMG SRC=""""),_display_(Seq[Any](/*39.40*/routes/*39.46*/.Assets.at("images/logo.png"))),format.raw/*39.75*/("""" HEIGHT=60px></a>
            </div>
            <div id="line">
            </div>
            <div id="searchbar">
                <form name="input" action="searchtasks" method="post">
                    Search tasks <input type="text" id="textbar" name="searchstring" value=""""),_display_(Seq[Any](/*45.94*/searchstring)),format.raw/*45.106*/("""">
                    <select id="categoryselector" class="depth" name = "searchcategory">
                        <option value="0">All Categories</option>
                    """),_display_(Seq[Any](/*48.22*/for(cat <- Category.find.all()) yield /*48.53*/ {_display_(Seq[Any](format.raw/*48.55*/("""
                        """),_display_(Seq[Any](/*49.26*/if(searchcategory.equals(cat.id))/*49.59*/ {_display_(Seq[Any](format.raw/*49.61*/("""
                        <option selected="selected" value=""""),_display_(Seq[Any](/*50.61*/cat/*50.64*/.id)),format.raw/*50.67*/(""""> """),_display_(Seq[Any](/*50.71*/cat/*50.74*/.name)),format.raw/*50.79*/("""</option>
                        """)))}/*51.27*/else/*51.32*/{_display_(Seq[Any](format.raw/*51.33*/("""
                        <option value=""""),_display_(Seq[Any](/*52.41*/cat/*52.44*/.id)),format.raw/*52.47*/(""""> """),_display_(Seq[Any](/*52.51*/cat/*52.54*/.name)),format.raw/*52.59*/("""</option>
                    """)))})),format.raw/*53.22*/("""
                    """)))})),format.raw/*54.22*/("""
                    </select>
                    <input type="submit" value="Search">
                        """),_display_(Seq[Any](/*57.26*/if(session == null)/*57.45*/ {_display_(Seq[Any](format.raw/*57.47*/("""
                            <a href="/login"> Login/Register </a>
                        """)))}/*59.27*/else/*59.32*/{_display_(Seq[Any](format.raw/*59.33*/("""
                            """),_display_(Seq[Any](/*60.30*/session/*60.37*/ match/*60.43*/{/*61.33*/case "logout" =>/*61.49*/ {_display_(Seq[Any](format.raw/*61.51*/("""<a href="/login"> Login/Register </a>""")))}/*62.33*/case _ =>/*62.42*/ {_display_(Seq[Any](format.raw/*62.44*/("""<a href="showfeedback?userid="""),_display_(Seq[Any](/*62.74*/session)),format.raw/*62.81*/(""""> """),_display_(Seq[Any](/*62.85*/session)),format.raw/*62.92*/(""" </a>""")))}})),format.raw/*63.30*/("""
                        """)))})),format.raw/*64.26*/("""
                </form>
            </div>
        </header>
        <nav>
        </nav>
        <section id="main">
            <h3><strong>Create a new Task</strong></h3>
			<form action="viewtask" method="post">
            <div id="error">
			    """),_display_(Seq[Any](/*74.9*/Html(error))),format.raw/*74.20*/("""
            </div>
                <div id="wrap2">

                    <div class="inputform">
                        <p>How should your task be called?</p>
                        <label for="title">Title</label>
                        <input id="title" class="depth" type="text" name="title" value=""""),_display_(Seq[Any](/*81.90*/Ttitle)),format.raw/*81.96*/("""">
                    </div>

                    <div class="inputform">
                        <p>Select a category for your task.</p>
                    <label for="category">Category</label>
                        <select id="category" class="depth" name= "category" value = """"),_display_(Seq[Any](/*87.88*/Tcat)),format.raw/*87.92*/("""">
                        """),_display_(Seq[Any](/*88.26*/for(cat <- Category.find.all()) yield /*88.57*/ {_display_(Seq[Any](format.raw/*88.59*/("""
                            <option value=""""),_display_(Seq[Any](/*89.45*/cat/*89.48*/.id)),format.raw/*89.51*/(""""> """),_display_(Seq[Any](/*89.55*/cat/*89.58*/.name)),format.raw/*89.63*/("""</option>
                        """)))})),format.raw/*90.26*/("""
                        </select>
                    </div>

                    <div class="inputform">
                        <p>Shortly describe your task as exactly as possible.</p>
                        <label for="description">Description</label>
                        <input id="description" class="depth" type="text" name="description" value=""""),_display_(Seq[Any](/*97.102*/Tdesc)),format.raw/*97.107*/("""">
                    </div>

                    <div class="inputform">
                        <p>In which area has the task to be done?</p>
                        <label for="zipcode">Zipcode</label>
                        <input id="zipcode" class="depth" type="text" name="zipcode" value=""""),_display_(Seq[Any](/*103.94*/Tzipcode)),format.raw/*103.102*/("""">
                    </div>

                    <div class="inputform">
                        <p>What is the reward for the task?</p>
                        <label for="price">Reward</label>
                        <input id="price" class="depth" type="text" name="price" value=""""),_display_(Seq[Any](/*109.90*/Tprice)),format.raw/*109.96*/("""">
                    </div>

                    <div class="inputform">
                        <p>Until when has the task to be done?</p>
                        <label for="deadline">Deadline</label>
                        <input id="datepicker" class="depth" type="text" name="deadline" value=""""),_display_(Seq[Any](/*115.98*/Tdeadline)),format.raw/*115.107*/("""" placeholder="yyyy-mm-dd">
                    </div>
            </div>

            <div>
                <br>
                <hr>

                <div class="requestedtotal" id="requestedTotal">
                    <input type="button" id="checkfee" class="depth" align="center" onclick="applyTax();" value="Check the Fee" /> <br>
                </div>

                <div class="submitbox">
                <input type="checkbox" class="depth" name="accept" value="no">
                I am aware of Get-It-Done's <strong>terms of use</strong> and the <strong>incurring fees</strong> related with the processing of a task
                <p><input type="submit" id="submittask" class="modern" value="Submit Task"/></p>
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
                    <IMG SRC=""""),_display_(Seq[Any](/*162.32*/routes/*162.38*/.Assets.at("images/soft-logo.png"))),format.raw/*162.72*/("""" vspace="70px" align="center" HEIGHT=30px>
                </div>
                <div class="clearBoth">
                </div>
            </div>
        </footer>
    </body>
</html>"""))}
    }
    
    def render(title:String,error:String,Ttitle:String,Tdesc:String,Tzipcode:String,Tdeadline:String,Tprice:String,Tcat:String,searchstring:String,searchcategory:Integer,session:String): play.api.templates.HtmlFormat.Appendable = apply(title)(error)(Ttitle)(Tdesc)(Tzipcode)(Tdeadline)(Tprice)(Tcat)(searchstring)(searchcategory)(session)
    
    def f:((String) => (String) => (String) => (String) => (String) => (String) => (String) => (String) => (String) => (Integer) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (error) => (Ttitle) => (Tdesc) => (Tzipcode) => (Tdeadline) => (Tprice) => (Tcat) => (searchstring) => (searchcategory) => (session) => apply(title)(error)(Ttitle)(Tdesc)(Tzipcode)(Tdeadline)(Tprice)(Tcat)(searchstring)(searchcategory)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 30 09:46:25 CEST 2014
                    SOURCE: /home/roc/workspace/seba2/getitdone2/app/views/createtasks.scala.html
                    HASH: a6d874130f5732b19f441ee6cbec3a8f43ca8bf4
                    MATRIX: 634->1|921->193|1008->245|1034->250|1131->312|1145->318|1205->357|1296->413|1310->419|1365->453|1456->509|1470->515|1527->551|1723->711|1738->717|1792->749|1853->774|1868->780|1935->825|2199->1061|2228->1062|2357->1163|2386->1164|2479->1230|2507->1231|2637->1334|2665->1335|2736->1378|2765->1379|2827->1413|2856->1414|2911->1441|2940->1442|2973->1448|3001->1449|3159->1571|3174->1577|3225->1606|3543->1888|3578->1900|3793->2079|3840->2110|3880->2112|3942->2138|3984->2171|4024->2173|4121->2234|4133->2237|4158->2240|4198->2244|4210->2247|4237->2252|4291->2288|4304->2293|4343->2294|4420->2335|4432->2338|4457->2341|4497->2345|4509->2348|4536->2353|4599->2384|4653->2406|4802->2519|4830->2538|4870->2540|4981->2633|4994->2638|5033->2639|5099->2669|5115->2676|5130->2682|5140->2716|5165->2732|5205->2734|5262->2805|5280->2814|5320->2816|5386->2846|5415->2853|5455->2857|5484->2864|5523->2900|5581->2926|5870->3180|5903->3191|6246->3498|6274->3504|6595->3789|6621->3793|6685->3821|6732->3852|6772->3854|6853->3899|6865->3902|6890->3905|6930->3909|6942->3912|6969->3917|7036->3952|7432->4311|7460->4316|7796->4615|7828->4623|8151->4909|8180->4915|8519->5217|8552->5226|10742->7379|10758->7385|10815->7419
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|32->11|33->12|33->12|33->12|39->18|39->18|41->20|41->20|43->22|43->22|47->26|47->26|51->30|51->30|52->31|52->31|53->32|53->32|54->33|54->33|60->39|60->39|60->39|66->45|66->45|69->48|69->48|69->48|70->49|70->49|70->49|71->50|71->50|71->50|71->50|71->50|71->50|72->51|72->51|72->51|73->52|73->52|73->52|73->52|73->52|73->52|74->53|75->54|78->57|78->57|78->57|80->59|80->59|80->59|81->60|81->60|81->60|81->61|81->61|81->61|81->62|81->62|81->62|81->62|81->62|81->62|81->62|81->63|82->64|92->74|92->74|99->81|99->81|105->87|105->87|106->88|106->88|106->88|107->89|107->89|107->89|107->89|107->89|107->89|108->90|115->97|115->97|121->103|121->103|127->109|127->109|133->115|133->115|180->162|180->162|180->162
                    -- GENERATED --
                */
            