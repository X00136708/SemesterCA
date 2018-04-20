
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
    
    """),format.raw/*9.5*/("""<link href=""""),_display_(/*9.18*/routes/*9.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.65*/("""" rel="stylesheet" />
    <p class="lead">Add a new product</p>
    """),_display_(/*11.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*11.141*/ {_display_(Seq[Any](format.raw/*11.143*/("""
        """),format.raw/*12.37*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),_display_(/*14.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.85*/("""
        """),format.raw/*15.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in -->
        <!-- form object using catSelect defined in Product  -->
        """),_display_(/*20.10*/for((value, name) <- Category.options) yield /*20.48*/ {_display_(Seq[Any](format.raw/*20.50*/("""
            """),format.raw/*21.13*/("""<div class="platformSelect">
            <input type="checkbox" name="catSelect[]" value=""""),_display_(/*22.63*/value),format.raw/*22.68*/("""" 
            
            />"""),_display_(/*24.16*/name),format.raw/*24.20*/("""<br>  
            </div>
                  
        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""<br>
        <div class="textInputFields">
        """),_display_(/*30.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*30.99*/("""
        """),_display_(/*31.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*31.87*/("""
        """),_display_(/*32.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*32.87*/("""
        """),_display_(/*33.10*/select(
            productForm("pegi"), 
            options(Product.PEGIoptions), '_label -> "PEGI Rating", '_default -> "-- Choose a PEGI rating --", 
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*37.14*/("""
        """),format.raw/*38.9*/("""</div>
        <label>Image Upload</label>
        <input class="btn-sm btn-default btn" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn-md btn-default btn">
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.ProductCtrl.listProducts(0)),format.raw/*44.57*/("""">
                <button type="button" class="btn-md btn-default btn">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*48.6*/("""
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
                  DATE: Fri Apr 20 11:43:58 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productAdmin/addProduct.scala.html
                  HASH: aabc030534e6fea81fa23b4f1f4f353f334d7165
                  MATRIX: 664->1|703->35|741->68|1087->95|1200->138|1245->135|1273->155|1301->158|1333->182|1372->184|1410->196|1449->209|1463->215|1524->256|1621->327|1766->462|1807->464|1845->502|1883->513|1896->517|1927->527|1965->538|2061->613|2098->623|2514->1012|2568->1050|2608->1052|2650->1066|2769->1158|2795->1163|2855->1196|2880->1200|2968->1257|3005->1267|3086->1321|3196->1410|3234->1421|3332->1498|3370->1509|3468->1586|3506->1597|3763->1833|3800->1843|4103->2119|4118->2125|4167->2153|4326->2282
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|41->9|41->9|41->9|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|46->14|47->15|52->20|52->20|52->20|53->21|54->22|54->22|56->24|56->24|59->27|60->28|62->30|62->30|63->31|63->31|64->32|64->32|65->33|69->37|70->38|76->44|76->44|76->44|80->48
                  -- GENERATED --
              */
          