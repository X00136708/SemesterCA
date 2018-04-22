
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
                
                <li """),_display_(/*51.22*/if(title=="Shopping Basket")/*51.50*/ {_display_(Seq[Any](format.raw/*51.52*/("""
                    """),format.raw/*52.21*/("""class="active"
                """)))}),format.raw/*53.18*/(""">
                    <a href=""""),_display_(/*54.31*/routes/*54.37*/.ShoppingCtrl.showBasket()),format.raw/*54.63*/(""""><div id="navItem">Basket</div></a>
                </li>
                
                <li """),_display_(/*57.22*/if(title=="View Orders")/*57.46*/ {_display_(Seq[Any](format.raw/*57.48*/("""
                    """),format.raw/*58.21*/("""class="active"
                """)))}),format.raw/*59.18*/(""">
                            <a href=""""),_display_(/*60.39*/controllers/*60.50*/.routes.ShoppingCtrl.viewOrders(user.getEmail())),format.raw/*60.98*/(""""><div id="navItem">View Orders</div></a>
                        </li>
                """)))})))}),format.raw/*62.19*/("""
                """),format.raw/*63.17*/("""</ul>
                <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*65.26*/if(user.isInstanceOf[models.users.RegisteredUser])/*65.76*/{_display_(Seq[Any](format.raw/*65.77*/("""
                    """),format.raw/*66.21*/("""<li>
                            <a href=""""),_display_(/*67.39*/controllers/*67.50*/.routes.CommunityCtrl.myAccount()),format.raw/*67.83*/(""""><div id="navItem">My Account</div></a>
                    </li>
                """)))}),format.raw/*69.18*/("""

                """),_display_(/*71.18*/if(user.isInstanceOf[models.users.Administrator])/*71.67*/{_display_(Seq[Any](format.raw/*71.68*/("""
                    """),format.raw/*72.21*/("""<li>
                            <a href=""""),_display_(/*73.39*/controllers/*73.50*/.routes.CommunityCtrl.usersPage()),format.raw/*73.83*/(""""><div id="navItem">Manage Users</div></a>
                    </li>
                """)))}),format.raw/*75.18*/("""
                    
                """),format.raw/*77.17*/("""<li """),_display_(/*77.22*/if(title=="Login")/*77.40*/{_display_(Seq[Any](format.raw/*77.41*/("""class="active"""")))}),format.raw/*77.56*/(""">
                        """),_display_(/*78.26*/if(user != null)/*78.42*/ {_display_(Seq[Any](format.raw/*78.44*/("""
                            """),format.raw/*79.29*/("""<a href=""""),_display_(/*79.39*/controllers/*79.50*/.security.routes.LoginCtrl.logout()),format.raw/*79.85*/(""""><div id="navItem">Logout """),_display_(/*79.113*/user/*79.117*/.getName()),format.raw/*79.127*/("""</div></a>
                        """)))}/*80.27*/else/*80.32*/{_display_(Seq[Any](format.raw/*80.33*/("""
                            """),format.raw/*81.29*/("""<a href=""""),_display_(/*81.39*/controllers/*81.50*/.security.routes.LoginCtrl.login()),format.raw/*81.84*/(""""><div id="navItem">Login</div></a>
                        """)))}),format.raw/*82.26*/("""
                    """),format.raw/*83.21*/("""</li>
                </ul>
            

                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            
                """),_display_(/*97.18*/content),format.raw/*97.25*/("""
            
        """),format.raw/*99.9*/("""</row>
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
    <script src=""""),_display_(/*112.19*/routes/*112.25*/.Assets.versioned("javascripts/main.js")),format.raw/*112.65*/(""""></script>
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
                  DATE: Sun Apr 22 11:50:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/main.scala.html
                  HASH: 5b1321920fd1b98f39a99f9dbaf40fd19081ab4f
                  MATRIX: 970->1|1121->57|1151->61|1207->91|1221->97|1282->138|1344->174|1358->180|1418->220|1552->327|1578->332|1794->521|1809->527|1871->568|2110->780|2125->786|2174->814|2332->945|2359->963|2398->964|2444->979|2504->1012|2519->1018|2568->1046|2677->1128|2705->1147|2745->1149|2795->1171|2859->1204|2919->1237|2934->1243|2982->1270|3093->1354|3125->1377|3165->1379|3215->1401|3279->1434|3436->1564|3461->1580|3500->1581|3554->1608|3613->1658|3652->1659|3698->1677|3730->1682|3758->1701|3798->1703|3848->1725|3917->1763|3977->1796|3992->1802|4041->1830|4168->1930|4205->1958|4245->1960|4295->1982|4359->2015|4419->2048|4434->2054|4481->2080|4608->2180|4641->2204|4681->2206|4731->2228|4795->2261|4863->2302|4883->2313|4952->2361|5078->2453|5124->2471|5241->2561|5300->2611|5339->2612|5389->2634|5460->2678|5480->2689|5534->2722|5651->2808|5699->2829|5757->2878|5796->2879|5846->2901|5917->2945|5937->2956|5991->2989|6110->3077|6178->3117|6210->3122|6237->3140|6276->3141|6322->3156|6377->3184|6402->3200|6442->3202|6500->3232|6537->3242|6557->3253|6613->3288|6669->3316|6683->3320|6715->3330|6771->3368|6784->3373|6823->3374|6881->3404|6918->3414|6938->3425|6993->3459|7086->3521|7136->3543|7348->3728|7376->3735|7427->3759|7749->4053|7765->4059|7827->4099
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|37->5|37->5|37->5|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|69->37|69->37|69->37|70->38|71->39|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|83->51|83->51|83->51|84->52|85->53|86->54|86->54|86->54|89->57|89->57|89->57|90->58|91->59|92->60|92->60|92->60|94->62|95->63|97->65|97->65|97->65|98->66|99->67|99->67|99->67|101->69|103->71|103->71|103->71|104->72|105->73|105->73|105->73|107->75|109->77|109->77|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|111->79|111->79|111->79|111->79|112->80|112->80|112->80|113->81|113->81|113->81|113->81|114->82|115->83|129->97|129->97|131->99|144->112|144->112|144->112
                  -- GENERATED --
              */
          