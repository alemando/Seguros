
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

                    <li class='submenu'>
                        <a href='#' data-target="#añadirCategoria" data-toggle="modal"><i class='fa fa-fw fa-tv'></i> <span> Agregar Categoría</span></a>
                    </li>
					
            </ul>

            <div class="clearfix"></div>

			</div>
        
			<div class="clearfix"></div>

		</div>

    </div>
        <!-- Modal -->
        <div class="modal fade" id="añadirCategoria" tabindex="-1" role="dialog" aria-labelledby="customModal" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="titleAñadirCategoria">Añadir una Categoría</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form autocomplete="off" action="#" id="form-añadirCategoria">
                            <div class="form-group">
                                <label>Nombre<span class="text-danger">*</span></label>
                                <input name="categoria" type="text" class="form-control" id="input-nombre-categoria" placeholder="Nombre" required autocomplete="off">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal" id="cancelar-añadirCategoria">Cancelar</button>
                        <button type="submit" class="btn btn-success">Registrar</button>
                    </form>
                </div>
                </div>
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
                  DATE: 2019-10-09T17:34:23.156
                  SOURCE: C:/Users/user/Documents/GitHub/Seguros/app/views/leftSidebar.scala.html
                  HASH: b8db9d50dc45936efdaace738d18115cbd329b8a
                  MATRIX: 735->1|844->15|872->18|919->57|969->70|998->73|1384->432|1413->452|1452->453|1481->454|1528->470|1741->656|1770->676|1809->677|1838->678|1885->694|2103->885|2136->909|2175->910|2204->911|2251->927|2460->1109|2493->1133|2532->1134|2561->1135|2608->1151
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|48->23|48->23|48->23|48->23|48->23|50->25|50->25|50->25|50->25|50->25
                  -- GENERATED --
              */
          