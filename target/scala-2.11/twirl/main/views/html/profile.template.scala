
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

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
    
    """),format.raw/*9.5*/("""<h1>User Profile</h1>
    
    """),_display_(/*11.6*/b3/*11.8*/.form(routes.HomeController.postProfile())/*11.50*/ {_display_(Seq[Any](format.raw/*11.52*/("""
        
        """),format.raw/*13.9*/("""<fieldset>
            """),_display_(/*14.14*/b3/*14.16*/.text(userForm("name"), '_label -> "User name", '_help -> "")),format.raw/*14.77*/("""
            """),_display_(/*15.14*/b3/*15.16*/.text(userForm("password"), '_label -> "Password", '_help -> "")),format.raw/*15.80*/("""
            """),_display_(/*16.14*/b3/*16.16*/.text(userForm("email"), '_label -> "Email", '_help -> "")),format.raw/*16.74*/("""
           
        """),format.raw/*18.9*/("""</fieldset>
        
        
            <input type="submit" value="Update" class="btn primary">
             or
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.logout()),format.raw/*23.53*/("""" class="btn">Log Out</a>

        
    """)))}),format.raw/*26.6*/("""
    
""")))}),format.raw/*28.2*/("""
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
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Tue May 02 15:51:19 MMT 2017
                  SOURCE: D:/playPages/impPlay/t1/test-play-java/app/views/profile.scala.html
                  HASH: 48fef789e8cfe1049f75f6421ddae3896b399108
                  MATRIX: 753->3|921->25|949->45|977->85|1005->88|1028->103|1067->105|1105->117|1165->151|1175->153|1226->195|1266->197|1313->217|1365->242|1376->244|1458->305|1500->320|1511->322|1596->386|1638->401|1649->403|1728->461|1778->484|1947->626|1962->632|2007->656|2081->700|2120->709
                  LINES: 27->2|33->2|34->4|35->6|36->7|36->7|36->7|38->9|40->11|40->11|40->11|40->11|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|47->18|52->23|52->23|52->23|55->26|57->28
                  -- GENERATED --
              */
          