var app = angular.module("services");

app.service("usuarioService", function($http) {
	
	this.listarUsuarios = function(){
		return $http.get(PATH_REST + "usuario/");
	}
	
	this.salvar = function(obj){
		return $http.post(PATH_REST + "usuario/", obj);
	}
	
	this.buscarPorId = function(id){
		return $http.get(REST_PATH + "usuario/" + id);
	}
	
	this.alterar = function(obj){
		return $http.put(PATH_REST + "usuario/", obj);
	}
	
});