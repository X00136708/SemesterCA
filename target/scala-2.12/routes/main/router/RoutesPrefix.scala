
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/brandon/Documents/SemesterCA/conf/routes
// @DATE:Mon Apr 09 01:04:48 IST 2018
=======
// @SOURCE:C:/Users/doran/Documents/2ndYearProject/semesterca/conf/routes
// @DATE:Sun Apr 08 20:03:29 BST 2018
>>>>>>> aa4120e9331252f7dd028526e355ada7dc39cce8


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
