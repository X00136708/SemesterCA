
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

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[models.community.Poll,List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(poll: models.community.Poll,products: List[Product], categories: List[Category], platformId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.154*/("""


"""),_display_(/*7.2*/main("Shop",user)/*7.19*/ {_display_(Seq[Any](format.raw/*7.21*/("""
  """),format.raw/*8.3*/("""<body>
  <link href=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.63*/("""" rel="stylesheet" />
  <h1>Games</h1>
  <br>
  <div class="row">
    <div class="list-group">
      <form action=""""),_display_(/*14.22*/routes/*14.28*/.CommunityCtrl.vote),format.raw/*14.47*/("""" method="POST">
          """),_display_(/*15.12*/helper/*15.18*/.CSRF.formField),format.raw/*15.33*/("""
          """),_display_(/*16.12*/for(item <- poll.getItems) yield /*16.38*/ {_display_(Seq[Any](format.raw/*16.40*/("""
             """),format.raw/*17.14*/("""<h3>"""),_display_(/*17.19*/item/*17.23*/.getItem),format.raw/*17.31*/("""</h3>
             <label for=""""),_display_(/*18.27*/item/*18.31*/.getId),format.raw/*18.37*/("""">"""),_display_(/*18.40*/item/*18.44*/.getItem),format.raw/*18.52*/("""</label>
            <input name="item" id=""""),_display_(/*19.37*/item/*19.41*/.getId),format.raw/*19.47*/("""" type="radio" value=""""),_display_(/*19.70*/item/*19.74*/.getId),format.raw/*19.80*/("""">"""),_display_(/*19.83*/item/*19.87*/.getVotes),format.raw/*19.96*/("""
          
          """)))}),format.raw/*21.12*/("""
          """),format.raw/*22.11*/("""<input type="submit" value="Vote">
          <input type="text" name="pollId" value=""""),_display_(/*23.52*/poll/*23.56*/.getId),format.raw/*23.62*/("""" style="display: none;">
       </form>
      </div>
      <div class="list-categories">
          """),_display_(/*27.12*/if(user != null)/*27.28*/{_display_(Seq[Any](format.raw/*27.29*/("""
            """),_display_(/*28.14*/if(user.isInstanceOf[models.users.Administrator])/*28.63*/{_display_(Seq[Any](format.raw/*28.64*/("""
              """),format.raw/*29.15*/("""<div class="adminProduct">
                 
                  <p>
                      <a href=""""),_display_(/*32.33*/routes/*32.39*/.AdminProductCtrl.addProduct()),format.raw/*32.69*/("""" class="btn btn-sm">Add a product
                      </a>
                      
                    </p>
                  
              </div>
            """)))}),format.raw/*38.14*/("""
          """)))}),format.raw/*39.12*/("""
          """),format.raw/*40.11*/("""<div class="category">
              <div class="search">
                  <form action=""""),_display_(/*42.34*/routes/*42.40*/.ProductCtrl.listProducts(platformId)),format.raw/*42.77*/("""" class="text" method="GET">
                      <input type="search" id="searchbox" name="filter" value=""""),_display_(/*43.81*/filter),format.raw/*43.87*/("""" placeholder="Search for game...">
                      <input type="submit" id="searchsubmit" value="Search" class="searchbtn-sm ">
                  </form>
                    </div>
                    
                    <a href=""""),_display_(/*48.31*/routes/*48.37*/.ProductCtrl.listProducts(0)),format.raw/*48.65*/("""" class="btn btn-sm">All Platforms</a>
                    <br>
                    <div class="plat">
        """),_display_(/*51.10*/for(c <- categories) yield /*51.30*/ {_display_(Seq[Any](format.raw/*51.32*/("""
          """),format.raw/*52.11*/("""<a href=""""),_display_(/*52.21*/routes/*52.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*52.61*/("""" class="btn btn-sm">"""),_display_(/*52.83*/c/*52.84*/.getName),format.raw/*52.92*/("""
            """),format.raw/*53.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*53.59*/c/*53.60*/.getProducts().size),format.raw/*53.79*/("""</span>
          </a>
        """)))}),format.raw/*55.10*/("""
      """),format.raw/*56.7*/("""</div>    
     
      </div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*73.10*/if(flash.containsKey("success"))/*73.42*/ {_display_(Seq[Any](format.raw/*73.44*/("""
          """),format.raw/*74.11*/("""<div class="alert alert-success">
            """),_display_(/*75.14*/flash/*75.19*/.get("success")),format.raw/*75.34*/("""
          """),format.raw/*76.11*/("""</div>
        """)))}),format.raw/*77.10*/("""
       
        
      
        
        """),format.raw/*82.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*84.12*/for(p<-products) yield /*84.28*/ {_display_(Seq[Any](format.raw/*84.30*/("""
              """),format.raw/*85.15*/("""<a href=""""),_display_(/*85.25*/routes/*85.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*85.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*86.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*86.83*/ {_display_(Seq[Any](format.raw/*86.85*/("""
                    """),format.raw/*87.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*87.54*/(p.getId + ".png")),format.raw/*87.72*/("""" id="prodImg"/>
                """)))}/*88.19*/else/*88.24*/{_display_(Seq[Any](format.raw/*88.25*/("""
                    """),format.raw/*89.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*90.18*/("""
                  """),format.raw/*91.19*/("""<h4 id="prodName">"""),_display_(/*91.38*/p/*91.39*/.getName),format.raw/*91.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*93.40*/p/*93.41*/.getPrice),format.raw/*93.50*/("""</h4>
                 <p>
                    """),_display_(/*95.22*/for(c<-p.getCategories) yield /*95.45*/{_display_(Seq[Any](format.raw/*95.46*/("""
                      """),_display_(/*96.24*/c/*96.25*/.getName),format.raw/*96.33*/("""&nbsp;
                    """)))}),format.raw/*97.22*/("""
                    """),_display_(/*98.22*/if(user != null)/*98.38*/{_display_(Seq[Any](format.raw/*98.39*/("""
                      """),_display_(/*99.24*/if(user.isInstanceOf[models.users.Administrator])/*99.73*/{_display_(Seq[Any](format.raw/*99.74*/("""
                        """),_display_(/*100.26*/if(p.getStock > 0)/*100.44*/{_display_(Seq[Any](format.raw/*100.45*/("""
                          """),format.raw/*101.27*/("""<div id="prodStock">Stock: """),_display_(/*101.55*/p/*101.56*/.getStock),format.raw/*101.65*/("""</div>
                        """)))}/*102.27*/else/*102.32*/{_display_(Seq[Any](format.raw/*102.33*/("""
                          """),format.raw/*103.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*104.26*/("""
                      """)))}),format.raw/*105.24*/("""
                    """)))}),format.raw/*106.22*/("""
                    """),_display_(/*107.22*/if(user != null)/*107.38*/{_display_(Seq[Any](format.raw/*107.39*/("""
                      """),_display_(/*108.24*/if(user.isInstanceOf[models.users.Administrator])/*108.73*/{_display_(Seq[Any](format.raw/*108.74*/("""
                        """),format.raw/*109.25*/("""<div id="prodPegi">"""),_display_(/*109.45*/p/*109.46*/.getPegi),format.raw/*109.54*/("""</div>
                    """)))}/*110.22*/else/*110.26*/{_display_(Seq[Any](format.raw/*110.27*/("""
                      """),format.raw/*111.23*/("""<br><div id="prodPegi">"""),_display_(/*111.47*/p/*111.48*/.getPegi),format.raw/*111.56*/("""</div>
                    """)))}),format.raw/*112.22*/("""
                  """)))}/*113.20*/else/*113.24*/{_display_(Seq[Any](format.raw/*113.25*/("""
                    """),format.raw/*114.21*/("""<br><div id="prodPegi">"""),_display_(/*114.45*/p/*114.46*/.getPegi),format.raw/*114.54*/("""</div>
                  """)))}),format.raw/*115.20*/("""
                  """),format.raw/*116.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*122.18*/("""
              """),format.raw/*123.15*/("""</div>
            </div>
          </div>
  
     
   
  </div>
</body>
  
  """)))}))
      }
    }
  }

  def render(poll:models.community.Poll,products:List[Product],categories:List[Category],platformId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(poll,products,categories,platformId,filter,user,env)

  def f:((models.community.Poll,List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (poll,products,categories,platformId,filter,user,env) => apply(poll,products,categories,platformId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 12:59:05 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: 24d9434ce622f24dcb3234d8ecca94877a2e072e
                  MATRIX: 651->1|690->35|728->68|1146->95|1394->247|1426->254|1451->271|1490->273|1520->277|1569->300|1583->306|1644->347|1792->468|1807->474|1847->493|1903->522|1918->528|1954->543|1994->556|2036->582|2076->584|2119->599|2151->604|2164->608|2193->616|2253->649|2266->653|2293->659|2323->662|2336->666|2365->674|2438->720|2451->724|2478->730|2528->753|2541->757|2568->763|2598->766|2611->770|2641->779|2697->804|2737->816|2851->903|2864->907|2891->913|3023->1018|3048->1034|3087->1035|3129->1050|3187->1099|3226->1100|3270->1116|3399->1218|3414->1224|3465->1254|3665->1423|3709->1436|3749->1448|3869->1541|3884->1547|3942->1584|4079->1694|4106->1700|4377->1944|4392->1950|4441->1978|4583->2093|4619->2113|4659->2115|4699->2127|4736->2137|4751->2143|4806->2177|4855->2199|4865->2200|4894->2208|4936->2222|5009->2268|5019->2269|5059->2288|5124->2322|5159->2330|5375->2519|5416->2551|5456->2553|5496->2565|5571->2613|5585->2618|5621->2633|5661->2645|5709->2662|5783->2709|5921->2820|5953->2836|5993->2838|6037->2854|6074->2864|6089->2870|6146->2906|6235->2968|6307->3031|6347->3033|6397->3055|6457->3088|6496->3106|6550->3142|6563->3147|6602->3148|6652->3170|6761->3248|6809->3268|6855->3287|6865->3288|6894->3296|6987->3362|6997->3363|7027->3372|7104->3422|7143->3445|7182->3446|7234->3471|7244->3472|7273->3480|7333->3509|7383->3532|7408->3548|7447->3549|7499->3574|7557->3623|7596->3624|7651->3651|7679->3669|7719->3670|7776->3698|7832->3726|7843->3727|7874->3736|7927->3770|7941->3775|7981->3776|8038->3804|8131->3865|8188->3890|8243->3913|8294->3936|8320->3952|8360->3953|8413->3978|8472->4027|8512->4028|8567->4054|8615->4074|8626->4075|8656->4083|8705->4112|8719->4116|8759->4117|8812->4141|8864->4165|8875->4166|8905->4174|8966->4203|9007->4224|9021->4228|9061->4229|9112->4251|9164->4275|9175->4276|9205->4284|9264->4311|9313->4331|9457->4443|9502->4459
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|53->21|54->22|55->23|55->23|55->23|59->27|59->27|59->27|60->28|60->28|60->28|61->29|64->32|64->32|64->32|70->38|71->39|72->40|74->42|74->42|74->42|75->43|75->43|80->48|80->48|80->48|83->51|83->51|83->51|84->52|84->52|84->52|84->52|84->52|84->52|84->52|85->53|85->53|85->53|85->53|87->55|88->56|105->73|105->73|105->73|106->74|107->75|107->75|107->75|108->76|109->77|114->82|116->84|116->84|116->84|117->85|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|122->90|123->91|123->91|123->91|123->91|125->93|125->93|125->93|127->95|127->95|127->95|128->96|128->96|128->96|129->97|130->98|130->98|130->98|131->99|131->99|131->99|132->100|132->100|132->100|133->101|133->101|133->101|133->101|134->102|134->102|134->102|135->103|136->104|137->105|138->106|139->107|139->107|139->107|140->108|140->108|140->108|141->109|141->109|141->109|141->109|142->110|142->110|142->110|143->111|143->111|143->111|143->111|144->112|145->113|145->113|145->113|146->114|146->114|146->114|146->114|147->115|148->116|154->122|155->123
                  -- GENERATED --
              */
          