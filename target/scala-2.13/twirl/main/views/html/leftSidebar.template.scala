
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
                        <a href="#" """),_display_(/*15.38*/if(name=="Clientes")/*15.58*/{_display_(Seq[Any](format.raw/*15.59*/(""" """),format.raw/*15.60*/("""class="active" """)))}),format.raw/*15.76*/("""><i class="fa fa-fw fa-tv"></i> <span> Clientes</span> <span class="menu-arrow"></span></a>
                            <ul class="list-unstyled">
                                <li """),_display_(/*17.38*/if(name=="Clientes")/*17.58*/{_display_(Seq[Any](format.raw/*17.59*/(""" """),format.raw/*17.60*/("""class="active" """)))}),format.raw/*17.76*/("""><a href="clientes">Ver Clientes</a></li>
                            </ul>
                    </li>

                    <li class='submenu'>
                        <a href='#' """),_display_(/*22.38*/if(name=="Aseguradoras")/*22.62*/{_display_(Seq[Any](format.raw/*22.63*/(""" """),format.raw/*22.64*/("""class="active" """)))}),format.raw/*22.80*/("""><i class='fa fa-fw fa-tv'></i> <span> Aseguradoras</span> <span class='menu-arrow'></span></a>
                        <ul class='list-unstyled'>
                            <li """),_display_(/*24.34*/if(name=="Aseguradoras")/*24.58*/{_display_(Seq[Any](format.raw/*24.59*/(""" """),format.raw/*24.60*/("""class="active" """)))}),format.raw/*24.76*/("""><a href='aseguradoras'>Ver Aseguradoras </a></li>
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
                  DATE: 2019-10-10T02:45:03.937
                  SOURCE: C:/Users/alema/Documents/GitHub/Seguros/app/views/leftSidebar.scala.html
                  HASH: 651bdce2d3a1fa0b53244af53c16a9343d8a1731
                  MATRIX: 735->1|844->15|872->18|919->57|969->70|998->73|1382->430|1411->450|1450->451|1479->452|1526->468|1739->654|1768->674|1807->675|1836->676|1883->692|2096->878|2129->902|2168->903|2197->904|2244->920|2453->1102|2486->1126|2525->1127|2554->1128|2601->1144
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|40->15|40->15|40->15|40->15|40->15|42->17|42->17|42->17|42->17|42->17|47->22|47->22|47->22|47->22|47->22|49->24|49->24|49->24|49->24|49->24
                  -- GENERATED --
              */
          