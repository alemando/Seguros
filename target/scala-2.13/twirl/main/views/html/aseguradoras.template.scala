
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


Seq[Any](_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
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
                  DATE: 2019-10-09T14:15:34.464
                  SOURCE: C:/Users/juanm/git/Seguros/app/views/aseguradoras.scala.html
                  HASH: a7b9bb45c27c7bcc103370a980f415838fe023ef
                  MATRIX: 754->1|906->61|953->100|1003->113|1030->114|1430->487|1445->493|1505->532|1576->576|1591->582|1668->638|1758->701|1773->707|1836->749|1945->831|1960->837|2039->895|2145->974|2160->980|2225->1024|2308->1080|2323->1086|2378->1120|2659->1373|2688->1374|2724->1383|2769->1401|2784->1407|2865->1467|2949->1524|2977->1525|3009->1530|3065->1558|3094->1559|3130->1568|3175->1586|3190->1592|3272->1653|3331->1685|3359->1686|3387->1687|3557->1831|3586->1839|3618->1844|3701->1901|3739->1918|3767->1919|6512->4637|6542->4645|6572->4647|10631->8678|10647->8684|10711->8726|10765->8752|10781->8758|10843->8798|10897->8824|10913->8830|10972->8867|11026->8893|11042->8899|11101->8936|11156->8963|11172->8969|11231->9006|11285->9032|11301->9038|11363->9078|11418->9105|11434->9111|11489->9144|11543->9170|11559->9176|11617->9212|11671->9238|11687->9244|11750->9285|11804->9311|11820->9317|11886->9361|11940->9387|11956->9393|12024->9439|12078->9465|12094->9471|12171->9526|12242->9569|12258->9575|12316->9611|12613->9880|12629->9886|12698->9933
                  LINES: 21->1|26->2|26->2|26->2|27->3|38->14|38->14|38->14|41->17|41->17|41->17|44->20|44->20|44->20|47->23|47->23|47->23|51->27|51->27|51->27|52->28|52->28|52->28|58->34|58->34|59->35|59->35|59->35|59->35|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|63->39|64->40|64->40|65->41|75->51|75->51|76->52|80->56|80->56|81->57|159->135|159->135|161->137|230->206|230->206|230->206|231->207|231->207|231->207|232->208|232->208|232->208|233->209|233->209|233->209|235->211|235->211|235->211|236->212|236->212|236->212|238->214|238->214|238->214|239->215|239->215|239->215|240->216|240->216|240->216|241->217|241->217|241->217|242->218|242->218|242->218|243->219|243->219|243->219|246->222|246->222|246->222|253->229|253->229|253->229
                  -- GENERATED --
              */
          