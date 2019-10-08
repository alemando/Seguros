
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

object clientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang='en'>
<head>
		<meta charset='utf-8'>
		<meta name='viewport' content='width=device-width, initial-scale=1.0'>
		
		<title>Clientes | Inequidad Seguros</title>
		<meta name='description' content='Seguros Inequidad | Clientes'>
		<meta name='author' content='Seguros Inequidad | Clientes'>

		<!-- Favicon -->
		<link rel='shortcut icon' href='"""),_display_(/*12.36*/routes/*12.42*/.Assets.versioned("images/favicon.ico")),format.raw/*12.81*/("""'>

		<!-- Switchery css -->
		<link href='"""),_display_(/*15.16*/routes/*15.22*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*15.78*/("""' rel='stylesheet' />
		
		<!-- Bootstrap CSS -->
		<link href='"""),_display_(/*18.16*/routes/*18.22*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*18.64*/("""' rel='stylesheet' type='text/css' />
		
		<!-- Font Awesome CSS -->
		<link href='"""),_display_(/*21.16*/routes/*21.22*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*21.80*/("""' rel='stylesheet' type='text/css' />
		
		<!-- Custom CSS -->
        <link href='"""),_display_(/*24.22*/routes/*24.28*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*24.72*/("""' rel='stylesheet' type='text/css' />   
		<link href='"""),_display_(/*25.16*/routes/*25.22*/.Assets.versioned("css/style.css")),format.raw/*25.56*/("""' rel='stylesheet' type='text/css' />	
		
		<!-- BEGIN CSS for this page -->
        <!-- DataTable -->
        <link rel='stylesheet' type='text/css' href='https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css'/>    
        <style> 
        td.details-control """),format.raw/*31.28*/("""{"""),format.raw/*31.29*/("""
        """),format.raw/*32.9*/("""background: url('"""),_display_(/*32.27*/routes/*32.33*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*32.93*/("""') no-repeat center center;
        cursor: pointer;
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""tr.shown td.details-control """),format.raw/*35.37*/("""{"""),format.raw/*35.38*/("""
        """),format.raw/*36.9*/("""background: url('"""),_display_(/*36.27*/routes/*36.33*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*36.94*/("""') no-repeat center center;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""</style>    
		<!-- END CSS for this page -->
				
</head>

<body class='adminbody'>

<div id='main'>

	<!-- top bar navigation -->
	<div class='headerbar'>

		<!-- LOGO -->
        <div class='headerbar-left'>
			<a href='index.html' class='logo'><img alt='logo' src='"""),_display_(/*52.60*/routes/*52.66*/.Assets.versioned("images/logo.png")),format.raw/*52.102*/("""' /> <span>Admin</span></a>
        </div>

        <nav class='navbar-custom'>

                    <ul class='list-inline float-right mb-0'>
                        <li class='list-inline-item dropdown notif'>
                            <a class='nav-link dropdown-toggle nav-user' data-toggle='dropdown' href='#' role='button' aria-haspopup='false' aria-expanded='false'>
                                <img src='"""),_display_(/*60.44*/routes/*60.50*/.Assets.versioned("images/avatars/admin.png")),format.raw/*60.95*/("""' alt='Profile image' class='avatar-rounded'>
                            </a>
                            <div class='dropdown-menu dropdown-menu-right profile-dropdown'>
                                <!-- item-->
                                <div class='dropdown-item noti-title'>
                                    <h5 class='text-overflow'><small>Hola, Admin</small> </h5>
                                </div>

                                <!-- item-->
                                <a href='pro-profile.html' class='dropdown-item notify-item'>
                                    <i class='fa fa-user'></i> <span>Perfil</span>
                                </a>

                                <!-- item-->
                                <a href='#' class='dropdown-item notify-item'>
                                    <i class='fa fa-power-off'></i> <span>Cerrar Sesion</span>
                                </a>
                            </div>
                        </li>

                    </ul>

                    <ul class='list-inline menu-left mb-0'>
                        <li class='float-left'>
                            <button class='button-menu-mobile open-left'>
								<i class='fa fa-fw fa-bars'></i>
                            </button>
                        </li>                        
                    </ul>

        </nav>

	</div>
	<!-- End Navigation -->
	
 
	<!-- Left Sidebar -->
	<div class='left main-sidebar'>
	
		<div class='sidebar-inner leftscroll'>

			<div id='sidebar-menu'>
        
			<ul>

					<li class='submenu'>
						<a href='index.html'><i class='fa fa-fw fa-bars'></i><span> Home </span> </a>
                    </li>
										
                    <li class='submenu'>
                        <a href='#' class='active'><i class='fa fa-fw fa-tv'></i> <span> Clientes</span> <span class='menu-arrow'></span></a>
                            <ul class='list-unstyled'>
                                <li class='active'><a href='clientes.html'>Ver Clientes</a></li>
                            </ul>
                    </li>
                    <li class='submenu'>
                        <a href='#'><i class='fa fa-fw fa-tv'></i> <span> Aseguradoras</span> <span class='menu-arrow'></span></a>
                            <ul class='list-unstyled'>
                                <li><a href='clientes.html'>Ver Aseguradoras</a></li>
                            </ul>
                    </li>
					
            </ul>

            <div class='clearfix'></div>

			</div>
        
			<div class='clearfix'></div>

		</div>

	</div>
	<!-- End Sidebar -->


    <div class='content-page'>
	
		<!-- Start content -->
        <div class='content'>
            
			<div class='container-fluid'>

					
							<div class='row'>
									<div class='col-xl-12'>
											<div class='breadcrumb-holder'>
													<h1 class='main-title float-left'>Clientes</h1>
													<ol class='breadcrumb float-right'>
														<li class='breadcrumb-item'>Clientes</li>
														<li class='breadcrumb-item active'>Ver Clientes</li>
													</ol>
													<div class='clearfix'></div>
											</div>
									</div>
							</div>
							<!-- end row -->

							
							<div class='row'>
									<div class='col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12'>                      
                                        <div class='card mb-3'>
                                            <div class='card-header'>
                                                <div class='row'>
                                                    <div class='col-xs-6 col-sm-6 col-md-8 col-lg-10 col-xl-10'>
                                                        <h3><i class='fa fa-users'></i> Clientes disponibles</h3>
                                                    </div>
                                                    <div class='col-xs-6 col-sm-6 col-md-4 col-lg-2 col-xl-2'>
                                                        <a role='button' href='#' id='añadir-cliente' class='btn btn-success float-right' data-target='#añadirCliente' data-toggle='modal'>Añadir Cliente<span class='btn-label btn-label-right'><i class='fa fa-user-circle'></i></span></a>
                                                    </div>
                                                </div>
                                            </div>
                                                
                                            <div class='card-body'>
                                                <div class='table-responsive'>
                                                <table id='tabla-clientes' class='table table-bordered table-hover display'>
                                                    <thead>
                                                        <tr>
                                                            <th>Documento</th>
                                                            <th>Nombres</th>
                                                            <th>Contacto</th>
                                                            <th>Residencia</th>
                                                            <th>Fecha Nacimiento</th>
                                                            <th>Ingresos</th>
                                                            <th>Egresos</th>
                                                            <th></th>
                                                        </tr>
                                                    </thead>                                        
                                                    <tbody>
                                                        <tr>
                                                            <td>Ejemplo borrar doc</td>
                                                            <td>Ejemplo borrar nom</td>
                                                            <td>Ejemplo borrar con</td>
                                                            <td>Ejemplo borrar res</td>
                                                            <td>Ejemplo borrar fn</td>
                                                            <td>Ejemplo borrar ing</td>
                                                            <td>Ejemplo borrar egr</td>
                                                            <th><center><a role='button' href='#' class='btn btn-primary editar-cliente'><i class='fa fa-pencil'></i></a> <a role='button' href='#' class='btn btn-danger eliminar-cliente'><i class='fa fa-trash-o'></i></a></center></th>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                                </div>
                                                
                                            </div>                                                      
                                        </div><!-- end card-->                  
                                    </div>
							</div>



            </div>
			<!-- END container-fluid -->

		</div>
		<!-- END content -->

    </div>
	<!-- END content-page -->
    
	<footer class='footer'>
		<span class='text-right'>
		Copyright <a target='_blank' href='#'>Seguros Inequidad</a>
		</span>
		<span class='float-right'>
		Powered by <a target='_blank' href='https://www.pikeadmin.com'><b>Pike Admin</b></a>
		</span>
	</footer>

</div>
<!-- Modal -->
<div class='modal fade' id='añadirCliente' tabindex='-1' role='dialog' aria-labelledby='customModal' aria-hidden='true'>
    <div class='modal-dialog' role='document'>
        <div class='modal-content'>
            <div class='modal-header'>
                <h5 class='modal-title' id='titleAñadirCliente'>Añadir a un nuevo cliente</h5>
                <button type='button' class='close' data-dismiss='modal' aria-label='Close'>
                    <span aria-hidden='true'>&times;</span>
                </button>
            </div>
            <div class='modal-body'>
                <form autocomplete='off' action='#' id='form-añadirCliente'>
                    <div class='form-group'>
                        <label>Documento<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-documento-cliente' placeholder='Documento' required autocomplete='off'>
                    </div>
                    <div class='form-group'>
                        <label>Nombre<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-nombre-cliente' placeholder='Nombre' required autocomplete='off'>
                    </div>
                    <div class='form-row'>
                        <div class='form-group col-md-6'>
                            <label>Apellido 1 <span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-apellido1-cliente' placeholder='Primer Apellido' required>
                        </div>
                        <div class='form-group col-md-6'>
                            <label>Apellido 2 <span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-apellido2-cliente' placeholder='Segundo Apellido' required>
                        </div>
                    </div>
                    <div class='form-row'>
                        <div class='form-group col-md-6'>
                            <label>Direccion<span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-direccion-cliente' placeholder='Direccion' required autocomplete='off'>
                        </div>
                        <div class='form-group col-md-6'>
                            <label>Telefono <span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-telefono-cliente' placeholder='Telefono' required>
                        </div>
                    </div> 
                    <div class='form-group'>
                        <label>Fecha Nacimiento<span class='text-danger'>*</span></label>
                        <input type='date' class='form-control' id='input-nacimiento-cliente' placeholder='Fecha Nacimiento' required autocomplete='off'>
                    </div>
                    <div class='form-row'>
                        <div class='form-group col-md-6'>
                            <label>Ingresos<span class='text-danger'>*</span></label>
                            <input type='number' class='form-control' id='input-ingresos-cliente' placeholder='Ingresos' required autocomplete='off'>
                        </div>
                        <div class='form-group col-md-6'>
                            <label>Egresos <span class='text-danger'>*</span></label>
                            <input type='number' class='form-control' id='input-egresos-cliente' placeholder='Egresos' required>
                        </div>
                    </div>    
                </div>
                <div class='modal-footer'>
                    <button type='button' class='btn btn-secondary' data-dismiss='modal' id='cancelar-añadirCliente'>Cancelar</button>
                    <button type='submit' class='btn btn-success'>Registrar</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- Modal Editar -->
<div class='modal fade' id='modal-editar-cliente' tabindex='-1' role='dialog' aria-labelledby='customModal' aria-hidden='true'>
    <div class='modal-dialog' role='document'>
        <div class='modal-content'>
            <div class='modal-header'>
                <h5 class='modal-title' id='titleEditarCliente'>Editar Cliente: <span id='id-cliente'></span></h5>
                <button type='button' class='close' data-dismiss='modal' aria-label='Close'>
                    <span aria-hidden='true'>&times;</span>
                </button>
            </div>
            <div class='modal-body'>
                <form autocomplete='off' action='#' id='form-añadirCliente'>
                    <div class='form-group'>
                        <label>Documento<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-documento-cliente-editar' placeholder='Documento' required autocomplete='off'>
                    </div>
                    <div class='form-group'>
                        <label>Nombre<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-nombre-cliente-editar' placeholder='Nombre' required autocomplete='off'>
                    </div>
                    <div class='form-row'>
                        <div class='form-group col-md-6'>
                            <label>Apellido 1 <span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-apellido1-cliente-editar' placeholder='Primer Apellido' required>
                        </div>
                        <div class='form-group col-md-6'>
                            <label>Apellido 2 <span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-apellido2-cliente-editar' placeholder='Segundo Apellido' required>
                        </div>
                    </div>
                    <div class='form-row'>
                        <div class='form-group col-md-6'>
                            <label>Direccion<span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-direccion-cliente-editar' placeholder='Direccion' required autocomplete='off'>
                        </div>
                        <div class='form-group col-md-6'>
                            <label>Telefono <span class='text-danger'>*</span></label>
                            <input type='text' class='form-control' id='input-telefono-cliente-editar' placeholder='Telefono' required>
                        </div>
                    </div> 
                    <div class='form-group'>
                        <label>Fecha Nacimiento<span class='text-danger'>*</span></label>
                        <input type='date' class='form-control' id='input-nacimiento-cliente-editar' placeholder='Fecha Nacimiento' required autocomplete='off'>
                    </div>
                    <div class='form-row'>
                        <div class='form-group col-md-6'>
                            <label>Ingresos<span class='text-danger'>*</span></label>
                            <input type='number' class='form-control' id='input-ingresos-cliente-editar' placeholder='Ingresos' required autocomplete='off'>
                        </div>
                        <div class='form-group col-md-6'>
                            <label>Egresos <span class='text-danger'>*</span></label>
                            <input type='number' class='form-control' id='input-egresos-cliente-editar' placeholder='Egresos' required>
                        </div>
                    </div>    
                </div>
                <div class='modal-footer'>
                    <button type='button' class='btn btn-secondary' data-dismiss='modal' id='cancelar-editarCliente'>Cancelar</button>
                    <button type='submit' class='btn btn-success'>Editar</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- END main -->

<script src='"""),_display_(/*357.15*/routes/*357.21*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*357.63*/("""'></script>
<script src='"""),_display_(/*358.15*/routes/*358.21*/.Assets.versioned("js/modernizr.min.js")),format.raw/*358.61*/("""'></script>
<script src='"""),_display_(/*359.15*/routes/*359.21*/.Assets.versioned("js/jquery.min.js")),format.raw/*359.58*/("""'></script>
<script src='"""),_display_(/*360.15*/routes/*360.21*/.Assets.versioned("js/moment.min.js")),format.raw/*360.58*/("""'></script>

<script src='"""),_display_(/*362.15*/routes/*362.21*/.Assets.versioned("js/popper.min.js")),format.raw/*362.58*/("""'></script>
<script src='"""),_display_(/*363.15*/routes/*363.21*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*363.61*/("""'></script>

<script src='"""),_display_(/*365.15*/routes/*365.21*/.Assets.versioned("js/detect.js")),format.raw/*365.54*/("""'></script>
<script src='"""),_display_(/*366.15*/routes/*366.21*/.Assets.versioned("js/fastclick.js")),format.raw/*366.57*/("""'></script>
<script src='"""),_display_(/*367.15*/routes/*367.21*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*367.62*/("""'></script>
<script src='"""),_display_(/*368.15*/routes/*368.21*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*368.65*/("""'></script>
<script src='"""),_display_(/*369.15*/routes/*369.21*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*369.67*/("""'></script>
<script src='"""),_display_(/*370.15*/routes/*370.21*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*370.76*/("""'></script>

<!-- App js -->
<script src='"""),_display_(/*373.15*/routes/*373.21*/.Assets.versioned("js/pikeadmin.js")),format.raw/*373.57*/("""'></script>


<!-- Datatable js -->
<script src='https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js'></script>
<script src='https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js'></script>
<!-- BEGIN Java Script for this page -->
<script src='"""),_display_(/*380.15*/routes/*380.21*/.Assets.versioned("js/pagesJS/clientes.js")),format.raw/*380.64*/("""'></script>
<!-- END Java Script for this page -->

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-07T23:31:10.125
                  SOURCE: C:/Users/juanm/Documents/documentosImportantes/semestre 6/Requisitos/Seguros/app/views/clientes.scala.html
                  HASH: 74c665d29d551ddca165eb08e9aef4da925043b1
                  MATRIX: 814->0|1223->382|1238->388|1298->427|1372->474|1387->480|1464->536|1559->604|1574->610|1637->652|1751->739|1766->745|1845->803|1959->890|1974->896|2039->940|2123->997|2138->1003|2193->1037|2504->1320|2533->1321|2570->1331|2615->1349|2630->1355|2711->1415|2801->1478|2830->1479|2867->1489|2923->1517|2952->1518|2989->1528|3034->1546|3049->1552|3131->1613|3195->1650|3224->1651|3261->1661|3572->1945|3587->1951|3645->1987|4099->2414|4114->2420|4180->2465|20327->18584|20343->18590|20407->18632|20462->18659|20478->18665|20540->18705|20595->18732|20611->18738|20670->18775|20725->18802|20741->18808|20800->18845|20857->18874|20873->18880|20932->18917|20987->18944|21003->18950|21065->18990|21122->19019|21138->19025|21193->19058|21248->19085|21264->19091|21322->19127|21377->19154|21393->19160|21456->19201|21511->19228|21527->19234|21593->19278|21648->19305|21664->19311|21732->19357|21787->19384|21803->19390|21880->19445|21954->19491|21970->19497|22028->19533|22332->19809|22348->19815|22413->19858
                  LINES: 26->1|37->12|37->12|37->12|40->15|40->15|40->15|43->18|43->18|43->18|46->21|46->21|46->21|49->24|49->24|49->24|50->25|50->25|50->25|56->31|56->31|57->32|57->32|57->32|57->32|59->34|59->34|60->35|60->35|60->35|61->36|61->36|61->36|61->36|62->37|62->37|63->38|77->52|77->52|77->52|85->60|85->60|85->60|382->357|382->357|382->357|383->358|383->358|383->358|384->359|384->359|384->359|385->360|385->360|385->360|387->362|387->362|387->362|388->363|388->363|388->363|390->365|390->365|390->365|391->366|391->366|391->366|392->367|392->367|392->367|393->368|393->368|393->368|394->369|394->369|394->369|395->370|395->370|395->370|398->373|398->373|398->373|405->380|405->380|405->380
                  -- GENERATED --
              */
          