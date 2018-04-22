
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

object usersPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("users",user)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<link href=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.63*/("""" rel="stylesheet" />
<p class="lead">Users Page</p>
<br>
<div class="row">
  <div class="col-sm-2">
  </div>
  
  <div class="col-sm-8">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*13.8*/if(flash.containsKey("success"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
        """),format.raw/*14.9*/("""<div class="alert alert-success">
          """),_display_(/*15.12*/flash/*15.17*/.get("success")),format.raw/*15.32*/("""
        """),format.raw/*16.9*/("""</div>
      """)))}),format.raw/*17.8*/("""
      """),format.raw/*18.7*/("""<thead>
        <tr>
          <th>Username</th>
          <th>Email</th>
          <th>Role</th>
          """),_display_(/*23.12*/if(user != null)/*23.28*/{_display_(Seq[Any](format.raw/*23.29*/("""
            """),_display_(/*24.14*/if(user.isInstanceOf[models.users.Administrator])/*24.63*/{_display_(Seq[Any](format.raw/*24.64*/("""
            """)))}),format.raw/*25.14*/("""
          """)))}),format.raw/*26.12*/("""
        """),format.raw/*27.9*/("""</tr>
      </thead>

      <tbody id="manageUser">
        """),_display_(/*31.10*/for(u<-users) yield /*31.23*/ {_display_(Seq[Any](format.raw/*31.25*/("""
          """),format.raw/*32.11*/("""<tr>
            <td>"""),_display_(/*33.18*/u/*33.19*/.getName),format.raw/*33.27*/("""</td>
            <td>"""),_display_(/*34.18*/u/*34.19*/.getEmail),format.raw/*34.28*/("""</td>
            <td>"""),_display_(/*35.18*/u/*35.19*/.getClass.getSimpleName),format.raw/*35.42*/(""" """),format.raw/*35.43*/("""<a href=""""),_display_(/*35.53*/routes/*35.59*/.CommunityCtrl.deleteUser(u.getEmail)),format.raw/*35.96*/(""""  class="btn btn-default btn-sm" onclick="return confirmDel();"><span class="glyphicon glyphicon-trash"></span></a></td>
          </tr>
        """)))}),format.raw/*37.10*/("""
      """),format.raw/*38.7*/("""</tbody>
    </table>
  </div>
  
 
</div>
""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(users:List[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 16:36:00 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/usersPage.scala.html
                  HASH: b330052b49b9fcdd990e28fc852eff6f8561560e
                  MATRIX: 987->1|1139->58|1167->61|1193->79|1232->81|1261->84|1300->97|1314->103|1375->144|1615->358|1656->390|1696->392|1732->401|1804->446|1818->451|1854->466|1890->475|1934->489|1968->496|2104->605|2129->621|2168->622|2209->636|2267->685|2306->686|2351->700|2394->712|2430->721|2518->782|2547->795|2587->797|2626->808|2675->830|2685->831|2714->839|2764->862|2774->863|2804->872|2854->895|2864->896|2908->919|2937->920|2974->930|2989->936|3047->973|3225->1120|3259->1127|3333->1171
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|63->31|63->31|63->31|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|67->35|67->35|67->35|67->35|69->37|70->38|76->44
                  -- GENERATED --
              */
          