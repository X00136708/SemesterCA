
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


"""),_display_(/*7.2*/main("Shop",user)/*7.19*/ {_display_(Seq[Any](format.raw/*7.21*/("""
  """),format.raw/*8.3*/("""<body>
  <link href=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.63*/("""" rel="stylesheet" />
  <h1>Games</h1>
  <br>
  <div class="row">
      
     
      <div class="list-categories">
          """),_display_(/*16.12*/if(user != null)/*16.28*/{_display_(Seq[Any](format.raw/*16.29*/("""
            """),_display_(/*17.14*/if("admin".equals(user.getRole()))/*17.48*/{_display_(Seq[Any](format.raw/*17.49*/("""
              """),format.raw/*18.15*/("""<div class="adminProduct">
                 
                  <p>
                      <a href=""""),_display_(/*21.33*/routes/*21.39*/.AdminProductCtrl.addProduct()),format.raw/*21.69*/("""" class="btn btn-sm">Add a product
                      </a>
                      
                    </p>
                  
              </div>
            """)))}),format.raw/*27.14*/("""
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<div class="category">
              <div class="search">
                  <form action=""""),_display_(/*31.34*/routes/*31.40*/.ProductCtrl.listProducts(platformId)),format.raw/*31.77*/("""" class="text" method="GET">
                      <input type="search" id="searchbox" name="filter" value=""""),_display_(/*32.81*/filter),format.raw/*32.87*/("""" placeholder="Search for game...">
                      <input type="submit" id="searchsubmit" value="Search" class="searchbtn-sm ">
                  </form>
                    </div>
                    
                    <a href=""""),_display_(/*37.31*/routes/*37.37*/.ProductCtrl.listProducts(0)),format.raw/*37.65*/("""" class="btn btn-sm">All Platforms</a>
        """),_display_(/*38.10*/for(c <- categories) yield /*38.30*/ {_display_(Seq[Any](format.raw/*38.32*/("""
          """),format.raw/*39.11*/("""<a href=""""),_display_(/*39.21*/routes/*39.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*39.61*/("""" class="btn btn-sm">"""),_display_(/*39.83*/c/*39.84*/.getName),format.raw/*39.92*/("""
            """),format.raw/*40.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*40.59*/c/*40.60*/.getProducts().size),format.raw/*40.79*/("""</span>
          </a>
        """)))}),format.raw/*42.10*/("""
     
      """),format.raw/*44.7*/("""</div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*59.10*/if(flash.containsKey("success"))/*59.42*/ {_display_(Seq[Any](format.raw/*59.44*/("""
          """),format.raw/*60.11*/("""<div class="alert alert-success">
            """),_display_(/*61.14*/flash/*61.19*/.get("success")),format.raw/*61.34*/("""
          """),format.raw/*62.11*/("""</div>
        """)))}),format.raw/*63.10*/("""
       
        
      
        
        """),format.raw/*68.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*70.12*/for(p<-products) yield /*70.28*/ {_display_(Seq[Any](format.raw/*70.30*/("""
              """),format.raw/*71.15*/("""<a href=""""),_display_(/*71.25*/routes/*71.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*71.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*72.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*72.83*/ {_display_(Seq[Any](format.raw/*72.85*/("""
                    """),format.raw/*73.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*73.54*/(p.getId + ".png")),format.raw/*73.72*/("""" id="prodImg"/>
                """)))}/*74.19*/else/*74.24*/{_display_(Seq[Any](format.raw/*74.25*/("""
                    """),format.raw/*75.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*76.18*/("""
                  """),format.raw/*77.19*/("""<h4 id="prodName">"""),_display_(/*77.38*/p/*77.39*/.getName),format.raw/*77.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*79.40*/p/*79.41*/.getPrice),format.raw/*79.50*/("""</h4>
                 <p>
                    """),_display_(/*81.22*/for(c<-p.getCategories) yield /*81.45*/{_display_(Seq[Any](format.raw/*81.46*/("""
                      """),_display_(/*82.24*/c/*82.25*/.getName),format.raw/*82.33*/("""&nbsp;
                    """)))}),format.raw/*83.22*/("""
                    """),_display_(/*84.22*/if(user != null)/*84.38*/{_display_(Seq[Any](format.raw/*84.39*/("""
                      """),_display_(/*85.24*/if("admin".equals(user.getRole()))/*85.58*/{_display_(Seq[Any](format.raw/*85.59*/("""
                        """),_display_(/*86.26*/if(p.getStock > 0)/*86.44*/{_display_(Seq[Any](format.raw/*86.45*/("""
                          """),format.raw/*87.27*/("""<div id="prodStock">Stock: """),_display_(/*87.55*/p/*87.56*/.getStock),format.raw/*87.65*/("""</div>
                        """)))}/*88.27*/else/*88.32*/{_display_(Seq[Any](format.raw/*88.33*/("""
                          """),format.raw/*89.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*90.26*/("""
                      """)))}),format.raw/*91.24*/("""
                    """)))}),format.raw/*92.22*/("""
                    """),_display_(/*93.22*/if(user != null)/*93.38*/{_display_(Seq[Any](format.raw/*93.39*/("""
                      """),_display_(/*94.24*/if("admin".equals(user.getRole()))/*94.58*/{_display_(Seq[Any](format.raw/*94.59*/("""
                        """),format.raw/*95.25*/("""<div id="prodPegi">"""),_display_(/*95.45*/p/*95.46*/.getPegi),format.raw/*95.54*/("""</div>
                    """)))}/*96.22*/else/*96.26*/{_display_(Seq[Any](format.raw/*96.27*/("""
                      """),format.raw/*97.23*/("""<br><div id="prodPegi">"""),_display_(/*97.47*/p/*97.48*/.getPegi),format.raw/*97.56*/("""</div>
                    """)))}),format.raw/*98.22*/("""
                  """)))}/*99.20*/else/*99.24*/{_display_(Seq[Any](format.raw/*99.25*/("""
                    """),format.raw/*100.21*/("""<br><div id="prodPegi">"""),_display_(/*100.45*/p/*100.46*/.getPegi),format.raw/*100.54*/("""</div>
                  """)))}),format.raw/*101.20*/("""
                  """),format.raw/*102.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*108.18*/("""
              """),format.raw/*109.15*/("""</div>
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
                  DATE: Tue Apr 17 16:48:06 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/newSemca/semesterca/app/views/listProducts.scala.html
                  HASH: 8270a39233124eb18ebdc79129bb0e6e1b237c07
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1401->243|1440->245|1470->249|1519->272|1533->278|1594->319|1754->452|1779->468|1818->469|1860->484|1903->518|1942->519|1986->535|2115->637|2130->643|2181->673|2381->842|2425->855|2465->867|2585->960|2600->966|2658->1003|2795->1113|2822->1119|3093->1363|3108->1369|3157->1397|3233->1446|3269->1466|3309->1468|3349->1480|3386->1490|3401->1496|3456->1530|3505->1552|3515->1553|3544->1561|3586->1575|3659->1621|3669->1622|3709->1641|3774->1675|3816->1690|4007->1854|4048->1886|4088->1888|4128->1900|4203->1948|4217->1953|4253->1968|4293->1980|4341->1997|4415->2044|4553->2155|4585->2171|4625->2173|4669->2189|4706->2199|4721->2205|4778->2241|4867->2303|4939->2366|4979->2368|5029->2390|5089->2423|5128->2441|5182->2477|5195->2482|5234->2483|5284->2505|5393->2583|5441->2603|5487->2622|5497->2623|5526->2631|5619->2697|5629->2698|5659->2707|5736->2757|5775->2780|5814->2781|5866->2806|5876->2807|5905->2815|5965->2844|6015->2867|6040->2883|6079->2884|6131->2909|6174->2943|6213->2944|6267->2971|6294->2989|6333->2990|6389->3018|6444->3046|6454->3047|6484->3056|6536->3090|6549->3095|6588->3096|6644->3124|6736->3185|6792->3210|6846->3233|6896->3256|6921->3272|6960->3273|7012->3298|7055->3332|7094->3333|7148->3359|7195->3379|7205->3380|7234->3388|7282->3417|7295->3421|7334->3422|7386->3446|7437->3470|7447->3471|7476->3479|7536->3508|7576->3529|7589->3533|7628->3534|7679->3556|7731->3580|7742->3581|7772->3589|7831->3616|7880->3636|8024->3748|8069->3764
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|48->16|48->16|48->16|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|60->28|61->29|63->31|63->31|63->31|64->32|64->32|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|72->40|74->42|76->44|91->59|91->59|91->59|92->60|93->61|93->61|93->61|94->62|95->63|100->68|102->70|102->70|102->70|103->71|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|108->76|109->77|109->77|109->77|109->77|111->79|111->79|111->79|113->81|113->81|113->81|114->82|114->82|114->82|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|119->87|120->88|120->88|120->88|121->89|122->90|123->91|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|129->97|130->98|131->99|131->99|131->99|132->100|132->100|132->100|132->100|133->101|134->102|140->108|141->109
                  -- GENERATED --
              */
          