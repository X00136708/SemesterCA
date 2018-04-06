
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
                <a class="navbar-brand" href=""""),_display_(/*21.48*/routes/*21.54*/.ProductCtrl.listProducts(0)),format.raw/*21.82*/("""">Online Shop</a>
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
                <li """),_display_(/*37.22*/if(title=="Login")/*37.40*/{_display_(Seq[Any](format.raw/*37.41*/("""class="active"""")))}),format.raw/*37.56*/(""">
                    """),_display_(/*38.22*/if(user != null)/*38.38*/ {_display_(Seq[Any](format.raw/*38.40*/("""
                        """),format.raw/*39.25*/("""<a href=""""),_display_(/*39.35*/controllers/*39.46*/.security.routes.LoginCtrl.logout()),format.raw/*39.81*/("""">Logout """),_display_(/*39.91*/user/*39.95*/.getName()),format.raw/*39.105*/("""</a>
                    """)))}/*40.23*/else/*40.28*/{_display_(Seq[Any](format.raw/*40.29*/("""
                        """),format.raw/*41.25*/("""<a href=""""),_display_(/*41.35*/controllers/*41.46*/.security.routes.LoginCtrl.login()),format.raw/*41.80*/("""">Login</a>
                    """)))}),format.raw/*42.22*/("""
                    
                """),format.raw/*44.17*/("""<li>
                    <a href=""""),_display_(/*45.31*/routes/*45.37*/.ShoppingCtrl.addToWallet(0)),format.raw/*45.65*/("""">Wallet</a>
                </li>
                """),_display_(/*47.18*/if(user != null)/*47.34*/{_display_(Seq[Any](format.raw/*47.35*/("""
                    """),format.raw/*48.21*/("""<li>
                            <a href=""""),_display_(/*49.39*/controllers/*49.50*/.routes.ShoppingCtrl.viewOrders(user.getEmail())),format.raw/*49.98*/("""">View Orders</a>
                        </li>
                """)))}),format.raw/*51.18*/("""
            

                """),format.raw/*54.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*64.18*/content),format.raw/*64.25*/("""
            """),format.raw/*65.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("javascripts/main.js")),format.raw/*79.65*/(""""></script>
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
                  DATE: Fri Apr 06 22:18:12 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/main.scala.html
                  HASH: 3c1d2e52bed8a9ed81dcd6e8fefd10a3781cc8be
                  MATRIX: 970->1|1121->57|1149->59|1272->156|1297->161|1509->346|1524->352|1586->393|1817->597|1832->603|1881->631|2008->731|2039->753|2078->754|2124->769|2268->886|2283->892|2331->919|2505->1066|2532->1084|2571->1085|2617->1100|2667->1123|2692->1139|2732->1141|2785->1166|2822->1176|2842->1187|2898->1222|2935->1232|2948->1236|2980->1246|3025->1273|3038->1278|3077->1279|3130->1304|3167->1314|3187->1325|3242->1359|3306->1392|3372->1430|3434->1465|3449->1471|3498->1499|3577->1551|3602->1567|3641->1568|3690->1589|3760->1632|3780->1643|3849->1691|3945->1756|4004->1787|4167->1923|4195->1930|4236->1943|4544->2224|4559->2230|4620->2270
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|63->31|63->31|63->31|69->37|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|74->42|76->44|77->45|77->45|77->45|79->47|79->47|79->47|80->48|81->49|81->49|81->49|83->51|86->54|96->64|96->64|97->65|111->79|111->79|111->79
                  -- GENERATED --
              */
          