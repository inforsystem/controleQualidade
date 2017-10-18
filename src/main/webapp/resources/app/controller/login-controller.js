angular.module("controleQualidade").controller("loginController", ["$scope", "$location", "auth", "$window", "$rootScope", "loginService", function($scope, $location, auth, $window, $rootScope, loginService){
	
	$rootScope.currentPath = $location.path();
	$scope.login = {};
	$scope.alert = {};
	
	if($location.search().msg){
		$scope.alert = {type: "danger", msg: $location.search().msg };
	}
	
	$scope.send = function(){
		if($scope.formulario.$valid){ 
			
			loginService.login($scope.login).then(function(response){
				console.log(response.data);
				auth.login(response.data);
				$location.path("/controleQualidade/usuario");
			}, function(error){
				$scope.alert = {type: "danger", msg: "Login inválido!"};
			});
		}
	};
	
	$scope.closeAlert = function() {
		$scope.alert = {};
	};
	
}]);
