
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
				<th>Id</th>
				<th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
				<th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*36.18*/if(registeredUser.getBasket() != null)/*36.56*/ {_display_(Seq[Any](format.raw/*36.58*/("""
                    """),format.raw/*37.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*38.22*/for(i <- o.getItems()) yield /*38.44*/ {_display_(Seq[Any](format.raw/*38.46*/("""
                    """),format.raw/*39.21*/("""<tr>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getId),format.raw/*40.48*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getName),format.raw/*41.50*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getQuantity()),format.raw/*42.45*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getPrice))),format.raw/*43.64*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getItemTotal))),format.raw/*44.68*/("""</td>                        
                    </tr>
                    """)))}),format.raw/*46.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*47.16*/("""
			"""),format.raw/*48.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*52.68*/("%.2f".format(o.getTotal()))),format.raw/*52.97*/("""</strong></p>
            </div>  
		</div>
		<div class="form-group">
				<a href=""""),_display_(/*56.15*/routes/*56.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*56.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*63.24*/("""{"""),format.raw/*63.25*/("""
		"""),format.raw/*64.3*/("""return confirm('Are you sure?');
	"""),format.raw/*65.2*/("""}"""),format.raw/*65.3*/("""
"""),format.raw/*66.1*/("""</script>
""")))}),format.raw/*67.2*/("""
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
                  DATE: Sun Mar 25 23:24:05 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewOrders.scala.html
                  HASH: eec80e93ff338a85401e2c652026554d5cea52e2
                  MATRIX: 651->1|687->32|719->59|751->86|1119->110|1284->180|1312->182|1384->229|1427->264|1466->266|1495->269|1602->350|1643->382|1683->384|1720->394|1793->440|1807->445|1843->460|1874->464|1914->474|1945->479|1975->493|2014->494|2044->497|2093->519|2103->520|2130->526|2195->564|2205->565|2240->579|2576->888|2623->926|2663->928|2713->950|2824->1034|2862->1056|2902->1058|2952->1080|3014->1115|3024->1116|3062->1133|3125->1169|3135->1170|3175->1189|3238->1225|3248->1226|3283->1240|3353->1283|3401->1310|3471->1353|3523->1384|3633->1463|3705->1504|3737->1509|3917->1662|3967->1691|4083->1780|4098->1786|4153->1820|4402->2041|4431->2042|4462->2046|4524->2081|4552->2082|4581->2084|4623->2096
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|52->20|52->20|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|76->44|76->44|78->46|79->47|80->48|84->52|84->52|88->56|88->56|88->56|95->63|95->63|96->64|97->65|97->65|98->66|99->67
                  -- GENERATED --
              */
          