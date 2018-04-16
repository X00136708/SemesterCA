
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Documents/SemesterCA/conf/routes
// @DATE:Mon Apr 16 16:38:14 IST 2018

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
