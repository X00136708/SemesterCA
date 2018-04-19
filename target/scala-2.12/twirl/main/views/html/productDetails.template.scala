
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
                  DATE: Thu Apr 19 09:20:24 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/productDetails.scala.html
                  HASH: 70aaab16f29f4b572a2598ad1da1c5b575714838
                  MATRIX: 651->1|689->33|1054->59|1198->108|1227->112|1253->130|1292->132|1321->135|1360->148|1374->154|1435->195|1620->353|1661->385|1701->387|1740->398|1814->445|1828->450|1864->465|1903->476|1950->492|1986->501|2097->585|2169->648|2209->650|2256->669|2309->695|2348->713|2406->753|2419->758|2458->759|2505->778|2611->853|2654->868|2686->873|2696->874|2725->882|2799->929|2809->930|2838->938|2915->988|2954->1011|2993->1012|3038->1030|3048->1031|3077->1039|3130->1061|3204->1108|3214->1109|3244->1118|3320->1167|3330->1168|3366->1183|3444->1234|3469->1250|3508->1251|3553->1269|3611->1318|3650->1319|3697->1338|3734->1348|3749->1354|3810->1394|3958->1515|3973->1521|4034->1561|4194->1702|4207->1706|4246->1707|4293->1727|4320->1745|4359->1746|4408->1767|4445->1777|4460->1783|4515->1817|4660->1943|4673->1947|4712->1948|4761->1969|4943->2120|5011->2157|5046->2173|5059->2177|5098->2178|5143->2196|5170->2214|5209->2215|5256->2234|5293->2244|5308->2250|5363->2284|5506->2408|5519->2412|5558->2413|5605->2432|5785->2581|5832->2597|5897->2635|6009->2721|6047->2743|6086->2744|6121->2752|6200->2804|6232->2827|6271->2828|6310->2839|6345->2847|6355->2848|6394->2866|6435->2888|6448->2892|6487->2893|6526->2904|6589->2936|6634->2954|6665->2958|6675->2959|6707->2970|6748->2984|6773->3000|6812->3001|6851->3013|6909->3062|6948->3063|6989->3076|7026->3086|7041->3092|7098->3128|7280->3279|7321->3289|7355->3296|7398->3309|7428->3312|7514->3371|7529->3377|7588->3415
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|39->7|39->7|39->7|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|55->23|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|63->31|63->31|63->31|65->33|65->33|65->33|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|86->54|87->55|91->59|94->62|94->62|94->62|96->64|97->65|97->65|97->65|98->66|98->66|98->66|98->66|99->67|99->67|99->67|100->68|101->69|103->71|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|106->74|107->75|108->76|109->77|111->79|112->80|116->84|116->84|116->84
                  -- GENERATED --
              */
          