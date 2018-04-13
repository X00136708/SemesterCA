
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

"""),format.raw/*5.1*/("""<p class="lead">Users Page</p>
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
            """),_display_(/*24.14*/if(user.getRole() == "admin")/*24.43*/{_display_(Seq[Any](format.raw/*24.44*/("""
            """),format.raw/*25.13*/("""<th colspan="2">Edit</th>
            """)))}),format.raw/*26.14*/("""
          """)))}),format.raw/*27.12*/("""      
        """),format.raw/*28.9*/("""</tr>
      </thead>

      <tbody>
        """),_display_(/*32.10*/for(u<-users) yield /*32.23*/ {_display_(Seq[Any](format.raw/*32.25*/("""
          """),format.raw/*33.11*/("""<tr>
            <td>"""),_display_(/*34.18*/u/*34.19*/.getName),format.raw/*34.27*/("""</td>
            <td>"""),_display_(/*35.18*/u/*35.19*/.getEmail),format.raw/*35.28*/("""</td>
            <td>"""),_display_(/*36.18*/u/*36.19*/.getRole),format.raw/*36.27*/("""</td>
           
          </tr>
        """)))}),format.raw/*39.10*/("""
      """),format.raw/*40.7*/("""</tbody>
    </table>
  </div>
  
 
</div>
""")))}),format.raw/*46.2*/("""
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
                  DATE: Fri Apr 13 15:54:57 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/usersPage.scala.html
                  HASH: c2260fea24bbe47e7eccd1dc7f3cf532a6a0e071
                  MATRIX: 987->1|1139->58|1169->63|1195->81|1234->83|1264->87|1490->287|1531->319|1571->321|1608->331|1681->377|1695->382|1731->397|1768->407|1813->422|1848->430|1989->544|2014->560|2053->561|2095->576|2133->605|2172->606|2214->620|2285->660|2329->673|2372->689|2448->738|2477->751|2517->753|2557->765|2607->788|2617->789|2646->797|2697->821|2707->822|2737->831|2788->855|2798->856|2827->864|2904->910|2939->918|3019->968
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|60->28|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|71->39|72->40|78->46
                  -- GENERATED --
              */
          