
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
/*1.2*/import scala.collection.mutable.ArrayBuffer

object clientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,ArrayBuffer[Cliente],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(name:String)(clientes:ArrayBuffer[Cliente])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Pike Admin - Free Bootstrap 4 Admin Template</title>
<meta name="description"
	content="Free Bootstrap 4 Admin Theme | Pike Admin">
<meta name="author"
	content="Pike Web Development - https://www.pikephp.com">

<!-- Favicon -->
<link rel="shortcut icon"
	href='"""),_display_(/*18.9*/routes/*18.15*/.Assets.versioned("images/favicon.ico")),format.raw/*18.54*/("""'>

<!-- Switchery css -->
<link
	href='"""),_display_(/*22.9*/routes/*22.15*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*22.71*/("""'
	rel="stylesheet" />

<!-- Bootstrap CSS -->
<link href='"""),_display_(/*26.14*/routes/*26.20*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*26.62*/("""'
	rel="stylesheet" type="text/css" />

<!-- Font Awesome CSS -->
<link
	href='"""),_display_(/*31.9*/routes/*31.15*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*31.73*/("""'
	rel="stylesheet" type="text/css" />

<!-- Custom CSS -->
<link href='"""),_display_(/*35.14*/routes/*35.20*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*35.64*/("""'
	rel="stylesheet" type="text/css" />
<link href='"""),_display_(/*37.14*/routes/*37.20*/.Assets.versioned("css/dataTableCollapse.css")),format.raw/*37.66*/("""'
	rel="stylesheet" type="text/css" />
<link href='"""),_display_(/*39.14*/routes/*39.20*/.Assets.versioned("css/style.css")),format.raw/*39.54*/("""' rel="stylesheet"
	type="text/css" />

