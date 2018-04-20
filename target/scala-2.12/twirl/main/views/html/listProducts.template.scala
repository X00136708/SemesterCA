
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
  def apply/*4.2*/(poll: models.community.Poll, products: List[Product], categories: List[Category], platformId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.155*/("""


"""),_display_(/*7.2*/main("Shop",user)/*7.19*/ {_display_(Seq[Any](format.raw/*7.21*/("""
  """),format.raw/*8.3*/("""<body>
  <link href=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.63*/("""" rel="stylesheet" />
  <h1>Games</h1>
  <br>
  <div class="row">
      
     
    <form action=""""),_display_(/*15.20*/routes/*15.26*/.CommunityCtrl.vote),format.raw/*15.45*/("""" method="POST">
      """),_display_(/*16.8*/helper/*16.14*/.CSRF.formField),format.raw/*16.29*/("""
      """),_display_(/*17.8*/for(item <- poll.getItems) yield /*17.34*/ {_display_(Seq[Any](format.raw/*17.36*/("""
         """),format.raw/*18.10*/("""<h3>"""),_display_(/*18.15*/item/*18.19*/.getItem),format.raw/*18.27*/("""</h3>
         <label for=""""),_display_(/*19.23*/item/*19.27*/.getId),format.raw/*19.33*/("""">"""),_display_(/*19.36*/item/*19.40*/.getItem),format.raw/*19.48*/("""</label>
        <input name="item" id=""""),_display_(/*20.33*/item/*20.37*/.getId),format.raw/*20.43*/("""" type="radio" value=""""),_display_(/*20.66*/item/*20.70*/.getId),format.raw/*20.76*/("""">"""),_display_(/*20.79*/item/*20.83*/.getVotes),format.raw/*20.92*/("""
      """)))}),format.raw/*21.8*/("""
      """),format.raw/*22.7*/("""<input type="submit" value="Vote">
      <input type="text" name="pollId" value=""""),_display_(/*23.48*/poll/*23.52*/.getId),format.raw/*23.58*/("""" style="display: none;">
   </form>
      <div class="list-categories">
          """),_display_(/*26.12*/if(user != null)/*26.28*/{_display_(Seq[Any](format.raw/*26.29*/("""
            """),_display_(/*27.14*/if(user.isInstanceOf[models.users.Administrator])/*27.63*/{_display_(Seq[Any](format.raw/*27.64*/("""
              """),format.raw/*28.15*/("""<div class="adminProduct">
                 
                  <p>
                      <a href=""""),_display_(/*31.33*/routes/*31.39*/.AdminProductCtrl.addProduct()),format.raw/*31.69*/("""" class="btn btn-sm">Add a product
                      </a>
                      
                    </p>
                  
              </div>
            """)))}),format.raw/*37.14*/("""
          """)))}),format.raw/*38.12*/("""
          """),format.raw/*39.11*/("""<div class="category">
              <div class="search">
                  <form action=""""),_display_(/*41.34*/routes/*41.40*/.ProductCtrl.listProducts(platformId)),format.raw/*41.77*/("""" class="text" method="GET">
                      <input type="search" id="searchbox" name="filter" value=""""),_display_(/*42.81*/filter),format.raw/*42.87*/("""" placeholder="Search for game...">
                      <input type="submit" id="searchsubmit" value="Search" class="searchbtn-sm ">
                  </form>
                    </div>
                    
                    <a href=""""),_display_(/*47.31*/routes/*47.37*/.ProductCtrl.listProducts(0)),format.raw/*47.65*/("""" class="btn btn-sm">All Platforms</a>
                    <br>
        """),_display_(/*49.10*/for(c <- categories) yield /*49.30*/ {_display_(Seq[Any](format.raw/*49.32*/("""
          """),format.raw/*50.11*/("""<a href=""""),_display_(/*50.21*/routes/*50.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*50.61*/("""" class="btn btn-sm">"""),_display_(/*50.83*/c/*50.84*/.getName),format.raw/*50.92*/("""
            """),format.raw/*51.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*51.59*/c/*51.60*/.getProducts().size),format.raw/*51.79*/("""</span>
          </a>
        """)))}),format.raw/*53.10*/("""
     
      """),format.raw/*55.7*/("""</div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*70.10*/if(flash.containsKey("success"))/*70.42*/ {_display_(Seq[Any](format.raw/*70.44*/("""
          """),format.raw/*71.11*/("""<div class="alert alert-success">
            """),_display_(/*72.14*/flash/*72.19*/.get("success")),format.raw/*72.34*/("""
          """),format.raw/*73.11*/("""</div>
        """)))}),format.raw/*74.10*/("""
       
        
      
        
        """),format.raw/*79.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*81.12*/for(p<-products) yield /*81.28*/ {_display_(Seq[Any](format.raw/*81.30*/("""
              """),format.raw/*82.15*/("""<a href=""""),_display_(/*82.25*/routes/*82.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*82.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*83.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*83.83*/ {_display_(Seq[Any](format.raw/*83.85*/("""
                    """),format.raw/*84.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*84.54*/(p.getId + ".png")),format.raw/*84.72*/("""" id="prodImg"/>
                """)))}/*85.19*/else/*85.24*/{_display_(Seq[Any](format.raw/*85.25*/("""
                    """),format.raw/*86.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*87.18*/("""
                  """),format.raw/*88.19*/("""<h4 id="prodName">"""),_display_(/*88.38*/p/*88.39*/.getName),format.raw/*88.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*90.40*/p/*90.41*/.getPrice),format.raw/*90.50*/("""</h4>
                 <p>
                    """),_display_(/*92.22*/for(c<-p.getCategories) yield /*92.45*/{_display_(Seq[Any](format.raw/*92.46*/("""
                      """),_display_(/*93.24*/c/*93.25*/.getName),format.raw/*93.33*/("""&nbsp;
                    """)))}),format.raw/*94.22*/("""
                    """),_display_(/*95.22*/if(user != null)/*95.38*/{_display_(Seq[Any](format.raw/*95.39*/("""
                      """),_display_(/*96.24*/if(user.isInstanceOf[models.users.Administrator])/*96.73*/{_display_(Seq[Any](format.raw/*96.74*/("""
                        """),_display_(/*97.26*/if(p.getStock > 0)/*97.44*/{_display_(Seq[Any](format.raw/*97.45*/("""
                          """),format.raw/*98.27*/("""<div id="prodStock">Stock: """),_display_(/*98.55*/p/*98.56*/.getStock),format.raw/*98.65*/("""</div>
                        """)))}/*99.27*/else/*99.32*/{_display_(Seq[Any](format.raw/*99.33*/("""
                          """),format.raw/*100.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*101.26*/("""
                      """)))}),format.raw/*102.24*/("""
                    """)))}),format.raw/*103.22*/("""
                    """),_display_(/*104.22*/if(user != null)/*104.38*/{_display_(Seq[Any](format.raw/*104.39*/("""
                      """),_display_(/*105.24*/if(user.isInstanceOf[models.users.Administrator])/*105.73*/{_display_(Seq[Any](format.raw/*105.74*/("""
                        """),format.raw/*106.25*/("""<div id="prodPegi">"""),_display_(/*106.45*/p/*106.46*/.getPegi),format.raw/*106.54*/("""</div>
                    """)))}/*107.22*/else/*107.26*/{_display_(Seq[Any](format.raw/*107.27*/("""
                      """),format.raw/*108.23*/("""<br><div id="prodPegi">"""),_display_(/*108.47*/p/*108.48*/.getPegi),format.raw/*108.56*/("""</div>
                    """)))}),format.raw/*109.22*/("""
                  """)))}/*110.20*/else/*110.24*/{_display_(Seq[Any](format.raw/*110.25*/("""
                    """),format.raw/*111.21*/("""<br><div id="prodPegi">"""),_display_(/*111.45*/p/*111.46*/.getPegi),format.raw/*111.54*/("""</div>
                  """)))}),format.raw/*112.20*/("""
                  """),format.raw/*113.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*119.18*/("""
              """),format.raw/*120.15*/("""</div>
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
                  DATE: Fri Apr 20 19:14:34 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA /app/views/listProducts.scala.html
                  HASH: 754ca9198be3c450222c8bdc395e29cb470a847f
                  MATRIX: 651->1|690->34|728->66|1146->92|1395->245|1424->249|1449->266|1488->268|1517->271|1565->293|1579->299|1640->340|1765->438|1780->444|1820->463|1870->487|1885->493|1921->508|1955->516|1997->542|2037->544|2075->554|2107->559|2120->563|2149->571|2204->599|2217->603|2244->609|2274->612|2287->616|2316->624|2384->665|2397->669|2424->675|2474->698|2487->702|2514->708|2544->711|2557->715|2587->724|2625->732|2659->739|2768->821|2781->825|2808->831|2919->915|2944->931|2983->932|3024->946|3082->995|3121->996|3164->1011|3290->1110|3305->1116|3356->1146|3550->1309|3593->1321|3632->1332|3750->1423|3765->1429|3823->1466|3959->1575|3986->1581|4252->1820|4267->1826|4316->1854|4416->1927|4452->1947|4492->1949|4531->1960|4568->1970|4583->1976|4638->2010|4687->2032|4697->2033|4726->2041|4767->2054|4840->2100|4850->2101|4890->2120|4953->2152|4993->2165|5169->2314|5210->2346|5250->2348|5289->2359|5363->2406|5377->2411|5413->2426|5452->2437|5499->2453|5568->2495|5704->2604|5736->2620|5776->2622|5819->2637|5856->2647|5871->2653|5928->2689|6016->2750|6088->2813|6128->2815|6177->2836|6237->2869|6276->2887|6329->2922|6342->2927|6381->2928|6430->2949|6538->3026|6585->3045|6631->3064|6641->3065|6670->3073|6761->3137|6771->3138|6801->3147|6876->3195|6915->3218|6954->3219|7005->3243|7015->3244|7044->3252|7103->3280|7152->3302|7177->3318|7216->3319|7267->3343|7325->3392|7364->3393|7417->3419|7444->3437|7483->3438|7538->3465|7593->3493|7603->3494|7633->3503|7684->3536|7697->3541|7736->3542|7792->3569|7884->3629|7940->3653|7994->3675|8044->3697|8070->3713|8110->3714|8162->3738|8221->3787|8261->3788|8315->3813|8363->3833|8374->3834|8404->3842|8452->3870|8466->3874|8506->3875|8558->3898|8610->3922|8621->3923|8651->3931|8711->3959|8751->3979|8765->3983|8805->3984|8855->4005|8907->4029|8918->4030|8948->4038|9006->4064|9054->4083|9192->4189|9236->4204
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|58->26|58->26|58->26|59->27|59->27|59->27|60->28|63->31|63->31|63->31|69->37|70->38|71->39|73->41|73->41|73->41|74->42|74->42|79->47|79->47|79->47|81->49|81->49|81->49|82->50|82->50|82->50|82->50|82->50|82->50|82->50|83->51|83->51|83->51|83->51|85->53|87->55|102->70|102->70|102->70|103->71|104->72|104->72|104->72|105->73|106->74|111->79|113->81|113->81|113->81|114->82|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|119->87|120->88|120->88|120->88|120->88|122->90|122->90|122->90|124->92|124->92|124->92|125->93|125->93|125->93|126->94|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|130->98|130->98|130->98|130->98|131->99|131->99|131->99|132->100|133->101|134->102|135->103|136->104|136->104|136->104|137->105|137->105|137->105|138->106|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|141->109|142->110|142->110|142->110|143->111|143->111|143->111|143->111|144->112|145->113|151->119|152->120
                  -- GENERATED --
              */
          