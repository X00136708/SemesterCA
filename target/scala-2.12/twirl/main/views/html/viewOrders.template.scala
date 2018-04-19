
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
/*1.2*/import play.api.Play.current
/*2.2*/import models.shopping._
/*3.2*/import models.products._
/*4.2*/import models.users._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.RegisteredUser,List[ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(registeredUser: models.users.RegisteredUser, orders: List[ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.72*/("""
"""),format.raw/*6.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("View Orders", registeredUser)/*7.37*/ {_display_(Seq[Any](format.raw/*7.39*/("""
	"""),format.raw/*8.2*/("""<div class="row"></div>
	<link href=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.62*/("""" rel="stylesheet" />
	
			
	
			
	"""),_display_(/*14.3*/if(flash.containsKey("success"))/*14.35*/ {_display_(Seq[Any](format.raw/*14.37*/("""
        """),format.raw/*15.9*/("""<div class="alert alert-success">
          """),_display_(/*16.12*/flash/*16.17*/.get("success")),format.raw/*16.32*/("""
		"""),format.raw/*17.3*/("""</div>
	""")))}),format.raw/*18.3*/("""

"""),_display_(/*20.2*/for(o<-orders) yield /*20.16*/{_display_(Seq[Any](format.raw/*20.17*/("""
	"""),format.raw/*21.2*/("""<div class="col-sm-7">
	<label>Order Number: """),_display_(/*22.24*/o/*22.25*/.getId),format.raw/*22.31*/("""</label>
	<br>
	<label>Order Date: """),_display_(/*24.22*/o/*24.23*/.getDateString),format.raw/*24.37*/("""</label>
	

		

		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Price</th>
                <th>Quantity</th>
				<th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*40.18*/if(registeredUser.getBasket() != null)/*40.56*/ {_display_(Seq[Any](format.raw/*40.58*/("""
					
                    """),format.raw/*42.21*/("""<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*43.7*/for(i <- o.getItems()) yield /*43.29*/ {_display_(Seq[Any](format.raw/*43.31*/("""
                   
						
						"""),format.raw/*46.7*/("""<td>"""),_display_(/*46.12*/i/*46.13*/.getProduct.getName),format.raw/*46.32*/("""</td>
						<td>&euro; """),_display_(/*47.19*/("%.2f".format(i.getProduct.getPrice))),format.raw/*47.57*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
						<td>&euro; """),_display_(/*49.19*/("%.2f".format(i.getItemTotala))),format.raw/*49.51*/("""</td>                        
						
					</tr>
					
				</tbody>
				
					""")))}),format.raw/*55.7*/("""<!-- End of For loop -->
					
              """)))}),format.raw/*57.16*/("""
			
		"""),format.raw/*59.3*/("""</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*62.68*/("%.2f".format(o.getTotal()))),format.raw/*62.97*/("""</strong></p>
            </div>  
		</div>
		"""),_display_(/*65.4*/if(o.isCancellable())/*65.25*/{_display_(Seq[Any](format.raw/*65.26*/("""

		"""),format.raw/*67.3*/("""<div class="form-group">
				<a href=""""),_display_(/*68.15*/routes/*68.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*68.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
		</div>
	""")))}),format.raw/*70.3*/("""
	"""),format.raw/*71.2*/("""</div>
</div>
</div>


<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*78.24*/("""{"""),format.raw/*78.25*/("""
		"""),format.raw/*79.3*/("""return confirm('Are you sure?');
	"""),format.raw/*80.2*/("""}"""),format.raw/*80.3*/("""
"""),format.raw/*81.1*/("""</script>

""")))}),format.raw/*83.2*/("""


""")))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser,orders:List[ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser,orders)

  def f:((models.users.RegisteredUser,List[ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser,orders) => apply(registeredUser,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 09:20:24 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/viewOrders.scala.html
                  HASH: a317e7a6e3f11e69ef71863365d330de0e3a34f8
                  MATRIX: 651->1|687->31|719->57|751->83|1119->106|1284->176|1311->177|1382->223|1425->258|1464->260|1492->262|1556->300|1570->306|1631->347|1693->383|1734->415|1774->417|1810->426|1882->471|1896->476|1932->491|1962->494|2001->503|2030->506|2060->520|2099->521|2128->523|2201->569|2211->570|2238->576|2301->612|2311->613|2346->627|2640->894|2687->932|2727->934|2782->961|2876->1029|2914->1051|2954->1053|3015->1087|3047->1092|3057->1093|3097->1112|3148->1136|3207->1174|3269->1209|3279->1210|3314->1224|3365->1248|3418->1280|3526->1358|3603->1404|3637->1411|3802->1549|3852->1578|3925->1625|3955->1646|3994->1647|4025->1651|4091->1690|4106->1696|4161->1730|4276->1815|4305->1817|4462->1946|4491->1947|4521->1950|4582->1984|4610->1985|4638->1986|4680->1998
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|52->20|52->20|53->21|54->22|54->22|54->22|56->24|56->24|56->24|72->40|72->40|72->40|74->42|75->43|75->43|75->43|78->46|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|87->55|89->57|91->59|94->62|94->62|97->65|97->65|97->65|99->67|100->68|100->68|100->68|102->70|103->71|110->78|110->78|111->79|112->80|112->80|113->81|115->83
                  -- GENERATED --
              */
          