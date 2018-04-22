
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
/*5.2*/import play.api.Play.current
/*6.2*/import models.shopping.Wallet
/*7.2*/import models.shopping._
/*8.2*/import models.products._
/*9.2*/import models.users._

object addToWallet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Float,models.users.RegisteredUser,models.shopping.Wallet,models.users.User,Form[Wallet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(amount: Float, registeredUser: models.users.RegisteredUser, wallet: models.shopping.Wallet, user: models.users.User, walletForm: Form[Wallet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*11.2*/import helper._


Seq[Any](format.raw/*10.145*/("""
"""),format.raw/*12.1*/("""

"""),format.raw/*14.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*15.2*/main("Wallet", registeredUser)/*15.32*/ {_display_(Seq[Any](format.raw/*15.34*/("""

    """),format.raw/*17.5*/("""<link href=""""),_display_(/*17.18*/routes/*17.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.65*/("""" rel="stylesheet" />
<div class="row">
        <div class="col-md-1"></div>
	<div class="col-md-6">
		"""),_display_(/*21.4*/if(flash.containsKey("success"))/*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
			  """),format.raw/*22.6*/("""<div class="alert alert-success">
			      """),_display_(/*23.11*/flash/*23.16*/.get("success")),format.raw/*23.31*/("""
			  """),format.raw/*24.6*/("""</div>
        """)))}),format.raw/*25.10*/("""
        """),_display_(/*26.10*/if(flash.containsKey("failure"))/*26.42*/ {_display_(Seq[Any](format.raw/*26.44*/("""
            """),format.raw/*27.13*/("""<div class="alert alert-success">
                """),_display_(/*28.18*/flash/*28.23*/.get("failure")),format.raw/*28.38*/("""
            """),format.raw/*29.13*/("""</div>
        """)))}),format.raw/*30.10*/("""  
        """),_display_(/*31.10*/form(action=routes.ShoppingCtrl.addToWallet(amount), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*31.142*/ {_display_(Seq[Any](format.raw/*31.144*/("""
    """),format.raw/*32.33*/("""
    """),_display_(/*33.6*/CSRF/*33.10*/.formField),format.raw/*33.20*/("""
        """),format.raw/*34.9*/("""<div class="form-group">
            """),_display_(/*35.14*/inputText(walletForm("amount"), '_label -> "Donate", 
            'class -> "form-control input-xs", 'placeholder -> "Amount to donate...")),format.raw/*36.86*/("""
            """),_display_(/*37.14*/wallet/*37.20*/.setWallet(amount)),format.raw/*37.38*/("""
        """)))}),format.raw/*38.10*/("""
        """),format.raw/*39.9*/("""</div>
            
                """),_display_(/*41.18*/helper/*41.24*/.form(action = helper.CSRF(routes.CommunityCtrl.donate()))/*41.82*/ {_display_(Seq[Any](format.raw/*41.84*/("""
                """),format.raw/*42.17*/("""<form action=""""),_display_(/*42.32*/routes/*42.38*/.CommunityCtrl.donate()),format.raw/*42.61*/("""" method="POST">

                           
                    <script
                      src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                      data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                      data-amount=""""),_display_(/*48.37*/wallet/*48.43*/.getWallet()),format.raw/*48.55*/(""""
                      data-name="Nu-Wave Games"
                      data-description="Enter your payment details below"
                      data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                      data-locale="auto"
                      data-label="Donate"
                      data-currency="eur">
                      <a href=""""),_display_(/*55.33*/routes/*55.39*/.CommunityCtrl.donate()),format.raw/*55.62*/("""" class="btn btn-success btn-sm"></a>
                    </script>
                    
                    
                  </form>       
                
                    
                
                """)))}),format.raw/*63.18*/("""
            """),format.raw/*64.13*/("""</div>
            </div>
            </div>
    """)))}))
      }
    }
  }

  def render(amount:Float,registeredUser:models.users.RegisteredUser,wallet:models.shopping.Wallet,user:models.users.User,walletForm:Form[Wallet]): play.twirl.api.HtmlFormat.Appendable = apply(amount,registeredUser,wallet,user,walletForm)

  def f:((Float,models.users.RegisteredUser,models.shopping.Wallet,models.users.User,Form[Wallet]) => play.twirl.api.HtmlFormat.Appendable) = (amount,registeredUser,wallet,user,walletForm) => apply(amount,registeredUser,wallet,user,walletForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 11:59:42 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/addToWallet.scala.html
                  HASH: 3704afc85f73a5a873324f5ba1e69b26548eab96
                  MATRIX: 651->9|687->40|724->72|756->99|788->126|1202->150|1419->296|1466->293|1495->313|1526->317|1599->364|1638->394|1678->396|1713->404|1753->417|1768->423|1830->464|1964->572|2005->604|2045->606|2079->613|2151->658|2165->663|2201->678|2235->685|2283->702|2321->713|2362->745|2402->747|2444->761|2523->813|2537->818|2573->833|2615->847|2663->864|2703->877|2845->1009|2886->1011|2920->1045|2953->1052|2966->1056|2997->1066|3034->1076|3100->1115|3261->1255|3303->1270|3318->1276|3357->1294|3399->1305|3436->1315|3502->1354|3517->1360|3584->1418|3624->1420|3670->1438|3712->1453|3727->1459|3771->1482|4070->1754|4085->1760|4118->1772|4531->2158|4546->2164|4590->2187|4844->2410|4886->2424
                  LINES: 24->5|25->6|26->7|27->8|28->9|33->10|36->11|39->10|40->12|42->14|43->15|43->15|43->15|45->17|45->17|45->17|45->17|49->21|49->21|49->21|50->22|51->23|51->23|51->23|52->24|53->25|54->26|54->26|54->26|55->27|56->28|56->28|56->28|57->29|58->30|59->31|59->31|59->31|60->32|61->33|61->33|61->33|62->34|63->35|64->36|65->37|65->37|65->37|66->38|67->39|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|76->48|76->48|76->48|83->55|83->55|83->55|91->63|92->64
                  -- GENERATED --
              */
          