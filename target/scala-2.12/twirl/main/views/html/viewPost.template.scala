
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

  """),format.raw/*8.3*/("""<div class="col-sm-1"></div>
  <div class="col-sm-6">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*11.8*/if(flash.containsKey("success"))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
        """),format.raw/*14.9*/("""</div>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""<div class="list-group">
          <div class="list-group-item">
              <div id="postProduct">
                """),_display_(/*19.18*/if(p.getProduct != null)/*19.42*/{_display_(Seq[Any](format.raw/*19.43*/("""
                  """),_display_(/*20.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*20.83*/ {_display_(Seq[Any](format.raw/*20.85*/("""
                    """),format.raw/*21.21*/("""<a href=""""),_display_(/*21.31*/routes/*21.37*/.ProductCtrl.productDetails(p.getId)),format.raw/*21.73*/(""""><img src="/assets/images/thumbs/"""),_display_(/*21.108*/(p.getId + ".png")),format.raw/*21.126*/("""" id="prodImg"/></a>
                    
                """)))}/*23.19*/else/*23.24*/{_display_(Seq[Any](format.raw/*23.25*/("""
                  """),format.raw/*24.19*/("""<a href=""""),_display_(/*24.29*/routes/*24.35*/.ProductCtrl.productDetails(p.getId)),format.raw/*24.71*/(""""><img src="/assets/images/thumbs/noImage.png" id="prodImg"/></a>
                """)))}),format.raw/*25.18*/("""
                """)))}),format.raw/*26.18*/("""
                  
                """),format.raw/*28.17*/("""</div>
            <h3 id="postTitle">"""),_display_(/*29.33*/p/*29.34*/.getTitle),format.raw/*29.43*/("""</h3>
            """),_display_(/*30.14*/if(p.getAuthor != null)/*30.37*/{_display_(Seq[Any](format.raw/*30.38*/("""
              """),format.raw/*31.15*/("""<label>"""),_display_(/*31.23*/p/*31.24*/.getAuthor.getName),format.raw/*31.42*/("""</label><br>
            """)))}/*32.14*/else/*32.18*/{_display_(Seq[Any](format.raw/*32.19*/("""
              """),format.raw/*33.15*/("""<label>N/A</label><br>
            """)))}),format.raw/*34.14*/("""
      """),format.raw/*35.7*/("""<p>"""),_display_(/*35.11*/p/*35.12*/.getContent),format.raw/*35.23*/("""</p><br>

      """),_display_(/*37.8*/if(user != null)/*37.24*/{_display_(Seq[Any](format.raw/*37.25*/("""
        """),_display_(/*38.10*/if("admin".equals(user.getRole()))/*38.44*/{_display_(Seq[Any](format.raw/*38.45*/("""
          """),format.raw/*39.11*/("""<a href=""""),_display_(/*39.21*/routes/*39.27*/.CommunityCtrl.deletePost(p.getId)),format.raw/*39.61*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();" id="postDelete">Delete <span class="glyphicon glyphicon-trash"></span></a>
        """)))}),format.raw/*40.10*/("""
      """)))}),format.raw/*41.8*/("""

    """),format.raw/*43.5*/("""</div>
  </div>
      <label>Replies:</label><br>
      <div class="list-group" id="replies">
      """),_display_(/*47.8*/for(r <- p.getReplies) yield /*47.30*/{_display_(Seq[Any](format.raw/*47.31*/("""

        """),format.raw/*49.9*/("""<div class="list-group-item" id="replies">
          """),_display_(/*50.12*/if(r.getAuthor != null)/*50.35*/{_display_(Seq[Any](format.raw/*50.36*/("""
            """),format.raw/*51.13*/("""<label>"""),_display_(/*51.21*/r/*51.22*/.getAuthor.getName),format.raw/*51.40*/("""</label><br>
          """)))}/*52.12*/else/*52.16*/{_display_(Seq[Any](format.raw/*52.17*/("""
            """),format.raw/*53.13*/("""<label>N/A</label><br>
          """)))}),format.raw/*54.12*/("""
          
          """),format.raw/*56.11*/("""<p>"""),_display_(/*56.15*/r/*56.16*/.getContent),format.raw/*56.27*/("""</p>
          """),_display_(/*57.12*/if(user != null)/*57.28*/{_display_(Seq[Any](format.raw/*57.29*/("""
            """),_display_(/*58.14*/if("admin".equals(user.getRole()))/*58.48*/{_display_(Seq[Any](format.raw/*58.49*/("""
              """),format.raw/*59.15*/("""<a href=""""),_display_(/*59.25*/routes/*59.31*/.CommunityCtrl.deleteReply(r.getId)),format.raw/*59.66*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();" id="postDelete">Delete <span class="glyphicon glyphicon-trash"></span></a>
            """)))}),format.raw/*60.14*/("""
          """)))}),format.raw/*61.12*/("""
        """),format.raw/*62.9*/("""</div>

      """)))}),format.raw/*64.8*/("""
    """),format.raw/*65.5*/("""</div>
    <p>
      <a href=""""),_display_(/*67.17*/routes/*67.23*/.CommunityCtrl.createReply(p.getId())),format.raw/*67.60*/("""">
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
                  DATE: Tue Apr 17 16:48:06 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/newSemca/semesterca/app/views/viewPost.scala.html
                  HASH: 6d5bdefbb3350209ec6a04c593ca08dee764615b
                  MATRIX: 651->1|692->37|1053->64|1199->115|1231->122|1261->144|1300->146|1332->152|1491->285|1532->317|1572->319|1609->329|1682->375|1696->380|1732->395|1769->405|1814->420|1849->428|1998->550|2031->574|2070->575|2118->596|2190->659|2230->661|2280->683|2317->693|2332->699|2389->735|2452->770|2492->788|2572->850|2585->855|2624->856|2672->876|2709->886|2724->892|2781->928|2896->1012|2946->1031|3012->1069|3079->1109|3089->1110|3119->1119|3166->1139|3198->1162|3237->1163|3281->1179|3316->1187|3326->1188|3365->1206|3411->1233|3424->1237|3463->1238|3507->1254|3575->1291|3610->1299|3641->1303|3651->1304|3683->1315|3728->1334|3753->1350|3792->1351|3830->1362|3873->1396|3912->1397|3952->1409|3989->1419|4004->1425|4059->1459|4240->1609|4279->1618|4314->1626|4445->1731|4483->1753|4522->1754|4561->1766|4643->1821|4675->1844|4714->1845|4756->1859|4791->1867|4801->1868|4840->1886|4884->1911|4897->1915|4936->1916|4978->1930|5044->1965|5096->1989|5127->1993|5137->1994|5169->2005|5213->2022|5238->2038|5277->2039|5319->2054|5362->2088|5401->2089|5445->2105|5482->2115|5497->2121|5553->2156|5738->2310|5782->2323|5819->2333|5866->2350|5899->2356|5959->2389|5974->2395|6032->2432
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|55->23|55->23|55->23|56->24|56->24|56->24|56->24|57->25|58->26|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|67->35|67->35|67->35|67->35|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|73->41|75->43|79->47|79->47|79->47|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|86->54|88->56|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|91->59|92->60|93->61|94->62|96->64|97->65|99->67|99->67|99->67
                  -- GENERATED --
              */
          