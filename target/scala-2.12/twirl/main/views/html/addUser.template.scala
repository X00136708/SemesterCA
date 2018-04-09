
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add User",user)/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new User</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.CommunityCtrl.addUserSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(userForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*13.86*/("""
        """),_display_(/*14.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.84*/("""
        """),_display_(/*15.10*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*15.94*/("""
    """)))}),format.raw/*16.6*/("""
        """),format.raw/*17.9*/("""<div class="actions">
            <input type="submit" value="Add User" class="btn btn-primary">
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.ProductCtrl.listProducts(0)),format.raw/*19.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    
</div>
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 20:52:28 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/addUser.scala.html
                  HASH: 261b29c30b343f29cfa1773fac898f0f4057ad8e
                  MATRIX: 985->1|1118->64|1163->61|1191->81|1219->84|1248->105|1287->107|1319->113|1413->182|1569->329|1609->331|1647->369|1685->380|1698->384|1729->394|1767->405|1864->481|1902->492|1997->566|2035->577|2140->661|2177->668|2214->678|2362->799|2377->805|2426->833
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|48->16|49->17|51->19|51->19|51->19
                  -- GENERATED --
              */
          