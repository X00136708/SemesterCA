
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

    """),format.raw/*12.5*/("""<link href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.65*/("""" rel="stylesheet" />
<div class="row">

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
"""),_display_(/*26.2*/if(registeredUser.getBasket.getBasketItems !=null)/*26.52*/{_display_(Seq[Any](format.raw/*26.53*/("""
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
                    """),_display_(/*67.22*/if(registeredUser.getBasket.getBasketTotal == 0)/*67.70*/{_display_(Seq[Any](format.raw/*67.71*/("""
                        
                    """)))}),format.raw/*69.22*/("""
                """),format.raw/*70.17*/("""</p>
            </div>  
        
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*75.31*/routes/*75.37*/.ShoppingCtrl.confirmPurchase()),format.raw/*75.68*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Proceed to checkout</a>
                </p>
            </div>  
        """)))}),format.raw/*79.10*/("""
        """),format.raw/*80.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*83.2*/("""

"""),format.raw/*85.1*/("""<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*87.24*/("""{"""),format.raw/*87.25*/("""
		"""),format.raw/*88.3*/("""return confirm('Are you sure?');
	"""),format.raw/*89.2*/("""}"""),format.raw/*89.3*/("""
"""),format.raw/*90.1*/("""</script>
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
                  DATE: Wed Apr 18 18:55:10 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/basket.scala.html
                  HASH: 16e2669bf5dcbd1e439eb11949bb9f4fcb2c3c4c
                  MATRIX: 970->1|1088->55|1124->86|1156->113|1210->46|1244->139|1272->141|1345->188|1393->227|1433->229|1468->237|1508->250|1523->256|1585->297|1684->370|1725->402|1765->404|1799->411|1871->456|1885->461|1921->476|1955->483|2003->500|2041->511|2082->543|2122->545|2164->559|2243->611|2257->616|2293->631|2335->645|2383->662|2414->667|2473->717|2512->718|2543->722|2905->1057|2952->1095|2992->1097|3042->1119|3153->1203|3222->1256|3262->1258|3312->1280|3374->1315|3384->1316|3424->1335|3494->1378|3542->1405|3605->1441|3615->1442|3650->1456|3720->1499|3772->1530|3844->1575|3859->1581|3912->1613|4042->1716|4057->1722|4107->1751|4250->1863|4322->1904|4354->1909|4535->2063|4613->2119|4711->2190|4758->2228|4797->2229|4834->2239|4986->2364|5001->2370|5049->2397|5248->2569|5305->2617|5344->2618|5424->2667|5470->2685|5641->2829|5656->2835|5708->2866|5919->3046|5956->3056|6015->3085|6046->3089|6182->3197|6211->3198|6242->3202|6304->3237|6332->3238|6361->3240
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|44->12|44->12|44->12|44->12|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|58->26|58->26|59->27|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|83->51|84->52|85->53|89->57|89->57|93->61|93->61|93->61|94->62|97->65|97->65|97->65|99->67|99->67|99->67|101->69|102->70|107->75|107->75|107->75|111->79|112->80|115->83|117->85|119->87|119->87|120->88|121->89|121->89|122->90
                  -- GENERATED --
              */
          