angular.module("controleQualidade").controller("menuController", ["$scope", "$location", "auth", "$rootScope", function($scope, $location, auth, $rootScope){
	
	$scope.logout = function(){
		auth.logout();
	}
	
}]);
