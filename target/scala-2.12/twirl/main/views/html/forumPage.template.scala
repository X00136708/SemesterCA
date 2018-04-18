
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
                  DATE: Wed Apr 18 18:55:10 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/forumPage.scala.html
                  HASH: 68e9ca28b7fcff0747d3767a62cfd2ab5df67320
                  MATRIX: 651->1|692->37|730->70|1124->97|1336->213|1368->220|1395->239|1434->241|1464->245|1503->258|1517->264|1578->305|1819->519|1834->525|1890->560|1980->624|2014->642|2054->644|2091->654|2128->664|2143->670|2205->711|2259->738|2269->739|2299->747|2339->759|2412->805|2422->806|2459->822|2509->842|2542->848|2619->899|2660->931|2700->933|2737->943|2810->989|2824->994|2860->1009|2897->1019|2942->1034|2983->1047|3078->1115|3093->1121|3146->1153|3257->1237|3284->1243|3753->1685|3783->1699|3823->1701|3863->1713|3922->1745|3937->1751|3991->1784|4039->1805|4050->1807|4080->1816|4156->1865|4189->1889|4228->1890|4274->1908|4306->1913|4317->1915|4356->1933|4398->1956|4411->1960|4450->1961|4496->1979|4557->2009|4602->2027|4636->2052|4675->2053|4721->2071|4753->2076|4764->2078|4804->2097|4846->2120|4859->2124|4898->2125|4945->2144|5006->2174|5065->2205|5114->2227|5125->2229|5162->2245|5226->2278|5261->2286|5341->2339|5356->2345|5404->2372
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|48->16|48->16|48->16|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|54->22|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|63->31|65->33|65->33|65->33|66->34|66->34|81->49|81->49|81->49|82->50|83->51|83->51|83->51|84->52|84->52|84->52|86->54|86->54|86->54|87->55|87->55|87->55|87->55|88->56|88->56|88->56|89->57|90->58|91->59|91->59|91->59|92->60|92->60|92->60|92->60|93->61|93->61|93->61|94->62|95->63|97->65|97->65|97->65|97->65|99->67|100->68|104->72|104->72|104->72
                  -- GENERATED --
              */
          