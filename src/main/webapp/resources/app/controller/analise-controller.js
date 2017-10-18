angular.module("controleQualidade").controller("analiseController", ["$scope", "$http", "$location", "$routeParams", "NgTableParams", "$filter", "$rootScope", function($scope, $http, $location, $routeParams, NgTableParams, $filter, $rootScope){

	$rootScope.currentPath = $location.path();
	$scope.analise = {};
	
	$scope.newDate = function() {
		$scope.analise.dataAnalise = new Date();
		$scope.analise.dataSolicitacao = new Date();
	};
	
	$scope.newDate();
	
	$scope.options = {
		showWeeks: true
	};
	
	$scope.altInputFormats = ['M!/d!/yyyy'];
	
	$scope.datePopup = {
		opened: false
	};
	
	$scope.openDatePopup = function() {
		$scope.analise.dataAnalise.opened = true;
	};
	
	$scope.openDateSolicitacaoPopup = function() {
		$scope.analise.dataSolicitacao.opened = true;
	};
	
	$scope.format = 'dd/MM/yyyy';
	
	
}]);
