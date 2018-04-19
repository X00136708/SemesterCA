
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
  """),format.raw/*7.3*/("""<link href=""""),_display_(/*7.16*/routes/*7.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.63*/("""" rel="stylesheet" />
  <div class="col-sm-1"></div>
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
        """),_display_(/*38.10*/if(user.isInstanceOf[models.users.Administrator])/*38.59*/{_display_(Seq[Any](format.raw/*38.60*/("""
          """),format.raw/*39.11*/("""<a href=""""),_display_(/*39.21*/routes/*39.27*/.CommunityCtrl.deletePost(p.getId)),format.raw/*39.61*/(""""  class="btn-md btn-default btn" onclick="return confirmDel();" id="postDelete">Delete <span class="glyphicon glyphicon-trash"></span></a>
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
            """),_display_(/*58.14*/if(user.isInstanceOf[models.users.Administrator])/*58.63*/{_display_(Seq[Any](format.raw/*58.64*/("""
              """),format.raw/*59.15*/("""<a href=""""),_display_(/*59.25*/routes/*59.31*/.CommunityCtrl.deleteReply(r.getId)),format.raw/*59.66*/(""""  class="btn-md btn-default btn" onclick="return confirmDel();" id="postDelete">Delete <span class="glyphicon glyphicon-trash"></span></a>
            """)))}),format.raw/*60.14*/("""
          """)))}),format.raw/*61.12*/("""
        """),format.raw/*62.9*/("""</div>

      """)))}),format.raw/*64.8*/("""
    """),format.raw/*65.5*/("""</div>
    <p>
      <a href=""""),_display_(/*67.17*/routes/*67.23*/.CommunityCtrl.createReply(p.getId())),format.raw/*67.60*/("""">
        <button class="btn-md btn-default btn">Add a Reply</button>
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
                  DATE: Thu Apr 19 17:22:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/viewPost.scala.html
                  HASH: 7570baee65af9ae0150c6997e7ee364cfabf0eed
                  MATRIX: 651->1|692->37|1053->64|1199->115|1231->122|1261->144|1300->146|1330->150|1369->163|1383->169|1444->210|1628->368|1669->400|1709->402|1746->412|1819->458|1833->463|1869->478|1906->488|1951->503|1986->511|2135->633|2168->657|2207->658|2255->679|2327->742|2367->744|2417->766|2454->776|2469->782|2526->818|2589->853|2629->871|2709->933|2722->938|2761->939|2809->959|2846->969|2861->975|2918->1011|3033->1095|3083->1114|3149->1152|3216->1192|3226->1193|3256->1202|3303->1222|3335->1245|3374->1246|3418->1262|3453->1270|3463->1271|3502->1289|3548->1316|3561->1320|3600->1321|3644->1337|3712->1374|3747->1382|3778->1386|3788->1387|3820->1398|3865->1417|3890->1433|3929->1434|3967->1445|4025->1494|4064->1495|4104->1507|4141->1517|4156->1523|4211->1557|4392->1707|4431->1716|4466->1724|4597->1829|4635->1851|4674->1852|4713->1864|4795->1919|4827->1942|4866->1943|4908->1957|4943->1965|4953->1966|4992->1984|5036->2009|5049->2013|5088->2014|5130->2028|5196->2063|5248->2087|5279->2091|5289->2092|5321->2103|5365->2120|5390->2136|5429->2137|5471->2152|5529->2201|5568->2202|5612->2218|5649->2228|5664->2234|5720->2269|5905->2423|5949->2436|5986->2446|6033->2463|6066->2469|6126->2502|6141->2508|6199->2545
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|39->7|39->7|39->7|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|55->23|55->23|55->23|56->24|56->24|56->24|56->24|57->25|58->26|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|67->35|67->35|67->35|67->35|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|71->39|72->40|73->41|75->43|79->47|79->47|79->47|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|86->54|88->56|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|91->59|92->60|93->61|94->62|96->64|97->65|99->67|99->67|99->67
                  -- GENERATED --
              */
          