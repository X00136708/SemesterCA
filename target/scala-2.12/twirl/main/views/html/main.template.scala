
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
                  DATE: Sat Apr 07 00:06:15 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/main.scala.html
                  HASH: f867388d6b6bbfc9630455657539b3c18dd9dfac
                  MATRIX: 970->1|1121->57|1151->61|1280->164|1305->169|1521->358|1536->364|1598->405|1837->617|1852->623|1901->651|2035->758|2066->780|2105->781|2151->796|2300->918|2315->924|2363->951|2554->1115|2579->1131|2618->1132|2672->1159|2717->1195|2756->1196|2802->1214|2865->1250|2880->1256|2929->1284|3045->1373|3060->1379|3107->1405|3253->1524|3273->1535|3342->1583|3444->1651|3490->1669|3522->1674|3549->1692|3588->1693|3634->1708|3689->1736|3714->1752|3754->1754|3812->1784|3849->1794|3869->1805|3925->1840|3962->1850|3975->1854|4007->1864|4057->1896|4070->1901|4109->1902|4167->1932|4204->1942|4224->1953|4279->1987|4348->2025|4398->2047|4610->2232|4638->2239|4680->2253|5004->2550|5019->2556|5080->2596
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|63->31|63->31|63->31|70->38|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|76->44|76->44|76->44|80->48|80->48|80->48|82->50|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|89->57|102->70|102->70|103->71|117->85|117->85|117->85
                  -- GENERATED --
              */
          