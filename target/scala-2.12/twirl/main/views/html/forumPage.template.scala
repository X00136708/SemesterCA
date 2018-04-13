
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
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.CommunityCtrl.forumPage(0, filter)),format.raw/*15.58*/("""" class="list-group-item">All Products</a>
      """),_display_(/*16.8*/for(p <- products) yield /*16.26*/ {_display_(Seq[Any](format.raw/*16.28*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.CommunityCtrl.forumPage(p.getId, filter)),format.raw/*17.66*/("""" class="list-group-item">"""),_display_(/*17.93*/p/*17.94*/.getName),format.raw/*17.102*/("""
        """),format.raw/*18.9*/("""</a>
      """)))}),format.raw/*19.8*/("""
    """),format.raw/*20.5*/("""</div>
  </div>
  <div class="col-sm-8">
      """),_display_(/*23.8*/if(flash.containsKey("success"))/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
        """),format.raw/*24.9*/("""<div class="alert alert-success">
          """),_display_(/*25.12*/flash/*25.17*/.get("success")),format.raw/*25.32*/("""
        """),format.raw/*26.9*/("""</div>
      """)))}),format.raw/*27.8*/("""

      			"""),format.raw/*29.10*/("""<!-- Search Form -->
			<div id="actions">
        <form action=""""),_display_(/*31.24*/routes/*31.30*/.CommunityCtrl.forumPage(prodId)),format.raw/*31.62*/("""" method="GET">
         <input type="search" id="searchbox" name="filter" value=""""),_display_(/*32.68*/filter),format.raw/*32.74*/("""" placeholder="Filter by post title...">
         <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
        </form>
       </div>
    <table class="table table-bordered table-hover table-condensed">   
      <thead>
        <tr>
          <th>Title</th>
          <th>Author</th>
          <th>Product</th>
          <th>Replies</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*47.10*/for(fp<-posts) yield /*47.24*/ {_display_(Seq[Any](format.raw/*47.26*/("""
          """),format.raw/*48.11*/("""<tr>
            <td><a href=""""),_display_(/*49.27*/routes/*49.33*/.CommunityCtrl.viewPost(fp.getId)),format.raw/*49.66*/("""">
                """),_display_(/*50.18*/fp/*50.20*/.getTitle),format.raw/*50.29*/("""</td>
               </a>     
               """),_display_(/*52.17*/if(fp.getAuthor != null)/*52.41*/{_display_(Seq[Any](format.raw/*52.42*/("""
                """),format.raw/*53.17*/("""<td>"""),_display_(/*53.22*/fp/*53.24*/.getAuthor.getName),format.raw/*53.42*/("""</td>
               """)))}/*54.17*/else/*54.21*/{_display_(Seq[Any](format.raw/*54.22*/("""
                """),format.raw/*55.17*/("""<td>N/A</td>
               """)))}),format.raw/*56.17*/("""
               """),format.raw/*57.16*/("""<td>"""),_display_(/*57.21*/fp/*57.23*/.getProduct.getName),format.raw/*57.42*/("""</td>
            <td  class="numeric">"""),_display_(/*58.35*/fp/*58.37*/.getReplies.size),format.raw/*58.53*/("""</td>
          </tr>
        """)))}),format.raw/*60.10*/("""
      """),format.raw/*61.7*/("""</tbody>

    </table>
    <p>
        <a href=""""),_display_(/*65.19*/routes/*65.25*/.CommunityCtrl.createPost()),format.raw/*65.52*/("""">
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
                  DATE: Fri Apr 13 15:47:12 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/forumPage.scala.html
                  HASH: 0b5c8d58ece13103b4912e44f31a52dcf6640098
                  MATRIX: 651->1|692->37|730->70|1124->97|1336->213|1368->220|1395->239|1434->241|1464->245|1638->392|1653->398|1709->433|1786->484|1820->502|1860->504|1897->514|1934->524|1949->530|2011->571|2065->598|2075->599|2105->607|2142->617|2185->630|2218->636|2295->687|2336->719|2376->721|2413->731|2486->777|2500->782|2536->797|2573->807|2618->822|2659->835|2754->903|2769->909|2822->941|2933->1025|2960->1031|3432->1476|3462->1490|3502->1492|3542->1504|3601->1536|3616->1542|3670->1575|3718->1596|3729->1598|3759->1607|3835->1656|3868->1680|3907->1681|3953->1699|3985->1704|3996->1706|4035->1724|4077->1747|4090->1751|4129->1752|4175->1770|4236->1800|4281->1817|4313->1822|4324->1824|4364->1843|4432->1884|4443->1886|4480->1902|4544->1935|4579->1943|4659->1996|4674->2002|4722->2029
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|51->19|52->20|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|61->29|63->31|63->31|63->31|64->32|64->32|79->47|79->47|79->47|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|84->52|84->52|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|88->56|89->57|89->57|89->57|89->57|90->58|90->58|90->58|92->60|93->61|97->65|97->65|97->65
                  -- GENERATED --
              */
          