
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
                  DATE: Wed Mar 14 20:52:15 GMT 2018
                  SOURCE: /home/wdd/semesterca/app/views/productAdmin/updateProduct.scala.html
                  HASH: 1d85323814b849b94cf88276dbd3e36cf9204963
                  MATRIX: 664->1|702->33|741->66|1095->92|1224->150|1269->148|1296->167|1332->195|1370->196|1397->197|1460->235|1610->376|1650->378|1683->411|1715->417|1728->421|1759->431|1791->437|1893->518|1925->524|2042->619|2078->628|2489->1012|2543->1050|2583->1052|2624->1065|2701->1115|2727->1120|2769->1135|2819->1176|2859->1178|2904->1195|2956->1216|2997->1229|3027->1232|3052->1236|3105->1258|3140->1267|3244->1350|3276->1356|3380->1439|3412->1445|3521->1533|3558->1543|3809->1767|3824->1773|3873->1801|4006->1904|4038->1906
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|57->25|57->25|57->25|58->26|60->28|60->28|61->29|61->29|62->30|62->30|64->32|70->38|70->38|70->38|74->42|75->43
                  -- GENERATED --
              */
          