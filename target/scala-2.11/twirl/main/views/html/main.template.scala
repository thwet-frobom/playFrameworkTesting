
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.twirl.api.Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(message: String)(content: play.twirl.api.Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.49*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>User</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body>
        """),format.raw/*19.32*/("""
        """),_display_(/*20.10*/content),format.raw/*20.17*/("""

        """),format.raw/*22.9*/("""<script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/main.js")),format.raw/*22.69*/("""" type="text/javascript"></script>
        
    </body>
</html>
"""))
      }
    }
  }

  def render(message:String,content:play.twirl.api.Html): play.twirl.api.HtmlFormat.Appendable = apply(message)(content)

  def f:((String) => (play.twirl.api.Html) => play.twirl.api.HtmlFormat.Appendable) = (message) => (content) => apply(message)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue May 02 14:18:37 MMT 2017
                  SOURCE: D:/playPages/impPlay/t1/test-play-java/app/views/main.scala.html
                  HASH: 0a457cbd406e6f84f386b3fa7aed50c3f4496fc8
                  MATRIX: 1022->266|1164->313|1194->317|1277->425|1314->435|1415->509|1430->515|1493->556|1582->618|1597->624|1658->663|1723->791|1761->802|1789->809|1828->821|1869->835|1884->841|1945->881
                  LINES: 32->7|37->7|39->9|42->12|43->13|44->14|44->14|44->14|45->15|45->15|45->15|48->19|49->20|49->20|51->22|51->22|51->22|51->22
                  -- GENERATED --
              */
          