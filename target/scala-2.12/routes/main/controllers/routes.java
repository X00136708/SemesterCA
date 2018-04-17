
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doran/Documents/2ndYearProject/semesterca/conf/routes
// @DATE:Tue Apr 17 21:10:01 BST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductCtrl ProductCtrl = new controllers.ReverseProductCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminProductCtrl AdminProductCtrl = new controllers.ReverseAdminProductCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseShoppingCtrl ShoppingCtrl = new controllers.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCommunityCtrl CommunityCtrl = new controllers.ReverseCommunityCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductCtrl ProductCtrl = new controllers.javascript.ReverseProductCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminProductCtrl AdminProductCtrl = new controllers.javascript.ReverseAdminProductCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseShoppingCtrl ShoppingCtrl = new controllers.javascript.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCommunityCtrl CommunityCtrl = new controllers.javascript.ReverseCommunityCtrl(RoutesPrefix.byNamePrefix());
  }

}
