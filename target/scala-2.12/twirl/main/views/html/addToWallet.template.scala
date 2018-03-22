
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

object addToWallet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Double,models.users.RegisteredUser,models.shopping.Wallet,models.users.User,Form[Wallet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(amount: Double, registeredUser: models.users.RegisteredUser, wallet: models.shopping.Wallet, user: models.users.User, walletForm: Form[Wallet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*11.2*/import helper._


Seq[Any](format.raw/*10.146*/("""
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
        """),_display_(/*30.10*/form(action=routes.ShoppingCtrl.addToWallet(amount), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*30.142*/ {_display_(Seq[Any](format.raw/*30.144*/("""
    """),format.raw/*31.33*/("""
    """),_display_(/*32.6*/CSRF/*32.10*/.formField),format.raw/*32.20*/("""
        """),format.raw/*33.9*/("""<div class="form-group">
            """),_display_(/*34.14*/inputText(walletForm("amount"), '_label -> "Add amount", 
            'class -> "form-control input-xs", 'placeholder -> "Amount to add...")),format.raw/*35.83*/("""
            """),_display_(/*36.14*/wallet/*36.20*/.addWallet(amount)),format.raw/*36.38*/(""";
        </div>
          <div class="col-md-12">
          <table class="table table-bordered table-hover table-condensed">
                <thead>
                    """),_display_(/*41.22*/if(registeredUser.getWallet != null)/*41.58*/ {_display_(Seq[Any](format.raw/*41.60*/("""
                      
                """),format.raw/*43.17*/("""<tr>
                    <th>Wallet amount</th>
                   
                </tr>
                </thead>
                <tbody>
                 
                        
                        <tr>
                            
                            <td>"""),_display_(/*53.34*/wallet/*53.40*/.getWallet()),format.raw/*53.52*/("""</td>
                            <form class="form-control wallet" hidden></form>
                   
                        </tr>
                    
                        
                </tbody>
            </table>
        </div>

        <div class="col-md-6">
            <p class="text-right">
                    
                <a href=""""),_display_(/*66.27*/routes/*66.33*/.ShoppingCtrl.addToWallet(0)),format.raw/*66.61*/("""" label class="btn btn-success btn-sm">
                    
                <span class="glyphicon glyphicon-euro"></span><label for ="amount"> Add to wallet</a></label>
            </p>
        </div>
    """)))})))})))}))
      }
    }
  }

  def render(amount:Double,registeredUser:models.users.RegisteredUser,wallet:models.shopping.Wallet,user:models.users.User,walletForm:Form[Wallet]): play.twirl.api.HtmlFormat.Appendable = apply(amount,registeredUser,wallet,user,walletForm)

  def f:((Double,models.users.RegisteredUser,models.shopping.Wallet,models.users.User,Form[Wallet]) => play.twirl.api.HtmlFormat.Appendable) = (amount,registeredUser,wallet,user,walletForm) => apply(amount,registeredUser,wallet,user,walletForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 13:45:20 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/addToWallet.scala.html
                  HASH: 18ead442282783fc3a73bc629ab38312ca277d56
                  MATRIX: 651->5|687->35|724->66|756->92|788->118|1203->141|1421->287|1468->285|1496->303|1524->304|1596->350|1635->380|1675->382|1705->385|1778->432|1819->464|1859->466|1892->472|1963->516|1977->521|2013->536|2046->542|2093->558|2130->568|2171->600|2211->602|2252->615|2330->666|2344->671|2380->686|2421->699|2468->715|2507->727|2649->859|2690->861|2723->894|2755->900|2768->904|2799->914|2835->923|2900->961|3061->1101|3102->1115|3117->1121|3156->1139|3354->1310|3399->1346|3439->1348|3507->1388|3807->1661|3822->1667|3855->1679|4236->2033|4251->2039|4300->2067
                  LINES: 24->5|25->6|26->7|27->8|28->9|33->10|36->11|39->10|40->12|41->13|42->14|42->14|42->14|45->17|48->20|48->20|48->20|49->21|50->22|50->22|50->22|51->23|52->24|53->25|53->25|53->25|54->26|55->27|55->27|55->27|56->28|57->29|58->30|58->30|58->30|59->31|60->32|60->32|60->32|61->33|62->34|63->35|64->36|64->36|64->36|69->41|69->41|69->41|71->43|81->53|81->53|81->53|94->66|94->66|94->66
                  -- GENERATED --
              */
          