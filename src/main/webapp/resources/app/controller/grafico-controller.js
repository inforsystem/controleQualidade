angular.module("controleQualidade").controller("graficoController", ["$scope", "$location", "$rootScope", "graficoService", function($scope, $location, $rootScope, graficoService){
	
	$rootScope.currentPath = $location.path();
	
	// colunas do resultado da query
	$scope.labels = ["Qtde Mês", "Mês", "Qtde Motivo", "Qtde Processo"];
	
	$scope.data_full = [];
	$scope.data1 = [];
	$scope.data2 = [];
	$scope.data3 = [];
	
	graficoService.buscarDados().then(function(response){
		$scope.data_full = response.data;
		$scope.data1 = $scope.convertObjectToArrayValues( $scope.data_full[0] );
		$scope.data2 = $scope.convertObjectToArrayValues( $scope.data_full[1] );
		$scope.data3 = $scope.convertObjectToArrayValues( $scope.data_full[2] );
		
		console.log($scope.data1);
	}, function(error){		
		console.error(error);
	});
	
	$scope.convertObjectToArrayValues = function(obj){
		array = Object.keys(obj).map(function(k) {
	        return obj[k];
	    });
		return array;
	}
	
}]);

