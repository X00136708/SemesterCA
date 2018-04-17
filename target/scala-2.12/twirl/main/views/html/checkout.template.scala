
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
                  
                        function initMap() """),format.raw/*102.44*/("""{"""),format.raw/*102.45*/("""
                          """),format.raw/*103.27*/("""var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*103.89*/("""{"""),format.raw/*103.90*/("""
                            """),format.raw/*104.29*/("""center: """),format.raw/*104.37*/("""{"""),format.raw/*104.38*/("""lat: 53.2906911, lng: -6.3632549"""),format.raw/*104.70*/("""}"""),format.raw/*104.71*/(""",
                            zoom: 13
                          """),format.raw/*106.27*/("""}"""),format.raw/*106.28*/(""");
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
                          var marker = new google.maps.Marker("""),format.raw/*127.63*/("""{"""),format.raw/*127.64*/("""
                            """),format.raw/*128.29*/("""map: map,
                            anchorPoint: new google.maps.Point(0, -29)
                          """),format.raw/*130.27*/("""}"""),format.raw/*130.28*/(""");
                  
                          autocomplete.addListener('place_changed', function() """),format.raw/*132.80*/("""{"""),format.raw/*132.81*/("""
                            """),format.raw/*133.29*/("""infowindow.close();
                            marker.setVisible(false);
                            var place = autocomplete.getPlace();
                            if (!place.geometry) """),format.raw/*136.50*/("""{"""),format.raw/*136.51*/("""
                              """),format.raw/*137.31*/("""// User entered the name of a Place that was not suggested and
                              // pressed the Enter key, or the Place Details request failed.
                              window.alert("No details available for input: '" + place.name + "'");
                              return;
                            """),format.raw/*141.29*/("""}"""),format.raw/*141.30*/("""
                  
                            """),format.raw/*143.29*/("""// If the place has a geometry, then present it on a map.
                            if (place.geometry.viewport) """),format.raw/*144.58*/("""{"""),format.raw/*144.59*/("""
                              """),format.raw/*145.31*/("""map.fitBounds(place.geometry.viewport);
                            """),format.raw/*146.29*/("""}"""),format.raw/*146.30*/(""" """),format.raw/*146.31*/("""else """),format.raw/*146.36*/("""{"""),format.raw/*146.37*/("""
                              """),format.raw/*147.31*/("""map.setCenter(place.geometry.location);
                              map.setZoom(17);  // Why 17? Because it looks good.
                            """),format.raw/*149.29*/("""}"""),format.raw/*149.30*/("""
                            """),format.raw/*150.29*/("""marker.setPosition(place.geometry.location);
                            marker.setVisible(true);
                  
                            var address = '';
                            if (place.address_components) """),format.raw/*154.59*/("""{"""),format.raw/*154.60*/("""
                              """),format.raw/*155.31*/("""address = [
                                (place.address_components[0] && place.address_components[0].short_name || ''),
                                (place.address_components[1] && place.address_components[1].short_name || ''),
                                (place.address_components[2] && place.address_components[2].short_name || '')
                              ].join(' ');
                            """),format.raw/*160.29*/("""}"""),format.raw/*160.30*/("""
                  
                            """),format.raw/*162.29*/("""infowindowContent.children['place-icon'].src = place.icon;
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
                                 location.includes("Laois")))"""),format.raw/*198.62*/("""{"""),format.raw/*198.63*/("""
                               
                                """),format.raw/*200.33*/("""deliveryCharge=0.0;
                                  
                  
                            """),format.raw/*203.29*/("""}"""),format.raw/*203.30*/("""
                            """),format.raw/*204.29*/("""else"""),format.raw/*204.33*/("""{"""),format.raw/*204.34*/("""
                             
                                """),format.raw/*206.33*/("""deliveryCharge=2.99;
                            """),format.raw/*207.29*/("""}"""),format.raw/*207.30*/("""
                            """),format.raw/*208.29*/("""console.log(location);
                            
                            document.getElementById("myLink").innerHTML="€"+deliveryCharge;
                            
                            location="";
                            infowindow.open(map, marker);
                          """),format.raw/*214.27*/("""}"""),format.raw/*214.28*/(""");
                  
                          // Sets a listener on a radio button to change the filter type on Places
                          // Autocomplete.
                          function setupClickListener(id, types) """),format.raw/*218.66*/("""{"""),format.raw/*218.67*/("""
                            """),format.raw/*219.29*/("""var radioButton = document.getElementById(id);
                            radioButton.addEventListener('click', function() """),format.raw/*220.78*/("""{"""),format.raw/*220.79*/("""
                              """),format.raw/*221.31*/("""autocomplete.setTypes(types);
                            """),format.raw/*222.29*/("""}"""),format.raw/*222.30*/(""");
                          """),format.raw/*223.27*/("""}"""),format.raw/*223.28*/("""
                  
                          """),format.raw/*225.27*/("""setupClickListener('changetype-all', []);
                          setupClickListener('changetype-address', ['address']);
                          setupClickListener('changetype-establishment', ['establishment']);
                          setupClickListener('changetype-geocode', ['geocode']);
                  
                          document.getElementById('use-strict-bounds')
                              .addEventListener('click', function() """),format.raw/*231.69*/("""{"""),format.raw/*231.70*/("""
                                """),format.raw/*232.33*/("""console.log('Checkbox clicked! New state=' + this.checked);
                                autocomplete.setOptions("""),format.raw/*233.57*/("""{"""),format.raw/*233.58*/("""strictBounds: this.checked"""),format.raw/*233.84*/("""}"""),format.raw/*233.85*/(""");
                              """),format.raw/*234.31*/("""}"""),format.raw/*234.32*/(""");
                        """),format.raw/*235.25*/("""}"""),format.raw/*235.26*/("""
                      """),format.raw/*236.23*/("""</script>
                  
                      <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA9CnC9zOefDQlSR-i2wqSNzsraFwjAlKk&libraries=places&callback=initMap"
                          async defer></script>
                    </body>
                      <form action=""""),_display_(/*241.38*/routes/*241.44*/.ShoppingCtrl.placeOrder()),format.raw/*241.70*/("""" method="POST">
                           
                        <script
                          src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                          data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                          data-amount=""""),_display_(/*246.41*/registeredUser/*246.55*/.getBasket.getBasketTotalPlus),format.raw/*246.84*/(""""
                          data-name="Nu-Wave Games"
                          data-description="Enter your payment details below"
                          data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                          data-locale="auto"
                          data-currency="eur">
                          <a href=""""),_display_(/*252.37*/routes/*252.43*/.ShoppingCtrl.placeOrder()),format.raw/*252.69*/("""" class="btn btn-success btn-sm"></a>
                        </script>
                        
                        
                      </form>
                    
            
                    
                   
                </p>
            </div>
            </div>
    

        
        </div>
    </div>
</div>
""")))}),format.raw/*270.2*/("""

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
                  DATE: Tue Apr 17 21:39:46 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/checkout.scala.html
                  HASH: f7a896e672d073af3f9e09faa0e0cbedd699f83e
                  MATRIX: 972->1|1090->55|1126->86|1158->113|1212->46|1246->140|1259->146|1328->207|1367->209|1398->213|1471->260|1512->292|1552->294|1587->302|1627->315|1642->321|1704->362|1809->441|1850->473|1890->475|1924->482|1996->527|2010->532|2046->547|2080->554|2128->571|2166->582|2207->614|2247->616|2289->630|2368->682|2382->687|2418->702|2460->716|2508->733|2553->751|2878->1049|2925->1087|2965->1089|3015->1111|3126->1195|3195->1248|3235->1250|3285->1272|3347->1307|3357->1308|3397->1327|3467->1370|3515->1397|3604->1459|3614->1460|3649->1474|3719->1517|3771->1548|3882->1628|3954->1669|4002->1690|4183->1844|4261->1900|6175->3785|6205->3786|6262->3814|6353->3876|6383->3877|6442->3907|6479->3915|6509->3916|6570->3948|6600->3949|6696->4016|6726->4017|8057->5319|8087->5320|8146->5350|8284->5459|8314->5460|8446->5563|8476->5564|8535->5594|8755->5785|8785->5786|8846->5818|9201->6144|9231->6145|9310->6195|9455->6311|9485->6312|9546->6344|9644->6413|9674->6414|9704->6415|9738->6420|9768->6421|9829->6453|10010->6605|10040->6606|10099->6636|10353->6861|10383->6862|10444->6894|10893->7314|10923->7315|11002->7365|13339->9673|13369->9674|13465->9741|13599->9846|13629->9847|13688->9877|13721->9881|13751->9882|13845->9947|13924->9997|13954->9998|14013->10028|14346->10332|14376->10333|14638->10566|14668->10567|14727->10597|14881->10722|14911->10723|14972->10755|15060->10814|15090->10815|15149->10845|15179->10846|15256->10894|15746->11355|15776->11356|15839->11390|15985->11507|16015->11508|16070->11534|16100->11535|16163->11569|16193->11570|16250->11598|16280->11599|16333->11623|16662->11924|16678->11930|16726->11956|17040->12242|17064->12256|17115->12285|17510->12652|17526->12658|17574->12684|17958->13037
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|40->8|40->8|40->8|42->10|43->11|43->11|43->11|45->13|45->13|45->13|45->13|50->18|50->18|50->18|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|62->30|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|82->50|82->50|82->50|83->51|83->51|86->54|87->55|89->57|93->61|93->61|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|136->104|136->104|138->106|138->106|159->127|159->127|160->128|162->130|162->130|164->132|164->132|165->133|168->136|168->136|169->137|173->141|173->141|175->143|176->144|176->144|177->145|178->146|178->146|178->146|178->146|178->146|179->147|181->149|181->149|182->150|186->154|186->154|187->155|192->160|192->160|194->162|230->198|230->198|232->200|235->203|235->203|236->204|236->204|236->204|238->206|239->207|239->207|240->208|246->214|246->214|250->218|250->218|251->219|252->220|252->220|253->221|254->222|254->222|255->223|255->223|257->225|263->231|263->231|264->232|265->233|265->233|265->233|265->233|266->234|266->234|267->235|267->235|268->236|273->241|273->241|273->241|278->246|278->246|278->246|284->252|284->252|284->252|302->270
                  -- GENERATED --
              */
          