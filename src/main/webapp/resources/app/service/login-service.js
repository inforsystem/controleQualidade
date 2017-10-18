var app = angular.module("services", []);

app.service("loginService", function($http) {
	
	this.login = function(obj){
		return $http.post(PATH_REST + "login", obj);
	}
		
});