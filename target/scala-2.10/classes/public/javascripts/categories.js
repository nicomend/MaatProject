function Categories($scope, $http) 
{
	$http.get('categories').success(function(data, status) {
		$scope.categories = data;
	});
	
	$scope.clearFields = function()
	{
		$scope.newCategory = {};
		$scope.searchCategory = {};
	}
	
	$scope.create = function() 
	{
		$http.post('admin/category/create', {'name' : $scope.newCategory.name}).success(function(data, status) {
			$scope.categories.push(data);
			$scope.clearFields();
		});
	};

	$scope.clear = function() 
	{
		$http.get('admin/category/clear').success(function(data, status) {
			$scope.categories.length = 0;
		});
	}
	
	$scope.delete = function(category) {
		$http.get('admin/category/delete/' + category.id).success(function(data, status) {
			$scope.categories.splice(getIndexByID(category.id), 1);
		});
	}
	
	var getIndexByID = function(id)
	{
		for (var index = 0; index < $scope.categories.length; index++)
			{
				if ($scope.categories[index].id == id)
					{
					return index;
					}
			}
		return -1;
	}
	
	$scope.update = function(category)
	{
		$http.post('admin/category/update/' + category.id, {'name' : category.name});
	}
	
	$scope.clearFields();
}
