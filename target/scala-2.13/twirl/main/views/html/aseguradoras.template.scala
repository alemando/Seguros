
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
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang='en'>
<head>
  <meta charset='utf-8'>
  <meta name='viewport' content='width=device-width, initial-scale=1.0'>

  <title>Aseguradoras | Inequidad Seguros</title>
  <meta name='description' content='Seguros Inequidad | Clientes'>
  <meta name='author' content='Seguros Inequidad | Clientes'>

  <!-- Favicon -->
  <link rel='shortcut icon' href='"""),_display_(/*13.36*/routes/*13.42*/.Assets.versioned("images/favicon.ico")),format.raw/*13.81*/("""'>

  <!-- Switchery css -->
  <link href='"""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*16.78*/("""' rel='stylesheet' />

  <!-- Bootstrap CSS -->
  <link href='"""),_display_(/*19.16*/routes/*19.22*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*19.64*/("""' rel='stylesheet' type='text/css' />

  <!-- Font Awesome CSS -->
  <link href='"""),_display_(/*22.16*/routes/*22.22*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*22.80*/("""' rel='stylesheet' type='text/css' />
  

  <!-- Custom CSS -->
  <link href='"""),_display_(/*26.16*/routes/*26.22*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*26.66*/("""' rel='stylesheet' type='text/css' />   
  <link href='"""),_display_(/*27.16*/routes/*27.22*/.Assets.versioned("css/style.css")),format.raw/*27.56*/("""' rel='stylesheet' type='text/css' />	

  <!-- BEGIN CSS for this page -->
  <!-- DataTable -->
  <link rel='stylesheet' type='text/css' href='https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css'/>    
  <style> 
    td.details-control """),format.raw/*33.24*/("""{"""),format.raw/*33.25*/("""
        """),format.raw/*34.9*/("""background: url('"""),_display_(/*34.27*/routes/*34.33*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*34.93*/("""') no-repeat center center;
        cursor: pointer;
    """),format.raw/*36.5*/("""}"""),format.raw/*36.6*/("""
    """),format.raw/*37.5*/("""tr.shown td.details-control """),format.raw/*37.33*/("""{"""),format.raw/*37.34*/("""
        """),format.raw/*38.9*/("""background: url('"""),_display_(/*38.27*/routes/*38.33*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*38.94*/("""') no-repeat center center;
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""
"""),format.raw/*40.1*/("""</style>    
<!-- END CSS for this page -->

</head>

<body class='adminbody'>

    <div id='main'>

       <!-- top bar navigation -->
       <div class='headerbar'>

          <!-- LOGO -->
          <div class='headerbar-left'>
             <a href='index.html' class='logo'><img alt='logo' src='"""),_display_(/*54.70*/routes/*54.76*/.Assets.versioned("images/logo.png")),format.raw/*54.112*/("""' /> <span>Admin</span></a>
         </div>

         <nav class='navbar-custom'>

            <ul class='list-inline float-right mb-0'>
                <li class='list-inline-item dropdown notif'>
                    <a class='nav-link dropdown-toggle nav-user' data-toggle='dropdown' href='#' role='button' aria-haspopup='false' aria-expanded='false'>
                        <img src='"""),_display_(/*62.36*/routes/*62.42*/.Assets.versioned("images/avatars/admin.png")),format.raw/*62.87*/("""' alt='Profile image' class='avatar-rounded'>
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
                <form autocomplete='off' action="prueba" id='form-añadirAseguradora' method="post">
                    <div class='form-group'>
                        <label>NIT<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-nit-aseguradora' placeholder='NIT' required autocomplete='off' name="nit">
                    </div>
                    <div class='form-group'>
                        <label>Nombre<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-nombre-aseguradora' placeholder='Nombre' required autocomplete='off' name="nombre">
                    </div>
                    <div class='form-group'>
                        <label>Contacto<span class='text-danger'>*</span></label>
                        <input type='text' class='form-control' id='input-contacto-aseguradora' placeholder='Contacto' required autocomplete='off' name="contacto">
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

<script src='"""),_display_(/*290.15*/routes/*290.21*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*290.63*/("""'></script>
<script src='"""),_display_(/*291.15*/routes/*291.21*/.Assets.versioned("js/modernizr.min.js")),format.raw/*291.61*/("""'></script>
<script src='"""),_display_(/*292.15*/routes/*292.21*/.Assets.versioned("js/jquery.min.js")),format.raw/*292.58*/("""'></script>
<script src='"""),_display_(/*293.15*/routes/*293.21*/.Assets.versioned("js/moment.min.js")),format.raw/*293.58*/("""'></script>

<script src='"""),_display_(/*295.15*/routes/*295.21*/.Assets.versioned("js/popper.min.js")),format.raw/*295.58*/("""'></script>
<script src='"""),_display_(/*296.15*/routes/*296.21*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*296.61*/("""'></script>

<script src='"""),_display_(/*298.15*/routes/*298.21*/.Assets.versioned("js/detect.js")),format.raw/*298.54*/("""'></script>
<script src='"""),_display_(/*299.15*/routes/*299.21*/.Assets.versioned("js/fastclick.js")),format.raw/*299.57*/("""'></script>
<script src='"""),_display_(/*300.15*/routes/*300.21*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*300.62*/("""'></script>
<script src='"""),_display_(/*301.15*/routes/*301.21*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*301.65*/("""'></script>
<script src='"""),_display_(/*302.15*/routes/*302.21*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*302.67*/("""'></script>
<script src='"""),_display_(/*303.15*/routes/*303.21*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*303.76*/("""'></script>

<!-- App js -->
<script src='"""),_display_(/*306.15*/routes/*306.21*/.Assets.versioned("js/pikeadmin.js")),format.raw/*306.57*/("""'></script>


<!-- Datatable js -->
<script src='https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js'></script>
<script src='https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js'></script>
<!-- BEGIN Java Script for this page -->
<script src='"""),_display_(/*313.15*/routes/*313.21*/.Assets.versioned("js/pagesJS/aseguradoras.js")),format.raw/*313.68*/("""'></script>
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
                  DATE: 2019-10-08T16:38:30.978
                  SOURCE: C:/Users/Usuario/Desktop/seguros/app/views/aseguradoras.scala.html
                  HASH: 708181bc9d1c271fda388b6c7b9d3b74f2cc296a
                  MATRIX: 729->1|825->3|853->5|1264->389|1279->395|1339->434|1413->481|1428->487|1505->543|1598->609|1613->615|1676->657|1788->742|1803->748|1882->806|1992->889|2007->895|2072->939|2156->996|2171->1002|2226->1036|2513->1295|2542->1296|2579->1306|2624->1324|2639->1330|2720->1390|2806->1449|2834->1450|2867->1456|2923->1484|2952->1485|2989->1495|3034->1513|3049->1519|3131->1580|3191->1613|3219->1614|3248->1616|3589->1930|3604->1936|3662->1972|4086->2369|4101->2375|4167->2420|13782->12007|13798->12013|13862->12055|13917->12082|13933->12088|13995->12128|14050->12155|14066->12161|14125->12198|14180->12225|14196->12231|14255->12268|14312->12297|14328->12303|14387->12340|14442->12367|14458->12373|14520->12413|14577->12442|14593->12448|14648->12481|14703->12508|14719->12514|14777->12550|14832->12577|14848->12583|14911->12624|14966->12651|14982->12657|15048->12701|15103->12728|15119->12734|15187->12780|15242->12807|15258->12813|15335->12868|15409->12914|15425->12920|15483->12956|15787->13232|15803->13238|15872->13285
                  LINES: 21->1|26->1|27->2|38->13|38->13|38->13|41->16|41->16|41->16|44->19|44->19|44->19|47->22|47->22|47->22|51->26|51->26|51->26|52->27|52->27|52->27|58->33|58->33|59->34|59->34|59->34|59->34|61->36|61->36|62->37|62->37|62->37|63->38|63->38|63->38|63->38|64->39|64->39|65->40|79->54|79->54|79->54|87->62|87->62|87->62|315->290|315->290|315->290|316->291|316->291|316->291|317->292|317->292|317->292|318->293|318->293|318->293|320->295|320->295|320->295|321->296|321->296|321->296|323->298|323->298|323->298|324->299|324->299|324->299|325->300|325->300|325->300|326->301|326->301|326->301|327->302|327->302|327->302|328->303|328->303|328->303|331->306|331->306|331->306|338->313|338->313|338->313
                  -- GENERATED --
              */
          