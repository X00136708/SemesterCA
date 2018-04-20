
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<link href=""""),_display_(/*4.14*/routes/*4.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.61*/("""" rel="stylesheet" />
<link href=""""),_display_(/*5.14*/routes/*5.20*/.Assets.versioned("stylesheets/map.css")),format.raw/*5.60*/("""" rel="stylesheet" />
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Nu-Wave Games - """),_display_(/*10.29*/title),format.raw/*10.34*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*22.48*/routes/*22.54*/.ProductCtrl.listProducts(0)),format.raw/*22.82*/(""""><div id="navItem">Nu-Wave Games</div></a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*27.22*/if(title=="Shop" )/*27.40*/{_display_(Seq[Any](format.raw/*27.41*/("""class="active"""")))}),format.raw/*27.56*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.ProductCtrl.listProducts(0)),format.raw/*28.65*/(""""><div id="navItem">Shop</div></a>
                </li>

                <li """),_display_(/*31.22*/if(title=="Forums")/*31.41*/ {_display_(Seq[Any](format.raw/*31.43*/("""
                    """),format.raw/*32.21*/("""class="active"
                """)))}),format.raw/*33.18*/(""">
                    <a href=""""),_display_(/*34.31*/routes/*34.37*/.CommunityCtrl.forumPage(0)),format.raw/*34.64*/(""""><div id="navItem">Forums</div></a>
                </li>

                <li """),_display_(/*37.22*/if(title=="Contact us")/*37.45*/ {_display_(Seq[Any](format.raw/*37.47*/("""
                    """),format.raw/*38.21*/("""class="active"
                """)))}),format.raw/*39.18*/(""">
                    <a href="#"><div id="navItem">Contact us</div></a>
                </li>
         
                    """),_display_(/*43.22*/if(user != null)/*43.38*/{_display_(Seq[Any](format.raw/*43.39*/("""
                        """),_display_(/*44.26*/if(user.isInstanceOf[models.users.RegisteredUser])/*44.76*/{_display_(Seq[Any](format.raw/*44.77*/("""
                """),format.raw/*45.17*/("""<li """),_display_(/*45.22*/if(title=="Wallet")/*45.41*/ {_display_(Seq[Any](format.raw/*45.43*/("""
                    """),format.raw/*46.21*/("""class="active"
                     """)))}),format.raw/*47.23*/(""">
                    <a href=""""),_display_(/*48.31*/routes/*48.37*/.ShoppingCtrl.addToWallet(0)),format.raw/*48.65*/(""""><div id="navItem">Wallet</div></a>
                </li>
                
                <li """),_display_(/*51.22*/if(title=="Shopping Basket")/*51.50*/ {_display_(Seq[Any](format.raw/*51.52*/("""
                    """),format.raw/*52.21*/("""class="active"
                """)))}),format.raw/*53.18*/(""">
                    <a href=""""),_display_(/*54.31*/routes/*54.37*/.ShoppingCtrl.showBasket()),format.raw/*54.63*/(""""><div id="navItem">Basket</div></a>
                </li>
                
                <li """),_display_(/*57.22*/if(title=="View Orders")/*57.46*/ {_display_(Seq[Any](format.raw/*57.48*/("""
                    """),format.raw/*58.21*/("""class="active"
                """)))}),format.raw/*59.18*/(""">
                            <a href=""""),_display_(/*60.39*/controllers/*60.50*/.routes.ShoppingCtrl.viewOrders(user.getEmail())),format.raw/*60.98*/(""""><div id="navItem">View Orders</div></a>
                        </li>
                """)))})))}),format.raw/*62.19*/("""
                """),format.raw/*63.17*/("""<li """),_display_(/*63.22*/if(title=="Login")/*63.40*/{_display_(Seq[Any](format.raw/*63.41*/("""class="active"""")))}),format.raw/*63.56*/(""">
                        """),_display_(/*64.26*/if(user != null)/*64.42*/ {_display_(Seq[Any](format.raw/*64.44*/("""
                            """),format.raw/*65.29*/("""<a href=""""),_display_(/*65.39*/controllers/*65.50*/.security.routes.LoginCtrl.logout()),format.raw/*65.85*/(""""><div id="navItem">Logout """),_display_(/*65.113*/user/*65.117*/.getName()),format.raw/*65.127*/("""</div></a>
                        """)))}/*66.27*/else/*66.32*/{_display_(Seq[Any](format.raw/*66.33*/("""
                            """),format.raw/*67.29*/("""<a href=""""),_display_(/*67.39*/controllers/*67.50*/.security.routes.LoginCtrl.login()),format.raw/*67.84*/(""""><div id="navItem">Login</div></a>
                        """)))}),format.raw/*68.26*/("""
                    """),format.raw/*69.21*/("""</li>
            

                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            
                """),_display_(/*82.18*/content),format.raw/*82.25*/("""
            
        """),format.raw/*84.9*/("""</row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12" id="navItem">
                Copyright
                <strong>Nu-Wave Games</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("javascripts/main.js")),format.raw/*97.65*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 14:49:33 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA/app/views/main.scala.html
                  HASH: d6c722f8905dee38c7b2963a2c35cd746248f987
                  MATRIX: 970->1|1121->57|1149->59|1204->88|1218->94|1279->135|1340->170|1354->176|1414->216|1543->318|1569->323|1781->508|1796->514|1858->555|2089->759|2104->765|2153->793|2306->919|2333->937|2372->938|2418->953|2477->985|2492->991|2541->1019|2647->1098|2675->1117|2715->1119|2764->1140|2827->1172|2886->1204|2901->1210|2949->1237|3057->1318|3089->1341|3129->1343|3178->1364|3241->1396|3394->1522|3419->1538|3458->1539|3511->1565|3570->1615|3609->1616|3654->1633|3686->1638|3714->1657|3754->1659|3803->1680|3871->1717|3930->1749|3945->1755|3994->1783|4118->1880|4155->1908|4195->1910|4244->1931|4307->1963|4366->1995|4381->2001|4428->2027|4552->2124|4585->2148|4625->2150|4674->2171|4737->2203|4804->2243|4824->2254|4893->2302|5017->2392|5062->2409|5094->2414|5121->2432|5160->2433|5206->2448|5260->2475|5285->2491|5325->2493|5382->2522|5419->2532|5439->2543|5495->2578|5551->2606|5565->2610|5597->2620|5652->2657|5665->2662|5704->2663|5761->2692|5798->2702|5818->2713|5873->2747|5965->2808|6014->2829|6190->2978|6218->2985|6267->3007|6575->3288|6590->3294|6651->3334
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|37->5|37->5|37->5|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|69->37|69->37|69->37|70->38|71->39|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|83->51|83->51|83->51|84->52|85->53|86->54|86->54|86->54|89->57|89->57|89->57|90->58|91->59|92->60|92->60|92->60|94->62|95->63|95->63|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|97->65|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|99->67|100->68|101->69|114->82|114->82|116->84|129->97|129->97|129->97
                  -- GENERATED --
              */
          