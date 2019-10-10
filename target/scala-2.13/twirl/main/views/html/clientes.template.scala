
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

object clientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,ArrayBuffer[Cliente],ArrayBuffer[Categoria],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(name: String)(clientes:ArrayBuffer[Cliente])(categorias: ArrayBuffer[Categoria])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.116*/("""
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
                            <input type="text" class="form-control" name="documento" id="input-documento-cliente-bien" placeholder="Documento" required autocomplete="off" disabled>
                        </div>
                        <div class="form-group">
                            <label>Categoria <span class="text-danger">*</span></label>
                            <select class="custom-select" name="categoria" id="input-nombre-categoria-bien">
                              """),_display_(/*296.32*/for(x <- 0 until categorias.size) yield /*296.65*/{_display_(Seq[Any](format.raw/*296.66*/("""
                                """),format.raw/*297.33*/("""<option value=""> """),_display_(/*297.52*/categorias(x)/*297.65*/.nombre),format.raw/*297.72*/(""" """),format.raw/*297.73*/("""</option>
                              """)))}),format.raw/*298.32*/("""
                            """),format.raw/*299.29*/("""</select>
                        </div>
                        <div class="form-group">
                            <label>Nombre referencia<span class="text-danger">*</span></label>
                            <input type="text" class="form-control" name="nomRef" id="input-nombre-referencia-bien" placeholder="Nombre referencia" required autocomplete="off">
                        </div>
                        <div class="form-group">
                            <label>Caracteristicas<span class="text-danger">*</span></label>
                              <textarea id="input-caracteristicas-bien" name="caracteristicas" class="md-textarea form-control" rows="3" required autocomplete="off"></textarea>
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

    <script src='"""),_display_(/*320.19*/routes/*320.25*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*320.67*/("""'></script>
    <script src='"""),_display_(/*321.19*/routes/*321.25*/.Assets.versioned("js/modernizr.min.js")),format.raw/*321.65*/("""'></script>
    <script src='"""),_display_(/*322.19*/routes/*322.25*/.Assets.versioned("js/jquery.min.js")),format.raw/*322.62*/("""'></script>
    <script src='"""),_display_(/*323.19*/routes/*323.25*/.Assets.versioned("js/moment.min.js")),format.raw/*323.62*/("""'></script>

    <script src='"""),_display_(/*325.19*/routes/*325.25*/.Assets.versioned("js/popper.min.js")),format.raw/*325.62*/("""'></script>
    <script src='"""),_display_(/*326.19*/routes/*326.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*326.65*/("""'></script>

    <script src='"""),_display_(/*328.19*/routes/*328.25*/.Assets.versioned("js/detect.js")),format.raw/*328.58*/("""'></script>
    <script src='"""),_display_(/*329.19*/routes/*329.25*/.Assets.versioned("js/fastclick.js")),format.raw/*329.61*/("""'></script>
    <script src='"""),_display_(/*330.19*/routes/*330.25*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*330.66*/("""'></script>
    <script src='"""),_display_(/*331.19*/routes/*331.25*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*331.69*/("""'></script>
    <script src='"""),_display_(/*332.19*/routes/*332.25*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*332.71*/("""'></script>
    <script src='"""),_display_(/*333.19*/routes/*333.25*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*333.80*/("""'></script>

    <!-- App js -->
    <script src='"""),_display_(/*336.19*/routes/*336.25*/.Assets.versioned("js/pikeadmin.js")),format.raw/*336.61*/("""'></script>

    <!-- BEGIN Java Script for this page -->

    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>
    <script src='"""),_display_(/*342.19*/routes/*342.25*/.Assets.versioned("js/pagesJS/clientes.js")),format.raw/*342.68*/("""'></script>
    <!-- END Java Script for this page -->

    </body>
    </html>
""")))}),format.raw/*347.2*/("""
"""))
      }
    }
  }

  def render(name:String,clientes:ArrayBuffer[Cliente],categorias:ArrayBuffer[Categoria],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(name)(clientes)(categorias)(request)

  def f:((String) => (ArrayBuffer[Cliente]) => (ArrayBuffer[Categoria]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (name) => (clientes) => (categorias) => (request) => apply(name)(clientes)(categorias)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-10T00:20:27.934
                  SOURCE: C:/Users/Sebastian/Documents/GitHub/Seguros2/app/views/clientes.scala.html
                  HASH: b7a167b9deb69cae918471be09bdecd07b4f6d96
                  MATRIX: 432->1|841->47|1051->161|1079->164|1126->203|1176->216|1208->222|1698->685|1713->691|1773->730|1855->785|1870->791|1947->847|2048->921|2063->927|2126->969|2246->1062|2261->1068|2340->1126|2460->1219|2475->1225|2540->1269|2631->1333|2646->1339|2713->1385|2798->1443|2813->1449|2868->1483|3191->1778|3220->1779|3262->1793|3307->1811|3322->1817|3403->1877|3502->1948|3531->1949|3573->1963|3629->1991|3658->1992|3700->2006|3745->2024|3760->2030|3842->2091|3911->2132|3940->2133|3982->2147|4168->2307|4197->2315|4231->2322|4320->2385|4358->2402|4392->2409|7754->5743|7802->5774|7842->5775|7933->5837|8107->5983|8128->5994|8160->6004|8264->6080|8285->6091|8314->6098|8418->6174|8439->6185|8476->6200|8580->6276|8601->6287|8634->6298|8738->6374|8759->6385|8797->6401|8901->6477|8922->6488|8954->6498|9058->6574|9079->6585|9110->6594|9574->7026|9661->7084|10184->7580|10214->7588|10250->7596|20607->17925|20657->17958|20697->17959|20760->17993|20807->18012|20830->18025|20859->18032|20889->18033|20963->18075|21022->18105|22255->19310|22271->19316|22335->19358|22394->19389|22410->19395|22472->19435|22531->19466|22547->19472|22606->19509|22665->19540|22681->19546|22740->19583|22801->19616|22817->19622|22876->19659|22935->19690|22951->19696|23013->19736|23074->19769|23090->19775|23145->19808|23204->19839|23220->19845|23278->19881|23337->19912|23353->19918|23416->19959|23475->19990|23491->19996|23557->20040|23616->20071|23632->20077|23700->20123|23759->20154|23775->20160|23852->20215|23934->20269|23950->20275|24008->20311|24305->20580|24321->20586|24386->20629|24503->20715
                  LINES: 17->1|22->2|27->2|28->3|28->3|28->3|29->4|40->15|40->15|40->15|43->18|43->18|43->18|46->21|46->21|46->21|49->24|49->24|49->24|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|60->35|60->35|61->36|61->36|61->36|61->36|63->38|63->38|64->39|64->39|64->39|65->40|65->40|65->40|65->40|66->41|66->41|67->42|77->52|77->52|78->53|82->57|82->57|83->58|139->114|139->114|139->114|140->115|142->117|142->117|142->117|143->118|143->118|143->118|144->119|144->119|144->119|145->120|145->120|145->120|146->121|146->121|146->121|147->122|147->122|147->122|148->123|148->123|148->123|151->126|152->127|173->148|173->148|175->150|321->296|321->296|321->296|322->297|322->297|322->297|322->297|322->297|323->298|324->299|345->320|345->320|345->320|346->321|346->321|346->321|347->322|347->322|347->322|348->323|348->323|348->323|350->325|350->325|350->325|351->326|351->326|351->326|353->328|353->328|353->328|354->329|354->329|354->329|355->330|355->330|355->330|356->331|356->331|356->331|357->332|357->332|357->332|358->333|358->333|358->333|361->336|361->336|361->336|367->342|367->342|367->342|372->347
                  -- GENERATED --
              */
          