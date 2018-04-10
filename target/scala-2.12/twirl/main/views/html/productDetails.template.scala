
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
/*1.2*/import models.products.Product
/*2.2*/import models.users.User

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Product,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(p: Product,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.51*/("""


"""),_display_(/*6.2*/main("Game", user)/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""

  """),format.raw/*8.3*/("""<div class="col-sm-2"></div>
  <div class="col-sm-8">
      <table class="table table-bordered table-hover table-condensed">
        """),_display_(/*11.10*/if(flash.containsKey("success"))/*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
          """),format.raw/*12.11*/("""<div class="alert alert-success">
            """),_display_(/*13.14*/flash/*13.19*/.get("success")),format.raw/*13.34*/("""
          """),format.raw/*14.11*/("""</div>
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""<div class="list-group">
            <div class="list-group-item">
                """),_display_(/*18.18*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*18.81*/ {_display_(Seq[Any](format.raw/*18.83*/("""
                  """),format.raw/*19.19*/("""<img src="/assets/images/"""),_display_(/*19.45*/(p.getId + ".png")),format.raw/*19.63*/("""" id="prodDetailsImg"/>
              """)))}/*20.17*/else/*20.22*/{_display_(Seq[Any](format.raw/*20.23*/("""
                  """),format.raw/*21.19*/("""<img src="/assets/images/noImage.jpg" id="prodDetailsImg"/>
              """)))}),format.raw/*22.16*/("""
              """),format.raw/*23.15*/("""<h2>"""),_display_(/*23.20*/p/*23.21*/.getName),format.raw/*23.29*/("""</h2>

              <h5><b>Rating: </b> <br> """),_display_(/*25.41*/p/*25.42*/.getPegi),format.raw/*25.50*/("""</h5>

              <h5><b>Platforms: </b> <br> """),_display_(/*27.44*/for(c<-p.getCategories) yield /*27.67*/{_display_(Seq[Any](format.raw/*27.68*/("""
                """),_display_(/*28.18*/c/*28.19*/.getName),format.raw/*28.27*/("""&nbsp;
              """)))}),format.raw/*29.16*/("""</h5>

              <h5><b>Price: </b> <br> €"""),_display_(/*31.41*/p/*31.42*/.getPrice),format.raw/*31.51*/("""</h5>

              <p><b>Description</b> <br> """),_display_(/*33.43*/p/*33.44*/.getDescription),format.raw/*33.59*/("""</p>
              
              

              """),_display_(/*37.16*/if(user != null)/*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
                """),_display_(/*38.18*/if("admin".equals(user.getRole()))/*38.52*/{_display_(Seq[Any](format.raw/*38.53*/("""
                  """),format.raw/*39.19*/("""<a href=""""),_display_(/*39.29*/routes/*39.35*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*39.75*/(""""  class="btn btn-default btn-xs">Edit  <span class="glyphicon glyphicon-pencil"></span></a>
                  <a href=""""),_display_(/*40.29*/routes/*40.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*40.75*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();">Delete <span class="glyphicon glyphicon-trash"></span></a>
                """)))}/*41.18*/else/*41.22*/{_display_(Seq[Any](format.raw/*41.23*/("""
                  """),_display_(/*42.20*/if(p.getStock > 0)/*42.38*/{_display_(Seq[Any](format.raw/*42.39*/("""
                    """),format.raw/*43.21*/("""<a href=""""),_display_(/*43.31*/routes/*43.37*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*43.71*/(""""  class="btn btn-warning btn-xs">Add To Cart  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                  """)))}/*44.20*/else/*44.24*/{_display_(Seq[Any](format.raw/*44.25*/("""
                    """),format.raw/*45.21*/("""<a class="btn btn-warning btn-xs" onclick="return soldOut();">Sold Out  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                  """)))}),format.raw/*46.20*/("""
                  
                """)))}),format.raw/*48.18*/("""
              """)))}/*49.16*/else/*49.20*/{_display_(Seq[Any](format.raw/*49.21*/("""
                """),_display_(/*50.18*/if(p.getStock > 0)/*50.36*/{_display_(Seq[Any](format.raw/*50.37*/("""
                  """),format.raw/*51.19*/("""<a href=""""),_display_(/*51.29*/routes/*51.35*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*51.69*/(""""  class="btn btn-warning btn-xs">Add To Cart  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                """)))}/*52.18*/else/*52.22*/{_display_(Seq[Any](format.raw/*52.23*/("""
                  """),format.raw/*53.19*/("""<a class="btn btn-warning btn-xs" onclick="return soldOut();">Sold Out  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                """)))}),format.raw/*54.18*/("""
              """)))}),format.raw/*55.16*/("""
              
        
        
    """),format.raw/*59.5*/("""</div>
        <label>Reviews:</label><br>
        <div class="list-group">
        
      </div>
      <p>
        <a href="#">
          <button class="btn btn-primary">Add a Review</button>
        </a>
      </p>
      
    </div>
  </div>
""")))}))
      }
    }
  }

  def render(p:Product,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((Product,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 17:10:24 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA/app/views/productDetails.scala.html
                  HASH: 9dbc6ab818ae49cda0fbb4c23b5a4a19ffd99f47
                  MATRIX: 651->1|689->33|1054->59|1198->108|1227->112|1253->130|1292->132|1322->136|1483->270|1524->302|1564->304|1603->315|1677->362|1691->367|1727->382|1766->393|1813->409|1849->418|1960->502|2032->565|2072->567|2119->586|2172->612|2211->630|2269->670|2282->675|2321->676|2368->695|2474->770|2517->785|2549->790|2559->791|2588->799|2662->846|2672->847|2701->855|2778->905|2817->928|2856->929|2901->947|2911->948|2940->956|2993->978|3067->1025|3077->1026|3107->1035|3183->1084|3193->1085|3229->1100|3307->1151|3332->1167|3371->1168|3416->1186|3459->1220|3498->1221|3545->1240|3582->1250|3597->1256|3658->1296|3806->1417|3821->1423|3882->1463|4042->1604|4055->1608|4094->1609|4141->1629|4168->1647|4207->1648|4256->1669|4293->1679|4308->1685|4363->1719|4508->1845|4521->1849|4560->1850|4609->1871|4791->2022|4859->2059|4894->2075|4907->2079|4946->2080|4991->2098|5018->2116|5057->2117|5104->2136|5141->2146|5156->2152|5211->2186|5354->2310|5367->2314|5406->2315|5453->2334|5633->2483|5680->2499|5745->2537
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|55->23|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|63->31|63->31|63->31|65->33|65->33|65->33|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|86->54|87->55|91->59
                  -- GENERATED --
              */
          