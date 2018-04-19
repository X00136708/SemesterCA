
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SemesterCA/conf/routes
// @DATE:Thu Apr 19 09:20:24 IST 2018


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
