
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SemesterCa/conf/routes
// @DATE:Mon Mar 12 20:14:47 GMT 2018


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
