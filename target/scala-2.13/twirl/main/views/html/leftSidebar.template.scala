
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


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
	"""),format.raw/*3.2*/("""<div class="left main-sidebar">
	
		<div class="sidebar-inner leftscroll">

			<div id="sidebar-menu">
        
			<ul>

					<li class="submenu">
						<a href="index.html"><i class="fa fa-fw fa-bars"></i><span> Home </span> </a>
                    </li>
										
                    <li class="submenu">
                        <a href="/clientes" """),_display_(/*16.46*/if(name=="Clientes")/*16.66*/{_display_(Seq[Any](format.raw/*16.67*/(""" """),format.raw/*16.68*/("""class="active" """)))}),format.raw/*16.84*/("""><i class="fa fa-fw fa-tv"></i> <span> Clientes</span> <span class="menu-arrow"></span></a>
                            <ul class="list-unstyled">
                                <li """),_display_(/*18.38*/if(name=="Clientes")/*18.58*/{_display_(Seq[Any](format.raw/*18.59*/(""" """),format.raw/*18.60*/("""class="active" """)))}),format.raw/*18.76*/("""><a href="/clientes">Ver Clientes</a></li>
                            </ul>
                    </li>

                    <li class='submenu'>
                        <a href='/' """),_display_(/*23.38*/if(name=="Aseguradoras")/*23.62*/{_display_(Seq[Any](format.raw/*23.63*/(""" """),format.raw/*23.64*/("""class="active" """)))}),format.raw/*23.80*/("""><i class='fa fa-fw fa-tv'></i> <span> Aseguradoras</span> <span class='menu-arrow'></span></a>
                        <ul class='list-unstyled'>
                            <li """),_display_(/*25.34*/if(name=="Aseguradoras")/*25.58*/{_display_(Seq[Any](format.raw/*25.59*/(""" """),format.raw/*25.60*/("""class="active" """)))}),format.raw/*25.76*/("""><a href='/'>Ver Aseguradoras </a></li>
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
<<<<<<< HEAD
                  DATE: 2019-10-09T15:53:43.657
                  SOURCE: C:/Users/Usuario/Desktop/seguros/app/views/leftSidebar.scala.html
                  HASH: 4638c59da0320963eef216221ba0bc7dd6fe3715
                  MATRIX: 735->1|844->15|872->18|919->57|969->70|998->73|1392->440|1421->460|1460->461|1489->462|1536->478|1749->664|1778->684|1817->685|1846->686|1893->702|2107->889|2140->913|2179->914|2208->915|2255->931|2464->1113|2497->1137|2536->1138|2565->1139|2612->1155
=======
                  DATE: 2019-10-09T00:25:24.228
                  SOURCE: C:/Users/juanm/Documents/documentosImportantes/semestre 6/Requisitos/Seguros/app/views/leftSidebar.scala.html
                  HASH: 4f2004d2b16923df7856b4f1ceceae5d93e985ed
                  MATRIX: 735->1|844->15|872->18|919->57|969->70|998->73|1384->432|1413->452|1452->453|1481->454|1528->470|1741->656|1770->676|1809->677|1838->678|1885->694|2103->885|2136->909|2175->910|2204->911|2251->927|2460->1109|2493->1133|2532->1134|2561->1135|2608->1151
>>>>>>> 2c6dcd706cc061fcd3e7b45a3cd8c3c3f9645140
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|48->23|48->23|48->23|48->23|48->23|50->25|50->25|50->25|50->25|50->25
                  -- GENERATED --
              */
          