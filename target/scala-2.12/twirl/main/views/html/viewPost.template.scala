
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
                  """),_display_(/*19.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*19.83*/ {_display_(Seq[Any](format.raw/*19.85*/("""
                    """),format.raw/*20.21*/("""<a href=""""),_display_(/*20.31*/routes/*20.37*/.ProductCtrl.productDetails(p.getId)),format.raw/*20.73*/(""""><img src="/assets/images/thumbs/"""),_display_(/*20.108*/(p.getId + ".png")),format.raw/*20.126*/("""" id="prodImg"/></a>
                    
                """)))}/*22.19*/else/*22.24*/{_display_(Seq[Any](format.raw/*22.25*/("""
                  """),format.raw/*23.19*/("""<a href=""""),_display_(/*23.29*/routes/*23.35*/.ProductCtrl.productDetails(p.getId)),format.raw/*23.71*/(""""><img src="/assets/images/thumbs/noImage.png" id="prodImg"/></a>
                """)))}),format.raw/*24.18*/("""
                """),format.raw/*25.17*/("""</div>
            <h3 id="postTitle">"""),_display_(/*26.33*/p/*26.34*/.getTitle),format.raw/*26.43*/("""</h3>
            """),_display_(/*27.14*/if(p.getAuthor != null)/*27.37*/{_display_(Seq[Any](format.raw/*27.38*/("""
              """),format.raw/*28.15*/("""<label>"""),_display_(/*28.23*/p/*28.24*/.getAuthor.getName),format.raw/*28.42*/("""</label><br>
            """)))}/*29.14*/else/*29.18*/{_display_(Seq[Any](format.raw/*29.19*/("""
              """),format.raw/*30.15*/("""<label>N/A</label><br>
            """)))}),format.raw/*31.14*/("""
      """),format.raw/*32.7*/("""<p>"""),_display_(/*32.11*/p/*32.12*/.getContent),format.raw/*32.23*/("""</p><br>

      """),_display_(/*34.8*/if(user != null)/*34.24*/{_display_(Seq[Any](format.raw/*34.25*/("""
        """),_display_(/*35.10*/if("admin".equals(user.getRole()))/*35.44*/{_display_(Seq[Any](format.raw/*35.45*/("""
          """),format.raw/*36.11*/("""<a href=""""),_display_(/*36.21*/routes/*36.27*/.CommunityCtrl.deletePost(p.getId)),format.raw/*36.61*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();" id="postDelete">Delete <span class="glyphicon glyphicon-trash"></span></a>
        """)))}),format.raw/*37.10*/("""
      """)))}),format.raw/*38.8*/("""

    """),format.raw/*40.5*/("""</div>
  </div>
      <label>Replies:</label><br>
      <div class="list-group" id="replies">
      """),_display_(/*44.8*/for(r <- p.getReplies) yield /*44.30*/{_display_(Seq[Any](format.raw/*44.31*/("""

        """),format.raw/*46.9*/("""<div class="list-group-item" id="replies">
          """),_display_(/*47.12*/if(r.getAuthor != null)/*47.35*/{_display_(Seq[Any](format.raw/*47.36*/("""
            """),format.raw/*48.13*/("""<label>"""),_display_(/*48.21*/r/*48.22*/.getAuthor.getName),format.raw/*48.40*/("""</label><br>
          """)))}/*49.12*/else/*49.16*/{_display_(Seq[Any](format.raw/*49.17*/("""
            """),format.raw/*50.13*/("""<label>N/A</label><br>
          """)))}),format.raw/*51.12*/("""
          
          """),format.raw/*53.11*/("""<p>"""),_display_(/*53.15*/r/*53.16*/.getContent),format.raw/*53.27*/("""</p>
          """),_display_(/*54.12*/if(user != null)/*54.28*/{_display_(Seq[Any](format.raw/*54.29*/("""
            """),_display_(/*55.14*/if("admin".equals(user.getRole()))/*55.48*/{_display_(Seq[Any](format.raw/*55.49*/("""
              """),format.raw/*56.15*/("""<a href=""""),_display_(/*56.25*/routes/*56.31*/.CommunityCtrl.deleteReply(r.getId)),format.raw/*56.66*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();" id="postDelete">Delete <span class="glyphicon glyphicon-trash"></span></a>
            """)))}),format.raw/*57.14*/("""
          """)))}),format.raw/*58.12*/("""
        """),format.raw/*59.9*/("""</div>

      """)))}),format.raw/*61.8*/("""
    """),format.raw/*62.5*/("""</div>
    <p>
      <a href=""""),_display_(/*64.17*/routes/*64.23*/.CommunityCtrl.createReply(p.getId())),format.raw/*64.60*/("""">
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
                  DATE: Mon Apr 16 18:32:42 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/viewPost.scala.html
                  HASH: 4735681a8548dc6a22185442a3be6375b166c48b
                  MATRIX: 651->1|692->36|1053->62|1199->113|1228->117|1258->139|1297->141|1327->145|1483->275|1524->307|1564->309|1600->318|1672->363|1686->368|1722->383|1758->392|1802->406|1836->413|1984->534|2056->597|2096->599|2145->620|2182->630|2197->636|2254->672|2317->707|2357->725|2435->785|2448->790|2487->791|2534->810|2571->820|2586->826|2643->862|2757->945|2802->962|2868->1001|2878->1002|2908->1011|2954->1030|2986->1053|3025->1054|3068->1069|3103->1077|3113->1078|3152->1096|3197->1122|3210->1126|3249->1127|3292->1142|3359->1178|3393->1185|3424->1189|3434->1190|3466->1201|3509->1218|3534->1234|3573->1235|3610->1245|3653->1279|3692->1280|3731->1291|3768->1301|3783->1307|3838->1341|4018->1490|4056->1498|4089->1504|4216->1605|4254->1627|4293->1628|4330->1638|4411->1692|4443->1715|4482->1716|4523->1729|4558->1737|4568->1738|4607->1756|4650->1780|4663->1784|4702->1785|4743->1798|4808->1832|4858->1854|4889->1858|4899->1859|4931->1870|4974->1886|4999->1902|5038->1903|5079->1917|5122->1951|5161->1952|5204->1967|5241->1977|5256->1983|5312->2018|5496->2171|5539->2183|5575->2192|5620->2207|5652->2212|5710->2243|5725->2249|5783->2286
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|54->22|54->22|54->22|55->23|55->23|55->23|55->23|56->24|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|64->32|64->32|64->32|64->32|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|69->37|70->38|72->40|76->44|76->44|76->44|78->46|79->47|79->47|79->47|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|83->51|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|88->56|89->57|90->58|91->59|93->61|94->62|96->64|96->64|96->64
                  -- GENERATED --
              */
          