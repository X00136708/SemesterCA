
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
    """),format.raw/*7.5*/("""<link href=""""),_display_(/*7.18*/routes/*7.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.65*/("""" rel="stylesheet" />
<p class="lead"> Update Product</p>

"""),_display_(/*10.2*/form(action=routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*11.51*/ {_display_(Seq[Any](format.raw/*11.53*/("""
    """),format.raw/*12.33*/("""
    """),_display_(/*13.6*/CSRF/*13.10*/.formField),format.raw/*13.20*/("""
    """),_display_(/*14.6*/inputText(updateProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.87*/("""
    """),_display_(/*15.6*/inputText(updateProductForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*15.101*/("""
        """),format.raw/*16.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in -->
        <!-- form object using catSelect defined in Product  -->
        """),_display_(/*21.10*/for((value, name) <- Category.options) yield /*21.48*/ {_display_(Seq[Any](format.raw/*21.50*/("""
            """),format.raw/*22.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*22.63*/value),format.raw/*22.68*/(""""
            """),_display_(/*23.14*/if(Category.inCategory(value.toLong, id))/*23.55*/ {_display_(Seq[Any](format.raw/*23.57*/("""
                """),format.raw/*24.17*/("""checked
            """)))}),format.raw/*25.14*/("""
            """),format.raw/*26.13*/("""/>"""),_display_(/*26.16*/name),format.raw/*26.20*/("""<br>        
        """)))}),format.raw/*27.10*/("""  

    """),_display_(/*29.6*/inputText(updateProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*29.89*/("""
    """),_display_(/*30.6*/inputText(updateProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*30.89*/("""
    """),_display_(/*31.6*/select(
            updateProductForm("pegi"), 
            options(Product.PEGIoptions), '_label -> "PEGI Rating", '_default -> "-- Choose a PEGI rating --", 
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*35.14*/("""
    
    """),format.raw/*37.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Product" class="btn-md btn-default btn">
        <a href=""""),_display_(/*43.19*/routes/*43.25*/.ProductCtrl.listProducts(0)),format.raw/*43.53*/("""">
            <button type="button" class="btn-md btn-default btn">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*47.3*/("""
""")))}),format.raw/*48.2*/("""
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
                  DATE: Fri Apr 20 14:49:33 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA/app/views/productAdmin/updateProduct.scala.html
                  HASH: 8e7039521cf65de0e1d028df458035cfe0f0ebd1
                  MATRIX: 664->1|702->33|741->66|1095->92|1224->150|1269->148|1296->167|1332->195|1370->196|1401->201|1440->214|1454->220|1515->261|1601->321|1751->462|1791->464|1824->497|1856->503|1869->507|1900->517|1932->523|2034->604|2066->610|2183->705|2219->714|2630->1098|2684->1136|2724->1138|2765->1151|2842->1201|2868->1206|2910->1221|2960->1262|3000->1264|3045->1281|3097->1302|3138->1315|3168->1318|3193->1322|3246->1344|3281->1353|3385->1436|3417->1442|3521->1525|3553->1531|3812->1769|3849->1779|4107->2010|4122->2016|4171->2044|4311->2154|4343->2156
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|42->10|43->11|43->11|44->12|45->13|45->13|45->13|46->14|46->14|47->15|47->15|48->16|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|57->25|58->26|58->26|58->26|59->27|61->29|61->29|62->30|62->30|63->31|67->35|69->37|75->43|75->43|75->43|79->47|80->48
                  -- GENERATED --
              */
          