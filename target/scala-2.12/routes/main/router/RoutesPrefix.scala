
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/SemesterCA/conf/routes
// @DATE:Mon Apr 09 18:14:44 IST 2018


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
