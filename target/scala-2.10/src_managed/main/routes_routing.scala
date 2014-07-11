// @SOURCE:C:/Users/Casa/playproj/nico/conf/routes
// @HASH:5d8bfb282dad649fe1e3a164729c05582da1f6dd
// @DATE:Sat Jun 28 17:30:11 IDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Admin_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fonts/"),DynamicPart("file", """.+""",false))))
        

// @LINE:10
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("css/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("img/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("js/"),DynamicPart("file", """.+""",false))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("html/"),DynamicPart("file", """.+""",false))))
        

// @LINE:20
private[this] lazy val controllers_Categories_add6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/category/create"))))
        

// @LINE:21
private[this] lazy val controllers_Categories_update7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/category/update/"),DynamicPart("catID", """.+""",false))))
        

// @LINE:22
private[this] lazy val controllers_Categories_delete8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/category/delete/"),DynamicPart("catID", """.+""",false))))
        

// @LINE:23
private[this] lazy val controllers_Categories_clear9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/category/clear"))))
        

// @LINE:26
private[this] lazy val controllers_Products_create10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/product/create"))))
        

// @LINE:27
private[this] lazy val controllers_Products_update11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/product/update"))))
        

// @LINE:28
private[this] lazy val controllers_Products_delete12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/product/delete/"),DynamicPart("id", """.+""",false))))
        

// @LINE:29
private[this] lazy val controllers_Products_clear13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/product/clear"))))
        

// @LINE:32
private[this] lazy val controllers_Workers_create14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/worker/create"))))
        

// @LINE:37
private[this] lazy val controllers_Categories_getAll15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categories"))))
        

// @LINE:38
private[this] lazy val controllers_Products_getAll16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
        

// @LINE:39
private[this] lazy val controllers_Workers_getAll17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workers"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Admin.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fonts/$file<.+>""","""controllers.Assets.at(path:String = "/public/fonts/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """css/$file<.+>""","""controllers.Assets.at(path:String = "/public/stylesheets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """img/$file<.+>""","""controllers.Assets.at(path:String = "/public/images/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """js/$file<.+>""","""controllers.Assets.at(path:String = "/public/javascripts/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """html/$file<.+>""","""controllers.Assets.at(path:String = "/public/html/", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/category/create""","""controllers.Categories.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/category/update/$catID<.+>""","""controllers.Categories.update(catID:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/category/delete/$catID<.+>""","""controllers.Categories.delete(catID:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/category/clear""","""controllers.Categories.clear()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/product/create""","""controllers.Products.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/product/update""","""controllers.Products.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/product/delete/$id<.+>""","""controllers.Products.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/product/clear""","""controllers.Products.clear()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/worker/create""","""controllers.Workers.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categories""","""controllers.Categories.getAll()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Products.getAll()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workers""","""controllers.Workers.getAll()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Admin_index0(params) => {
   call { 
        invokeHandler(controllers.Admin.index(), HandlerDef(this, "controllers.Admin", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public/fonts/")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """fonts/$file<.+>"""))
   }
}
        

// @LINE:10
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public/stylesheets/")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """css/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public/images/")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """img/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public/javascripts/")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """js/$file<.+>"""))
   }
}
        

// @LINE:13
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public/html/")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """html/$file<.+>"""))
   }
}
        

// @LINE:20
case controllers_Categories_add6(params) => {
   call { 
        invokeHandler(controllers.Categories.add(), HandlerDef(this, "controllers.Categories", "add", Nil,"POST", """ Category""", Routes.prefix + """admin/category/create"""))
   }
}
        

// @LINE:21
case controllers_Categories_update7(params) => {
   call(params.fromPath[Long]("catID", None)) { (catID) =>
        invokeHandler(controllers.Categories.update(catID), HandlerDef(this, "controllers.Categories", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """admin/category/update/$catID<.+>"""))
   }
}
        

// @LINE:22
case controllers_Categories_delete8(params) => {
   call(params.fromPath[Long]("catID", None)) { (catID) =>
        invokeHandler(controllers.Categories.delete(catID), HandlerDef(this, "controllers.Categories", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """admin/category/delete/$catID<.+>"""))
   }
}
        

// @LINE:23
case controllers_Categories_clear9(params) => {
   call { 
        invokeHandler(controllers.Categories.clear(), HandlerDef(this, "controllers.Categories", "clear", Nil,"GET", """""", Routes.prefix + """admin/category/clear"""))
   }
}
        

// @LINE:26
case controllers_Products_create10(params) => {
   call { 
        invokeHandler(controllers.Products.create(), HandlerDef(this, "controllers.Products", "create", Nil,"POST", """ Product""", Routes.prefix + """admin/product/create"""))
   }
}
        

// @LINE:27
case controllers_Products_update11(params) => {
   call { 
        invokeHandler(controllers.Products.update(), HandlerDef(this, "controllers.Products", "update", Nil,"POST", """""", Routes.prefix + """admin/product/update"""))
   }
}
        

// @LINE:28
case controllers_Products_delete12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Products.delete(id), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """admin/product/delete/$id<.+>"""))
   }
}
        

// @LINE:29
case controllers_Products_clear13(params) => {
   call { 
        invokeHandler(controllers.Products.clear(), HandlerDef(this, "controllers.Products", "clear", Nil,"GET", """""", Routes.prefix + """admin/product/clear"""))
   }
}
        

// @LINE:32
case controllers_Workers_create14(params) => {
   call { 
        invokeHandler(controllers.Workers.create(), HandlerDef(this, "controllers.Workers", "create", Nil,"POST", """ Worker""", Routes.prefix + """admin/worker/create"""))
   }
}
        

// @LINE:37
case controllers_Categories_getAll15(params) => {
   call { 
        invokeHandler(controllers.Categories.getAll(), HandlerDef(this, "controllers.Categories", "getAll", Nil,"GET", """#########################
 Global
#########################""", Routes.prefix + """categories"""))
   }
}
        

// @LINE:38
case controllers_Products_getAll16(params) => {
   call { 
        invokeHandler(controllers.Products.getAll(), HandlerDef(this, "controllers.Products", "getAll", Nil,"GET", """""", Routes.prefix + """products"""))
   }
}
        

// @LINE:39
case controllers_Workers_getAll17(params) => {
   call { 
        invokeHandler(controllers.Workers.getAll(), HandlerDef(this, "controllers.Workers", "getAll", Nil,"GET", """""", Routes.prefix + """workers"""))
   }
}
        
}

}
     