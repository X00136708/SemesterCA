
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
/*1.2*/import models.products.Product
/*2.2*/import models.products.Category
/*3.2*/import models.users.User

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(id: Long, updateProductForm: Form[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.58*/("""
"""),_display_(/*6.2*/main("Update product", user)/*6.30*/{_display_(Seq[Any](format.raw/*6.31*/("""
"""),format.raw/*7.1*/("""<p class="lead"> Update Product</p>

"""),_display_(/*9.2*/form(action=routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),_display_(/*13.6*/inputText(updateProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.87*/("""
    """),_display_(/*14.6*/inputText(updateProductForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*14.101*/("""
        """),format.raw/*15.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in -->
        <!-- form object using catSelect defined in Product  -->
        """),_display_(/*20.10*/for((value, name) <- Category.options) yield /*20.48*/ {_display_(Seq[Any](format.raw/*20.50*/("""
            """),format.raw/*21.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*21.63*/value),format.raw/*21.68*/(""""
            """),_display_(/*22.14*/if(Category.inCategory(value.toLong, id))/*22.55*/ {_display_(Seq[Any](format.raw/*22.57*/("""
                """),format.raw/*23.17*/("""checked
            """)))}),format.raw/*24.14*/("""
            """),format.raw/*25.13*/("""/>"""),_display_(/*25.16*/name),format.raw/*25.20*/("""<br>        
        """)))}),format.raw/*26.10*/("""  

    """),_display_(/*28.6*/inputText(updateProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*28.89*/("""
    """),_display_(/*29.6*/inputText(updateProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*29.89*/("""
    """),_display_(/*30.6*/inputText(updateProductForm("pegi"), '_label -> "PEGI Rating", 'class -> "form-control")),format.raw/*30.94*/("""
    
    """),format.raw/*32.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*38.19*/routes/*38.25*/.ProductCtrl.listProducts(0)),format.raw/*38.53*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*42.3*/("""
""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 01 14:24:30 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productAdmin/updateProduct.scala.html
                  HASH: 28b5e933d35e4c2d37e45f10f51e4b3509187261
                  MATRIX: 664->1|702->34|741->68|1095->95|1224->154|1269->151|1297->172|1333->200|1371->201|1399->203|1464->243|1615->385|1655->387|1689->421|1722->428|1735->432|1766->442|1799->449|1901->530|1934->537|2051->632|2088->642|2504->1031|2558->1069|2598->1071|2640->1085|2717->1135|2743->1140|2786->1156|2836->1197|2876->1199|2922->1217|2975->1239|3017->1253|3047->1256|3072->1260|3126->1283|3163->1294|3267->1377|3300->1384|3404->1467|3437->1474|3546->1562|3585->1574|3842->1804|3857->1810|3906->1838|4043->1945|4076->1948
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|57->25|57->25|57->25|58->26|60->28|60->28|61->29|61->29|62->30|62->30|64->32|70->38|70->38|70->38|74->42|75->43
                  -- GENERATED --
              */
          