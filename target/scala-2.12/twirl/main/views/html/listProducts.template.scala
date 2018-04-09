
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
  """),format.raw/*8.3*/("""<link href=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.63*/("""" rel="stylesheet" />
  <p class="lead">Games</p>
  <br>
  <div class="row">
    <div class="col-sm-2">
     
      <div class="list-group">
        <b class="list-group-item">Platforms</b>
        """),_display_(/*16.10*/for(c <- categories) yield /*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
          """),format.raw/*17.11*/("""<a href=""""),_display_(/*17.21*/routes/*17.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*17.61*/("""" class="list-group-item">"""),_display_(/*17.88*/c/*17.89*/.getName),format.raw/*17.97*/("""
            """),format.raw/*18.13*/("""<span class="badge">"""),_display_(/*18.34*/c/*18.35*/.getProducts.size()),format.raw/*18.54*/("""</span>
          </a>
        """)))}),format.raw/*20.10*/("""
      """),format.raw/*21.7*/("""</div>

      """),_display_(/*23.8*/if(user != null)/*23.24*/{_display_(Seq[Any](format.raw/*23.25*/("""
        """),_display_(/*24.10*/if("admin".equals(user.getRole()))/*24.44*/{_display_(Seq[Any](format.raw/*24.45*/("""
          """),format.raw/*25.11*/("""<div class="list-group">
              <b class="list-group-item">Admin Controls</b>
              <p>
                  <a href=""""),_display_(/*28.29*/routes/*28.35*/.AdminProductCtrl.addProduct()),format.raw/*28.65*/("""" class="list-group-item">Add a product
                  </a>
                  <a href="#" class="list-group-item">Add a platform
                    </a>
                </p>
              
          </div>
        """)))}),format.raw/*35.10*/("""
      """)))}),format.raw/*36.8*/("""
      

      """),format.raw/*39.7*/("""<div id="actions">
          <form action=""""),_display_(/*40.26*/routes/*40.32*/.ProductCtrl.listProducts(platformId)),format.raw/*40.69*/("""" method="GET">
              <input type="search" id="searchbox" name="filter" value=""""),_display_(/*41.73*/filter),format.raw/*41.79*/("""" placeholder="Search for game...">
              <input type="submit" id="searchsubmit" value="Search" class="btn-md btn-primary">
             </form>
      </div>

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*51.10*/if(flash.containsKey("success"))/*51.42*/ {_display_(Seq[Any](format.raw/*51.44*/("""
          """),format.raw/*52.11*/("""<div class="alert alert-success">
            """),_display_(/*53.14*/flash/*53.19*/.get("success")),format.raw/*53.34*/("""
          """),format.raw/*54.11*/("""</div>
        """)))}),format.raw/*55.10*/("""
       
        
      
        
  
      """),format.raw/*61.7*/("""<div class="list-group">
          """),_display_(/*62.12*/for(p<-products) yield /*62.28*/ {_display_(Seq[Any](format.raw/*62.30*/("""
              """),format.raw/*63.15*/("""<a href=""""),_display_(/*63.25*/routes/*63.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*63.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*64.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*64.83*/ {_display_(Seq[Any](format.raw/*64.85*/("""
                    """),format.raw/*65.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*65.54*/(p.getId + ".png")),format.raw/*65.72*/("""" id="prodImg"/>
                """)))}/*66.19*/else/*66.24*/{_display_(Seq[Any](format.raw/*66.25*/("""
                    """),format.raw/*67.21*/("""<img src="/assets/images/noImage.jpg" id="prodImg"/>
                """)))}),format.raw/*68.18*/("""
                  """),format.raw/*69.19*/("""<h4 id="prodName">"""),_display_(/*69.38*/p/*69.39*/.getName),format.raw/*69.47*/("""</h4>
                  <h4 id="prodPrice">€"""),_display_(/*70.40*/p/*70.41*/.getPrice),format.raw/*70.50*/("""</h4>
                 <p>
                    """),_display_(/*72.22*/for(c<-p.getCategories) yield /*72.45*/{_display_(Seq[Any](format.raw/*72.46*/("""
                      """),_display_(/*73.24*/c/*73.25*/.getName),format.raw/*73.33*/("""&nbsp;
                    """)))}),format.raw/*74.22*/("""<br>
                    """),_display_(/*75.22*/p/*75.23*/.getPegi),format.raw/*75.31*/("""
                  """),format.raw/*76.19*/("""</p>
                  
                  </a>
             
              <!-- <td  class="numeric">"""),_display_(/*80.42*/p/*80.43*/.getStock),format.raw/*80.52*/("""</td>
              <td  class="numeric">€ """),_display_(/*81.39*/("%.2f".format(p.getPrice))),format.raw/*81.66*/("""</td>
              
              <td><a href=""""),_display_(/*83.29*/routes/*83.35*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*83.75*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  </a>
                </td>        
              <td><a href=""""),_display_(/*87.29*/routes/*87.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*87.75*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span>
                  </a>
                </td> -->
              
                """)))}),format.raw/*92.18*/("""
              """),format.raw/*93.15*/("""</div>
            </div>
          </div>
  
     
   
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
                  DATE: Mon Apr 09 14:13:29 IST 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/listProducts.scala.html
                  HASH: e980ebbe5acf0456a457eea50c9d1d2f31a12b89
                  MATRIX: 651->1|690->34|728->66|1124->92|1344->216|1373->220|1402->241|1441->243|1470->246|1509->259|1523->265|1584->306|1810->505|1846->525|1886->527|1925->538|1962->548|1977->554|2032->588|2086->615|2096->616|2125->624|2166->637|2214->658|2224->659|2264->678|2327->710|2361->717|2402->732|2427->748|2466->749|2503->759|2546->793|2585->794|2624->805|2782->936|2797->942|2848->972|3098->1191|3136->1199|3178->1214|3249->1258|3264->1264|3322->1301|3437->1389|3464->1395|3746->1650|3787->1682|3827->1684|3866->1695|3940->1742|3954->1747|3990->1762|4029->1773|4076->1789|4146->1832|4209->1868|4241->1884|4281->1886|4324->1901|4361->1911|4376->1917|4433->1953|4521->2014|4593->2077|4633->2079|4682->2100|4742->2133|4781->2151|4834->2186|4847->2191|4886->2192|4935->2213|5036->2283|5083->2302|5129->2321|5139->2322|5168->2330|5240->2375|5250->2376|5280->2385|5355->2433|5394->2456|5433->2457|5484->2481|5494->2482|5523->2490|5582->2518|5635->2544|5645->2545|5674->2553|5721->2572|5850->2674|5860->2675|5890->2684|5961->2728|6009->2755|6085->2804|6100->2810|6161->2850|6370->3032|6385->3038|6446->3078|6689->3290|6732->3305
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|60->28|60->28|60->28|67->35|68->36|71->39|72->40|72->40|72->40|73->41|73->41|83->51|83->51|83->51|84->52|85->53|85->53|85->53|86->54|87->55|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|100->68|101->69|101->69|101->69|101->69|102->70|102->70|102->70|104->72|104->72|104->72|105->73|105->73|105->73|106->74|107->75|107->75|107->75|108->76|112->80|112->80|112->80|113->81|113->81|115->83|115->83|115->83|119->87|119->87|119->87|124->92|125->93
                  -- GENERATED --
              */
          