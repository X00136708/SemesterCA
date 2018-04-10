
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/SemesterCA/conf/routes
// @DATE:Tue Apr 10 16:53:29 IST 2018


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
