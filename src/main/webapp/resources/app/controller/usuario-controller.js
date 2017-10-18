angular.module("controleQualidade").controller("usuarioController", ["$scope", "$location", "$routeParams", "NgTableParams", "$filter", "usuarioService", "$rootScope", function($scope, $location, $routeParams, NgTableParams, $filter, usuarioService, $rootScope){
	
	$rootScope.currentPath = $location.path();
	
	$scope.usuarios = [];
	$scope.usuario = {login:{}};
	$scope.alert = {};
	
	var hasId = $routeParams.id;
	
	if(hasId){
		
		usuarioService.buscarPorId(hasId).then(function(response){
			$scope.usuario = response.data;
		}, function(error){
			$scope.alert = {type: "warning", msg: "Atenção! O usuário não existe."};
		});
		
	}
	
	$scope.send = function(){
		if(hasId){
			// altera
		}else{
			// salva
		}
	}
	
	$scope.closeAlert = function() {
		$scope.alert = {};
	};
	
	usuarioService.listarUsuarios().then(function(response){
		$scope.usuarios = response.data;
		$scope.tableParams = new NgTableParams({}, { dataset: $scope.usuarios});
	}, function(error){
		$scope.alert = {type: "warning", msg: "Atenção! O usuário não existe."};
	});
	
}]);
