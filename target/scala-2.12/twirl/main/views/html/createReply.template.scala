
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
    """),format.raw/*8.5*/("""<p class="lead">Create a Reply</p>
    """),_display_(/*9.6*/form(action=routes.CommunityCtrl.createReplySubmit(postId), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*9.145*/ {_display_(Seq[Any](format.raw/*9.147*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),_display_(/*12.10*/inputText(replyForm("content"), '_label -> "Content", 'class -> "form-control")),format.raw/*12.89*/("""

        """),format.raw/*14.9*/("""<div class="actions">
            <input type="submit" value="Add Reply" class="btn btn-primary">
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.CommunityCtrl.viewPost(postId)),format.raw/*16.60*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*20.6*/("""
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
                  DATE: Fri Apr 13 15:47:12 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/createReply.scala.html
                  HASH: 8f5ab740ab24a1787b5da19346e6f5354a28ae84
                  MATRIX: 651->1|693->38|731->71|1086->98|1214->156|1259->153|1287->173|1315->176|1350->203|1389->205|1421->211|1487->252|1635->391|1675->393|1713->431|1751->442|1764->446|1795->456|1833->467|1933->546|1972->558|2121->680|2136->686|2188->717|2340->839
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|46->14|48->16|48->16|48->16|52->20
                  -- GENERATED --
              */
          