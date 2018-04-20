
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
                  DATE: Fri Apr 20 14:49:33 IST 2018
                  SOURCE: /home/wdd/webapps/SemesterCA/app/views/productAdmin/addProduct.scala.html
                  HASH: b6c34f0bbf20ca31ece24946e6d7a3ad4015f2ed
                  MATRIX: 664->1|703->34|741->66|1087->92|1200->134|1245->132|1272->150|1299->152|1331->176|1370->178|1406->188|1445->201|1459->207|1520->248|1615->317|1760->452|1801->454|1838->491|1875->501|1888->505|1919->515|1956->525|2052->600|2088->609|2499->993|2553->1031|2593->1033|2634->1046|2752->1137|2778->1142|2836->1173|2861->1177|2946->1231|2982->1240|3061->1292|3171->1381|3208->1391|3306->1468|3343->1478|3441->1555|3478->1565|3731->1797|3767->1806|4064->2076|4079->2082|4128->2110|4283->2235
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|41->9|41->9|41->9|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|46->14|47->15|52->20|52->20|52->20|53->21|54->22|54->22|56->24|56->24|59->27|60->28|62->30|62->30|63->31|63->31|64->32|64->32|65->33|69->37|70->38|76->44|76->44|76->44|80->48
                  -- GENERATED --
              */
          