
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

object clientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
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
        
    	"""),_display_(/*145.7*/footer()),format.raw/*145.15*/("""

    """),format.raw/*147.5*/("""</div>
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

    <script src='"""),_display_(/*315.19*/routes/*315.25*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*315.67*/("""'></script>
    <script src='"""),_display_(/*316.19*/routes/*316.25*/.Assets.versioned("js/modernizr.min.js")),format.raw/*316.65*/("""'></script>
    <script src='"""),_display_(/*317.19*/routes/*317.25*/.Assets.versioned("js/jquery.min.js")),format.raw/*317.62*/("""'></script>
    <script src='"""),_display_(/*318.19*/routes/*318.25*/.Assets.versioned("js/moment.min.js")),format.raw/*318.62*/("""'></script>

    <script src='"""),_display_(/*320.19*/routes/*320.25*/.Assets.versioned("js/popper.min.js")),format.raw/*320.62*/("""'></script>
    <script src='"""),_display_(/*321.19*/routes/*321.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*321.65*/("""'></script>

    <script src='"""),_display_(/*323.19*/routes/*323.25*/.Assets.versioned("js/detect.js")),format.raw/*323.58*/("""'></script>
    <script src='"""),_display_(/*324.19*/routes/*324.25*/.Assets.versioned("js/fastclick.js")),format.raw/*324.61*/("""'></script>
    <script src='"""),_display_(/*325.19*/routes/*325.25*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*325.66*/("""'></script>
    <script src='"""),_display_(/*326.19*/routes/*326.25*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*326.69*/("""'></script>
    <script src='"""),_display_(/*327.19*/routes/*327.25*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*327.71*/("""'></script>
    <script src='"""),_display_(/*328.19*/routes/*328.25*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*328.80*/("""'></script>

    <!-- App js -->
    <script src='"""),_display_(/*331.19*/routes/*331.25*/.Assets.versioned("js/pikeadmin.js")),format.raw/*331.61*/("""'></script>

    <!-- BEGIN Java Script for this page -->

    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
    <script src='"""),_display_(/*337.19*/routes/*337.25*/.Assets.versioned("js/pagesJS/clientes.js")),format.raw/*337.68*/("""'></script>
    <!-- END Java Script for this page -->

    </body>
    </html>
""")))}),format.raw/*342.2*/("""
"""))
      }
    }
  }

  def render(name:String,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(name)(request)

  def f:((String) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (name) => (request) => apply(name)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-09T00:25:23.985
                  SOURCE: C:/Users/juanm/Documents/documentosImportantes/semestre 6/Requisitos/Seguros/app/views/clientes.scala.html
                  HASH: 733d2fd17a50341d3399321c2dc06ee995eb8343
                  MATRIX: 746->1|888->48|916->51|963->90|1013->103|1045->109|1541->578|1556->584|1616->623|1698->678|1713->684|1790->740|1897->820|1912->826|1975->868|2101->967|2116->973|2195->1031|2321->1130|2336->1136|2401->1180|2492->1244|2507->1250|2574->1296|2662->1357|2677->1363|2732->1397|3067->1704|3096->1705|3138->1719|3183->1737|3198->1743|3279->1803|3378->1874|3407->1875|3449->1889|3505->1917|3534->1918|3576->1932|3621->1950|3636->1956|3718->2017|3787->2058|3816->2059|3858->2073|4056->2245|4085->2253|4119->2260|4218->2333|4256->2350|4290->2357|9579->7619|9609->7627|9645->7635|21083->19045|21099->19051|21163->19093|21222->19124|21238->19130|21300->19170|21359->19201|21375->19207|21434->19244|21493->19275|21509->19281|21568->19318|21629->19351|21645->19357|21704->19394|21763->19425|21779->19431|21841->19471|21902->19504|21918->19510|21973->19543|22032->19574|22048->19580|22106->19616|22165->19647|22181->19653|22244->19694|22303->19725|22319->19731|22385->19775|22444->19806|22460->19812|22528->19858|22587->19889|22603->19895|22680->19950|22762->20004|22778->20010|22836->20046|23133->20315|23149->20321|23214->20364|23331->20450
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|39->14|39->14|39->14|42->17|42->17|42->17|45->20|45->20|45->20|48->23|48->23|48->23|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|59->34|59->34|60->35|60->35|60->35|60->35|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|64->39|65->40|65->40|66->41|76->51|76->51|77->52|81->56|81->56|82->57|170->145|170->145|172->147|340->315|340->315|340->315|341->316|341->316|341->316|342->317|342->317|342->317|343->318|343->318|343->318|345->320|345->320|345->320|346->321|346->321|346->321|348->323|348->323|348->323|349->324|349->324|349->324|350->325|350->325|350->325|351->326|351->326|351->326|352->327|352->327|352->327|353->328|353->328|353->328|356->331|356->331|356->331|362->337|362->337|362->337|367->342
                  -- GENERATED --
              */
          