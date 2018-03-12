
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
"""),format.raw/*5.1*/("""<link href=""""),_display_(/*5.14*/routes/*5.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.61*/("""" rel="stylesheet" />

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
    
   

      <tbody>
          
        """),_display_(/*42.10*/for(p<-products) yield /*42.26*/ {_display_(Seq[Any](format.raw/*42.28*/("""
          """),format.raw/*43.11*/("""<div class="list-group">
            <div class="games">
         
              """),_display_(/*46.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*46.104*/ {_display_(Seq[Any](format.raw/*46.106*/("""
                """),format.raw/*47.17*/("""<img src="/assets/images/productImages/thumbnails/"""),_display_(/*47.68*/(p.getId + ".jpg")),format.raw/*47.86*/(""""/>
            """)))}/*48.15*/else/*48.20*/{_display_(Seq[Any](format.raw/*48.21*/("""
                """),format.raw/*49.17*/("""<img src="/assets/images/productImages/thumbnails/noImage.jpg"/>
            """)))}),format.raw/*50.14*/("""
            
            """),format.raw/*52.13*/("""<td></td>
            <td><a href=""""),_display_(/*53.27*/routes/*53.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*53.69*/("""">
                """),_display_(/*54.18*/p/*54.19*/.getName),format.raw/*54.27*/("""</td>
            </a>
              """),_display_(/*56.16*/p/*56.17*/.getPegi),format.raw/*56.25*/("""
                """),format.raw/*57.17*/("""<br>
                   
            <td>"""),_display_(/*59.18*/p/*59.19*/.getDescription),format.raw/*59.34*/("""</td>
            <td  class="numeric">"""),_display_(/*60.35*/p/*60.36*/.getStock),format.raw/*60.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*61.37*/("%.2f".format(p.getPrice))),format.raw/*61.64*/("""</td>
            <td><a href=""""),_display_(/*62.27*/routes/*62.33*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*62.67*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
          </div>
          </div>
        """)))}),format.raw/*65.10*/("""
      
      """),format.raw/*67.7*/("""</tbody>

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
                  DATE: Mon Mar 12 14:37:34 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/shop.scala.html
                  HASH: 1b48e426210781163f2ebd8034de12abe61b3ea3
                  MATRIX: 651->1|690->34|728->66|1116->92|1331->211|1358->212|1397->225|1411->231|1472->272|1521->296|1550->317|1589->319|1617->321|1798->475|1813->481|1862->509|1940->561|1976->581|2016->583|2052->592|2089->602|2104->608|2159->642|2213->669|2223->670|2252->678|2291->689|2339->710|2349->711|2389->730|2447->758|2479->763|2554->812|2595->844|2635->846|2671->855|2743->900|2757->905|2793->920|2829->929|2873->943|2912->954|3005->1020|3020->1026|3065->1050|3175->1133|3202->1139|3445->1355|3477->1371|3517->1373|3556->1384|3665->1466|3763->1554|3804->1556|3849->1573|3927->1624|3966->1642|4002->1660|4015->1665|4054->1666|4099->1683|4208->1761|4262->1787|4325->1823|4340->1829|4397->1865|4444->1885|4454->1886|4483->1894|4548->1932|4558->1933|4587->1941|4632->1958|4701->2000|4711->2001|4747->2016|4814->2056|4824->2057|4854->2066|4923->2108|4971->2135|5030->2167|5045->2173|5100->2207|5273->2349|5314->2363
                  LINES: 24->1|25->2|26->3|31->4|36->4|37->5|37->5|37->5|37->5|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|74->42|74->42|74->42|75->43|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|82->50|84->52|85->53|85->53|85->53|86->54|86->54|86->54|88->56|88->56|88->56|89->57|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|94->62|94->62|94->62|97->65|99->67
                  -- GENERATED --
              */
          