
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.RegisteredUser,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.81*/("""


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
						<td>"""),_display_(/*41.12*/i/*41.13*/.getQuantity()),format.raw/*41.27*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotala))),format.raw/*42.69*/("""</td>
                    </tr>
                    """)))}),format.raw/*44.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*45.16*/("""
			"""),format.raw/*46.4*/("""</tbody>
		</table>
        
        </div>
</div>
""")))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser,order)

  def f:((models.users.RegisteredUser,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser,order) => apply(registeredUser,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 09:20:25 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/orderConfirmed.scala.html
                  HASH: c77dc6ba324f1617349e5470965f88175d85e9a9
                  MATRIX: 1004->1|1156->84|1192->114|1224->140|1278->80|1307->165|1334->166|1405->212|1455->254|1494->256|1524->259|1564->272|1579->278|1641->319|1736->388|1777->420|1817->422|1850->428|1921->472|1935->477|1971->492|2004->498|2044->508|2076->513|2382->792|2408->809|2448->811|2497->832|2607->915|2647->939|2687->941|2736->962|2797->996|2807->997|2847->1016|2909->1051|2919->1052|2966->1078|3035->1120|3094->1158|3138->1175|3148->1176|3183->1190|3227->1207|3237->1208|3272->1222|3341->1264|3394->1296|3478->1349|3549->1389|3580->1393
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|43->11|43->11|43->11|43->11|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|76->44|77->45|78->46
                  -- GENERATED --
              */
          