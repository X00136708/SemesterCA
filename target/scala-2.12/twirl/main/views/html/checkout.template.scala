
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
    """),format.raw/*12.5*/("""<link href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.65*/("""" rel="stylesheet"/> 

<div class="row">

	<div class="col-md-12">
		"""),_display_(/*17.4*/if(flash.containsKey("success"))/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
			  """),format.raw/*18.6*/("""<div class="alert alert-success">
			      """),_display_(/*19.11*/flash/*19.16*/.get("success")),format.raw/*19.31*/("""
			  """),format.raw/*20.6*/("""</div>
        """)))}),format.raw/*21.10*/("""
        """),_display_(/*22.10*/if(flash.containsKey("failure"))/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/("""
            """),format.raw/*23.13*/("""<div class="alert alert-success">
                """),_display_(/*24.18*/flash/*24.23*/.get("failure")),format.raw/*24.38*/("""
            """),format.raw/*25.13*/("""</div>
        """)))}),format.raw/*26.10*/("""  
        

		"""),format.raw/*29.3*/("""<table class="table table-bordered table-hover table-condensed">
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
                """),_display_(/*42.18*/if(registeredUser.getBasket() != null)/*42.56*/ {_display_(Seq[Any](format.raw/*42.58*/("""
                    """),format.raw/*43.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*44.22*/for(i <- registeredUser.getBasket().getBasketItems()) yield /*44.75*/ {_display_(Seq[Any](format.raw/*44.77*/("""
                    """),format.raw/*45.21*/("""<tr>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getProduct.getName),format.raw/*46.50*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getPrice))),format.raw/*47.64*/("""</td>
                        
                        <td>"""),_display_(/*49.30*/i/*49.31*/.getQuantity()),format.raw/*49.45*/("""</td>
                        <td>&euro; """),_display_(/*50.37*/("%.2f".format(i.getItemTotal))),format.raw/*50.68*/("""</td>
                       
                    </tr>
                    
                    """)))}),format.raw/*54.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*55.16*/("""
              
			"""),format.raw/*57.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                
                
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*63.69*/("%.2f".format(registeredUser.getBasket.getBasketTotal))),format.raw/*63.125*/("""</strong> </p>
                <div class="delivery">
                  
                <span class="badge">Delivery charge<p id="myLink"></p></span>
                </div>
              </div>
                  
              
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                      <br>
                      <head>
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
                        
                              function initMap() """),format.raw/*112.50*/("""{"""),format.raw/*112.51*/("""
                                """),format.raw/*113.33*/("""var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*113.95*/("""{"""),format.raw/*113.96*/("""
                                  """),format.raw/*114.35*/("""center: """),format.raw/*114.43*/("""{"""),format.raw/*114.44*/("""lat: 53.2906911, lng: -6.3632549"""),format.raw/*114.76*/("""}"""),format.raw/*114.77*/(""",
                                  zoom: 13
                                """),format.raw/*116.33*/("""}"""),format.raw/*116.34*/(""");
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
                                var marker = new google.maps.Marker("""),format.raw/*137.69*/("""{"""),format.raw/*137.70*/("""
                                  """),format.raw/*138.35*/("""map: map,
                                  anchorPoint: new google.maps.Point(0, -29)
                                """),format.raw/*140.33*/("""}"""),format.raw/*140.34*/(""");
                        
                                autocomplete.addListener('place_changed', function() """),format.raw/*142.86*/("""{"""),format.raw/*142.87*/("""
                                  """),format.raw/*143.35*/("""infowindow.close();
                                  marker.setVisible(false);
                                  var place = autocomplete.getPlace();
                                  if (!place.geometry) """),format.raw/*146.56*/("""{"""),format.raw/*146.57*/("""
                                    """),format.raw/*147.37*/("""// User entered the name of a Place that was not suggested and
                                    // pressed the Enter key, or the Place Details request failed.
                                    window.alert("No details available for input: '" + place.name + "'");
                                    return;
                                  """),format.raw/*151.35*/("""}"""),format.raw/*151.36*/("""
                        
                                  """),format.raw/*153.35*/("""// If the place has a geometry, then present it on a map.
                                  if (place.geometry.viewport) """),format.raw/*154.64*/("""{"""),format.raw/*154.65*/("""
                                    """),format.raw/*155.37*/("""map.fitBounds(place.geometry.viewport);
                                  """),format.raw/*156.35*/("""}"""),format.raw/*156.36*/(""" """),format.raw/*156.37*/("""else """),format.raw/*156.42*/("""{"""),format.raw/*156.43*/("""
                                    """),format.raw/*157.37*/("""map.setCenter(place.geometry.location);
                                    map.setZoom(17);  // Why 17? Because it looks good.
                                  """),format.raw/*159.35*/("""}"""),format.raw/*159.36*/("""
                                  """),format.raw/*160.35*/("""marker.setPosition(place.geometry.location);
                                  marker.setVisible(true);
                        
                                  var address = '';
                                  if (place.address_components) """),format.raw/*164.65*/("""{"""),format.raw/*164.66*/("""
                                    """),format.raw/*165.37*/("""address = [
                                      (place.address_components[0] && place.address_components[0].short_name || ''),
                                      (place.address_components[1] && place.address_components[1].short_name || ''),
                                      (place.address_components[2] && place.address_components[2].short_name || '')
                                    ].join(' ');
                                  """),format.raw/*170.35*/("""}"""),format.raw/*170.36*/("""
                        
                                  """),format.raw/*172.35*/("""infowindowContent.children['place-icon'].src = place.icon;
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
                                       location.includes("Laois")))"""),format.raw/*208.68*/("""{"""),format.raw/*208.69*/("""
                                     
                                      """),format.raw/*210.39*/("""deliveryCharge=0.0;
                                        
                        
                                  """),format.raw/*213.35*/("""}"""),format.raw/*213.36*/("""
                                  """),format.raw/*214.35*/("""else"""),format.raw/*214.39*/("""{"""),format.raw/*214.40*/("""
                                   
                                      """),format.raw/*216.39*/("""deliveryCharge=2.99;
                                  """),format.raw/*217.35*/("""}"""),format.raw/*217.36*/("""
                                  """),format.raw/*218.35*/("""console.log(location);
                                  
                                  document.getElementById("myLink").innerHTML="€"+deliveryCharge;
                                  
                                  location="";
                                  infowindow.open(map, marker);
                                """),format.raw/*224.33*/("""}"""),format.raw/*224.34*/(""");
                        
                                // Sets a listener on a radio button to change the filter type on Places
                                // Autocomplete.
                                function setupClickListener(id, types) """),format.raw/*228.72*/("""{"""),format.raw/*228.73*/("""
                                  """),format.raw/*229.35*/("""var radioButton = document.getElementById(id);
                                  radioButton.addEventListener('click', function() """),format.raw/*230.84*/("""{"""),format.raw/*230.85*/("""
                                    """),format.raw/*231.37*/("""autocomplete.setTypes(types);
                                  """),format.raw/*232.35*/("""}"""),format.raw/*232.36*/(""");
                                """),format.raw/*233.33*/("""}"""),format.raw/*233.34*/("""
                        
                                """),format.raw/*235.33*/("""setupClickListener('changetype-all', []);
                                setupClickListener('changetype-address', ['address']);
                                setupClickListener('changetype-establishment', ['establishment']);
                                setupClickListener('changetype-geocode', ['geocode']);
                        
                                document.getElementById('use-strict-bounds')
                                    .addEventListener('click', function() """),format.raw/*241.75*/("""{"""),format.raw/*241.76*/("""
                                      """),format.raw/*242.39*/("""console.log('Checkbox clicked! New state=' + this.checked);
                                      autocomplete.setOptions("""),format.raw/*243.63*/("""{"""),format.raw/*243.64*/("""strictBounds: this.checked"""),format.raw/*243.90*/("""}"""),format.raw/*243.91*/(""");
                                    """),format.raw/*244.37*/("""}"""),format.raw/*244.38*/(""");
                              """),format.raw/*245.31*/("""}"""),format.raw/*245.32*/("""
                            """),format.raw/*246.29*/("""</script>
                        
                            <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA9CnC9zOefDQlSR-i2wqSNzsraFwjAlKk&libraries=places&callback=initMap"
                                async defer></script>
                          </body>
                          <br>
                      <form action=""""),_display_(/*252.38*/routes/*252.44*/.ShoppingCtrl.placeOrder()),format.raw/*252.70*/("""" method="POST">
                           
                        <script
                          src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                          data-key="pk_test_LABia2wLCoS6B9wndhZqcLA4"
                          data-amount=""""),_display_(/*257.41*/registeredUser/*257.55*/.getBasket.getBasketTotalPlus),format.raw/*257.84*/(""""
                          
                          data-name="Nu-Wave Games"
                          data-description="Enter your payment details below"
                          data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                          data-locale="auto"
                          data-currency="eur">
                          <a href=""""),_display_(/*264.37*/routes/*264.43*/.ShoppingCtrl.placeOrder()),format.raw/*264.69*/("""" class="btn btn-success btn-sm"></a>
                        </script>
                        
                        
                      </form>
                    
            
                    
                   
                </p>
            </div>
            </div>
    

        
        </div>
    </div>
