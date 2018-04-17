
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

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Nu-Wave Games - """),_display_(/*9.29*/title),format.raw/*9.34*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/map.css")),format.raw/*14.64*/("""" rel="stylesheet" />
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
                        """),_display_(/*44.26*/if(user.getRole == "registeredUser")/*44.62*/{_display_(Seq[Any](format.raw/*44.63*/("""
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
                  DATE: Tue Apr 17 16:48:06 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/newSemca/semesterca/app/views/main.scala.html
                  HASH: 05e5d387a7f26b982a8e3ec62cf25726f1b71b01
                  MATRIX: 970->1|1121->57|1151->61|1280->164|1305->169|1521->358|1536->364|1598->405|1665->445|1680->451|1741->491|1980->703|1995->709|2044->737|2202->868|2229->886|2268->887|2314->902|2374->935|2389->941|2438->969|2547->1051|2575->1070|2615->1072|2665->1094|2729->1127|2789->1160|2804->1166|2852->1193|2963->1277|2995->1300|3035->1302|3085->1324|3149->1357|3306->1487|3331->1503|3370->1504|3424->1531|3469->1567|3508->1568|3554->1586|3586->1591|3614->1610|3654->1612|3704->1634|3773->1672|3833->1705|3848->1711|3897->1739|4024->1839|4061->1867|4101->1869|4151->1891|4215->1924|4275->1957|4290->1963|4337->1989|4464->2089|4497->2113|4537->2115|4587->2137|4651->2170|4719->2211|4739->2222|4808->2270|4934->2362|4980->2380|5012->2385|5039->2403|5078->2404|5124->2419|5179->2447|5204->2463|5244->2465|5302->2495|5339->2505|5359->2516|5415->2551|5471->2579|5485->2583|5517->2593|5573->2631|5586->2636|5625->2637|5683->2667|5720->2677|5740->2688|5795->2722|5888->2784|5938->2806|6127->2968|6155->2975|6206->2999|6527->3293|6542->3299|6603->3339
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|69->37|69->37|69->37|70->38|71->39|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|83->51|83->51|83->51|84->52|85->53|86->54|86->54|86->54|89->57|89->57|89->57|90->58|91->59|92->60|92->60|92->60|94->62|95->63|95->63|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|97->65|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|99->67|100->68|101->69|114->82|114->82|116->84|129->97|129->97|129->97
                  -- GENERATED --
              */
          