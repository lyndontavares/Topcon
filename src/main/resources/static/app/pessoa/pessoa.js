'use strict';

angular.module('app').controller('PessoaController', 
['$http', '$scope', 'PessoaService', 'toastr', 'toastrConfig', '$uibModal' , 
function ($http, $scope, PessoaService,toastr, toastrConfig, $uibModal) {


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
					'<div class="ui-grid-cell-contents pull-right" ng-controller="PessoaController"> ' +
					'<a class="btn  btn-primary btn-xs" ng-click="deletar( row.entity.id )" href="#"><span class="glyphicon glyphicon glyphicon-erase" aria-hidden="true"></span> Deletar</a>'+
					'</div>', width: 76, enableColumnMenu: false, enableSorting: false, enableFiltering:false
		}

		]
	};


	$scope.deletar = function( id ){
		//console.log(id);
		
		PessoaService.delete(id)
		.success(function(data){
			//console.log(data);
			$scope.load();
		})
		.error(function(data, status, headers, config){
			console.log(status);
			
	  	    if ( status == 409 ){
	  	  
				//openedToasts.push(
				toastr.error(
						 'Pessoa não pode ser exluída.',
						 '409 - Registro(s) relacionado(s).' 
				);
				
			  };

			
		});
		
		
	};

	$scope.load = function(){
		
		PessoaService.getAll()
		.success(function(data){
		 $scope.pessoaOptions.data=data._embedded.pessoa;
		})
	};	

	$scope.load();
 
	$scope.addPessoa = function (size) {
		var modalInstance = $uibModal.open({
			animation: true,
			templateUrl: '/app/pessoa/pessoa-modal.html',
			controller: 'PessoaModalController',
			size: size
		});
		modalInstance.result.then(function ( pessoa ) {
			$scope.pessoa = pessoa;
			console.info(pessoa);
		}, function () {
			console.info('Modal dismissed at: ' + new Date());
		});
	};

}]);