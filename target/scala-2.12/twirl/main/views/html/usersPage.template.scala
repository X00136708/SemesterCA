
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
                  DATE: Sun Apr 22 11:50:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/usersPage.scala.html
                  HASH: 92c70c7c3934bab1e990cf4d0b32f0c37bba6492
                  MATRIX: 987->1|1139->58|1169->63|1195->81|1234->83|1264->87|1303->100|1317->106|1378->147|1627->370|1668->402|1708->404|1745->414|1818->460|1832->465|1868->480|1905->490|1950->505|1985->513|2126->627|2151->643|2190->644|2232->659|2290->708|2329->709|2375->724|2419->737|2456->747|2548->812|2577->825|2617->827|2657->839|2707->862|2717->863|2746->871|2797->895|2807->896|2837->905|2888->929|2898->930|2942->953|2971->954|3008->964|3023->970|3081->1007|3261->1156|3296->1164|3376->1214
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|63->31|63->31|63->31|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|67->35|67->35|67->35|67->35|69->37|70->38|76->44
                  -- GENERATED --
              */
          