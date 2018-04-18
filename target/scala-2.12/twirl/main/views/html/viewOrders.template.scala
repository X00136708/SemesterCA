
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
                        <td>&euro; """),_display_(/*49.37*/("%.2f".format(i.getItemTotala))),format.raw/*49.69*/("""</td>                        
					</tr>
				</tbody>
					""")))}),format.raw/*52.7*/("""<!-- End of For loop -->
					
              """)))}),format.raw/*54.16*/("""
			
		"""),format.raw/*56.3*/("""</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*59.68*/("%.2f".format(o.getTotal()))),format.raw/*59.97*/("""</strong></p>
            </div>  
		</div>
		"""),_display_(/*62.4*/if(o.isCancellable())/*62.25*/{_display_(Seq[Any](format.raw/*62.26*/("""

		"""),format.raw/*64.3*/("""<div class="form-group">
				<a href=""""),_display_(/*65.15*/routes/*65.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*65.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
		</div>
	""")))}),format.raw/*67.3*/("""
	"""),format.raw/*68.2*/("""</div>
</div>
</div>


<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*75.24*/("""{"""),format.raw/*75.25*/("""
		"""),format.raw/*76.3*/("""return confirm('Are you sure?');
	"""),format.raw/*77.2*/("""}"""),format.raw/*77.3*/("""
"""),format.raw/*78.1*/("""</script>
""")))}),format.raw/*79.2*/("""


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
                  DATE: Wed Apr 18 12:57:03 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewOrders.scala.html
                  HASH: 872428fd3eace8f43829c16c719f995989e24274
                  MATRIX: 651->1|687->32|719->59|751->86|1119->110|1284->180|1312->182|1384->229|1427->264|1466->266|1495->269|1560->308|1574->314|1635->355|1702->396|1743->428|1783->430|1820->440|1893->486|1907->491|1943->506|1974->510|2014->520|2045->525|2075->539|2114->540|2144->543|2218->590|2228->591|2255->597|2320->635|2330->636|2365->650|2675->933|2722->971|2762->973|2819->1002|2914->1071|2952->1093|2992->1095|3056->1132|3088->1137|3098->1138|3138->1157|3190->1182|3249->1220|3312->1256|3322->1257|3357->1271|3427->1314|3480->1346|3573->1409|3652->1457|3688->1466|3856->1607|3906->1636|3982->1686|4012->1707|4051->1708|4084->1714|4151->1754|4166->1760|4221->1794|4338->1881|4368->1884|4532->2020|4561->2021|4592->2025|4654->2060|4682->2061|4711->2063|4753->2075
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|52->20|52->20|53->21|54->22|54->22|54->22|56->24|56->24|56->24|72->40|72->40|72->40|74->42|75->43|75->43|75->43|78->46|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|84->52|86->54|88->56|91->59|91->59|94->62|94->62|94->62|96->64|97->65|97->65|97->65|99->67|100->68|107->75|107->75|108->76|109->77|109->77|110->78|111->79
                  -- GENERATED --
              */
          