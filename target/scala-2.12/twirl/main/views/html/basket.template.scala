
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
                <th>Remove</th>
                <th>Add</th>
                
			</tr>
			</thead>
			<tbody>
                """),_display_(/*41.18*/if(registeredUser.getBasket() != null)/*41.56*/ {_display_(Seq[Any](format.raw/*41.58*/("""
                    """),format.raw/*42.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*43.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*43.75*/ {_display_(Seq[Any](format.raw/*43.77*/("""
                    """),format.raw/*44.21*/("""<tr>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getName),format.raw/*45.50*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        <td>"""),_display_(/*47.30*/i/*47.31*/.getQuantity()),format.raw/*47.45*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getItemTotal))),format.raw/*48.68*/("""</td>
                        <td><a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*49.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*50.39*/routes/*50.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*50.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*52.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*53.16*/("""
			"""),format.raw/*54.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*58.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*58.125*/("""</strong></p>
            </div>  
        </div>
       
        """),_display_(/*62.10*/if(registeredUser.getBasket() != null)/*62.48*/{_display_(Seq[Any](format.raw/*62.49*/("""
        """),format.raw/*63.9*/("""<div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*66.31*/routes/*66.37*/.ShoppingCtrl.emptyBasket()),format.raw/*66.64*/("""" class="btn-md btn-default btn" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                    """),_display_(/*68.22*/if(registeredUser.getBasket.getBasketTotal == 0)/*68.70*/{_display_(Seq[Any](format.raw/*68.71*/("""
                        
                    """)))}),format.raw/*70.22*/("""
                """),format.raw/*71.17*/("""</p>
            </div>  
        
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*76.31*/routes/*76.37*/.ShoppingCtrl.confirmPurchase()),format.raw/*76.68*/("""" class=" btn-md btn-default btn">
                    <span class="glyphicon glyphicon-euro"></span> Proceed to checkout</a>
                </p>
            </div>  
        """)))}),format.raw/*80.10*/("""
        """),format.raw/*81.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*84.2*/("""

"""),format.raw/*86.1*/("""<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*88.24*/("""{"""),format.raw/*88.25*/("""
		"""),format.raw/*89.3*/("""return confirm('Are you sure?');
	"""),format.raw/*90.2*/("""}"""),format.raw/*90.3*/("""
"""),format.raw/*91.1*/("""</script>
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
                  DATE: Sat Apr 21 16:05:18 BST 2018
                  SOURCE: C:/Users/brand/Desktop/new/SemesterCA/app/views/basket.scala.html
                  HASH: e9da574f89652031ca110e95c82d563cba239531
                  MATRIX: 970->1|1088->55|1124->86|1156->113|1210->46|1244->139|1272->141|1345->188|1393->227|1433->229|1468->237|1508->250|1523->256|1585->297|1684->370|1725->402|1765->404|1799->411|1871->456|1885->461|1921->476|1955->483|2003->500|2041->511|2082->543|2122->545|2164->559|2243->611|2257->616|2293->631|2335->645|2383->662|2414->667|2473->717|2512->718|2543->722|2935->1087|2982->1125|3022->1127|3072->1149|3183->1233|3252->1286|3292->1288|3342->1310|3404->1345|3414->1346|3454->1365|3524->1408|3572->1435|3635->1471|3645->1472|3680->1486|3750->1529|3802->1560|3874->1605|3889->1611|3942->1643|4072->1746|4087->1752|4137->1781|4280->1893|4352->1934|4384->1939|4565->2093|4643->2149|4741->2220|4788->2258|4827->2259|4864->2269|5016->2394|5031->2400|5079->2427|5279->2600|5336->2648|5375->2649|5455->2698|5501->2716|5672->2860|5687->2866|5739->2897|5951->3078|5988->3088|6047->3117|6078->3121|6214->3229|6243->3230|6274->3234|6336->3269|6364->3270|6393->3272
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|44->12|44->12|44->12|44->12|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|58->26|58->26|59->27|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|79->47|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|85->53|86->54|90->58|90->58|94->62|94->62|94->62|95->63|98->66|98->66|98->66|100->68|100->68|100->68|102->70|103->71|108->76|108->76|108->76|112->80|113->81|116->84|118->86|120->88|120->88|121->89|122->90|122->90|123->91
                  -- GENERATED --
              */
          