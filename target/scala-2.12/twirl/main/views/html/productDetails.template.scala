
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


  """),format.raw/*9.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*11.8*/if(flash.containsKey("success"))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
        """),format.raw/*14.9*/("""</div>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""<thead>
        <tr>
          <th>"""),_display_(/*18.16*/p/*18.17*/.getName),format.raw/*18.25*/(""" """),format.raw/*18.26*/("""("""),_display_(/*18.28*/p/*18.29*/.getPegi),format.raw/*18.37*/(""")</th> 
          <th>Price</th> 
          <th>Description</th>
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*27.16*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*27.79*/ {_display_(Seq[Any](format.raw/*27.81*/("""
                """),format.raw/*28.17*/("""<td><img src="/assets/images/"""),_display_(/*28.47*/(p.getId + ".png")),format.raw/*28.65*/(""""/></td>
            """)))}/*29.15*/else/*29.20*/{_display_(Seq[Any](format.raw/*29.21*/("""
                """),format.raw/*30.17*/("""<td><img src="/assets/images/noImage.jpg"/></td>
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""<td class="numeric">€"""),_display_(/*32.35*/p/*32.36*/.getPrice),format.raw/*32.45*/("""</td>
            <td>
            """),_display_(/*34.14*/p/*34.15*/.getDescription),format.raw/*34.30*/(""" 
            """),format.raw/*35.13*/("""</td>
            <br>
            <td><a href=""""),_display_(/*37.27*/routes/*37.33*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*37.67*/(""""  class="btn btn-default btn-xs">Add To Card  <span class="glyphicon glyphicon-shopping-cart"></span></a></td>
          
          </tr>
        
      </tbody>

    </table>
   
    
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
                  DATE: Sun Apr 08 21:28:21 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productDetails.scala.html
                  HASH: 9f69cc57f8c06487854ccfd3eb8776f9a6e9fa2f
                  MATRIX: 651->1|689->34|1054->61|1198->110|1230->117|1256->135|1295->137|1329->145|1457->247|1498->279|1538->281|1575->291|1648->337|1662->342|1698->357|1735->367|1780->382|1815->390|1880->428|1890->429|1919->437|1948->438|1977->440|1987->441|2016->449|2192->598|2264->661|2304->663|2350->681|2407->711|2446->729|2488->753|2501->758|2540->759|2586->777|2680->840|2722->854|2771->876|2781->877|2811->886|2876->924|2886->925|2922->940|2965->955|3043->1006|3058->1012|3113->1046
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|50->18|50->18|50->18|50->18|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|64->32|64->32|64->32|64->32|66->34|66->34|66->34|67->35|69->37|69->37|69->37
                  -- GENERATED --
              */
          