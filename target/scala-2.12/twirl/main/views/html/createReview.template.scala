
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
    """),format.raw/*8.5*/("""<link href=""""),_display_(/*8.18*/routes/*8.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.65*/("""" rel="stylesheet" />
    <p class="lead">Create a Review</p>
    """),_display_(/*10.6*/form(action=routes.CommunityCtrl.createReviewSubmit(prodId), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*10.146*/ {_display_(Seq[Any](format.raw/*10.148*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(reviewForm("content"), '_label -> "Content", 'class -> "form-control")),format.raw/*13.90*/("""
        

        """),format.raw/*16.9*/("""<div class="actions">
            <input type="submit" value="Add Reply" class="btn btn-primary">
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.CommunityCtrl.viewPost(prodId)),format.raw/*18.60*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*22.6*/("""
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
                  DATE: Wed Apr 18 18:55:10 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/createReview.scala.html
                  HASH: e036d9e04827cfa645c18bae046e48c68a348e6e
                  MATRIX: 651->1|689->34|734->74|1093->101|1225->163|1270->160|1298->180|1326->183|1361->210|1400->212|1432->218|1471->231|1485->237|1546->278|1641->347|1791->487|1832->489|1870->527|1908->538|1921->542|1952->552|1990->563|2091->643|2140->665|2289->787|2304->793|2356->824|2508->946
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|48->16|50->18|50->18|50->18|54->22
                  -- GENERATED --
              */
          