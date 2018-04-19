
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
                  DATE: Thu Apr 19 09:20:25 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/addUser.scala.html
                  HASH: 16f0512269115100b221683144890efc509e7342
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1246->102|1285->104|1316->109|1417->184|1457->216|1496->218|1540->235|1621->290|1634->295|1669->310|1714->327|1763->345|1802->357|1843->389|1883->391|1926->406|2006->459|2020->464|2056->479|2099->494|2148->512|2182->520|2274->603|2313->604|2350->641|2387->651|2400->655|2431->665|2468->675|2565->751|2602->761|2697->835|2740->851|2845->935|2890->953|3036->1072|3051->1078|3098->1104|3246->1222|3274->1223
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|50->18|51->19|51->19|52->20|53->21|53->21|53->21|54->22|54->22|55->23|55->23|57->25|57->25|59->27|61->29|61->29|61->29|65->33|66->34
                  -- GENERATED --
              */
          