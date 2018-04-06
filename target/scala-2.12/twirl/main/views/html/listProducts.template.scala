
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
                  DATE: Fri Apr 06 22:18:11 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/listProducts.scala.html
                  HASH: e740d72d73f2a407254f6d45ec081042b9822377
                  MATRIX: 651->1|690->34|728->66|1124->92|1344->216|1373->220|1402->241|1441->243|1468->244|1507->257|1521->263|1582->304|1754->449|1769->455|1826->491|1899->538|1935->558|1975->560|2011->569|2048->579|2063->585|2126->627|2180->654|2190->655|2220->663|2259->674|2307->695|2317->696|2357->715|2415->743|2447->748|2522->797|2563->829|2603->831|2639->840|2711->885|2725->890|2761->905|2797->914|2841->928|2880->939|2973->1005|2988->1011|3046->1048|3156->1131|3183->1137|3712->1639|3744->1655|3784->1657|3823->1668|3870->1688|3942->1751|3982->1753|4027->1770|4084->1800|4123->1818|4164->1841|4177->1846|4216->1847|4261->1864|4354->1926|4425->1969|4466->1983|4481->1989|4538->2025|4568->2028|4578->2029|4607->2037|4681->2084|4691->2085|4727->2100|4794->2140|4804->2141|4834->2150|4903->2192|4951->2219|5010->2251|5025->2257|5080->2291|5238->2418|5279->2431
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|86->54|86->54|86->54|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|92->60|95->63|95->63|95->63|95->63|95->63|95->63|95->63|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|100->68|100->68|100->68|102->70|103->71
                  -- GENERATED --
              */
          