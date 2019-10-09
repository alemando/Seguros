
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


Seq[Any](_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
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
                  DATE: 2019-10-09T11:16:08.398
                  SOURCE: C:/Users/MSI-PC/git/Seguros/app/views/footer.scala.html
                  HASH: 9961b41e06aa0d0b93c1715ec831cf889e251e0a
                  MATRIX: 723->1|819->5|866->44|916->57|943->58
                  LINES: 21->1|26->2|26->2|26->2|27->3
                  -- GENERATED --
              */
          