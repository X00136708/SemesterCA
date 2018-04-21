
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
/*1.2*/import models.users.User
/*2.2*/import models.users.Login

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(loginForm: Form[Login], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.38*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Login", user)/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""<link href=""""),_display_(/*7.18*/routes/*7.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.65*/("""" rel="stylesheet" />
 
    <div class="col-xs-5">
        <h3>Sign in</h3>
        """),_display_(/*11.10*/if(loginForm.hasGlobalErrors)/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
            """),format.raw/*12.13*/("""<p class="alert alert-warning">
                """),_display_(/*13.18*/loginForm/*13.27*/.globalError.message),format.raw/*13.47*/(""";
            </p>
        """)))}),format.raw/*15.10*/("""
        """),_display_(/*16.10*/if(flash.containsKey("error"))/*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
            """),format.raw/*17.13*/("""<p class="alert alert-warning">
                """),_display_(/*18.18*/flash/*18.23*/.get("loginRequired")),format.raw/*18.44*/("""
            """),format.raw/*19.13*/("""</p>
        """)))}),format.raw/*20.10*/("""


        """),_display_(/*23.10*/helper/*23.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*23.74*/ {_display_(Seq[Any](format.raw/*23.76*/("""
            """),_display_(/*24.14*/CSRF/*24.18*/.formField),format.raw/*24.28*/("""

            """),format.raw/*26.13*/("""<div class="form-group">
                """),_display_(/*27.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*28.76*/("""
            """),format.raw/*29.13*/("""</div>
            <div class="form-group">
                """),_display_(/*31.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.79*/("""
            """),format.raw/*33.13*/("""</div>
            <div class="form-group">
                <label>Don't have an account? <a href=""""),_display_(/*35.57*/routes/*35.63*/.CommunityCtrl.addUser()),format.raw/*35.87*/("""">Sign Up</a></label><br>
                <input type="submit" value="Sign In" class="btn-md btn-default btn">
            </div>
        """)))}),format.raw/*38.10*/("""
    """),format.raw/*39.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[Login],User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Apr 21 16:05:18 BST 2018
                  SOURCE: C:/Users/brand/Desktop/new/SemesterCA/app/views/login.scala.html
                  HASH: 86487b9cc60da8d037b21f8a1a194281e0489ccf
                  MATRIX: 651->1|683->28|1023->56|1132->95|1177->92|1205->112|1233->115|1260->134|1299->136|1331->142|1370->155|1384->161|1445->202|1561->291|1599->320|1639->322|1681->336|1758->386|1776->395|1817->415|1878->445|1916->456|1955->486|1995->488|2037->502|2114->552|2128->557|2170->578|2212->592|2258->607|2300->622|2315->628|2382->686|2422->688|2464->703|2477->707|2508->717|2552->733|2622->776|2765->898|2807->912|2897->975|3050->1107|3092->1121|3221->1223|3236->1229|3281->1253|3454->1395|3487->1401
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|39->7|39->7|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|55->23|55->23|55->23|55->23|56->24|56->24|56->24|58->26|59->27|60->28|61->29|63->31|64->32|65->33|67->35|67->35|67->35|70->38|71->39
                  -- GENERATED --
              */
          