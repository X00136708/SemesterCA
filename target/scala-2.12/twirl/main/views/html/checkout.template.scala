
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

		"""),format.raw/*27.3*/("""<table class="table table-bordered table-hover table-condensed">
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
                """),_display_(/*40.18*/if(registeredUser.getBasket() != null)/*40.56*/ {_display_(Seq[Any](format.raw/*40.58*/("""
                    """),format.raw/*41.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*42.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*42.75*/ {_display_(Seq[Any](format.raw/*42.77*/("""
                    """),format.raw/*43.21*/("""<tr>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getProduct.getName),format.raw/*44.50*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getDescription()),format.raw/*45.59*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal))),format.raw/*47.68*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                       
                    </tr>
                    """)))}),format.raw/*51.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*52.16*/("""
			"""),format.raw/*53.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*57.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*57.125*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
                
                        <head>
                         <script type="text/javascript">
                           window.onload = function() """),format.raw/*64.55*/("""{"""),format.raw/*64.56*/("""
                       
                               """),format.raw/*66.32*/("""var PayPal = document.getElementById('PayPal');
                               var CreditCard = document.getElementById('CreditCard');
                               
                       
                               PayPal.onclick = handler;
                               CreditCard.onclick = handler;
                              
                       
                           """),format.raw/*74.28*/("""}"""),format.raw/*74.29*/("""
                       
                           """),format.raw/*76.28*/("""function handler() """),format.raw/*76.47*/("""{"""),format.raw/*76.48*/("""
                               """),format.raw/*77.32*/("""alert('clicked');
                           """),format.raw/*78.28*/("""}"""),format.raw/*78.29*/("""
                         """),format.raw/*79.26*/("""</script>
                        </head>
                        <body>
                         <input type="radio" name="paymentType" id="PayPal" value="PayPal" />
                         <label for="PayPal">PayPal</label>
                         <input type="radio" name="paymentType" id="CreditCard" value="CreditCard" />
                         <label for="CreditCard">Credit Card</label>
                        
                        </body>
                      <br>
                    

            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*93.31*/routes/*93.37*/.ShoppingCtrl.placeOrder()),format.raw/*93.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Confirm purchase</a>
                </p>
            </div>
    

        
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*106.24*/("""{"""),format.raw/*106.25*/("""
		"""),format.raw/*107.3*/("""return confirm('Are you sure?');
	"""),format.raw/*108.2*/("""}"""),format.raw/*108.3*/("""
"""),format.raw/*109.1*/("""</script>
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
                  DATE: Wed Mar 14 21:47:01 GMT 2018
                  SOURCE: /home/wdd/semesterca/app/views/checkout.scala.html
                  HASH: e2fed68b02f3b2673ad30d4a56776ef4c4d382b7
                  MATRIX: 972->1|1090->51|1126->81|1158->107|1212->46|1242->132|1269->133|1341->179|1382->211|1422->213|1452->216|1525->263|1566->295|1606->297|1639->303|1710->347|1724->352|1760->367|1793->373|1840->389|1877->399|1918->431|1958->433|1999->446|2077->497|2091->502|2127->517|2168->530|2215->546|2248->552|2556->833|2603->871|2643->873|2692->894|2802->977|2871->1030|2911->1032|2960->1053|3021->1087|3031->1088|3071->1107|3133->1142|3143->1143|3192->1171|3261->1213|3309->1240|3378->1282|3430->1313|3492->1348|3502->1349|3537->1363|3645->1440|3716->1480|3747->1484|3924->1634|4002->1690|4265->1925|4294->1926|4378->1982|4797->2373|4826->2374|4906->2426|4953->2445|4982->2446|5042->2478|5115->2523|5144->2524|5198->2550|5833->3158|5848->3164|5895->3190|6241->3507|6271->3508|6302->3511|6364->3545|6393->3546|6422->3547
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|45->13|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|59->27|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|80->48|80->48|80->48|83->51|84->52|85->53|89->57|89->57|96->64|96->64|98->66|106->74|106->74|108->76|108->76|108->76|109->77|110->78|110->78|111->79|125->93|125->93|125->93|138->106|138->106|139->107|140->108|140->108|141->109
                  -- GENERATED --
              */
          