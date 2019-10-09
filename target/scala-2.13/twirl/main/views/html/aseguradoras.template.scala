
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

object aseguradoras extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,ArrayBuffer[Aseguradora],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(name: String)(aseguradoras:ArrayBuffer[Aseguradora])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang='en'>
<head>
  <meta charset='utf-8'>
  <meta name='viewport' content='width=device-width, initial-scale=1.0'>

  <title>Aseguradoras | Inequidad Seguros</title>
  <meta name='description' content='Seguros Inequidad | Clientes'>
  <meta name='author' content='Seguros Inequidad | Clientes'>

  <!-- Favicon -->
  <link rel='shortcut icon' href='"""),_display_(/*15.36*/routes/*15.42*/.Assets.versioned("images/favicon.ico")),format.raw/*15.81*/("""'>

  <!-- Switchery css -->
  <link href='"""),_display_(/*18.16*/routes/*18.22*/.Assets.versioned("plugins/switchery/switchery.min.css")),format.raw/*18.78*/("""' rel='stylesheet' />

  <!-- Bootstrap CSS -->
  <link href='"""),_display_(/*21.16*/routes/*21.22*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*21.64*/("""' rel='stylesheet' type='text/css' />

  <!-- Font Awesome CSS -->
  <link href='"""),_display_(/*24.16*/routes/*24.22*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*24.80*/("""' rel='stylesheet' type='text/css' />
  

  <!-- Custom CSS -->
  <link href='"""),_display_(/*28.16*/routes/*28.22*/.Assets.versioned("css/sweetalert2.min.css")),format.raw/*28.66*/("""' rel='stylesheet' type='text/css' />   
  <link href='"""),_display_(/*29.16*/routes/*29.22*/.Assets.versioned("css/style.css")),format.raw/*29.56*/("""' rel='stylesheet' type='text/css' />	

  <!-- BEGIN CSS for this page -->
  <!-- DataTable -->
  <link rel='stylesheet' type='text/css' href='https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css'/>    
  <style> 
    td.details-control """),format.raw/*35.24*/("""{"""),format.raw/*35.25*/("""
        """),format.raw/*36.9*/("""background: url('"""),_display_(/*36.27*/routes/*36.33*/.Assets.versioned("plugins/datatables/img/details_open.png")),format.raw/*36.93*/("""') no-repeat center center;
        cursor: pointer;
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""
    """),format.raw/*39.5*/("""tr.shown td.details-control """),format.raw/*39.33*/("""{"""),format.raw/*39.34*/("""
        """),format.raw/*40.9*/("""background: url('"""),_display_(/*40.27*/routes/*40.33*/.Assets.versioned("plugins/datatables/img/details_close.png")),format.raw/*40.94*/("""') no-repeat center center;
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""
"""),format.raw/*42.1*/("""</style>    
<!-- END CSS for this page -->

</head>

<body class='adminbody'>

    <div id='main'>

       <!-- top bar navigation -->
       """),_display_(/*52.9*/header()),format.raw/*52.17*/("""
    """),format.raw/*53.5*/("""<!-- End Navigation -->


    <!-- Left Sidebar -->
    """),_display_(/*57.6*/leftSidebar(name)),format.raw/*57.23*/("""
"""),format.raw/*58.1*/("""<!-- End Sidebar -->


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
                    """),_display_(/*110.22*/for(i <- aseguradoras) yield /*110.44*/{_display_(Seq[Any](format.raw/*110.45*/("""
                        """),format.raw/*111.25*/("""<tr>
                            <td>"""),_display_(/*112.34*/i/*112.35*/.nombre),format.raw/*112.42*/("""</td>
                            <td>"""),_display_(/*113.34*/i/*113.35*/.nit),format.raw/*113.39*/("""</td>
                            <td>"""),_display_(/*114.34*/i/*114.35*/.contacto),format.raw/*114.44*/("""</td>
                            <th><center><a role='button' href='#' class='btn btn-primary editar-aseguradora'><i class='fa fa-pencil'></i></a> <a role='button' href='#' class='btn btn-danger eliminar-aseguradora'><i class='fa fa-trash-o'></i></a></center></th>
                        </tr>
                    """)))}),format.raw/*117.22*/("""
                    """),format.raw/*118.21*/("""</tbody>
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

"""),_display_(/*138.2*/footer()),format.raw/*138.10*/("""

"""),format.raw/*140.1*/("""</div>
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

<script src='"""),_display_(/*209.15*/routes/*209.21*/.Assets.versioned("js/sweetalert2.min.js")),format.raw/*209.63*/("""'></script>
<script src='"""),_display_(/*210.15*/routes/*210.21*/.Assets.versioned("js/modernizr.min.js")),format.raw/*210.61*/("""'></script>
<script src='"""),_display_(/*211.15*/routes/*211.21*/.Assets.versioned("js/jquery.min.js")),format.raw/*211.58*/("""'></script>
<script src='"""),_display_(/*212.15*/routes/*212.21*/.Assets.versioned("js/moment.min.js")),format.raw/*212.58*/("""'></script>

<script src='"""),_display_(/*214.15*/routes/*214.21*/.Assets.versioned("js/popper.min.js")),format.raw/*214.58*/("""'></script>
<script src='"""),_display_(/*215.15*/routes/*215.21*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*215.61*/("""'></script>

<script src='"""),_display_(/*217.15*/routes/*217.21*/.Assets.versioned("js/detect.js")),format.raw/*217.54*/("""'></script>
<script src='"""),_display_(/*218.15*/routes/*218.21*/.Assets.versioned("js/fastclick.js")),format.raw/*218.57*/("""'></script>
<script src='"""),_display_(/*219.15*/routes/*219.21*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*219.62*/("""'></script>
<script src='"""),_display_(/*220.15*/routes/*220.21*/.Assets.versioned("js/jquery.nicescroll.js")),format.raw/*220.65*/("""'></script>
<script src='"""),_display_(/*221.15*/routes/*221.21*/.Assets.versioned("js/jquery.scrollTo.min.js")),format.raw/*221.67*/("""'></script>
<script src='"""),_display_(/*222.15*/routes/*222.21*/.Assets.versioned("plugins/switchery/switchery.min.js")),format.raw/*222.76*/("""'></script>

<!-- App js -->
<script src='"""),_display_(/*225.15*/routes/*225.21*/.Assets.versioned("js/pikeadmin.js")),format.raw/*225.57*/("""'></script>


<!-- Datatable js -->
<script src='https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js'></script>
<script src='https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js'></script>
<!-- BEGIN Java Script for this page -->
<script src='"""),_display_(/*232.15*/routes/*232.21*/.Assets.versioned("js/pagesJS/aseguradoras.js")),format.raw/*232.68*/("""'></script>
<!-- END Java Script for this page -->

</body>
</html>
""")))}))
      }
    }
  }

  def render(name:String,aseguradoras:ArrayBuffer[Aseguradora],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(name)(aseguradoras)(request)

  def f:((String) => (ArrayBuffer[Aseguradora]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (name) => (aseguradoras) => (request) => apply(name)(aseguradoras)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-09T11:28:14.619
                  SOURCE: C:/Users/MSI-PC/git/Seguros/app/views/aseguradoras.scala.html
                  HASH: 8eb2cee3fadac4d7093b2d166fc69231b1d0410f
                  MATRIX: 432->1|826->46|1006->134|1053->173|1103->186|1130->187|1530->560|1545->566|1605->605|1676->649|1691->655|1768->711|1858->774|1873->780|1936->822|2045->904|2060->910|2139->968|2245->1047|2260->1053|2325->1097|2408->1153|2423->1159|2478->1193|2759->1446|2788->1447|2824->1456|2869->1474|2884->1480|2965->1540|3049->1597|3077->1598|3109->1603|3165->1631|3194->1632|3230->1641|3275->1659|3290->1665|3372->1726|3431->1758|3459->1759|3487->1760|3657->1904|3686->1912|3718->1917|3801->1974|3839->1991|3867->1992|5841->3938|5880->3960|5920->3961|5974->3986|6040->4024|6051->4025|6080->4032|6147->4071|6158->4072|6184->4076|6251->4115|6262->4116|6293->4125|6642->4442|6692->4463|7005->4749|7035->4757|7065->4759|11124->8790|11140->8796|11204->8838|11258->8864|11274->8870|11336->8910|11390->8936|11406->8942|11465->8979|11519->9005|11535->9011|11594->9048|11649->9075|11665->9081|11724->9118|11778->9144|11794->9150|11856->9190|11911->9217|11927->9223|11982->9256|12036->9282|12052->9288|12110->9324|12164->9350|12180->9356|12243->9397|12297->9423|12313->9429|12379->9473|12433->9499|12449->9505|12517->9551|12571->9577|12587->9583|12664->9638|12735->9681|12751->9687|12809->9723|13106->9992|13122->9998|13191->10045
                  LINES: 17->1|22->2|27->3|27->3|27->3|28->4|39->15|39->15|39->15|42->18|42->18|42->18|45->21|45->21|45->21|48->24|48->24|48->24|52->28|52->28|52->28|53->29|53->29|53->29|59->35|59->35|60->36|60->36|60->36|60->36|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|64->40|65->41|65->41|66->42|76->52|76->52|77->53|81->57|81->57|82->58|134->110|134->110|134->110|135->111|136->112|136->112|136->112|137->113|137->113|137->113|138->114|138->114|138->114|141->117|142->118|162->138|162->138|164->140|233->209|233->209|233->209|234->210|234->210|234->210|235->211|235->211|235->211|236->212|236->212|236->212|238->214|238->214|238->214|239->215|239->215|239->215|241->217|241->217|241->217|242->218|242->218|242->218|243->219|243->219|243->219|244->220|244->220|244->220|245->221|245->221|245->221|246->222|246->222|246->222|249->225|249->225|249->225|256->232|256->232|256->232
                  -- GENERATED --
              */
          