'use strict';

angular.module('app', [
	'ui.router',
	'ngSanitize',
	'ngAnimate',
	'ui.bootstrap',
	'nya.bootstrap.select',
   	'daterangepicker',
	'maskMoney',
	'ui.grid',
	'ui.grid.pagination',
	'ui.grid.cellNav',
	'ui.grid.moveColumns',
	'toastr'
]);

angular.module('app').run(
[ '$rootScope', '$state', '$http' ,
function($rootScope, $state, $http) {
	$http.defaults.headers.common.Authorization = '@#$%¨&';
	$rootScope.username = '';
	$rootScope.password = '';
}]);
