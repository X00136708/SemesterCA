
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

object shop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

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
    <h4>Platforms</h4>
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.ProductCtrl.shop(0, filter)),format.raw/*15.51*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.ProductCtrl.shop(c.getId, filter)),format.raw/*17.59*/("""" class="list-group-item">"""),_display_(/*17.86*/c/*17.87*/.getName),format.raw/*17.95*/("""
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
        <form action=""""),_display_(/*32.24*/routes/*32.30*/.ProductCtrl.shop(catId)),format.raw/*32.54*/("""" method="GET">
         <input type="search" id="searchbox" name="filter" value=""""),_display_(/*33.68*/filter),format.raw/*33.74*/("""" placeholder="Filter by product name...">
         <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
        </form>
       </div>
    <table class="table table-bordered table-hover table-condensed">   
      <thead>
        <tr>
          <th></th>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*50.10*/for(p<-products) yield /*50.26*/ {_display_(Seq[Any](format.raw/*50.28*/("""
          """),format.raw/*51.11*/("""<tr>
              """),_display_(/*52.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*52.104*/ {_display_(Seq[Any](format.raw/*52.106*/("""
                """),format.raw/*53.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*53.72*/(p.getId + ".jpg")),format.raw/*53.90*/(""""/></td>
            """)))}/*54.15*/else/*54.20*/{_display_(Seq[Any](format.raw/*54.21*/("""
                """),format.raw/*55.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*56.14*/("""
            """),format.raw/*57.13*/("""<td class="numeric">"""),_display_(/*57.34*/p/*57.35*/.getId),format.raw/*57.41*/("""</td>
            <td><a href=""""),_display_(/*58.27*/routes/*58.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*58.69*/("""">
                """),_display_(/*59.18*/p/*59.19*/.getName),format.raw/*59.27*/("""</td>
               </a>     
            <td>"""),_display_(/*61.18*/p/*61.19*/.getDescription),format.raw/*61.34*/("""</td>
            <td  class="numeric">"""),_display_(/*62.35*/p/*62.36*/.getStock),format.raw/*62.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*63.37*/("%.2f".format(p.getPrice))),format.raw/*63.64*/("""</td>
            <td><a href=""""),_display_(/*64.27*/routes/*64.33*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*64.67*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>

          </tr>
        """)))}),format.raw/*67.10*/("""
      """),format.raw/*68.7*/("""</tbody>

    </table>
  </div>
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
                  DATE: Mon Mar 12 11:23:25 GMT 2018
                  SOURCE: /home/wdd/webapps/PlayLab5-master/app/views/shop.scala.html
                  HASH: 9e1f7c61cae3eebad9cf20bed5237a00e6bc8d42
                  MATRIX: 651->1|690->34|728->66|1116->92|1331->211|1360->215|1389->236|1428->238|1456->240|1637->394|1652->400|1701->428|1779->480|1815->500|1855->502|1891->511|1928->521|1943->527|1998->561|2052->588|2062->589|2091->597|2130->608|2178->629|2188->630|2228->649|2286->677|2318->682|2393->731|2434->763|2474->765|2510->774|2582->819|2596->824|2632->839|2668->848|2712->862|2751->873|2844->939|2859->945|2904->969|3014->1052|3041->1058|3542->1532|3574->1548|3614->1550|3653->1561|3700->1581|3798->1669|3839->1671|3884->1688|3966->1743|4005->1761|4046->1784|4059->1789|4098->1790|4143->1807|4261->1894|4302->1907|4350->1928|4360->1929|4387->1935|4446->1967|4461->1973|4518->2009|4565->2029|4575->2030|4604->2038|4679->2086|4689->2087|4725->2102|4792->2142|4802->2143|4832->2152|4901->2194|4949->2221|5008->2253|5023->2259|5078->2293|5234->2418|5268->2425
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|82->50|82->50|82->50|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|88->56|89->57|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|96->64|96->64|96->64|99->67|100->68
                  -- GENERATED --
              */
          