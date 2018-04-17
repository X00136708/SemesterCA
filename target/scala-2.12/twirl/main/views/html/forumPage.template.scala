
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

"""),format.raw/*9.1*/("""<h1>Community Forums</h1>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Products</h4>
    <div class="list-group" id="productList">
      <div id="listHead">
      <a href=""""),_display_(/*16.17*/routes/*16.23*/.CommunityCtrl.forumPage(0, filter)),format.raw/*16.58*/("""" class="list-group-item" >All Products</a>
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
         <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
        </form>
       </div>
    <table class="table table-hover table-condensed" id="forums">   
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
          <button class="btn btn-primary">Add a Post</button>
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
                  DATE: Tue Apr 17 16:31:41 IST 2018
                  SOURCE: /home/wdd/Downloads/SemesterCA-master/app/views/forumPage.scala.html
                  HASH: abbd2656e87c62a3f5c8a38fb58b23734d3d1dac
                  MATRIX: 651->1|692->36|730->68|1124->94|1336->210|1365->214|1392->233|1431->235|1459->237|1670->421|1685->427|1741->462|1829->524|1863->542|1903->544|1939->553|1976->563|1991->569|2053->610|2107->637|2117->638|2147->646|2186->657|2259->703|2269->704|2306->720|2355->739|2387->744|2461->792|2502->824|2542->826|2578->835|2650->880|2664->885|2700->900|2736->909|2780->923|2819->934|2912->1000|2927->1006|2980->1038|3090->1121|3117->1127|3571->1554|3601->1568|3641->1570|3680->1581|3738->1612|3753->1618|3807->1651|3854->1671|3865->1673|3895->1682|3969->1729|4002->1753|4041->1754|4086->1771|4118->1776|4129->1778|4168->1796|4209->1818|4222->1822|4261->1823|4306->1840|4366->1869|4410->1886|4444->1911|4483->1912|4528->1929|4560->1934|4571->1936|4611->1955|4652->1977|4665->1981|4704->1982|4750->2000|4810->2029|4867->2058|4916->2080|4927->2082|4964->2098|5026->2129|5060->2136|5136->2185|5151->2191|5199->2218
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|48->16|48->16|48->16|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|54->22|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|63->31|65->33|65->33|65->33|66->34|66->34|81->49|81->49|81->49|82->50|83->51|83->51|83->51|84->52|84->52|84->52|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|88->56|88->56|89->57|90->58|91->59|91->59|91->59|92->60|92->60|92->60|92->60|93->61|93->61|93->61|94->62|95->63|97->65|97->65|97->65|97->65|99->67|100->68|104->72|104->72|104->72
                  -- GENERATED --
              */
          