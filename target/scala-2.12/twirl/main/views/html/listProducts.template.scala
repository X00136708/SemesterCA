
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
                    <br>
        """),_display_(/*39.10*/for(c <- categories) yield /*39.30*/ {_display_(Seq[Any](format.raw/*39.32*/("""
          """),format.raw/*40.11*/("""<a href=""""),_display_(/*40.21*/routes/*40.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*40.61*/("""" class="btn btn-sm">"""),_display_(/*40.83*/c/*40.84*/.getName),format.raw/*40.92*/("""
            """),format.raw/*41.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*41.59*/c/*41.60*/.getProducts().size),format.raw/*41.79*/("""</span>
          </a>
        """)))}),format.raw/*43.10*/("""
     
      """),format.raw/*45.7*/("""</div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*60.10*/if(flash.containsKey("success"))/*60.42*/ {_display_(Seq[Any](format.raw/*60.44*/("""
          """),format.raw/*61.11*/("""<div class="alert alert-success">
            """),_display_(/*62.14*/flash/*62.19*/.get("success")),format.raw/*62.34*/("""
          """),format.raw/*63.11*/("""</div>
        """)))}),format.raw/*64.10*/("""
       
        
      
        
        """),format.raw/*69.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*71.12*/for(p<-products) yield /*71.28*/ {_display_(Seq[Any](format.raw/*71.30*/("""
              """),format.raw/*72.15*/("""<a href=""""),_display_(/*72.25*/routes/*72.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*72.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*73.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*73.83*/ {_display_(Seq[Any](format.raw/*73.85*/("""
                    """),format.raw/*74.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*74.54*/(p.getId + ".png")),format.raw/*74.72*/("""" id="prodImg"/>
                """)))}/*75.19*/else/*75.24*/{_display_(Seq[Any](format.raw/*75.25*/("""
                    """),format.raw/*76.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*77.18*/("""
                  """),format.raw/*78.19*/("""<h4 id="prodName">"""),_display_(/*78.38*/p/*78.39*/.getName),format.raw/*78.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*80.40*/p/*80.41*/.getPrice),format.raw/*80.50*/("""</h4>
                 <p>
                    """),_display_(/*82.22*/for(c<-p.getCategories) yield /*82.45*/{_display_(Seq[Any](format.raw/*82.46*/("""
                      """),_display_(/*83.24*/c/*83.25*/.getName),format.raw/*83.33*/("""&nbsp;
                    """)))}),format.raw/*84.22*/("""
                    """),_display_(/*85.22*/if(user != null)/*85.38*/{_display_(Seq[Any](format.raw/*85.39*/("""
                      """),_display_(/*86.24*/if(user.isInstanceOf[models.users.Administrator])/*86.73*/{_display_(Seq[Any](format.raw/*86.74*/("""
                        """),_display_(/*87.26*/if(p.getStock > 0)/*87.44*/{_display_(Seq[Any](format.raw/*87.45*/("""
                          """),format.raw/*88.27*/("""<div id="prodStock">Stock: """),_display_(/*88.55*/p/*88.56*/.getStock),format.raw/*88.65*/("""</div>
                        """)))}/*89.27*/else/*89.32*/{_display_(Seq[Any](format.raw/*89.33*/("""
                          """),format.raw/*90.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*91.26*/("""
                      """)))}),format.raw/*92.24*/("""
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(user != null)/*94.38*/{_display_(Seq[Any](format.raw/*94.39*/("""
                      """),_display_(/*95.24*/if(user.isInstanceOf[models.users.Administrator])/*95.73*/{_display_(Seq[Any](format.raw/*95.74*/("""
                        """),format.raw/*96.25*/("""<div id="prodPegi">"""),_display_(/*96.45*/p/*96.46*/.getPegi),format.raw/*96.54*/("""</div>
                    """)))}/*97.22*/else/*97.26*/{_display_(Seq[Any](format.raw/*97.27*/("""
                      """),format.raw/*98.23*/("""<br><div id="prodPegi">"""),_display_(/*98.47*/p/*98.48*/.getPegi),format.raw/*98.56*/("""</div>
                    """)))}),format.raw/*99.22*/("""
                  """)))}/*100.20*/else/*100.24*/{_display_(Seq[Any](format.raw/*100.25*/("""
                    """),format.raw/*101.21*/("""<br><div id="prodPegi">"""),_display_(/*101.45*/p/*101.46*/.getPegi),format.raw/*101.54*/("""</div>
                  """)))}),format.raw/*102.20*/("""
                  """),format.raw/*103.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*109.18*/("""
              """),format.raw/*110.15*/("""</div>
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
                  DATE: Wed Apr 18 12:06:14 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: 8f58cf4eb3b1a27b4a691b629c1dac0562d6080a
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1401->243|1440->245|1470->249|1519->272|1533->278|1594->319|1754->452|1779->468|1818->469|1860->484|1918->533|1957->534|2001->550|2130->652|2145->658|2196->688|2396->857|2440->870|2480->882|2600->975|2615->981|2673->1018|2810->1128|2837->1134|3108->1378|3123->1384|3172->1412|3274->1487|3310->1507|3350->1509|3390->1521|3427->1531|3442->1537|3497->1571|3546->1593|3556->1594|3585->1602|3627->1616|3700->1662|3710->1663|3750->1682|3815->1716|3857->1731|4048->1895|4089->1927|4129->1929|4169->1941|4244->1989|4258->1994|4294->2009|4334->2021|4382->2038|4456->2085|4594->2196|4626->2212|4666->2214|4710->2230|4747->2240|4762->2246|4819->2282|4908->2344|4980->2407|5020->2409|5070->2431|5130->2464|5169->2482|5223->2518|5236->2523|5275->2524|5325->2546|5434->2624|5482->2644|5528->2663|5538->2664|5567->2672|5660->2738|5670->2739|5700->2748|5777->2798|5816->2821|5855->2822|5907->2847|5917->2848|5946->2856|6006->2885|6056->2908|6081->2924|6120->2925|6172->2950|6230->2999|6269->3000|6323->3027|6350->3045|6389->3046|6445->3074|6500->3102|6510->3103|6540->3112|6592->3146|6605->3151|6644->3152|6700->3180|6792->3241|6848->3266|6902->3289|6952->3312|6977->3328|7016->3329|7068->3354|7126->3403|7165->3404|7219->3430|7266->3450|7276->3451|7305->3459|7353->3488|7366->3492|7405->3493|7457->3517|7508->3541|7518->3542|7547->3550|7607->3579|7648->3600|7662->3604|7702->3605|7753->3627|7805->3651|7816->3652|7846->3660|7905->3687|7954->3707|8098->3819|8143->3835
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|48->16|48->16|48->16|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|60->28|61->29|63->31|63->31|63->31|64->32|64->32|69->37|69->37|69->37|71->39|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|72->40|73->41|73->41|73->41|73->41|75->43|77->45|92->60|92->60|92->60|93->61|94->62|94->62|94->62|95->63|96->64|101->69|103->71|103->71|103->71|104->72|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|107->75|107->75|108->76|109->77|110->78|110->78|110->78|110->78|112->80|112->80|112->80|114->82|114->82|114->82|115->83|115->83|115->83|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|120->88|121->89|121->89|121->89|122->90|123->91|124->92|125->93|126->94|126->94|126->94|127->95|127->95|127->95|128->96|128->96|128->96|128->96|129->97|129->97|129->97|130->98|130->98|130->98|130->98|131->99|132->100|132->100|132->100|133->101|133->101|133->101|133->101|134->102|135->103|141->109|142->110
                  -- GENERATED --
              */
          