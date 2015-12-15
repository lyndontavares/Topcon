'use strict';

angular.module('app').factory('PessoaService', [
'$http','SERVER_BASE',
function($http,SERVER_BASE) {

    //expect(MOVIE_TITLE).toEqual('http://localhost:5000/');//http://localhost:3000/#/dash/pessoa

    var urlBase = SERVER_BASE +'pessoa'; //SERVER_BASE

    var dataFactory = {};

    dataFactory.getAll = function () {
        return $http.get(urlBase);
    };

    dataFactory.getId = function (id) {
        return $http.get(urlBase + '/' + id);
    };

    dataFactory.insert = function (obj) {
        return $http.post(urlBase, obj);
    };

    dataFactory.update = function (obj) {
        return $http.put(urlBase + '/' + obj.ID, obj)
    };

    dataFactory.delete = function (id) {
        return $http.delete(urlBase + '/' + id);
    };

    return dataFactory;
}]);
