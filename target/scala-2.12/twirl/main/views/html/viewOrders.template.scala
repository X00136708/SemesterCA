
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.RegisteredUser,List[ShopOrder],models.shopping.Log,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(registeredUser: models.users.RegisteredUser, orders: List[ShopOrder],log:models.shopping.Log):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.96*/("""
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
					"""),_display_(/*52.7*/log/*52.10*/.addOrder(o.getId,o.getDateString,i.getProduct.getName,i.getQuantity,o.getTotal(),o.isCancellable)),format.raw/*52.108*/("""
					
				"""),format.raw/*54.5*/("""</tbody>
				
					""")))}),format.raw/*56.7*/("""<!-- End of For loop -->
					
              """)))}),format.raw/*58.16*/("""
			
		"""),format.raw/*60.3*/("""</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*63.68*/("%.2f".format(o.getTotal()))),format.raw/*63.97*/("""</strong></p>
            </div>  
		</div>
		"""),_display_(/*66.4*/if(o.isCancellable())/*66.25*/{_display_(Seq[Any](format.raw/*66.26*/("""

		"""),format.raw/*68.3*/("""<div class="form-group">
				<a href=""""),_display_(/*69.15*/routes/*69.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*69.55*/("""" class="btn-md btn-default btn" onclick="return confirmDel();">Cancel Order</a>
		</div>
	""")))}),format.raw/*71.3*/("""
	"""),format.raw/*72.2*/("""</div>
</div>
</div>


<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*79.24*/("""{"""),format.raw/*79.25*/("""
		"""),format.raw/*80.3*/("""return confirm('Are you sure?');
	"""),format.raw/*81.2*/("""}"""),format.raw/*81.3*/("""
"""),format.raw/*82.1*/("""</script>

""")))}),format.raw/*84.2*/("""


""")))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser,orders:List[ShopOrder],log:models.shopping.Log): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser,orders,log)

  def f:((models.users.RegisteredUser,List[ShopOrder],models.shopping.Log) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser,orders,log) => apply(registeredUser,orders,log)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 11:50:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewOrders.scala.html
                  HASH: 549d3fdb5aa799d92ee19a6175ecee4c77d21ab1
                  MATRIX: 651->1|687->32|719->59|751->86|1139->110|1328->204|1356->206|1428->253|1471->288|1510->290|1539->293|1604->332|1618->338|1679->379|1746->420|1787->452|1827->454|1864->464|1937->510|1951->515|1987->530|2018->534|2058->544|2089->549|2119->563|2158->564|2188->567|2262->614|2272->615|2299->621|2364->659|2374->660|2409->674|2719->957|2766->995|2806->997|2863->1026|2958->1095|2996->1117|3036->1119|3100->1156|3132->1161|3142->1162|3182->1181|3234->1206|3293->1244|3356->1280|3366->1281|3401->1295|3453->1320|3506->1352|3589->1409|3601->1412|3721->1510|3761->1523|3813->1545|3892->1593|3928->1602|4096->1743|4146->1772|4222->1822|4252->1843|4291->1844|4324->1850|4391->1890|4406->1896|4461->1930|4585->2024|4615->2027|4779->2163|4808->2164|4839->2168|4901->2203|4929->2204|4958->2206|5002->2220
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|52->20|52->20|53->21|54->22|54->22|54->22|56->24|56->24|56->24|72->40|72->40|72->40|74->42|75->43|75->43|75->43|78->46|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|84->52|84->52|84->52|86->54|88->56|90->58|92->60|95->63|95->63|98->66|98->66|98->66|100->68|101->69|101->69|101->69|103->71|104->72|111->79|111->79|112->80|113->81|113->81|114->82|116->84
                  -- GENERATED --
              */
          