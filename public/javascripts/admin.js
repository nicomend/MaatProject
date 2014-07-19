var app = angular.module("admin", [ "ngRoute", "ngAnimate", "xeditable", "ui.bootstrap", "angularCharts" ]);

app.config([ '$routeProvider', function ($routeProvider) {
    $routeProvider.when('/categories', {
        templateUrl: 'html/adminViews/categories.html',
        controller: 'Categories'
    }).when('/products', {
        templateUrl: 'html/adminViews/products.html',
        controller: 'Products'
    }).when('/workers', {
        templateUrl: 'html/adminViews/workers.html',
        controller: 'Workers'
    }).when('/main', {
        templateUrl: 'html/adminViews/main.html',
        controller: 'Main'
    }).otherwise({redirectTo: '/main'})
} ]);


app.run(function (editableOptions, editableThemes) {
    editableOptions.theme = 'bs3';
    editableThemes.bs3.buttonsClass = 'btn-sm';
});

function Admin($scope, $location) {
    $scope.toolbar = "html/toolbar/adminToolbar.html";

    // init menu items
    $scope.tabs = [
        {
            'label': 'ראשי',
            'url': '/main'
        },
        {
            'label': 'ניהול קטגוריות',
            'url': '/categories'
        },
        {
            'label': 'ניהול מוצרים',
            'url': '/products'
        },
        {
            'label': 'ניהול עובדים',
            url: '/workers'
        }
    ];

    $scope.isActive = function (tab) {
        return tab.url === $location.path();
    }
}
