
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
                  DATE: Mon Apr 16 10:32:59 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/viewOrders.scala.html
                  HASH: b91debbea0bcf8c1b3967ec83341d6cdab05b885
                  MATRIX: 651->1|687->31|719->57|751->83|1119->106|1284->176|1311->177|1382->223|1425->258|1464->260|1492->262|1554->298|1595->330|1635->332|1671->341|1743->386|1757->391|1793->406|1823->409|1862->418|1891->421|1921->435|1960->436|1991->440|2040->462|2050->463|2077->469|2140->505|2150->506|2185->520|2479->787|2526->825|2566->827|2621->854|2715->922|2753->944|2793->946|2854->980|2886->985|2896->986|2936->1005|2987->1029|3046->1067|3108->1102|3118->1103|3153->1117|3222->1159|3275->1191|3365->1251|3442->1297|3476->1304|3641->1442|3691->1471|3806->1559|3821->1565|3876->1599|4119->1814|4148->1815|4178->1818|4239->1852|4267->1853|4295->1854|4336->1865
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|50->18|50->18|50->18|52->20|52->20|52->20|52->20|54->22|54->22|54->22|70->38|70->38|70->38|72->40|73->41|73->41|73->41|76->44|76->44|76->44|76->44|77->45|77->45|78->46|78->46|78->46|79->47|79->47|82->50|84->52|86->54|89->57|89->57|94->62|94->62|94->62|102->70|102->70|103->71|104->72|104->72|105->73|106->74
                  -- GENERATED --
              */
          