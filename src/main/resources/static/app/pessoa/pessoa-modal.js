'use strict';
angular.module('app').controller('PessoaModalController', 
['$http', '$scope', 'PessoaService', 'toastr', 'toastrConfig', '$uibModalInstance' , 
function ($http, $scope, PessoaService,toastr, toastrConfig,  $uibModalInstance) {

  $scope.pessoa={};	

  $scope.ok = function () {
    $uibModalInstance.close($scope.pessoa);
  };

  $scope.cancel = function () {
    $uibModalInstance.dismiss('cancel');
  };


}]);