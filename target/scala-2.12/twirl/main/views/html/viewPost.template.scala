
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
/*2.2*/import models.users.User

object viewPost extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[ForumPost,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(p: ForumPost,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.53*/("""


"""),_display_(/*6.2*/main(p.getTitle, user)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""


  """),format.raw/*9.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*11.8*/if(flash.containsKey("success"))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
        """),format.raw/*14.9*/("""</div>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""<div class="list-group">
          <div class="list-group-item">
            <h3>"""),_display_(/*18.18*/p/*18.19*/.getTitle),format.raw/*18.28*/("""</h3>
            """),_display_(/*19.14*/if(p.getAuthor != null)/*19.37*/{_display_(Seq[Any](format.raw/*19.38*/("""
              """),format.raw/*20.15*/("""<label>"""),_display_(/*20.23*/p/*20.24*/.getAuthor.getName),format.raw/*20.42*/("""</label><br>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
              """),format.raw/*22.15*/("""<label>N/A</label><br>
            """)))}),format.raw/*23.14*/("""
      
      """),format.raw/*25.7*/("""<label>"""),_display_(/*25.15*/p/*25.16*/.getProduct.getName),format.raw/*25.35*/("""</label><br>
      <br>
      <p>"""),_display_(/*27.11*/p/*27.12*/.getContent),format.raw/*27.23*/("""</p><br>

      """),_display_(/*29.8*/if(user != null)/*29.24*/{_display_(Seq[Any](format.raw/*29.25*/("""
        """),_display_(/*30.10*/if("admin".equals(user.getRole()))/*30.44*/{_display_(Seq[Any](format.raw/*30.45*/("""
          """),format.raw/*31.11*/("""<a href=""""),_display_(/*31.21*/routes/*31.27*/.CommunityCtrl.deletePost(p.getId)),format.raw/*31.61*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();">Delete <span class="glyphicon glyphicon-trash"></span></a>
        """)))}),format.raw/*32.10*/("""
      """)))}),format.raw/*33.8*/("""

    """),format.raw/*35.5*/("""</div>
  </div>
      <label>Replies:</label><br>
      <div class="list-group">
      """),_display_(/*39.8*/for(r <- p.getReplies) yield /*39.30*/{_display_(Seq[Any](format.raw/*39.31*/("""

        """),format.raw/*41.9*/("""<div class="list-group-item">
          """),_display_(/*42.12*/if(r.getAuthor != null)/*42.35*/{_display_(Seq[Any](format.raw/*42.36*/("""
            """),format.raw/*43.13*/("""<label>"""),_display_(/*43.21*/r/*43.22*/.getAuthor.getName),format.raw/*43.40*/("""</label><br>
          """)))}/*44.12*/else/*44.16*/{_display_(Seq[Any](format.raw/*44.17*/("""
            """),format.raw/*45.13*/("""<label>N/A</label><br>
          """)))}),format.raw/*46.12*/("""
          
          """),format.raw/*48.11*/("""<p>"""),_display_(/*48.15*/r/*48.16*/.getContent),format.raw/*48.27*/("""</p>
          """),_display_(/*49.12*/if(user != null)/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
            """),_display_(/*50.14*/if("admin".equals(user.getRole()))/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""
              """),format.raw/*51.15*/("""<a href=""""),_display_(/*51.25*/routes/*51.31*/.CommunityCtrl.deleteReply(r.getId)),format.raw/*51.66*/(""""  class="btn btn-default btn-xs" onclick="return confirmDel();">Delete <span class="glyphicon glyphicon-trash"></span></a>
            """)))}),format.raw/*52.14*/("""
          """)))}),format.raw/*53.12*/("""
        """),format.raw/*54.9*/("""</div>

      """)))}),format.raw/*56.8*/("""
    """),format.raw/*57.5*/("""</div>
    <p>
      <a href=""""),_display_(/*59.17*/routes/*59.23*/.CommunityCtrl.createReply(p.getId())),format.raw/*59.60*/("""">
        <button class="btn btn-primary">Add a Reply</button>
      </a>
    </p>
    
  </div>
</div>
""")))}))
      }
    }
  }

  def render(p:ForumPost,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((ForumPost,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 16 11:48:06 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/viewPost.scala.html
                  HASH: 27bfd795fd355a07b02882a68368d96df27f61da
                  MATRIX: 651->1|692->36|1053->62|1199->113|1228->117|1258->139|1297->141|1328->146|1454->246|1495->278|1535->280|1571->289|1643->334|1657->339|1693->354|1729->363|1773->377|1807->384|1916->466|1926->467|1956->476|2002->495|2034->518|2073->519|2116->534|2151->542|2161->543|2200->561|2245->587|2258->591|2297->592|2340->607|2407->643|2448->657|2483->665|2493->666|2533->685|2594->719|2604->720|2636->731|2679->748|2704->764|2743->765|2780->775|2823->809|2862->810|2901->821|2938->831|2953->837|3008->871|3172->1004|3210->1012|3243->1018|3357->1106|3395->1128|3434->1129|3471->1139|3539->1180|3571->1203|3610->1204|3651->1217|3686->1225|3696->1226|3735->1244|3778->1268|3791->1272|3830->1273|3871->1286|3936->1320|3986->1342|4017->1346|4027->1347|4059->1358|4102->1374|4127->1390|4166->1391|4207->1405|4250->1439|4289->1440|4332->1455|4369->1465|4384->1471|4440->1506|4608->1643|4651->1655|4687->1664|4732->1679|4764->1684|4822->1715|4837->1721|4895->1758
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|57->25|57->25|57->25|57->25|59->27|59->27|59->27|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|63->31|64->32|65->33|67->35|71->39|71->39|71->39|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|84->52|85->53|86->54|88->56|89->57|91->59|91->59|91->59
                  -- GENERATED --
              */
          