function Workers($scope, $http) 
{
	$scope.newWorker = {};
	
	$http.get('workers').success(function(data,status){
		$scope.workers = data;
	});
	
	$scope.create = function()
	{
		$http.post('admin/worker/create', $scope.newWorker).success(function(data,status){
			$scope.workers.push(data);
		});
	}
	
	$scope.clearFields = function()
	{
		$scope.newWorker = {};
		$scope.searchWorker = {};
	}
}