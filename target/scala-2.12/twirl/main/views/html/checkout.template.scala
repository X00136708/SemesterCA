
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
                              
                              """),format.raw/*77.31*/("""function PayPalForm()"""),format.raw/*77.52*/("""{"""),format.raw/*77.53*/("""
                                  
                               """),format.raw/*79.32*/("""var paypalEmail = prompt("1) Please enter your email address and password as provided...", "")
                               var paypalPassword = prompt("2) Please enter your paypal password...", "") 
                              """),format.raw/*81.31*/("""}"""),format.raw/*81.32*/("""
                             
                              """),format.raw/*83.31*/("""function CreditCardForm()"""),format.raw/*83.56*/("""{"""),format.raw/*83.57*/("""
                                   """),format.raw/*84.36*/("""alert("Please enter your Credit card details...");
                              """),format.raw/*85.31*/("""}"""),format.raw/*85.32*/("""
                            """),format.raw/*86.29*/("""</script>
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
                    <a href=""""),_display_(/*104.31*/routes/*104.37*/.ShoppingCtrl.placeOrder()),format.raw/*104.63*/("""" class="btn btn-success btn-sm">
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
                  DATE: Sat Mar 31 23:03:26 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/checkout.scala.html
                  HASH: 9f0d299f10c8d44df47f9c2c77d5d45beb4cc39c
                  MATRIX: 972->1|1090->55|1126->86|1158->113|1212->46|1246->139|1274->141|1347->188|1388->220|1428->222|1461->228|1537->278|1578->310|1618->312|1652->319|1724->364|1738->369|1774->384|1808->391|1856->408|1894->419|1935->451|1975->453|2017->467|2096->519|2110->524|2146->539|2188->553|2236->570|2271->578|2592->872|2639->910|2679->912|2729->934|2840->1018|2909->1071|2949->1073|2999->1095|3061->1130|3071->1131|3111->1150|3174->1186|3184->1187|3233->1215|3303->1258|3351->1285|3421->1328|3473->1359|3536->1395|3546->1396|3581->1410|3692->1490|3764->1531|3796->1536|3977->1690|4055->1746|4377->2040|4406->2041|4498->2105|4959->2538|4988->2539|5080->2603|5129->2624|5158->2625|5255->2694|5517->2928|5546->2929|5637->2992|5690->3017|5719->3018|5784->3055|5894->3137|5923->3138|5981->3168|6694->3853|6710->3859|6758->3885
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|45->13|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|59->27|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|80->48|80->48|80->48|83->51|84->52|85->53|89->57|89->57|97->65|97->65|99->67|107->75|107->75|109->77|109->77|109->77|111->79|113->81|113->81|115->83|115->83|115->83|116->84|117->85|117->85|118->86|136->104|136->104|136->104
                  -- GENERATED --
              */
          