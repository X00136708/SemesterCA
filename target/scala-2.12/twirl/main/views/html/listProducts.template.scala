
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
  def apply/*4.2*/(products: List[Product], categories: List[Category], platformId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.126*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<p class="lead">Games</p>
<br>
<div class="row">
  <div class="col-sm-2">
   
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.ProductCtrl.listProducts(0, filter)),format.raw/*15.59*/("""" class="list-group-item">Platforms</a>
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
        <form action=""""),_display_(/*32.24*/routes/*32.30*/.ProductCtrl.listProducts(platformId)),format.raw/*32.67*/("""" method="GET">
         <input type="search" id="searchbox" name="filter" value=""""),_display_(/*33.68*/filter),format.raw/*33.74*/("""" placeholder="Search for game...">
         <input type="submit" id="searchsubmit" value="Search" class="btn-md btn-primary">
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

  def render(products:List[Product],categories:List[Category],platformId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,platformId,filter,user,env)

  def f:((List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,platformId,filter,user,env) => apply(products,categories,platformId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 01 18:15:18 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: 69927c011d7d203f7cf45cb25666677db7ce0c71
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1405->247|1444->249|1474->253|1630->382|1645->388|1702->424|1776->472|1812->492|1852->494|1889->504|1926->514|1941->520|2004->562|2058->589|2068->590|2098->598|2138->610|2186->631|2196->632|2236->651|2296->681|2329->687|2407->739|2448->771|2488->773|2525->783|2598->829|2612->834|2648->849|2685->859|2730->874|2771->887|2866->955|2881->961|2939->998|3050->1082|3077->1088|3557->1541|3589->1557|3629->1559|3669->1571|3717->1592|3815->1680|3856->1682|3902->1700|3984->1755|4023->1773|4065->1797|4078->1802|4117->1803|4163->1821|4282->1909|4338->1937|4388->1960|4398->1961|4427->1969|4504->2019|4514->2020|4550->2035|4618->2076|4628->2077|4658->2086|4728->2129|4776->2156|4836->2189|4851->2195|4906->2229|5052->2344|5081->2346
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|81->49|81->49|81->49|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|87->55|89->57|90->58|90->58|90->58|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|95->63|95->63|95->63|96->64|97->65
                  -- GENERATED --
              */
          