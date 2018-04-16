
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



"""),_display_(/*8.2*/helper/*8.8*/.form(action = helper.CSRF(routes.ShoppingCtrl.placeOrder()))/*8.69*/ {_display_(Seq[Any](format.raw/*8.71*/("""

"""),format.raw/*10.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*11.2*/main("Purchase", registeredUser)/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""


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
        

		"""),format.raw/*29.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
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
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                        <td>&euro; """),_display_(/*49.37*/("%.2f".format(i.getItemTotal))),format.raw/*49.68*/("""</td>
                       
                    </tr>
                    """)))}),format.raw/*52.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*53.16*/("""
              
			"""),format.raw/*55.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*59.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*59.125*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                      <br>
                     
                      <form action=""""),_display_(/*67.38*/routes/*67.44*/.ShoppingCtrl.placeOrder()),format.raw/*67.70*/("""" method="POST">
                           
                        <script
                          src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                          data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                          data-amount=""""),_display_(/*72.41*/registeredUser/*72.55*/.getBasket.getBasketTotalPlus),format.raw/*72.84*/(""""
                          data-name="Nu-Wave Games"
                          data-description="Enter your payment details below"
                          data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                          data-locale="auto"
                          data-currency="eur">
                          <a href=""""),_display_(/*78.37*/routes/*78.43*/.ShoppingCtrl.placeOrder()),format.raw/*78.69*/("""" class="btn btn-success btn-sm"></a>
                        </script>
                        
                        
                      </form>
                    
            
                    
                   
                </p>
            </div>
            </div>
    

        
        </div>
    </div>
</div>
""")))}),format.raw/*96.2*/("""

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
                  DATE: Mon Apr 16 16:38:26 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/checkout.scala.html
                  HASH: a9d25b55beff1f84c77dc571d9d7b198feec09c7
                  MATRIX: 972->1|1090->51|1126->81|1158->107|1212->46|1242->133|1255->139|1324->200|1363->202|1392->204|1464->250|1505->282|1545->284|1575->287|1648->334|1689->366|1729->368|1762->374|1833->418|1847->423|1883->438|1916->444|1963->460|2000->470|2041->502|2081->504|2122->517|2200->568|2214->573|2250->588|2291->601|2338->617|2380->632|2663->888|2710->926|2750->928|2799->949|2909->1032|2978->1085|3018->1087|3067->1108|3128->1142|3138->1143|3178->1162|3247->1204|3295->1231|3382->1291|3392->1292|3427->1306|3496->1348|3548->1379|3656->1456|3727->1496|3773->1515|3950->1665|4028->1721|4291->1957|4306->1963|4353->1989|4661->2270|4684->2284|4734->2313|5122->2674|5137->2680|5184->2706|5549->3041
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|40->8|40->8|40->8|42->10|43->11|43->11|43->11|46->14|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|61->29|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|80->48|80->48|80->48|81->49|81->49|84->52|85->53|87->55|91->59|91->59|99->67|99->67|99->67|104->72|104->72|104->72|110->78|110->78|110->78|128->96
                  -- GENERATED --
              */
          