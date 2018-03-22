
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
"""),format.raw/*13.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*14.2*/main("Wallet", registeredUser)/*14.32*/ {_display_(Seq[Any](format.raw/*14.34*/("""


"""),format.raw/*17.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*20.4*/if(flash.containsKey("success"))/*20.36*/ {_display_(Seq[Any](format.raw/*20.38*/("""
			  """),format.raw/*21.6*/("""<div class="alert alert-success">
			      """),_display_(/*22.11*/flash/*22.16*/.get("success")),format.raw/*22.31*/("""
			  """),format.raw/*23.6*/("""</div>
        """)))}),format.raw/*24.10*/("""
        """),_display_(/*25.10*/if(flash.containsKey("failure"))/*25.42*/ {_display_(Seq[Any](format.raw/*25.44*/("""
            """),format.raw/*26.13*/("""<div class="alert alert-success">
                """),_display_(/*27.18*/flash/*27.23*/.get("failure")),format.raw/*27.38*/("""
            """),format.raw/*28.13*/("""</div>
        """)))}),format.raw/*29.10*/("""  
        """),_display_(/*30.10*/form(action=routes.ShoppingCtrl.addToWalletSubmit(amount), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*30.148*/ {_display_(Seq[Any](format.raw/*30.150*/("""
    """),format.raw/*31.33*/("""
    """),_display_(/*32.6*/CSRF/*32.10*/.formField),format.raw/*32.20*/("""
        """),format.raw/*33.9*/("""<div class="form-group">
            """),_display_(/*34.14*/inputText(walletForm("amount"), '_label -> "Add amount", 
            'class -> "form-control input-xs", 'placeholder -> "Amount to add...")),format.raw/*35.83*/("""
            """),_display_(/*36.14*/wallet/*36.20*/.addWallet(amount)),format.raw/*36.38*/("""
        """),format.raw/*37.9*/("""</div>
          <div class="col-md-12">
          <table class="table table-bordered table-hover table-condensed">
                <thead>
                    """),_display_(/*41.22*/if(registeredUser.getWallet != null)/*41.58*/ {_display_(Seq[Any](format.raw/*41.60*/("""
                """),format.raw/*42.17*/("""<tr>
                    <th>Wallet amount</th>
                   
                </tr>
                </thead>
                <tbody>
                 
                        
                        <tr>
                            
                            <td>"""),_display_(/*52.34*/wallet/*52.40*/.getWallet()),format.raw/*52.52*/("""</td>
                            <form class="form-control wallet" hidden></form>
                   
                        </tr>
                    
                        
                </tbody>
            </table>
        </div>

        <div class="col-md-6">
            <p class="text-right">
                    
                <a href=""""),_display_(/*65.27*/routes/*65.33*/.ShoppingCtrl.addToWallet(0)),format.raw/*65.61*/("""" id="amount" onclick="promptAmt()" label class="btn btn-success btn-sm">
                    
                <span class="glyphicon glyphicon-euro"></span><label for ="amount"> Add to wallet</a></label>
            </p>
        </div>
    """)))})))})))}))
      }
    }
  }

  def render(amount:Float,registeredUser:models.users.RegisteredUser,wallet:models.shopping.Wallet,user:models.users.User,walletForm:Form[Wallet]): play.twirl.api.HtmlFormat.Appendable = apply(amount,registeredUser,wallet,user,walletForm)

  def f:((Float,models.users.RegisteredUser,models.shopping.Wallet,models.users.User,Form[Wallet]) => play.twirl.api.HtmlFormat.Appendable) = (amount,registeredUser,wallet,user,walletForm) => apply(amount,registeredUser,wallet,user,walletForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 12:54:10 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/addToWallet.scala.html
                  HASH: e93a222abbae7d5162785c5d2702d318743d477e
                  MATRIX: 651->5|687->35|724->66|756->92|788->118|1202->141|1419->286|1466->284|1494->302|1522->303|1594->349|1633->379|1673->381|1703->384|1776->431|1817->463|1857->465|1890->471|1961->515|1975->520|2011->535|2044->541|2091->557|2128->567|2169->599|2209->601|2250->614|2328->665|2342->670|2378->685|2419->698|2466->714|2505->726|2653->864|2694->866|2727->899|2759->905|2772->909|2803->919|2839->928|2904->966|3065->1106|3106->1120|3121->1126|3160->1144|3196->1153|3384->1314|3429->1350|3469->1352|3514->1369|3814->1642|3829->1648|3862->1660|4243->2014|4258->2020|4307->2048
                  LINES: 24->5|25->6|26->7|27->8|28->9|33->10|36->11|39->10|40->12|41->13|42->14|42->14|42->14|45->17|48->20|48->20|48->20|49->21|50->22|50->22|50->22|51->23|52->24|53->25|53->25|53->25|54->26|55->27|55->27|55->27|56->28|57->29|58->30|58->30|58->30|59->31|60->32|60->32|60->32|61->33|62->34|63->35|64->36|64->36|64->36|65->37|69->41|69->41|69->41|70->42|80->52|80->52|80->52|93->65|93->65|93->65
                  -- GENERATED --
              */
          