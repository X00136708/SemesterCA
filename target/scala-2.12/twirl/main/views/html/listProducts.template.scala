
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
            """),_display_(/*17.14*/if(user.isInstanceOf[models.users.Administrator])/*17.63*/{_display_(Seq[Any](format.raw/*17.64*/("""
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
                      """),_display_(/*85.24*/if(user.isInstanceOf[models.users.Administrator])/*85.73*/{_display_(Seq[Any](format.raw/*85.74*/("""
                        """),_display_(/*86.26*/if(p.getStock > 0)/*86.44*/{_display_(Seq[Any](format.raw/*86.45*/("""
                          """),format.raw/*87.27*/("""<div id="prodStock">Stock: """),_display_(/*87.55*/p/*87.56*/.getStock),format.raw/*87.65*/("""</div>
                        """)))}/*88.27*/else/*88.32*/{_display_(Seq[Any](format.raw/*88.33*/("""
                          """),format.raw/*89.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*90.26*/("""
                      """)))}),format.raw/*91.24*/("""
                    """)))}),format.raw/*92.22*/("""
                    """),_display_(/*93.22*/if(user != null)/*93.38*/{_display_(Seq[Any](format.raw/*93.39*/("""
                      """),_display_(/*94.24*/if(user.isInstanceOf[models.users.Administrator])/*94.73*/{_display_(Seq[Any](format.raw/*94.74*/("""
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
                  DATE: Tue Apr 17 21:43:05 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: 2586a4a74ecee94767c94b02136c9c4cd6a074f6
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1401->243|1440->245|1470->249|1519->272|1533->278|1594->319|1754->452|1779->468|1818->469|1860->484|1918->533|1957->534|2001->550|2130->652|2145->658|2196->688|2396->857|2440->870|2480->882|2600->975|2615->981|2673->1018|2810->1128|2837->1134|3108->1378|3123->1384|3172->1412|3248->1461|3284->1481|3324->1483|3364->1495|3401->1505|3416->1511|3471->1545|3520->1567|3530->1568|3559->1576|3601->1590|3674->1636|3684->1637|3724->1656|3789->1690|3831->1705|4022->1869|4063->1901|4103->1903|4143->1915|4218->1963|4232->1968|4268->1983|4308->1995|4356->2012|4430->2059|4568->2170|4600->2186|4640->2188|4684->2204|4721->2214|4736->2220|4793->2256|4882->2318|4954->2381|4994->2383|5044->2405|5104->2438|5143->2456|5197->2492|5210->2497|5249->2498|5299->2520|5408->2598|5456->2618|5502->2637|5512->2638|5541->2646|5634->2712|5644->2713|5674->2722|5751->2772|5790->2795|5829->2796|5881->2821|5891->2822|5920->2830|5980->2859|6030->2882|6055->2898|6094->2899|6146->2924|6204->2973|6243->2974|6297->3001|6324->3019|6363->3020|6419->3048|6474->3076|6484->3077|6514->3086|6566->3120|6579->3125|6618->3126|6674->3154|6766->3215|6822->3240|6876->3263|6926->3286|6951->3302|6990->3303|7042->3328|7100->3377|7139->3378|7193->3404|7240->3424|7250->3425|7279->3433|7327->3462|7340->3466|7379->3467|7431->3491|7482->3515|7492->3516|7521->3524|7581->3553|7621->3574|7634->3578|7673->3579|7724->3601|7776->3625|7787->3626|7817->3634|7876->3661|7925->3681|8069->3793|8114->3809
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|48->16|48->16|48->16|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|60->28|61->29|63->31|63->31|63->31|64->32|64->32|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|72->40|74->42|76->44|91->59|91->59|91->59|92->60|93->61|93->61|93->61|94->62|95->63|100->68|102->70|102->70|102->70|103->71|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|108->76|109->77|109->77|109->77|109->77|111->79|111->79|111->79|113->81|113->81|113->81|114->82|114->82|114->82|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|119->87|120->88|120->88|120->88|121->89|122->90|123->91|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|129->97|130->98|131->99|131->99|131->99|132->100|132->100|132->100|132->100|133->101|134->102|140->108|141->109
                  -- GENERATED --
              */
          