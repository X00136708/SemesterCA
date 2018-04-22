
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
                  DATE: Sun Apr 22 16:36:01 IST 2018
                  SOURCE: /home/brandon/Documents/SemesterCA/app/views/productAdmin/updateProduct.scala.html
                  HASH: d801486531e86391f3606ced5566b24e62096d0b
                  MATRIX: 664->1|702->33|741->66|1095->92|1224->150|1269->148|1296->167|1329->192|1367->193|1398->198|1437->211|1451->217|1512->258|1595->315|1745->456|1785->458|1818->491|1850->497|1863->501|1894->511|1926->517|2028->598|2060->604|2177->699|2213->708|2624->1092|2678->1130|2718->1132|2759->1145|2877->1236|2903->1241|2945->1256|2995->1297|3035->1299|3080->1316|3132->1337|3173->1350|3203->1353|3228->1357|3281->1379|3316->1388|3420->1471|3452->1477|3556->1560|3588->1566|3847->1804|3884->1814|4142->2045|4157->2051|4206->2079|4346->2189|4378->2191
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|42->10|43->11|43->11|44->12|45->13|45->13|45->13|46->14|46->14|47->15|47->15|48->16|53->21|53->21|53->21|54->22|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|59->27|59->27|60->28|62->30|62->30|63->31|63->31|64->32|68->36|70->38|76->44|76->44|76->44|80->48|81->49
                  -- GENERATED --
              */
          