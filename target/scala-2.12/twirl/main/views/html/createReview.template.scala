
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
/*1.2*/import models.products.Product
/*2.2*/import models.community.ProductReview
/*3.2*/import models.users.User

object createReview extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[ProductReview],User,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(reviewForm: Form[ProductReview], user: User, prodId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.61*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Create a Reply",user)/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
    """),format.raw/*8.5*/("""<p class="lead">Create a Review</p>
    """),_display_(/*9.6*/form(action=routes.CommunityCtrl.createReviewSubmit(prodId), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*9.146*/ {_display_(Seq[Any](format.raw/*9.148*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),_display_(/*12.10*/inputText(reviewForm("content"), '_label -> "Content", 'class -> "form-control")),format.raw/*12.90*/("""
        

        """),format.raw/*15.9*/("""<div class="actions">
            <input type="submit" value="Add Reply" class="btn btn-primary">
            <a href=""""),_display_(/*17.23*/routes/*17.29*/.CommunityCtrl.viewPost(prodId)),format.raw/*17.60*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*21.6*/("""
""")))}))
      }
    }
  }

  def render(reviewForm:Form[ProductReview],user:User,prodId:Long): play.twirl.api.HtmlFormat.Appendable = apply(reviewForm,user,prodId)

  def f:((Form[ProductReview],User,Long) => play.twirl.api.HtmlFormat.Appendable) = (reviewForm,user,prodId) => apply(reviewForm,user,prodId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 16:31:41 IST 2018
                  SOURCE: /home/wdd/Downloads/SemesterCA-master/app/views/createReview.scala.html
                  HASH: 2ddcf7c58645651bf96a413bb6f451b592f7127c
                  MATRIX: 651->1|689->33|734->72|1093->98|1225->159|1270->157|1297->175|1324->177|1359->204|1398->206|1429->211|1495->252|1644->392|1684->394|1721->431|1758->441|1771->445|1802->455|1839->465|1940->545|1986->564|2133->684|2148->690|2200->721|2348->839
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|47->15|49->17|49->17|49->17|53->21
                  -- GENERATED --
              */
          