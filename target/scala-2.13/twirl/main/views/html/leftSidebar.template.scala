
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
                        <a id = "agregar-categoria"><i class="fa fa-fw fa-bars fa-fw"></i><span> Agragar categoria </span> </a>
                    </li>

					<li class="submenu">
						<a href="index.html"><i class="fa fa-fw fa-bars"></i><span> Home </span> </a>
                    </li>
										
                    <li class="submenu">
                        <a href="#" """),_display_(/*19.38*/if(name=="Clientes")/*19.58*/{_display_(Seq[Any](format.raw/*19.59*/(""" """),format.raw/*19.60*/("""class="active" """)))}),format.raw/*19.76*/("""><i class="fa fa-fw fa-tv"></i> <span> Clientes</span> <span class="menu-arrow"></span></a>
                            <ul class="list-unstyled">
                                <li """),_display_(/*21.38*/if(name=="Clientes")/*21.58*/{_display_(Seq[Any](format.raw/*21.59*/(""" """),format.raw/*21.60*/("""class="active" """)))}),format.raw/*21.76*/("""><a href="clientes.html">Ver Clientes</a></li>
                            </ul>
                    </li>

                    <li class='submenu'>
                        <a href='#' """),_display_(/*26.38*/if(name=="Aseguradoras")/*26.62*/{_display_(Seq[Any](format.raw/*26.63*/(""" """),format.raw/*26.64*/("""class="active" """)))}),format.raw/*26.80*/("""><i class='fa fa-fw fa-tv'></i> <span> Aseguradoras</span> <span class='menu-arrow'></span></a>
                        <ul class='list-unstyled'>
                            <li """),_display_(/*28.34*/if(name=="Aseguradoras")/*28.58*/{_display_(Seq[Any](format.raw/*28.59*/(""" """),format.raw/*28.60*/("""class="active" """)))}),format.raw/*28.76*/("""><a href='clientes.html'>Ver Aseguradoras </a></li>
                        </ul>
                    </li>
					
            </ul>

            <div class="clearfix"></div>

			</div>
        
			<div class="clearfix"></div>

		</div>

	</div>

    <!-- Modal Registrar Categoria-->
    <div class="modal fade" id="añadirCategoria" tabindex="-1" role="dialog"
        aria-labelledby="customModal" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="titleAñadirCliente">Añadir a un
                        nuevo bien</h5>
                    <button type="button" class="close" data-dismiss="modal"
                        aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form autocomplete="off" action="#" id="form-añadirCategoria">
                        <div class="form-group">
                            <label>Categoria<span class="text-danger">*</span></label>
                            <input type="text" class="form-control"
                                id="input-categoria" placeholder="Nombre de la categoria"
                                required autocomplete="off" disabled>
                        </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary"
                        data-dismiss="modal" id="cancelar-añadirCategoria">Cancelar</button>
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
                  DATE: 2019-10-09T16:20:45.598
                  SOURCE: C:/Users/juanm/git/Seguros/app/views/leftSidebar.scala.html
                  HASH: 44fda53d681c2d7c464c8b057566429ce68f0d1d
                  MATRIX: 735->1|843->17|890->56|940->69|968->71|1536->612|1565->632|1604->633|1633->634|1680->650|1891->834|1920->854|1959->855|1988->856|2035->872|2248->1058|2281->1082|2320->1083|2349->1084|2396->1100|2603->1280|2636->1304|2675->1305|2704->1306|2751->1322
                  LINES: 21->1|26->2|26->2|26->2|27->3|43->19|43->19|43->19|43->19|43->19|45->21|45->21|45->21|45->21|45->21|50->26|50->26|50->26|50->26|50->26|52->28|52->28|52->28|52->28|52->28
                  -- GENERATED --
              */
          