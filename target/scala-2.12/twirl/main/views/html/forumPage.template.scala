
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
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object forumPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[ForumPost],List[Product],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(posts: List[ForumPost], products: List[Product], prodId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.118*/("""


"""),_display_(/*7.2*/main("Forums",user)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""
  """),format.raw/*8.3*/("""<link href=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.63*/("""" rel="stylesheet" />
<h1>Community Forums</h1>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Game Select</h4>
    <div class="list-group" id="productList">
      <div id="listHead">
      <a href=""""),_display_(/*16.17*/routes/*16.23*/.CommunityCtrl.forumPage(0, filter)),format.raw/*16.58*/("""" class="list-group-item" id="forumProd">All Games</a>
    </div>
      """),_display_(/*18.8*/for(p <- products) yield /*18.26*/ {_display_(Seq[Any](format.raw/*18.28*/("""
        """),format.raw/*19.9*/("""<a href=""""),_display_(/*19.19*/routes/*19.25*/.CommunityCtrl.forumPage(p.getId, filter)),format.raw/*19.66*/("""" class="list-group-item">"""),_display_(/*19.93*/p/*19.94*/.getName),format.raw/*19.102*/("""
          """),format.raw/*20.11*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*20.57*/p/*20.58*/.getPosts().size),format.raw/*20.74*/("""</span></a>
      """)))}),format.raw/*21.8*/("""
    """),format.raw/*22.5*/("""</div>
  </div>
  <div class="col-sm-8">
      """),_display_(/*25.8*/if(flash.containsKey("success"))/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""
        """),format.raw/*26.9*/("""<div class="alert alert-success">
          """),_display_(/*27.12*/flash/*27.17*/.get("success")),format.raw/*27.32*/("""
        """),format.raw/*28.9*/("""</div>
      """)))}),format.raw/*29.8*/("""

      			"""),format.raw/*31.10*/("""<!-- Search Form -->
			<div id="actions">
        <form action=""""),_display_(/*33.24*/routes/*33.30*/.CommunityCtrl.forumPage(prodId)),format.raw/*33.62*/("""" method="GET">
         <input type="search" id="searchbox" name="filter" value=""""),_display_(/*34.68*/filter),format.raw/*34.74*/("""" placeholder="Filter by post title...">
         <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-default btn">
        </form>
       </div>
    <table class="table table-condensed" id="forums">   
      <thead>
        <tr>
          <th>Title</th>
          <th>Author</th>
          <th>Game</th>
          <th>Replies</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*49.10*/for(fp<-posts) yield /*49.24*/ {_display_(Seq[Any](format.raw/*49.26*/("""
          """),format.raw/*50.11*/("""<tr>
            <td><a href=""""),_display_(/*51.27*/routes/*51.33*/.CommunityCtrl.viewPost(fp.getId)),format.raw/*51.66*/("""">
                """),_display_(/*52.18*/fp/*52.20*/.getTitle),format.raw/*52.29*/("""</td>
               </a>     
               """),_display_(/*54.17*/if(fp.getAuthor != null)/*54.41*/{_display_(Seq[Any](format.raw/*54.42*/("""
                """),format.raw/*55.17*/("""<td>"""),_display_(/*55.22*/fp/*55.24*/.getAuthor.getName),format.raw/*55.42*/("""</td>
               """)))}/*56.17*/else/*56.21*/{_display_(Seq[Any](format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""<td>N/A</td>
               """)))}),format.raw/*58.17*/("""
               """),_display_(/*59.17*/if(fp.getProduct != null)/*59.42*/{_display_(Seq[Any](format.raw/*59.43*/("""
                """),format.raw/*60.17*/("""<td>"""),_display_(/*60.22*/fp/*60.24*/.getProduct.getName),format.raw/*60.43*/("""</td>
               """)))}/*61.17*/else/*61.21*/{_display_(Seq[Any](format.raw/*61.22*/("""
                 """),format.raw/*62.18*/("""<td>N/A</td>
               """)))}),format.raw/*63.17*/("""
               
            """),format.raw/*65.13*/("""<td  class="numeric">"""),_display_(/*65.35*/fp/*65.37*/.getReplies.size),format.raw/*65.53*/("""</td>
          </tr>
        """)))}),format.raw/*67.10*/("""
      """),format.raw/*68.7*/("""</tbody>

    </table>
    <p>
        <a href=""""),_display_(/*72.19*/routes/*72.25*/.CommunityCtrl.createPost()),format.raw/*72.52*/("""">
          <button class="btn-md btn-default btn">Add a Post</button>
        </a>
      </p>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(posts:List[ForumPost],products:List[Product],prodId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(posts,products,prodId,filter,user,env)

  def f:((List[ForumPost],List[Product],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (posts,products,prodId,filter,user,env) => apply(posts,products,prodId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 11:49:18 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/forumPage.scala.html
                  HASH: 6ca3093983759ad10343f9156590150c5cdaf893
                  MATRIX: 651->1|692->37|730->70|1124->97|1336->213|1368->220|1395->239|1434->241|1464->245|1503->258|1517->264|1578->305|1822->522|1837->528|1893->563|1994->638|2028->656|2068->658|2105->668|2142->678|2157->684|2219->725|2273->752|2283->753|2313->761|2353->773|2426->819|2436->820|2473->836|2523->856|2556->862|2633->913|2674->945|2714->947|2751->957|2824->1003|2838->1008|2874->1023|2911->1033|2956->1048|2997->1061|3092->1129|3107->1135|3160->1167|3271->1251|3298->1257|3756->1688|3786->1702|3826->1704|3866->1716|3925->1748|3940->1754|3994->1787|4042->1808|4053->1810|4083->1819|4159->1868|4192->1892|4231->1893|4277->1911|4309->1916|4320->1918|4359->1936|4401->1959|4414->1963|4453->1964|4499->1982|4560->2012|4605->2030|4639->2055|4678->2056|4724->2074|4756->2079|4767->2081|4807->2100|4849->2123|4862->2127|4901->2128|4948->2147|5009->2177|5068->2208|5117->2230|5128->2232|5165->2248|5229->2281|5264->2289|5344->2342|5359->2348|5407->2375
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|48->16|48->16|48->16|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|54->22|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|63->31|65->33|65->33|65->33|66->34|66->34|81->49|81->49|81->49|82->50|83->51|83->51|83->51|84->52|84->52|84->52|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|88->56|88->56|89->57|90->58|91->59|91->59|91->59|92->60|92->60|92->60|92->60|93->61|93->61|93->61|94->62|95->63|97->65|97->65|97->65|97->65|99->67|100->68|104->72|104->72|104->72
                  -- GENERATED --
              */
          