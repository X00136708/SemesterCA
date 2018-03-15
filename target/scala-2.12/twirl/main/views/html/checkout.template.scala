
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
                            <p id="demo"></p>
                            <script type="text/javascript">
                              window.onload = function() """),format.raw/*65.58*/("""{"""),format.raw/*65.59*/("""
                          
                                  """),format.raw/*67.35*/("""var PayPal = document.getElementById('PayPal');
                                  var CreditCard = document.getElementById('CreditCard');
                                  
                          
                                  PayPal.onclick = PayPalForm;
                                  CreditCard.onclick = CreditCardForm;
                                 
                          
                              """),format.raw/*75.31*/("""}"""),format.raw/*75.32*/("""
                              
                              """),format.raw/*77.31*/("""function PayPalForm() """),format.raw/*77.53*/("""{"""),format.raw/*77.54*/("""
                                  
                               """),format.raw/*79.32*/("""var paypalEmail = prompt("1) Please enter your email address...", "")
                               var paypalPassword = prompt("2) Please enter your password...", "")
                               document.getElementById("demo").innerHTML = "Hey " +paypalEmail
                                   
                              """),format.raw/*83.31*/("""}"""),format.raw/*83.32*/("""
                              """),format.raw/*84.31*/("""function CreditCardForm()"""),format.raw/*84.56*/("""{"""),format.raw/*84.57*/("""
                                   """),format.raw/*85.36*/("""alert("Please enter your Credit card details...");
                              """),format.raw/*86.31*/("""}"""),format.raw/*86.32*/("""
                            """),format.raw/*87.29*/("""</script>
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
                    <a href=""""),_display_(/*102.31*/routes/*102.37*/.ShoppingCtrl.placeOrder()),format.raw/*102.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Confirm purchase</a>
                </p>
            </div>
    

        
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*115.24*/("""{"""),format.raw/*115.25*/("""
		"""),format.raw/*116.3*/("""return confirm('Are you sure?');
	"""),format.raw/*117.2*/("""}"""),format.raw/*117.3*/("""
"""),format.raw/*118.1*/("""</script>
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
                  DATE: Thu Mar 15 13:44:39 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/checkout.scala.html
                  HASH: 4eda8bf3e78e01453d29b04fecb323eed121daf3
                  MATRIX: 972->1|1090->51|1126->81|1158->107|1212->46|1242->132|1269->133|1341->179|1382->211|1422->213|1452->216|1525->263|1566->295|1606->297|1639->303|1710->347|1724->352|1760->367|1793->373|1840->389|1877->399|1918->431|1958->433|1999->446|2077->497|2091->502|2127->517|2168->530|2215->546|2248->552|2556->833|2603->871|2643->873|2692->894|2802->977|2871->1030|2911->1032|2960->1053|3021->1087|3031->1088|3071->1107|3133->1142|3143->1143|3192->1171|3261->1213|3309->1240|3378->1282|3430->1313|3492->1348|3502->1349|3537->1363|3645->1440|3716->1480|3747->1484|3924->1634|4002->1690|4316->1976|4345->1977|4435->2039|4888->2464|4917->2465|5007->2527|5057->2549|5086->2550|5181->2617|5539->2947|5568->2948|5627->2979|5680->3004|5709->3005|5773->3041|5882->3122|5911->3123|5968->3152|6637->3793|6653->3799|6701->3825|7047->4142|7077->4143|7108->4146|7170->4180|7199->4181|7228->4182
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|45->13|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|59->27|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|80->48|80->48|80->48|83->51|84->52|85->53|89->57|89->57|97->65|97->65|99->67|107->75|107->75|109->77|109->77|109->77|111->79|115->83|115->83|116->84|116->84|116->84|117->85|118->86|118->86|119->87|134->102|134->102|134->102|147->115|147->115|148->116|149->117|149->117|150->118
                  -- GENERATED --
              */
          