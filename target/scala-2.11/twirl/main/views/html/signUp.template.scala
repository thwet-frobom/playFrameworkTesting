
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signUp_Scope0 {
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

class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Sign Up")/*7.17*/ {_display_(Seq[Any](format.raw/*7.19*/("""
    
    """),format.raw/*9.5*/("""<h1>User Register</h1>
    
    """),_display_(/*11.6*/b3/*11.8*/.form(routes.HomeController.postSignUP())/*11.49*/ {_display_(Seq[Any](format.raw/*11.51*/("""
        
        """),format.raw/*13.9*/("""<fieldset>
            """),_display_(/*14.14*/b3/*14.16*/.text(userForm("name"), '_label -> "User name", '_help -> "")),format.raw/*14.77*/("""
            """),_display_(/*15.14*/b3/*15.16*/.text(userForm("password"), '_label -> "Password", '_help -> "")),format.raw/*15.80*/("""
            """),_display_(/*16.14*/b3/*16.16*/.text(userForm("email"), '_label -> "Email", '_help -> "")),format.raw/*16.74*/("""
           
        """),format.raw/*18.9*/("""</fieldset>
        
        
            <input type="submit" value="SignUp" class="btn primary">

        
    """)))}),format.raw/*24.6*/("""
    
""")))}),format.raw/*26.2*/("""
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
object signUp extends signUp_Scope0.signUp
              /*
                  -- GENERATED --
                  DATE: Tue May 02 14:18:37 MMT 2017
                  SOURCE: D:/playPages/impPlay/t1/test-play-java/app/views/signUp.scala.html
                  HASH: 3d89bd03285578feb753619b5bb4679f60e8757b
                  MATRIX: 751->3|919->25|947->45|975->85|1003->88|1026->103|1065->105|1103->117|1164->152|1174->154|1224->195|1264->197|1311->217|1363->242|1374->244|1456->305|1498->320|1509->322|1594->386|1636->401|1647->403|1726->461|1776->484|1926->604|1965->613
                  LINES: 27->2|33->2|34->4|35->6|36->7|36->7|36->7|38->9|40->11|40->11|40->11|40->11|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|47->18|53->24|55->26
                  -- GENERATED --
              */
          