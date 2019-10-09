
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
  def apply/*2.2*/(name: String)(clientes:ArrayBuffer[Cliente])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
    """),format.raw/*4.5*/("""<!DOCTYPE html>
    <html lang="en">
    <head>
    		<meta charset="utf-8">
    		<meta name="viewport" content="width=device-width, initial-scale=1.0">
    		
    		<title>Pike Admin - Free Bootstrap 4 Admin Template</title>
    		<meta name="description" content="Free Bootstrap 4 Admin Theme | Pike Admin">
    		<meta name="author" content="Pike Web Development - https://www.pikephp.com">

    		<!-- Favicon -->
    		<link rel="shortcut icon" href='"""),_display_(/*15.40*/routes/*15.46*/.Assets.versioned("images/favicon.ico")),format.raw/*15.85*/("""'>

    		<!-- Switchery css -->
    		<link href='"""),_display_(/*18.20*/routes/*18.26*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*18.82*/("""' rel="stylesheet" />
    		
    		<!-- Bootstrap CSS -->
    		<link href='"""),_display_(/*21.20*/routes/*21.26*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*21.68*/("""' rel="stylesheet" type="text/css" />
    		
    		<!-- Font Awesome CSS -->
    		<link href='"""),_display_(/*24.20*/routes/*24.26*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*24.84*/("""' rel="stylesheet" type="text/css" />
    		
    		<!-- Custom CSS -->
            <link href='"""),_display_(/*27.26*/routes/*27.32*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*27.76*/("""' rel="stylesheet" type="text/css" />
            <link href='"""),_display_(/*28.26*/routes/*28.32*/.Assets.versioned("css/dataTableCollapse.css")),format.raw/*28.78*/("""' rel="stylesheet" type="text/css" />   
    		<link href='"""),_display_(/*29.20*/routes/*29.26*/.Assets.versioned("css/style.css")),format.raw/*29.60*/("""' rel="stylesheet" type="text/css" />	
    		
    		<!-- BEGIN CSS for this page -->
            <!-- DataTable -->
            <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css"/>    
            <style> 
            td.details-control """),format.raw/*35.32*/("""{"""),format.raw/*35.33*/("""
            """),format.raw/*36.13*/("""background: url('"""),_display_(/*36.31*/routes/*36.37*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*36.97*/("""') no-repeat center center;
            cursor: pointer;
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/("""
            """),format.raw/*39.13*/("""tr.shown td.details-control """),format.raw/*39.41*/("""{"""),format.raw/*39.42*/("""
            """),format.raw/*40.13*/("""background: url('"""),_display_(/*40.31*/routes/*40.37*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*40.98*/("""') no-repeat center center;
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/("""
            """),format.raw/*42.13*/("""</style>    
    		<!-- END CSS for this page -->
    				
    </head>

    <body class="adminbody">

    <div id="main">

    	<!-- top bar navigation -->
    	"""),_display_(/*52.7*/header()),format.raw/*52.15*/("""
    	"""),format.raw/*53.6*/("""<!-- End Navigation -->
    	
     
    	<!-- Left Sidebar -->
    	"""),_display_(/*57.7*/leftSidebar(name)),format.raw/*57.24*/("""
    	"""),format.raw/*58.6*/("""<!-- End Sidebar -->


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
                                                        	"""),_display_(/*114.59*/for(x <- 0 until clientes.size) yield /*114.90*/{_display_(Seq[Any](format.raw/*114.91*/("""
                                                            """),format.raw/*115.61*/("""<tr>
                                                            	<td></td>
                                                              	<td>"""),_display_(/*117.69*/clientes(x)/*117.80*/.documento),format.raw/*117.90*/("""</td>
                                                                <td>"""),_display_(/*118.70*/clientes(x)/*118.81*/.nombre),format.raw/*118.88*/("""</td>
                                                                <td>"""),_display_(/*119.70*/clientes(x)/*119.81*/.ptelefono),format.raw/*119.91*/("""</td>
                                                                <td>"""),_display_(/*120.70*/clientes(x)/*120.81*/.pdireccion),format.raw/*120.92*/("""</td>
                                                                <td>"""),_display_(/*121.70*/clientes(x)/*121.81*/.fechaNacimiento),format.raw/*121.97*/("""</td>
                                                                <td>"""),_display_(/*122.70*/clientes(x)/*122.81*/.pingresos),format.raw/*122.91*/("""</td>
                                                                <td>"""),_display_(/*123.70*/clientes(x)/*123.81*/.pegresos),format.raw/*123.90*/("""</td>
                                                                <th><center><a role="button" href="#" class="btn btn-primary editar-cliente"><i class="fa fa-pencil"></i></a> <a role="button" href="#" class="btn btn-danger eliminar-cliente"><i class="fa fa-trash-o"></i></a></center></th>
                                                                </tr>                                                                
                                                                """)))}),format.raw/*126.66*/("""                                                                
                                                        """),format.raw/*127.57*/("""</tbody>
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
        

    	"""),_display_(/*148.7*/footer()),format.raw/*148.15*/("""

    """),format.raw/*150.5*/("""</div>
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
                            <input name="documento" type="text" class="form-control" id="input-documento-cliente" placeholder="Documento" required autocomplete="off">
                        </div>
                        <div class="form-group">
                            <label>Nombre<span class="text-danger">*</span></label>
                            <input name="nombre" type="text" class="form-control"	 id="input-nombre-cliente" placeholder="Nombre" required autocomplete="off">
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label>Apellido 1 <span class="text-danger">*</span></label>
                                <input name="apellido1" type="text" class="form-control" id="input-apellido1-cliente" placeholder="Primer Apellido" required>
                            </div>
                            <div class="form-group col-md-6">
                                <label>Apellido 2 <span class="text-danger">*</span></label>
                                <input name="apellido2" type="text" class="form-control" id="input-apellido2-cliente" placeholder="Segundo Apellido" required>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label>Direccion<span class="text-danger">*</span></label>
                                <input name="direccion" type="text" class="form-control" id="input-direccion-cliente" placeholder="Direccion" required autocomplete="off">
                            </div>
                            <div class="form-group col-md-6">
                                <label>Telefono <span class="text-danger">*</span></label>
                                <input name="telefono" type="text" class="form-control" id="input-telefono-cliente" placeholder="Telefono" required>
                            </div>
                        </div> 
                        <div class="form-group">
                            <label>Fecha Nacimiento<span class="text-danger">*</span></label>
                            <input name="fechaNacimiento" type="date" class="form-control" id="input-nacimiento-cliente" placeholder="Fecha Nacimiento" required autocomplete="off">
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label>Ingresos<span class="text-danger">*</span></label>
                                <input name="ingresos" type="number" class="form-control" id="input-ingresos-cliente" placeholder="Ingresos" required autocomplete="off">
                            </div>
                            <div class="form-group col-md-6">
                                <label>Egresos <span class="text-danger">*</span></label>
                                <input name="egresos" type="number" class="form-control" id="input-egresos-cliente" placeholder="Egresos" required>
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

    <script src='"""),_display_(/*318.19*/routes/*318.25*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*318.67*/("""'></script>
    <script src='"""),_display_(/*319.19*/routes/*319.25*/.Assets.versioned("js/modernizr.min.js")),format.raw/*319.65*/("""'></script>
    <script src='"""),_display_(/*320.19*/routes/*320.25*/.Assets.versioned("js/jquery.min.js")),format.raw/*320.62*/("""'></script>
    <script src='"""),_display_(/*321.19*/routes/*321.25*/.Assets.versioned("js/moment.min.js")),format.raw/*321.62*/("""'></script>

    <script src='"""),_display_(/*323.19*/routes/*323.25*/.Assets.versioned("js/popper.min.js")),format.raw/*323.62*/("""'></script>
    <script src='"""),_display_(/*324.19*/routes/*324.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*324.65*/("""'></script>

    <script src='"""),_display_(/*326.19*/routes/*326.25*/.Assets.versioned("js/detect.js")),format.raw/*326.58*/("""'></script>
    <script src='"""),_display_(/*327.19*/routes/*327.25*/.Assets.versioned("js/fastclick.js")),format.raw/*327.61*/("""'></script>
    <script src='"""),_display_(/*328.19*/routes/*328.25*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*328.66*/("""'></script>
    <script src='"""),_display_(/*329.19*/routes/*329.25*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*329.69*/("""'></script>
    <script src='"""),_display_(/*330.19*/routes/*330.25*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*330.71*/("""'></script>
    <script src='"""),_display_(/*331.19*/routes/*331.25*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*331.80*/("""'></script>

    <!-- App js -->
    <script src='"""),_display_(/*334.19*/routes/*334.25*/.Assets.versioned("js/pikeadmin.js")),format.raw/*334.61*/("""'></script>

    <!-- BEGIN Java Script for this page -->

    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
    <script src='"""),_display_(/*340.19*/routes/*340.25*/.Assets.versioned("js/pagesJS/clientes.js")),format.raw/*340.68*/("""'></script>
    <!-- END Java Script for this page -->

    </body>
    </html>
""")))}),format.raw/*345.2*/("""
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
                  DATE: 2019-10-09T11:18:50.923
                  SOURCE: C:/Users/MSI-PC/git/Seguros/app/views/clientes.scala.html
                  HASH: 6faa72b27fa02c487102afb86bb7228056c28754
                  MATRIX: 432->1|818->46|990->126|1037->165|1087->178|1118->183|1603->641|1618->647|1678->686|1757->738|1772->744|1849->800|1953->877|1968->883|2031->925|2154->1021|2169->1027|2248->1085|2371->1181|2386->1187|2451->1231|2541->1294|2556->1300|2623->1346|2710->1406|2725->1412|2780->1446|3109->1747|3138->1748|3179->1761|3224->1779|3239->1785|3320->1845|3417->1914|3446->1915|3487->1928|3543->1956|3572->1957|3613->1970|3658->1988|3673->1994|3755->2055|3823->2095|3852->2096|3893->2109|4081->2271|4110->2279|4143->2285|4238->2354|4276->2371|4309->2377|7816->5856|7864->5887|7904->5888|7994->5949|8166->6093|8187->6104|8219->6114|8322->6189|8343->6200|8372->6207|8475->6282|8496->6293|8528->6303|8631->6378|8652->6389|8685->6400|8788->6475|8809->6486|8847->6502|8950->6577|8971->6588|9003->6598|9106->6673|9127->6684|9158->6693|9683->7186|9833->7307|10467->7914|10497->7922|10531->7928|21954->19323|21970->19329|22034->19371|22092->19401|22108->19407|22170->19447|22228->19477|22244->19483|22303->19520|22361->19550|22377->19556|22436->19593|22495->19624|22511->19630|22570->19667|22628->19697|22644->19703|22706->19743|22765->19774|22781->19780|22836->19813|22894->19843|22910->19849|22968->19885|23026->19915|23042->19921|23105->19962|23163->19992|23179->19998|23245->20042|23303->20072|23319->20078|23387->20124|23445->20154|23461->20160|23538->20215|23617->20266|23633->20272|23691->20308|23982->20571|23998->20577|24063->20620|24175->20701
                  LINES: 17->1|22->2|27->3|27->3|27->3|28->4|39->15|39->15|39->15|42->18|42->18|42->18|45->21|45->21|45->21|48->24|48->24|48->24|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|59->35|59->35|60->36|60->36|60->36|60->36|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|64->40|65->41|65->41|66->42|76->52|76->52|77->53|81->57|81->57|82->58|138->114|138->114|138->114|139->115|141->117|141->117|141->117|142->118|142->118|142->118|143->119|143->119|143->119|144->120|144->120|144->120|145->121|145->121|145->121|146->122|146->122|146->122|147->123|147->123|147->123|150->126|151->127|172->148|172->148|174->150|342->318|342->318|342->318|343->319|343->319|343->319|344->320|344->320|344->320|345->321|345->321|345->321|347->323|347->323|347->323|348->324|348->324|348->324|350->326|350->326|350->326|351->327|351->327|351->327|352->328|352->328|352->328|353->329|353->329|353->329|354->330|354->330|354->330|355->331|355->331|355->331|358->334|358->334|358->334|364->340|364->340|364->340|369->345
                  -- GENERATED --
              */
          