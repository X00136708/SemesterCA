
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Documents/SemesterCA/conf/routes
// @DATE:Fri Apr 06 22:18:10 IST 2018


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
