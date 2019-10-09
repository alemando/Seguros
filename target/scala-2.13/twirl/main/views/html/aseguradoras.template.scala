
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


Seq[Any](format.raw/*2.88*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
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
                  DATE: 2019-10-09T15:39:33.331
                  SOURCE: C:/Users/Usuario/Desktop/seguros/app/views/aseguradoras.scala.html
                  HASH: 5e524969e75a519afed0255e02908fa9a334a5fc
                  MATRIX: 432->1|826->47|1007->133|1035->136|1082->175|1132->188|1160->190|1571->574|1586->580|1646->619|1720->666|1735->672|1812->728|1905->794|1920->800|1983->842|2095->927|2110->933|2189->991|2299->1074|2314->1080|2379->1124|2463->1181|2478->1187|2533->1221|2820->1480|2849->1481|2886->1491|2931->1509|2946->1515|3027->1575|3113->1634|3141->1635|3174->1641|3230->1669|3259->1670|3296->1680|3341->1698|3356->1704|3438->1765|3498->1798|3526->1799|3555->1801|3735->1955|3764->1963|3797->1969|3884->2030|3922->2047|3951->2049|5977->4047|6016->4069|6056->4070|6111->4096|6178->4135|6189->4136|6218->4143|6286->4183|6297->4184|6323->4188|6391->4228|6402->4229|6433->4238|6785->4558|6836->4580|7169->4886|7199->4894|7231->4898|11359->8998|11375->9004|11439->9046|11494->9073|11510->9079|11572->9119|11627->9146|11643->9152|11702->9189|11757->9216|11773->9222|11832->9259|11889->9288|11905->9294|11964->9331|12019->9358|12035->9364|12097->9404|12154->9433|12170->9439|12225->9472|12280->9499|12296->9505|12354->9541|12409->9568|12425->9574|12488->9615|12543->9642|12559->9648|12625->9692|12680->9719|12696->9725|12764->9771|12819->9798|12835->9804|12912->9859|12986->9905|13002->9911|13060->9947|13364->10223|13380->10229|13449->10276
                  LINES: 17->1|22->2|27->2|28->3|28->3|28->3|29->4|40->15|40->15|40->15|43->18|43->18|43->18|46->21|46->21|46->21|49->24|49->24|49->24|53->28|53->28|53->28|54->29|54->29|54->29|60->35|60->35|61->36|61->36|61->36|61->36|63->38|63->38|64->39|64->39|64->39|65->40|65->40|65->40|65->40|66->41|66->41|67->42|77->52|77->52|78->53|82->57|82->57|83->58|135->110|135->110|135->110|136->111|137->112|137->112|137->112|138->113|138->113|138->113|139->114|139->114|139->114|142->117|143->118|163->138|163->138|165->140|234->209|234->209|234->209|235->210|235->210|235->210|236->211|236->211|236->211|237->212|237->212|237->212|239->214|239->214|239->214|240->215|240->215|240->215|242->217|242->217|242->217|243->218|243->218|243->218|244->219|244->219|244->219|245->220|245->220|245->220|246->221|246->221|246->221|247->222|247->222|247->222|250->225|250->225|250->225|257->232|257->232|257->232
                  -- GENERATED --
              */
          