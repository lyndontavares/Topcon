'use strict';

angular.module('app',[
	
	'ui.router', 
	'ngSanitize',
	'ngAnimate',
	'ui.bootstrap',
	'nya.bootstrap.select',
   	'daterangepicker',
	'maskMoney'	,
	'ui.grid',
	'ui.grid.pagination',
	'ui.grid.cellNav',
	'ui.grid.moveColumns'
	
	
]);

angular.module('app').run(function ($rootScope, $state) {
});
