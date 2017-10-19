var app = angular.module("services");

app.service("processoService", function($http) {
	
	this.listar = function(){
		return $http.get(PATH_REST + "processo/");
	}
		
});