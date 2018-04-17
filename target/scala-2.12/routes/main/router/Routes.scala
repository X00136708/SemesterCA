
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SemesterCA/conf/routes
// @DATE:Tue Apr 17 12:45:50 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductCtrl_1: controllers.ProductCtrl,
  // @LINE:14
  CommunityCtrl_0: controllers.CommunityCtrl,
  // @LINE:18
  LoginCtrl_4: controllers.security.LoginCtrl,
  // @LINE:23
  ShoppingCtrl_2: controllers.ShoppingCtrl,
  // @LINE:38
  AdminProductCtrl_3: controllers.AdminProductCtrl,
  // @LINE:62
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductCtrl_1: controllers.ProductCtrl,
    // @LINE:14
    CommunityCtrl_0: controllers.CommunityCtrl,
    // @LINE:18
    LoginCtrl_4: controllers.security.LoginCtrl,
    // @LINE:23
    ShoppingCtrl_2: controllers.ShoppingCtrl,
    // @LINE:38
    AdminProductCtrl_3: controllers.AdminProductCtrl,
    // @LINE:62
    Assets_5: controllers.Assets
  ) = this(errorHandler, ProductCtrl_1, CommunityCtrl_0, LoginCtrl_4, ShoppingCtrl_2, AdminProductCtrl_3, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductCtrl_1, CommunityCtrl_0, LoginCtrl_4, ShoppingCtrl_2, AdminProductCtrl_3, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProducts""", """controllers.ProductCtrl.listProducts(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productDetails/""" + "$" + """id<[^/]+>""", """controllers.ProductCtrl.productDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.CommunityCtrl.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.CommunityCtrl.addUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usersPage""", """controllers.CommunityCtrl.usersPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginCtrl.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrders/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrders(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkOut""", """controllers.ShoppingCtrl.confirmPurchase()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToWallet""", """controllers.ShoppingCtrl.addToWallet(amount:Float)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToWalletSubmit""", """controllers.ShoppingCtrl.addToWalletSubmit(amount:Float)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/deleteProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forumPage""", """controllers.CommunityCtrl.forumPage(prod:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewPost/""" + "$" + """postId<[^/]+>""", """controllers.CommunityCtrl.viewPost(postId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPost""", """controllers.CommunityCtrl.createPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createReply/""" + "$" + """postId<[^/]+>""", """controllers.CommunityCtrl.createReply(postId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPostSubmit""", """controllers.CommunityCtrl.createPostSubmit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createReplySubmit/""" + "$" + """postId<[^/]+>""", """controllers.CommunityCtrl.createReplySubmit(postId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletePost/""" + "$" + """postId<[^/]+>""", """controllers.CommunityCtrl.deletePost(postId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteReply/""" + "$" + """replyId<[^/]+>""", """controllers.CommunityCtrl.deleteReply(replyId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createReview/""" + "$" + """prodId<[^/]+>""", """controllers.CommunityCtrl.createReview(prodId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createReviewSubmit/""" + "$" + """prodId<[^/]+>""", """controllers.CommunityCtrl.createReviewSubmit(prodId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteReview/""" + "$" + """reviewId<[^/]+>""", """controllers.CommunityCtrl.deleteReview(reviewId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductCtrl_index0_invoker = createInvoker(
    ProductCtrl_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductCtrl_listProducts1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProducts")))
  )
  private[this] lazy val controllers_ProductCtrl_listProducts1_invoker = createInvoker(
    ProductCtrl_1.listProducts(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listProducts",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """listProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductCtrl_productDetails2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCtrl_productDetails2_invoker = createInvoker(
    ProductCtrl_1.productDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "productDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productDetails/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CommunityCtrl_addUser3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_CommunityCtrl_addUser3_invoker = createInvoker(
    CommunityCtrl_0.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "addUser",
      Nil,
      "GET",
      this.prefix + """addUser""",
      """ Login form""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CommunityCtrl_addUserSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_CommunityCtrl_addUserSubmit4_invoker = createInvoker(
    CommunityCtrl_0.addUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "addUserSubmit",
      Nil,
      "POST",
      this.prefix + """addUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CommunityCtrl_usersPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usersPage")))
  )
  private[this] lazy val controllers_CommunityCtrl_usersPage5_invoker = createInvoker(
    CommunityCtrl_0.usersPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "usersPage",
      Nil,
      "GET",
      this.prefix + """usersPage""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_security_LoginCtrl_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login6_invoker = createInvoker(
    LoginCtrl_4.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit7_invoker = createInvoker(
    LoginCtrl_4.loginSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_security_LoginCtrl_logout8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout8_invoker = createInvoker(
    LoginCtrl_4.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ShoppingCtrl_showBasket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket9_invoker = createInvoker(
    ShoppingCtrl_2.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """ Shopping""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ShoppingCtrl_addToBasket10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket10_invoker = createInvoker(
    ShoppingCtrl_2.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ShoppingCtrl_addOne11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne11_invoker = createInvoker(
    ShoppingCtrl_2.addOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ShoppingCtrl_removeOne12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne12_invoker = createInvoker(
    ShoppingCtrl_2.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket13_invoker = createInvoker(
    ShoppingCtrl_2.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ShoppingCtrl_placeOrder14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder14_invoker = createInvoker(
    ShoppingCtrl_2.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ShoppingCtrl_viewOrder15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder15_invoker = createInvoker(
    ShoppingCtrl_2.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ShoppingCtrl_viewOrders16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrders16_invoker = createInvoker(
    ShoppingCtrl_2.viewOrders(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrders",
      Seq(classOf[String]),
      "GET",
      this.prefix + """viewOrders/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder17_invoker = createInvoker(
    ShoppingCtrl_2.cancelOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cancelOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_confirmPurchase18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkOut")))
  )
  private[this] lazy val controllers_ShoppingCtrl_confirmPurchase18_invoker = createInvoker(
    ShoppingCtrl_2.confirmPurchase(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "confirmPurchase",
      Nil,
      "GET",
      this.prefix + """checkOut""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ShoppingCtrl_addToWallet19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToWallet")))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToWallet19_invoker = createInvoker(
    ShoppingCtrl_2.addToWallet(fakeValue[Float]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToWallet",
      Seq(classOf[Float]),
      "GET",
      this.prefix + """addToWallet""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_addToWalletSubmit20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToWalletSubmit")))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToWalletSubmit20_invoker = createInvoker(
    ShoppingCtrl_2.addToWalletSubmit(fakeValue[Float]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToWalletSubmit",
      Seq(classOf[Float]),
      "POST",
      this.prefix + """addToWalletSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_AdminProductCtrl_addProduct21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct21_invoker = createInvoker(
    AdminProductCtrl_3.addProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """Admin/addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit22_invoker = createInvoker(
    AdminProductCtrl_3.addProductSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """Admin/addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AdminProductCtrl_updateProduct23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct23_invoker = createInvoker(
    AdminProductCtrl_3.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit24_invoker = createInvoker(
    AdminProductCtrl_3.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct25_invoker = createInvoker(
    AdminProductCtrl_3.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/deleteProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_CommunityCtrl_forumPage26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forumPage")))
  )
  private[this] lazy val controllers_CommunityCtrl_forumPage26_invoker = createInvoker(
    CommunityCtrl_0.forumPage(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "forumPage",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """forumPage""",
      """ Community""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_CommunityCtrl_viewPost27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewPost/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_viewPost27_invoker = createInvoker(
    CommunityCtrl_0.viewPost(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "viewPost",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewPost/""" + "$" + """postId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_CommunityCtrl_createPost28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPost")))
  )
  private[this] lazy val controllers_CommunityCtrl_createPost28_invoker = createInvoker(
    CommunityCtrl_0.createPost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "createPost",
      Nil,
      "GET",
      this.prefix + """createPost""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_CommunityCtrl_createReply29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReply/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReply29_invoker = createInvoker(
    CommunityCtrl_0.createReply(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "createReply",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """createReply/""" + "$" + """postId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_CommunityCtrl_createPostSubmit30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPostSubmit")))
  )
  private[this] lazy val controllers_CommunityCtrl_createPostSubmit30_invoker = createInvoker(
    CommunityCtrl_0.createPostSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "createPostSubmit",
      Nil,
      "POST",
      this.prefix + """createPostSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_CommunityCtrl_createReplySubmit31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReplySubmit/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReplySubmit31_invoker = createInvoker(
    CommunityCtrl_0.createReplySubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "createReplySubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """createReplySubmit/""" + "$" + """postId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_CommunityCtrl_deletePost32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletePost/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_deletePost32_invoker = createInvoker(
    CommunityCtrl_0.deletePost(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "deletePost",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deletePost/""" + "$" + """postId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_CommunityCtrl_deleteReply33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteReply/"), DynamicPart("replyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_deleteReply33_invoker = createInvoker(
    CommunityCtrl_0.deleteReply(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "deleteReply",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteReply/""" + "$" + """replyId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_CommunityCtrl_createReview34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReview/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReview34_invoker = createInvoker(
    CommunityCtrl_0.createReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "createReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """createReview/""" + "$" + """prodId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_CommunityCtrl_createReviewSubmit35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReviewSubmit/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReviewSubmit35_invoker = createInvoker(
    CommunityCtrl_0.createReviewSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "createReviewSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """createReviewSubmit/""" + "$" + """prodId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_CommunityCtrl_deleteReview36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteReview/"), DynamicPart("reviewId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_deleteReview36_invoker = createInvoker(
    CommunityCtrl_0.deleteReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "deleteReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteReview/""" + "$" + """reviewId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Assets_versioned37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned37_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductCtrl_index0_route(params@_) =>
      call { 
        controllers_ProductCtrl_index0_invoker.call(ProductCtrl_1.index())
      }
  
    // @LINE:10
    case controllers_ProductCtrl_listProducts1_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProductCtrl_listProducts1_invoker.call(ProductCtrl_1.listProducts(cat, filter))
      }
  
    // @LINE:11
    case controllers_ProductCtrl_productDetails2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductCtrl_productDetails2_invoker.call(ProductCtrl_1.productDetails(id))
      }
  
    // @LINE:14
    case controllers_CommunityCtrl_addUser3_route(params@_) =>
      call { 
        controllers_CommunityCtrl_addUser3_invoker.call(CommunityCtrl_0.addUser)
      }
  
    // @LINE:15
    case controllers_CommunityCtrl_addUserSubmit4_route(params@_) =>
      call { 
        controllers_CommunityCtrl_addUserSubmit4_invoker.call(CommunityCtrl_0.addUserSubmit)
      }
  
    // @LINE:16
    case controllers_CommunityCtrl_usersPage5_route(params@_) =>
      call { 
        controllers_CommunityCtrl_usersPage5_invoker.call(CommunityCtrl_0.usersPage)
      }
  
    // @LINE:18
    case controllers_security_LoginCtrl_login6_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_login6_invoker.call(LoginCtrl_4.login())
      }
  
    // @LINE:19
    case controllers_security_LoginCtrl_loginSubmit7_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit7_invoker.call(LoginCtrl_4.loginSubmit())
      }
  
    // @LINE:20
    case controllers_security_LoginCtrl_logout8_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_logout8_invoker.call(LoginCtrl_4.logout())
      }
  
    // @LINE:23
    case controllers_ShoppingCtrl_showBasket9_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket9_invoker.call(ShoppingCtrl_2.showBasket())
      }
  
    // @LINE:24
    case controllers_ShoppingCtrl_addToBasket10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket10_invoker.call(ShoppingCtrl_2.addToBasket(id))
      }
  
    // @LINE:25
    case controllers_ShoppingCtrl_addOne11_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne11_invoker.call(ShoppingCtrl_2.addOne(itemId))
      }
  
    // @LINE:26
    case controllers_ShoppingCtrl_removeOne12_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne12_invoker.call(ShoppingCtrl_2.removeOne(itemId))
      }
  
    // @LINE:27
    case controllers_ShoppingCtrl_emptyBasket13_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket13_invoker.call(ShoppingCtrl_2.emptyBasket())
      }
  
    // @LINE:28
    case controllers_ShoppingCtrl_placeOrder14_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder14_invoker.call(ShoppingCtrl_2.placeOrder())
      }
  
    // @LINE:29
    case controllers_ShoppingCtrl_viewOrder15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder15_invoker.call(ShoppingCtrl_2.viewOrder(id))
      }
  
    // @LINE:30
    case controllers_ShoppingCtrl_viewOrders16_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrders16_invoker.call(ShoppingCtrl_2.viewOrders(id))
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_cancelOrder17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_cancelOrder17_invoker.call(ShoppingCtrl_2.cancelOrder(id))
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_confirmPurchase18_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_confirmPurchase18_invoker.call(ShoppingCtrl_2.confirmPurchase())
      }
  
    // @LINE:33
    case controllers_ShoppingCtrl_addToWallet19_route(params@_) =>
      call(params.fromQuery[Float]("amount", None)) { (amount) =>
        controllers_ShoppingCtrl_addToWallet19_invoker.call(ShoppingCtrl_2.addToWallet(amount))
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_addToWalletSubmit20_route(params@_) =>
      call(params.fromQuery[Float]("amount", None)) { (amount) =>
        controllers_ShoppingCtrl_addToWalletSubmit20_invoker.call(ShoppingCtrl_2.addToWalletSubmit(amount))
      }
  
    // @LINE:38
    case controllers_AdminProductCtrl_addProduct21_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct21_invoker.call(AdminProductCtrl_3.addProduct())
      }
  
    // @LINE:39
    case controllers_AdminProductCtrl_addProductSubmit22_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit22_invoker.call(AdminProductCtrl_3.addProductSubmit())
      }
  
    // @LINE:41
    case controllers_AdminProductCtrl_updateProduct23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct23_invoker.call(AdminProductCtrl_3.updateProduct(id))
      }
  
    // @LINE:42
    case controllers_AdminProductCtrl_updateProductSubmit24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit24_invoker.call(AdminProductCtrl_3.updateProductSubmit(id))
      }
  
    // @LINE:44
    case controllers_AdminProductCtrl_deleteProduct25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct25_invoker.call(AdminProductCtrl_3.deleteProduct(id))
      }
  
    // @LINE:47
    case controllers_CommunityCtrl_forumPage26_route(params@_) =>
      call(params.fromQuery[Long]("prod", Some(0)), params.fromQuery[String]("filter", Some(""))) { (prod, filter) =>
        controllers_CommunityCtrl_forumPage26_invoker.call(CommunityCtrl_0.forumPage(prod, filter))
      }
  
    // @LINE:48
    case controllers_CommunityCtrl_viewPost27_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_viewPost27_invoker.call(CommunityCtrl_0.viewPost(postId))
      }
  
    // @LINE:50
    case controllers_CommunityCtrl_createPost28_route(params@_) =>
      call { 
        controllers_CommunityCtrl_createPost28_invoker.call(CommunityCtrl_0.createPost())
      }
  
    // @LINE:51
    case controllers_CommunityCtrl_createReply29_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_createReply29_invoker.call(CommunityCtrl_0.createReply(postId))
      }
  
    // @LINE:52
    case controllers_CommunityCtrl_createPostSubmit30_route(params@_) =>
      call { 
        controllers_CommunityCtrl_createPostSubmit30_invoker.call(CommunityCtrl_0.createPostSubmit())
      }
  
    // @LINE:53
    case controllers_CommunityCtrl_createReplySubmit31_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_createReplySubmit31_invoker.call(CommunityCtrl_0.createReplySubmit(postId))
      }
  
    // @LINE:54
    case controllers_CommunityCtrl_deletePost32_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_deletePost32_invoker.call(CommunityCtrl_0.deletePost(postId))
      }
  
    // @LINE:55
    case controllers_CommunityCtrl_deleteReply33_route(params@_) =>
      call(params.fromPath[Long]("replyId", None)) { (replyId) =>
        controllers_CommunityCtrl_deleteReply33_invoker.call(CommunityCtrl_0.deleteReply(replyId))
      }
  
    // @LINE:57
    case controllers_CommunityCtrl_createReview34_route(params@_) =>
      call(params.fromPath[Long]("prodId", None)) { (prodId) =>
        controllers_CommunityCtrl_createReview34_invoker.call(CommunityCtrl_0.createReview(prodId))
      }
  
    // @LINE:58
    case controllers_CommunityCtrl_createReviewSubmit35_route(params@_) =>
      call(params.fromPath[Long]("prodId", None)) { (prodId) =>
        controllers_CommunityCtrl_createReviewSubmit35_invoker.call(CommunityCtrl_0.createReviewSubmit(prodId))
      }
  
    // @LINE:59
    case controllers_CommunityCtrl_deleteReview36_route(params@_) =>
      call(params.fromPath[Long]("reviewId", None)) { (reviewId) =>
        controllers_CommunityCtrl_deleteReview36_invoker.call(CommunityCtrl_0.deleteReview(reviewId))
      }
  
    // @LINE:62
    case controllers_Assets_versioned37_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned37_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
