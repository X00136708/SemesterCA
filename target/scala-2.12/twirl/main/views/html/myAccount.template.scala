
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
/*1.2*/import models.products.Product
/*2.2*/import models.users.RegisteredUser

object myAccount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RegisteredUser,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(u: RegisteredUser,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.47*/("""


"""),_display_(/*6.2*/main("Game", u)/*6.17*/ {_display_(Seq[Any](format.raw/*6.19*/("""
  """),format.raw/*7.3*/("""<link href=""""),_display_(/*7.16*/routes/*7.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.63*/("""" rel="stylesheet" />
  <div class="col-sm-4"></div>
  <div class="col-sm-4">
      <table class="table table-bordered table-hover table-condensed">
        """),_display_(/*11.10*/if(flash.containsKey("success"))/*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
          """),format.raw/*12.11*/("""<div class="alert alert-success">
            """),_display_(/*13.14*/flash/*13.19*/.get("success")),format.raw/*13.34*/("""
          """),format.raw/*14.11*/("""</div>
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""<div class="list-group">
            <div class="list-group-item" id="myAccount">

                    <h2>"""),_display_(/*19.26*/u/*19.27*/.getName),format.raw/*19.35*/("""</h2>

                    """),_display_(/*21.22*/if(u.getStreet1 != null)/*21.46*/{_display_(Seq[Any](format.raw/*21.47*/("""
                        """),format.raw/*22.25*/("""<div id="userDetails">
                            <h5><b>Address: </b><br>
                               """),_display_(/*24.33*/u/*24.34*/.getStreet1),format.raw/*24.45*/("""<br>
                               """),_display_(/*25.33*/u/*25.34*/.getStreet2),format.raw/*25.45*/("""</h5>
              
                            <h5><b>Town: </b><br>
                              """),_display_(/*28.32*/u/*28.33*/.getTown),format.raw/*28.41*/("""</h5>
              
                            <h5><b>PostCode: </b><br> 
                              """),_display_(/*31.32*/u/*31.33*/.getPostCode),format.raw/*31.45*/("""</h5><br>
                              </div>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""<div id="userDetails">
                            <h5><b>Address: </b><br>
                               N/A<br>
                               N/A</h5>
              
                            <h5><b>Town: </b><br>
                                N/A</h5>
              
                            <h5><b>PostCode: </b><br> 
                                N/A<h5><br>
                              </div>
                    """)))}),format.raw/*45.22*/("""
                
        
                    
        
                """),format.raw/*50.17*/("""<div id="userOptions">
                        <br>
                    <a href=""""),_display_(/*52.31*/controllers/*52.42*/.routes.ShoppingCtrl.viewOrders(u.getEmail())),format.raw/*52.87*/(""""  class="btn btn-default btn-xs">Orders <span class="badge badge-pill badge-primary">"""),_display_(/*52.174*/u/*52.175*/.getOrders().size),format.raw/*52.192*/("""</span></a><br>
                        <br>
                    <a href=""""),_display_(/*54.31*/routes/*54.37*/.CommunityCtrl.updateUser(u.getEmail())),format.raw/*54.76*/(""""  class="btn btn-default btn-xs">Update Details</a><br>
                </div>
                
                

            </div>
            </div> 

    </div>
</div>
</div>
""")))}))
      }
    }
  }

  def render(u:RegisteredUser,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(u,env)

  def f:((RegisteredUser,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (u,env) => apply(u,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 11:50:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/myAccount.scala.html
                  HASH: cc4d91ab4d780503108ae49706b2f08fe7fe3b42
                  MATRIX: 651->1|689->34|1061->71|1201->116|1233->123|1256->138|1295->140|1325->144|1364->157|1378->163|1439->204|1628->366|1669->398|1709->400|1749->412|1824->460|1838->465|1874->480|1914->492|1962->509|1999->519|2137->630|2147->631|2176->639|2233->669|2266->693|2305->694|2359->720|2496->830|2506->831|2538->842|2603->880|2613->881|2645->892|2777->997|2787->998|2816->1006|2953->1116|2963->1117|2996->1129|3085->1200|3098->1205|3137->1206|3191->1232|3666->1676|3772->1754|3883->1838|3903->1849|3969->1894|4084->1981|4095->1982|4134->1999|4238->2076|4253->2082|4313->2121
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|39->7|39->7|39->7|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|51->19|51->19|51->19|53->21|53->21|53->21|54->22|56->24|56->24|56->24|57->25|57->25|57->25|60->28|60->28|60->28|63->31|63->31|63->31|65->33|65->33|65->33|66->34|77->45|82->50|84->52|84->52|84->52|84->52|84->52|84->52|86->54|86->54|86->54
                  -- GENERATED --
              */
          