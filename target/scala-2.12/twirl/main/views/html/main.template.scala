
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
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.ProductCtrl.listProducts(0)),format.raw/*27.65*/("""">Shop</a>
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
                  DATE: Thu Apr 12 19:30:13 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/main.scala.html
                  HASH: 0f5407a211b95bf8b41aa59cb35a258a94acc1a7
                  MATRIX: 970->1|1121->57|1151->61|1280->164|1305->169|1521->358|1536->364|1598->405|1837->617|1852->623|1901->651|2035->758|2066->780|2105->781|2151->796|2211->829|2226->835|2275->863|2391->952|2406->958|2454->985|2645->1149|2670->1165|2709->1166|2763->1193|2808->1229|2847->1230|2893->1248|2956->1284|2971->1290|3020->1318|3154->1425|3169->1431|3216->1457|3362->1576|3382->1587|3451->1635|3553->1703|3599->1721|3631->1726|3658->1744|3697->1745|3743->1760|3798->1788|3823->1804|3863->1806|3921->1836|3958->1846|3978->1857|4034->1892|4071->1902|4084->1906|4116->1916|4166->1948|4179->1953|4218->1954|4276->1984|4313->1994|4333->2005|4388->2039|4457->2077|4507->2099|4719->2284|4747->2291|4789->2305|5113->2602|5128->2608|5189->2648
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|59->27|59->27|59->27|63->31|63->31|63->31|70->38|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|77->45|77->45|77->45|81->49|81->49|81->49|83->51|84->52|84->52|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|86->54|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|88->56|89->57|90->58|103->71|103->71|104->72|118->86|118->86|118->86
                  -- GENERATED --
              */
          