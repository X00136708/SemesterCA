
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
                  DATE: Tue Apr 17 16:31:41 IST 2018
                  SOURCE: /home/wdd/Downloads/SemesterCA-master/app/views/listProducts.scala.html
                  HASH: 2ef329ea0df8c5638943072ce172b6fa3558aa92
                  MATRIX: 651->1|690->34|728->66|1124->92|1344->216|1373->220|1398->237|1437->239|1466->242|1514->264|1528->270|1589->311|1742->437|1767->453|1806->454|1847->468|1890->502|1929->503|1972->518|2098->617|2113->623|2164->653|2358->816|2401->828|2440->839|2558->930|2573->936|2631->973|2767->1082|2794->1088|3060->1327|3075->1333|3124->1361|3199->1409|3235->1429|3275->1431|3314->1442|3351->1452|3366->1458|3421->1492|3470->1514|3480->1515|3509->1523|3550->1536|3623->1582|3633->1583|3673->1602|3736->1634|3776->1647|3952->1796|3993->1828|4033->1830|4072->1841|4146->1888|4160->1893|4196->1908|4235->1919|4282->1935|4351->1977|4487->2086|4519->2102|4559->2104|4602->2119|4639->2129|4654->2135|4711->2171|4799->2232|4871->2295|4911->2297|4960->2318|5020->2351|5059->2369|5112->2404|5125->2409|5164->2410|5213->2431|5321->2508|5368->2527|5414->2546|5424->2547|5453->2555|5544->2619|5554->2620|5584->2629|5659->2677|5698->2700|5737->2701|5788->2725|5798->2726|5827->2734|5886->2762|5935->2784|5960->2800|5999->2801|6050->2825|6093->2859|6132->2860|6185->2886|6212->2904|6251->2905|6306->2932|6361->2960|6371->2961|6401->2970|6452->3003|6465->3008|6504->3009|6559->3036|6650->3096|6705->3120|6758->3142|6807->3164|6832->3180|6871->3181|6922->3205|6965->3239|7004->3240|7057->3265|7104->3285|7114->3286|7143->3294|7190->3322|7203->3326|7242->3327|7293->3350|7344->3374|7354->3375|7383->3383|7442->3411|7481->3431|7494->3435|7533->3436|7583->3457|7635->3481|7646->3482|7676->3490|7734->3516|7782->3535|7920->3641|7964->3656
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|48->16|48->16|48->16|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|60->28|61->29|63->31|63->31|63->31|64->32|64->32|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|72->40|74->42|76->44|91->59|91->59|91->59|92->60|93->61|93->61|93->61|94->62|95->63|100->68|102->70|102->70|102->70|103->71|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|108->76|109->77|109->77|109->77|109->77|111->79|111->79|111->79|113->81|113->81|113->81|114->82|114->82|114->82|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|119->87|120->88|120->88|120->88|121->89|122->90|123->91|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|129->97|130->98|131->99|131->99|131->99|132->100|132->100|132->100|132->100|133->101|134->102|140->108|141->109
                  -- GENERATED --
              */
          