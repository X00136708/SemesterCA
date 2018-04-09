
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

                <li """),_display_(/*26.22*/if(title=="Products" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">Shop</a>
                </li>

                <li>
                    <a href=""""),_display_(/*31.31*/routes/*31.37*/.CommunityCtrl.forumPage(0)),format.raw/*31.64*/("""">Forums</a>
                </li>

                <li>
                    <a href="#">Contact us</a>
                </li>
         
                    """),_display_(/*38.22*/if(user != null)/*38.38*/{_display_(Seq[Any](format.raw/*38.39*/("""
                        """),_display_(/*39.26*/if(user.getRole == "registeredUser")/*39.62*/{_display_(Seq[Any](format.raw/*39.63*/("""
                """),format.raw/*40.17*/("""<li>
                    <a href=""""),_display_(/*41.31*/routes/*41.37*/.ShoppingCtrl.addToWallet(0)),format.raw/*41.65*/("""">Wallet</a>
                </li>
                <li>
                    <a href=""""),_display_(/*44.31*/routes/*44.37*/.ShoppingCtrl.showBasket()),format.raw/*44.63*/("""">Basket</a>
                </li>
                
                    <li>
                            <a href=""""),_display_(/*48.39*/controllers/*48.50*/.routes.ShoppingCtrl.viewOrders(user.getEmail())),format.raw/*48.98*/("""">View Orders</a>
                        </li>
                """)))})))}),format.raw/*50.19*/("""
                """),format.raw/*51.17*/("""<li """),_display_(/*51.22*/if(title=="Login")/*51.40*/{_display_(Seq[Any](format.raw/*51.41*/("""class="active"""")))}),format.raw/*51.56*/(""">
                        """),_display_(/*52.26*/if(user != null)/*52.42*/ {_display_(Seq[Any](format.raw/*52.44*/("""
                            """),format.raw/*53.29*/("""<a href=""""),_display_(/*53.39*/controllers/*53.50*/.security.routes.LoginCtrl.logout()),format.raw/*53.85*/("""">Logout """),_display_(/*53.95*/user/*53.99*/.getName()),format.raw/*53.109*/("""</a>
                        """)))}/*54.27*/else/*54.32*/{_display_(Seq[Any](format.raw/*54.33*/("""
                            """),format.raw/*55.29*/("""<a href=""""),_display_(/*55.39*/controllers/*55.50*/.security.routes.LoginCtrl.login()),format.raw/*55.84*/("""">Login</a>
                        """)))}),format.raw/*56.26*/("""
                    """),format.raw/*57.21*/("""</li>
            

                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*70.18*/content),format.raw/*70.25*/("""
            """),format.raw/*71.13*/("""</div>
        </row>
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
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("javascripts/main.js")),format.raw/*85.65*/(""""></script>
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
                  DATE: Mon Apr 09 01:04:49 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/main.scala.html
                  HASH: 7b6222185d41029b1677fb403b34c8bf985b9448
                  MATRIX: 970->1|1121->57|1149->59|1272->156|1297->161|1509->346|1524->352|1586->393|1817->597|1832->603|1881->631|2010->733|2041->755|2080->756|2126->771|2270->888|2285->894|2333->921|2517->1078|2542->1094|2581->1095|2634->1121|2679->1157|2718->1158|2763->1175|2825->1210|2840->1216|2889->1244|3002->1330|3017->1336|3064->1362|3206->1477|3226->1488|3295->1536|3395->1602|3440->1619|3472->1624|3499->1642|3538->1643|3584->1658|3638->1685|3663->1701|3703->1703|3760->1732|3797->1742|3817->1753|3873->1788|3910->1798|3923->1802|3955->1812|4004->1843|4017->1848|4056->1849|4113->1878|4150->1888|4170->1899|4225->1933|4293->1970|4342->1991|4541->2163|4569->2170|4610->2183|4920->2466|4935->2472|4996->2512
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|63->31|63->31|63->31|70->38|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|76->44|76->44|76->44|80->48|80->48|80->48|82->50|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|89->57|102->70|102->70|103->71|117->85|117->85|117->85
                  -- GENERATED --
              */
          