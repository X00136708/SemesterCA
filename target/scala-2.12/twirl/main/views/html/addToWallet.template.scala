
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
/*5.6*/import play.api.Play.current
/*6.6*/import models.shopping.Wallet
/*7.6*/import models.shopping._
/*8.6*/import models.products._
/*9.6*/import models.users._

object addToWallet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Float,models.users.RegisteredUser,models.shopping.Wallet,models.users.User,Form[Wallet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.6*/(amount: Float, registeredUser: models.users.RegisteredUser, wallet: models.shopping.Wallet, user: models.users.User, walletForm: Form[Wallet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*11.6*/import helper._


Seq[Any](format.raw/*10.149*/("""
    """),format.raw/*12.1*/("""
    """),format.raw/*13.5*/("""<!-- Pass page title and user on to main -->
    """),_display_(/*14.6*/main("Wallet", registeredUser)/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""


    """),format.raw/*17.5*/("""<div class="row">
            <div class="col-md-1"></div>
        <div class="col-md-6">
            """),_display_(/*20.14*/if(flash.containsKey("success"))/*20.46*/ {_display_(Seq[Any](format.raw/*20.48*/("""
                """),format.raw/*21.17*/("""<div class="alert alert-success">
                    """),_display_(/*22.22*/flash/*22.27*/.get("success")),format.raw/*22.42*/("""
                """),format.raw/*23.17*/("""</div>
            """)))}),format.raw/*24.14*/("""
            """),_display_(/*25.14*/if(flash.containsKey("failure"))/*25.46*/ {_display_(Seq[Any](format.raw/*25.48*/("""
                """),format.raw/*26.17*/("""<div class="alert alert-success">
                    """),_display_(/*27.22*/flash/*27.27*/.get("failure")),format.raw/*27.42*/("""
                """),format.raw/*28.17*/("""</div>
            """)))}),format.raw/*29.14*/("""  
            """),_display_(/*30.14*/form(action=routes.ShoppingCtrl.addToWallet(amount), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*30.146*/ {_display_(Seq[Any](format.raw/*30.148*/("""
        """),format.raw/*31.37*/("""
        """),_display_(/*32.10*/CSRF/*32.14*/.formField),format.raw/*32.24*/("""
            """),format.raw/*33.13*/("""<div class="form-group">
                """),_display_(/*34.18*/inputText(walletForm("amount"), '_label -> "Add amount", 
                'class -> "form-control input-xs", 'placeholder -> "Amount to add...")),format.raw/*35.87*/("""
                """),_display_(/*36.18*/wallet/*36.24*/.addWallet(amount)),format.raw/*36.42*/("""
            """),format.raw/*37.13*/("""</div>
            <div class="col-md-12">
            <table class="table table-bordered table-hover table-condensed">
                    <thead>
                        """),_display_(/*41.26*/if(registeredUser.getWallet != null)/*41.62*/ {_display_(Seq[Any](format.raw/*41.64*/("""
                        
                    """),format.raw/*43.21*/("""<tr><div class="col-md-6"></div>
                        <th>Wallet amount</th>
                    
                    </tr>
                    </thead>
                    <tbody>
                    
                            
                            <tr>
                                
                                <td>"""),_display_(/*53.38*/wallet/*53.44*/.getWallet()),format.raw/*53.56*/("""</td>
                                <form class="form-control wallet" hidden></form>
                    
                            </tr>
                        
                            
                    </tbody>
                </table>
            </div>

            <div class="col-md-6">
                <p class="text-right">
                        
                    <a href=""""),_display_(/*66.31*/routes/*66.37*/.ShoppingCtrl.addToWallet(0)),format.raw/*66.65*/("""" label class="btn btn-success btn-sm">
                        
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
                  DATE: Tue Apr 17 16:48:06 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/newSemca/semesterca/app/views/addToWallet.scala.html
                  HASH: 10e451048aaa000c3a803e80d360f38e90121cd0
                  MATRIX: 651->13|687->48|724->84|756->115|788->146|1202->174|1419->324|1466->317|1499->341|1532->347|1609->398|1648->428|1688->430|1725->440|1858->546|1899->578|1939->580|1985->598|2068->654|2082->659|2118->674|2164->692|2216->713|2258->728|2299->760|2339->762|2385->780|2468->836|2482->841|2518->856|2564->874|2616->895|2660->912|2802->1044|2843->1046|2881->1084|2919->1095|2932->1099|2963->1109|3005->1123|3075->1166|3241->1311|3287->1330|3302->1336|3341->1354|3383->1368|3587->1545|3632->1581|3672->1583|3748->1631|4122->1978|4137->1984|4170->1996|4609->2408|4624->2414|4673->2442
                  LINES: 24->5|25->6|26->7|27->8|28->9|33->10|36->11|39->10|40->12|41->13|42->14|42->14|42->14|45->17|48->20|48->20|48->20|49->21|50->22|50->22|50->22|51->23|52->24|53->25|53->25|53->25|54->26|55->27|55->27|55->27|56->28|57->29|58->30|58->30|58->30|59->31|60->32|60->32|60->32|61->33|62->34|63->35|64->36|64->36|64->36|65->37|69->41|69->41|69->41|71->43|81->53|81->53|81->53|94->66|94->66|94->66
                  -- GENERATED --
              */
          