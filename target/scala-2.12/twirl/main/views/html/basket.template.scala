
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
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*41.18*/if(registeredUser.getBasket() != null)/*41.56*/ {_display_(Seq[Any](format.raw/*41.58*/("""
                    """),format.raw/*42.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*43.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*43.75*/ {_display_(Seq[Any](format.raw/*43.77*/("""
                    """),format.raw/*44.21*/("""<tr>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getName),format.raw/*45.50*/("""</td>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getProduct.getDescription()),format.raw/*46.59*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getPrice))),format.raw/*47.64*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getItemTotal))),format.raw/*48.68*/("""</td>
                        <td>"""),_display_(/*49.30*/i/*49.31*/.getQuantity()),format.raw/*49.45*/("""</td>
                        <td><a href=""""),_display_(/*50.39*/routes/*50.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*50.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*51.39*/routes/*51.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*51.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*53.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*54.16*/("""
			"""),format.raw/*55.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*59.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*59.125*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
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
        
        </div>
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
                  DATE: Mon Apr 02 01:37:24 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/basket.scala.html
                  HASH: 3950c770401f252b5b0267bd7cce8248b1cf6531
                  MATRIX: 970->1|1088->55|1124->86|1156->113|1210->46|1244->139|1272->141|1345->188|1393->227|1433->229|1466->235|1542->285|1583->317|1623->319|1657->326|1729->371|1743->376|1779->391|1813->398|1861->415|1899->426|1940->458|1980->460|2022->474|2101->526|2115->531|2151->546|2193->560|2241->577|2276->585|2644->926|2691->964|2731->966|2781->988|2892->1072|2961->1125|3001->1127|3051->1149|3113->1184|3123->1185|3163->1204|3226->1240|3236->1241|3285->1269|3355->1312|3403->1339|3473->1382|3525->1413|3588->1449|3598->1450|3633->1464|3705->1509|3720->1515|3773->1547|3903->1650|3918->1656|3968->1685|4111->1797|4183->1838|4215->1843|4396->1997|4474->2053|4687->2239|4702->2245|4750->2272|5088->2583|5103->2589|5155->2620|5510->2947|5539->2948|5570->2952|5632->2987|5660->2988|5689->2990
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|45->13|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|59->27|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|85->53|86->54|87->55|91->59|91->59|97->65|97->65|97->65|104->72|104->72|104->72|115->83|115->83|116->84|117->85|117->85|118->86
                  -- GENERATED --
              */
          