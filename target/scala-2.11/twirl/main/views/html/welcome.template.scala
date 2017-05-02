
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
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

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/main("Welcome to Play! Login Sample")/*2.39*/ {_display_(Seq[Any](format.raw/*2.41*/("""

    """),format.raw/*4.5*/("""<h1>Play! Login Sample</h1>
   
   <h3> Welcome To Play Login Example.</h3>
   <p> """),_display_(/*7.9*/message),format.raw/*7.16*/("""</p>
    <a href=""""),_display_(/*8.15*/routes/*8.21*/.HomeController.logout()),format.raw/*8.45*/("""" class="btn">Log Out</a>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Tue May 02 14:18:37 MMT 2017
                  SOURCE: D:/playPages/impPlay/t1/test-play-java/app/views/welcome.scala.html
                  HASH: 861a647ea152845b064ce356f665eef860c48279
                  MATRIX: 749->1|861->18|889->21|934->58|973->60|1007->68|1119->155|1146->162|1192->182|1206->188|1250->212|1307->240
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|38->7|38->7|39->8|39->8|39->8|40->9
                  -- GENERATED --
              */
          