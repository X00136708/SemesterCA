
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
"""),format.raw/*8.1*/("""<link href=""""),_display_(/*8.14*/routes/*8.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.61*/("""" rel="stylesheet" />
<p class="lead">Games</p>
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
       <div id="tab"></div>
    <table class="table table-bordered table-hover table-condensed">
        
      <thead>
        <tr>
          <th></th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
        <br>
      </thead>
    </div>
      

      <tbody>
        """),_display_(/*54.10*/for(p<-products) yield /*54.26*/ {_display_(Seq[Any](format.raw/*54.28*/("""
          """),format.raw/*55.11*/("""<tr>
              """),_display_(/*56.16*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*56.79*/ {_display_(Seq[Any](format.raw/*56.81*/("""
                """),format.raw/*57.17*/("""<td><img src="/assets/images/"""),_display_(/*57.47*/(p.getId + ".png")),format.raw/*57.65*/(""""/></td>
            """)))}/*58.15*/else/*58.20*/{_display_(Seq[Any](format.raw/*58.21*/("""
                """),format.raw/*59.17*/("""<td><img src="/assets/images/noImage.jpg"/></td>
            """)))}),format.raw/*60.14*/("""
            
            
                """),format.raw/*63.17*/("""<td><a href=""""),_display_(/*63.31*/routes/*63.37*/.ProductCtrl.productDetails(p.getId)),format.raw/*63.73*/("""">"""),_display_(/*63.76*/p/*63.77*/.getName),format.raw/*63.85*/("""</a>
               </a>     
            <td>"""),_display_(/*65.18*/p/*65.19*/.getDescription),format.raw/*65.34*/("""</td>
            <td  class="numeric">"""),_display_(/*66.35*/p/*66.36*/.getStock),format.raw/*66.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*67.37*/("%.2f".format(p.getPrice))),format.raw/*67.64*/("""</td>
            <td><a href=""""),_display_(/*68.27*/routes/*68.33*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*68.67*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
            
              """)))}),format.raw/*70.16*/("""
            """),format.raw/*71.13*/("""</table>


   
 
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
                  DATE: Fri Apr 06 18:58:31 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: 655edb8ce2dfb40c562a7c7badd06b2ae1b972af
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1405->247|1444->249|1472->251|1511->264|1525->270|1586->311|1765->463|1780->469|1837->505|1911->553|1947->573|1987->575|2024->585|2061->595|2076->601|2139->643|2193->670|2203->671|2233->679|2273->691|2321->712|2331->713|2371->732|2431->762|2464->768|2542->820|2583->852|2623->854|2660->864|2733->910|2747->915|2783->930|2820->940|2865->955|2906->968|3001->1036|3016->1042|3074->1079|3185->1163|3212->1169|3762->1692|3794->1708|3834->1710|3874->1722|3922->1743|3994->1806|4034->1808|4080->1826|4137->1856|4176->1874|4218->1898|4231->1903|4270->1904|4316->1922|4410->1985|4484->2031|4525->2045|4540->2051|4597->2087|4627->2090|4637->2091|4666->2099|4742->2148|4752->2149|4788->2164|4856->2205|4866->2206|4896->2215|4966->2258|5014->2285|5074->2318|5089->2324|5144->2358|5304->2487|5346->2501
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|86->54|86->54|86->54|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|92->60|95->63|95->63|95->63|95->63|95->63|95->63|95->63|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|100->68|100->68|100->68|102->70|103->71
                  -- GENERATED --
              */
          