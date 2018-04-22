
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
                  DATE: Sun Apr 22 12:14:20 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/main.scala.html
                  HASH: a8409403b0f7bcafd5b2e2b59b3f7becc48ce50d
                  MATRIX: 970->1|1121->57|1151->61|1207->91|1221->97|1282->138|1344->174|1358->180|1418->220|1552->327|1578->332|1794->521|1809->527|1871->568|2110->780|2125->786|2174->814|2332->945|2359->963|2398->964|2444->979|2504->1012|2519->1018|2568->1046|2677->1128|2705->1147|2745->1149|2795->1171|2859->1204|2919->1237|2934->1243|2982->1270|3093->1354|3125->1377|3165->1379|3215->1401|3279->1434|3436->1564|3461->1580|3500->1581|3554->1608|3613->1658|3652->1659|3698->1677|3730->1682|3758->1701|3798->1703|3848->1725|3917->1763|3977->1796|3992->1802|4041->1830|4203->1965|4236->1989|4276->1991|4326->2013|4390->2046|4458->2087|4478->2098|4547->2146|4673->2238|4719->2256|4836->2346|4895->2396|4934->2397|4992->2427|5024->2432|5061->2460|5101->2462|5163->2496|5239->2541|5311->2586|5326->2592|5373->2618|5561->2779|5581->2790|5635->2823|5764->2921|5812->2942|5870->2991|5909->2992|5959->3014|6030->3058|6050->3069|6104->3102|6233->3200|6301->3240|6333->3245|6360->3263|6399->3264|6445->3279|6500->3307|6525->3323|6565->3325|6623->3355|6660->3365|6680->3376|6736->3411|6792->3439|6806->3443|6838->3453|6894->3491|6907->3496|6946->3497|7004->3527|7041->3537|7061->3548|7116->3582|7209->3644|7259->3666|7471->3851|7499->3858|7551->3882|7873->4176|7889->4182|7951->4222
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|37->5|37->5|37->5|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|69->37|69->37|69->37|70->38|71->39|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|85->53|85->53|85->53|86->54|87->55|88->56|88->56|88->56|90->58|91->59|93->61|93->61|93->61|94->62|94->62|94->62|94->62|95->63|96->64|97->65|97->65|97->65|100->68|100->68|100->68|102->70|104->72|104->72|104->72|105->73|106->74|106->74|106->74|108->76|110->78|110->78|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|112->80|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|114->82|115->83|116->84|130->98|130->98|132->100|145->113|145->113|145->113
                  -- GENERATED --
              */
          