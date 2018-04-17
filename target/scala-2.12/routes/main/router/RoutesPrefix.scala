
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doran/Documents/2ndYearProject/newSemca/semesterca/conf/routes
// @DATE:Tue Apr 17 16:48:06 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
