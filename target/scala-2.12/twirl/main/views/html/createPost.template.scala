
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
/*1.2*/import models.community.ForumPost
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object createPost extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[ForumPost],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(postForm: Form[ForumPost], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.41*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Create a Post",user)/*7.28*/ {_display_(Seq[Any](format.raw/*7.30*/("""
    """),format.raw/*8.5*/("""<p class="lead">Create a Post</p>
    """),_display_(/*9.6*/form(action=routes.CommunityCtrl.createPostSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*9.138*/ {_display_(Seq[Any](format.raw/*9.140*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),_display_(/*12.10*/inputText(postForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*12.84*/("""
        """),_display_(/*13.10*/select(
            postForm("product.id"), 
            options(Product.options), '_label -> "Product", '_default -> "-- Choose a department --", 
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*17.14*/("""
        """),_display_(/*18.10*/inputText(postForm("content"), '_label -> "Content", 'class -> "form-control")),format.raw/*18.88*/("""

        """),format.raw/*20.9*/("""<div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.CommunityCtrl.forumPage(0)),format.raw/*22.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*26.6*/("""
""")))}))
      }
    }
  }

  def render(postForm:Form[ForumPost],user:User): play.twirl.api.HtmlFormat.Appendable = apply(postForm,user)

  def f:((Form[ForumPost],User) => play.twirl.api.HtmlFormat.Appendable) = (postForm,user) => apply(postForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 12:31:57 GMT 2018
                  SOURCE: /home/wdd/webapps/semesterca/app/views/createPost.scala.html
                  HASH: b071f4c724b6b00236f0d483577f4da1346c79c5
                  MATRIX: 651->1|692->36|730->68|1078->94|1190->135|1235->133|1262->151|1289->153|1323->179|1362->181|1393->186|1457->225|1598->357|1638->359|1675->396|1712->406|1725->410|1756->420|1793->430|1888->504|1925->514|2172->740|2209->750|2308->828|2345->838|2494->960|2509->966|2557->993|2705->1111
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|45->13|49->17|50->18|50->18|52->20|54->22|54->22|54->22|58->26
                  -- GENERATED --
              */
          