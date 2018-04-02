
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
/*1.2*/import models.community.ForumPost
/*2.2*/import models.users.User

object viewPost extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[ForumPost,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(p: ForumPost,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.53*/("""


"""),_display_(/*6.2*/main(p.getTitle, user)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""


  """),format.raw/*9.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*11.8*/if(flash.containsKey("success"))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
        """),format.raw/*14.9*/("""</div>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""<div class="list-group">
          <div class="list-group-item">
            <h3>"""),_display_(/*18.18*/p/*18.19*/.getTitle),format.raw/*18.28*/("""</h3>
            """),_display_(/*19.14*/if(p.getAuthor != null)/*19.37*/{_display_(Seq[Any](format.raw/*19.38*/("""
              """),format.raw/*20.15*/("""<label>"""),_display_(/*20.23*/p/*20.24*/.getAuthor.getName),format.raw/*20.42*/("""</label><br>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
              """),format.raw/*22.15*/("""<label>N/A</label><br>
            """)))}),format.raw/*23.14*/("""
      
      """),format.raw/*25.7*/("""<label>"""),_display_(/*25.15*/p/*25.16*/.getProduct.getName),format.raw/*25.35*/("""</label><br>
      <br>
      <p>"""),_display_(/*27.11*/p/*27.12*/.getContent),format.raw/*27.23*/("""</p><br>
    </div>
  </div>
      <label>Replies:</label><br>
      <div class="list-group">
      """),_display_(/*32.8*/for(r <- p.getReplies) yield /*32.30*/{_display_(Seq[Any](format.raw/*32.31*/("""

        """),format.raw/*34.9*/("""<div class="list-group-item">
          """),_display_(/*35.12*/if(r.getAuthor != null)/*35.35*/{_display_(Seq[Any](format.raw/*35.36*/("""
            """),format.raw/*36.13*/("""<label>"""),_display_(/*36.21*/r/*36.22*/.getAuthor.getName),format.raw/*36.40*/("""</label><br>
          """)))}/*37.12*/else/*37.16*/{_display_(Seq[Any](format.raw/*37.17*/("""
            """),format.raw/*38.13*/("""<label>N/A</label><br>
          """)))}),format.raw/*39.12*/("""
          
          """),format.raw/*41.11*/("""<p>"""),_display_(/*41.15*/r/*41.16*/.getContent),format.raw/*41.27*/("""</p>
        </div>

      """)))}),format.raw/*44.8*/("""
    """),format.raw/*45.5*/("""</div>
    <p>
      <a href=""""),_display_(/*47.17*/routes/*47.23*/.CommunityCtrl.createReply(p.getId())),format.raw/*47.60*/("""">
        <button class="btn btn-primary">Add a Reply</button>
      </a>
    </p>
    
  </div>
</div>
""")))}))
      }
    }
  }

  def render(p:ForumPost,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((ForumPost,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 02 01:37:24 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewPost.scala.html
                  HASH: d373c42327bce52158940ad655ed5fc727eaeec9
                  MATRIX: 651->1|692->37|1053->64|1199->115|1231->122|1261->144|1300->146|1334->154|1462->256|1503->288|1543->290|1580->300|1653->346|1667->351|1703->366|1740->376|1785->391|1820->399|1931->483|1941->484|1971->493|2018->513|2050->536|2089->537|2133->553|2168->561|2178->562|2217->580|2263->607|2276->611|2315->612|2359->628|2427->665|2470->681|2505->689|2515->690|2555->709|2618->745|2628->746|2660->757|2792->863|2830->885|2869->886|2908->898|2977->940|3009->963|3048->964|3090->978|3125->986|3135->987|3174->1005|3218->1030|3231->1034|3270->1035|3312->1049|3378->1084|3430->1108|3461->1112|3471->1113|3503->1124|3564->1155|3597->1161|3657->1194|3672->1200|3730->1237
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|57->25|57->25|57->25|57->25|59->27|59->27|59->27|64->32|64->32|64->32|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|71->39|73->41|73->41|73->41|73->41|76->44|77->45|79->47|79->47|79->47
                  -- GENERATED --
              */
          