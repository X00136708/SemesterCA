
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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], categories: List[Category], platformId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.126*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""
  """),format.raw/*8.3*/("""<link href=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.63*/("""" rel="stylesheet" />
  <p class="lead">Games</p>
  <br>
  <div class="row">
    <div class="col-sm-2">
     
      <div class="list-group">
        <b class="list-group-item">Platforms</b>
        """),_display_(/*16.10*/for(c <- categories) yield /*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
          """),format.raw/*17.11*/("""<a href=""""),_display_(/*17.21*/routes/*17.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*17.61*/("""" class="list-group-item">"""),_display_(/*17.88*/c/*17.89*/.getName),format.raw/*17.97*/("""
            """),format.raw/*18.13*/("""<span class="badge">"""),_display_(/*18.34*/c/*18.35*/.getProducts.size()),format.raw/*18.54*/("""</span>
          </a>
        """)))}),format.raw/*20.10*/("""
      """),format.raw/*21.7*/("""</div>

      """),_display_(/*23.8*/if(user != null)/*23.24*/{_display_(Seq[Any](format.raw/*23.25*/("""
        """),_display_(/*24.10*/if("admin".equals(user.getRole()))/*24.44*/{_display_(Seq[Any](format.raw/*24.45*/("""
          """),format.raw/*25.11*/("""<div class="list-group">
              <b class="list-group-item">Admin Controls</b>
              <p>
                  <a href=""""),_display_(/*28.29*/routes/*28.35*/.AdminProductCtrl.addProduct()),format.raw/*28.65*/("""" class="list-group-item">Add a product
                  </a>
                  <a href="#" class="list-group-item">Add a platform
                    </a>
                </p>
              
          </div>
        """)))}),format.raw/*35.10*/("""
      """)))}),format.raw/*36.8*/("""
      

      """),format.raw/*39.7*/("""<div id="actions">
          <form action=""""),_display_(/*40.26*/routes/*40.32*/.ProductCtrl.listProducts(platformId)),format.raw/*40.69*/("""" method="GET">
              <input type="search" id="searchbox" name="filter" value=""""),_display_(/*41.73*/filter),format.raw/*41.79*/("""" placeholder="Search for game...">
              <input type="submit" id="searchsubmit" value="Search" class="btn-md btn-primary">
             </form>
      </div>

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*51.10*/if(flash.containsKey("success"))/*51.42*/ {_display_(Seq[Any](format.raw/*51.44*/("""
          """),format.raw/*52.11*/("""<div class="alert alert-success">
            """),_display_(/*53.14*/flash/*53.19*/.get("success")),format.raw/*53.34*/("""
          """),format.raw/*54.11*/("""</div>
        """)))}),format.raw/*55.10*/("""
       
        
      
        
  
      """),format.raw/*61.7*/("""<div class="list-group">
          """),_display_(/*62.12*/for(p<-products) yield /*62.28*/ {_display_(Seq[Any](format.raw/*62.30*/("""
              """),format.raw/*63.15*/("""<a href=""""),_display_(/*63.25*/routes/*63.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*63.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*64.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*64.83*/ {_display_(Seq[Any](format.raw/*64.85*/("""
                    """),format.raw/*65.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*65.54*/(p.getId + ".png")),format.raw/*65.72*/("""" id="prodImg"/>
                """)))}/*66.19*/else/*66.24*/{_display_(Seq[Any](format.raw/*66.25*/("""
                    """),format.raw/*67.21*/("""<img src="/assets/images/noImage.jpg" id="prodImg"/>
                """)))}),format.raw/*68.18*/("""
                  """),format.raw/*69.19*/("""<h4 id="prodName">"""),_display_(/*69.38*/p/*69.39*/.getName),format.raw/*69.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*71.40*/p/*71.41*/.getPrice),format.raw/*71.50*/("""</h4>
                 <p>
                    """),_display_(/*73.22*/for(c<-p.getCategories) yield /*73.45*/{_display_(Seq[Any](format.raw/*73.46*/("""
                      """),_display_(/*74.24*/c/*74.25*/.getName),format.raw/*74.33*/("""&nbsp;
                    """)))}),format.raw/*75.22*/("""
                    """),_display_(/*76.22*/if(user != null)/*76.38*/{_display_(Seq[Any](format.raw/*76.39*/("""
                      """),_display_(/*77.24*/if("admin".equals(user.getRole()))/*77.58*/{_display_(Seq[Any](format.raw/*77.59*/("""
                        """),_display_(/*78.26*/if(p.getStock > 0)/*78.44*/{_display_(Seq[Any](format.raw/*78.45*/("""
                          """),format.raw/*79.27*/("""<div id="prodStock">Stock: """),_display_(/*79.55*/p/*79.56*/.getStock),format.raw/*79.65*/("""</div>
                        """)))}/*80.27*/else/*80.32*/{_display_(Seq[Any](format.raw/*80.33*/("""
                          """),format.raw/*81.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*82.26*/("""
                      """)))}),format.raw/*83.24*/("""
                    """)))}),format.raw/*84.22*/("""
                    """),_display_(/*85.22*/if(user != null)/*85.38*/{_display_(Seq[Any](format.raw/*85.39*/("""
                      """),_display_(/*86.24*/if("admin".equals(user.getRole()))/*86.58*/{_display_(Seq[Any](format.raw/*86.59*/("""
                      """),_display_(/*87.24*/p/*87.25*/.getPegi),format.raw/*87.33*/("""
                    """)))}/*88.22*/else/*88.26*/{_display_(Seq[Any](format.raw/*88.27*/("""
                      """),format.raw/*89.23*/("""<br>"""),_display_(/*89.28*/p/*89.29*/.getPegi),format.raw/*89.37*/("""
                    """)))}),format.raw/*90.22*/("""
                  """)))}/*91.20*/else/*91.24*/{_display_(Seq[Any](format.raw/*91.25*/("""
                    """),format.raw/*92.21*/("""<br>"""),_display_(/*92.26*/p/*92.27*/.getPegi),format.raw/*92.35*/("""
                  """)))}),format.raw/*93.20*/("""
                  """),format.raw/*94.19*/("""</p>
                  
                  </a>
             
              <!-- <td  class="numeric">"""),_display_(/*98.42*/p/*98.43*/.getStock),format.raw/*98.52*/("""</td>
              <td  class="numeric">€ """),_display_(/*99.39*/("%.2f".format(p.getPrice))),format.raw/*99.66*/("""</td>
              
              <td><a href=""""),_display_(/*101.29*/routes/*101.35*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*101.75*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  </a>
                </td>        
              <td><a href=""""),_display_(/*105.29*/routes/*105.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*105.75*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span>
                  </a>
                </td> -->
              
                """)))}),format.raw/*110.18*/("""
              """),format.raw/*111.15*/("""</div>
            </div>
          </div>
  
     
   
  </div>
  
  
  """)))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],platformId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,platformId,filter,user,env)

  def f:((List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,platformId,filter,user,env) => apply(products,categories,platformId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 20:35:40 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: 62ab8495ab97d7fb3bb5afdf9d393de50e0851f5
                  MATRIX: 651->1|690->35|728->68|1124->95|1344->219|1376->226|1405->247|1444->249|1474->253|1513->266|1527->272|1588->313|1822->520|1858->540|1898->542|1938->554|1975->564|1990->570|2045->604|2099->631|2109->632|2138->640|2180->654|2228->675|2238->676|2278->695|2343->729|2378->737|2421->754|2446->770|2485->771|2523->782|2566->816|2605->817|2645->829|2806->963|2821->969|2872->999|3129->1225|3168->1234|3213->1252|3285->1297|3300->1303|3358->1340|3474->1429|3501->1435|3793->1700|3834->1732|3874->1734|3914->1746|3989->1794|4003->1799|4039->1814|4079->1826|4127->1843|4203->1892|4267->1929|4299->1945|4339->1947|4383->1963|4420->1973|4435->1979|4492->2015|4581->2077|4653->2140|4693->2142|4743->2164|4803->2197|4842->2215|4896->2251|4909->2256|4948->2257|4998->2279|5100->2350|5148->2370|5194->2389|5204->2390|5233->2398|5326->2464|5336->2465|5366->2474|5443->2524|5482->2547|5521->2548|5573->2573|5583->2574|5612->2582|5672->2611|5722->2634|5747->2650|5786->2651|5838->2676|5881->2710|5920->2711|5974->2738|6001->2756|6040->2757|6096->2785|6151->2813|6161->2814|6191->2823|6243->2857|6256->2862|6295->2863|6351->2891|6443->2952|6499->2977|6553->3000|6603->3023|6628->3039|6667->3040|6719->3065|6762->3099|6801->3100|6853->3125|6863->3126|6892->3134|6934->3157|6947->3161|6986->3162|7038->3186|7070->3191|7080->3192|7109->3200|7163->3223|7203->3244|7216->3248|7255->3249|7305->3271|7337->3276|7347->3277|7376->3285|7428->3306|7476->3326|7609->3432|7619->3433|7649->3442|7721->3487|7769->3514|7848->3565|7864->3571|7926->3611|8140->3797|8156->3803|8218->3843|8467->4060|8512->4076
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|60->28|60->28|60->28|67->35|68->36|71->39|72->40|72->40|72->40|73->41|73->41|83->51|83->51|83->51|84->52|85->53|85->53|85->53|86->54|87->55|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|100->68|101->69|101->69|101->69|101->69|103->71|103->71|103->71|105->73|105->73|105->73|106->74|106->74|106->74|107->75|108->76|108->76|108->76|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|111->79|112->80|112->80|112->80|113->81|114->82|115->83|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|121->89|122->90|123->91|123->91|123->91|124->92|124->92|124->92|124->92|125->93|126->94|130->98|130->98|130->98|131->99|131->99|133->101|133->101|133->101|137->105|137->105|137->105|142->110|143->111
                  -- GENERATED --
              */
          