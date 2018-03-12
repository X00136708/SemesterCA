
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.RegisteredUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.47*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", registeredUser)/*9.41*/ {_display_(Seq[Any](format.raw/*9.43*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
        """)))}),format.raw/*19.10*/("""
        """),_display_(/*20.10*/if(flash.containsKey("failure"))/*20.42*/ {_display_(Seq[Any](format.raw/*20.44*/("""
            """),format.raw/*21.13*/("""<div class="alert alert-success">
                """),_display_(/*22.18*/flash/*22.23*/.get("failure")),format.raw/*22.38*/("""
            """),format.raw/*23.13*/("""</div>
        """)))}),format.raw/*24.10*/("""  

		"""),format.raw/*26.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
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
                        <td><a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*49.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*50.39*/routes/*50.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*50.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
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
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.ShoppingCtrl.emptyBasket()),format.raw/*64.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.ShoppingCtrl.placeOrder()),format.raw/*70.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*80.24*/("""{"""),format.raw/*80.25*/("""
		"""),format.raw/*81.3*/("""return confirm('Are you sure?');
	"""),format.raw/*82.2*/("""}"""),format.raw/*82.3*/("""
"""),format.raw/*83.1*/("""</script>
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
                  DATE: Mon Mar 12 11:40:27 GMT 2018
                  SOURCE: /home/wdd/webapps/PlayLab5-master/app/views/basket.scala.html
                  HASH: 482449865401ae8cfca5d10dcd7532411745fc3e
                  MATRIX: 970->1|1088->50|1124->80|1156->106|1210->46|1239->131|1266->132|1337->178|1384->217|1423->219|1453->222|1526->269|1567->301|1607->303|1640->309|1711->353|1725->358|1761->373|1794->379|1841->395|1878->405|1919->437|1959->439|2000->452|2078->503|2092->508|2128->523|2169->536|2216->552|2249->558|2603->885|2650->923|2690->925|2739->946|2849->1029|2918->1082|2958->1084|3007->1105|3068->1139|3078->1140|3118->1159|3180->1194|3190->1195|3239->1223|3308->1265|3356->1292|3425->1334|3477->1365|3539->1400|3549->1401|3584->1415|3655->1459|3670->1465|3723->1497|3852->1599|3867->1605|3917->1634|4058->1744|4129->1784|4160->1788|4337->1938|4415->1994|4622->2174|4637->2180|4685->2207|5007->2502|5022->2508|5069->2534|5396->2833|5425->2834|5455->2837|5516->2871|5544->2872|5572->2873
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|58->26|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|85->53|86->54|90->58|90->58|96->64|96->64|96->64|102->70|102->70|102->70|112->80|112->80|113->81|114->82|114->82|115->83
                  -- GENERATED --
              */
          