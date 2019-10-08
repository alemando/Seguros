
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

object clientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(param :Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<title>Pike Admin - Free Bootstrap 4 Admin Template</title>
		<meta name="description" content="Free Bootstrap 4 Admin Theme | Pike Admin">
		<meta name="author" content="Pike Web Development - https://www.pikephp.com">

		<!-- Favicon -->
		<link rel="shortcut icon" href='"""),_display_(/*13.36*/routes/*13.42*/.Assets.versioned("images/favicon.ico")),format.raw/*13.81*/("""'>

		<!-- Switchery css -->
		<link href='"""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*16.78*/("""' rel="stylesheet" />
		
		<!-- Bootstrap CSS -->
		<link href='"""),_display_(/*19.16*/routes/*19.22*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*19.64*/("""' rel="stylesheet" type="text/css" />
		
		<!-- Font Awesome CSS -->
		<link href='"""),_display_(/*22.16*/routes/*22.22*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*22.80*/("""' rel="stylesheet" type="text/css" />
		
		<!-- Custom CSS -->
        <link href='"""),_display_(/*25.22*/routes/*25.28*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*25.72*/("""' rel="stylesheet" type="text/css" />   
		<link href='"""),_display_(/*26.16*/routes/*26.22*/.Assets.versioned("css/style.css")),format.raw/*26.56*/("""' rel="stylesheet" type="text/css" />	
		
		<!-- BEGIN CSS for this page -->
        <!-- DataTable -->
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css"/>    
        <style> 
        td.details-control """),format.raw/*32.28*/("""{"""),format.raw/*32.29*/("""
        """),format.raw/*33.9*/("""background: url('"""),_display_(/*33.27*/routes/*33.33*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*33.93*/("""') no-repeat center center;
        cursor: pointer;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""tr.shown td.details-control """),format.raw/*36.37*/("""{"""),format.raw/*36.38*/("""
        """),format.raw/*37.9*/("""background: url('"""),_display_(/*37.27*/routes/*37.33*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*37.94*/("""') no-repeat center center;
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/("""
        """),format.raw/*39.9*/("""</style>    
		<!-- END CSS for this page -->
				
</head>

<body class="adminbody">

<div id="main">

	<!-- top bar navigation -->
	<div class="headerbar">

		<!-- LOGO -->
        <div class="headerbar-left">
			<a href="index.html" class="logo"><img alt="logo" src='"""),_display_(/*53.60*/routes/*53.66*/.Assets.versioned("images/logo.png")),format.raw/*53.102*/("""' /> <span>Admin</span></a>
        </div>

        <nav class="navbar-custom">

                    <ul class="list-inline float-right mb-0">
                        <li class="list-inline-item dropdown notif">
                            <a class="nav-link dropdown-toggle nav-user" data-toggle="dropdown" href="#" role="button" aria-haspopup="false" aria-expanded="false">
                                <img src='"""),_display_(/*61.44*/routes/*61.50*/.Assets.versioned("images/avatars/admin.png")),format.raw/*61.95*/("""' alt="Profile image" class="avatar-rounded">
                            </a>
                            <div class="dropdown-menu dropdown-menu-right profile-dropdown">
                                <!-- item-->
                                <div class="dropdown-item noti-title">
                                    <h5 class="text-overflow"><small>Hola, Admin</small> </h5>
                                </div>

                                <!-- item-->
                                <a href="pro-profile.html" class="dropdown-item notify-item">
                                    <i class="fa fa-user"></i> <span>Perfil</span>
                                </a>

                                <!-- item-->
                                <a href="#" class="dropdown-item notify-item">
                                    <i class="fa fa-power-off"></i> <span>Cerrar Sesion</span>
                                </a>
                            </div>
                        </li>

                    </ul>

                    <ul class="list-inline menu-left mb-0">
                        <li class="float-left">
                            <button class="button-menu-mobile open-left">
								<i class="fa fa-fw fa-bars"></i>
                            </button>
                        </li>                        
                    </ul>

        </nav>

	</div>
	<!-- End Navigation -->
	
 
	<!-- Left Sidebar -->
	<div class="left main-sidebar">
	
		<div class="sidebar-inner leftscroll">

			<div id="sidebar-menu">
        
			<ul>

					<li class="submenu">
						<a href="index.html"><i class="fa fa-fw fa-bars"></i><span> Home </span> </a>
                    </li>
										
                    <li class="submenu">
                        <a href="#" class="active"><i class="fa fa-fw fa-tv"></i> <span> Clientes</span> <span class="menu-arrow"></span></a>
                            <ul class="list-unstyled">
                                <li class="active"><a href="clientes.html">Ver Clientes</a></li>
                            </ul>
                    </li>
					
            </ul>

            <div class="clearfix"></div>

			</div>
        
			<div class="clearfix"></div>

		</div>

	</div>
	
	<!-- End Sidebar -->


    <div class="content-page">
	
		<!-- Start content -->
        <div class="content">
            
			<div class="container-fluid">

					
							<div class="row">
									<div class="col-xl-12">
											<div class="breadcrumb-holder">
													<h1 class="main-title float-left">Clientes</h1>
													<ol class="breadcrumb float-right">
														<li class="breadcrumb-item">Clientes</li>
														<li class="breadcrumb-item active">Ver Clientes</li>
													</ol>
													<div class="clearfix"></div>
											</div>
									</div>
							</div>
							<!-- end row -->

							
							<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">                      
                                        <div class="card mb-3">
                                            <div class="card-header">
                                                <div class="row">
                                                    <div class="col-xs-6 col-sm-6 col-md-8 col-lg-10 col-xl-10">
                                                        <h3><i class="fa fa-users"></i> Clientes disponibles</h3>
                                                    </div>
                                                    <div class="col-xs-6 col-sm-6 col-md-4 col-lg-2 col-xl-2">
                                                        <a role="button" href="#" id="añadir-cliente" class="btn btn-success float-right" data-target="#añadirCliente" data-toggle="modal">Añadir Cliente<span class="btn-label btn-label-right"><i class="fa fa-user-circle"></i></span></a>
                                                    </div>
                                                </div>
                                            </div>
                                                
                                            <div class="card-body">
                                                <div class="table-responsive">
                                                <table id="tabla-clientes" class="table table-bordered table-hover display">
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
                                                            <th><center><a role="button" href="#" class="btn btn-primary editar-cliente"><i class="fa fa-pencil"></i></a> <a role="button" href="#" class="btn btn-danger eliminar-cliente"><i class="fa fa-trash-o"></i></a></center></th>
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
    
	<footer class="footer">
		<span class="text-right">
		Copyright <a target="_blank" href="#">Seguros Inequidad</a>
		</span>
		<span class="float-right">
		Powered by <a target="_blank" href="https://www.pikeadmin.com"><b>Pike Admin</b></a>
		</span>
	</footer>

</div>
<!-- Modal -->
<div class="modal fade" id="añadirCliente" tabindex="-1" role="dialog" aria-labelledby="customModal" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="titleAñadirCliente">Añadir a un nuevo cliente</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form autocomplete="off" action="#" id="form-añadirCliente">
                    <div class="form-group">
                        <label>Documento<span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="input-documento-cliente" placeholder="Documento" required autocomplete="off">
                    </div>
                    <div class="form-group">
                        <label>Nombre<span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="input-nombre-cliente" placeholder="Nombre" required autocomplete="off">
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label>Apellido 1 <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-apellido1-cliente" placeholder="Primer Apellido" required>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Apellido 2 <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-apellido2-cliente" placeholder="Segundo Apellido" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label>Direccion<span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-direccion-cliente" placeholder="Direccion" required autocomplete="off">
                        </div>
                        <div class="form-group col-md-6">
                            <label>Telefono <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-telefono-cliente" placeholder="Telefono" required>
                        </div>
                    </div> 
                    <div class="form-group">
                        <label>Fecha Nacimiento<span class="text-danger">*</span></label>
                        <input type="date" class="form-control" id="input-nacimiento-cliente" placeholder="Fecha Nacimiento" required autocomplete="off">
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label>Ingresos<span class="text-danger">*</span></label>
                            <input type="number" class="form-control" id="input-ingresos-cliente" placeholder="Ingresos" required autocomplete="off">
                        </div>
                        <div class="form-group col-md-6">
                            <label>Egresos <span class="text-danger">*</span></label>
                            <input type="number" class="form-control" id="input-egresos-cliente" placeholder="Egresos" required>
                        </div>
                    </div>    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal" id="cancelar-añadirCliente">Cancelar</button>
                    <button type="submit" class="btn btn-success">Registrar</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- Modal Editar -->
<div class="modal fade" id="modal-editar-cliente" tabindex="-1" role="dialog" aria-labelledby="customModal" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="titleEditarCliente">Editar Cliente: <span id="id-cliente"></span></h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form autocomplete="off" action="#" id="form-añadirCliente">
                    <div class="form-group">
                        <label>Documento<span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="input-documento-cliente-editar" placeholder="Documento" required autocomplete="off">
                    </div>
                    <div class="form-group">
                        <label>Nombre<span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="input-nombre-cliente-editar" placeholder="Nombre" required autocomplete="off">
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label>Apellido 1 <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-apellido1-cliente-editar" placeholder="Primer Apellido" required>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Apellido 2 <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-apellido2-cliente-editar" placeholder="Segundo Apellido" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label>Direccion<span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-direccion-cliente-editar" placeholder="Direccion" required autocomplete="off">
                        </div>
                        <div class="form-group col-md-6">
                            <label>Telefono <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-telefono-cliente-editar" placeholder="Telefono" required>
                        </div>
                    </div> 
                    <div class="form-group">
                        <label>Fecha Nacimiento<span class="text-danger">*</span></label>
                        <input type="date" class="form-control" id="input-nacimiento-cliente-editar" placeholder="Fecha Nacimiento" required autocomplete="off">
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label>Ingresos<span class="text-danger">*</span></label>
                            <input type="number" class="form-control" id="input-ingresos-cliente-editar" placeholder="Ingresos" required autocomplete="off">
                        </div>
                        <div class="form-group col-md-6">
                            <label>Egresos <span class="text-danger">*</span></label>
                            <input type="number" class="form-control" id="input-egresos-cliente-editar" placeholder="Egresos" required>
                        </div>
                    </div>    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal" id="cancelar-editarCliente">Cancelar</button>
                    <button type="submit" class="btn btn-success">Editar</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- END main -->

<script src='"""),_display_(/*353.15*/routes/*353.21*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*353.63*/("""'></script>
<script src='"""),_display_(/*354.15*/routes/*354.21*/.Assets.versioned("js/modernizr.min.js")),format.raw/*354.61*/("""'></script>
<script src='"""),_display_(/*355.15*/routes/*355.21*/.Assets.versioned("js/jquery.min.js")),format.raw/*355.58*/("""'></script>
<script src='"""),_display_(/*356.15*/routes/*356.21*/.Assets.versioned("js/moment.min.js")),format.raw/*356.58*/("""'></script>

<script src='"""),_display_(/*358.15*/routes/*358.21*/.Assets.versioned("js/popper.min.js")),format.raw/*358.58*/("""'></script>
<script src='"""),_display_(/*359.15*/routes/*359.21*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*359.61*/("""'></script>

<script src='"""),_display_(/*361.15*/routes/*361.21*/.Assets.versioned("js/detect.js")),format.raw/*361.54*/("""'></script>
<script src='"""),_display_(/*362.15*/routes/*362.21*/.Assets.versioned("js/fastclick.js")),format.raw/*362.57*/("""'></script>
<script src='"""),_display_(/*363.15*/routes/*363.21*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*363.62*/("""'></script>
<script src='"""),_display_(/*364.15*/routes/*364.21*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*364.65*/("""'></script>
<script src='"""),_display_(/*365.15*/routes/*365.21*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*365.67*/("""'></script>
<script src='"""),_display_(/*366.15*/routes/*366.21*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*366.76*/("""'></script>

<!-- App js -->
<script src='"""),_display_(/*369.15*/routes/*369.21*/.Assets.versioned("js/pikeadmin.js")),format.raw/*369.57*/("""'></script>

<!-- BEGIN Java Script for this page -->

<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
<script src='"""),_display_(/*375.15*/routes/*375.21*/.Assets.versioned("js/pagesJS/clientes.js")),format.raw/*375.64*/("""'></script>
<!-- END Java Script for this page -->

</body>
</html>"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-08T18:44:39.179
                  SOURCE: C:/Users/Usuario/Desktop/seguros/app/views/clientes.scala.html
                  HASH: 0758613948d3f11c3337ae6f9177c371fc50f8e8
                  MATRIX: 729->1|836->13|864->15|1320->444|1335->450|1395->489|1469->536|1484->542|1561->598|1656->666|1671->672|1734->714|1848->801|1863->807|1942->865|2056->952|2071->958|2136->1002|2220->1059|2235->1065|2290->1099|2601->1382|2630->1383|2667->1393|2712->1411|2727->1417|2808->1477|2898->1540|2927->1541|2964->1551|3020->1579|3049->1580|3086->1590|3131->1608|3146->1614|3228->1675|3292->1712|3321->1713|3358->1723|3669->2007|3684->2013|3742->2049|4196->2476|4211->2482|4277->2527|20048->18270|20064->18276|20128->18318|20183->18345|20199->18351|20261->18391|20316->18418|20332->18424|20391->18461|20446->18488|20462->18494|20521->18531|20578->18560|20594->18566|20653->18603|20708->18630|20724->18636|20786->18676|20843->18705|20859->18711|20914->18744|20969->18771|20985->18777|21043->18813|21098->18840|21114->18846|21177->18887|21232->18914|21248->18920|21314->18964|21369->18991|21385->18997|21453->19043|21508->19070|21524->19076|21601->19131|21675->19177|21691->19183|21749->19219|22030->19472|22046->19478|22111->19521
                  LINES: 21->1|26->1|27->2|38->13|38->13|38->13|41->16|41->16|41->16|44->19|44->19|44->19|47->22|47->22|47->22|50->25|50->25|50->25|51->26|51->26|51->26|57->32|57->32|58->33|58->33|58->33|58->33|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|62->37|63->38|63->38|64->39|78->53|78->53|78->53|86->61|86->61|86->61|378->353|378->353|378->353|379->354|379->354|379->354|380->355|380->355|380->355|381->356|381->356|381->356|383->358|383->358|383->358|384->359|384->359|384->359|386->361|386->361|386->361|387->362|387->362|387->362|388->363|388->363|388->363|389->364|389->364|389->364|390->365|390->365|390->365|391->366|391->366|391->366|394->369|394->369|394->369|400->375|400->375|400->375
                  -- GENERATED --
              */
          