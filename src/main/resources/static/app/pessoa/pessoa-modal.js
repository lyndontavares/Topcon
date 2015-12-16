'use strict';
angular.module('app').controller('PessoaModalController', 
['$http', '$scope', 'PessoaService', 'TipoPessoaService','toastr', 'toastrConfig', '$uibModalInstance' , 
function ($http, $scope, PessoaService, TipoPessoaService, toastr, toastrConfig,  $uibModalInstance) {

  $scope.tipoPessoa=TipoPessoaService.getAll;
  
  $scope.pessoa={};	

  $scope.ok = function () {
    $uibModalInstance.close($scope.pessoa);
  };

  $scope.cancel = function () {
    $uibModalInstance.dismiss('cancel');
  };


}]);