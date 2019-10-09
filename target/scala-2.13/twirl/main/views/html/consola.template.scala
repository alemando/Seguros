
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


Seq[Any](format.raw/*2.79*/("""

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
                  DATE: 2019-10-09T16:13:18.351
                  SOURCE: C:/Users/Usuario/Desktop/seguros/app/views/consola.scala.html
                  HASH: 7b9a7fce68c7be35b7246a6a61b278d6dbcd403f
                  MATRIX: 792->30|964->107|994->111|1198->288|1225->294|1266->309|1289->311|1329->325|1352->327|1392->341|1415->343|1459->361|1496->382|1536->384|1569->390|1601->395|1629->402|1672->418|1688->425|1716->432|1755->441|1785->444
                  LINES: 21->2|26->2|28->4|37->13|37->13|38->14|38->14|39->15|39->15|40->16|40->16|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|46->22
                  -- GENERATED --
              */
          