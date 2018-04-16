
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
        """),_display_(/*36.10*/for(c <- categories) yield /*36.30*/ {_display_(Seq[Any](format.raw/*36.32*/("""
          """),format.raw/*37.11*/("""<a href=""""),_display_(/*37.21*/routes/*37.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*37.61*/("""" class="btn btn-sm">"""),_display_(/*37.83*/c/*37.84*/.getName),format.raw/*37.92*/("""
            """),format.raw/*38.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*38.59*/c/*38.60*/.getProducts().size),format.raw/*38.79*/("""</span>
          </a>
        """)))}),format.raw/*40.10*/("""
     
      """),format.raw/*42.7*/("""</div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*57.10*/if(flash.containsKey("success"))/*57.42*/ {_display_(Seq[Any](format.raw/*57.44*/("""
          """),format.raw/*58.11*/("""<div class="alert alert-success">
            """),_display_(/*59.14*/flash/*59.19*/.get("success")),format.raw/*59.34*/("""
          """),format.raw/*60.11*/("""</div>
        """)))}),format.raw/*61.10*/("""
       
        
      
        
        """),format.raw/*66.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*68.12*/for(p<-products) yield /*68.28*/ {_display_(Seq[Any](format.raw/*68.30*/("""
              """),format.raw/*69.15*/("""<a href=""""),_display_(/*69.25*/routes/*69.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*69.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*70.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*70.83*/ {_display_(Seq[Any](format.raw/*70.85*/("""
                    """),format.raw/*71.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*71.54*/(p.getId + ".png")),format.raw/*71.72*/("""" id="prodImg"/>
                """)))}/*72.19*/else/*72.24*/{_display_(Seq[Any](format.raw/*72.25*/("""
                    """),format.raw/*73.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*74.18*/("""
                  """),format.raw/*75.19*/("""<h4 id="prodName">"""),_display_(/*75.38*/p/*75.39*/.getName),format.raw/*75.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*77.40*/p/*77.41*/.getPrice),format.raw/*77.50*/("""</h4>
                 <p>
                    """),_display_(/*79.22*/for(c<-p.getCategories) yield /*79.45*/{_display_(Seq[Any](format.raw/*79.46*/("""
                      """),_display_(/*80.24*/c/*80.25*/.getName),format.raw/*80.33*/("""&nbsp;
                    """)))}),format.raw/*81.22*/("""
                    """),_display_(/*82.22*/if(user != null)/*82.38*/{_display_(Seq[Any](format.raw/*82.39*/("""
                      """),_display_(/*83.24*/if("admin".equals(user.getRole()))/*83.58*/{_display_(Seq[Any](format.raw/*83.59*/("""
                        """),_display_(/*84.26*/if(p.getStock > 0)/*84.44*/{_display_(Seq[Any](format.raw/*84.45*/("""
                          """),format.raw/*85.27*/("""<div id="prodStock">Stock: """),_display_(/*85.55*/p/*85.56*/.getStock),format.raw/*85.65*/("""</div>
                        """)))}/*86.27*/else/*86.32*/{_display_(Seq[Any](format.raw/*86.33*/("""
                          """),format.raw/*87.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*88.26*/("""
                      """)))}),format.raw/*89.24*/("""
                    """)))}),format.raw/*90.22*/("""
                    """),_display_(/*91.22*/if(user != null)/*91.38*/{_display_(Seq[Any](format.raw/*91.39*/("""
                      """),_display_(/*92.24*/if("admin".equals(user.getRole()))/*92.58*/{_display_(Seq[Any](format.raw/*92.59*/("""
                      """),_display_(/*93.24*/p/*93.25*/.getPegi),format.raw/*93.33*/("""
                    """)))}/*94.22*/else/*94.26*/{_display_(Seq[Any](format.raw/*94.27*/("""
                      """),format.raw/*95.23*/("""<br>"""),_display_(/*95.28*/p/*95.29*/.getPegi),format.raw/*95.37*/("""
                    """)))}),format.raw/*96.22*/("""
                  """)))}/*97.20*/else/*97.24*/{_display_(Seq[Any](format.raw/*97.25*/("""
                    """),format.raw/*98.21*/("""<br>"""),_display_(/*98.26*/p/*98.27*/.getPegi),format.raw/*98.35*/("""
                  """)))}),format.raw/*99.20*/("""
                  """),format.raw/*100.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*106.18*/("""
              """),format.raw/*107.15*/("""</div>
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
                  DATE: Mon Apr 16 10:59:43 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/listProducts.scala.html
                  HASH: db1a96d888e68d80d517b270f5f9e0442deff885
                  MATRIX: 651->1|690->34|728->66|1124->92|1344->216|1373->220|1398->237|1437->239|1466->242|1514->264|1528->270|1589->311|1742->437|1767->453|1806->454|1847->468|1890->502|1929->503|1972->518|2098->617|2113->623|2164->653|2358->816|2401->828|2440->839|2558->930|2573->936|2631->973|2767->1082|2794->1088|3018->1285|3054->1305|3094->1307|3133->1318|3170->1328|3185->1334|3240->1368|3289->1390|3299->1391|3328->1399|3369->1412|3442->1458|3452->1459|3492->1478|3555->1510|3595->1523|3771->1672|3812->1704|3852->1706|3891->1717|3965->1764|3979->1769|4015->1784|4054->1795|4101->1811|4170->1853|4306->1962|4338->1978|4378->1980|4421->1995|4458->2005|4473->2011|4530->2047|4618->2108|4690->2171|4730->2173|4779->2194|4839->2227|4878->2245|4931->2280|4944->2285|4983->2286|5032->2307|5140->2384|5187->2403|5233->2422|5243->2423|5272->2431|5363->2495|5373->2496|5403->2505|5478->2553|5517->2576|5556->2577|5607->2601|5617->2602|5646->2610|5705->2638|5754->2660|5779->2676|5818->2677|5869->2701|5912->2735|5951->2736|6004->2762|6031->2780|6070->2781|6125->2808|6180->2836|6190->2837|6220->2846|6271->2879|6284->2884|6323->2885|6378->2912|6469->2972|6524->2996|6577->3018|6626->3040|6651->3056|6690->3057|6741->3081|6784->3115|6823->3116|6874->3140|6884->3141|6913->3149|6954->3171|6967->3175|7006->3176|7057->3199|7089->3204|7099->3205|7128->3213|7181->3235|7220->3255|7233->3259|7272->3260|7321->3281|7353->3286|7363->3287|7392->3295|7443->3315|7491->3334|7629->3440|7673->3455
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|48->16|48->16|48->16|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|60->28|61->29|63->31|63->31|63->31|64->32|64->32|68->36|68->36|68->36|69->37|69->37|69->37|69->37|69->37|69->37|69->37|70->38|70->38|70->38|70->38|72->40|74->42|89->57|89->57|89->57|90->58|91->59|91->59|91->59|92->60|93->61|98->66|100->68|100->68|100->68|101->69|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|105->73|106->74|107->75|107->75|107->75|107->75|109->77|109->77|109->77|111->79|111->79|111->79|112->80|112->80|112->80|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|117->85|118->86|118->86|118->86|119->87|120->88|121->89|122->90|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|127->95|128->96|129->97|129->97|129->97|130->98|130->98|130->98|130->98|131->99|132->100|138->106|139->107
                  -- GENERATED --
              */
          