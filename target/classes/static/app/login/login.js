angular.module('app').controller('LoginController',function($scope,$location){
	
	$scope.login = function () {
		return $location.path('/dash'), !1;
	};
	
});
