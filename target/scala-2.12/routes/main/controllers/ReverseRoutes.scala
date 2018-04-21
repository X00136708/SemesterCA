
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/new/SemesterCA/conf/routes
// @DATE:Sat Apr 21 16:05:18 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:71
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
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

  // @LINE:40
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:46
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:43
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:40
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:44
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:25
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:34
    def confirmPurchase(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkOut")
    }
  
    // @LINE:26
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:35
    def addToWallet(amount:Float): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToWallet" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Float]].unbind("amount", amount)))))
    }
  
    // @LINE:33
    def cancelOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:30
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:32
    def viewOrders(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:36
    def addToWalletSubmit(amount:Float): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addToWalletSubmit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Float]].unbind("amount", amount)))))
    }
  
    // @LINE:28
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:25
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:29
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }

  // @LINE:12
  class ReverseCommunityCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def createReviewSubmit(prodId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createReviewSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("prodId", prodId)))
    }
  
    // @LINE:49
    def myAccount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myaccount")
    }
  
    // @LINE:65
    def updateUser(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:16
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:61
    def createReview(prodId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("prodId", prodId)))
    }
  
    // @LINE:57
    def createReplySubmit(postId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createReplySubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:55
    def createReply(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createReply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:63
    def deleteReview(reviewId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("reviewId", reviewId)))
    }
  
    // @LINE:17
    def addUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUserSubmit")
    }
  
    // @LINE:56
    def createPostSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createPostSubmit")
    }
  
    // @LINE:58
    def deletePost(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletePost/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:18
    def usersPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usersPage")
    }
  
    // @LINE:12
    def vote(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "vote/addOne")
    }
  
    // @LINE:51
    def forumPage(prod:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forumPage" + play.core.routing.queryString(List(if(prod == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("prod", prod)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:54
    def createPost(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createPost")
    }
  
    // @LINE:52
    def viewPost(postId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewPost/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("postId", postId)))
    }
  
    // @LINE:67
    def deleteUser(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:59
    def deleteReply(replyId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("replyId", replyId)))
    }
  
    // @LINE:66
    def updateUserSubmit(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateUserSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
