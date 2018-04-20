
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
					"""),_display_(/*52.7*/log/*52.10*/.addOrder(o.getId,o.getDateString,i.getProduct.getName,i.getQuantity,o.getTotal())),format.raw/*52.92*/("""
					
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
                  DATE: Fri Apr 20 14:49:33 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA/app/views/viewOrders.scala.html
                  HASH: 2f322098f998eab00d50914da6ccb109ffc92d63
                  MATRIX: 651->1|687->31|719->57|751->83|1139->106|1328->200|1355->201|1426->247|1469->282|1508->284|1536->286|1600->324|1614->330|1675->371|1737->407|1778->439|1818->441|1854->450|1926->495|1940->500|1976->515|2006->518|2045->527|2074->530|2104->544|2143->545|2172->547|2245->593|2255->594|2282->600|2345->636|2355->637|2390->651|2684->918|2731->956|2771->958|2826->985|2920->1053|2958->1075|2998->1077|3059->1111|3091->1116|3101->1117|3141->1136|3192->1160|3251->1198|3313->1233|3323->1234|3358->1248|3409->1272|3462->1304|3542->1358|3554->1361|3657->1443|3695->1454|3745->1474|3822->1520|3856->1527|4021->1665|4071->1694|4144->1741|4174->1762|4213->1763|4244->1767|4310->1806|4325->1812|4380->1846|4502->1938|4531->1940|4688->2069|4717->2070|4747->2073|4808->2107|4836->2108|4864->2109|4906->2121
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|52->20|52->20|53->21|54->22|54->22|54->22|56->24|56->24|56->24|72->40|72->40|72->40|74->42|75->43|75->43|75->43|78->46|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|84->52|84->52|84->52|86->54|88->56|90->58|92->60|95->63|95->63|98->66|98->66|98->66|100->68|101->69|101->69|101->69|103->71|104->72|111->79|111->79|112->80|113->81|113->81|114->82|116->84
                  -- GENERATED --
              */
          