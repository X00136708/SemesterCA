
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/semesterca/conf/routes
// @DATE:Mon Mar 12 14:08:20 GMT 2018


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
