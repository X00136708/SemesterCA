
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
    <p class="lead">Product Catalogue</p>
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
                  DATE: Fri Apr 20 14:49:32 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA/app/views/login.scala.html
                  HASH: f7c46c2d75c77f43a295dfa0e278f18922e9b66f
                  MATRIX: 651->1|683->27|1023->54|1132->92|1177->90|1204->108|1231->110|1258->129|1297->131|1328->136|1367->149|1381->155|1442->196|1594->321|1632->350|1672->352|1713->365|1789->414|1807->423|1848->443|1907->471|1944->481|1983->511|2023->513|2064->526|2140->575|2154->580|2196->601|2237->614|2282->628|2321->640|2336->646|2403->704|2443->706|2484->720|2497->724|2528->734|2570->748|2639->790|2781->911|2822->924|2910->985|3062->1116|3103->1129|3230->1229|3245->1235|3290->1259|3460->1398|3492->1403
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|39->7|39->7|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|55->23|55->23|55->23|55->23|56->24|56->24|56->24|58->26|59->27|60->28|61->29|63->31|64->32|65->33|67->35|67->35|67->35|70->38|71->39
                  -- GENERATED --
              */
          