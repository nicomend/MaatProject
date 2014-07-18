function Products($scope, $http) {

	$http.get('categories').success(function(data, status) {
		$scope.categories = data;
	});

	$http.get('products').success(function(data, status) {
		$scope.products = data;
	});
	
	$scope.update = function(product)
	{
		$http.post('admin/product/update', product);
	}

	$scope.create = function() {
		$http.post('admin/product/create', $scope.newProduct).success(function(data,status) {
			$scope.products.push(data);
		});
	}
	
	$scope.delete = function(productId){
		$http.get('admin/product/delete/' + productId).success(function(data,status){
			$scope.products.splice(getIndexByID(productId), 1);
		});
	}
	
	$scope.clear = function(){
		$http.get('admin/product/clear').success(function(data,status){
			$scope.products.length = 0;
		});
	}

	$scope.clearFields = function() {
		$scope.newProduct = {};
        $scope.searchProduct = {};
	}

    $scope.clearFields();
	
	var getIndexByID = function(id)
	{
		for (var index = 0; index < $scope.products.length; index++)
			{
				if ($scope.products[index].id == id)
					{
					return index;
					}
			}
		return -1;
	}
}
