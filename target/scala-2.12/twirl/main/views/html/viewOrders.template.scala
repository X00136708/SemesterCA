
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
	
			
			
	"""),_display_(/*13.3*/if(flash.containsKey("success"))/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
        """),format.raw/*14.9*/("""<div class="alert alert-success">
          """),_display_(/*15.12*/flash/*15.17*/.get("success")),format.raw/*15.32*/("""
		"""),format.raw/*16.3*/("""</div>
	""")))}),format.raw/*17.3*/("""

"""),_display_(/*19.2*/for(o<-orders) yield /*19.16*/{_display_(Seq[Any](format.raw/*19.17*/("""
	
	"""),format.raw/*21.2*/("""<label>Order Number: """),_display_(/*21.24*/o/*21.25*/.getId),format.raw/*21.31*/("""</label>
	<br>
	<label>Order Date: """),_display_(/*23.22*/o/*23.23*/.getDateString),format.raw/*23.37*/("""</label>
	

		

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
                """),_display_(/*39.18*/if(registeredUser.getBasket() != null)/*39.56*/ {_display_(Seq[Any](format.raw/*39.58*/("""
					
                    """),format.raw/*41.21*/("""<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*42.7*/for(i <- o.getItems()) yield /*42.29*/ {_display_(Seq[Any](format.raw/*42.31*/("""
                   
						
						"""),format.raw/*45.7*/("""<td>"""),_display_(/*45.12*/i/*45.13*/.getProduct.getName),format.raw/*45.32*/("""</td>
						<td>&euro; """),_display_(/*46.19*/("%.2f".format(i.getProduct.getPrice))),format.raw/*46.57*/("""</td>
                        <td>"""),_display_(/*47.30*/i/*47.31*/.getQuantity()),format.raw/*47.45*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getItemTotala))),format.raw/*48.69*/("""</td>                        
					</tr>
				</tbody>
					""")))}),format.raw/*51.7*/("""<!-- End of For loop -->
					
              """)))}),format.raw/*53.16*/("""
			
		"""),format.raw/*55.3*/("""</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*58.68*/("%.2f".format(o.getTotal()))),format.raw/*58.97*/("""</strong></p>
            </div>  
		</div>
		"""),_display_(/*61.4*/if(o.isCancellable())/*61.25*/{_display_(Seq[Any](format.raw/*61.26*/("""

		"""),format.raw/*63.3*/("""<div class="form-group">
				<a href=""""),_display_(/*64.15*/routes/*64.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*64.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
		</div>
	""")))}),format.raw/*66.3*/("""
    """),format.raw/*67.5*/("""</div>
</div>


<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*73.24*/("""{"""),format.raw/*73.25*/("""
		"""),format.raw/*74.3*/("""return confirm('Are you sure?');
	"""),format.raw/*75.2*/("""}"""),format.raw/*75.3*/("""
"""),format.raw/*76.1*/("""</script>
""")))}),format.raw/*77.2*/("""


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
                  DATE: Tue Apr 17 21:43:05 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewOrders.scala.html
                  HASH: 3381997569b1a0bea9b4edf7573b97d1542f6a26
                  MATRIX: 651->1|687->32|719->59|751->86|1119->110|1284->180|1312->182|1384->229|1427->264|1466->266|1495->269|1560->308|1574->314|1635->355|1699->393|1740->425|1780->427|1817->437|1890->483|1904->488|1940->503|1971->507|2011->517|2042->522|2072->536|2111->537|2144->543|2193->565|2203->566|2230->572|2295->610|2305->611|2340->625|2650->908|2697->946|2737->948|2794->977|2889->1046|2927->1068|2967->1070|3031->1107|3063->1112|3073->1113|3113->1132|3165->1157|3224->1195|3287->1231|3297->1232|3332->1246|3402->1289|3455->1321|3548->1384|3627->1432|3663->1441|3831->1582|3881->1611|3957->1661|3987->1682|4026->1683|4059->1689|4126->1729|4141->1735|4196->1769|4313->1856|4346->1862|4502->1990|4531->1991|4562->1995|4624->2030|4652->2031|4681->2033|4723->2045
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|51->19|51->19|51->19|53->21|53->21|53->21|53->21|55->23|55->23|55->23|71->39|71->39|71->39|73->41|74->42|74->42|74->42|77->45|77->45|77->45|77->45|78->46|78->46|79->47|79->47|79->47|80->48|80->48|83->51|85->53|87->55|90->58|90->58|93->61|93->61|93->61|95->63|96->64|96->64|96->64|98->66|99->67|105->73|105->73|106->74|107->75|107->75|108->76|109->77
                  -- GENERATED --
              */
          