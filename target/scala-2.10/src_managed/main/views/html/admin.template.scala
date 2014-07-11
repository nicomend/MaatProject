
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object admin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html ng-app="admin" lang="he" dir="rtl">
<head>
<meta charset="UTF-8">
<script src="http://code.angularjs.org/1.2.16/angular.js"></script>
<script src="http://code.angularjs.org/1.2.16/angular-animate.js"></script>
<script src="http://code.angularjs.org/1.2.16/angular-route.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/ui-bootstrap-tpls-0.10.0.js"></script>
<script src="js/admin.js"></script>
<script src="js/toolbar.js"></script>
<script src="js/categories.js"></script>
<script src="js/products.js"></script>
<script src="js/workers.js"></script>
<script src="js/xeditable.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/animate.css/2.0/animate.min.css">
<link rel="stylesheet" href="css/xeditable.css" />
<link rel="stylesheet" href="css/main.css" />
</head>
<body ng-controller="Admin">
	<div class="navber navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-right">
				<span class="navbar-brand">לוח בקרה למנהל</span>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2 sidebar">
				<ul class="nav">
					<li ng-repeat="tab in tabs" ng-class=""""),format.raw/*35.44*/("""{"""),format.raw/*35.45*/("""active: isActive(tab)"""),format.raw/*35.66*/("""}"""),format.raw/*35.67*/(""""><a
						href="#"""),format.raw/*36.14*/("""{"""),format.raw/*36.15*/("""{"""),format.raw/*36.16*/("""tab.url"""),format.raw/*36.23*/("""}"""),format.raw/*36.24*/("""}"""),format.raw/*36.25*/("""">"""),format.raw/*36.27*/("""{"""),format.raw/*36.28*/("""{"""),format.raw/*36.29*/("""tab.label"""),format.raw/*36.38*/("""}"""),format.raw/*36.39*/("""}"""),format.raw/*36.40*/("""</a></li>
				</ul>
			</div>
			<div class="col-md-10">
				<div class="panelAnimate" ng-view></div>
			</div>
		</div>
	</div>
	<script src="js/bootstrap.js"></script>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 28 17:20:51 IDT 2014
                    SOURCE: C:/Users/Casa/playproj/nico/app/views/admin.scala.html
                    HASH: afbb2b2c6bdd80ff0246069b0f31aa82604957e9
                    MATRIX: 855->0|2215->1332|2244->1333|2293->1354|2322->1355|2369->1374|2398->1375|2427->1376|2462->1383|2491->1384|2520->1385|2550->1387|2579->1388|2608->1389|2645->1398|2674->1399|2703->1400
                    LINES: 29->1|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36
                    -- GENERATED --
                */
            