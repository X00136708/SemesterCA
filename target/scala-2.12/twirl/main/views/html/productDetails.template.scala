
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
              
              """),_display_(/*38.16*/p/*38.17*/.getDescription),format.raw/*38.32*/(""" """),format.raw/*38.33*/("""terrifying psychopath find themselves entangled with some of the most frightening and deranged elements of the criminal underworld, the U.S. government and the entertainment industry, they must pull off a series of dangerous heists to survive in a ruthless city in which they can trust nobody, least of all each other.
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
                  DATE: Fri Apr 06 22:18:12 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/productDetails.scala.html
                  HASH: 10e82ffb9f04a09e39cfcc37cebc05498d46bda7
                  MATRIX: 651->1|689->33|1054->59|1198->108|1227->112|1259->136|1298->138|1329->143|1455->243|1496->275|1536->277|1572->286|1644->331|1658->336|1694->351|1730->360|1774->374|1808->381|1871->417|1881->418|1910->426|1939->427|1968->429|1978->430|2007->438|2143->547|2215->610|2255->612|2300->629|2357->659|2396->677|2437->700|2450->705|2489->706|2534->723|2627->785|2668->798|2716->819|2726->820|2756->829|2846->892|2869->906|2908->907|2949->920|3011->955|3021->956|3057->971|3086->972|3465->1320|3504->1331
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|50->18|50->18|50->18|50->18|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|63->31|63->31|63->31|63->31|67->35|67->35|67->35|68->36|70->38|70->38|70->38|70->38|72->40|73->41
                  -- GENERATED --
              */
          