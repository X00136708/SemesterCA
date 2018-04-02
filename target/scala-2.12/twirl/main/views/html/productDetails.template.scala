
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


"""),_display_(/*6.2*/main("Full Image", user)/*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""


  """),format.raw/*9.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*11.8*/if(flash.containsKey("success"))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
        """),format.raw/*14.9*/("""</div>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""<thead>
        <tr>
          <th>"""),_display_(/*18.16*/p/*18.17*/.getName),format.raw/*18.25*/(""" """),format.raw/*18.26*/("""("""),_display_(/*18.28*/p/*18.29*/.getPegi),format.raw/*18.37*/(""")</th> 
          <th>Price</th> 
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*26.16*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*26.79*/ {_display_(Seq[Any](format.raw/*26.81*/("""
                """),format.raw/*27.17*/("""<td><img src="/assets/images/"""),_display_(/*27.47*/(p.getId + ".png")),format.raw/*27.65*/(""""/></td>
            """)))}/*28.15*/else/*28.20*/{_display_(Seq[Any](format.raw/*28.21*/("""
                """),format.raw/*29.17*/("""<td><img src="/assets/images/noImage.jpg"/></td>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""<td class="numeric">"""),_display_(/*31.34*/p/*31.35*/.getPrice),format.raw/*31.44*/("""</td>
            
          </tr>
          <tr>
            """),_display_(/*35.14*/if(p.getId==1)/*35.28*/{_display_(Seq[Any](format.raw/*35.29*/("""
            """),format.raw/*36.13*/("""<td>
              
              """),_display_(/*38.16*/p/*38.17*/.getDescription),format.raw/*38.32*/(""" """),format.raw/*38.33*/("""errifying psychopath find themselves entangled with some of the most frightening and deranged elements of the criminal underworld, the U.S. government and the entertainment industry, they must pull off a series of dangerous heists to survive in a ruthless city in which they can trust nobody, least of all each other.
            </td>
          """)))}),format.raw/*40.12*/("""
          """),format.raw/*41.11*/("""</tr>
        
      </tbody>

    </table>

    
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
                  DATE: Mon Apr 02 01:40:20 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productDetails.scala.html
                  HASH: 427d2e36b143b64d6629bec79fa8029a9516ea22
                  MATRIX: 651->1|689->34|1054->61|1198->110|1230->117|1262->141|1301->143|1335->151|1463->253|1504->285|1544->287|1581->297|1654->343|1668->348|1704->363|1741->373|1786->388|1821->396|1886->434|1896->435|1925->443|1954->444|1983->446|1993->447|2022->455|2166->572|2238->635|2278->637|2324->655|2381->685|2420->703|2462->727|2475->732|2514->733|2560->751|2654->814|2696->828|2744->849|2754->850|2784->859|2878->926|2901->940|2940->941|2982->955|3046->992|3056->993|3092->1008|3121->1009|3501->1358|3541->1370
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|50->18|50->18|50->18|50->18|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|63->31|63->31|63->31|63->31|67->35|67->35|67->35|68->36|70->38|70->38|70->38|70->38|72->40|73->41
                  -- GENERATED --
              */
          