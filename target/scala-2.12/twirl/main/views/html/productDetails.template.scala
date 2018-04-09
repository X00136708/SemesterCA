
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
              """)))}),format.raw/*49.16*/("""
              
        
        
    """),format.raw/*53.5*/("""</div>
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
                  DATE: Mon Apr 09 20:56:24 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productDetails.scala.html
                  HASH: e83d933ff9eb108db8200e044a465f4379bbe74d
                  MATRIX: 651->1|689->34|1054->61|1198->110|1230->117|1256->135|1295->137|1327->143|1491->280|1532->312|1572->314|1612->326|1687->374|1701->379|1737->394|1777->406|1825->423|1862->433|1975->519|2047->582|2087->584|2135->604|2188->630|2227->648|2286->689|2299->694|2338->695|2386->715|2493->791|2537->807|2569->812|2579->813|2608->821|2684->870|2694->871|2723->879|2802->931|2841->954|2880->955|2926->974|2936->975|2965->983|3019->1006|3095->1055|3105->1056|3135->1065|3213->1116|3223->1117|3259->1132|3341->1187|3366->1203|3405->1204|3451->1223|3494->1257|3533->1258|3581->1278|3618->1288|3633->1294|3694->1334|3843->1456|3858->1462|3919->1502|4080->1644|4093->1648|4132->1649|4180->1670|4207->1688|4246->1689|4296->1711|4333->1721|4348->1727|4403->1761|4549->1888|4562->1892|4601->1893|4651->1915|4834->2067|4904->2106|4952->2123|5021->2165
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|55->23|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|63->31|63->31|63->31|65->33|65->33|65->33|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|80->48|81->49|85->53
                  -- GENERATED --
              */
          