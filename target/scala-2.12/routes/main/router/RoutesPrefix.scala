
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Downloads/SemesterCA-master/conf/routes
// @DATE:Tue Apr 17 16:31:40 IST 2018


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
