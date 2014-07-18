var app = angular.module("admin", [ "ngRoute", "ngAnimate", "xeditable", "ui.bootstrap" ]);

app.config([ '$routeProvider', function ($routeProvider) {
    $routeProvider.when('/categories', {
        templateUrl: 'html/categories.html',
        controller: 'Categories'
    }).when('/products', {
        templateUrl: 'html/products.html',
        controller: 'Products'
    }).when('/workers', {
        templateUrl: 'html/workers.html',
        controller: 'Workers'
    }).when('/main', {
        templateUrl: 'html/main.html',
        controller: 'Main'
    }).otherwise({redirectTo: '/main'})
} ]);


app.run(function (editableOptions, editableThemes) {
    editableOptions.theme = 'bs3';
    editableThemes.bs3.buttonsClass = 'btn-sm';
});

function Admin($scope, $location) {
    $scope.toolbar = "html/toolbar/toolbar.html";

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
