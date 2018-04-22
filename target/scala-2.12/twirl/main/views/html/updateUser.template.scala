
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

object updateUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[models.users.RegisteredUser],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, updateUserForm: Form[models.users.RegisteredUser], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.90*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update User",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Update User</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.CommunityCtrl.updateUserSubmit(id), 
    'class -> "form-horizontal")/*8.33*/{_display_(Seq[Any](format.raw/*8.34*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),_display_(/*12.10*/inputText(updateUserForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*12.92*/("""
        """),_display_(/*13.10*/inputText(updateUserForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.90*/("""
        """),_display_(/*14.10*/inputText(updateUserForm("street1"), '_label -> "Address Line 1", 'class -> "form-control")),format.raw/*14.101*/("""
        """),_display_(/*15.10*/inputText(updateUserForm("street2"), '_label -> "Address Line 2", 'class -> "form-control")),format.raw/*15.101*/("""
        """),_display_(/*16.10*/inputText(updateUserForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*16.88*/("""
        """),_display_(/*17.10*/inputText(updateUserForm("postCode"), '_label -> "Post Code", 'class -> "form-control")),format.raw/*17.97*/("""

        """),_display_(/*19.10*/inputPassword(updateUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.100*/("""

        """),format.raw/*21.9*/("""<div class="actions">
                <input type="submit" value="Update details" class="btn btn-primary">
                <a href=""""),_display_(/*23.27*/routes/*23.33*/.ProductCtrl.index()),format.raw/*23.53*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
            """)))}),format.raw/*27.14*/("""
        """)))}),format.raw/*28.10*/("""
        
        
        
"""),format.raw/*32.1*/("""</div>"""))
      }
    }
  }

  def render(id:String,updateUserForm:Form[models.users.RegisteredUser],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateUserForm,user)

  def f:((String,Form[models.users.RegisteredUser],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateUserForm,user) => apply(id,updateUserForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 16:36:00 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/updateUser.scala.html
                  HASH: 34ba038c57a220e1dbbd93bf498c8dcbfb4fafab
                  MATRIX: 1005->1|1166->91|1211->89|1238->107|1265->109|1297->133|1336->135|1367->140|1456->204|1552->292|1590->293|1626->330|1663->340|1676->344|1707->354|1745->365|1848->447|1885->457|1986->537|2023->547|2136->638|2173->648|2286->739|2323->749|2422->827|2459->837|2567->924|2605->935|2717->1025|2754->1035|2914->1168|2929->1174|2970->1194|3139->1332|3180->1342|3235->1370
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|40->8|40->8|41->9|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|51->19|51->19|53->21|55->23|55->23|55->23|59->27|60->28|64->32
                  -- GENERATED --
              */
          