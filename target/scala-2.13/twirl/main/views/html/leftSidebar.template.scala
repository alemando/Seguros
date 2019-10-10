
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

object leftSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
    """),format.raw/*3.5*/("""<div class="left main-sidebar">
    
        <div class="sidebar-inner leftscroll">

            <div id="sidebar-menu">
        
            <ul>

                    <li class="submenu">
                        <a href="index.html"><i class="fa fa-fw fa-bars"></i><span> Home </span> </a>
                    </li>
                                        
                    <li class="submenu">
                        <a href="/clientes" """),_display_(/*16.46*/if(name=="Clientes")/*16.66*/{_display_(Seq[Any](format.raw/*16.67*/(""" """),format.raw/*16.68*/("""class="active" """)))}),format.raw/*16.84*/("""><i class="fa fa-fw fa-tv"></i> <span> Clientes</span> <span class="menu-arrow"></span></a>
                            <ul class="list-unstyled">
                                <li """),_display_(/*18.38*/if(name=="Clientes")/*18.58*/{_display_(Seq[Any](format.raw/*18.59*/(""" """),format.raw/*18.60*/("""class="active" """)))}),format.raw/*18.76*/("""><a href="/clientes">Ver Clientes</a></li>
                            </ul>
                    </li>

                    <li class='submenu'>
                        <a href='/' """),_display_(/*23.38*/if(name=="Aseguradoras")/*23.62*/{_display_(Seq[Any](format.raw/*23.63*/(""" """),format.raw/*23.64*/("""class="active" """)))}),format.raw/*23.80*/("""><i class='fa fa-fw fa-tv'></i> <span> Aseguradoras</span> <span class='menu-arrow'></span></a>
                        <ul class='list-unstyled'>
                            <li """),_display_(/*25.34*/if(name=="Aseguradoras")/*25.58*/{_display_(Seq[Any](format.raw/*25.59*/(""" """),format.raw/*25.60*/("""class="active" """)))}),format.raw/*25.76*/("""><a href='/'>Ver Aseguradoras </a></li>
                        </ul>
                    </li>
                    
            </ul>

            <div class="clearfix"></div>

            </div>
        
            <div class="clearfix"></div>

        </div>

    </div>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-10T00:36:16.747
                  SOURCE: D:/Desktop/seguros/app/views/leftSidebar.scala.html
                  HASH: 1ddafb90ba9fb15c5afd6da9ea5ba14614c4f2f3
                  MATRIX: 735->1|844->15|872->18|919->57|969->70|1001->76|1485->533|1514->553|1553->554|1582->555|1629->571|1842->757|1871->777|1910->778|1939->779|1986->795|2200->982|2233->1006|2272->1007|2301->1008|2348->1024|2557->1206|2590->1230|2629->1231|2658->1232|2705->1248
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|48->23|48->23|48->23|48->23|48->23|50->25|50->25|50->25|50->25|50->25
                  -- GENERATED --
              */
          