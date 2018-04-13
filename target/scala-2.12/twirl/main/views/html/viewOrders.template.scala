
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
	
			
			
	"""),_display_(/*12.3*/if(flash.containsKey("success"))/*12.35*/ {_display_(Seq[Any](format.raw/*12.37*/("""
        """),format.raw/*13.9*/("""<div class="alert alert-success">
          """),_display_(/*14.12*/flash/*14.17*/.get("success")),format.raw/*14.32*/("""
		"""),format.raw/*15.3*/("""</div>
	""")))}),format.raw/*16.3*/("""

"""),_display_(/*18.2*/for(o<-orders) yield /*18.16*/{_display_(Seq[Any](format.raw/*18.17*/("""
	
	"""),format.raw/*20.2*/("""<label>Order Number: """),_display_(/*20.24*/o/*20.25*/.getId),format.raw/*20.31*/("""</label>
	<br>
	<label>Order Date: """),_display_(/*22.22*/o/*22.23*/.getDateString),format.raw/*22.37*/("""</label>
	

		

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
                """),_display_(/*38.18*/if(registeredUser.getBasket() != null)/*38.56*/ {_display_(Seq[Any](format.raw/*38.58*/("""
					
                    """),format.raw/*40.21*/("""<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*41.7*/for(i <- o.getItems()) yield /*41.29*/ {_display_(Seq[Any](format.raw/*41.31*/("""
                   
						
						"""),format.raw/*44.7*/("""<td>"""),_display_(/*44.12*/i/*44.13*/.getProduct.getName),format.raw/*44.32*/("""</td>
						<td>&euro; """),_display_(/*45.19*/("%.2f".format(i.getProduct.getPrice))),format.raw/*45.57*/("""</td>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getQuantity()),format.raw/*46.45*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotala))),format.raw/*47.69*/("""</td>                        
					</tr>
				</tbody>
					""")))}),format.raw/*50.7*/("""<!-- End of For loop -->
					
              """)))}),format.raw/*52.16*/("""
			
		"""),format.raw/*54.3*/("""</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*57.68*/("%.2f".format(o.getTotal()))),format.raw/*57.97*/("""</strong></p>
            </div>  
		</div>
		
		<div class="form-group">
				<a href=""""),_display_(/*62.15*/routes/*62.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*62.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
        </div>
    </div>
</div>


<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*70.24*/("""{"""),format.raw/*70.25*/("""
		"""),format.raw/*71.3*/("""return confirm('Are you sure?');
	"""),format.raw/*72.2*/("""}"""),format.raw/*72.3*/("""
"""),format.raw/*73.1*/("""</script>
""")))}),format.raw/*74.2*/("""


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
                  DATE: Fri Apr 13 15:54:57 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewOrders.scala.html
                  HASH: 198f4ff4c25ce18962de88fbfc12dd17681a1304
                  MATRIX: 651->1|687->32|719->59|751->86|1119->110|1284->180|1312->182|1384->229|1427->264|1466->266|1495->269|1561->309|1602->341|1642->343|1679->353|1752->399|1766->404|1802->419|1833->423|1873->433|1904->438|1934->452|1973->453|2006->459|2055->481|2065->482|2092->488|2157->526|2167->527|2202->541|2512->824|2559->862|2599->864|2656->893|2751->962|2789->984|2829->986|2893->1023|2925->1028|2935->1029|2975->1048|3027->1073|3086->1111|3149->1147|3159->1148|3194->1162|3264->1205|3317->1237|3410->1300|3489->1348|3525->1357|3693->1498|3743->1527|3863->1620|3878->1626|3933->1660|4184->1883|4213->1884|4244->1888|4306->1923|4334->1924|4363->1926|4405->1938
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|50->18|50->18|50->18|52->20|52->20|52->20|52->20|54->22|54->22|54->22|70->38|70->38|70->38|72->40|73->41|73->41|73->41|76->44|76->44|76->44|76->44|77->45|77->45|78->46|78->46|78->46|79->47|79->47|82->50|84->52|86->54|89->57|89->57|94->62|94->62|94->62|102->70|102->70|103->71|104->72|104->72|105->73|106->74
                  -- GENERATED --
              */
          