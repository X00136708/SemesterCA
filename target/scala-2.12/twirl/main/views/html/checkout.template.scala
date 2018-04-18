
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

object checkout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.RegisteredUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registeredUser: models.users.RegisteredUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import play.api.Play.current
/*6.2*/import models.shopping._
/*7.2*/import models.products._


Seq[Any](format.raw/*1.47*/("""



"""),_display_(/*8.2*/helper/*8.8*/.form(action = helper.CSRF(routes.ShoppingCtrl.placeOrder()))/*8.69*/ {_display_(Seq[Any](format.raw/*8.71*/("""

"""),format.raw/*10.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*11.2*/main("Purchase", registeredUser)/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""

    """),format.raw/*13.5*/("""<link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
    
<div class="row">

	<div class="col-md-12">
		"""),_display_(/*18.4*/if(flash.containsKey("success"))/*18.36*/ {_display_(Seq[Any](format.raw/*18.38*/("""
			  """),format.raw/*19.6*/("""<div class="alert alert-success">
			      """),_display_(/*20.11*/flash/*20.16*/.get("success")),format.raw/*20.31*/("""
			  """),format.raw/*21.6*/("""</div>
        """)))}),format.raw/*22.10*/("""
        """),_display_(/*23.10*/if(flash.containsKey("failure"))/*23.42*/ {_display_(Seq[Any](format.raw/*23.44*/("""
            """),format.raw/*24.13*/("""<div class="alert alert-success">
                """),_display_(/*25.18*/flash/*25.23*/.get("failure")),format.raw/*25.38*/("""
            """),format.raw/*26.13*/("""</div>
        """)))}),format.raw/*27.10*/("""  
        

		"""),format.raw/*30.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Item Price</th>
				
                <th>Quantity</th>
                <th>Total</th>
             
			</tr>
			</thead>
			<tbody>
                """),_display_(/*43.18*/if(registeredUser.getBasket() != null)/*43.56*/ {_display_(Seq[Any](format.raw/*43.58*/("""
                    """),format.raw/*44.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*45.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*45.75*/ {_display_(Seq[Any](format.raw/*45.77*/("""
                    """),format.raw/*46.21*/("""<tr>
                        <td>"""),_display_(/*47.30*/i/*47.31*/.getProduct.getName),format.raw/*47.50*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getPrice))),format.raw/*48.64*/("""</td>
                        
                        <td>"""),_display_(/*50.30*/i/*50.31*/.getQuantity()),format.raw/*50.45*/("""</td>
                        <td>&euro; """),_display_(/*51.37*/("%.2f".format(i.getItemTotal))),format.raw/*51.68*/("""</td>
                       
                    </tr>
                    """)))}),format.raw/*54.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*55.16*/("""
              
			"""),format.raw/*57.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*61.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*61.125*/("""</strong></p>
            </div>  
            <div class="delivery">
                  
                <span class="badge">Delivery charge<p id="myLink"></p></span>
                </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                      <br>
                      <title>Delivery</title>
                      <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
                      <meta charset="utf-8">
                  
                    </head>
                    <body>
                      <div class="pac-card" id="pac-card">
                        <div>
                          <div id="title">
                            Enter your delivery address
                          </div>
                          <div id="type-selector" class="pac-controls">
                            
                  
                          </div>
                        </div>
                        <div id="pac-container">
                          <input id="pac-input" type="text"
                              placeholder="Enter your delivery postcode...">
                        </div>
                      </div>
                      <div id="map"></div>
                      <div id="infowindow-content">
                        <img src="" width="16" height="16" id="place-icon">
                        <span id="place-name"  class="title"></span><br>
                        <span id="place-address"></span>
                        
                      </div>
                  
                      <script>
                        // This example requires the Places library. Include the libraries=places
                        // parameter when you first load the API. For example:
                        // <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places">
                  
                        function initMap() """),format.raw/*106.44*/("""{"""),format.raw/*106.45*/("""
                          """),format.raw/*107.27*/("""var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*107.89*/("""{"""),format.raw/*107.90*/("""
                            """),format.raw/*108.29*/("""center: """),format.raw/*108.37*/("""{"""),format.raw/*108.38*/("""lat: 53.2906911, lng: -6.3632549"""),format.raw/*108.70*/("""}"""),format.raw/*108.71*/(""",
                            zoom: 13
                          """),format.raw/*110.27*/("""}"""),format.raw/*110.28*/(""");
                          var card = document.getElementById('pac-card');
                          var input = document.getElementById('pac-input');
                          
                        
                          
                          var types = document.getElementById('type-selector');
                          var strictBounds = document.getElementById('strict-bounds-selector');
                  
                          map.controls[google.maps.ControlPosition.TOP_RIGHT].push(card);
                  
                          var autocomplete = new google.maps.places.Autocomplete(input);
                  
                          // Bind the map's bounds (viewport) property to the autocomplete object,
                          // so that the autocomplete requests use the current map bounds for the
                          // bounds option in the request.
                          autocomplete.bindTo('bounds', map);
                  
                          var infowindow = new google.maps.InfoWindow();
                          var infowindowContent = document.getElementById('infowindow-content');
                          infowindow.setContent(infowindowContent);
                          var marker = new google.maps.Marker("""),format.raw/*131.63*/("""{"""),format.raw/*131.64*/("""
                            """),format.raw/*132.29*/("""map: map,
                            anchorPoint: new google.maps.Point(0, -29)
                          """),format.raw/*134.27*/("""}"""),format.raw/*134.28*/(""");
                  
                          autocomplete.addListener('place_changed', function() """),format.raw/*136.80*/("""{"""),format.raw/*136.81*/("""
                            """),format.raw/*137.29*/("""infowindow.close();
                            marker.setVisible(false);
                            var place = autocomplete.getPlace();
                            if (!place.geometry) """),format.raw/*140.50*/("""{"""),format.raw/*140.51*/("""
                              """),format.raw/*141.31*/("""// User entered the name of a Place that was not suggested and
                              // pressed the Enter key, or the Place Details request failed.
                              window.alert("No details available for input: '" + place.name + "'");
                              return;
                            """),format.raw/*145.29*/("""}"""),format.raw/*145.30*/("""
                  
                            """),format.raw/*147.29*/("""// If the place has a geometry, then present it on a map.
                            if (place.geometry.viewport) """),format.raw/*148.58*/("""{"""),format.raw/*148.59*/("""
                              """),format.raw/*149.31*/("""map.fitBounds(place.geometry.viewport);
                            """),format.raw/*150.29*/("""}"""),format.raw/*150.30*/(""" """),format.raw/*150.31*/("""else """),format.raw/*150.36*/("""{"""),format.raw/*150.37*/("""
                              """),format.raw/*151.31*/("""map.setCenter(place.geometry.location);
                              map.setZoom(17);  // Why 17? Because it looks good.
                            """),format.raw/*153.29*/("""}"""),format.raw/*153.30*/("""
                            """),format.raw/*154.29*/("""marker.setPosition(place.geometry.location);
                            marker.setVisible(true);
                  
                            var address = '';
                            if (place.address_components) """),format.raw/*158.59*/("""{"""),format.raw/*158.60*/("""
                              """),format.raw/*159.31*/("""address = [
                                (place.address_components[0] && place.address_components[0].short_name || ''),
                                (place.address_components[1] && place.address_components[1].short_name || ''),
                                (place.address_components[2] && place.address_components[2].short_name || '')
                              ].join(' ');
                            """),format.raw/*164.29*/("""}"""),format.raw/*164.30*/("""
                  
                            """),format.raw/*166.29*/("""infowindowContent.children['place-icon'].src = place.icon;
                            infowindowContent.children['place-name'].textContent = place.name;
                            infowindowContent.children['place-address'].textContent = address;
                  
                  
                              var location;
                              var deliveryCharge;
                             location= document.getElementById("place-address").innerText;
                            
                            
                            if ((location.includes("Dublin") ||
                                 location.includes("Kildare") ||
                                 location.includes("Mayo") ||
                                 location.includes("Kilkenny") ||
                                 location.includes("Meath") ||
                                 location.includes("Wicklow") ||
                                 location.includes("Waterford") ||
                                 location.includes("Donegal") ||
                                 location.includes("Kerry") ||
                                 location.includes("Clare") ||
                                 location.includes("Monaghan") ||
                                 location.includes("Cavan") ||
                                 location.includes("Galway") ||
                                 location.includes("Offaly") ||
                                 location.includes("Carlow") ||
                                 location.includes("Longford")||
                                 location.includes("Sligo") ||
                                 location.includes("Louth") ||
                                 location.includes("Wexford") ||
                                 location.includes("Tipperary") ||
                                 location.includes("Westmeath") ||
                                 location.includes("Leitrim") ||
                                 location.includes("Roscommon") ||
                                 location.includes("Cork") ||
                                 location.includes("Limerick") ||
                                 location.includes("Edenderry") ||
                                 location.includes("Laois")))"""),format.raw/*202.62*/("""{"""),format.raw/*202.63*/("""
                               
                                """),format.raw/*204.33*/("""deliveryCharge=0.0;
                                  
                  
                            """),format.raw/*207.29*/("""}"""),format.raw/*207.30*/("""
                            """),format.raw/*208.29*/("""else"""),format.raw/*208.33*/("""{"""),format.raw/*208.34*/("""
                             
                                """),format.raw/*210.33*/("""deliveryCharge=2.99;
                            """),format.raw/*211.29*/("""}"""),format.raw/*211.30*/("""
                            """),format.raw/*212.29*/("""console.log(location);
                            
                            document.getElementById("myLink").innerHTML="€"+deliveryCharge;
                            
                            location="";
                            infowindow.open(map, marker);
                          """),format.raw/*218.27*/("""}"""),format.raw/*218.28*/(""");
                  
                          // Sets a listener on a radio button to change the filter type on Places
                          // Autocomplete.
                          function setupClickListener(id, types) """),format.raw/*222.66*/("""{"""),format.raw/*222.67*/("""
                            """),format.raw/*223.29*/("""var radioButton = document.getElementById(id);
                            radioButton.addEventListener('click', function() """),format.raw/*224.78*/("""{"""),format.raw/*224.79*/("""
                              """),format.raw/*225.31*/("""autocomplete.setTypes(types);
                            """),format.raw/*226.29*/("""}"""),format.raw/*226.30*/(""");
                          """),format.raw/*227.27*/("""}"""),format.raw/*227.28*/("""
                  
                          """),format.raw/*229.27*/("""setupClickListener('changetype-all', []);
                          setupClickListener('changetype-address', ['address']);
                          setupClickListener('changetype-establishment', ['establishment']);
                          setupClickListener('changetype-geocode', ['geocode']);
                  
                          document.getElementById('use-strict-bounds')
                              .addEventListener('click', function() """),format.raw/*235.69*/("""{"""),format.raw/*235.70*/("""
                                """),format.raw/*236.33*/("""console.log('Checkbox clicked! New state=' + this.checked);
                                autocomplete.setOptions("""),format.raw/*237.57*/("""{"""),format.raw/*237.58*/("""strictBounds: this.checked"""),format.raw/*237.84*/("""}"""),format.raw/*237.85*/(""");
                              """),format.raw/*238.31*/("""}"""),format.raw/*238.32*/(""");
                        """),format.raw/*239.25*/("""}"""),format.raw/*239.26*/("""
                      """),format.raw/*240.23*/("""</script>
                  
                      <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA9CnC9zOefDQlSR-i2wqSNzsraFwjAlKk&libraries=places&callback=initMap"
                          async defer></script>
                    </body>
                      <form action=""""),_display_(/*245.38*/routes/*245.44*/.ShoppingCtrl.placeOrder()),format.raw/*245.70*/("""" method="POST">
                           
                        <script
                          src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                          data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                          data-amount=""""),_display_(/*250.41*/registeredUser/*250.55*/.getBasket.getBasketTotalPlus),format.raw/*250.84*/(""""
                          data-name="Nu-Wave Games"
                          data-description="Enter your payment details below"
                          data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                          data-locale="auto"
                          data-currency="eur">
                          <a href=""""),_display_(/*256.37*/routes/*256.43*/.ShoppingCtrl.placeOrder()),format.raw/*256.69*/("""" class="btn btn-success btn-sm"></a>
                        </script>
                        
                        
                      </form>
                    
            
                    
                   
                </p>
            </div>
            </div>
    

        
        </div>
    </div>
</div>
""")))}),format.raw/*274.2*/("""

""")))}))
      }
    }
  }

  def render(registeredUser:models.users.RegisteredUser): play.twirl.api.HtmlFormat.Appendable = apply(registeredUser)

  def f:((models.users.RegisteredUser) => play.twirl.api.HtmlFormat.Appendable) = (registeredUser) => apply(registeredUser)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 12:11:04 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/checkout.scala.html
                  HASH: 76f4786ead61eeae41fb751bc9ef384f230ba625
                  MATRIX: 972->1|1090->55|1126->86|1158->113|1212->46|1246->140|1259->146|1328->207|1367->209|1398->213|1471->260|1512->292|1552->294|1587->302|1627->315|1642->321|1704->362|1809->441|1850->473|1890->475|1924->482|1996->527|2010->532|2046->547|2080->554|2128->571|2166->582|2207->614|2247->616|2289->630|2368->682|2382->687|2418->702|2460->716|2508->733|2553->751|2878->1049|2925->1087|2965->1089|3015->1111|3126->1195|3195->1248|3235->1250|3285->1272|3347->1307|3357->1308|3397->1327|3467->1370|3515->1397|3604->1459|3614->1460|3649->1474|3719->1517|3771->1548|3882->1628|3954->1669|4002->1690|4183->1844|4261->1900|6334->3944|6364->3945|6421->3973|6512->4035|6542->4036|6601->4066|6638->4074|6668->4075|6729->4107|6759->4108|6855->4175|6885->4176|8216->5478|8246->5479|8305->5509|8443->5618|8473->5619|8605->5722|8635->5723|8694->5753|8914->5944|8944->5945|9005->5977|9360->6303|9390->6304|9469->6354|9614->6470|9644->6471|9705->6503|9803->6572|9833->6573|9863->6574|9897->6579|9927->6580|9988->6612|10169->6764|10199->6765|10258->6795|10512->7020|10542->7021|10603->7053|11052->7473|11082->7474|11161->7524|13498->9832|13528->9833|13624->9900|13758->10005|13788->10006|13847->10036|13880->10040|13910->10041|14004->10106|14083->10156|14113->10157|14172->10187|14505->10491|14535->10492|14797->10725|14827->10726|14886->10756|15040->10881|15070->10882|15131->10914|15219->10973|15249->10974|15308->11004|15338->11005|15415->11053|15905->11514|15935->11515|15998->11549|16144->11666|16174->11667|16229->11693|16259->11694|16322->11728|16352->11729|16409->11757|16439->11758|16492->11782|16821->12083|16837->12089|16885->12115|17199->12401|17223->12415|17274->12444|17669->12811|17685->12817|17733->12843|18117->13196
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|40->8|40->8|40->8|42->10|43->11|43->11|43->11|45->13|45->13|45->13|45->13|50->18|50->18|50->18|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|62->30|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|82->50|82->50|82->50|83->51|83->51|86->54|87->55|89->57|93->61|93->61|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|140->108|142->110|142->110|163->131|163->131|164->132|166->134|166->134|168->136|168->136|169->137|172->140|172->140|173->141|177->145|177->145|179->147|180->148|180->148|181->149|182->150|182->150|182->150|182->150|182->150|183->151|185->153|185->153|186->154|190->158|190->158|191->159|196->164|196->164|198->166|234->202|234->202|236->204|239->207|239->207|240->208|240->208|240->208|242->210|243->211|243->211|244->212|250->218|250->218|254->222|254->222|255->223|256->224|256->224|257->225|258->226|258->226|259->227|259->227|261->229|267->235|267->235|268->236|269->237|269->237|269->237|269->237|270->238|270->238|271->239|271->239|272->240|277->245|277->245|277->245|282->250|282->250|282->250|288->256|288->256|288->256|306->274
                  -- GENERATED --
              */
          