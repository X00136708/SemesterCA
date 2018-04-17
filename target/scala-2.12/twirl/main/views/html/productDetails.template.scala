
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
/*1.2*/import models.products.Product
/*2.2*/import models.users.User

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Product,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(p: Product,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.51*/("""


"""),_display_(/*6.2*/main("Game", user)/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
  """),format.raw/*7.3*/("""<link href=""""),_display_(/*7.16*/routes/*7.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.63*/("""" rel="stylesheet" />
  <div class="col-sm-2"></div>
  <div class="col-sm-8">
      <table class="table table-bordered table-hover table-condensed">
        """),_display_(/*11.10*/if(flash.containsKey("success"))/*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
          """),format.raw/*12.11*/("""<div class="alert alert-success">
            """),_display_(/*13.14*/flash/*13.19*/.get("success")),format.raw/*13.34*/("""
          """),format.raw/*14.11*/("""</div>
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""<div class="list-group">
            <div class="list-group-item">
                """),_display_(/*18.18*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*18.81*/ {_display_(Seq[Any](format.raw/*18.83*/("""
                  """),format.raw/*19.19*/("""<img src="/assets/images/"""),_display_(/*19.45*/(p.getId + ".png")),format.raw/*19.63*/("""" id="prodDetailsImg"/>
              """)))}/*20.17*/else/*20.22*/{_display_(Seq[Any](format.raw/*20.23*/("""
                  """),format.raw/*21.19*/("""<img src="/assets/images/noImage.jpg" id="prodDetailsImg"/>
              """)))}),format.raw/*22.16*/("""
              """),format.raw/*23.15*/("""<h2>"""),_display_(/*23.20*/p/*23.21*/.getName),format.raw/*23.29*/("""</h2>

              <h5><b>Rating: </b> <br> """),_display_(/*25.41*/p/*25.42*/.getPegi),format.raw/*25.50*/("""</h5>

              <h5><b>Platforms: </b> <br> """),_display_(/*27.44*/for(c<-p.getCategories) yield /*27.67*/{_display_(Seq[Any](format.raw/*27.68*/("""
                """),_display_(/*28.18*/c/*28.19*/.getName),format.raw/*28.27*/("""&nbsp;
              """)))}),format.raw/*29.16*/("""</h5>

              <h5><b>Price: </b> <br> €"""),_display_(/*31.41*/p/*31.42*/.getPrice),format.raw/*31.51*/("""</h5>

              <p><b>Description</b> <br> """),_display_(/*33.43*/p/*33.44*/.getDescription),format.raw/*33.59*/("""</p>
              
              

              """),_display_(/*37.16*/if(user != null)/*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
                """),_display_(/*38.18*/if(user.isInstanceOf[models.users.Administrator])/*38.67*/{_display_(Seq[Any](format.raw/*38.68*/("""
                  """),format.raw/*39.19*/("""<a href=""""),_display_(/*39.29*/routes/*39.35*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*39.75*/(""""  class="btn btn-default btn-xs">Edit  <span class="glyphicon glyphicon-pencil"></span></a>
                  <a href=""""),_display_(/*40.29*/routes/*40.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*40.75*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();">Delete <span class="glyphicon glyphicon-trash"></span></a>
                """)))}/*41.18*/else/*41.22*/{_display_(Seq[Any](format.raw/*41.23*/("""
                  """),_display_(/*42.20*/if(p.getStock > 0)/*42.38*/{_display_(Seq[Any](format.raw/*42.39*/("""
                    """),format.raw/*43.21*/("""<a href=""""),_display_(/*43.31*/routes/*43.37*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*43.71*/(""""  class="btn btn-warning btn-xs">Add To Cart  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                  """)))}/*44.20*/else/*44.24*/{_display_(Seq[Any](format.raw/*44.25*/("""
                    """),format.raw/*45.21*/("""<a class="btn btn-warning btn-xs" onclick="return soldOut();">Sold Out  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                  """)))}),format.raw/*46.20*/("""
                  
                """)))}),format.raw/*48.18*/("""
              """)))}/*49.16*/else/*49.20*/{_display_(Seq[Any](format.raw/*49.21*/("""
                """),_display_(/*50.18*/if(p.getStock > 0)/*50.36*/{_display_(Seq[Any](format.raw/*50.37*/("""
                  """),format.raw/*51.19*/("""<a href=""""),_display_(/*51.29*/routes/*51.35*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*51.69*/(""""  class="btn btn-warning btn-xs">Add To Cart  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                """)))}/*52.18*/else/*52.22*/{_display_(Seq[Any](format.raw/*52.23*/("""
                  """),format.raw/*53.19*/("""<a class="btn btn-warning btn-xs" onclick="return soldOut();">Sold Out  <span class="glyphicon glyphicon-shopping-cart"></span></a>
                """)))}),format.raw/*54.18*/("""
              """)))}),format.raw/*55.16*/("""
              
        
        
    """),format.raw/*59.5*/("""</div>
    <label>Reviews:</label><br>
    <div class="list-group" id="replies">
    """),_display_(/*62.6*/for(r <- p.getReviews) yield /*62.28*/{_display_(Seq[Any](format.raw/*62.29*/("""

      """),format.raw/*64.7*/("""<div class="list-group-item" id="replies">
        """),_display_(/*65.10*/if(r.getAuthor != null)/*65.33*/{_display_(Seq[Any](format.raw/*65.34*/("""
          """),format.raw/*66.11*/("""<label>"""),_display_(/*66.19*/r/*66.20*/.getAuthor.getName),format.raw/*66.38*/("""</label><br>
        """)))}/*67.10*/else/*67.14*/{_display_(Seq[Any](format.raw/*67.15*/("""
          """),format.raw/*68.11*/("""<label>N/A</label><br>
        """)))}),format.raw/*69.10*/("""
        
        """),format.raw/*71.9*/("""<p>"""),_display_(/*71.13*/r/*71.14*/.getContent),format.raw/*71.25*/("""</p>
        """),_display_(/*72.10*/if(user != null)/*72.26*/{_display_(Seq[Any](format.raw/*72.27*/("""
          """),_display_(/*73.12*/if(user.isInstanceOf[models.users.Administrator])/*73.61*/{_display_(Seq[Any](format.raw/*73.62*/("""
            """),format.raw/*74.13*/("""<a href=""""),_display_(/*74.23*/routes/*74.29*/.CommunityCtrl.deleteReview(r.getId)),format.raw/*74.65*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();" id="postDelete">Delete <span class="glyphicon glyphicon-trash"></span></a>
          """)))}),format.raw/*75.12*/("""
        """)))}),format.raw/*76.10*/("""
      """),format.raw/*77.7*/("""</div>

    """)))}),format.raw/*79.6*/("""
  """),format.raw/*80.3*/("""</div>
        
      </div>
      <p>
          <a href=""""),_display_(/*84.21*/routes/*84.27*/.CommunityCtrl.createReview(p.getId())),format.raw/*84.65*/("""">
            <button class="btn btn-primary">Add a Review</button>
          </a>
        </p>
      
    </div>
  </div>
""")))}))
      }
    }
  }

  def render(p:Product,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((Product,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 21:43:05 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productDetails.scala.html
                  HASH: 5769e8c1114af70d7c9f90bbfbb2efd8a2dae8c1
                  MATRIX: 651->1|689->34|1054->61|1198->110|1230->117|1256->135|1295->137|1325->141|1364->154|1378->160|1439->201|1628->363|1669->395|1709->397|1749->409|1824->457|1838->462|1874->477|1914->489|1962->506|1999->516|2112->602|2184->665|2224->667|2272->687|2325->713|2364->731|2423->772|2436->777|2475->778|2523->798|2630->874|2674->890|2706->895|2716->896|2745->904|2821->953|2831->954|2860->962|2939->1014|2978->1037|3017->1038|3063->1057|3073->1058|3102->1066|3156->1089|3232->1138|3242->1139|3272->1148|3350->1199|3360->1200|3396->1215|3478->1270|3503->1286|3542->1287|3588->1306|3646->1355|3685->1356|3733->1376|3770->1386|3785->1392|3846->1432|3995->1554|4010->1560|4071->1600|4232->1742|4245->1746|4284->1747|4332->1768|4359->1786|4398->1787|4448->1809|4485->1819|4500->1825|4555->1859|4701->1986|4714->1990|4753->1991|4803->2013|4986->2165|5056->2204|5092->2221|5105->2225|5144->2226|5190->2245|5217->2263|5256->2264|5304->2284|5341->2294|5356->2300|5411->2334|5555->2459|5568->2463|5607->2464|5655->2484|5836->2634|5884->2651|5953->2693|6068->2782|6106->2804|6145->2805|6182->2815|6262->2868|6294->2891|6333->2892|6373->2904|6408->2912|6418->2913|6457->2931|6499->2954|6512->2958|6551->2959|6591->2971|6655->3004|6702->3024|6733->3028|6743->3029|6775->3040|6817->3055|6842->3071|6881->3072|6921->3085|6979->3134|7018->3135|7060->3149|7097->3159|7112->3165|7169->3201|7352->3353|7394->3364|7429->3372|7474->3387|7505->3391|7595->3454|7610->3460|7669->3498
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|39->7|39->7|39->7|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|55->23|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|63->31|63->31|63->31|65->33|65->33|65->33|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|86->54|87->55|91->59|94->62|94->62|94->62|96->64|97->65|97->65|97->65|98->66|98->66|98->66|98->66|99->67|99->67|99->67|100->68|101->69|103->71|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|106->74|107->75|108->76|109->77|111->79|112->80|116->84|116->84|116->84
                  -- GENERATED --
              */
          