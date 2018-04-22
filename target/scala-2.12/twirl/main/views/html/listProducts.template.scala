
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
      <form action=""""),_display_(/*13.22*/routes/*13.28*/.CommunityCtrl.vote),format.raw/*13.47*/("""" method="POST">
          """),_display_(/*14.12*/helper/*14.18*/.CSRF.formField),format.raw/*14.33*/("""
          """),_display_(/*15.12*/for(item <- poll.getItems) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
             """),format.raw/*16.14*/("""<h3>"""),_display_(/*16.19*/item/*16.23*/.getItem),format.raw/*16.31*/("""</h3>
             <label for=""""),_display_(/*17.27*/item/*17.31*/.getId),format.raw/*17.37*/("""">"""),_display_(/*17.40*/item/*17.44*/.getItem),format.raw/*17.52*/("""</label>
            <input name="item" id=""""),_display_(/*18.37*/item/*18.41*/.getId),format.raw/*18.47*/("""" type="radio" value=""""),_display_(/*18.70*/item/*18.74*/.getId),format.raw/*18.80*/("""">"""),_display_(/*18.83*/item/*18.87*/.getVotes),format.raw/*18.96*/("""
          """)))}),format.raw/*19.12*/("""
          """),format.raw/*20.11*/("""<input type="submit" value="Vote">
          <input type="text" name="pollId" value=""""),_display_(/*21.52*/poll/*21.56*/.getId),format.raw/*21.62*/("""" style="display: none;">
       </form>
     
      <div class="list-categories">
          """),_display_(/*25.12*/if(user != null)/*25.28*/{_display_(Seq[Any](format.raw/*25.29*/("""
            """),_display_(/*26.14*/if(user.isInstanceOf[models.users.Administrator])/*26.63*/{_display_(Seq[Any](format.raw/*26.64*/("""
              """),format.raw/*27.15*/("""<div class="adminProduct">
                 
                  <p>
                      <a href=""""),_display_(/*30.33*/routes/*30.39*/.AdminProductCtrl.addProduct()),format.raw/*30.69*/("""" class="btn btn-sm">Add a product
                      </a>
                      
                    </p>
                  
              </div>
            """)))}),format.raw/*36.14*/("""
          """)))}),format.raw/*37.12*/("""
          """),format.raw/*38.11*/("""<div class="category">
              <div class="search">
                  <form action=""""),_display_(/*40.34*/routes/*40.40*/.ProductCtrl.listProducts(platformId)),format.raw/*40.77*/("""" class="text" method="GET">
                      <input type="search" id="searchbox" name="filter" value=""""),_display_(/*41.81*/filter),format.raw/*41.87*/("""" placeholder="Search for game...">
                      <input type="submit" id="searchsubmit" value="Search" class="searchbtn-sm ">
                  </form>
                    </div>
                    
                    <a href=""""),_display_(/*46.31*/routes/*46.37*/.ProductCtrl.listProducts(0)),format.raw/*46.65*/("""" class="btn btn-sm">All Platforms</a>
                    <br>
        """),_display_(/*48.10*/for(c <- categories) yield /*48.30*/ {_display_(Seq[Any](format.raw/*48.32*/("""
          """),format.raw/*49.11*/("""<a href=""""),_display_(/*49.21*/routes/*49.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*49.61*/("""" class="btn btn-sm">"""),_display_(/*49.83*/c/*49.84*/.getName),format.raw/*49.92*/("""
            """),format.raw/*50.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*50.59*/c/*50.60*/.getProducts().size),format.raw/*50.79*/("""</span>
          </a>
        """)))}),format.raw/*52.10*/("""
     
      """),format.raw/*54.7*/("""</div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*69.10*/if(flash.containsKey("success"))/*69.42*/ {_display_(Seq[Any](format.raw/*69.44*/("""
          """),format.raw/*70.11*/("""<div class="alert alert-success">
            """),_display_(/*71.14*/flash/*71.19*/.get("success")),format.raw/*71.34*/("""
          """),format.raw/*72.11*/("""</div>
        """)))}),format.raw/*73.10*/("""
       
        
      
        
        """),format.raw/*78.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*80.12*/for(p<-products) yield /*80.28*/ {_display_(Seq[Any](format.raw/*80.30*/("""
              """),format.raw/*81.15*/("""<a href=""""),_display_(/*81.25*/routes/*81.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*81.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*82.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*82.83*/ {_display_(Seq[Any](format.raw/*82.85*/("""
                    """),format.raw/*83.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*83.54*/(p.getId + ".png")),format.raw/*83.72*/("""" id="prodImg"/>
                """)))}/*84.19*/else/*84.24*/{_display_(Seq[Any](format.raw/*84.25*/("""
                    """),format.raw/*85.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*86.18*/("""
                  """),format.raw/*87.19*/("""<h4 id="prodName">"""),_display_(/*87.38*/p/*87.39*/.getName),format.raw/*87.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*89.40*/p/*89.41*/.getPrice),format.raw/*89.50*/("""</h4>
                 <p>
                    """),_display_(/*91.22*/for(c<-p.getCategories) yield /*91.45*/{_display_(Seq[Any](format.raw/*91.46*/("""
                      """),_display_(/*92.24*/c/*92.25*/.getName),format.raw/*92.33*/("""&nbsp;
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(user != null)/*94.38*/{_display_(Seq[Any](format.raw/*94.39*/("""
                      """),_display_(/*95.24*/if(user.isInstanceOf[models.users.Administrator])/*95.73*/{_display_(Seq[Any](format.raw/*95.74*/("""
                        """),_display_(/*96.26*/if(p.getStock > 0)/*96.44*/{_display_(Seq[Any](format.raw/*96.45*/("""
                          """),format.raw/*97.27*/("""<div id="prodStock">Stock: """),_display_(/*97.55*/p/*97.56*/.getStock),format.raw/*97.65*/("""</div>
                        """)))}/*98.27*/else/*98.32*/{_display_(Seq[Any](format.raw/*98.33*/("""
                          """),format.raw/*99.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*100.26*/("""
                      """)))}),format.raw/*101.24*/("""
                    """)))}),format.raw/*102.22*/("""
                    """),_display_(/*103.22*/if(user != null)/*103.38*/{_display_(Seq[Any](format.raw/*103.39*/("""
                      """),_display_(/*104.24*/if(user.isInstanceOf[models.users.Administrator])/*104.73*/{_display_(Seq[Any](format.raw/*104.74*/("""
                        """),format.raw/*105.25*/("""<div id="prodPegi">"""),_display_(/*105.45*/p/*105.46*/.getPegi),format.raw/*105.54*/("""</div>
                    """)))}/*106.22*/else/*106.26*/{_display_(Seq[Any](format.raw/*106.27*/("""
                      """),format.raw/*107.23*/("""<br><div id="prodPegi">"""),_display_(/*107.47*/p/*107.48*/.getPegi),format.raw/*107.56*/("""</div>
                    """)))}),format.raw/*108.22*/("""
                  """)))}/*109.20*/else/*109.24*/{_display_(Seq[Any](format.raw/*109.25*/("""
                    """),format.raw/*110.21*/("""<br><div id="prodPegi">"""),_display_(/*110.45*/p/*110.46*/.getPegi),format.raw/*110.54*/("""</div>
                  """)))}),format.raw/*111.20*/("""
                  """),format.raw/*112.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*118.18*/("""
              """),format.raw/*119.15*/("""</div>
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
                  DATE: Sun Apr 22 11:50:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/listProducts.scala.html
                  HASH: ad2e0222c119a1b166661ad9aa844bd27b505162
                  MATRIX: 651->1|690->35|728->68|1146->95|1394->247|1426->254|1451->271|1490->273|1520->277|1569->300|1583->306|1644->347|1762->438|1777->444|1817->463|1873->492|1888->498|1924->513|1964->526|2006->552|2046->554|2089->569|2121->574|2134->578|2163->586|2223->619|2236->623|2263->629|2293->632|2306->636|2335->644|2408->690|2421->694|2448->700|2498->723|2511->727|2538->733|2568->736|2581->740|2611->749|2655->762|2695->774|2809->861|2822->865|2849->871|2974->969|2999->985|3038->986|3080->1001|3138->1050|3177->1051|3221->1067|3350->1169|3365->1175|3416->1205|3616->1374|3660->1387|3700->1399|3820->1492|3835->1498|3893->1535|4030->1645|4057->1651|4328->1895|4343->1901|4392->1929|4494->2004|4530->2024|4570->2026|4610->2038|4647->2048|4662->2054|4717->2088|4766->2110|4776->2111|4805->2119|4847->2133|4920->2179|4930->2180|4970->2199|5035->2233|5077->2248|5268->2412|5309->2444|5349->2446|5389->2458|5464->2506|5478->2511|5514->2526|5554->2538|5602->2555|5676->2602|5814->2713|5846->2729|5886->2731|5930->2747|5967->2757|5982->2763|6039->2799|6128->2861|6200->2924|6240->2926|6290->2948|6350->2981|6389->2999|6443->3035|6456->3040|6495->3041|6545->3063|6654->3141|6702->3161|6748->3180|6758->3181|6787->3189|6880->3255|6890->3256|6920->3265|6997->3315|7036->3338|7075->3339|7127->3364|7137->3365|7166->3373|7226->3402|7276->3425|7301->3441|7340->3442|7392->3467|7450->3516|7489->3517|7543->3544|7570->3562|7609->3563|7665->3591|7720->3619|7730->3620|7760->3629|7812->3663|7825->3668|7864->3669|7920->3697|8013->3758|8070->3783|8125->3806|8176->3829|8202->3845|8242->3846|8295->3871|8354->3920|8394->3921|8449->3947|8497->3967|8508->3968|8538->3976|8587->4005|8601->4009|8641->4010|8694->4034|8746->4058|8757->4059|8787->4067|8848->4096|8889->4117|8903->4121|8943->4122|8994->4144|9046->4168|9057->4169|9087->4177|9146->4204|9195->4224|9339->4336|9384->4352
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|57->25|57->25|57->25|58->26|58->26|58->26|59->27|62->30|62->30|62->30|68->36|69->37|70->38|72->40|72->40|72->40|73->41|73->41|78->46|78->46|78->46|80->48|80->48|80->48|81->49|81->49|81->49|81->49|81->49|81->49|81->49|82->50|82->50|82->50|82->50|84->52|86->54|101->69|101->69|101->69|102->70|103->71|103->71|103->71|104->72|105->73|110->78|112->80|112->80|112->80|113->81|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|118->86|119->87|119->87|119->87|119->87|121->89|121->89|121->89|123->91|123->91|123->91|124->92|124->92|124->92|125->93|126->94|126->94|126->94|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|129->97|130->98|130->98|130->98|131->99|132->100|133->101|134->102|135->103|135->103|135->103|136->104|136->104|136->104|137->105|137->105|137->105|137->105|138->106|138->106|138->106|139->107|139->107|139->107|139->107|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|143->111|144->112|150->118|151->119
                  -- GENERATED --
              */
          