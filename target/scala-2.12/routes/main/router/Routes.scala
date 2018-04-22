
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doran/Documents/2ndYearProject/semesterca/conf/routes
// @DATE:Sun Apr 22 11:50:01 BST 2018

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
  // @LINE:12
  CommunityCtrl_0: controllers.CommunityCtrl,
  // @LINE:21
  LoginCtrl_4: controllers.security.LoginCtrl,
  // @LINE:26
  ShoppingCtrl_2: controllers.ShoppingCtrl,
  // @LINE:41
  AdminProductCtrl_3: controllers.AdminProductCtrl,
  // @LINE:72
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductCtrl_1: controllers.ProductCtrl,
    // @LINE:12
    CommunityCtrl_0: controllers.CommunityCtrl,
    // @LINE:21
    LoginCtrl_4: controllers.security.LoginCtrl,
    // @LINE:26
    ShoppingCtrl_2: controllers.ShoppingCtrl,
    // @LINE:41
    AdminProductCtrl_3: controllers.AdminProductCtrl,
    // @LINE:72
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vote/addOne""", """controllers.CommunityCtrl.vote"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """donate""", """controllers.CommunityCtrl.donate()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myaccount""", """controllers.CommunityCtrl.myAccount()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUser/""" + "$" + """id<[^/]+>""", """controllers.CommunityCtrl.updateUser(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserSubmit/""" + "$" + """id<[^/]+>""", """controllers.CommunityCtrl.updateUserSubmit(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser/""" + "$" + """id<[^/]+>""", """controllers.CommunityCtrl.deleteUser(id:String)"""),
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

  // @LINE:12
  private[this] lazy val controllers_CommunityCtrl_vote3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vote/addOne")))
  )
  private[this] lazy val controllers_CommunityCtrl_vote3_invoker = createInvoker(
    CommunityCtrl_0.vote,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "vote",
      Nil,
      "POST",
      this.prefix + """vote/addOne""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CommunityCtrl_donate4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("donate")))
  )
  private[this] lazy val controllers_CommunityCtrl_donate4_invoker = createInvoker(
    CommunityCtrl_0.donate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "donate",
      Nil,
      "POST",
      this.prefix + """donate""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CommunityCtrl_addUser5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_CommunityCtrl_addUser5_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_CommunityCtrl_addUserSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_CommunityCtrl_addUserSubmit6_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_CommunityCtrl_usersPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usersPage")))
  )
  private[this] lazy val controllers_CommunityCtrl_usersPage7_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_security_LoginCtrl_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login8_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit9_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_security_LoginCtrl_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout10_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_ShoppingCtrl_showBasket11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket11_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_ShoppingCtrl_addToBasket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket12_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_ShoppingCtrl_addOne13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne13_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_ShoppingCtrl_removeOne14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne14_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket15_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_placeOrder16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder16_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_viewOrder17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder17_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_ShoppingCtrl_viewOrders18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrders18_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder19_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_ShoppingCtrl_confirmPurchase20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkOut")))
  )
  private[this] lazy val controllers_ShoppingCtrl_confirmPurchase20_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_ShoppingCtrl_addToWallet21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToWallet")))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToWallet21_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_ShoppingCtrl_addToWalletSubmit22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToWalletSubmit")))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToWalletSubmit22_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_AdminProductCtrl_addProduct23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct23_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit24_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_AdminProductCtrl_updateProduct25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct25_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit26_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct27_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_CommunityCtrl_myAccount28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myaccount")))
  )
  private[this] lazy val controllers_CommunityCtrl_myAccount28_invoker = createInvoker(
    CommunityCtrl_0.myAccount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "myAccount",
      Nil,
      "GET",
      this.prefix + """myaccount""",
      """ Community""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_CommunityCtrl_forumPage29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forumPage")))
  )
  private[this] lazy val controllers_CommunityCtrl_forumPage29_invoker = createInvoker(
    CommunityCtrl_0.forumPage(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "forumPage",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """forumPage""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_CommunityCtrl_viewPost30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewPost/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_viewPost30_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_CommunityCtrl_createPost31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPost")))
  )
  private[this] lazy val controllers_CommunityCtrl_createPost31_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_CommunityCtrl_createReply32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReply/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReply32_invoker = createInvoker(
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

  // @LINE:57
  private[this] lazy val controllers_CommunityCtrl_createPostSubmit33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPostSubmit")))
  )
  private[this] lazy val controllers_CommunityCtrl_createPostSubmit33_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_CommunityCtrl_createReplySubmit34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReplySubmit/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReplySubmit34_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_CommunityCtrl_deletePost35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletePost/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_deletePost35_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_CommunityCtrl_deleteReply36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteReply/"), DynamicPart("replyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_deleteReply36_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_CommunityCtrl_createReview37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReview/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReview37_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_CommunityCtrl_createReviewSubmit38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createReviewSubmit/"), DynamicPart("prodId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_createReviewSubmit38_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_CommunityCtrl_deleteReview39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteReview/"), DynamicPart("reviewId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_deleteReview39_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_CommunityCtrl_updateUser40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_updateUser40_invoker = createInvoker(
    CommunityCtrl_0.updateUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "updateUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateUser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_CommunityCtrl_updateUserSubmit41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_updateUserSubmit41_invoker = createInvoker(
    CommunityCtrl_0.updateUserSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "updateUserSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """updateUserSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_CommunityCtrl_deleteUser42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommunityCtrl_deleteUser42_invoker = createInvoker(
    CommunityCtrl_0.deleteUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommunityCtrl",
      "deleteUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteUser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Assets_versioned43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned43_invoker = createInvoker(
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
  
    // @LINE:12
    case controllers_CommunityCtrl_vote3_route(params@_) =>
      call { 
        controllers_CommunityCtrl_vote3_invoker.call(CommunityCtrl_0.vote)
      }
  
    // @LINE:13
    case controllers_CommunityCtrl_donate4_route(params@_) =>
      call { 
        controllers_CommunityCtrl_donate4_invoker.call(CommunityCtrl_0.donate())
      }
  
    // @LINE:17
    case controllers_CommunityCtrl_addUser5_route(params@_) =>
      call { 
        controllers_CommunityCtrl_addUser5_invoker.call(CommunityCtrl_0.addUser)
      }
  
    // @LINE:18
    case controllers_CommunityCtrl_addUserSubmit6_route(params@_) =>
      call { 
        controllers_CommunityCtrl_addUserSubmit6_invoker.call(CommunityCtrl_0.addUserSubmit)
      }
  
    // @LINE:19
    case controllers_CommunityCtrl_usersPage7_route(params@_) =>
      call { 
        controllers_CommunityCtrl_usersPage7_invoker.call(CommunityCtrl_0.usersPage)
      }
  
    // @LINE:21
    case controllers_security_LoginCtrl_login8_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_login8_invoker.call(LoginCtrl_4.login())
      }
  
    // @LINE:22
    case controllers_security_LoginCtrl_loginSubmit9_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit9_invoker.call(LoginCtrl_4.loginSubmit())
      }
  
    // @LINE:23
    case controllers_security_LoginCtrl_logout10_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_logout10_invoker.call(LoginCtrl_4.logout())
      }
  
    // @LINE:26
    case controllers_ShoppingCtrl_showBasket11_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket11_invoker.call(ShoppingCtrl_2.showBasket())
      }
  
    // @LINE:27
    case controllers_ShoppingCtrl_addToBasket12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket12_invoker.call(ShoppingCtrl_2.addToBasket(id))
      }
  
    // @LINE:28
    case controllers_ShoppingCtrl_addOne13_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne13_invoker.call(ShoppingCtrl_2.addOne(itemId))
      }
  
    // @LINE:29
    case controllers_ShoppingCtrl_removeOne14_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne14_invoker.call(ShoppingCtrl_2.removeOne(itemId))
      }
  
    // @LINE:30
    case controllers_ShoppingCtrl_emptyBasket15_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket15_invoker.call(ShoppingCtrl_2.emptyBasket())
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_placeOrder16_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder16_invoker.call(ShoppingCtrl_2.placeOrder())
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_viewOrder17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder17_invoker.call(ShoppingCtrl_2.viewOrder(id))
      }
  
    // @LINE:33
    case controllers_ShoppingCtrl_viewOrders18_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrders18_invoker.call(ShoppingCtrl_2.viewOrders(id))
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_cancelOrder19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_cancelOrder19_invoker.call(ShoppingCtrl_2.cancelOrder(id))
      }
  
    // @LINE:35
    case controllers_ShoppingCtrl_confirmPurchase20_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_confirmPurchase20_invoker.call(ShoppingCtrl_2.confirmPurchase())
      }
  
    // @LINE:36
    case controllers_ShoppingCtrl_addToWallet21_route(params@_) =>
      call(params.fromQuery[Float]("amount", None)) { (amount) =>
        controllers_ShoppingCtrl_addToWallet21_invoker.call(ShoppingCtrl_2.addToWallet(amount))
      }
  
    // @LINE:37
    case controllers_ShoppingCtrl_addToWalletSubmit22_route(params@_) =>
      call(params.fromQuery[Float]("amount", None)) { (amount) =>
        controllers_ShoppingCtrl_addToWalletSubmit22_invoker.call(ShoppingCtrl_2.addToWalletSubmit(amount))
      }
  
    // @LINE:41
    case controllers_AdminProductCtrl_addProduct23_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct23_invoker.call(AdminProductCtrl_3.addProduct())
      }
  
    // @LINE:42
    case controllers_AdminProductCtrl_addProductSubmit24_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit24_invoker.call(AdminProductCtrl_3.addProductSubmit())
      }
  
    // @LINE:44
    case controllers_AdminProductCtrl_updateProduct25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct25_invoker.call(AdminProductCtrl_3.updateProduct(id))
      }
  
    // @LINE:45
    case controllers_AdminProductCtrl_updateProductSubmit26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit26_invoker.call(AdminProductCtrl_3.updateProductSubmit(id))
      }
  
    // @LINE:47
    case controllers_AdminProductCtrl_deleteProduct27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct27_invoker.call(AdminProductCtrl_3.deleteProduct(id))
      }
  
    // @LINE:50
    case controllers_CommunityCtrl_myAccount28_route(params@_) =>
      call { 
        controllers_CommunityCtrl_myAccount28_invoker.call(CommunityCtrl_0.myAccount())
      }
  
    // @LINE:52
    case controllers_CommunityCtrl_forumPage29_route(params@_) =>
      call(params.fromQuery[Long]("prod", Some(0)), params.fromQuery[String]("filter", Some(""))) { (prod, filter) =>
        controllers_CommunityCtrl_forumPage29_invoker.call(CommunityCtrl_0.forumPage(prod, filter))
      }
  
    // @LINE:53
    case controllers_CommunityCtrl_viewPost30_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_viewPost30_invoker.call(CommunityCtrl_0.viewPost(postId))
      }
  
    // @LINE:55
    case controllers_CommunityCtrl_createPost31_route(params@_) =>
      call { 
        controllers_CommunityCtrl_createPost31_invoker.call(CommunityCtrl_0.createPost())
      }
  
    // @LINE:56
    case controllers_CommunityCtrl_createReply32_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_createReply32_invoker.call(CommunityCtrl_0.createReply(postId))
      }
  
    // @LINE:57
    case controllers_CommunityCtrl_createPostSubmit33_route(params@_) =>
      call { 
        controllers_CommunityCtrl_createPostSubmit33_invoker.call(CommunityCtrl_0.createPostSubmit())
      }
  
    // @LINE:58
    case controllers_CommunityCtrl_createReplySubmit34_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_createReplySubmit34_invoker.call(CommunityCtrl_0.createReplySubmit(postId))
      }
  
    // @LINE:59
    case controllers_CommunityCtrl_deletePost35_route(params@_) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommunityCtrl_deletePost35_invoker.call(CommunityCtrl_0.deletePost(postId))
      }
  
    // @LINE:60
    case controllers_CommunityCtrl_deleteReply36_route(params@_) =>
      call(params.fromPath[Long]("replyId", None)) { (replyId) =>
        controllers_CommunityCtrl_deleteReply36_invoker.call(CommunityCtrl_0.deleteReply(replyId))
      }
  
    // @LINE:62
    case controllers_CommunityCtrl_createReview37_route(params@_) =>
      call(params.fromPath[Long]("prodId", None)) { (prodId) =>
        controllers_CommunityCtrl_createReview37_invoker.call(CommunityCtrl_0.createReview(prodId))
      }
  
    // @LINE:63
    case controllers_CommunityCtrl_createReviewSubmit38_route(params@_) =>
      call(params.fromPath[Long]("prodId", None)) { (prodId) =>
        controllers_CommunityCtrl_createReviewSubmit38_invoker.call(CommunityCtrl_0.createReviewSubmit(prodId))
      }
  
    // @LINE:64
    case controllers_CommunityCtrl_deleteReview39_route(params@_) =>
      call(params.fromPath[Long]("reviewId", None)) { (reviewId) =>
        controllers_CommunityCtrl_deleteReview39_invoker.call(CommunityCtrl_0.deleteReview(reviewId))
      }
  
    // @LINE:66
    case controllers_CommunityCtrl_updateUser40_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CommunityCtrl_updateUser40_invoker.call(CommunityCtrl_0.updateUser(id))
      }
  
    // @LINE:67
    case controllers_CommunityCtrl_updateUserSubmit41_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CommunityCtrl_updateUserSubmit41_invoker.call(CommunityCtrl_0.updateUserSubmit(id))
      }
  
    // @LINE:68
    case controllers_CommunityCtrl_deleteUser42_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CommunityCtrl_deleteUser42_invoker.call(CommunityCtrl_0.deleteUser(id))
      }
  
    // @LINE:72
    case controllers_Assets_versioned43_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned43_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