</div>
""")))}),format.raw/*282.2*/("""

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
                  DATE: Tue Apr 17 16:48:06 BST 2018
                  SOURCE: C:/Users/doran/Documents/2ndYearProject/newSemca/semesterca/app/views/checkout.scala.html
                  HASH: 10d24399e99837b5fa279cd36bd6ff11fa6d87bf
                  MATRIX: 972->1|1090->55|1126->86|1158->113|1212->46|1246->140|1259->146|1328->207|1367->209|1398->213|1471->260|1512->292|1552->294|1585->300|1625->313|1640->319|1702->360|1803->435|1844->467|1884->469|1918->476|1990->521|2004->526|2040->541|2074->548|2122->565|2160->576|2201->608|2241->610|2283->624|2362->676|2376->681|2412->696|2454->710|2502->727|2547->745|2856->1027|2903->1065|2943->1067|2993->1089|3104->1173|3173->1226|3213->1228|3263->1250|3325->1285|3335->1286|3375->1305|3445->1348|3493->1375|3582->1437|3592->1438|3627->1452|3697->1495|3749->1526|3882->1628|3954->1669|4002->1690|4219->1880|4297->1936|6673->4283|6703->4284|6766->4318|6857->4380|6887->4381|6952->4417|6989->4425|7019->4426|7080->4458|7110->4459|7218->4538|7248->4539|8705->5967|8735->5968|8800->6004|8950->6125|8980->6126|9124->6241|9154->6242|9219->6278|9457->6487|9487->6488|9554->6526|9933->6876|9963->6877|10054->6939|10205->7061|10235->7062|10302->7100|10406->7175|10436->7176|10466->7177|10500->7182|10530->7183|10597->7221|10790->7385|10820->7386|10885->7422|11163->7671|11193->7672|11260->7710|11739->8160|11769->8161|11860->8223|14413->10747|14443->10748|14551->10827|14703->10950|14733->10951|14798->10987|14831->10991|14861->10992|14967->11069|15052->11125|15082->11126|15147->11162|15516->11502|15546->11503|15832->11760|15862->11761|15927->11797|16087->11928|16117->11929|16184->11967|16278->12032|16308->12033|16373->12069|16403->12070|16492->12130|17018->12627|17048->12628|17117->12668|17269->12791|17299->12792|17354->12818|17384->12819|17453->12859|17483->12860|17546->12894|17576->12895|17635->12925|18020->13282|18036->13288|18084->13314|18398->13600|18422->13614|18473->13643|18896->14038|18912->14044|18960->14070|19344->14423
                  LINES: 28->1|31->5|32->6|33->7|36->1|40->8|40->8|40->8|40->8|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|61->29|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|78->46|78->46|78->46|79->47|79->47|81->49|81->49|81->49|82->50|82->50|86->54|87->55|89->57|95->63|95->63|144->112|144->112|145->113|145->113|145->113|146->114|146->114|146->114|146->114|146->114|148->116|148->116|169->137|169->137|170->138|172->140|172->140|174->142|174->142|175->143|178->146|178->146|179->147|183->151|183->151|185->153|186->154|186->154|187->155|188->156|188->156|188->156|188->156|188->156|189->157|191->159|191->159|192->160|196->164|196->164|197->165|202->170|202->170|204->172|240->208|240->208|242->210|245->213|245->213|246->214|246->214|246->214|248->216|249->217|249->217|250->218|256->224|256->224|260->228|260->228|261->229|262->230|262->230|263->231|264->232|264->232|265->233|265->233|267->235|273->241|273->241|274->242|275->243|275->243|275->243|275->243|276->244|276->244|277->245|277->245|278->246|284->252|284->252|284->252|289->257|289->257|289->257|296->264|296->264|296->264|314->282
                  -- GENERATED --
              */
          