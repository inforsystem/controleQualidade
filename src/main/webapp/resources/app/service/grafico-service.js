var app = angular.module("services");

app.service("graficoService", function($http) {
	
	this.buscarDados = function(){
		return $http.get(PATH_REST + "grafico/");
	}
	
});