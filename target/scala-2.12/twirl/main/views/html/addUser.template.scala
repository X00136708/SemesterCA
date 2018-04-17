
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
            """),_display_(/*7.14*/if(flash.containsKey("success"))/*7.46*/ {_display_(Seq[Any](format.raw/*7.48*/("""
                """),format.raw/*8.17*/("""<div class="alert alert-success">
                    """),_display_(/*9.22*/flash/*9.27*/.get("success")),format.raw/*9.42*/("""
                """),format.raw/*10.17*/("""</div>
          """)))}),format.raw/*11.12*/("""
          """),_display_(/*12.12*/if(flash.containsKey("failure"))/*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""
              """),format.raw/*13.15*/("""<div class="alert alert-success">
                  """),_display_(/*14.20*/flash/*14.25*/.get("failure")),format.raw/*14.40*/("""
              """),format.raw/*15.15*/("""</div>
          """)))}),format.raw/*16.12*/(""" 

    """),_display_(/*18.6*/form(action=routes.CommunityCtrl.addUserSubmit(), 
    'class -> "form-horizontal")/*19.33*/{_display_(Seq[Any](format.raw/*19.34*/("""
        """),format.raw/*20.37*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""
        """),_display_(/*22.10*/inputText(userForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*22.86*/("""
        """),_display_(/*23.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*23.84*/("""
     
        """),_display_(/*25.10*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*25.94*/("""
        
        """),format.raw/*27.9*/("""<div class="actions">
            <input type="submit" value="Register" class="btn btn-primary">
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.CommunityCtrl.usersPage()),format.raw/*29.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*33.6*/("""
"""),format.raw/*34.1*/("""</div>
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
                  DATE: Tue Apr 17 21:10:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/addUser.scala.html
                  HASH: b80b38713af1a3bac91a4b96c69a2a53ba8b0818
                  MATRIX: 985->1|1118->64|1163->61|1191->81|1219->84|1248->105|1287->107|1319->113|1422->190|1462->222|1501->224|1546->242|1628->298|1641->303|1676->318|1722->336|1772->355|1812->368|1853->400|1893->402|1937->418|2018->472|2032->477|2068->492|2112->508|2162->527|2198->537|2291->621|2330->622|2368->660|2406->671|2419->675|2450->685|2488->696|2585->772|2623->783|2718->857|2763->875|2868->959|2915->979|3063->1100|3078->1106|3125->1132|3277->1254|3306->1256
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|50->18|51->19|51->19|52->20|53->21|53->21|53->21|54->22|54->22|55->23|55->23|57->25|57->25|59->27|61->29|61->29|61->29|65->33|66->34
                  -- GENERATED --
              */
          