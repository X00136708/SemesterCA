
package views.html.productAdmin

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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(productForm: Form[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.42*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Add Product",user)/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*9.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*9.141*/ {_display_(Seq[Any](format.raw/*9.143*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),_display_(/*12.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.85*/("""
        """),format.raw/*13.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in -->
        <!-- form object using catSelect defined in Product  -->
        """),_display_(/*18.10*/for((value, name) <- Category.options) yield /*18.48*/ {_display_(Seq[Any](format.raw/*18.50*/("""
            """),format.raw/*19.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*19.63*/value),format.raw/*19.68*/(""""
            
            />"""),_display_(/*21.16*/name),format.raw/*21.20*/("""<br>        
        """)))}),format.raw/*22.10*/("""
        """),_display_(/*23.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*23.99*/("""
        """),_display_(/*24.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*24.87*/("""
        """),_display_(/*25.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*25.87*/("""
        """),_display_(/*26.10*/inputText(productForm("pegi"), '_label -> "PEGI Rating", 'class -> "form-control")),format.raw/*26.92*/("""

        """),format.raw/*28.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*33.23*/routes/*33.29*/.ProductCtrl.listProducts(0)),format.raw/*33.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*37.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 25 22:21:52 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productAdmin/addProduct.scala.html
                  HASH: 18dc813d1d3972f93c55e01c34445387dae7cb82
                  MATRIX: 664->1|703->35|741->68|1087->95|1200->138|1245->135|1273->155|1301->158|1333->182|1372->184|1404->190|1473->234|1617->369|1657->371|1695->409|1733->420|1746->424|1777->434|1815->445|1911->520|1948->530|2364->919|2418->957|2458->959|2500->973|2577->1023|2603->1028|2662->1060|2687->1064|2741->1087|2779->1098|2889->1187|2927->1198|3025->1275|3063->1286|3161->1363|3199->1374|3302->1456|3341->1468|3617->1717|3632->1723|3681->1751|3833->1873
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|45->13|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|54->22|55->23|55->23|56->24|56->24|57->25|57->25|58->26|58->26|60->28|65->33|65->33|65->33|69->37
                  -- GENERATED --
              */
          