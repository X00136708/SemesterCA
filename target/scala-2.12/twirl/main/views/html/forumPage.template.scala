
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

"""),format.raw/*9.1*/("""<p class="lead">Community Forums</p>
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
                  DATE: Thu Apr 12 20:03:29 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/forumPage.scala.html
                  HASH: 7a54089647896e2b4477c316ac44fd7511e69377
                  MATRIX: 651->1|692->37|730->70|1124->97|1336->213|1368->220|1395->239|1434->241|1464->245|1649->403|1664->409|1720->444|1797->495|1831->513|1871->515|1908->525|1945->535|1960->541|2022->582|2076->609|2086->610|2116->618|2153->628|2196->641|2229->647|2306->698|2347->730|2387->732|2424->742|2497->788|2511->793|2547->808|2584->818|2629->833|2670->846|2765->914|2780->920|2833->952|2944->1036|2971->1042|3443->1487|3473->1501|3513->1503|3553->1515|3612->1547|3627->1553|3681->1586|3729->1607|3740->1609|3770->1618|3846->1667|3879->1691|3918->1692|3964->1710|3996->1715|4007->1717|4046->1735|4088->1758|4101->1762|4140->1763|4186->1781|4247->1811|4292->1828|4324->1833|4335->1835|4375->1854|4443->1895|4454->1897|4491->1913|4555->1946|4590->1954|4670->2007|4685->2013|4733->2040
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|51->19|52->20|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|61->29|63->31|63->31|63->31|64->32|64->32|79->47|79->47|79->47|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|84->52|84->52|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|88->56|89->57|89->57|89->57|89->57|90->58|90->58|90->58|92->60|93->61|97->65|97->65|97->65
                  -- GENERATED --
              */
          