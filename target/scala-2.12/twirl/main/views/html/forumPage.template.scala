
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
          <th>Product</th>
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
                  DATE: Fri Apr 20 19:14:34 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA /app/views/forumPage.scala.html
                  HASH: 2ecffc5d308fefcbfae5c92134b4958e719b7c02
                  MATRIX: 651->1|692->36|730->68|1124->94|1336->210|1365->214|1392->233|1431->235|1460->238|1499->251|1513->257|1574->298|1810->507|1825->513|1881->548|1980->621|2014->639|2054->641|2090->650|2127->660|2142->666|2204->707|2258->734|2268->735|2298->743|2337->754|2410->800|2420->801|2457->817|2506->836|2538->841|2612->889|2653->921|2693->923|2729->932|2801->977|2815->982|2851->997|2887->1006|2931->1020|2970->1031|3063->1097|3078->1103|3131->1135|3241->1218|3268->1224|3714->1643|3744->1657|3784->1659|3823->1670|3881->1701|3896->1707|3950->1740|3997->1760|4008->1762|4038->1771|4112->1818|4145->1842|4184->1843|4229->1860|4261->1865|4272->1867|4311->1885|4352->1907|4365->1911|4404->1912|4449->1929|4509->1958|4553->1975|4587->2000|4626->2001|4671->2018|4703->2023|4714->2025|4754->2044|4795->2066|4808->2070|4847->2071|4893->2089|4953->2118|5010->2147|5059->2169|5070->2171|5107->2187|5169->2218|5203->2225|5279->2274|5294->2280|5342->2307
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|48->16|48->16|48->16|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|54->22|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|63->31|65->33|65->33|65->33|66->34|66->34|81->49|81->49|81->49|82->50|83->51|83->51|83->51|84->52|84->52|84->52|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|88->56|88->56|89->57|90->58|91->59|91->59|91->59|92->60|92->60|92->60|92->60|93->61|93->61|93->61|94->62|95->63|97->65|97->65|97->65|97->65|99->67|100->68|104->72|104->72|104->72
                  -- GENERATED --
              */
          