
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.RegisteredUser,models.shopping.ShopOrder,models.shopping.Log,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser, order: models.shopping.ShopOrder, log: models.shopping.Log):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.107*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", registeredUser)/*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""

	"""),format.raw/*11.2*/("""<link href=""""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.62*/("""" rel="stylesheet" />
<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*33.18*/if(order != null)/*33.35*/ {_display_(Seq[Any](format.raw/*33.37*/("""
                    """),format.raw/*34.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*35.22*/for(i <- order.getItems) yield /*35.46*/ {_display_(Seq[Any](format.raw/*35.48*/("""
                    """),format.raw/*36.21*/("""<tr>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getProduct.getName),format.raw/*37.50*/("""</td>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getProduct.getDescription),format.raw/*38.57*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getProduct.getPrice))),format.raw/*39.75*/("""</td>
						<td>"""),_display_(/*40.12*/i/*40.13*/.getQuantity()),format.raw/*40.27*/("""</td>
						
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotala))),format.raw/*42.69*/("""</td>
					</tr>
					
                    """)))}),format.raw/*45.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*46.16*/("""
			"""),format.raw/*47.4*/("""</tbody>
		</table>
        
        </div>
</div>
""")))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser,order:models.shopping.ShopOrder,log:models.shopping.Log): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser,order,log)

  def f:((models.users.RegisteredUser,models.shopping.ShopOrder,models.shopping.Log) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser,order,log) => apply(registeredUser,order,log)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 16:36:00 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/orderConfirmed.scala.html
                  HASH: cc82d82f298f4315c74874075f8b8d75578cdb1c
                  MATRIX: 1024->1|1202->110|1238->140|1270->166|1325->106|1354->191|1381->192|1452->238|1502->280|1541->282|1571->285|1611->298|1626->304|1688->345|1783->414|1824->446|1864->448|1897->454|1968->498|1982->503|2018->518|2051->524|2091->534|2123->539|2429->818|2455->835|2495->837|2544->858|2654->941|2694->965|2734->967|2783->988|2844->1022|2854->1023|2894->1042|2956->1077|2966->1078|3013->1104|3082->1146|3141->1184|3185->1201|3195->1202|3230->1216|3306->1265|3359->1297|3434->1341|3505->1381|3536->1385
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|43->11|43->11|43->11|43->11|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|72->40|72->40|72->40|74->42|74->42|77->45|78->46|79->47
                  -- GENERATED --
              */
          