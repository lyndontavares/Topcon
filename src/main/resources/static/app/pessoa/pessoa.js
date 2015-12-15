'use strict';

angular.module('app').controller('PessoaController', 
['$http', '$scope','PessoaService', 
function ($http, $scope, PessoaService) {


	$scope.pessoaOptions = {

		enableFiltering: false,
		enablePaginationControls: true,
		enableGridMenu: false,
		paginationPageSize: 10,
		paginationPageSizes: [10, 20, 30],
		columnDefs: [{
			name: 'id',
			field: 'id',
			displayName: 'Código',
			width: "10%",
			enableColumnMenu: false
		}, {
				name: 'nome',
				field: 'nome',
				displayName: 'Nome',
				enableColumnMenu: false
			}, {
				name: 'situacao',
				field: 'situacao',
				displayName: 'Situação',
				enableColumnMenu: false
			}, { name: 'acao'        , field:'id' , displayName:'Ação',
 	               cellTemplate:
					'<div class="ui-grid-cell-contents pull-right" ng-controller="PessoaCtrl"> ' +
					'<a class="btn  btn-primary btn-xs" ng-click="deletar( COL_FIELD, row.id )" href="#"><span class="glyphicon glyphicon glyphicon-erase" aria-hidden="true"></span> Deletar</a>'+
					'</div>', width: 76, enableColumnMenu: false, enableSorting: false, enableFiltering:false
		}

		]
	};


	$scope.load = function(){
		
		PessoaService.getAll()
		.success(function(data){
		 $scope.pessoaOptions.data=data._embedded.pessoa;
		})
	};	

	$scope.load();


}]);