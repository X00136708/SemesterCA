
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
        """),_display_(/*30.10*/for(c <- categories) yield /*30.30*/ {_display_(Seq[Any](format.raw/*30.32*/("""
          """),format.raw/*31.11*/("""<a href=""""),_display_(/*31.21*/routes/*31.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*31.61*/("""" class="btn btn-sm">"""),_display_(/*31.83*/c/*31.84*/.getName),format.raw/*31.92*/("""
            """),format.raw/*32.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*32.59*/c/*32.60*/.getProducts().size),format.raw/*32.79*/("""</span>
          </a>
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""<div class="search">
          <form action=""""),_display_(/*36.26*/routes/*36.32*/.ProductCtrl.listProducts(platformId)),format.raw/*36.69*/("""" class="text" method="GET">
              <input type="search" id="searchbox" name="filter" value=""""),_display_(/*37.73*/filter),format.raw/*37.79*/("""" placeholder="Search for game...">
              <input type="submit" id="searchsubmit" value="Search" class="searchbtn-sm ">
          </form>
            </div>
      </div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*56.10*/if(flash.containsKey("success"))/*56.42*/ {_display_(Seq[Any](format.raw/*56.44*/("""
          """),format.raw/*57.11*/("""<div class="alert alert-success">
            """),_display_(/*58.14*/flash/*58.19*/.get("success")),format.raw/*58.34*/("""
          """),format.raw/*59.11*/("""</div>
        """)))}),format.raw/*60.10*/("""
       
        
      
        
        """),format.raw/*65.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*67.12*/for(p<-products) yield /*67.28*/ {_display_(Seq[Any](format.raw/*67.30*/("""
              """),format.raw/*68.15*/("""<a href=""""),_display_(/*68.25*/routes/*68.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*68.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*69.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*69.83*/ {_display_(Seq[Any](format.raw/*69.85*/("""
                    """),format.raw/*70.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*70.54*/(p.getId + ".png")),format.raw/*70.72*/("""" id="prodImg"/>
                """)))}/*71.19*/else/*71.24*/{_display_(Seq[Any](format.raw/*71.25*/("""
                    """),format.raw/*72.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*73.18*/("""
                  """),format.raw/*74.19*/("""<h4 id="prodName">"""),_display_(/*74.38*/p/*74.39*/.getName),format.raw/*74.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*76.40*/p/*76.41*/.getPrice),format.raw/*76.50*/("""</h4>
                 <p>
                    """),_display_(/*78.22*/for(c<-p.getCategories) yield /*78.45*/{_display_(Seq[Any](format.raw/*78.46*/("""
                      """),_display_(/*79.24*/c/*79.25*/.getName),format.raw/*79.33*/("""&nbsp;
                    """)))}),format.raw/*80.22*/("""
                    """),_display_(/*81.22*/if(user != null)/*81.38*/{_display_(Seq[Any](format.raw/*81.39*/("""
                      """),_display_(/*82.24*/if("admin".equals(user.getRole()))/*82.58*/{_display_(Seq[Any](format.raw/*82.59*/("""
                        """),_display_(/*83.26*/if(p.getStock > 0)/*83.44*/{_display_(Seq[Any](format.raw/*83.45*/("""
                          """),format.raw/*84.27*/("""<div id="prodStock">Stock: """),_display_(/*84.55*/p/*84.56*/.getStock),format.raw/*84.65*/("""</div>
                        """)))}/*85.27*/else/*85.32*/{_display_(Seq[Any](format.raw/*85.33*/("""
                          """),format.raw/*86.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*87.26*/("""
                      """)))}),format.raw/*88.24*/("""
                    """)))}),format.raw/*89.22*/("""
                    """),_display_(/*90.22*/if(user != null)/*90.38*/{_display_(Seq[Any](format.raw/*90.39*/("""
                      """),_display_(/*91.24*/if("admin".equals(user.getRole()))/*91.58*/{_display_(Seq[Any](format.raw/*91.59*/("""
                      """),_display_(/*92.24*/p/*92.25*/.getPegi),format.raw/*92.33*/("""
                    """)))}/*93.22*/else/*93.26*/{_display_(Seq[Any](format.raw/*93.27*/("""
                      """),format.raw/*94.23*/("""<br>"""),_display_(/*94.28*/p/*94.29*/.getPegi),format.raw/*94.37*/("""
                    """)))}),format.raw/*95.22*/("""
                  """)))}/*96.20*/else/*96.24*/{_display_(Seq[Any](format.raw/*96.25*/("""
                    """),format.raw/*97.21*/("""<br>"""),_display_(/*97.26*/p/*97.27*/.getPegi),format.raw/*97.35*/("""
                  """)))}),format.raw/*98.20*/("""
                  """),format.raw/*99.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*105.18*/("""
              """),format.raw/*106.15*/("""</div>
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
                  DATE: Fri Apr 13 15:47:12 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: b982efcf8f4e241260afd75e2871acd923bc6fa6
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1401->243|1440->245|1470->249|1519->272|1533->278|1594->319|1754->452|1779->468|1818->469|1860->484|1903->518|1942->519|1986->535|2115->637|2130->643|2181->673|2381->842|2425->855|2465->867|2525->900|2561->920|2601->922|2641->934|2678->944|2693->950|2748->984|2797->1006|2807->1007|2836->1015|2878->1029|2951->1075|2961->1076|3001->1095|3066->1129|3103->1139|3177->1186|3192->1192|3250->1229|3379->1331|3406->1337|3771->1675|3812->1707|3852->1709|3892->1721|3967->1769|3981->1774|4017->1789|4057->1801|4105->1818|4179->1865|4317->1976|4349->1992|4389->1994|4433->2010|4470->2020|4485->2026|4542->2062|4631->2124|4703->2187|4743->2189|4793->2211|4853->2244|4892->2262|4946->2298|4959->2303|4998->2304|5048->2326|5157->2404|5205->2424|5251->2443|5261->2444|5290->2452|5383->2518|5393->2519|5423->2528|5500->2578|5539->2601|5578->2602|5630->2627|5640->2628|5669->2636|5729->2665|5779->2688|5804->2704|5843->2705|5895->2730|5938->2764|5977->2765|6031->2792|6058->2810|6097->2811|6153->2839|6208->2867|6218->2868|6248->2877|6300->2911|6313->2916|6352->2917|6408->2945|6500->3006|6556->3031|6610->3054|6660->3077|6685->3093|6724->3094|6776->3119|6819->3153|6858->3154|6910->3179|6920->3180|6949->3188|6991->3211|7004->3215|7043->3216|7095->3240|7127->3245|7137->3246|7166->3254|7220->3277|7260->3298|7273->3302|7312->3303|7362->3325|7394->3330|7404->3331|7433->3339|7485->3360|7533->3380|7677->3492|7722->3508
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|48->16|48->16|48->16|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|63->31|63->31|64->32|64->32|64->32|64->32|66->34|67->35|68->36|68->36|68->36|69->37|69->37|88->56|88->56|88->56|89->57|90->58|90->58|90->58|91->59|92->60|97->65|99->67|99->67|99->67|100->68|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|105->73|106->74|106->74|106->74|106->74|108->76|108->76|108->76|110->78|110->78|110->78|111->79|111->79|111->79|112->80|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|116->84|117->85|117->85|117->85|118->86|119->87|120->88|121->89|122->90|122->90|122->90|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|126->94|127->95|128->96|128->96|128->96|129->97|129->97|129->97|129->97|130->98|131->99|137->105|138->106
                  -- GENERATED --
              */
          