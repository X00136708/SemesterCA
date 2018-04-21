
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/new/SemesterCA/conf/routes
// @DATE:Sat Apr 21 16:05:18 BST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:71
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseProductCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def productDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.productDetails",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productDetails/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.listProducts",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listProducts" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAdminProductCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProductSubmit"})
        }
      """
    )
  
    // @LINE:46
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/deleteProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:40
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProduct"})
        }
      """
    )
  
    // @LINE:44
    def updateProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProductSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProductSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:34
    def confirmPurchase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.confirmPurchase",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkOut"})
        }
      """
    )
  
    // @LINE:26
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:35
    def addToWallet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToWallet",
      """
        function(amount0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToWallet" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Float]].javascriptUnbind + """)("amount", amount0)])})
        }
      """
    )
  
    // @LINE:33
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.cancelOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cancelOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:31
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:30
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:32
    def viewOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrders",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrders/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:36
    def addToWalletSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToWalletSubmit",
      """
        function(amount0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addToWalletSubmit" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Float]].javascriptUnbind + """)("amount", amount0)])})
        }
      """
    )
  
    // @LINE:28
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:25
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket"})
        }
      """
    )
  
    // @LINE:29
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseCommunityCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def createReviewSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.createReviewSubmit",
      """
        function(prodId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createReviewSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("prodId", prodId0))})
        }
      """
    )
  
    // @LINE:49
    def myAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.myAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myaccount"})
        }
      """
    )
  
    // @LINE:65
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.updateUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:61
    def createReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.createReview",
      """
        function(prodId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("prodId", prodId0))})
        }
      """
    )
  
    // @LINE:57
    def createReplySubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.createReplySubmit",
      """
        function(postId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createReplySubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("postId", postId0))})
        }
      """
    )
  
    // @LINE:55
    def createReply: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.createReply",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createReply/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("postId", postId0))})
        }
      """
    )
  
    // @LINE:63
    def deleteReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.deleteReview",
      """
        function(reviewId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("reviewId", reviewId0))})
        }
      """
    )
  
    // @LINE:17
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.addUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit"})
        }
      """
    )
  
    // @LINE:56
    def createPostSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.createPostSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createPostSubmit"})
        }
      """
    )
  
    // @LINE:58
    def deletePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.deletePost",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePost/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("postId", postId0))})
        }
      """
    )
  
    // @LINE:18
    def usersPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.usersPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usersPage"})
        }
      """
    )
  
    // @LINE:12
    def vote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.vote",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vote/addOne"})
        }
      """
    )
  
    // @LINE:51
    def forumPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.forumPage",
      """
        function(prod0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forumPage" + _qS([(prod0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("prod", prod0)), (filter1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:54
    def createPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.createPost",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createPost"})
        }
      """
    )
  
    // @LINE:52
    def viewPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.viewPost",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewPost/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("postId", postId0))})
        }
      """
    )
  
    // @LINE:67
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:59
    def deleteReply: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.deleteReply",
      """
        function(replyId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteReply/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("replyId", replyId0))})
        }
      """
    )
  
    // @LINE:66
    def updateUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityCtrl.updateUserSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUserSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
