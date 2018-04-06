
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doran/Documents/2ndYearProject/semesterca/conf/routes
// @DATE:Fri Apr 06 18:58:30 BST 2018

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginCtrl LoginCtrl = new controllers.security.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginCtrl LoginCtrl = new controllers.security.javascript.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());
  }

}
