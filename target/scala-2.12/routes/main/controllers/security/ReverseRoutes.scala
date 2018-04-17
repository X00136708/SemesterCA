
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doran/Documents/2ndYearProject/newSemca/semesterca/conf/routes
// @DATE:Tue Apr 17 16:48:06 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:18
package controllers.security {

  // @LINE:18
  class ReverseLoginCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
