
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play! Login Sample")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

    """),format.raw/*5.5*/("""<h1>Play! Login Sample</h1>
   <p> """),_display_(/*6.9*/message),format.raw/*6.16*/("""</p>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue May 02 14:18:37 MMT 2017
                  SOURCE: D:/playPages/impPlay/t1/test-play-java/app/views/index.scala.html
                  HASH: d60cb135217040527a9afaddfdb2d565c07e0f56
                  MATRIX: 745->1|857->18|887->23|932->60|971->62|1005->70|1067->107|1094->114
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6
                  -- GENERATED --
              */
          