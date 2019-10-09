
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

object clientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Any,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String)(param:Any)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
    """),format.raw/*3.5*/("""<!DOCTYPE html>
    <html lang="en">
    <head>
    		<meta charset="utf-8">
    		<meta name="viewport" content="width=device-width, initial-scale=1.0">
    		
    		<title>Pike Admin - Free Bootstrap 4 Admin Template</title>
    		<meta name="description" content="Free Bootstrap 4 Admin Theme | Pike Admin">
    		<meta name="author" content="Pike Web Development - https://www.pikephp.com">

    		<!-- Favicon -->
    		<link rel="shortcut icon" href='"""),_display_(/*14.40*/routes/*14.46*/.Assets.versioned("images/favicon.ico")),format.raw/*14.85*/("""'>

    		<!-- Switchery css -->
    		<link href='"""),_display_(/*17.20*/routes/*17.26*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*17.82*/("""' rel="stylesheet" />
    		
    		<!-- Bootstrap CSS -->
    		<link href='"""),_display_(/*20.20*/routes/*20.26*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*20.68*/("""' rel="stylesheet" type="text/css" />
    		
    		<!-- Font Awesome CSS -->
    		<link href='"""),_display_(/*23.20*/routes/*23.26*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*23.84*/("""' rel="stylesheet" type="text/css" />
    		
    		<!-- Custom CSS -->
            <link href='"""),_display_(/*26.26*/routes/*26.32*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*26.76*/("""' rel="stylesheet" type="text/css" />
            <link href='"""),_display_(/*27.26*/routes/*27.32*/.Assets.versioned("css/dataTableCollapse.css")),format.raw/*27.78*/("""' rel="stylesheet" type="text/css" />   
    		<link href='"""),_display_(/*28.20*/routes/*28.26*/.Assets.versioned("css/style.css")),format.raw/*28.60*/("""' rel="stylesheet" type="text/css" />	
    		
    		<!-- BEGIN CSS for this page -->
            <!-- DataTable -->
            <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css"/>    
            <style> 
            td.details-control """),format.raw/*34.32*/("""{"""),format.raw/*34.33*/("""
            """),format.raw/*35.13*/("""background: url('"""),_display_(/*35.31*/routes/*35.37*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*35.97*/("""') no-repeat center center;
            cursor: pointer;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""tr.shown td.details-control """),format.raw/*38.41*/("""{"""),format.raw/*38.42*/("""
            """),format.raw/*39.13*/("""background: url('"""),_display_(/*39.31*/routes/*39.37*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*39.98*/("""') no-repeat center center;
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
            """),format.raw/*41.13*/("""</style>    
    		<!-- END CSS for this page -->
    				
    </head>

    <body class="adminbody">

    <div id="main">

    	<!-- top bar navigation -->
    	"""),_display_(/*51.7*/header()),format.raw/*51.15*/("""
    	"""),format.raw/*52.6*/("""<!-- End Navigation -->
    	
     
    	<!-- Left Sidebar -->
    	"""),_display_(/*56.7*/leftSidebar(name)),format.raw/*56.24*/("""
    	"""),format.raw/*57.6*/("""<!-- End Sidebar -->


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
                                                            <tr>
                                                                <td></td>
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
        

    	"""),_display_(/*146.7*/footer()),format.raw/*146.15*/("""

    """),format.raw/*148.5*/("""</div>
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
    <!-- Modal Registrar Bien-->
    <div class="modal fade" id="añadirBien" tabindex="-1" role="dialog" aria-labelledby="customModal" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="titleAñadirCliente">Añadir a un nuevo bien</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form autocomplete="off" action="#" id="form-añadirBien">
                        <div class="form-group">
                            <label>Documento cliente<span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-documento-cliente-bien" placeholder="Documento" required autocomplete="off" disabled>
                        </div>
                        <div class="form-group">
                            <label>Categoria <span class="text-danger">*</span></label>
                            <select class="custom-select" id="input-nombre-categoria-bien" required>
                                <option value="">Selecciona la categoria</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Nombre referencia<span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="input-nombre-referencia-bien" placeholder="Nombre referencia" required autocomplete="off">
                        </div> 
                        <div class="form-group">
                            <label>Caracteristicas<span class="text-danger">*</span></label>
                            <textarea id="input-caracteristicas-bien" class="md-textarea form-control" rows="3" required autocomplete="off"></textarea>
                        </div>  
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal" id="cancelar-añadirCategoria">Cancelar</button>
                        <button type="submit" class="btn btn-success">Registrar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- END main -->

    <script src='"""),_display_(/*316.19*/routes/*316.25*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*316.67*/("""'></script>
    <script src='"""),_display_(/*317.19*/routes/*317.25*/.Assets.versioned("js/modernizr.min.js")),format.raw/*317.65*/("""'></script>
    <script src='"""),_display_(/*318.19*/routes/*318.25*/.Assets.versioned("js/jquery.min.js")),format.raw/*318.62*/("""'></script>
    <script src='"""),_display_(/*319.19*/routes/*319.25*/.Assets.versioned("js/moment.min.js")),format.raw/*319.62*/("""'></script>

    <script src='"""),_display_(/*321.19*/routes/*321.25*/.Assets.versioned("js/popper.min.js")),format.raw/*321.62*/("""'></script>
    <script src='"""),_display_(/*322.19*/routes/*322.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*322.65*/("""'></script>

    <script src='"""),_display_(/*324.19*/routes/*324.25*/.Assets.versioned("js/detect.js")),format.raw/*324.58*/("""'></script>
    <script src='"""),_display_(/*325.19*/routes/*325.25*/.Assets.versioned("js/fastclick.js")),format.raw/*325.61*/("""'></script>
    <script src='"""),_display_(/*326.19*/routes/*326.25*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*326.66*/("""'></script>
    <script src='"""),_display_(/*327.19*/routes/*327.25*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*327.69*/("""'></script>
    <script src='"""),_display_(/*328.19*/routes/*328.25*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*328.71*/("""'></script>
    <script src='"""),_display_(/*329.19*/routes/*329.25*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*329.80*/("""'></script>

    <!-- App js -->
    <script src='"""),_display_(/*332.19*/routes/*332.25*/.Assets.versioned("js/pikeadmin.js")),format.raw/*332.61*/("""'></script>

    <!-- BEGIN Java Script for this page -->

    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
    <script src='"""),_display_(/*338.19*/routes/*338.25*/.Assets.versioned("js/pagesJS/clientes.js")),format.raw/*338.68*/("""'></script>
    <!-- END Java Script for this page -->

    </body>
    </html>
""")))}),format.raw/*343.2*/("""
"""))
      }
    }
  }

  def render(name:String,param:Any,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(name)(param)(request)

  def f:((String) => (Any) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (name) => (param) => (request) => apply(name)(param)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-08T19:25:10.282
                  SOURCE: C:/Users/Usuario/Desktop/seguros/app/views/clientes.scala.html
                  HASH: 794f944c2511eaa9b5eb992428f26f6644754d19
                  MATRIX: 750->1|903->59|931->62|978->101|1028->114|1060->120|1556->589|1571->595|1631->634|1713->689|1728->695|1805->751|1912->831|1927->837|1990->879|2116->978|2131->984|2210->1042|2336->1141|2351->1147|2416->1191|2507->1255|2522->1261|2589->1307|2677->1368|2692->1374|2747->1408|3082->1715|3111->1716|3153->1730|3198->1748|3213->1754|3294->1814|3393->1885|3422->1886|3464->1900|3520->1928|3549->1929|3591->1943|3636->1961|3651->1967|3733->2028|3802->2069|3831->2070|3873->2084|4071->2256|4100->2264|4134->2271|4233->2344|4271->2361|4305->2368|9596->7632|9626->7640|9662->7648|21100->19058|21116->19064|21180->19106|21239->19137|21255->19143|21317->19183|21376->19214|21392->19220|21451->19257|21510->19288|21526->19294|21585->19331|21646->19364|21662->19370|21721->19407|21780->19438|21796->19444|21858->19484|21919->19517|21935->19523|21990->19556|22049->19587|22065->19593|22123->19629|22182->19660|22198->19666|22261->19707|22320->19738|22336->19744|22402->19788|22461->19819|22477->19825|22545->19871|22604->19902|22620->19908|22697->19963|22779->20017|22795->20023|22853->20059|23150->20328|23166->20334|23231->20377|23348->20463
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|39->14|39->14|39->14|42->17|42->17|42->17|45->20|45->20|45->20|48->23|48->23|48->23|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|59->34|59->34|60->35|60->35|60->35|60->35|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|64->39|65->40|65->40|66->41|76->51|76->51|77->52|81->56|81->56|82->57|171->146|171->146|173->148|341->316|341->316|341->316|342->317|342->317|342->317|343->318|343->318|343->318|344->319|344->319|344->319|346->321|346->321|346->321|347->322|347->322|347->322|349->324|349->324|349->324|350->325|350->325|350->325|351->326|351->326|351->326|352->327|352->327|352->327|353->328|353->328|353->328|354->329|354->329|354->329|357->332|357->332|357->332|363->338|363->338|363->338|368->343
                  -- GENERATED --
              */
          