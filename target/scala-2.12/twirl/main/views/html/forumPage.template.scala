
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
                  DATE: Mon Apr 16 10:32:59 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/forumPage.scala.html
                  HASH: f08abc24c5ac6aef4a40e4ea79917f9150c0db98
                  MATRIX: 651->1|692->36|730->68|1124->94|1336->210|1365->214|1392->233|1431->235|1459->237|1627->378|1642->384|1698->419|1774->469|1808->487|1848->489|1884->498|1921->508|1936->514|1998->555|2052->582|2062->583|2092->591|2128->600|2170->612|2202->617|2276->665|2317->697|2357->699|2393->708|2465->753|2479->758|2515->773|2551->782|2595->796|2634->807|2727->873|2742->879|2795->911|2905->994|2932->1000|3389->1430|3419->1444|3459->1446|3498->1457|3556->1488|3571->1494|3625->1527|3672->1547|3683->1549|3713->1558|3787->1605|3820->1629|3859->1630|3904->1647|3936->1652|3947->1654|3986->1672|4027->1694|4040->1698|4079->1699|4124->1716|4184->1745|4228->1761|4260->1766|4271->1768|4311->1787|4378->1827|4389->1829|4426->1845|4488->1876|4522->1883|4598->1932|4613->1938|4661->1965
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|51->19|52->20|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|61->29|63->31|63->31|63->31|64->32|64->32|79->47|79->47|79->47|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|84->52|84->52|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|88->56|89->57|89->57|89->57|89->57|90->58|90->58|90->58|92->60|93->61|97->65|97->65|97->65
                  -- GENERATED --
              */
          