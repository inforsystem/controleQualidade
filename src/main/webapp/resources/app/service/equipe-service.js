var app = angular.module("services");

app.service("equipeService", function($http) {
	
	this.listar = function(){
		return $http.get(PATH_REST + "equipe/");
	}
	
});