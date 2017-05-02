
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/playPages/impPlay/t1/test-play-java/conf/routes
// @DATE:Tue May 02 14:45:01 MMT 2017


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
