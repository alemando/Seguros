
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

object consola extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Cliente,Cliente,Cliente,List[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /* consola Template File */
  def apply/*2.2*/(titulo: String)(c1: Cliente)(c2: Cliente)(c3: Cliente)(lista: List[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>Consola</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <h1>"""),_display_(/*13.10*/titulo),format.raw/*13.16*/("""</h1>
    <p>"""),_display_(/*14.9*/c1),format.raw/*14.11*/("""</p>
    <p>"""),_display_(/*15.9*/c2),format.raw/*15.11*/("""</p>
    <p>"""),_display_(/*16.9*/c3),format.raw/*16.11*/("""</p>
    <ul>
	"""),_display_(/*18.3*/for(cliente <- lista) yield /*18.24*/ {_display_(Seq[Any](format.raw/*18.26*/("""
  		"""),format.raw/*19.5*/("""<li>"""),_display_(/*19.10*/cliente),format.raw/*19.17*/("""</li>
  		<li>"""),_display_(/*20.10*/cliente/*20.17*/.nombre),format.raw/*20.24*/("""</li>
	""")))}),format.raw/*21.3*/("""
	"""),format.raw/*22.2*/("""</ul>
</body>

</html>"""))
      }
    }
  }

  def render(titulo:String,c1:Cliente,c2:Cliente,c3:Cliente,lista:List[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(titulo)(c1)(c2)(c3)(lista)

  def f:((String) => (Cliente) => (Cliente) => (Cliente) => (List[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (titulo) => (c1) => (c2) => (c3) => (lista) => apply(titulo)(c1)(c2)(c3)(lista)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-09T11:16:08.391
                  SOURCE: C:/Users/MSI-PC/git/Seguros/app/views/consola.scala.html
                  HASH: 3baf412e596dc379e04e22ca55307b3ce625c97b
                  MATRIX: 792->29|963->107|990->108|1185->276|1212->282|1252->296|1275->298|1314->311|1337->313|1376->326|1399->328|1441->344|1478->365|1518->367|1550->372|1582->377|1610->384|1652->399|1668->406|1696->413|1734->421|1763->423
                  LINES: 21->2|26->3|27->4|36->13|36->13|37->14|37->14|38->15|38->15|39->16|39->16|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|45->22
                  -- GENERATED --
              */
          