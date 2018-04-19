
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
                  DATE: Thu Apr 19 09:20:25 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/basket.scala.html
                  HASH: a748e64c6bf03a99353753173873fa87309daa1a
                  MATRIX: 970->1|1088->51|1124->81|1156->107|1210->46|1240->132|1267->133|1339->179|1387->218|1427->220|1460->226|1500->239|1515->245|1577->286|1672->355|1713->387|1753->389|1786->395|1857->439|1871->444|1907->459|1940->465|1987->481|2024->491|2065->523|2105->525|2146->538|2224->589|2238->594|2274->609|2315->622|2362->638|2392->642|2451->692|2490->693|2520->696|2869->1018|2916->1056|2956->1058|3005->1079|3115->1162|3184->1215|3224->1217|3273->1238|3334->1272|3344->1273|3384->1292|3453->1334|3501->1361|3563->1396|3573->1397|3608->1411|3677->1453|3729->1484|3800->1528|3815->1534|3868->1566|3997->1668|4012->1674|4062->1703|4203->1813|4274->1853|4305->1857|4482->2007|4560->2063|4654->2130|4701->2168|4740->2169|4776->2178|4925->2300|4940->2306|4988->2333|5185->2503|5242->2551|5281->2552|5359->2599|5404->2616|5570->2755|5585->2761|5637->2792|5844->2968|5880->2977|5936->3003|5965->3005|6099->3111|6128->3112|6158->3115|6219->3149|6247->3150|6275->3151
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|44->12|44->12|44->12|44->12|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|58->26|58->26|59->27|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|83->51|84->52|85->53|89->57|89->57|93->61|93->61|93->61|94->62|97->65|97->65|97->65|99->67|99->67|99->67|101->69|102->70|107->75|107->75|107->75|111->79|112->80|115->83|117->85|119->87|119->87|120->88|121->89|121->89|122->90
                  -- GENERATED --
              */
          