<!-- BEGIN CSS for this page -->
<!-- DataTable -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css" />
<style>
td.details-control """),format.raw/*47.20*/("""{"""),format.raw/*47.21*/("""
	"""),format.raw/*48.2*/("""background:
		url('"""),_display_(/*49.9*/routes/*49.15*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*49.75*/("""')
		no-repeat center center;
	cursor: pointer;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""

"""),format.raw/*54.1*/("""tr.shown td.details-control """),format.raw/*54.29*/("""{"""),format.raw/*54.30*/("""
	"""),format.raw/*55.2*/("""background:
		url('"""),_display_(/*56.9*/routes/*56.15*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*56.76*/("""')
		no-repeat center center;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""
"""),format.raw/*59.1*/("""</style>
<!-- END CSS for this page -->

</head>

<body class="adminbody">

	<div id="main">

		<!-- top bar navigation -->
		"""),_display_(/*69.4*/header()),format.raw/*69.12*/("""
		"""),format.raw/*70.3*/("""<!-- End Navigation -->


		<!-- Left Sidebar -->
		"""),_display_(/*74.4*/leftSidebar(name)),format.raw/*74.21*/("""
		"""),format.raw/*75.3*/("""<!-- End Sidebar -->


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
											<h3>
												<i class="fa fa-users"></i> Clientes disponibles
											</h3>
										</div>
										<div class="col-xs-6 col-sm-6 col-md-4 col-lg-2 col-xl-2">
											<a role="button" href="#" id="añadir-cliente"
												class="btn btn-success float-right"
												data-target="#añadirCliente" data-toggle="modal">Añadir
												Cliente<span class="btn-label btn-label-right"><i
													class="fa fa-user-circle"></i></span>
											</a>
										</div>
									</div>
								</div>

								<div class="card-body">
									<div class="table-responsive">
										<table id="tabla-clientes"
											class="table table-bordered table-hover display">
											<thead>
												<tr>
													<th></th>
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
												"""),_display_(/*139.14*/for(x <- 0 until clientes.size) yield /*139.45*/{_display_(Seq[Any](format.raw/*139.46*/("""
												"""),format.raw/*140.13*/("""<tr>
													<td></td>
													<td>"""),_display_(/*142.19*/clientes(x)/*142.30*/.documento),format.raw/*142.40*/("""</td>
													<td>"""),_display_(/*143.19*/clientes(x)/*143.30*/.nombre),format.raw/*143.37*/("""</td>
													<td>"""),_display_(/*144.19*/clientes(x)/*144.30*/.ptelefono),format.raw/*144.40*/("""</td>
													<!-- Revisar este atributo!!!!-->
													<td>"""),_display_(/*146.19*/clientes(x)/*146.30*/.pdireccion),format.raw/*146.41*/("""</td>
													<td>"""),_display_(/*147.19*/clientes(x)/*147.30*/.fechaNacimiento),format.raw/*147.46*/("""</td>
													<td>"""),_display_(/*148.19*/clientes(x)/*148.30*/.pingresos),format.raw/*148.40*/("""</td>
													<td>"""),_display_(/*149.19*/clientes(x)/*149.30*/.pegresos),format.raw/*149.39*/("""</td>
													<th><center>
															<a role="button" href="#"
																class="btn btn-primary editar-cliente"><i
																class="fa fa-pencil"></i></a> <a role="button" href="#"
																class="btn btn-danger eliminar-cliente"><i
																class="fa fa-trash-o"></i></a>
														</center></th>
												</tr>
												""")))}),format.raw/*158.14*/("""
											"""),format.raw/*159.12*/("""</tbody>
										</table>
									</div>

								</div>
							</div>
							<!-- end card-->
						</div>
					</div>



				</div>
				<!-- END container-fluid -->

			</div>
			<!-- END content -->

		</div>
		<!-- END content-page -->


		"""),_display_(/*181.4*/footer()),format.raw/*181.12*/("""

	"""),format.raw/*183.2*/("""</div>
	<!-- Modal -->
	<div class="modal fade" id="añadirCliente" tabindex="-1" role="dialog"
		aria-labelledby="customModal" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="titleAñadirCliente">Añadir a un
						nuevo cliente</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form autocomplete="off" action="#" id="form-añadirCliente">
						<div class="form-group">
							<label>Documento<span class="text-danger">*</span></label> <input
								name="documento" type="text" class="form-control"
								id="input-documento-cliente" placeholder="Documento" required
								autocomplete="off">
						</div>
						<div class="form-group">
							<label>Nombre<span class="text-danger">*</span></label> <input
								name="nombre" type="text" class="form-control"
								id="input-nombre-cliente" placeholder="Nombre" required
								autocomplete="off">
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label>Apellido 1 <span class="text-danger">*</span></label> <input
									name="apellido1" type="text" class="form-control"
									id="input-apellido1-cliente" placeholder="Primer Apellido"
									required>
							</div>
							<div class="form-group col-md-6">
								<label>Apellido 2 <span class="text-danger">*</span></label> <input
									name="apellido2" type="text" class="form-control"
									id="input-apellido2-cliente" placeholder="Segundo Apellido"
									required>
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label>Direccion<span class="text-danger">*</span></label> <input
									name="direccion" type="text" class="form-control"
									id="input-direccion-cliente" placeholder="Direccion" required
									autocomplete="off">
							</div>
							<div class="form-group col-md-6">
								<label>Telefono <span class="text-danger">*</span></label> <input
									name="telefono" type="text" class="form-control"
									id="input-telefono-cliente" placeholder="Telefono" required>
							</div>
						</div>
						<div class="form-group">
							<label>Fecha Nacimiento<span class="text-danger">*</span></label>
							<input name="fechaNacimiento" type="date" class="form-control"
								id="input-nacimiento-cliente" placeholder="Fecha Nacimiento"
								required autocomplete="off">
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label>Ingresos<span class="text-danger">*</span></label> <input
									name="ingresos" type="number" class="form-control"
									id="input-ingresos-cliente" placeholder="Ingresos" required
									autocomplete="off">
							</div>
							<div class="form-group col-md-6">
								<label>Egresos <span class="text-danger">*</span></label> <input
									name="egresos" type="number" class="form-control"
									id="input-egresos-cliente" placeholder="Egresos" required>
							</div>
						</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal" id="cancelar-añadirCliente">Cancelar</button>
					<button type="submit" class="btn btn-success">Registrar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- Modal Editar -->
	<div class="modal fade" id="modal-editar-cliente" tabindex="-1"
		role="dialog" aria-labelledby="customModal" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="titleEditarCliente">
						Editar Cliente: <span id="id-cliente"></span>
					</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form autocomplete="off" action="#" id="form-añadirCliente">
						<div class="form-group">
							<label>Documento<span class="text-danger">*</span></label> <input
								type="text" class="form-control"
								id="input-documento-cliente-editar" placeholder="Documento"
								required autocomplete="off">
						</div>
						<div class="form-group">
							<label>Nombre<span class="text-danger">*</span></label> <input
								type="text" class="form-control"
								id="input-nombre-cliente-editar" placeholder="Nombre" required
								autocomplete="off">
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label>Apellido 1 <span class="text-danger">*</span></label> <input
									type="text" class="form-control"
									id="input-apellido1-cliente-editar"
									placeholder="Primer Apellido" required>
							</div>
							<div class="form-group col-md-6">
								<label>Apellido 2 <span class="text-danger">*</span></label> <input
									type="text" class="form-control"
									id="input-apellido2-cliente-editar"
									placeholder="Segundo Apellido" required>
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label>Direccion<span class="text-danger">*</span></label> <input
									type="text" class="form-control"
									id="input-direccion-cliente-editar" placeholder="Direccion"
									required autocomplete="off">
							</div>
							<div class="form-group col-md-6">
								<label>Telefono <span class="text-danger">*</span></label> <input
									type="text" class="form-control"
									id="input-telefono-cliente-editar" placeholder="Telefono"
									required>
							</div>
						</div>
						<div class="form-group">
							<label>Fecha Nacimiento<span class="text-danger">*</span></label>
							<input type="date" class="form-control"
								id="input-nacimiento-cliente-editar"
								placeholder="Fecha Nacimiento" required autocomplete="off">
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label>Ingresos<span class="text-danger">*</span></label> <input
									type="number" class="form-control"
									id="input-ingresos-cliente-editar" placeholder="Ingresos"
									required autocomplete="off">
							</div>
							<div class="form-group col-md-6">
								<label>Egresos <span class="text-danger">*</span></label> <input
									type="number" class="form-control"
									id="input-egresos-cliente-editar" placeholder="Egresos"
									required>
							</div>
						</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal" id="cancelar-editarCliente">Cancelar</button>
					<button type="submit" class="btn btn-success">Editar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- Modal Registrar Bien-->
	<div class="modal fade" id="añadirBien" tabindex="-1" role="dialog"
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
					<form autocomplete="off" action="#" id="form-añadirBien">
						<div class="form-group">
							<label>Documento cliente<span class="text-danger">*</span></label>
							<input type="text" class="form-control"
								id="input-documento-cliente-bien" placeholder="Documento"
								required autocomplete="off" disabled>
						</div>
						<div class="form-group">
							<label>Categoria <span class="text-danger">*</span></label> <select
								class="custom-select" id="input-nombre-categoria-bien" required>
								<option value="">Selecciona la categoria</option>
							</select>
						</div>
						<div class="form-group">
							<label>Nombre referencia<span class="text-danger">*</span></label>
							<input type="text" class="form-control"
								id="input-nombre-referencia-bien"
								placeholder="Nombre referencia" required autocomplete="off">
						</div>
						<div class="form-group">
							<label>Caracteristicas<span class="text-danger">*</span></label>
							<textarea id="input-caracteristicas-bien"
								class="md-textarea form-control" rows="3" required
								autocomplete="off"></textarea>
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
	<!-- END main -->

	<script src='"""),_display_(/*404.16*/routes/*404.22*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*404.64*/("""'></script>
	<script src='"""),_display_(/*405.16*/routes/*405.22*/.Assets.versioned("js/modernizr.min.js")),format.raw/*405.62*/("""'></script>
	<script src='"""),_display_(/*406.16*/routes/*406.22*/.Assets.versioned("js/jquery.min.js")),format.raw/*406.59*/("""'></script>
	<script src='"""),_display_(/*407.16*/routes/*407.22*/.Assets.versioned("js/moment.min.js")),format.raw/*407.59*/("""'></script>

	<script src='"""),_display_(/*409.16*/routes/*409.22*/.Assets.versioned("js/popper.min.js")),format.raw/*409.59*/("""'></script>
	<script src='"""),_display_(/*410.16*/routes/*410.22*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*410.62*/("""'></script>

	<script src='"""),_display_(/*412.16*/routes/*412.22*/.Assets.versioned("js/detect.js")),format.raw/*412.55*/("""'></script>
	<script src='"""),_display_(/*413.16*/routes/*413.22*/.Assets.versioned("js/fastclick.js")),format.raw/*413.58*/("""'></script>
	<script src='"""),_display_(/*414.16*/routes/*414.22*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*414.63*/("""'></script>
	<script src='"""),_display_(/*415.16*/routes/*415.22*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*415.66*/("""'></script>
	<script src='"""),_display_(/*416.16*/routes/*416.22*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*416.68*/("""'></script>
	<script
		src='"""),_display_(/*418.9*/routes/*418.15*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*418.70*/("""'></script>

	<!-- App js -->
	<script src='"""),_display_(/*421.16*/routes/*421.22*/.Assets.versioned("js/pikeadmin.js")),format.raw/*421.58*/("""'></script>

	<!-- BEGIN Java Script for this page -->

	<script
		src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
	<script src='"""),_display_(/*429.16*/routes/*429.22*/.Assets.versioned("js/pagesJS/clientes.js")),format.raw/*429.65*/("""'></script>
	<!-- END Java Script for this page -->

</body>
</html>
""")))}),format.raw/*434.2*/("""
"""))
      }
    }
  }

  def render(name:String,clientes:ArrayBuffer[Cliente],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(name)(clientes)(request)

  def f:((String) => (ArrayBuffer[Cliente]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (name) => (clientes) => (request) => apply(name)(clientes)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-09T16:19:02.794
                  SOURCE: C:/Users/juanm/git/Seguros/app/views/clientes.scala.html
                  HASH: 435f8d75f9e0e6003195af34db8833169410da54
                  MATRIX: 432->1|818->47|989->126|1036->165|1086->178|1113->179|1544->584|1559->590|1619->629|1686->670|1701->676|1778->732|1865->792|1880->798|1943->840|2049->920|2064->926|2143->984|2243->1057|2258->1063|2323->1107|2402->1159|2417->1165|2484->1211|2563->1263|2578->1269|2633->1303|2899->1541|2928->1542|2957->1544|3003->1564|3018->1570|3099->1630|3174->1678|3202->1679|3231->1681|3287->1709|3316->1710|3345->1712|3391->1732|3406->1738|3488->1799|3545->1829|3573->1830|3601->1831|3754->1958|3783->1966|3813->1969|3892->2022|3930->2039|3960->2042|5882->3936|5930->3967|5970->3968|6012->3981|6086->4027|6107->4038|6139->4048|6191->4072|6212->4083|6241->4090|6293->4114|6314->4125|6346->4135|6445->4206|6466->4217|6499->4228|6551->4252|6572->4263|6610->4279|6662->4303|6683->4314|6715->4324|6767->4348|6788->4359|6819->4368|7220->4737|7261->4749|7536->4997|7566->5005|7597->5008|16555->13938|16571->13944|16635->13986|16690->14013|16706->14019|16768->14059|16823->14086|16839->14092|16898->14129|16953->14156|16969->14162|17028->14199|17084->14227|17100->14233|17159->14270|17214->14297|17230->14303|17292->14343|17348->14371|17364->14377|17419->14410|17474->14437|17490->14443|17548->14479|17603->14506|17619->14512|17682->14553|17737->14580|17753->14586|17819->14630|17874->14657|17890->14663|17958->14709|18014->14738|18030->14744|18107->14799|18180->14844|18196->14850|18254->14886|18537->15141|18553->15147|18618->15190|18719->15260
                  LINES: 17->1|22->2|27->3|27->3|27->3|28->4|42->18|42->18|42->18|46->22|46->22|46->22|50->26|50->26|50->26|55->31|55->31|55->31|59->35|59->35|59->35|61->37|61->37|61->37|63->39|63->39|63->39|71->47|71->47|72->48|73->49|73->49|73->49|76->52|76->52|78->54|78->54|78->54|79->55|80->56|80->56|80->56|82->58|82->58|83->59|93->69|93->69|94->70|98->74|98->74|99->75|163->139|163->139|163->139|164->140|166->142|166->142|166->142|167->143|167->143|167->143|168->144|168->144|168->144|170->146|170->146|170->146|171->147|171->147|171->147|172->148|172->148|172->148|173->149|173->149|173->149|182->158|183->159|205->181|205->181|207->183|428->404|428->404|428->404|429->405|429->405|429->405|430->406|430->406|430->406|431->407|431->407|431->407|433->409|433->409|433->409|434->410|434->410|434->410|436->412|436->412|436->412|437->413|437->413|437->413|438->414|438->414|438->414|439->415|439->415|439->415|440->416|440->416|440->416|442->418|442->418|442->418|445->421|445->421|445->421|453->429|453->429|453->429|458->434
                  -- GENERATED --
              */
          