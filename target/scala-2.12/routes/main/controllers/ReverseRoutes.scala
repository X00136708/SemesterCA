
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SemesterCA/conf/routes
// @DATE:Thu Apr 19 09:20:24 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:63
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
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

  // @LINE:39
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:45
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:42
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:43
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:24
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def addOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:33
    def confirmPurchase(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkOut")
    }
  
    // @LINE:25
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def addToWallet(amount:Float): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToWallet" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Float]].unbind("amount", amount)))))
    }
  
    // @LINE:32
    def cancelOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:30
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:29
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:31
    def viewOrders(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:35
    def addToWalletSubmit(amount:Float): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addToWalletSubmit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Float]].unbind("amount", amount)))))
    }
  
    // @LINE:27
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:24
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:28
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }

  // @LINE:15
  class ReverseCommunityCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def createReviewSubmit(prodId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createReviewSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("prodId", prodId)))
    }
  
    // @LINE:15
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:58
    def createReview(prodId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("prodId", prodId)))
    }
  
    // @LINE:54
    def createReplySubmit(postId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createReplySubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:52
    def createReply(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createReply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:60
    def deleteReview(reviewId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("reviewId", reviewId)))
    }
  
    // @LINE:16
    def addUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUserSubmit")
    }
  
    // @LINE:53
    def createPostSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createPostSubmit")
    }
  
    // @LINE:55
    def deletePost(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletePost/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:17
    def usersPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usersPage")
    }
  
    // @LINE:48
    def forumPage(prod:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forumPage" + play.core.routing.queryString(List(if(prod == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("prod", prod)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:51
    def createPost(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createPost")
    }
  
    // @LINE:49
    def viewPost(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewPost/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:56
    def deleteReply(replyId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("replyId", replyId)))
    }
  
  }


}
