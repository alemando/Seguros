
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

object leftSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
	"""),format.raw/*3.2*/("""<div class="left main-sidebar">
	
		<div class="sidebar-inner leftscroll">

			<div id="sidebar-menu">
        
			<ul>

					<li class="submenu">
						<a href="index.html"><i class="fa fa-fw fa-bars"></i><span> Home </span> </a>
                    </li>
										
                    <li class="submenu">
                        <a href="#" """),_display_(/*16.38*/if(name=="Clientes")/*16.58*/{_display_(Seq[Any](format.raw/*16.59*/(""" """),format.raw/*16.60*/("""class="active" """)))}),format.raw/*16.76*/("""><i class="fa fa-fw fa-tv"></i> <span> Clientes</span> <span class="menu-arrow"></span></a>
                            <ul class="list-unstyled">
                                <li """),_display_(/*18.38*/if(name=="Clientes")/*18.58*/{_display_(Seq[Any](format.raw/*18.59*/(""" """),format.raw/*18.60*/("""class="active" """)))}),format.raw/*18.76*/("""><a href="clientes.html">Ver Clientes</a></li>
                            </ul>
                    </li>

                    <li class='submenu'>
                        <a href='#' """),_display_(/*23.38*/if(name=="Aseguradoras")/*23.62*/{_display_(Seq[Any](format.raw/*23.63*/(""" """),format.raw/*23.64*/("""class="active" """)))}),format.raw/*23.80*/("""><i class='fa fa-fw fa-tv'></i> <span> Aseguradoras</span> <span class='menu-arrow'></span></a>
                        <ul class='list-unstyled'>
                            <li """),_display_(/*25.34*/if(name=="Aseguradoras")/*25.58*/{_display_(Seq[Any](format.raw/*25.59*/(""" """),format.raw/*25.60*/("""class="active" """)))}),format.raw/*25.76*/("""><a href='clientes.html'>Ver Aseguradoras </a></li>
                        </ul>
                    </li>
					
            </ul>

            <div class="clearfix"></div>

			</div>
        
			<div class="clearfix"></div>

		</div>

	</div>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-09T14:15:34.729
                  SOURCE: C:/Users/juanm/git/Seguros/app/views/leftSidebar.scala.html
                  HASH: f3f714217cc5ef154a21822c63c865b6b7bb0373
                  MATRIX: 735->1|843->17|890->56|940->69|968->71|1341->417|1370->437|1409->438|1438->439|1485->455|1696->639|1725->659|1764->660|1793->661|1840->677|2053->863|2086->887|2125->888|2154->889|2201->905|2408->1085|2441->1109|2480->1110|2509->1111|2556->1127
                  LINES: 21->1|26->2|26->2|26->2|27->3|40->16|40->16|40->16|40->16|40->16|42->18|42->18|42->18|42->18|42->18|47->23|47->23|47->23|47->23|47->23|49->25|49->25|49->25|49->25|49->25
                  -- GENERATED --
              */
          