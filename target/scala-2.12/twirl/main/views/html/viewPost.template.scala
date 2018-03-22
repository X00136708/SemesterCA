
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
    </div>
  </div>
      <label>Replies:</label><br>
      <div class="list-group">
      """),_display_(/*32.8*/for(r <- p.getReplies) yield /*32.30*/{_display_(Seq[Any](format.raw/*32.31*/("""

        """),format.raw/*34.9*/("""<div class="list-group-item">
          """),_display_(/*35.12*/if(r.getAuthor != null)/*35.35*/{_display_(Seq[Any](format.raw/*35.36*/("""
            """),format.raw/*36.13*/("""<label>"""),_display_(/*36.21*/r/*36.22*/.getAuthor.getName),format.raw/*36.40*/("""</label><br>
          """)))}/*37.12*/else/*37.16*/{_display_(Seq[Any](format.raw/*37.17*/("""
            """),format.raw/*38.13*/("""<label>N/A</label><br>
          """)))}),format.raw/*39.12*/("""
          
          """),format.raw/*41.11*/("""<p>"""),_display_(/*41.15*/r/*41.16*/.getContent),format.raw/*41.27*/("""</p>
        </div>

      """)))}),format.raw/*44.8*/("""
    """),format.raw/*45.5*/("""</div>
    <p>
      <a href=""""),_display_(/*47.17*/routes/*47.23*/.CommunityCtrl.createReply(p.getId())),format.raw/*47.60*/("""">
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
                  DATE: Thu Mar 22 13:14:51 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/viewPost.scala.html
                  HASH: a237432f3f44dacd1a544077b3da1d2ec42a51b8
                  MATRIX: 651->1|692->36|1053->62|1199->113|1228->117|1258->139|1297->141|1328->146|1454->246|1495->278|1535->280|1571->289|1643->334|1657->339|1693->354|1729->363|1773->377|1807->384|1916->466|1926->467|1956->476|2002->495|2034->518|2073->519|2116->534|2151->542|2161->543|2200->561|2245->587|2258->591|2297->592|2340->607|2407->643|2448->657|2483->665|2493->666|2533->685|2594->719|2604->720|2636->731|2763->832|2801->854|2840->855|2877->865|2945->906|2977->929|3016->930|3057->943|3092->951|3102->952|3141->970|3184->994|3197->998|3236->999|3277->1012|3342->1046|3392->1068|3423->1072|3433->1073|3465->1084|3523->1112|3555->1117|3613->1148|3628->1154|3686->1191
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|57->25|57->25|57->25|57->25|59->27|59->27|59->27|64->32|64->32|64->32|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|71->39|73->41|73->41|73->41|73->41|76->44|77->45|79->47|79->47|79->47
                  -- GENERATED --
              */
          