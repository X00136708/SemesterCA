
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/new/SemesterCA/conf/routes
// @DATE:Sat Apr 21 16:05:18 BST 2018


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
