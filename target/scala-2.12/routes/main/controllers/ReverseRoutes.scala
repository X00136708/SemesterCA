
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doran/Documents/2ndYearProject/semesterca/conf/routes
// @DATE:Fri Apr 13 15:54:56 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:58
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def productDetails(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productDetails/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def listProducts(cat:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listProducts" + play.core.routing.queryString(List(if(cat == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:38
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:44
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:41
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:38
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:42
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:23
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def addOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:32
    def confirmPurchase(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkOut")
    }
  
    // @LINE:24
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:33
    def addToWallet(amount:Float): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToWallet" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Float]].unbind("amount", amount)))))
    }
  
    // @LINE:31
    def cancelOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:29
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:28
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:30
    def viewOrders(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:34
    def addToWalletSubmit(amount:Float): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addToWalletSubmit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Float]].unbind("amount", amount)))))
    }
  
    // @LINE:26
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:23
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:27
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }

  // @LINE:14
  class ReverseCommunityCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:53
    def createReplySubmit(postId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createReplySubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:51
    def createReply(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createReply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:15
    def addUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUserSubmit")
    }
  
    // @LINE:52
    def createPostSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createPostSubmit")
    }
  
    // @LINE:54
    def deletePost(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletePost/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:16
    def usersPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usersPage")
    }
  
    // @LINE:47
    def forumPage(prod:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forumPage" + play.core.routing.queryString(List(if(prod == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("prod", prod)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:50
    def createPost(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createPost")
    }
  
    // @LINE:48
    def viewPost(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewPost/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:55
    def deleteReply(replyId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("replyId", replyId)))
    }
  
  }


}
