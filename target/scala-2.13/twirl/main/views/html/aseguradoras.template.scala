
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

object aseguradoras extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang='en'>
<head>
  <meta charset='utf-8'>
  <meta name='viewport' content='width=device-width, initial-scale=1.0'>

  <title>Aseguradoras | Inequidad Seguros</title>
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
  <link href='"""),_display_(/*24.16*/routes/*24.22*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*24.66*/("""' rel='stylesheet' type='text/css' />   
  <link href='"""),_display_(/*25.16*/routes/*25.22*/.Assets.versioned("css/style.css")),format.raw/*25.56*/("""' rel='stylesheet' type='text/css' />	

  <!-- BEGIN CSS for this page -->
  <!-- DataTable -->
  <link rel='stylesheet' type='text/css' href='https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css'/>    
  <style> 
    td.details-control """),format.raw/*31.24*/("""{"""),format.raw/*31.25*/("""
        """),format.raw/*32.9*/("""background: url('"""),_display_(/*32.27*/routes/*32.33*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*32.93*/("""') no-repeat center center;
        cursor: pointer;
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""
    """),format.raw/*35.5*/("""tr.shown td.details-control """),format.raw/*35.33*/("""{"""),format.raw/*35.34*/("""
        """),format.raw/*36.9*/("""background: url('"""),_display_(/*36.27*/routes/*36.33*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*36.94*/("""') no-repeat center center;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
"""),format.raw/*38.1*/("""</style>    
<!-- END CSS for this page -->

</head>

<body class='adminbody'>

    <div id='main'>

       <!-- top bar navigation -->
       <div class='headerbar'>

          <!-- LOGO -->
          <div class='headerbar-left'>
             <a href='index.html' class='logo'><img alt='logo' src='"""),_display_(/*52.70*/routes/*52.76*/.Assets.versioned("images/logo.png")),format.raw/*52.112*/("""' /> <span>Admin</span></a>
         </div>

         <nav class='navbar-custom'>

            <ul class='list-inline float-right mb-0'>
                <li class='list-inline-item dropdown notif'>
                    <a class='nav-link dropdown-toggle nav-user' data-toggle='dropdown' href='#' role='button' aria-haspopup='false' aria-expanded='false'>
                        <img src='"""),_display_(/*60.36*/routes/*60.42*/.Assets.versioned("images/avatars/admin.png")),format.raw/*60.87*/("""' alt='Profile image' class='avatar-rounded'>
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
                <a href='#'><i class='fa fa-fw fa-tv'></i> <span> Clientes</span> <span class='menu-arrow'></span></a>
                <ul class='list-unstyled'>
                    <li><a href='clientes.html'>Ver Clientes</a></li>
                </ul>
            </li>
            <li class='submenu'>
                <a href='#' class='active'><i class='fa fa-fw fa-tv'></i> <span> Aseguradoras</span> <span class='menu-arrow'></span></a>
                <ul class='list-unstyled'>
                    <li class='active'><a href='clientes.html'>Ver Aseguradoras</a></li>
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
               <h1 class='main-title float-left'>Aseguradoras</h1>
               <ol class='breadcrumb float-right'>
                  <li class='breadcrumb-item'>Aseguradoras</li>
                  <li class='breadcrumb-item active'>Ver Aseguradores</li>
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
                    <h3><i class='fa fa-users'></i> Aseguradoras disponibles</h3>
                </div>
                <div class='col-xs-6 col-sm-6 col-md-4 col-lg-2 col-xl-2'>
                    <a role='button' href='#' id='añadir-cliente' class='btn btn-success float-right' data-target='#añadirAseguradora' data-toggle='modal'>Añadir Aseguradora<span class='btn-label btn-label-right'><i class='fa fa-user-circle'></i></span></a>
                </div>
            </div>
        </div>

        <div class='card-body'>
            <div class='table-responsive'>
                <table id='tabla-aseguradoras' class='table table-bordered table-hover display'>
                    <thead>
                        <tr>
                            <th>nombre</th>
                            <th>NIT</th>
                            <th>Contacto</th>
                            <th></th>
                        </tr>
                    </thead>                                        
                    <tbody>
                        <tr>
                            <td>Ejemplo borrar nom</td>
                            <td>Ejemplo borrar NIT</td>
                            <td>Ejemplo borrar con</td>
                            <th><center><a role='button' href='#' class='btn btn-primary editar-aseguradora'><i class='fa fa-pencil'></i></a> <a role='button' href='#' class='btn btn-danger eliminar-aseguradora'><i class='fa fa-trash-o'></i></a></center></th>
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
<!-- Modal Añadir aseguradora-->
<div class='modal fade' id='añadirAseguradora' tabindex='-1' role='dialog' aria-labelledby='customModal' aria-hidden='true'>
    <div class='modal-dialog' role='document'>
        <div class='modal-content'>
            <div class='modal-header'>
                <h5 class='modal-title' id='titleAñadirAseguradora'>Añadir a un nueva aseguradora</h5>
                <button type='button' class='close' data-dismiss='modal' aria-label='Close'>
                    <span aria-hidden='true'>&times;</span>
                </button>
            </div>
            <div class='modal-body'>
                <form autocomplete='off' action='#' id='form-añadirAseguradora'>
                    <div class='form-group'>
                        <label>NIT<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-nit-aseguradora' placeholder='NIT' required autocomplete='off'>
                    </div>
                    <div class='form-group'>
                        <label>Nombre<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-nombre-aseguradora' placeholder='Nombre' required autocomplete='off'>
                    </div>
                    <div class='form-group'>
                        <label>Contacto<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-contacto-aseguradora' placeholder='Contacto' required autocomplete='off'>
                    </div>   
                </div>
                <div class='modal-footer'>
                    <button type='button' class='btn btn-secondary' data-dismiss='modal' id='cancelar-añadirAseguradora'>Cancelar</button>
                    <button type='submit' class='btn btn-success'>Registrar</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- Modal Editar -->
<div class='modal fade' id='modal-editar-aseguradora' tabindex='-1' role='dialog' aria-labelledby='customModal' aria-hidden='true'>
    <div class='modal-dialog' role='document'>
        <div class='modal-content'>
            <div class='modal-header'>
                <h5 class='modal-title' id='titleEditarCliente'>Editar Aseguradora: <span id='id-aseguradora'></span></h5>
                <button type='button' class='close' data-dismiss='modal' aria-label='Close'>
                    <span aria-hidden='true'>&times;</span>
                </button>
            </div>
            <div class='modal-body'>
                <form autocomplete='off' action='#' id='form-añadirAseguradora'>
                    <div class='form-group'>
                        <label>Documento<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-documento-cliente-editar' placeholder='Documento' required autocomplete='off'>
                    </div>
                    <div class='form-group'>
                        <label>Nombre<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-nombre-cliente-editar' placeholder='Nombre' required autocomplete='off'>
                    </div>
                    <div class='form-row'>
                        <label>Apellido 1 <span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-apellido1-cliente-editar' placeholder='Primer Apellido' required>
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

<script src='"""),_display_(/*289.15*/routes/*289.21*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*289.63*/("""'></script>
<script src='"""),_display_(/*290.15*/routes/*290.21*/.Assets.versioned("js/modernizr.min.js")),format.raw/*290.61*/("""'></script>
<script src='"""),_display_(/*291.15*/routes/*291.21*/.Assets.versioned("js/jquery.min.js")),format.raw/*291.58*/("""'></script>
<script src='"""),_display_(/*292.15*/routes/*292.21*/.Assets.versioned("js/moment.min.js")),format.raw/*292.58*/("""'></script>

<script src='"""),_display_(/*294.15*/routes/*294.21*/.Assets.versioned("js/popper.min.js")),format.raw/*294.58*/("""'></script>
<script src='"""),_display_(/*295.15*/routes/*295.21*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*295.61*/("""'></script>

<script src='"""),_display_(/*297.15*/routes/*297.21*/.Assets.versioned("js/detect.js")),format.raw/*297.54*/("""'></script>
<script src='"""),_display_(/*298.15*/routes/*298.21*/.Assets.versioned("js/fastclick.js")),format.raw/*298.57*/("""'></script>
<script src='"""),_display_(/*299.15*/routes/*299.21*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*299.62*/("""'></script>
<script src='"""),_display_(/*300.15*/routes/*300.21*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*300.65*/("""'></script>
<script src='"""),_display_(/*301.15*/routes/*301.21*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*301.67*/("""'></script>
<script src='"""),_display_(/*302.15*/routes/*302.21*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*302.76*/("""'></script>

<!-- App js -->
<script src='"""),_display_(/*305.15*/routes/*305.21*/.Assets.versioned("js/pikeadmin.js")),format.raw/*305.57*/("""'></script>


<!-- Datatable js -->
<script src='https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js'></script>
<script src='https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js'></script>
<!-- BEGIN Java Script for this page -->
<script src='"""),_display_(/*312.15*/routes/*312.21*/.Assets.versioned("js/pagesJS/aseguradoras.js")),format.raw/*312.68*/("""'></script>
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
                  DATE: 2019-10-08T14:52:43.480
                  SOURCE: C:/Users/juanm/Documents/documentosImportantes/semestre 6/Requisitos/Seguros/app/views/aseguradoras.scala.html
                  HASH: 4b5cdf8496f87bc82d86e530a5d4b80a2cab65f7
                  MATRIX: 818->0|1229->384|1244->390|1304->429|1378->476|1393->482|1470->538|1563->604|1578->610|1641->652|1753->737|1768->743|1847->801|1953->880|1968->886|2033->930|2117->987|2132->993|2187->1027|2474->1286|2503->1287|2540->1297|2585->1315|2600->1321|2681->1381|2767->1440|2795->1441|2828->1447|2884->1475|2913->1476|2950->1486|2995->1504|3010->1510|3092->1571|3152->1604|3180->1605|3209->1607|3550->1921|3565->1927|3623->1963|4047->2360|4062->2366|4128->2411|13685->11940|13701->11946|13765->11988|13820->12015|13836->12021|13898->12061|13953->12088|13969->12094|14028->12131|14083->12158|14099->12164|14158->12201|14215->12230|14231->12236|14290->12273|14345->12300|14361->12306|14423->12346|14480->12375|14496->12381|14551->12414|14606->12441|14622->12447|14680->12483|14735->12510|14751->12516|14814->12557|14869->12584|14885->12590|14951->12634|15006->12661|15022->12667|15090->12713|15145->12740|15161->12746|15238->12801|15312->12847|15328->12853|15386->12889|15690->13165|15706->13171|15775->13218
                  LINES: 26->1|37->12|37->12|37->12|40->15|40->15|40->15|43->18|43->18|43->18|46->21|46->21|46->21|49->24|49->24|49->24|50->25|50->25|50->25|56->31|56->31|57->32|57->32|57->32|57->32|59->34|59->34|60->35|60->35|60->35|61->36|61->36|61->36|61->36|62->37|62->37|63->38|77->52|77->52|77->52|85->60|85->60|85->60|314->289|314->289|314->289|315->290|315->290|315->290|316->291|316->291|316->291|317->292|317->292|317->292|319->294|319->294|319->294|320->295|320->295|320->295|322->297|322->297|322->297|323->298|323->298|323->298|324->299|324->299|324->299|325->300|325->300|325->300|326->301|326->301|326->301|327->302|327->302|327->302|330->305|330->305|330->305|337->312|337->312|337->312
                  -- GENERATED --
              */
          