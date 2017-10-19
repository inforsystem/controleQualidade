angular.module("controleQualidade").controller("analiseController", ["$scope", "$location", "$routeParams", "NgTableParams", "$filter", "$rootScope", "analiseService", "equipeService", "processoService", "usuarioService", function($scope, $location, $routeParams, NgTableParams, $filter, $rootScope, analiseService, equipeService, processoService, usuarioService){

	$rootScope.currentPath = $location.path();
	
	$scope.analise = {};
	$scope.analise.ativo = true;
	$scope.alert = {};
	
	
	$scope.equipes = [];
	$scope.tiposProcessos = [];
	$scope.analistasQualidade = [];
	$scope.analistasCompra = [];
	
	equipeService.listar().then(function(response){
		$scope.equipes = response.data;
	}, function(error){
		$scope.alert = {type: "warning", msg: "Falha ao buscar equipes!"};
	});
	
	processoService.listar().then(function(response){
		$scope.tiposProcessos = response.data; 
	}, function(error){
		$scope.alert = {type: "warning", msg: "Falha ao buscar processos!"};
	});
	
//	usuarioService.buscarPorPerfil(1).then(function(response){
//		$scope.analistasQualidade = response.data; 
//	}, function(error){
//		$scope.alert = {type: "warning", msg: "Falha ao buscar analistas de qualidade!"};
//	});
//	
//	usuarioService.buscarPorPerfil(2).then(function(response){
//		$scope.analistasCompra = response.data; 
//	}, function(error){
//		$scope.alert = {type: "warning", msg: "Falha ao buscar analistas de compra!"};
//	});
	
	$scope.salvar = function(){
		analiseService.salvar($scope.analise).then(function(response){
			$scope.alert = {type: "success", msg: "Análise salva!"};
		}, function(error){
			$scope.alert = {type: "warning", msg: "Falha ao salvar análise."};
		});
	}
	
	/* componente calendar */
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
	/* componente calendar */
	
	
}]);
