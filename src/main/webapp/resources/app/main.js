const PATH_VIEWS = "/controleQualidade/resources/app/views/";
const PATH_REST = "/controleQualidade/rest/";
const CQCA = "controle-qualidade-chave:auth";

angular.module("controleQualidade", ["ngRoute", "ui.bootstrap", "ngAnimate", "ngTable", "services", "chart.js"]).
	config(function($routeProvider, $locationProvider){
	
	$routeProvider.when("/controleQualidade", {
		templateUrl : PATH_VIEWS + "login.html",
		controller : "loginController"
	});
	
	$routeProvider.when("/controleQualidade/usuario", {
		templateUrl : PATH_VIEWS + "usuario.html",
		controller : "usuarioController"
	});
	
	$routeProvider.when("/controleQualidade/analise", {
		templateUrl : PATH_VIEWS + "analise.html",
		controller : "analiseController"
	});
	
	$routeProvider.when("/controleQualidade/analise/:id", {
		templateUrl : PATH_VIEWS + "analise.html",
		controller : "analiseController"
	});
	
	$routeProvider.when("/controleQualidade/grafico", {
		templateUrl : PATH_VIEWS + "grafico.html",
		controller : "graficoController"
	});
	
	$routeProvider.otherwise( {redirectTo:"/controleQualidade"} );
	
})
.factory("auth", function() {
	
	var userLog = null;
	var check = window.localStorage.getItem(btoa(CQCA)) === null ? "" : window.localStorage.getItem(btoa(CQCA));
	
	if( check ){
		userLog = atob(window.localStorage.getItem( btoa(CQCA) )); 
	}
	
	return {
		getUserLog: function(){
			return userLog;
		},
		login: function(user){
			userLog = user;
			window.localStorage.setItem( btoa(CQCA) , btoa(JSON.stringify(userLog)) );
		},
		logout: function(){
			userLog = {};
			window.localStorage.setItem( btoa(CQCA), "");
			window.location = "/controleQualidade";
		}
	};
	
})
.run(['$rootScope', '$location', 'auth', '$window', function($rootScope, $location, auth, $window) {
	$rootScope.$on('$routeChangeStart', function(event) {
		
    	if($location.url() !== '/controleQualidade'){
    		if(! auth.getUserLog() ){
    			$location.path("/controleQualidade");
    		}
    	}
    	
    });
    
}]);