
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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], categories: List[Category], catId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.121*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.ProductCtrl.listProducts(0, filter)),format.raw/*15.59*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*17.67*/("""" class="list-group-item">"""),_display_(/*17.94*/c/*17.95*/.getName),format.raw/*17.103*/("""
          """),format.raw/*18.11*/("""<span class="badge">"""),_display_(/*18.32*/c/*18.33*/.getProducts.size()),format.raw/*18.52*/("""</span>
        </a>
      """)))}),format.raw/*20.8*/("""
    """),format.raw/*21.5*/("""</div>
  </div>
  <div class="col-sm-10">
      """),_display_(/*24.8*/if(flash.containsKey("success"))/*24.40*/ {_display_(Seq[Any](format.raw/*24.42*/("""
        """),format.raw/*25.9*/("""<div class="alert alert-success">
          """),_display_(/*26.12*/flash/*26.17*/.get("success")),format.raw/*26.32*/("""
        """),format.raw/*27.9*/("""</div>
      """)))}),format.raw/*28.8*/("""

      			"""),format.raw/*30.10*/("""<!-- Search Form -->
			<div id="actions">
        <form action=""""),_display_(/*32.24*/routes/*32.30*/.ProductCtrl.listProducts(catId)),format.raw/*32.62*/("""" method="GET">
         <input type="search" id="searchbox" name="filter" value=""""),_display_(/*33.68*/filter),format.raw/*33.74*/("""" placeholder="Filter by product name...">
         <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
        </form>
       </div>
    <table class="table table-bordered table-hover table-condensed">   
      <thead>
        <tr>
          <th></th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*49.10*/for(p<-products) yield /*49.26*/ {_display_(Seq[Any](format.raw/*49.28*/("""
          """),format.raw/*50.11*/("""<tr>
              """),_display_(/*51.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*51.104*/ {_display_(Seq[Any](format.raw/*51.106*/("""
                """),format.raw/*52.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*52.72*/(p.getId + ".jpg")),format.raw/*52.90*/(""""/></td>
            """)))}/*53.15*/else/*53.20*/{_display_(Seq[Any](format.raw/*53.21*/("""
                """),format.raw/*54.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*55.14*/("""
            
            """),format.raw/*57.13*/("""<td>
                """),_display_(/*58.18*/p/*58.19*/.getName),format.raw/*58.27*/("""</td>
               </a>     
            <td>"""),_display_(/*60.18*/p/*60.19*/.getDescription),format.raw/*60.34*/("""</td>
            <td  class="numeric">"""),_display_(/*61.35*/p/*61.36*/.getStock),format.raw/*61.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*62.37*/("%.2f".format(p.getPrice))),format.raw/*62.64*/("""</td>
            <td><a href=""""),_display_(/*63.27*/routes/*63.33*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*63.67*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
              """)))}),format.raw/*64.16*/("""
"""),format.raw/*65.1*/("""</table>

   
 
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],catId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,catId,filter,user,env)

  def f:((List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,catId,filter,user,env) => apply(products,categories,catId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 31 23:03:26 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: 5066d3c3b8de5d4e86cb84b0be66b4856f43f9bf
                  MATRIX: 651->1|690->35|728->68|1124->95|1339->214|1371->221|1400->242|1439->244|1469->248|1657->409|1672->415|1729->451|1808->504|1844->524|1884->526|1921->536|1958->546|1973->552|2036->594|2090->621|2100->622|2130->630|2170->642|2218->663|2228->664|2268->683|2328->713|2361->719|2439->771|2480->803|2520->805|2557->815|2630->861|2644->866|2680->881|2717->891|2762->906|2803->919|2898->987|2913->993|2966->1025|3077->1109|3104->1115|3599->1583|3631->1599|3671->1601|3711->1613|3759->1634|3857->1722|3898->1724|3944->1742|4026->1797|4065->1815|4107->1839|4120->1844|4159->1845|4205->1863|4324->1951|4380->1979|4430->2002|4440->2003|4469->2011|4546->2061|4556->2062|4592->2077|4660->2118|4670->2119|4700->2128|4770->2171|4818->2198|4878->2231|4893->2237|4948->2271|5094->2386|5123->2388
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|81->49|81->49|81->49|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|87->55|89->57|90->58|90->58|90->58|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|95->63|95->63|95->63|96->64|97->65
                  -- GENERATED --
              */
          