
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

object checkout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.RegisteredUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import play.api.Play.current
/*6.2*/import models.shopping._
/*7.2*/import models.products._


Seq[Any](format.raw/*1.47*/("""



"""),format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*10.2*/main("Purchase", registeredUser)/*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""


"""),format.raw/*13.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*16.4*/if(flash.containsKey("success"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
			  """),format.raw/*17.6*/("""<div class="alert alert-success">
			      """),_display_(/*18.11*/flash/*18.16*/.get("success")),format.raw/*18.31*/("""
			  """),format.raw/*19.6*/("""</div>
        """)))}),format.raw/*20.10*/("""
        """),_display_(/*21.10*/if(flash.containsKey("failure"))/*21.42*/ {_display_(Seq[Any](format.raw/*21.44*/("""
            """),format.raw/*22.13*/("""<div class="alert alert-success">
                """),_display_(/*23.18*/flash/*23.23*/.get("failure")),format.raw/*23.38*/("""
            """),format.raw/*24.13*/("""</div>
        """)))}),format.raw/*25.10*/("""  
        

		"""),format.raw/*28.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
             
			</tr>
			</thead>
			<tbody>
                """),_display_(/*41.18*/if(registeredUser.getBasket() != null)/*41.56*/ {_display_(Seq[Any](format.raw/*41.58*/("""
                    """),format.raw/*42.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*43.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*43.75*/ {_display_(Seq[Any](format.raw/*43.77*/("""
                    """),format.raw/*44.21*/("""<tr>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getName),format.raw/*45.50*/("""</td>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getProduct.getDescription()),format.raw/*46.59*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getPrice))),format.raw/*47.64*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getItemTotal))),format.raw/*48.68*/("""</td>
                        <td>"""),_display_(/*49.30*/i/*49.31*/.getQuantity()),format.raw/*49.45*/("""</td>
                       
                    </tr>
                    """)))}),format.raw/*52.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*53.16*/("""
			"""),format.raw/*54.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*58.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*58.125*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
               
                        <head>
                            <p id="demo"></p>
                            <script type="text/javascript">
                              window.onload = function() """),format.raw/*66.58*/("""{"""),format.raw/*66.59*/("""
                          
                                  """),format.raw/*68.35*/("""var PayPal = document.getElementById('PayPal');
                                  var CreditCard = document.getElementById('CreditCard');
                                  
                          
                                  PayPal.onclick = PayPalForm;
                                  CreditCard.onclick = CreditCardForm;
                                 
                          
                              """),format.raw/*76.31*/("""}"""),format.raw/*76.32*/("""
                              
                              """),format.raw/*78.31*/("""function PayPalForm()"""),format.raw/*78.52*/("""{"""),format.raw/*78.53*/("""
                                  
                               """),format.raw/*80.32*/("""var paypalEmail = prompt("1) Please enter your email address and password as provided...", "")
                               var paypalPassword = prompt("2) Please enter your paypal password...", "") 
                              """),format.raw/*82.31*/("""}"""),format.raw/*82.32*/("""
                             
                              """),format.raw/*84.31*/("""function CreditCardForm()"""),format.raw/*84.56*/("""{"""),format.raw/*84.57*/("""
                                   """),format.raw/*85.36*/("""alert("Please enter your Credit card details...");
                              """),format.raw/*86.31*/("""}"""),format.raw/*86.32*/("""
                            """),format.raw/*87.29*/("""</script>
                        </head>
                       


                      <br>
                      <form action="form-control payment" method="POST">
                        <script
                          src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                          data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                          data-amount="999"
                          data-name="Demo Site"
                          data-description="Example charge"
                          data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                          data-locale="auto"
                          data-currency="eur">
                        </script>
                      </form>

            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*108.31*/routes/*108.37*/.ShoppingCtrl.placeOrder()),format.raw/*108.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Confirm purchase</a>
                </p>
            </div>
    

        
        </div>
    </div>
</div>


""")))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser)

  def f:((models.users.RegisteredUser) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser) => apply(registeredUser)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 01:04:50 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/checkout.scala.html
                  HASH: cbc20c2e81d367e65ff2c854017a659c6b1098a9
                  MATRIX: 972->1|1090->51|1126->81|1158->107|1212->46|1242->132|1269->133|1341->179|1382->211|1422->213|1452->216|1525->263|1566->295|1606->297|1639->303|1710->347|1724->352|1760->367|1793->373|1840->389|1877->399|1918->431|1958->433|1999->446|2077->497|2091->502|2127->517|2168->530|2215->546|2257->561|2565->842|2612->880|2652->882|2701->903|2811->986|2880->1039|2920->1041|2969->1062|3030->1096|3040->1097|3080->1116|3142->1151|3152->1152|3201->1180|3270->1222|3318->1249|3387->1291|3439->1322|3501->1357|3511->1358|3546->1372|3654->1449|3725->1489|3756->1493|3933->1643|4011->1699|4325->1985|4354->1986|4444->2048|4897->2473|4926->2474|5016->2536|5065->2557|5094->2558|5189->2625|5449->2857|5478->2858|5567->2919|5620->2944|5649->2945|5713->2981|5822->3062|5851->3063|5908->3092|6814->3970|6830->3976|6878->4002
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|45->13|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|60->28|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|81->49|81->49|81->49|84->52|85->53|86->54|90->58|90->58|98->66|98->66|100->68|108->76|108->76|110->78|110->78|110->78|112->80|114->82|114->82|116->84|116->84|116->84|117->85|118->86|118->86|119->87|140->108|140->108|140->108
                  -- GENERATED --
              */
          