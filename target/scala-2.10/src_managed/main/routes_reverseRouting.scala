// @SOURCE:C:/Users/Casa/playproj/nico/conf/routes
// @HASH:5d8bfb282dad649fe1e3a164729c05582da1f6dd
// @DATE:Sat Jun 28 17:30:11 IDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseAssets {
    

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:9
case (path, file) if path == "/public/fonts/" => Call("GET", _prefix + { _defaultPrefix } + "fonts/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:10
case (path, file) if path == "/public/stylesheets/" => Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:11
case (path, file) if path == "/public/images/" => Call("GET", _prefix + { _defaultPrefix } + "img/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:12
case (path, file) if path == "/public/javascripts/" => Call("GET", _prefix + { _defaultPrefix } + "js/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:13
case (path, file) if path == "/public/html/" => Call("GET", _prefix + { _defaultPrefix } + "html/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          

// @LINE:6
class ReverseAdmin {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:37
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseCategories {
    

// @LINE:22
def delete(catID:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/category/delete/" + implicitly[PathBindable[Long]].unbind("catID", catID))
}
                                                

// @LINE:21
def update(catID:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/category/update/" + implicitly[PathBindable[Long]].unbind("catID", catID))
}
                                                

// @LINE:37
def getAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "categories")
}
                                                

// @LINE:20
def add(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/category/create")
}
                                                

// @LINE:23
def clear(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/category/clear")
}
                                                
    
}
                          

// @LINE:39
// @LINE:32
class ReverseWorkers {
    

// @LINE:39
def getAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workers")
}
                                                

// @LINE:32
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/worker/create")
}
                                                
    
}
                          

// @LINE:38
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseProducts {
    

// @LINE:28
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/product/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:26
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/product/create")
}
                                                

// @LINE:38
def getAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products")
}
                                                

// @LINE:27
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/product/update")
}
                                                

// @LINE:29
def clear(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/product/clear")
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseAssets {
    

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/fonts/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fonts/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/stylesheets/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "css/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/images/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "img/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/javascripts/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "js/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/html/") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "html/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseAdmin {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseCategories {
    

// @LINE:22
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Categories.delete",
   """
      function(catID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/category/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("catID", catID)})
      }
   """
)
                        

// @LINE:21
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Categories.update",
   """
      function(catID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/category/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("catID", catID)})
      }
   """
)
                        

// @LINE:37
def getAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Categories.getAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
      }
   """
)
                        

// @LINE:20
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Categories.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/category/create"})
      }
   """
)
                        

// @LINE:23
def clear : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Categories.clear",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/category/clear"})
      }
   """
)
                        
    
}
              

// @LINE:39
// @LINE:32
class ReverseWorkers {
    

// @LINE:39
def getAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Workers.getAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workers"})
      }
   """
)
                        

// @LINE:32
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Workers.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/worker/create"})
      }
   """
)
                        
    
}
              

// @LINE:38
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseProducts {
    

// @LINE:28
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/product/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:26
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/product/create"})
      }
   """
)
                        

// @LINE:38
def getAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.getAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        

// @LINE:27
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/product/update"})
      }
   """
)
                        

// @LINE:29
def clear : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.clear",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/product/clear"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """fonts/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseAdmin {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.index(), HandlerDef(this, "controllers.Admin", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:37
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseCategories {
    

// @LINE:22
def delete(catID:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Categories.delete(catID), HandlerDef(this, "controllers.Categories", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """admin/category/delete/$catID<.+>""")
)
                      

// @LINE:21
def update(catID:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Categories.update(catID), HandlerDef(this, "controllers.Categories", "update", Seq(classOf[Long]), "POST", """""", _prefix + """admin/category/update/$catID<.+>""")
)
                      

// @LINE:37
def getAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Categories.getAll(), HandlerDef(this, "controllers.Categories", "getAll", Seq(), "GET", """#########################
 Global
#########################""", _prefix + """categories""")
)
                      

// @LINE:20
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Categories.add(), HandlerDef(this, "controllers.Categories", "add", Seq(), "POST", """ Category""", _prefix + """admin/category/create""")
)
                      

// @LINE:23
def clear(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Categories.clear(), HandlerDef(this, "controllers.Categories", "clear", Seq(), "GET", """""", _prefix + """admin/category/clear""")
)
                      
    
}
                          

// @LINE:39
// @LINE:32
class ReverseWorkers {
    

// @LINE:39
def getAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Workers.getAll(), HandlerDef(this, "controllers.Workers", "getAll", Seq(), "GET", """""", _prefix + """workers""")
)
                      

// @LINE:32
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Workers.create(), HandlerDef(this, "controllers.Workers", "create", Seq(), "POST", """ Worker""", _prefix + """admin/worker/create""")
)
                      
    
}
                          

// @LINE:38
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseProducts {
    

// @LINE:28
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.delete(id), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """admin/product/delete/$id<.+>""")
)
                      

// @LINE:26
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.create(), HandlerDef(this, "controllers.Products", "create", Seq(), "POST", """ Product""", _prefix + """admin/product/create""")
)
                      

// @LINE:38
def getAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.getAll(), HandlerDef(this, "controllers.Products", "getAll", Seq(), "GET", """""", _prefix + """products""")
)
                      

// @LINE:27
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.update(), HandlerDef(this, "controllers.Products", "update", Seq(), "POST", """""", _prefix + """admin/product/update""")
)
                      

// @LINE:29
def clear(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.clear(), HandlerDef(this, "controllers.Products", "clear", Seq(), "GET", """""", _prefix + """admin/product/clear""")
)
                      
    
}
                          
}
        
    