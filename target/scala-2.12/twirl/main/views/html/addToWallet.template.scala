
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

object addToWallet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.RegisteredUser,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import play.api.Play.current
/*6.2*/import models.shopping._
/*7.2*/import models.products._
/*8.2*/import models.users._


Seq[Any](format.raw/*1.72*/("""



"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*11.2*/main("Wallet", registeredUser)/*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""


"""),format.raw/*14.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*17.4*/if(flash.containsKey("success"))/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
			  """),format.raw/*18.6*/("""<div class="alert alert-success">
			      """),_display_(/*19.11*/flash/*19.16*/.get("success")),format.raw/*19.31*/("""
			  """),format.raw/*20.6*/("""</div>
        """)))}),format.raw/*21.10*/("""
        """),_display_(/*22.10*/if(flash.containsKey("failure"))/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/("""
            """),format.raw/*23.13*/("""<div class="alert alert-success">
                """),_display_(/*24.18*/flash/*24.23*/.get("failure")),format.raw/*24.38*/("""
            """),format.raw/*25.13*/("""</div>
        """)))}),format.raw/*26.10*/("""  
        """),format.raw/*27.9*/("""<script type="text/javascript">
            function promptAmt() """),format.raw/*28.34*/("""{"""),format.raw/*28.35*/("""

                """),format.raw/*30.17*/("""var amount = prompt("Add amount...", "");
                // document.getElementById('wallet').value = amount;
                console.log(amount);
        
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/(""";
          </script>
          
          <div class="col-md-12">
          <table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    <th>Wallet amount</th>
                   
                </tr>
                </thead>
                <tbody>
                 
                        
                        <tr>
                            
                            <td>"""),_display_(/*51.34*/registeredUser/*51.48*/.getWalletAmount()),format.raw/*51.66*/("""</td>
                            <form class="form-control wallet" hidden></form>
                   
                        </tr>
                    
                        
                </tbody>
            </table>
        </div>

        <div class="col-md-6">
            <p class="text-right">
                    
                <a href=""""),_display_(/*64.27*/routes/*64.33*/.ShoppingCtrl.addToWalletSubmit(0)),format.raw/*64.67*/("""" id="amount" onclick="promptAmt()" label class="btn btn-success btn-sm">
                    
                <span class="glyphicon glyphicon-euro"></span><label for ="amount"> Add to wallet</a></label>
            </p>
        </div>
    """)))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser,user)

  def f:((models.users.RegisteredUser,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser,user) => apply(registeredUser,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 21 12:52:10 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/addToWallet.scala.html
                  HASH: b0eeb1c0b8567dbe9cca45d63b442f7acfdb5a88
                  MATRIX: 993->1|1136->76|1172->106|1204->132|1236->158|1287->71|1317->180|1345->181|1417->227|1456->257|1496->259|1526->262|1599->309|1640->341|1680->343|1713->349|1784->393|1798->398|1834->413|1867->419|1914->435|1951->445|1992->477|2032->479|2073->492|2151->543|2165->548|2201->563|2242->576|2289->592|2327->603|2420->668|2449->669|2495->687|2692->856|2721->857|3242->1351|3265->1365|3304->1383|3685->1737|3700->1743|3755->1777
                  LINES: 28->1|31->5|32->6|33->7|34->8|37->1|41->9|42->10|43->11|43->11|43->11|46->14|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|59->27|60->28|60->28|62->30|66->34|66->34|83->51|83->51|83->51|96->64|96->64|96->64
                  -- GENERATED --
              */
          