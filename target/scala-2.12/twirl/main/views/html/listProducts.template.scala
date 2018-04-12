
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
  """),format.raw/*8.3*/("""<body>
  <link href=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.63*/("""" rel="stylesheet" />
  <h1>Games</h1>
  <br>
  <div class="row">
    <div class="col-sm-2">
     
      <div class="list-group">
        <b class="list-group-item">Platforms</b>
        """),_display_(/*17.10*/for(c <- categories) yield /*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
          """),format.raw/*18.11*/("""<a href=""""),_display_(/*18.21*/routes/*18.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*18.61*/("""" class="list-group-item">"""),_display_(/*18.88*/c/*18.89*/.getName),format.raw/*18.97*/("""
            """),format.raw/*19.13*/("""<span class="badge">"""),_display_(/*19.34*/c/*19.35*/.getProducts.size()),format.raw/*19.54*/("""</span>
          </a>
        """)))}),format.raw/*21.10*/("""
      """),format.raw/*22.7*/("""</div>

      """),_display_(/*24.8*/if(user != null)/*24.24*/{_display_(Seq[Any](format.raw/*24.25*/("""
        """),_display_(/*25.10*/if("admin".equals(user.getRole()))/*25.44*/{_display_(Seq[Any](format.raw/*25.45*/("""
          """),format.raw/*26.11*/("""<div class="list-group">
              <b class="list-group-item">Admin Controls</b>
              <p>
                  <a href=""""),_display_(/*29.29*/routes/*29.35*/.AdminProductCtrl.addProduct()),format.raw/*29.65*/("""" class="list-group-item">Add a product
                  </a>
                  <a href="#" class="list-group-item">Add a platform
                    </a>
                </p>
              
          </div>
        """)))}),format.raw/*36.10*/("""
      """)))}),format.raw/*37.8*/("""
      

      """),format.raw/*40.7*/("""<div id="actions">
          <form action=""""),_display_(/*41.26*/routes/*41.32*/.ProductCtrl.listProducts(platformId)),format.raw/*41.69*/("""" method="GET">
              <input type="search" id="searchbox" name="filter" value=""""),_display_(/*42.73*/filter),format.raw/*42.79*/("""" placeholder="Search for game...">
              <input type="submit" id="searchsubmit" value="Search" class="btn-md btn-primary">
             </form>
      </div>

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*52.10*/if(flash.containsKey("success"))/*52.42*/ {_display_(Seq[Any](format.raw/*52.44*/("""
          """),format.raw/*53.11*/("""<div class="alert alert-success">
            """),_display_(/*54.14*/flash/*54.19*/.get("success")),format.raw/*54.34*/("""
          """),format.raw/*55.11*/("""</div>
        """)))}),format.raw/*56.10*/("""
       
        
      
        
        """),format.raw/*61.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*63.12*/for(p<-products) yield /*63.28*/ {_display_(Seq[Any](format.raw/*63.30*/("""
              """),format.raw/*64.15*/("""<a href=""""),_display_(/*64.25*/routes/*64.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*64.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*65.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*65.83*/ {_display_(Seq[Any](format.raw/*65.85*/("""
                    """),format.raw/*66.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*66.54*/(p.getId + ".png")),format.raw/*66.72*/("""" id="prodImg"/>
                """)))}/*67.19*/else/*67.24*/{_display_(Seq[Any](format.raw/*67.25*/("""
                    """),format.raw/*68.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*69.18*/("""
                  """),format.raw/*70.19*/("""<h4 id="prodName">"""),_display_(/*70.38*/p/*70.39*/.getName),format.raw/*70.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*72.40*/p/*72.41*/.getPrice),format.raw/*72.50*/("""</h4>
                 <p>
                    """),_display_(/*74.22*/for(c<-p.getCategories) yield /*74.45*/{_display_(Seq[Any](format.raw/*74.46*/("""
                      """),_display_(/*75.24*/c/*75.25*/.getName),format.raw/*75.33*/("""&nbsp;
                    """)))}),format.raw/*76.22*/("""
                    """),_display_(/*77.22*/if(user != null)/*77.38*/{_display_(Seq[Any](format.raw/*77.39*/("""
                      """),_display_(/*78.24*/if("admin".equals(user.getRole()))/*78.58*/{_display_(Seq[Any](format.raw/*78.59*/("""
                        """),_display_(/*79.26*/if(p.getStock > 0)/*79.44*/{_display_(Seq[Any](format.raw/*79.45*/("""
                          """),format.raw/*80.27*/("""<div id="prodStock">Stock: """),_display_(/*80.55*/p/*80.56*/.getStock),format.raw/*80.65*/("""</div>
                        """)))}/*81.27*/else/*81.32*/{_display_(Seq[Any](format.raw/*81.33*/("""
                          """),format.raw/*82.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*83.26*/("""
                      """)))}),format.raw/*84.24*/("""
                    """)))}),format.raw/*85.22*/("""
                    """),_display_(/*86.22*/if(user != null)/*86.38*/{_display_(Seq[Any](format.raw/*86.39*/("""
                      """),_display_(/*87.24*/if("admin".equals(user.getRole()))/*87.58*/{_display_(Seq[Any](format.raw/*87.59*/("""
                      """),_display_(/*88.24*/p/*88.25*/.getPegi),format.raw/*88.33*/("""
                    """)))}/*89.22*/else/*89.26*/{_display_(Seq[Any](format.raw/*89.27*/("""
                      """),format.raw/*90.23*/("""<br>"""),_display_(/*90.28*/p/*90.29*/.getPegi),format.raw/*90.37*/("""
                    """)))}),format.raw/*91.22*/("""
                  """)))}/*92.20*/else/*92.24*/{_display_(Seq[Any](format.raw/*92.25*/("""
                    """),format.raw/*93.21*/("""<br>"""),_display_(/*93.26*/p/*93.27*/.getPegi),format.raw/*93.35*/("""
                  """)))}),format.raw/*94.20*/("""
                  """),format.raw/*95.19*/("""</p>
                  
                  </a>
             
              <!-- <td  class="numeric">"""),_display_(/*99.42*/p/*99.43*/.getStock),format.raw/*99.52*/("""</td>
              <td  class="numeric">€ """),_display_(/*100.39*/("%.2f".format(p.getPrice))),format.raw/*100.66*/("""</td>
              
              <td><a href=""""),_display_(/*102.29*/routes/*102.35*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*102.75*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  </a>
                </td>        
              <td><a href=""""),_display_(/*106.29*/routes/*106.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*106.75*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span>
                  </a>
                </td> -->
              
                """)))}),format.raw/*111.18*/("""
              """),format.raw/*112.15*/("""</div>
            </div>
          </div>
  
     
   
  </div>
</body>
  
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
                  DATE: Thu Apr 12 20:08:16 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: a66eddc93d2c6ea1db8bef8267cc8ea858385d7a
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1405->247|1444->249|1474->253|1523->276|1537->282|1598->323|1821->519|1857->539|1897->541|1937->553|1974->563|1989->569|2044->603|2098->630|2108->631|2137->639|2179->653|2227->674|2237->675|2277->694|2342->728|2377->736|2420->753|2445->769|2484->770|2522->781|2565->815|2604->816|2644->828|2805->962|2820->968|2871->998|3128->1224|3167->1233|3212->1251|3284->1296|3299->1302|3357->1339|3473->1428|3500->1434|3792->1699|3833->1731|3873->1733|3913->1745|3988->1793|4002->1798|4038->1813|4078->1825|4126->1842|4200->1889|4338->2000|4370->2016|4410->2018|4454->2034|4491->2044|4506->2050|4563->2086|4652->2148|4724->2211|4764->2213|4814->2235|4874->2268|4913->2286|4967->2322|4980->2327|5019->2328|5069->2350|5178->2428|5226->2448|5272->2467|5282->2468|5311->2476|5404->2542|5414->2543|5444->2552|5521->2602|5560->2625|5599->2626|5651->2651|5661->2652|5690->2660|5750->2689|5800->2712|5825->2728|5864->2729|5916->2754|5959->2788|5998->2789|6052->2816|6079->2834|6118->2835|6174->2863|6229->2891|6239->2892|6269->2901|6321->2935|6334->2940|6373->2941|6429->2969|6521->3030|6577->3055|6631->3078|6681->3101|6706->3117|6745->3118|6797->3143|6840->3177|6879->3178|6931->3203|6941->3204|6970->3212|7012->3235|7025->3239|7064->3240|7116->3264|7148->3269|7158->3270|7187->3278|7241->3301|7281->3322|7294->3326|7333->3327|7383->3349|7415->3354|7425->3355|7454->3363|7506->3384|7554->3404|7687->3510|7697->3511|7727->3520|7800->3565|7849->3592|7928->3643|7944->3649|8006->3689|8220->3875|8236->3881|8298->3921|8547->4138|8592->4154
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|53->21|54->22|56->24|56->24|56->24|57->25|57->25|57->25|58->26|61->29|61->29|61->29|68->36|69->37|72->40|73->41|73->41|73->41|74->42|74->42|84->52|84->52|84->52|85->53|86->54|86->54|86->54|87->55|88->56|93->61|95->63|95->63|95->63|96->64|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|101->69|102->70|102->70|102->70|102->70|104->72|104->72|104->72|106->74|106->74|106->74|107->75|107->75|107->75|108->76|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|112->80|113->81|113->81|113->81|114->82|115->83|116->84|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90|122->90|123->91|124->92|124->92|124->92|125->93|125->93|125->93|125->93|126->94|127->95|131->99|131->99|131->99|132->100|132->100|134->102|134->102|134->102|138->106|138->106|138->106|143->111|144->112
                  -- GENERATED --
              */
          