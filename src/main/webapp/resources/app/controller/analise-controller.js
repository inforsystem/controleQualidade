angular.module("controleQualidade").controller("analiseController", ["$scope", "$location", "$routeParams", "NgTableParams", "$filter", "$rootScope", "analiseService", "equipeService", "processoService", "usuarioService", function($scope, $location, $routeParams, NgTableParams, $filter, $rootScope, analiseService, equipeService, processoService, usuarioService){

	$rootScope.currentPath = $location.path();
	
	var hasId = $routeParams.id;
	
	$scope.analise = {};
	$scope.analise.ativo = true;
	$scope.alert = {};
	
	$scope.equipes = [];
	$scope.equipeSelecionada = {};
	$scope.tiposProcessos = [];
	$scope.tipoProcessoSelecionado = {};
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
	
	$scope.salvar = function(){
		// se tiver um 'id' na URL altera. Se não, salva um novo. 
		if(hasId){
			
		}else{
			analiseService.salvar($scope.analise).then(function(response){
				$scope.alert = {type: "success", msg: "Análise salva!"};
			}, function(error){
				$scope.alert = {type: "warning", msg: "Falha ao salvar análise."};
			});
		}
	}
	
	/* componente calendar */
	$scope.newDate = function() {
		$scope.analise.dataAnalise = new Date();
		$scope.analise.dataSolicitacao = new Date();
	};
	
	if(!hasId){
		$scope.newDate();
	}
	
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
	
	
	// se tiver um 'id' na URL, busca e declara a análise
	if(hasId){
		analiseService.buscarPorId(hasId).then(function(response){
			$scope.analise = response.data;
			$scope.analise.dataAnalise.opened = false;
			$scope.equipeSelecionada = $scope.analise.equipe;
			$scope.tipoProcessoSelecionado = $scope.analise.tipoProcesso;
			
			$scope.analise.dataAnalise = new Date($scope.analise.dataAnalise.toString().concat('T00:00:00'));
			$scope.analise.dataSolicitacao = new Date($scope.analise.dataSolicitacao.toString().concat('T00:00:00'));
			
		}, function(error){
			$scope.alert = {type: "warning", msg: "Falha ao buscar analise por id!"};
		});
	}
	
	
}]);
