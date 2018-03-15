
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
                    <a href="#">Forums</a>
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

                """),format.raw/*44.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*54.18*/content),format.raw/*54.25*/("""
            """),format.raw/*55.13*/("""</div>
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
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("javascripts/main.js")),format.raw/*69.65*/(""""></script>
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
                  DATE: Thu Mar 15 13:32:55 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/main.scala.html
                  HASH: 24cd44a35039eda3a807c9ca974c91ddac573d17
                  MATRIX: 970->1|1121->57|1149->59|1272->156|1297->161|1509->346|1524->352|1586->393|1817->597|1832->603|1881->631|2008->731|2039->753|2078->754|2124->769|2415->1033|2442->1051|2481->1052|2527->1067|2577->1090|2602->1106|2642->1108|2695->1133|2732->1143|2752->1154|2808->1189|2845->1199|2858->1203|2890->1213|2935->1240|2948->1245|2987->1246|3040->1271|3077->1281|3097->1292|3152->1326|3216->1359|3262->1377|3425->1513|3453->1520|3494->1533|3802->1814|3817->1820|3878->1860
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|69->37|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|74->42|76->44|86->54|86->54|87->55|101->69|101->69|101->69
                  -- GENERATED --
              */
          