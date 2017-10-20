var app = angular.module("services");

app.service("analiseService", function($http) {
	
	this.salvar = function(obj){
		console.log(obj);
		return $http.post(PATH_REST + "analise/", obj);
	}
	
	this.alterar = function(obj){
		return $http.put(PATH_REST + "analise/", obj);
	}
	
	this.buscarPorId = function(id){
		return $http.get(PATH_REST + "analise/" + id);
	}
	
});