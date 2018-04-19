
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
                          data-currency="eur">
                          <a href=""""),_display_(/*259.37*/routes/*259.43*/.ShoppingCtrl.placeOrder()),format.raw/*259.69*/("""" class="btn btn-success btn-sm"></a>
                        </script>
                        
                        
                      </form>
                    
            
                    
                   
                </p>
            </div>
            </div>
    

        
        </div>
    </div>
</div>
""")))}),format.raw/*277.2*/("""

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
                  DATE: Thu Apr 19 09:20:24 IST 2018
                  SOURCE: /home/wdd/SemesterCA/app/views/checkout.scala.html
                  HASH: d96b0a46a172a47afe035ce2b144fe459806c5df
                  MATRIX: 972->1|1090->51|1126->81|1158->107|1212->46|1242->133|1255->139|1324->200|1363->202|1392->204|1464->250|1505->282|1545->284|1578->290|1618->303|1633->309|1695->350|1795->424|1836->456|1876->458|1909->464|1980->508|1994->513|2030->528|2063->534|2110->550|2147->560|2188->592|2228->594|2269->607|2347->658|2361->663|2397->678|2438->691|2485->707|2527->722|2839->1007|2886->1045|2926->1047|2975->1068|3085->1151|3154->1204|3194->1206|3243->1227|3304->1261|3314->1262|3354->1281|3423->1323|3471->1350|3558->1410|3568->1411|3603->1425|3672->1467|3724->1498|3860->1603|3931->1643|3977->1662|4154->1812|4232->1868|6260->3867|6290->3868|6346->3895|6437->3957|6467->3958|6525->3987|6562->3995|6592->3996|6653->4028|6683->4029|6777->4094|6807->4095|8117->5376|8147->5377|8205->5406|8341->5513|8371->5514|8501->5615|8531->5616|8589->5645|8806->5833|8836->5834|8896->5865|9247->6187|9277->6188|9354->6236|9498->6351|9528->6352|9588->6383|9685->6451|9715->6452|9745->6453|9779->6458|9809->6459|9869->6490|10048->6640|10078->6641|10136->6670|10386->6891|10416->6892|10476->6923|10920->7338|10950->7339|11027->7387|13328->9659|13358->9660|13452->9725|13583->9827|13613->9828|13671->9857|13704->9861|13734->9862|13826->9925|13904->9974|13934->9975|14050->10062|14297->10280|14327->10281|14585->10510|14615->10511|14673->10540|14826->10664|14856->10665|14916->10696|15003->10754|15033->10755|15091->10784|15121->10785|15196->10831|15680->11286|15710->11287|15772->11320|15917->11436|15947->11437|16002->11463|16032->11464|16094->11497|16124->11498|16180->11525|16210->11526|16262->11549|16586->11845|16602->11851|16650->11877|16960->12159|16984->12173|17035->12202|17424->12563|17440->12569|17488->12595|17854->12930
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|40->8|40->8|40->8|42->10|43->11|43->11|43->11|45->13|45->13|45->13|45->13|50->18|50->18|50->18|51->19|52->20|52->20|52->20|53->21|54->22|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|62->30|75->43|75->43|75->43|76->44|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|82->50|82->50|82->50|83->51|83->51|88->56|89->57|91->59|95->63|95->63|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|142->110|144->112|144->112|165->133|165->133|166->134|168->136|168->136|170->138|170->138|171->139|174->142|174->142|175->143|179->147|179->147|181->149|182->150|182->150|183->151|184->152|184->152|184->152|184->152|184->152|185->153|187->155|187->155|188->156|192->160|192->160|193->161|198->166|198->166|200->168|236->204|236->204|238->206|241->209|241->209|242->210|242->210|242->210|244->212|245->213|245->213|248->216|252->220|252->220|256->224|256->224|257->225|258->226|258->226|259->227|260->228|260->228|261->229|261->229|263->231|269->237|269->237|270->238|271->239|271->239|271->239|271->239|272->240|272->240|273->241|273->241|274->242|279->247|279->247|279->247|285->253|285->253|285->253|291->259|291->259|291->259|309->277
                  -- GENERATED --
              */
          