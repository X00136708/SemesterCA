
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
"""),_display_(/*6.2*/main("Update Game", user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<link href=""""),_display_(/*7.18*/routes/*7.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.65*/("""" rel="stylesheet" />
<p class="lead"> Update Game</p>

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
            """),format.raw/*22.13*/("""<div class="platformSelect">
            <input type="checkbox" name="catSelect[]" value=""""),_display_(/*23.63*/value),format.raw/*23.68*/(""""
            """),_display_(/*24.14*/if(Category.inCategory(value.toLong, id))/*24.55*/ {_display_(Seq[Any](format.raw/*24.57*/("""
                """),format.raw/*25.17*/("""checked
            """)))}),format.raw/*26.14*/("""
            """),format.raw/*27.13*/("""/>"""),_display_(/*27.16*/name),format.raw/*27.20*/("""<br>        
        """)))}),format.raw/*28.10*/("""  

    """),_display_(/*30.6*/inputText(updateProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*30.89*/("""
    """),_display_(/*31.6*/inputText(updateProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*31.89*/("""
    """),_display_(/*32.6*/select(
            updateProductForm("pegi"), 
            options(Product.PEGIoptions), '_label -> "PEGI Rating", '_default -> "-- Choose a PEGI rating --", 
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*36.14*/("""
    
    """),format.raw/*38.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Product" class="btn-md btn-default btn">
        <a href=""""),_display_(/*44.19*/routes/*44.25*/.ProductCtrl.listProducts(0)),format.raw/*44.53*/("""">
            <button type="button" class="btn-md btn-default btn">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*48.3*/("""
""")))}),format.raw/*49.2*/("""
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
                  DATE: Sun Apr 22 12:16:18 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/productAdmin/updateProduct.scala.html
                  HASH: d9dc94951bdf31e50dde92f6a872b05d23460578
                  MATRIX: 664->1|702->34|741->68|1095->95|1224->154|1269->151|1297->172|1330->197|1368->198|1400->204|1439->217|1453->223|1514->264|1600->324|1751->466|1791->468|1825->502|1858->509|1871->513|1902->523|1935->530|2037->611|2070->618|2187->713|2224->723|2640->1112|2694->1150|2734->1152|2776->1166|2895->1258|2921->1263|2964->1279|3014->1320|3054->1322|3100->1340|3153->1362|3195->1376|3225->1379|3250->1383|3304->1406|3341->1417|3445->1500|3478->1507|3582->1590|3615->1597|3878->1839|3917->1851|4181->2088|4196->2094|4245->2122|4389->2236|4422->2239
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|42->10|43->11|43->11|44->12|45->13|45->13|45->13|46->14|46->14|47->15|47->15|48->16|53->21|53->21|53->21|54->22|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|59->27|59->27|60->28|62->30|62->30|63->31|63->31|64->32|68->36|70->38|76->44|76->44|76->44|80->48|81->49
                  -- GENERATED --
              */
          