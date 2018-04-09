
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

object checkout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.RegisteredUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import play.api.Play.current
/*6.2*/import models.shopping._
/*7.2*/import models.products._


Seq[Any](format.raw/*1.47*/("""



"""),_display_(/*8.2*/helper/*8.8*/.form(action = helper.CSRF(routes.ShoppingCtrl.placeOrder()))/*8.69*/ {_display_(Seq[Any](format.raw/*8.71*/("""

"""),format.raw/*10.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*11.2*/main("Purchase", registeredUser)/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""


"""),format.raw/*14.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*17.4*/if(flash.containsKey("success"))/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
			  """),format.raw/*18.6*/("""<div class="alert alert-success">
			      """),_display_(/*19.11*/flash/*19.16*/.get("success")),format.raw/*19.31*/("""
			  """),format.raw/*20.6*/("""</div>
        """)))}),format.raw/*21.10*/("""
        """),_display_(/*22.10*/if(flash.containsKey("failure"))/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/("""
            """),format.raw/*23.13*/("""<div class="alert alert-success">
                """),_display_(/*24.18*/flash/*24.23*/.get("failure")),format.raw/*24.38*/("""
            """),format.raw/*25.13*/("""</div>
        """)))}),format.raw/*26.10*/("""  
        

		"""),format.raw/*29.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
             
			</tr>
			</thead>
			<tbody>
                """),_display_(/*41.18*/if(registeredUser.getBasket() != null)/*41.56*/ {_display_(Seq[Any](format.raw/*41.58*/("""
                    """),format.raw/*42.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*43.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*43.75*/ {_display_(Seq[Any](format.raw/*43.77*/("""
                    """),format.raw/*44.21*/("""<tr>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getName),format.raw/*45.50*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                        <td>&euro; """),_display_(/*49.37*/("%.2f".format(i.getItemTotal))),format.raw/*49.68*/("""</td>
                       
                    </tr>
                    """)))}),format.raw/*52.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*53.16*/("""
              
			"""),format.raw/*55.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*59.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*59.125*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            
                      <br>
                     
                      <form action=""""),_display_(/*66.38*/routes/*66.44*/.ShoppingCtrl.placeOrder()),format.raw/*66.70*/("""" method="POST">
                           
                        <script
                          src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                          data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                          data-amount=""""),_display_(/*71.41*/registeredUser/*71.55*/.getBasket.getBasketTotalPlus),format.raw/*71.84*/(""""
                          data-name="Nu-Wave Games"
                          data-description="Enter your payment details below"
                          data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                          data-locale="auto"
                          data-currency="eur">
                          <a href=""""),_display_(/*77.37*/routes/*77.43*/.ShoppingCtrl.placeOrder()),format.raw/*77.69*/("""" class="btn btn-success btn-sm"></a>
                        </script>
                        
                        
                      </form>
                    
            
                    
                   
                </p>
            </div>
    

        
        </div>
    </div>
</div>
""")))}),format.raw/*94.2*/("""

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
<<<<<<< HEAD
                  DATE: Mon Apr 09 01:04:50 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/checkout.scala.html
                  HASH: cbc20c2e81d367e65ff2c854017a659c6b1098a9
                  MATRIX: 972->1|1090->51|1126->81|1158->107|1212->46|1242->132|1269->133|1341->179|1382->211|1422->213|1452->216|1525->263|1566->295|1606->297|1639->303|1710->347|1724->352|1760->367|1793->373|1840->389|1877->399|1918->431|1958->433|1999->446|2077->497|2091->502|2127->517|2168->530|2215->546|2257->561|2565->842|2612->880|2652->882|2701->903|2811->986|2880->1039|2920->1041|2969->1062|3030->1096|3040->1097|3080->1116|3142->1151|3152->1152|3201->1180|3270->1222|3318->1249|3387->1291|3439->1322|3501->1357|3511->1358|3546->1372|3654->1449|3725->1489|3756->1493|3933->1643|4011->1699|4325->1985|4354->1986|4444->2048|4897->2473|4926->2474|5016->2536|5065->2557|5094->2558|5189->2625|5449->2857|5478->2858|5567->2919|5620->2944|5649->2945|5713->2981|5822->3062|5851->3063|5908->3092|6814->3970|6830->3976|6878->4002
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|41->9|42->10|42->10|42->10|45->13|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|60->28|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|80->48|80->48|81->49|81->49|81->49|84->52|85->53|86->54|90->58|90->58|98->66|98->66|100->68|108->76|108->76|110->78|110->78|110->78|112->80|114->82|114->82|116->84|116->84|116->84|117->85|118->86|118->86|119->87|140->108|140->108|140->108
=======
                  DATE: Sun Apr 08 21:42:56 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/checkout.scala.html
                  HASH: 94fc80525b11d87462a24c91347897ce16e0ef60
                  MATRIX: 972->1|1090->55|1126->86|1158->113|1212->46|1246->140|1259->146|1328->207|1367->209|1398->213|1471->260|1512->292|1552->294|1585->300|1661->350|1702->382|1742->384|1776->391|1848->436|1862->441|1898->456|1932->463|1980->480|2018->491|2059->523|2099->525|2141->539|2220->591|2234->596|2270->611|2312->625|2360->642|2405->660|2700->928|2747->966|2787->968|2837->990|2948->1074|3017->1127|3057->1129|3107->1151|3169->1186|3179->1187|3219->1206|3289->1249|3337->1276|3426->1338|3436->1339|3471->1353|3541->1396|3593->1427|3704->1507|3776->1548|3824->1569|4005->1723|4083->1779|4292->1961|4307->1967|4354->1993|4667->2279|4690->2293|4740->2322|5134->2689|5149->2695|5196->2721|5559->3054
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|40->8|40->8|40->8|42->10|43->11|43->11|43->11|46->14|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|61->29|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|78->46|80->48|80->48|80->48|81->49|81->49|84->52|85->53|87->55|91->59|91->59|98->66|98->66|98->66|103->71|103->71|103->71|109->77|109->77|109->77|126->94
>>>>>>> aa4120e9331252f7dd028526e355ada7dc39cce8
                  -- GENERATED --
              */
          