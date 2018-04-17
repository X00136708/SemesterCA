
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.RegisteredUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import play.api.Play.current
/*6.2*/import models.shopping._
/*7.2*/import models.products._


Seq[Any](format.raw/*1.47*/("""



"""),format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*10.2*/main("Shopping Basket", registeredUser)/*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""


"""),format.raw/*13.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*16.4*/if(flash.containsKey("success"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
			  """),format.raw/*17.6*/("""<div class="alert alert-success">
			      """),_display_(/*18.11*/flash/*18.16*/.get("success")),format.raw/*18.31*/("""
			  """),format.raw/*19.6*/("""</div>
        """)))}),format.raw/*20.10*/("""
        """),_display_(/*21.10*/if(flash.containsKey("failure"))/*21.42*/ {_display_(Seq[Any](format.raw/*21.44*/("""
            """),format.raw/*22.13*/("""<div class="alert alert-success">
                """),_display_(/*23.18*/flash/*23.23*/.get("failure")),format.raw/*23.38*/("""
            """),format.raw/*24.13*/("""</div>
        """)))}),format.raw/*25.10*/("""  

		"""),format.raw/*27.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
				<th>Total</th>
                <th>Add</th>
                <th>Remove</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*40.18*/if(registeredUser.getBasket() != null)/*40.56*/ {_display_(Seq[Any](format.raw/*40.58*/("""
                    """),format.raw/*41.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*42.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*42.75*/ {_display_(Seq[Any](format.raw/*42.77*/("""
                    """),format.raw/*43.21*/("""<tr>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getProduct.getName),format.raw/*44.50*/("""</td>
                        <td>&euro; """),_display_(/*45.37*/("%.2f".format(i.getPrice))),format.raw/*45.64*/("""</td>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getQuantity()),format.raw/*46.45*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal))),format.raw/*47.68*/("""</td>
                        <td><a href=""""),_display_(/*48.39*/routes/*48.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*48.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*49.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*51.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*52.16*/("""
			"""),format.raw/*53.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*57.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*57.125*/("""</strong></p>
            </div>  
        </div>
       
        """),_display_(/*61.10*/if(registeredUser.getBasket() != null)/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/("""
        """),format.raw/*62.9*/("""<div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.ShoppingCtrl.emptyBasket()),format.raw/*65.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
        
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*72.31*/routes/*72.37*/.ShoppingCtrl.confirmPurchase()),format.raw/*72.68*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Proceed to checkout</a>
                </p>
            </div>  
        """)))}),format.raw/*76.10*/("""
        """),format.raw/*77.9*/("""</div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*83.24*/("""{"""),format.raw/*83.25*/("""
		"""),format.raw/*84.3*/("""return confirm('Are you sure?');
	"""),format.raw/*85.2*/("""}"""),format.raw/*85.3*/("""
"""),format.raw/*86.1*/("""</script>
""")))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser)

  def f:((models.users.RegisteredUser) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser) => apply(registeredUser)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 11:17:56 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/basket.scala.html
                  HASH: b618c23b3f8655a6ab1486cb96435a34602996fb
                  MATRIX: 970->1|1088->51|1124->81|1156->107|1210->46|1240->132|1267->133|1339->179|1387->218|1427->220|1457->223|1530->270|1571->302|1611->304|1644->310|1715->354|1729->359|1765->374|1798->380|1845->396|1882->406|1923->438|1963->440|2004->453|2082->504|2096->509|2132->524|2173->537|2220->553|2253->559|2602->881|2649->919|2689->921|2738->942|2848->1025|2917->1078|2957->1080|3006->1101|3067->1135|3077->1136|3117->1155|3186->1197|3234->1224|3296->1259|3306->1260|3341->1274|3410->1316|3462->1347|3533->1391|3548->1397|3601->1429|3730->1531|3745->1537|3795->1566|3936->1676|4007->1716|4038->1720|4215->1870|4293->1926|4387->1993|4434->2031|4473->2032|4509->2041|4658->2163|4673->2169|4721->2196|5052->2500|5067->2506|5119->2537|5326->2713|5362->2722|5522->2854|5551->2855|5581->2858|5642->2892|5670->2893|5698->2894
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|45->13|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|59->27|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|83->51|84->52|85->53|89->57|89->57|93->61|93->61|93->61|94->62|97->65|97->65|97->65|104->72|104->72|104->72|108->76|109->77|115->83|115->83|116->84|117->85|117->85|118->86
                  -- GENERATED --
              */
          