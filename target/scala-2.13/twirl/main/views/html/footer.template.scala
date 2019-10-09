
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
"""),format.raw/*3.1*/("""<footer class="footer">
	<span class="text-right">
	Copyright <a target="_blank" href="#">Seguros Inequidad</a>
	</span>
	<span class="float-right">
	Powered by <a target="_blank" href="https://www.pikeadmin.com"><b>Pike Admin</b></a>
	</span>
</footer>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: 2019-10-09T15:39:33.623
                  SOURCE: C:/Users/Usuario/Desktop/seguros/app/views/footer.scala.html
=======
                  DATE: 2019-10-09T00:25:24.145
                  SOURCE: C:/Users/juanm/Documents/documentosImportantes/semestre 6/Requisitos/Seguros/app/views/footer.scala.html
>>>>>>> 2c6dcd706cc061fcd3e7b45a3cd8c3c3f9645140
                  HASH: 0f0ccdca694f9e5602c7fd5bd55233f7533d0dff
                  MATRIX: 723->1|819->3|847->6|894->45|944->58|972->60
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3
                  -- GENERATED --
              */
          