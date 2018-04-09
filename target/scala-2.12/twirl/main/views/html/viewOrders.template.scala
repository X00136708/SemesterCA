
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
                """),_display_(/*36.18*/if(registeredUser.getBasket() != null)/*36.56*/ {_display_(Seq[Any](format.raw/*36.58*/("""
					
                    """),format.raw/*38.21*/("""<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*39.7*/for(i <- o.getItems()) yield /*39.29*/ {_display_(Seq[Any](format.raw/*39.31*/("""
                   
						
						"""),format.raw/*42.7*/("""<td>"""),_display_(/*42.12*/i/*42.13*/.getProduct.getName),format.raw/*42.32*/("""</td>
						<td>&euro; """),_display_(/*43.19*/("%.2f".format(i.getPrice))),format.raw/*43.46*/("""</td>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getQuantity()),format.raw/*44.45*/("""</td>
                        <td>&euro; """),_display_(/*45.37*/("%.2f".format(i.getItemTotal))),format.raw/*45.68*/("""</td>                        
                    </tr>
                    """)))}),format.raw/*47.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*48.16*/("""
			"""),format.raw/*49.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*53.68*/("%.2f".format(o.getTotal()))),format.raw/*53.97*/("""</strong></p>
            </div>  
		</div>
		<div class="form-group">
				<a href=""""),_display_(/*57.15*/routes/*57.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*57.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*64.24*/("""{"""),format.raw/*64.25*/("""
		"""),format.raw/*65.3*/("""return confirm('Are you sure?');
	"""),format.raw/*66.2*/("""}"""),format.raw/*66.3*/("""
"""),format.raw/*67.1*/("""</script>
""")))}),format.raw/*68.2*/("""
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
                  DATE: Mon Apr 09 01:04:49 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/viewOrders.scala.html
                  HASH: 412fbf3f8bd5cda817ae0a7aba61066cdbc6e561
                  MATRIX: 651->1|687->31|719->57|751->83|1119->106|1284->176|1311->177|1382->223|1425->258|1464->260|1492->262|1596->340|1637->372|1677->374|1713->383|1785->428|1799->433|1835->448|1865->451|1904->460|1933->463|1963->477|2002->478|2031->480|2080->502|2090->503|2117->509|2180->545|2190->546|2225->560|2519->827|2566->865|2606->867|2661->894|2755->962|2793->984|2833->986|2894->1020|2926->1025|2936->1026|2976->1045|3027->1069|3075->1096|3137->1131|3147->1132|3182->1146|3251->1188|3303->1219|3411->1296|3482->1336|3513->1340|3689->1489|3739->1518|3851->1603|3866->1609|3921->1643|4163->1857|4192->1858|4222->1861|4283->1895|4311->1896|4339->1897|4380->1908
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|52->20|52->20|68->36|68->36|68->36|70->38|71->39|71->39|71->39|74->42|74->42|74->42|74->42|75->43|75->43|76->44|76->44|76->44|77->45|77->45|79->47|80->48|81->49|85->53|85->53|89->57|89->57|89->57|96->64|96->64|97->65|98->66|98->66|99->67|100->68
                  -- GENERATED --
              */
          