
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
	"""),format.raw/*8.2*/("""<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-md-8">
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
		"""),format.raw/*14.3*/("""</div>
	""")))}),format.raw/*15.3*/("""

"""),_display_(/*17.2*/for(o<-orders) yield /*17.16*/{_display_(Seq[Any](format.raw/*17.17*/("""
	"""),format.raw/*18.2*/("""<label>Order Number: """),_display_(/*18.24*/o/*18.25*/.getId),format.raw/*18.31*/("""</label>
	<br>
	<label>Order Date: """),_display_(/*20.22*/o/*20.23*/.getDateString),format.raw/*20.37*/("""</label>
	

		

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
                """),_display_(/*37.18*/if(registeredUser.getBasket() != null)/*37.56*/ {_display_(Seq[Any](format.raw/*37.58*/("""
					
                    """),format.raw/*39.21*/("""<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*40.7*/for(i <- o.getItems()) yield /*40.29*/ {_display_(Seq[Any](format.raw/*40.31*/("""
                   
						
						"""),format.raw/*43.7*/("""<td>"""),_display_(/*43.12*/i/*43.13*/.getProduct.getName),format.raw/*43.32*/("""</td>
						<td>&euro; """),_display_(/*44.19*/("%.2f".format(i.getPrice))),format.raw/*44.46*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getQuantity()),format.raw/*45.45*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getItemTotal))),format.raw/*46.68*/("""</td>                        
                    </tr>
                    """)))}),format.raw/*48.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*49.16*/("""
			"""),format.raw/*50.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*54.68*/("%.2f".format(o.getTotal()))),format.raw/*54.97*/("""</strong></p>
            </div>  
		</div>
		<div class="form-group">
				<a href=""""),_display_(/*58.15*/routes/*58.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*58.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*65.24*/("""{"""),format.raw/*65.25*/("""
		"""),format.raw/*66.3*/("""return confirm('Are you sure?');
	"""),format.raw/*67.2*/("""}"""),format.raw/*67.3*/("""
"""),format.raw/*68.1*/("""</script>
""")))}),format.raw/*69.2*/("""
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
                  DATE: Sat Mar 31 23:28:24 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewOrders.scala.html
                  HASH: 71c50622f54721a86a5e59c9973bb6090d4c9ee2
                  MATRIX: 651->1|687->32|719->59|751->86|1119->110|1284->180|1312->182|1384->229|1427->264|1466->266|1495->269|1602->350|1643->382|1683->384|1720->394|1793->440|1807->445|1843->460|1874->464|1914->474|1945->479|1975->493|2014->494|2044->497|2093->519|2103->520|2130->526|2195->564|2205->565|2240->579|2556->868|2603->906|2643->908|2700->937|2795->1006|2833->1028|2873->1030|2937->1067|2969->1072|2979->1073|3019->1092|3071->1117|3119->1144|3182->1180|3192->1181|3227->1195|3297->1238|3349->1269|3459->1348|3531->1389|3563->1394|3743->1547|3793->1576|3909->1665|3924->1671|3979->1705|4228->1926|4257->1927|4288->1931|4350->1966|4378->1967|4407->1969|4449->1981
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|52->20|52->20|69->37|69->37|69->37|71->39|72->40|72->40|72->40|75->43|75->43|75->43|75->43|76->44|76->44|77->45|77->45|77->45|78->46|78->46|80->48|81->49|82->50|86->54|86->54|90->58|90->58|90->58|97->65|97->65|98->66|99->67|99->67|100->68|101->69
                  -- GENERATED --
              */
          