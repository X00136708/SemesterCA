
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
/*1.2*/import models.community.ForumReply
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object createReply extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[ForumReply],User,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(replyForm: Form[ForumReply], user: User, postId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.57*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Create a Reply",user)/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
    """),format.raw/*8.5*/("""<link href=""""),_display_(/*8.18*/routes/*8.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.65*/("""" rel="stylesheet" />
    <p class="lead">Create a Reply</p>
    """),_display_(/*10.6*/form(action=routes.CommunityCtrl.createReplySubmit(postId), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*10.145*/ {_display_(Seq[Any](format.raw/*10.147*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(replyForm("content"), '_label -> "Content", 'class -> "form-control")),format.raw/*13.89*/("""

        """),format.raw/*15.9*/("""<div class="actions">
            <input type="submit" value="Add Reply" class="btn btn-primary">
            <a href=""""),_display_(/*17.23*/routes/*17.29*/.CommunityCtrl.viewPost(postId)),format.raw/*17.60*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*21.6*/("""
""")))}))
      }
    }
  }

  def render(replyForm:Form[ForumReply],user:User,postId:Long): play.twirl.api.HtmlFormat.Appendable = apply(replyForm,user,postId)

  def f:((Form[ForumReply],User,Long) => play.twirl.api.HtmlFormat.Appendable) = (replyForm,user,postId) => apply(replyForm,user,postId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 09:20:24 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/createReply.scala.html
                  HASH: 19a3933dec464275a2a9fe477d798c4ba2c1a712
                  MATRIX: 651->1|693->37|731->69|1086->95|1214->152|1259->150|1286->168|1313->170|1348->197|1387->199|1418->204|1457->217|1471->223|1532->264|1624->330|1773->469|1814->471|1851->508|1888->518|1901->522|1932->532|1969->542|2069->621|2106->631|2253->751|2268->757|2320->788|2468->906
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|47->15|49->17|49->17|49->17|53->21
                  -- GENERATED --
              */
          