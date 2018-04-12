
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
  <p class="lead">Games</p>
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
                  DATE: Thu Apr 12 19:19:29 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: d333c26ef76ba879d0d137bc03eee716facb590d
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1405->247|1444->249|1474->253|1523->276|1537->282|1598->323|1832->530|1868->550|1908->552|1948->564|1985->574|2000->580|2055->614|2109->641|2119->642|2148->650|2190->664|2238->685|2248->686|2288->705|2353->739|2388->747|2431->764|2456->780|2495->781|2533->792|2576->826|2615->827|2655->839|2816->973|2831->979|2882->1009|3139->1235|3178->1244|3223->1262|3295->1307|3310->1313|3368->1350|3484->1439|3511->1445|3803->1710|3844->1742|3884->1744|3924->1756|3999->1804|4013->1809|4049->1824|4089->1836|4137->1853|4211->1900|4349->2011|4381->2027|4421->2029|4465->2045|4502->2055|4517->2061|4574->2097|4663->2159|4735->2222|4775->2224|4825->2246|4885->2279|4924->2297|4978->2333|4991->2338|5030->2339|5080->2361|5189->2439|5237->2459|5283->2478|5293->2479|5322->2487|5415->2553|5425->2554|5455->2563|5532->2613|5571->2636|5610->2637|5662->2662|5672->2663|5701->2671|5761->2700|5811->2723|5836->2739|5875->2740|5927->2765|5970->2799|6009->2800|6063->2827|6090->2845|6129->2846|6185->2874|6240->2902|6250->2903|6280->2912|6332->2946|6345->2951|6384->2952|6440->2980|6532->3041|6588->3066|6642->3089|6692->3112|6717->3128|6756->3129|6808->3154|6851->3188|6890->3189|6942->3214|6952->3215|6981->3223|7023->3246|7036->3250|7075->3251|7127->3275|7159->3280|7169->3281|7198->3289|7252->3312|7292->3333|7305->3337|7344->3338|7394->3360|7426->3365|7436->3366|7465->3374|7517->3395|7565->3415|7698->3521|7708->3522|7738->3531|7811->3576|7860->3603|7939->3654|7955->3660|8017->3700|8231->3886|8247->3892|8309->3932|8558->4149|8603->4165
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|53->21|54->22|56->24|56->24|56->24|57->25|57->25|57->25|58->26|61->29|61->29|61->29|68->36|69->37|72->40|73->41|73->41|73->41|74->42|74->42|84->52|84->52|84->52|85->53|86->54|86->54|86->54|87->55|88->56|93->61|95->63|95->63|95->63|96->64|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|101->69|102->70|102->70|102->70|102->70|104->72|104->72|104->72|106->74|106->74|106->74|107->75|107->75|107->75|108->76|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|112->80|113->81|113->81|113->81|114->82|115->83|116->84|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90|122->90|123->91|124->92|124->92|124->92|125->93|125->93|125->93|125->93|126->94|127->95|131->99|131->99|131->99|132->100|132->100|134->102|134->102|134->102|138->106|138->106|138->106|143->111|144->112
                  -- GENERATED --
              */
          