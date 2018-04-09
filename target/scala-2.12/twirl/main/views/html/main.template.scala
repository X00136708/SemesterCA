
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
                    <a href=""""),_display_(/*45.31*/routes/*45.37*/.ShoppingCtrl.showBasket()),format.raw/*45.63*/("""">Basket</a>
                </li>
                
                    <li>
                            <a href=""""),_display_(/*49.39*/controllers/*49.50*/.routes.ShoppingCtrl.viewOrders(user.getEmail())),format.raw/*49.98*/("""">View Orders</a>
                        </li>
                """)))})))}),format.raw/*51.19*/("""
                """),format.raw/*52.17*/("""<li """),_display_(/*52.22*/if(title=="Login")/*52.40*/{_display_(Seq[Any](format.raw/*52.41*/("""class="active"""")))}),format.raw/*52.56*/(""">
                        """),_display_(/*53.26*/if(user != null)/*53.42*/ {_display_(Seq[Any](format.raw/*53.44*/("""
                            """),format.raw/*54.29*/("""<a href=""""),_display_(/*54.39*/controllers/*54.50*/.security.routes.LoginCtrl.logout()),format.raw/*54.85*/("""">Logout """),_display_(/*54.95*/user/*54.99*/.getName()),format.raw/*54.109*/("""</a>
                        """)))}/*55.27*/else/*55.32*/{_display_(Seq[Any](format.raw/*55.33*/("""
                            """),format.raw/*56.29*/("""<a href=""""),_display_(/*56.39*/controllers/*56.50*/.security.routes.LoginCtrl.login()),format.raw/*56.84*/("""">Login</a>
                        """)))}),format.raw/*57.26*/("""
                    """),format.raw/*58.21*/("""</li>
            

                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*71.18*/content),format.raw/*71.25*/("""
            """),format.raw/*72.13*/("""</div>
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
    <script src=""""),_display_(/*86.19*/routes/*86.25*/.Assets.versioned("javascripts/main.js")),format.raw/*86.65*/(""""></script>
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
<<<<<<< HEAD
                  DATE: Mon Apr 09 01:04:49 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/main.scala.html
                  HASH: 7b6222185d41029b1677fb403b34c8bf985b9448
                  MATRIX: 970->1|1121->57|1149->59|1272->156|1297->161|1509->346|1524->352|1586->393|1817->597|1832->603|1881->631|2010->733|2041->755|2080->756|2126->771|2270->888|2285->894|2333->921|2517->1078|2542->1094|2581->1095|2634->1121|2679->1157|2718->1158|2763->1175|2825->1210|2840->1216|2889->1244|3002->1330|3017->1336|3064->1362|3206->1477|3226->1488|3295->1536|3395->1602|3440->1619|3472->1624|3499->1642|3538->1643|3584->1658|3638->1685|3663->1701|3703->1703|3760->1732|3797->1742|3817->1753|3873->1788|3910->1798|3923->1802|3955->1812|4004->1843|4017->1848|4056->1849|4113->1878|4150->1888|4170->1899|4225->1933|4293->1970|4342->1991|4541->2163|4569->2170|4610->2183|4920->2466|4935->2472|4996->2512
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|63->31|63->31|63->31|70->38|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|76->44|76->44|76->44|80->48|80->48|80->48|82->50|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|89->57|102->70|102->70|103->71|117->85|117->85|117->85
=======
                  DATE: Sun Apr 08 20:03:29 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/main.scala.html
                  HASH: ff9bd33cc41ccff8893639e01872c5208d2bf111
                  MATRIX: 970->1|1121->57|1151->61|1280->164|1305->169|1521->358|1536->364|1598->405|1837->617|1852->623|1901->651|2035->758|2066->780|2105->781|2151->796|2300->918|2315->924|2363->951|2554->1115|2579->1131|2618->1132|2672->1159|2717->1195|2756->1196|2802->1214|2865->1250|2880->1256|2929->1284|3063->1391|3078->1397|3125->1423|3271->1542|3291->1553|3360->1601|3462->1669|3508->1687|3540->1692|3567->1710|3606->1711|3652->1726|3707->1754|3732->1770|3772->1772|3830->1802|3867->1812|3887->1823|3943->1858|3980->1868|3993->1872|4025->1882|4075->1914|4088->1919|4127->1920|4185->1950|4222->1960|4242->1971|4297->2005|4366->2043|4416->2065|4628->2250|4656->2257|4698->2271|5022->2568|5037->2574|5098->2614
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|63->31|63->31|63->31|70->38|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|77->45|77->45|77->45|81->49|81->49|81->49|83->51|84->52|84->52|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|86->54|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|88->56|89->57|90->58|103->71|103->71|104->72|118->86|118->86|118->86
>>>>>>> aa4120e9331252f7dd028526e355ada7dc39cce8
                  -- GENERATED --
              */
          