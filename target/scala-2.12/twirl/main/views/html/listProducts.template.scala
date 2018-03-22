
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
                  DATE: Thu Mar 22 12:31:57 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/listProducts.scala.html
                  HASH: eb9987a3ab9f2022cf07669a74f093cb72a8fd5c
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->211|1368->215|1397->236|1436->238|1464->240|1646->395|1661->401|1718->437|1796->489|1832->509|1872->511|1908->520|1945->530|1960->536|2023->578|2077->605|2087->606|2117->614|2156->625|2204->646|2214->647|2254->666|2312->694|2344->699|2419->748|2460->780|2500->782|2536->791|2608->836|2622->841|2658->856|2694->865|2738->879|2777->890|2870->956|2885->962|2938->994|3048->1077|3075->1083|3554->1535|3586->1551|3626->1553|3665->1564|3712->1584|3810->1672|3851->1674|3896->1691|3978->1746|4017->1764|4058->1787|4071->1792|4110->1793|4155->1810|4273->1897|4327->1923|4376->1945|4386->1946|4415->1954|4490->2002|4500->2003|4536->2018|4603->2058|4613->2059|4643->2068|4712->2110|4760->2137|4819->2169|4834->2175|4889->2209|5034->2323|5062->2324
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|81->49|81->49|81->49|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|87->55|89->57|90->58|90->58|90->58|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|95->63|95->63|95->63|96->64|97->65
                  -- GENERATED --
              */
          