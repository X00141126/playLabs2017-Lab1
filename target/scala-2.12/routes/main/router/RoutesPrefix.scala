
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/laralagioia/webapps/HelloWorld/conf/routes
// @DATE:Fri Oct 20 23:55:03 IST 2017


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
