
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

                    """)))}),format.raw/*56.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*57.16*/("""
              
			"""),format.raw/*59.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*63.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*63.125*/("""</strong></p>
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
                  
                        function initMap() """),format.raw/*108.44*/("""{"""),format.raw/*108.45*/("""
                          """),format.raw/*109.27*/("""var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*109.89*/("""{"""),format.raw/*109.90*/("""
                            """),format.raw/*110.29*/("""center: """),format.raw/*110.37*/("""{"""),format.raw/*110.38*/("""lat: 53.2906911, lng: -6.3632549"""),format.raw/*110.70*/("""}"""),format.raw/*110.71*/(""",
                            zoom: 13
                          """),format.raw/*112.27*/("""}"""),format.raw/*112.28*/(""");
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
                          var marker = new google.maps.Marker("""),format.raw/*133.63*/("""{"""),format.raw/*133.64*/("""
                            """),format.raw/*134.29*/("""map: map,
                            anchorPoint: new google.maps.Point(0, -29)
                          """),format.raw/*136.27*/("""}"""),format.raw/*136.28*/(""");
                  
                          autocomplete.addListener('place_changed', function() """),format.raw/*138.80*/("""{"""),format.raw/*138.81*/("""
                            """),format.raw/*139.29*/("""infowindow.close();
                            marker.setVisible(false);
                            var place = autocomplete.getPlace();
                            if (!place.geometry) """),format.raw/*142.50*/("""{"""),format.raw/*142.51*/("""
                              """),format.raw/*143.31*/("""// User entered the name of a Place that was not suggested and
                              // pressed the Enter key, or the Place Details request failed.
                              window.alert("No details available for input: '" + place.name + "'");
                              return;
                            """),format.raw/*147.29*/("""}"""),format.raw/*147.30*/("""
                  
                            """),format.raw/*149.29*/("""// If the place has a geometry, then present it on a map.
                            if (place.geometry.viewport) """),format.raw/*150.58*/("""{"""),format.raw/*150.59*/("""
                              """),format.raw/*151.31*/("""map.fitBounds(place.geometry.viewport);
                            """),format.raw/*152.29*/("""}"""),format.raw/*152.30*/(""" """),format.raw/*152.31*/("""else """),format.raw/*152.36*/("""{"""),format.raw/*152.37*/("""
                              """),format.raw/*153.31*/("""map.setCenter(place.geometry.location);
                              map.setZoom(17);  // Why 17? Because it looks good.
                            """),format.raw/*155.29*/("""}"""),format.raw/*155.30*/("""
                            """),format.raw/*156.29*/("""marker.setPosition(place.geometry.location);
                            marker.setVisible(true);
                  
                            var address = '';
                            if (place.address_components) """),format.raw/*160.59*/("""{"""),format.raw/*160.60*/("""
                              """),format.raw/*161.31*/("""address = [
                                (place.address_components[0] && place.address_components[0].short_name || ''),
                                (place.address_components[1] && place.address_components[1].short_name || ''),
                                (place.address_components[2] && place.address_components[2].short_name || '')
                              ].join(' ');
                            """),format.raw/*166.29*/("""}"""),format.raw/*166.30*/("""
                  
                            """),format.raw/*168.29*/("""infowindowContent.children['place-icon'].src = place.icon;
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
                                 location.includes("Laois")))"""),format.raw/*204.62*/("""{"""),format.raw/*204.63*/("""
                               
                                """),format.raw/*206.33*/("""deliveryCharge=0.0;
                                  
                  
                            """),format.raw/*209.29*/("""}"""),format.raw/*209.30*/("""
                            """),format.raw/*210.29*/("""else"""),format.raw/*210.33*/("""{"""),format.raw/*210.34*/("""
                             
                                """),format.raw/*212.33*/("""deliveryCharge=2.99;
                            """),format.raw/*213.29*/("""}"""),format.raw/*213.30*/("""
                            
                            
                            """),format.raw/*216.29*/("""document.getElementById("myLink").innerHTML="€"+deliveryCharge;
                            
                            location="";
                            infowindow.open(map, marker);
                          """),format.raw/*220.27*/("""}"""),format.raw/*220.28*/(""");
                  
                          // Sets a listener on a radio button to change the filter type on Places
                          // Autocomplete.
                          function setupClickListener(id, types) """),format.raw/*224.66*/("""{"""),format.raw/*224.67*/("""
                            """),format.raw/*225.29*/("""var radioButton = document.getElementById(id);
                            radioButton.addEventListener('click', function() """),format.raw/*226.78*/("""{"""),format.raw/*226.79*/("""
                              """),format.raw/*227.31*/("""autocomplete.setTypes(types);
                            """),format.raw/*228.29*/("""}"""),format.raw/*228.30*/(""");
                          """),format.raw/*229.27*/("""}"""),format.raw/*229.28*/("""
                  
                          """),format.raw/*231.27*/("""setupClickListener('changetype-all', []);
                          setupClickListener('changetype-address', ['address']);
                          setupClickListener('changetype-establishment', ['establishment']);
                          setupClickListener('changetype-geocode', ['geocode']);
                  
                          document.getElementById('use-strict-bounds')
                              .addEventListener('click', function() """),format.raw/*237.69*/("""{"""),format.raw/*237.70*/("""
                                """),format.raw/*238.33*/("""console.log('Checkbox clicked! New state=' + this.checked);
                                autocomplete.setOptions("""),format.raw/*239.57*/("""{"""),format.raw/*239.58*/("""strictBounds: this.checked"""),format.raw/*239.84*/("""}"""),format.raw/*239.85*/(""");
                              """),format.raw/*240.31*/("""}"""),format.raw/*240.32*/(""");
                        """),format.raw/*241.25*/("""}"""),format.raw/*241.26*/("""
                      """),format.raw/*242.23*/("""</script>
                  
                      <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA9CnC9zOefDQlSR-i2wqSNzsraFwjAlKk&libraries=places&callback=initMap"
                          async defer></script>
                    </body>
                      <form action=""""),_display_(/*247.38*/routes/*247.44*/.ShoppingCtrl.placeOrder()),format.raw/*247.70*/("""" method="POST">

                           
                        <script
                          src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                          data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                          data-amount=""""),_display_(/*253.41*/registeredUser/*253.55*/.getBasket.getBasketTotalPlus),format.raw/*253.84*/(""""
                          data-name="Nu-Wave Games"
                          data-description="Enter your payment details below"
                          data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                          data-locale="auto"
                          data-label="Purchase"
                          data-currency="eur">
                          <a href=""""),_display_(/*260.37*/routes/*260.43*/.ShoppingCtrl.placeOrder()),format.raw/*260.69*/("""" class="btn btn-success btn-sm"></a>
                        </script>
                        
                        
                      </form>
                    
            
                    
                   
                </p>
            </div>
            </div>
    

        
        </div>
    </div>
</div>
""")))}),format.raw/*278.2*/("""

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
                  DATE: Sun Apr 22 11:50:01 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/semesterca/app/views/checkout.scala.html
                  HASH: b1c7c3fdf84abe6c660b2b678017ccc3507fc4ec
                  MATRIX: 972->1|1090->55|1126->86|1158->113|1212->46|1246->140|1259->146|1328->207|1367->209|1398->213|1471->260|1512->292|1552->294|1587->302|1627->315|1642->321|1704->362|1809->441|1850->473|1890->475|1924->482|1996->527|2010->532|2046->547|2080->554|2128->571|2166->582|2207->614|2247->616|2289->630|2368->682|2382->687|2418->702|2460->716|2508->733|2553->751|2878->1049|2925->1087|2965->1089|3015->1111|3126->1195|3195->1248|3235->1250|3285->1272|3347->1307|3357->1308|3397->1327|3467->1370|3515->1397|3604->1459|3614->1460|3649->1474|3719->1517|3771->1548|3912->1658|3984->1699|4032->1720|4213->1874|4291->1930|6364->3974|6394->3975|6451->4003|6542->4065|6572->4066|6631->4096|6668->4104|6698->4105|6759->4137|6789->4138|6885->4205|6915->4206|8246->5508|8276->5509|8335->5539|8473->5648|8503->5649|8635->5752|8665->5753|8724->5783|8944->5974|8974->5975|9035->6007|9390->6333|9420->6334|9499->6384|9644->6500|9674->6501|9735->6533|9833->6602|9863->6603|9893->6604|9927->6609|9957->6610|10018->6642|10199->6794|10229->6795|10288->6825|10542->7050|10572->7051|10633->7083|11082->7503|11112->7504|11191->7554|13528->9862|13558->9863|13654->9930|13788->10035|13818->10036|13877->10066|13910->10070|13940->10071|14034->10136|14113->10186|14143->10187|14262->10277|14513->10499|14543->10500|14805->10733|14835->10734|14894->10764|15048->10889|15078->10890|15139->10922|15227->10981|15257->10982|15316->11012|15346->11013|15423->11061|15913->11522|15943->11523|16006->11557|16152->11674|16182->11675|16237->11701|16267->11702|16330->11736|16360->11737|16417->11765|16447->11766|16500->11790|16829->12091|16845->12097|16893->12123|17209->12411|17233->12425|17284->12454|17728->12870|17744->12876|17792->12902|18176->13255
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|40->8|40->8|40->8|42->10|43->11|43->11|43->11|45->13|45->13|45->13|45->13|50->18|50->18|50->18|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|62->30|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|82->50|82->50|82->50|83->51|83->51|88->56|89->57|91->59|95->63|95->63|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|142->110|144->112|144->112|165->133|165->133|166->134|168->136|168->136|170->138|170->138|171->139|174->142|174->142|175->143|179->147|179->147|181->149|182->150|182->150|183->151|184->152|184->152|184->152|184->152|184->152|185->153|187->155|187->155|188->156|192->160|192->160|193->161|198->166|198->166|200->168|236->204|236->204|238->206|241->209|241->209|242->210|242->210|242->210|244->212|245->213|245->213|248->216|252->220|252->220|256->224|256->224|257->225|258->226|258->226|259->227|260->228|260->228|261->229|261->229|263->231|269->237|269->237|270->238|271->239|271->239|271->239|271->239|272->240|272->240|273->241|273->241|274->242|279->247|279->247|279->247|285->253|285->253|285->253|292->260|292->260|292->260|310->278
                  -- GENERATED --
              */
          