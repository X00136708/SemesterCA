
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
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*21.48*/routes/*21.54*/.ProductCtrl.listProducts(0)),format.raw/*21.82*/("""">Nu-Wave Games</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Shop" )/*26.40*/{_display_(Seq[Any](format.raw/*26.41*/("""class="active"""")))}),format.raw/*26.56*/(""">
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.ProductCtrl.listProducts(0)),format.raw/*27.65*/("""">Shop</a>
                </li>

                <li """),_display_(/*30.22*/if(title=="Forums")/*30.41*/ {_display_(Seq[Any](format.raw/*30.43*/("""
                    """),format.raw/*31.21*/("""class="active"
                """)))}),format.raw/*32.18*/(""">
                    <a href=""""),_display_(/*33.31*/routes/*33.37*/.CommunityCtrl.forumPage(0)),format.raw/*33.64*/("""">Forums</a>
                </li>

                <li """),_display_(/*36.22*/if(title=="Contact us")/*36.45*/ {_display_(Seq[Any](format.raw/*36.47*/("""
                    """),format.raw/*37.21*/("""class="active"
                """)))}),format.raw/*38.18*/(""">
                    <a href="#">Contact us</a>
                </li>
         
                    """),_display_(/*42.22*/if(user != null)/*42.38*/{_display_(Seq[Any](format.raw/*42.39*/("""
                        """),_display_(/*43.26*/if(user.getRole == "registeredUser")/*43.62*/{_display_(Seq[Any](format.raw/*43.63*/("""
                """),format.raw/*44.17*/("""<li """),_display_(/*44.22*/if(title=="Wallet")/*44.41*/ {_display_(Seq[Any](format.raw/*44.43*/("""
                    """),format.raw/*45.21*/("""class="active"
                     """)))}),format.raw/*46.23*/(""">
                    <a href=""""),_display_(/*47.31*/routes/*47.37*/.ShoppingCtrl.addToWallet(0)),format.raw/*47.65*/("""">Wallet</a>
                </li>
                
                <li """),_display_(/*50.22*/if(title=="Shopping Basket")/*50.50*/ {_display_(Seq[Any](format.raw/*50.52*/("""
                    """),format.raw/*51.21*/("""class="active"
                """)))}),format.raw/*52.18*/(""">
                    <a href=""""),_display_(/*53.31*/routes/*53.37*/.ShoppingCtrl.showBasket()),format.raw/*53.63*/("""">Basket</a>
                </li>
                
                <li """),_display_(/*56.22*/if(title=="View Orders")/*56.46*/ {_display_(Seq[Any](format.raw/*56.48*/("""
                    """),format.raw/*57.21*/("""class="active"
                """)))}),format.raw/*58.18*/(""">
                            <a href=""""),_display_(/*59.39*/controllers/*59.50*/.routes.ShoppingCtrl.viewOrders(user.getEmail())),format.raw/*59.98*/("""">View Orders</a>
                        </li>
                """)))})))}),format.raw/*61.19*/("""
                """),format.raw/*62.17*/("""<li """),_display_(/*62.22*/if(title=="Login")/*62.40*/{_display_(Seq[Any](format.raw/*62.41*/("""class="active"""")))}),format.raw/*62.56*/(""">
                        """),_display_(/*63.26*/if(user != null)/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""
                            """),format.raw/*64.29*/("""<a href=""""),_display_(/*64.39*/controllers/*64.50*/.security.routes.LoginCtrl.logout()),format.raw/*64.85*/("""">Logout """),_display_(/*64.95*/user/*64.99*/.getName()),format.raw/*64.109*/("""</a>
                        """)))}/*65.27*/else/*65.32*/{_display_(Seq[Any](format.raw/*65.33*/("""
                            """),format.raw/*66.29*/("""<a href=""""),_display_(/*66.39*/controllers/*66.50*/.security.routes.LoginCtrl.login()),format.raw/*66.84*/("""">Login</a>
                        """)))}),format.raw/*67.26*/("""
                    """),format.raw/*68.21*/("""</li>
            

                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            
                """),_display_(/*81.18*/content),format.raw/*81.25*/("""
            
        """),format.raw/*83.9*/("""</row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Nu-Wave Games</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*96.19*/routes/*96.25*/.Assets.versioned("javascripts/main.js")),format.raw/*96.65*/(""""></script>
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
                  DATE: Fri Apr 13 14:26:24 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/main.scala.html
                  HASH: ba826dc0a052ca91886a958cfbfc17aac2f4245b
                  MATRIX: 970->1|1121->57|1151->61|1280->164|1305->169|1521->358|1536->364|1598->405|1837->617|1852->623|1901->651|2035->758|2062->776|2101->777|2147->792|2207->825|2222->831|2271->859|2356->917|2384->936|2424->938|2474->960|2538->993|2598->1026|2613->1032|2661->1059|2748->1119|2780->1142|2820->1144|2870->1166|2934->1199|3067->1305|3092->1321|3131->1322|3185->1349|3230->1385|3269->1386|3315->1404|3347->1409|3375->1428|3415->1430|3465->1452|3534->1490|3594->1523|3609->1529|3658->1557|3761->1633|3798->1661|3838->1663|3888->1685|3952->1718|4012->1751|4027->1757|4074->1783|4177->1859|4210->1883|4250->1885|4300->1907|4364->1940|4432->1981|4452->1992|4521->2040|4623->2108|4669->2126|4701->2131|4728->2149|4767->2150|4813->2165|4868->2193|4893->2209|4933->2211|4991->2241|5028->2251|5048->2262|5104->2297|5141->2307|5154->2311|5186->2321|5236->2353|5249->2358|5288->2359|5346->2389|5383->2399|5403->2410|5458->2444|5527->2482|5577->2504|5766->2666|5794->2673|5845->2697|6153->2978|6168->2984|6229->3024
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|59->27|59->27|59->27|62->30|62->30|62->30|63->31|64->32|65->33|65->33|65->33|68->36|68->36|68->36|69->37|70->38|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|77->45|78->46|79->47|79->47|79->47|82->50|82->50|82->50|83->51|84->52|85->53|85->53|85->53|88->56|88->56|88->56|89->57|90->58|91->59|91->59|91->59|93->61|94->62|94->62|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|96->64|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|98->66|99->67|100->68|113->81|113->81|115->83|128->96|128->96|128->96
                  -- GENERATED --
              */
          