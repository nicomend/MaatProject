function Cart($scope, $http)
{
    $scope.checkout = function(){
        $http.post('cartCheckout/313819054', $scope.cart).success(function(data, status){
           $scope.sale = data;
        });
    }
}