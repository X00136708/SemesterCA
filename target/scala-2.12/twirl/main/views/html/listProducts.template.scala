
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
                  DATE: Wed Apr 11 13:49:59 IST 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/listProducts.scala.html
                  HASH: 2ec23852a7fc23a2fd024eca87663b9de9990b2c
                  MATRIX: 651->1|690->34|728->66|1124->92|1344->216|1373->220|1402->241|1441->243|1470->246|1509->259|1523->265|1584->306|1810->505|1846->525|1886->527|1925->538|1962->548|1977->554|2032->588|2086->615|2096->616|2125->624|2166->637|2214->658|2224->659|2264->678|2327->710|2361->717|2402->732|2427->748|2466->749|2503->759|2546->793|2585->794|2624->805|2782->936|2797->942|2848->972|3098->1191|3136->1199|3178->1214|3249->1258|3264->1264|3322->1301|3437->1389|3464->1395|3746->1650|3787->1682|3827->1684|3866->1695|3940->1742|3954->1747|3990->1762|4029->1773|4076->1789|4146->1832|4209->1868|4241->1884|4281->1886|4324->1901|4361->1911|4376->1917|4433->1953|4521->2014|4593->2077|4633->2079|4682->2100|4742->2133|4781->2151|4834->2186|4847->2191|4886->2192|4935->2213|5036->2283|5083->2302|5129->2321|5139->2322|5168->2330|5259->2394|5269->2395|5299->2404|5374->2452|5413->2475|5452->2476|5503->2500|5513->2501|5542->2509|5601->2537|5650->2559|5675->2575|5714->2576|5765->2600|5808->2634|5847->2635|5900->2661|5927->2679|5966->2680|6021->2707|6076->2735|6086->2736|6116->2745|6167->2778|6180->2783|6219->2784|6274->2811|6365->2871|6420->2895|6473->2917|6522->2939|6547->2955|6586->2956|6637->2980|6680->3014|6719->3015|6770->3039|6780->3040|6809->3048|6850->3070|6863->3074|6902->3075|6953->3098|6985->3103|6995->3104|7024->3112|7077->3134|7116->3154|7129->3158|7168->3159|7217->3180|7249->3185|7259->3186|7288->3194|7339->3214|7386->3233|7515->3335|7525->3336|7555->3345|7626->3389|7674->3416|7751->3465|7767->3471|7829->3511|8039->3693|8055->3699|8117->3739|8361->3951|8405->3966
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|60->28|60->28|60->28|67->35|68->36|71->39|72->40|72->40|72->40|73->41|73->41|83->51|83->51|83->51|84->52|85->53|85->53|85->53|86->54|87->55|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|100->68|101->69|101->69|101->69|101->69|103->71|103->71|103->71|105->73|105->73|105->73|106->74|106->74|106->74|107->75|108->76|108->76|108->76|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|111->79|112->80|112->80|112->80|113->81|114->82|115->83|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|121->89|122->90|123->91|123->91|123->91|124->92|124->92|124->92|124->92|125->93|126->94|130->98|130->98|130->98|131->99|131->99|133->101|133->101|133->101|137->105|137->105|137->105|142->110|143->111
                  -- GENERATED --
              */
          