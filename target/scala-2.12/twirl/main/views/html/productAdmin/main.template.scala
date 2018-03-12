
package views.html.productAdmin

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
/*1.2*/import models.users.User

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, user: User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.45*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*10.27*/title),format.raw/*10.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*27.22*/if(title =="Products" )/*27.45*/{_display_(Seq[Any](format.raw/*27.46*/("""class="active"""")))}),format.raw/*27.61*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.AdminProductCtrl.shop(0)),format.raw/*28.62*/("""">Products</a>
                </li>
                <li>
                    <a href="#">About</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*40.22*/if(title=="Login")/*40.40*/{_display_(Seq[Any](format.raw/*40.41*/("""class="active"""")))}),format.raw/*40.56*/(""">
                    """),_display_(/*41.22*/if(user != null)/*41.38*/ {_display_(Seq[Any](format.raw/*41.40*/("""
                        """),format.raw/*42.25*/("""<a href=""""),_display_(/*42.35*/controllers/*42.46*/.security.routes.LoginCtrl.logout()),format.raw/*42.81*/("""">Logout """),_display_(/*42.91*/user/*42.95*/.getName()),format.raw/*42.105*/("""</a>
                    """)))}/*43.23*/else/*43.28*/{_display_(Seq[Any](format.raw/*43.29*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/controllers/*44.46*/.security.routes.LoginCtrl.login()),format.raw/*44.80*/("""">Login</a>
                    """)))}),format.raw/*45.22*/("""

                """),format.raw/*47.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*57.18*/content),format.raw/*57.25*/("""
            """),format.raw/*58.13*/("""</div>
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
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("javascripts/main.js")),format.raw/*72.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 14:08:21 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/productAdmin/main.scala.html
                  HASH: ce772ed2c32d83547c7faad207988d89f32f07df
                  MATRIX: 664->1|1002->27|1140->70|1168->72|1290->167|1316->172|1528->357|1543->363|1605->404|1936->708|1968->731|2007->732|2053->747|2112->779|2127->785|2173->810|2519->1129|2546->1147|2585->1148|2631->1163|2681->1186|2706->1202|2746->1204|2799->1229|2836->1239|2856->1250|2912->1285|2949->1295|2962->1299|2994->1309|3039->1336|3052->1341|3091->1342|3144->1367|3181->1377|3201->1388|3256->1422|3320->1455|3366->1473|3529->1609|3557->1616|3598->1629|3906->1910|3921->1916|3982->1956
                  LINES: 24->1|29->2|34->2|36->4|42->10|42->10|46->14|46->14|46->14|59->27|59->27|59->27|59->27|60->28|60->28|60->28|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|77->45|79->47|89->57|89->57|90->58|104->72|104->72|104->72
                  -- GENERATED --
              */
          