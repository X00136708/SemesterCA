
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
    """),format.raw/*8.5*/("""<link href=""""),_display_(/*8.18*/routes/*8.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.65*/("""" rel="stylesheet" />
    <p class="lead">Create a Post</p>
    """),_display_(/*10.6*/form(action=routes.CommunityCtrl.createPostSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*10.138*/ {_display_(Seq[Any](format.raw/*10.140*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(postForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*13.84*/("""
        """),_display_(/*14.10*/select(
            postForm("product.id"), 
            options(Product.options), '_label -> "Game", '_default -> "-- Choose a department --", 
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*18.14*/("""
        """),_display_(/*19.10*/inputText(postForm("content"), '_label -> "Content", 'class -> "form-control")),format.raw/*19.88*/("""

        """),format.raw/*21.9*/("""<div class="actions">
            <input type="submit" value="Post Thread" class="btn-md btn-default btn">
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.CommunityCtrl.forumPage(0)),format.raw/*23.56*/("""">
                <button type="button" class="btn-md btn-default btn">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*27.6*/("""
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
                  DATE: Fri Apr 20 19:14:34 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA /app/views/createPost.scala.html
                  HASH: 66e5e4142295c7d688ed069e557945da41aa1746
                  MATRIX: 651->1|692->36|730->68|1078->94|1190->135|1235->133|1262->151|1289->153|1323->179|1362->181|1393->186|1432->199|1446->205|1507->246|1598->311|1740->443|1781->445|1818->482|1855->492|1868->496|1899->506|1936->516|2031->590|2068->600|2312->823|2349->833|2448->911|2485->921|2641->1050|2656->1056|2704->1083|2859->1208
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|50->18|51->19|51->19|53->21|55->23|55->23|55->23|59->27
                  -- GENERATED --
              */
          