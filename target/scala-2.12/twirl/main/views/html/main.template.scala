
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
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*21.48*/routes/*21.54*/.ProductCtrl.shop(0)),format.raw/*21.74*/("""">Nu-Wave Games</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Products" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">Forums</a>
                </li>

                <li>
                    <a href="#">Shop</a>
                </li>

                <li>
                    <a href="#">Contact</a>
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
                  DATE: Mon Mar 12 11:23:25 GMT 2018
                  SOURCE: /home/wdd/webapps/PlayLab5-master/app/views/main.scala.html
                  HASH: ecbbf45ebd13fabcb1cc25d08e9f7c4ac1785544
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1815->595|1830->601|1871->621|2000->723|2031->745|2070->746|2116->761|2404->1022|2431->1040|2470->1041|2516->1056|2566->1079|2591->1095|2631->1097|2684->1122|2721->1132|2741->1143|2797->1178|2834->1188|2847->1192|2879->1202|2924->1229|2937->1234|2976->1235|3029->1260|3066->1270|3086->1281|3141->1315|3205->1348|3251->1366|3414->1502|3442->1509|3483->1522|3791->1803|3806->1809|3867->1849
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|69->37|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|74->42|76->44|86->54|86->54|87->55|101->69|101->69|101->69
                  -- GENERATED --
              */
          