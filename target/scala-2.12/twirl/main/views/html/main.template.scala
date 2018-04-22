
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
<link href=""""),_display_(/*4.14*/routes/*4.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.61*/("""" rel="stylesheet" />
<link href=""""),_display_(/*5.14*/routes/*5.20*/.Assets.versioned("stylesheets/map.css")),format.raw/*5.60*/("""" rel="stylesheet" />
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Nu-Wave Games - """),_display_(/*10.29*/title),format.raw/*10.34*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.65*/("""" rel="stylesheet" />
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
                        """),_display_(/*44.26*/if(user.isInstanceOf[models.users.RegisteredUser])/*44.76*/{_display_(Seq[Any](format.raw/*44.77*/("""
                """),format.raw/*45.17*/("""<li """),_display_(/*45.22*/if(title=="Wallet")/*45.41*/ {_display_(Seq[Any](format.raw/*45.43*/("""
                    """),format.raw/*46.21*/("""class="active"
                     """)))}),format.raw/*47.23*/(""">
                    <a href=""""),_display_(/*48.31*/routes/*48.37*/.ShoppingCtrl.addToWallet(0)),format.raw/*48.65*/(""""><div id="navItem">Wallet</div></a>
                </li>
                
               
                
                <li """),_display_(/*53.22*/if(title=="View Orders")/*53.46*/ {_display_(Seq[Any](format.raw/*53.48*/("""
                    """),format.raw/*54.21*/("""class="active"
                """)))}),format.raw/*55.18*/(""">
                            <a href=""""),_display_(/*56.39*/controllers/*56.50*/.routes.ShoppingCtrl.viewOrders(user.getEmail())),format.raw/*56.98*/(""""><div id="navItem">View Orders</div></a>
                        </li>
                """)))})))}),format.raw/*58.19*/("""
                """),format.raw/*59.17*/("""</ul>
                <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*61.26*/if(user.isInstanceOf[models.users.RegisteredUser])/*61.76*/{_display_(Seq[Any](format.raw/*61.77*/("""
                            """),format.raw/*62.29*/("""<li """),_display_(/*62.34*/if(title=="Shopping Basket")/*62.62*/ {_display_(Seq[Any](format.raw/*62.64*/("""
                                """),format.raw/*63.33*/("""class="active"
                            """)))}),format.raw/*64.30*/(""">
                                <a href=""""),_display_(/*65.43*/routes/*65.49*/.ShoppingCtrl.showBasket()),format.raw/*65.75*/(""""><span class="glyphicon glyphicon-shopping-cart"</span></a>
                            </li>
                    <li>
                            <a href=""""),_display_(/*68.39*/controllers/*68.50*/.routes.CommunityCtrl.myAccount()),format.raw/*68.83*/(""""><span class="glyphicon glyphicon-user"></span></a>
                    </li>
                """)))}),format.raw/*70.18*/("""

                """),_display_(/*72.18*/if(user.isInstanceOf[models.users.Administrator])/*72.67*/{_display_(Seq[Any](format.raw/*72.68*/("""
                    """),format.raw/*73.21*/("""<li>
                            <a href=""""),_display_(/*74.39*/controllers/*74.50*/.routes.CommunityCtrl.usersPage()),format.raw/*74.83*/(""""><span class="glyphicon glyphicon-user"></span></a>
                    </li>
                """)))}),format.raw/*76.18*/("""
                    
                """),format.raw/*78.17*/("""<li """),_display_(/*78.22*/if(title=="Login")/*78.40*/{_display_(Seq[Any](format.raw/*78.41*/("""class="active"""")))}),format.raw/*78.56*/(""">
                        """),_display_(/*79.26*/if(user != null)/*79.42*/ {_display_(Seq[Any](format.raw/*79.44*/("""
                            """),format.raw/*80.29*/("""<a href=""""),_display_(/*80.39*/controllers/*80.50*/.security.routes.LoginCtrl.logout()),format.raw/*80.85*/(""""><div id="navItem">Logout """),_display_(/*80.113*/user/*80.117*/.getName()),format.raw/*80.127*/("""</div></a>
                        """)))}/*81.27*/else/*81.32*/{_display_(Seq[Any](format.raw/*81.33*/("""
                            """),format.raw/*82.29*/("""<a href=""""),_display_(/*82.39*/controllers/*82.50*/.security.routes.LoginCtrl.login()),format.raw/*82.84*/(""""><div id="navItem">Login</div></a>
                        """)))}),format.raw/*83.26*/("""
                    """),format.raw/*84.21*/("""</li>
                </ul>
            

                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            
                """),_display_(/*98.18*/content),format.raw/*98.25*/("""
            
        """),format.raw/*100.9*/("""</row>
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
    <script src=""""),_display_(/*113.19*/routes/*113.25*/.Assets.versioned("javascripts/main.js")),format.raw/*113.65*/(""""></script>
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
                  DATE: Sun Apr 22 16:36:00 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/main.scala.html
                  HASH: 485b9f115671e55b754bcf083f1784006e2932b1
                  MATRIX: 970->1|1121->57|1149->59|1204->88|1218->94|1279->135|1340->170|1354->176|1414->216|1543->318|1569->323|1781->508|1796->514|1858->555|2089->759|2104->765|2153->793|2306->919|2333->937|2372->938|2418->953|2477->985|2492->991|2541->1019|2647->1098|2675->1117|2715->1119|2764->1140|2827->1172|2886->1204|2901->1210|2949->1237|3057->1318|3089->1341|3129->1343|3178->1364|3241->1396|3394->1522|3419->1538|3458->1539|3511->1565|3570->1615|3609->1616|3654->1633|3686->1638|3714->1657|3754->1659|3803->1680|3871->1717|3930->1749|3945->1755|3994->1783|4151->1913|4184->1937|4224->1939|4273->1960|4336->1992|4403->2032|4423->2043|4492->2091|4616->2181|4661->2198|4776->2286|4835->2336|4874->2337|4931->2366|4963->2371|5000->2399|5040->2401|5101->2434|5176->2478|5247->2522|5262->2528|5309->2554|5494->2712|5514->2723|5568->2756|5695->2852|5741->2871|5799->2920|5838->2921|5887->2942|5957->2985|5977->2996|6031->3029|6158->3125|6224->3163|6256->3168|6283->3186|6322->3187|6368->3202|6422->3229|6447->3245|6487->3247|6544->3276|6581->3286|6601->3297|6657->3332|6713->3360|6727->3364|6759->3374|6814->3411|6827->3416|6866->3417|6923->3446|6960->3456|6980->3467|7035->3501|7127->3562|7176->3583|7374->3754|7402->3761|7452->3783|7761->4064|7777->4070|7839->4110
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|37->5|37->5|37->5|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|69->37|69->37|69->37|70->38|71->39|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|85->53|85->53|85->53|86->54|87->55|88->56|88->56|88->56|90->58|91->59|93->61|93->61|93->61|94->62|94->62|94->62|94->62|95->63|96->64|97->65|97->65|97->65|100->68|100->68|100->68|102->70|104->72|104->72|104->72|105->73|106->74|106->74|106->74|108->76|110->78|110->78|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|112->80|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|114->82|115->83|116->84|130->98|130->98|132->100|145->113|145->113|145->113
                  -- GENERATED --
              */
          