
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("login")/*7.15*/ {_display_(Seq[Any](format.raw/*7.17*/("""
 
    """),_display_(/*9.6*/b3/*9.8*/.form(routes.HomeController.postLogin())/*9.48*/ {_display_(Seq[Any](format.raw/*9.50*/("""
        
        """),format.raw/*11.9*/("""<fieldset>
            """),_display_(/*12.14*/b3/*12.16*/.text(userForm("email"), '_label -> "Email", '_help -> "")),format.raw/*12.74*/("""
            """),_display_(/*13.14*/b3/*13.16*/.text(userForm("password"), '_label -> "Password", '_help -> "")),format.raw/*13.80*/("""
        """),format.raw/*14.9*/("""</fieldset>
        
        <div class="actions">
            <input type="submit" value="Login" class="btn primary">
            or
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.signUp()),format.raw/*19.53*/("""" class="btn">Sign Up</a>
        </div>
        
    """)))}),format.raw/*22.6*/("""
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Apr 27 14:23:52 MMT 2017
                  SOURCE: D:/playPages/impPlay/t1/test-play-java/app/views/login.scala.html
                  HASH: 55b514fd2c46262ad906830ca394fbb9e7ff0739
                  MATRIX: 749->1|917->23|947->45|975->85|1003->88|1024->101|1063->103|1098->113|1107->115|1155->155|1194->157|1241->177|1293->202|1304->204|1383->262|1425->277|1436->279|1521->343|1558->353|1746->514|1761->520|1806->544|1894->602|1927->605
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|39->9|39->9|39->9|39->9|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|49->19|49->19|49->19|52->22|53->23
                  -- GENERATED --
              */
          