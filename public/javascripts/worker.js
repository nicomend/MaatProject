/**
 * Created by Idan on 18/07/14.
 */
var app = angular.module("worker", [ "ngRoute", "ngAnimate", "xeditable", "ui.bootstrap" ]);

app.config([ '$routeProvider', function($routeProvider) {
    $routeProvider.when('/categories', {
        templateUrl : 'html/workerViews/categories.html',
        controller : 'Categories'
    }).when('/products',{
            templateUrl: 'html/workerViews/products.html',
            controller: 'Products'
        }).otherwise({redirectTo:'/categories'});
} ]);


app.run(function(editableOptions, editableThemes) {
    editableOptions.theme = 'bs3';
    editableThemes.bs3.buttonsClass = 'btn-sm';
});

function Worker($scope, $location) {
    $scope.toolbar = "html/toolbar/workerToolbar.html";

    // init menu items
    $scope.tabs = [ {
        'label' : 'צפייה בקטגוריות',
        'url' : '/categories'
    }, {
        'label' : 'צפייה במוצרים',
        'url' : '/products'
    }];

    $scope.isActive = function(tab){
        return tab.url === $location.path();
    }
}
