
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

object SellerYes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* SellerYes Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang = "e">

<head>
	<title> </title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
	<h1> Hola que hace, di yes vendedor</h1>
	<p>	Esta pagina es para mostrar los datos creados de vendedor o Seller</p>
	<p> """),_display_(/*15.7*/param),format.raw/*15.12*/(""" """),format.raw/*15.13*/("""</p>
</body>

</html>
"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-08T16:09:32.350
                  SOURCE: D:/INGENIERIA DE SISTEMAS/Ingenieria de Requisitos/Seguros/app/views/SellerYes.scala.html
                  HASH: c4cb9ecd56f0cffbdd312e4bd97b1138537251bf
                  MATRIX: 755->32|862->44|892->48|1201->331|1227->336|1256->337
                  LINES: 21->2|26->2|28->4|39->15|39->15|39->15
                  -- GENERATED --
              */
          