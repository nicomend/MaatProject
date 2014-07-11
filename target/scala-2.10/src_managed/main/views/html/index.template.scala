
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html ng-app="myApp" dir="rtl">
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
<script src="assets/javascripts/businessManager.js"></script>
</head>
<body>
	<div ng-controller="Categories">
		<input type="text" ng-model="name" />
		<button ng-click="create(name)">יצירת קטגוריה</button>
		<button ng-click="clear()">נקה הכל</button>
		<br />
		<table border="1">
			<tr>
				<th>שם הקטגוריה</th>
				<th>מחק?</th>
			</tr>
			<tr ng-repeat="category in categories">
				<td>"""),format.raw/*21.9*/("""{"""),format.raw/*21.10*/("""{"""),format.raw/*21.11*/("""category.name"""),format.raw/*21.24*/("""}"""),format.raw/*21.25*/("""}"""),format.raw/*21.26*/("""</td>
				<td><button ng-click="delete(category.id)">X</button></td>
			</tr>
		</table>
	</div>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 11 19:37:02 IDT 2014
                    SOURCE: C:/Users/Casa/playproj/nico/app/views/index.scala.html
                    HASH: 7a6c071c8f7ec72a656a9c7a8bd9d303e4310d7f
                    MATRIX: 855->0|1469->587|1498->588|1527->589|1568->602|1597->603|1626->604
                    LINES: 29->1|49->21|49->21|49->21|49->21|49->21|49->21
                    -- GENERATED --
                */
            