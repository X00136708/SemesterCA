
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
    """),format.raw/*8.5*/("""<link href=""""),_display_(/*8.18*/routes/*8.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.65*/("""" rel="stylesheet" />
    <p class="lead">Add a new product</p>
    """),_display_(/*10.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*10.141*/ {_display_(Seq[Any](format.raw/*10.143*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),format.raw/*14.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in -->
        <!-- form object using catSelect defined in Product  -->
        """),_display_(/*19.10*/for((value, name) <- Category.options) yield /*19.48*/ {_display_(Seq[Any](format.raw/*19.50*/("""
            """),format.raw/*20.13*/("""<div class="platformSelect">
            <input type="checkbox" name="catSelect[]" value=""""),_display_(/*21.63*/value),format.raw/*21.68*/("""" 
            
            />"""),_display_(/*23.16*/name),format.raw/*23.20*/("""<br>  
            </div>
                  
        """)))}),format.raw/*26.10*/("""
        """),format.raw/*27.9*/("""<br>
        <div class="textInputFields">
        """),_display_(/*29.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*29.99*/("""
        """),_display_(/*30.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*30.87*/("""
        """),_display_(/*31.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*31.87*/("""
        """),_display_(/*32.10*/select(
            productForm("pegi"), 
            options(Product.PEGIoptions), '_label -> "PEGI Rating", '_default -> "-- Choose a PEGI rating --", 
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*36.14*/("""
        """),format.raw/*37.9*/("""</div>
        <label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.ProductCtrl.listProducts(0)),format.raw/*43.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*47.6*/("""
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
                  DATE: Mon Apr 16 11:48:07 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/productAdmin/addProduct.scala.html
                  HASH: e29e0b0a1989d6d968a5a27e83268ace6f57264f
                  MATRIX: 664->1|703->34|741->66|1087->92|1200->134|1245->132|1272->150|1299->152|1331->176|1370->178|1401->183|1440->196|1454->202|1515->243|1610->312|1755->447|1796->449|1833->486|1870->496|1883->500|1914->510|1951->520|2047->595|2083->604|2494->988|2548->1026|2588->1028|2629->1041|2747->1132|2773->1137|2831->1168|2856->1172|2941->1226|2977->1235|3056->1287|3166->1376|3203->1386|3301->1463|3338->1473|3436->1550|3473->1560|3726->1792|3762->1801|4048->2060|4063->2066|4112->2094|4260->2212
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|51->19|51->19|51->19|52->20|53->21|53->21|55->23|55->23|58->26|59->27|61->29|61->29|62->30|62->30|63->31|63->31|64->32|68->36|69->37|75->43|75->43|75->43|79->47
                  -- GENERATED --
              */
          