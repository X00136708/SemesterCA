
package views.html.productAdmin

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

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],List[Category],User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], categories: List[Category], user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.93*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""
"""),format.raw/*8.1*/("""<link href=""""),_display_(/*8.14*/routes/*8.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.61*/("""" rel="stylesheet" />
<p class="lead">Games</p>
<br>
<div class="row">
  <div class="col-sm-2">
   
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.AdminProductCtrl.listProducts(0)),format.raw/*15.56*/("""" class="list-group-item">Platforms</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.ProductCtrl.listProducts(c.getId)),format.raw/*17.59*/("""" class="list-group-item">"""),_display_(/*17.86*/c/*17.87*/.getName),format.raw/*17.95*/("""
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

      """),format.raw/*30.7*/("""<table class="table table-bordered table-hover table-condensed">
        
      <thead>
        <tr>
          <th></th>
          <th>Name</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
        <br>
      </thead>
    </div>
      

      <tbody>
        """),_display_(/*45.10*/for(p<-products) yield /*45.26*/ {_display_(Seq[Any](format.raw/*45.28*/("""
          """),format.raw/*46.11*/("""<tr>
              """),_display_(/*47.16*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*47.79*/ {_display_(Seq[Any](format.raw/*47.81*/("""
                """),format.raw/*48.17*/("""<td><img src="/assets/images/"""),_display_(/*48.47*/(p.getId + ".png")),format.raw/*48.65*/(""""/></td>
            """)))}/*49.15*/else/*49.20*/{_display_(Seq[Any](format.raw/*49.21*/("""
                """),format.raw/*50.17*/("""<td><img src="/assets/images/noImage.jpg"/></td>
            """)))}),format.raw/*51.14*/("""
            
            
                """),format.raw/*54.17*/("""<td><a href=""""),_display_(/*54.31*/routes/*54.37*/.ProductCtrl.productDetails(p.getId)),format.raw/*54.73*/("""">"""),_display_(/*54.76*/p/*54.77*/.getName),format.raw/*54.85*/("""</a>
               </a>     
           
            <td  class="numeric">"""),_display_(/*57.35*/p/*57.36*/.getStock),format.raw/*57.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*58.37*/("%.2f".format(p.getPrice))),format.raw/*58.64*/("""</td>
            
            <td><a href=""""),_display_(/*60.27*/routes/*60.33*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*60.73*/("""" class="button xs btn-danger">
                  <span class="glyphicon glyphicon-pencil"></span>
                </a>
              </td>        
            <td><a href=""""),_display_(/*64.27*/routes/*64.33*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*64.73*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
            
              """)))}),format.raw/*69.16*/("""
            """),format.raw/*70.13*/("""</table>
            <p>
                <a href=""""),_display_(/*72.27*/routes/*72.33*/.AdminProductCtrl.addProduct()),format.raw/*72.63*/("""">
                  <button class="btn btn-primary">Add a product</button>
                </a>
              </p>
            </div>

   
 
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[Product],List[Category],User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Apr 07 00:07:52 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productAdmin/listProducts.scala.html
                  HASH: a8cb62d14faf8c1e86c72ad34580a5046cb86b0a
                  MATRIX: 664->1|703->35|741->68|1125->95|1311->186|1343->193|1372->214|1411->216|1439->218|1478->231|1492->237|1553->278|1732->430|1747->436|1801->469|1875->517|1911->537|1951->539|1988->549|2025->559|2040->565|2095->599|2149->626|2159->627|2188->635|2228->647|2276->668|2286->669|2326->688|2386->718|2419->724|2497->776|2538->808|2578->810|2615->820|2688->866|2702->871|2738->886|2775->896|2820->911|2857->921|3181->1218|3213->1234|3253->1236|3293->1248|3341->1269|3413->1332|3453->1334|3499->1352|3556->1382|3595->1400|3637->1424|3650->1429|3689->1430|3735->1448|3829->1511|3903->1557|3944->1571|3959->1577|4016->1613|4046->1616|4056->1617|4085->1625|4191->1704|4201->1705|4231->1714|4301->1757|4349->1784|4423->1831|4438->1837|4499->1877|4704->2055|4719->2061|4780->2101|5014->2304|5056->2318|5136->2371|5151->2377|5202->2407
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|83->51|86->54|86->54|86->54|86->54|86->54|86->54|86->54|89->57|89->57|89->57|90->58|90->58|92->60|92->60|92->60|96->64|96->64|96->64|101->69|102->70|104->72|104->72|104->72
                  -- GENERATED --
              */
          