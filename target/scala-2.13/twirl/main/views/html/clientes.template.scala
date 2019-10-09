
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


Seq[Any](format.raw/*2.80*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
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
                                                                <td>"""),_display_(/*119.70*/clientes(x)/*119.81*/.pdatosContacto),format.raw/*119.96*/("""</td>
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
                  DATE: 2019-10-09T17:11:21.025
                  SOURCE: C:/Users/user/Documents/GitHub/Seguros/app/views/clientes.scala.html
                  HASH: 413ffa11e0f57f1a2c24a94a67badb6a30bb9399
                  MATRIX: 432->1|818->47|991->125|1019->128|1066->167|1116->180|1148->186|1644->655|1659->661|1719->700|1801->755|1816->761|1893->817|2000->897|2015->903|2078->945|2204->1044|2219->1050|2298->1108|2424->1207|2439->1213|2504->1257|2595->1321|2610->1327|2677->1373|2765->1434|2780->1440|2835->1474|3170->1781|3199->1782|3241->1796|3286->1814|3301->1820|3382->1880|3481->1951|3510->1952|3552->1966|3608->1994|3637->1995|3679->2009|3724->2027|3739->2033|3821->2094|3890->2135|3919->2136|3961->2150|4159->2322|4188->2330|4222->2337|4321->2410|4359->2427|4393->2434|7956->5969|8004->6000|8044->6001|8135->6063|8309->6209|8330->6220|8362->6230|8466->6306|8487->6317|8516->6324|8620->6400|8641->6411|8678->6426|8782->6502|8803->6513|8836->6524|8940->6600|8961->6611|8999->6627|9103->6703|9124->6714|9156->6724|9260->6800|9281->6811|9312->6820|9840->7316|9991->7438|10646->8066|10676->8074|10712->8082|22303->19645|22319->19651|22383->19693|22442->19724|22458->19730|22520->19770|22579->19801|22595->19807|22654->19844|22713->19875|22729->19881|22788->19918|22849->19951|22865->19957|22924->19994|22983->20025|22999->20031|23061->20071|23122->20104|23138->20110|23193->20143|23252->20174|23268->20180|23326->20216|23385->20247|23401->20253|23464->20294|23523->20325|23539->20331|23605->20375|23664->20406|23680->20412|23748->20458|23807->20489|23823->20495|23900->20550|23982->20604|23998->20610|24056->20646|24353->20915|24369->20921|24434->20964|24551->21050
                  LINES: 17->1|22->2|27->2|28->3|28->3|28->3|29->4|40->15|40->15|40->15|43->18|43->18|43->18|46->21|46->21|46->21|49->24|49->24|49->24|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|60->35|60->35|61->36|61->36|61->36|61->36|63->38|63->38|64->39|64->39|64->39|65->40|65->40|65->40|65->40|66->41|66->41|67->42|77->52|77->52|78->53|82->57|82->57|83->58|139->114|139->114|139->114|140->115|142->117|142->117|142->117|143->118|143->118|143->118|144->119|144->119|144->119|145->120|145->120|145->120|146->121|146->121|146->121|147->122|147->122|147->122|148->123|148->123|148->123|151->126|152->127|173->148|173->148|175->150|343->318|343->318|343->318|344->319|344->319|344->319|345->320|345->320|345->320|346->321|346->321|346->321|348->323|348->323|348->323|349->324|349->324|349->324|351->326|351->326|351->326|352->327|352->327|352->327|353->328|353->328|353->328|354->329|354->329|354->329|355->330|355->330|355->330|356->331|356->331|356->331|359->334|359->334|359->334|365->340|365->340|365->340|370->345
                  -- GENERATED --
              */
          