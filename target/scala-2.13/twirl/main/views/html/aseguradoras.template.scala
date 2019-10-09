
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

object aseguradoras extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Any,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String)(param:Any)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang='en'>
<head>
  <meta charset='utf-8'>
  <meta name='viewport' content='width=device-width, initial-scale=1.0'>

  <title>Aseguradoras | Inequidad Seguros</title>
  <meta name='description' content='Seguros Inequidad | Clientes'>
  <meta name='author' content='Seguros Inequidad | Clientes'>

  <!-- Favicon -->
  <link rel='shortcut icon' href='"""),_display_(/*14.36*/routes/*14.42*/.Assets.versioned("images/favicon.ico")),format.raw/*14.81*/("""'>

  <!-- Switchery css -->
  <link href='"""),_display_(/*17.16*/routes/*17.22*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*17.78*/("""' rel='stylesheet' />

  <!-- Bootstrap CSS -->
  <link href='"""),_display_(/*20.16*/routes/*20.22*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*20.64*/("""' rel='stylesheet' type='text/css' />

  <!-- Font Awesome CSS -->
  <link href='"""),_display_(/*23.16*/routes/*23.22*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*23.80*/("""' rel='stylesheet' type='text/css' />
  

  <!-- Custom CSS -->
  <link href='"""),_display_(/*27.16*/routes/*27.22*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*27.66*/("""' rel='stylesheet' type='text/css' />   
  <link href='"""),_display_(/*28.16*/routes/*28.22*/.Assets.versioned("css/style.css")),format.raw/*28.56*/("""' rel='stylesheet' type='text/css' />	

  <!-- BEGIN CSS for this page -->
  <!-- DataTable -->
  <link rel='stylesheet' type='text/css' href='https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css'/>    
  <style> 
    td.details-control """),format.raw/*34.24*/("""{"""),format.raw/*34.25*/("""
        """),format.raw/*35.9*/("""background: url('"""),_display_(/*35.27*/routes/*35.33*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*35.93*/("""') no-repeat center center;
        cursor: pointer;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
    """),format.raw/*38.5*/("""tr.shown td.details-control """),format.raw/*38.33*/("""{"""),format.raw/*38.34*/("""
        """),format.raw/*39.9*/("""background: url('"""),_display_(/*39.27*/routes/*39.33*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*39.94*/("""') no-repeat center center;
    """),format.raw/*40.5*/("""}"""),format.raw/*40.6*/("""
"""),format.raw/*41.1*/("""</style>    
<!-- END CSS for this page -->

</head>

<body class='adminbody'>

    <div id='main'>

       <!-- top bar navigation -->
       """),_display_(/*51.9*/header()),format.raw/*51.17*/("""
    """),format.raw/*52.5*/("""<!-- End Navigation -->


    <!-- Left Sidebar -->
    """),_display_(/*56.6*/leftSidebar(name)),format.raw/*56.23*/("""
"""),format.raw/*57.1*/("""<!-- End Sidebar -->


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

"""),_display_(/*135.2*/footer()),format.raw/*135.10*/("""

"""),format.raw/*137.1*/("""</div>
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

<script src='"""),_display_(/*206.15*/routes/*206.21*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*206.63*/("""'></script>
<script src='"""),_display_(/*207.15*/routes/*207.21*/.Assets.versioned("js/modernizr.min.js")),format.raw/*207.61*/("""'></script>
<script src='"""),_display_(/*208.15*/routes/*208.21*/.Assets.versioned("js/jquery.min.js")),format.raw/*208.58*/("""'></script>
<script src='"""),_display_(/*209.15*/routes/*209.21*/.Assets.versioned("js/moment.min.js")),format.raw/*209.58*/("""'></script>

<script src='"""),_display_(/*211.15*/routes/*211.21*/.Assets.versioned("js/popper.min.js")),format.raw/*211.58*/("""'></script>
<script src='"""),_display_(/*212.15*/routes/*212.21*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*212.61*/("""'></script>

<script src='"""),_display_(/*214.15*/routes/*214.21*/.Assets.versioned("js/detect.js")),format.raw/*214.54*/("""'></script>
<script src='"""),_display_(/*215.15*/routes/*215.21*/.Assets.versioned("js/fastclick.js")),format.raw/*215.57*/("""'></script>
<script src='"""),_display_(/*216.15*/routes/*216.21*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*216.62*/("""'></script>
<script src='"""),_display_(/*217.15*/routes/*217.21*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*217.65*/("""'></script>
<script src='"""),_display_(/*218.15*/routes/*218.21*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*218.67*/("""'></script>
<script src='"""),_display_(/*219.15*/routes/*219.21*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*219.76*/("""'></script>

<!-- App js -->
<script src='"""),_display_(/*222.15*/routes/*222.21*/.Assets.versioned("js/pikeadmin.js")),format.raw/*222.57*/("""'></script>


<!-- Datatable js -->
<script src='https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js'></script>
<script src='https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js'></script>
<!-- BEGIN Java Script for this page -->
<script src='"""),_display_(/*229.15*/routes/*229.21*/.Assets.versioned("js/pagesJS/aseguradoras.js")),format.raw/*229.68*/("""'></script>
<!-- END Java Script for this page -->

</body>
</html>
""")))}))
      }
    }
  }

  def render(name:String,param:Any,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(name)(param)(request)

  def f:((String) => (Any) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (name) => (param) => (request) => apply(name)(param)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-09T15:44:51.311
                  SOURCE: C:/Users/user/Documents/GitHub/Seguros/app/views/aseguradoras.scala.html
                  HASH: 44b55785452ba0d37581f1468c9ef44486a31ac0
                  MATRIX: 754->1|907->59|935->62|982->101|1032->114|1060->116|1471->500|1486->506|1546->545|1620->592|1635->598|1712->654|1805->720|1820->726|1883->768|1995->853|2010->859|2089->917|2199->1000|2214->1006|2279->1050|2363->1107|2378->1113|2433->1147|2720->1406|2749->1407|2786->1417|2831->1435|2846->1441|2927->1501|3013->1560|3041->1561|3074->1567|3130->1595|3159->1596|3196->1606|3241->1624|3256->1630|3338->1691|3398->1724|3426->1725|3455->1727|3635->1881|3664->1889|3697->1895|3784->1956|3822->1973|3851->1975|6674->4771|6704->4779|6736->4783|10864->8883|10880->8889|10944->8931|10999->8958|11015->8964|11077->9004|11132->9031|11148->9037|11207->9074|11262->9101|11278->9107|11337->9144|11394->9173|11410->9179|11469->9216|11524->9243|11540->9249|11602->9289|11659->9318|11675->9324|11730->9357|11785->9384|11801->9390|11859->9426|11914->9453|11930->9459|11993->9500|12048->9527|12064->9533|12130->9577|12185->9604|12201->9610|12269->9656|12324->9683|12340->9689|12417->9744|12491->9790|12507->9796|12565->9832|12869->10108|12885->10114|12954->10161
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|39->14|39->14|39->14|42->17|42->17|42->17|45->20|45->20|45->20|48->23|48->23|48->23|52->27|52->27|52->27|53->28|53->28|53->28|59->34|59->34|60->35|60->35|60->35|60->35|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|64->39|65->40|65->40|66->41|76->51|76->51|77->52|81->56|81->56|82->57|160->135|160->135|162->137|231->206|231->206|231->206|232->207|232->207|232->207|233->208|233->208|233->208|234->209|234->209|234->209|236->211|236->211|236->211|237->212|237->212|237->212|239->214|239->214|239->214|240->215|240->215|240->215|241->216|241->216|241->216|242->217|242->217|242->217|243->218|243->218|243->218|244->219|244->219|244->219|247->222|247->222|247->222|254->229|254->229|254->229
                  -- GENERATED --
              */
          