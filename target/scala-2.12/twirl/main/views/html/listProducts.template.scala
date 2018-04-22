
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
    
      
      <div class="list-categories">
          """),_display_(/*16.12*/if(user != null)/*16.28*/{_display_(Seq[Any](format.raw/*16.29*/("""
            """),_display_(/*17.14*/if(user.isInstanceOf[models.users.Administrator])/*17.63*/{_display_(Seq[Any](format.raw/*17.64*/("""
              """),format.raw/*18.15*/("""<div class="adminProduct">
                 
                  <p>
                      <a href=""""),_display_(/*21.33*/routes/*21.39*/.AdminProductCtrl.addProduct()),format.raw/*21.69*/("""" class="btn btn-sm">Add a product
                      </a>
                      
                    </p>
                  
              </div>
            """)))}),format.raw/*27.14*/("""
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<div class="category">
              <div class="search">
                  <form action=""""),_display_(/*31.34*/routes/*31.40*/.ProductCtrl.listProducts(platformId)),format.raw/*31.77*/("""" class="text" method="GET">
                      <input type="search" id="searchbox" name="filter" value=""""),_display_(/*32.81*/filter),format.raw/*32.87*/("""" placeholder="Search for game...">
                      <input type="submit" id="searchsubmit" value="Search" class="searchbtn-sm ">
                  </form>
                    </div>
                    
                    <a href=""""),_display_(/*37.31*/routes/*37.37*/.ProductCtrl.listProducts(0)),format.raw/*37.65*/("""" class="btn btn-sm">All Platforms</a>
                    <br>
                    <div class="plat">
        """),_display_(/*40.10*/for(c <- categories) yield /*40.30*/ {_display_(Seq[Any](format.raw/*40.32*/("""
          """),format.raw/*41.11*/("""<a href=""""),_display_(/*41.21*/routes/*41.27*/.ProductCtrl.listProducts(c.getId)),format.raw/*41.61*/("""" class="btn btn-sm">"""),_display_(/*41.83*/c/*41.84*/.getName),format.raw/*41.92*/("""
            """),format.raw/*42.13*/("""<span class="badge badge-pill badge-primary">"""),_display_(/*42.59*/c/*42.60*/.getProducts().size),format.raw/*42.79*/("""</span>
          </a>
        """)))}),format.raw/*44.10*/("""
      """),format.raw/*45.7*/("""</div>    
     
      </div>
    </div>
        
      </div>

     
      

    

      

    </div>
    <div class="col-sm-1"></div>
    <div class="col-sm-6">
        """),_display_(/*62.10*/if(flash.containsKey("success"))/*62.42*/ {_display_(Seq[Any](format.raw/*62.44*/("""
          """),format.raw/*63.11*/("""<div class="alert alert-success">
            """),_display_(/*64.14*/flash/*64.19*/.get("success")),format.raw/*64.34*/("""
          """),format.raw/*65.11*/("""</div>
        """)))}),format.raw/*66.10*/("""
       
        
      
        
        """),format.raw/*71.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
      <div class="products">
          """),_display_(/*73.12*/for(p<-products) yield /*73.28*/ {_display_(Seq[Any](format.raw/*73.30*/("""
              """),format.raw/*74.15*/("""<a href=""""),_display_(/*74.25*/routes/*74.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*74.67*/("""" class="list-group-item"  id="prodItem">
                  """),_display_(/*75.20*/if(env.resource("public/images/" + p.getId + ".png").isDefined)/*75.83*/ {_display_(Seq[Any](format.raw/*75.85*/("""
                    """),format.raw/*76.21*/("""<img src="/assets/images/thumbs/"""),_display_(/*76.54*/(p.getId + ".png")),format.raw/*76.72*/("""" id="prodImg"/>
                """)))}/*77.19*/else/*77.24*/{_display_(Seq[Any](format.raw/*77.25*/("""
                    """),format.raw/*78.21*/("""<img src="/assets/images/thumbs/noImage.png" id="prodImg"/>
                """)))}),format.raw/*79.18*/("""
                  """),format.raw/*80.19*/("""<h4 id="prodName">"""),_display_(/*80.38*/p/*80.39*/.getName),format.raw/*80.47*/("""</h4>
                  
                  <h4 id="prodPrice">€"""),_display_(/*82.40*/p/*82.41*/.getPrice),format.raw/*82.50*/("""</h4>
                 <p>
                    """),_display_(/*84.22*/for(c<-p.getCategories) yield /*84.45*/{_display_(Seq[Any](format.raw/*84.46*/("""
                      """),_display_(/*85.24*/c/*85.25*/.getName),format.raw/*85.33*/("""&nbsp;
                    """)))}),format.raw/*86.22*/("""
                    """),_display_(/*87.22*/if(user != null)/*87.38*/{_display_(Seq[Any](format.raw/*87.39*/("""
                      """),_display_(/*88.24*/if(user.isInstanceOf[models.users.Administrator])/*88.73*/{_display_(Seq[Any](format.raw/*88.74*/("""
                        """),_display_(/*89.26*/if(p.getStock > 0)/*89.44*/{_display_(Seq[Any](format.raw/*89.45*/("""
                          """),format.raw/*90.27*/("""<div id="prodStock">Stock: """),_display_(/*90.55*/p/*90.56*/.getStock),format.raw/*90.65*/("""</div>
                        """)))}/*91.27*/else/*91.32*/{_display_(Seq[Any](format.raw/*91.33*/("""
                          """),format.raw/*92.27*/("""<div id="prodStock">Sold Out</div>
                        """)))}),format.raw/*93.26*/("""
                      """)))}),format.raw/*94.24*/("""
                    """)))}),format.raw/*95.22*/("""
                    """),_display_(/*96.22*/if(user != null)/*96.38*/{_display_(Seq[Any](format.raw/*96.39*/("""
                      """),_display_(/*97.24*/if(user.isInstanceOf[models.users.Administrator])/*97.73*/{_display_(Seq[Any](format.raw/*97.74*/("""
                        """),format.raw/*98.25*/("""<div id="prodPegi">"""),_display_(/*98.45*/p/*98.46*/.getPegi),format.raw/*98.54*/("""</div>
                    """)))}/*99.22*/else/*99.26*/{_display_(Seq[Any](format.raw/*99.27*/("""
                      """),format.raw/*100.23*/("""<br><div id="prodPegi">"""),_display_(/*100.47*/p/*100.48*/.getPegi),format.raw/*100.56*/("""</div>
                    """)))}),format.raw/*101.22*/("""
                  """)))}/*102.20*/else/*102.24*/{_display_(Seq[Any](format.raw/*102.25*/("""
                    """),format.raw/*103.21*/("""<br><div id="prodPegi">"""),_display_(/*103.45*/p/*103.46*/.getPegi),format.raw/*103.54*/("""</div>
                  """)))}),format.raw/*104.20*/("""
                  """),format.raw/*105.19*/("""</p>
                  
                  </a>
             
            
              
                """)))}),format.raw/*111.18*/("""
              """),format.raw/*112.15*/("""</div>
            </div>
          </div>
          <div class="col-sm-2"></div>
          <div id="vote" class="col-sm-2 list-group">
              <form action=""""),_display_(/*117.30*/routes/*117.36*/.CommunityCtrl.vote),format.raw/*117.55*/("""" method="POST">
                  <div id="voteHead">
                      <li class="list-group-item">Vote on your favourite console!</li>
                    </div>
                  """),_display_(/*121.20*/helper/*121.26*/.CSRF.formField),format.raw/*121.41*/("""
                  """),_display_(/*122.20*/for(item <- poll.getItems) yield /*122.46*/ {_display_(Seq[Any](format.raw/*122.48*/("""
                    
                     """),format.raw/*124.22*/("""<div class="list-group-item" for=""""),_display_(/*124.57*/item/*124.61*/.getId),format.raw/*124.67*/("""">"""),_display_(/*124.70*/item/*124.74*/.getItem),format.raw/*124.82*/("""&nbsp;
                    <input name="item" id=""""),_display_(/*125.45*/item/*125.49*/.getId),format.raw/*125.55*/("""" type="radio" value=""""),_display_(/*125.78*/item/*125.82*/.getId),format.raw/*125.88*/("""">&nbsp;
                    <span class="badge badge-pill badge-primary">"""),_display_(/*126.67*/item/*126.71*/.getVotes),format.raw/*126.80*/("""</span></div>
                  
                  """)))}),format.raw/*128.20*/("""
                  """),format.raw/*129.19*/("""<div id="voteButton">
                  <input type="submit" value="Vote">
                  <input type="text" name="pollId" value=""""),_display_(/*131.60*/poll/*131.64*/.getId),format.raw/*131.70*/("""" style="display: none;"></div>
               </form>
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
                  DATE: Sun Apr 22 17:22:24 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/listProducts.scala.html
                  HASH: 5a5de881cd5fecbbaaf446174834caf3f086bd4e
                  MATRIX: 651->1|690->34|728->66|1146->92|1394->244|1423->248|1448->265|1487->267|1516->270|1564->292|1578->298|1639->339|1791->464|1816->480|1855->481|1896->495|1954->544|1993->545|2036->560|2162->659|2177->665|2228->695|2422->858|2465->870|2504->881|2622->972|2637->978|2695->1015|2831->1124|2858->1130|3124->1369|3139->1375|3188->1403|3327->1515|3363->1535|3403->1537|3442->1548|3479->1558|3494->1564|3549->1598|3598->1620|3608->1621|3637->1629|3678->1642|3751->1688|3761->1689|3801->1708|3864->1740|3898->1747|4097->1919|4138->1951|4178->1953|4217->1964|4291->2011|4305->2016|4341->2031|4380->2042|4427->2058|4496->2100|4632->2209|4664->2225|4704->2227|4747->2242|4784->2252|4799->2258|4856->2294|4944->2355|5016->2418|5056->2420|5105->2441|5165->2474|5204->2492|5257->2527|5270->2532|5309->2533|5358->2554|5466->2631|5513->2650|5559->2669|5569->2670|5598->2678|5689->2742|5699->2743|5729->2752|5804->2800|5843->2823|5882->2824|5933->2848|5943->2849|5972->2857|6031->2885|6080->2907|6105->2923|6144->2924|6195->2948|6253->2997|6292->2998|6345->3024|6372->3042|6411->3043|6466->3070|6521->3098|6531->3099|6561->3108|6612->3141|6625->3146|6664->3147|6719->3174|6810->3234|6865->3258|6918->3280|6967->3302|6992->3318|7031->3319|7082->3343|7140->3392|7179->3393|7232->3418|7279->3438|7289->3439|7318->3447|7365->3475|7378->3479|7417->3480|7469->3503|7521->3527|7532->3528|7562->3536|7622->3564|7662->3584|7676->3588|7716->3589|7766->3610|7818->3634|7829->3635|7859->3643|7917->3669|7965->3688|8103->3794|8147->3809|8340->3974|8356->3980|8397->3999|8613->4187|8629->4193|8666->4208|8714->4228|8757->4254|8798->4256|8870->4299|8933->4334|8947->4338|8975->4344|9006->4347|9020->4351|9050->4359|9129->4410|9143->4414|9171->4420|9222->4443|9236->4447|9264->4453|9367->4528|9381->4532|9412->4541|9496->4593|9544->4612|9706->4746|9720->4750|9748->4756
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|48->16|48->16|48->16|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|60->28|61->29|63->31|63->31|63->31|64->32|64->32|69->37|69->37|69->37|72->40|72->40|72->40|73->41|73->41|73->41|73->41|73->41|73->41|73->41|74->42|74->42|74->42|74->42|76->44|77->45|94->62|94->62|94->62|95->63|96->64|96->64|96->64|97->65|98->66|103->71|105->73|105->73|105->73|106->74|106->74|106->74|106->74|107->75|107->75|107->75|108->76|108->76|108->76|109->77|109->77|109->77|110->78|111->79|112->80|112->80|112->80|112->80|114->82|114->82|114->82|116->84|116->84|116->84|117->85|117->85|117->85|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90|122->90|123->91|123->91|123->91|124->92|125->93|126->94|127->95|128->96|128->96|128->96|129->97|129->97|129->97|130->98|130->98|130->98|130->98|131->99|131->99|131->99|132->100|132->100|132->100|132->100|133->101|134->102|134->102|134->102|135->103|135->103|135->103|135->103|136->104|137->105|143->111|144->112|149->117|149->117|149->117|153->121|153->121|153->121|154->122|154->122|154->122|156->124|156->124|156->124|156->124|156->124|156->124|156->124|157->125|157->125|157->125|157->125|157->125|157->125|158->126|158->126|158->126|160->128|161->129|163->131|163->131|163->131
                  -- GENERATED --
              */
          