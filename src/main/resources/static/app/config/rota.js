'use strict';

angular.module('app').config(['$stateProvider', '$urlRouterProvider', function ($r, $t) {

        $t.when('/dash', '/dash/over');

        $t.otherwise('/login'),

        $r.state('base', {
                'abstract': !0,
                url: '',
                templateUrl: '/app/dash/base.html'
        }).state('login', {
                url: '/login',
                parent: 'base',
                templateUrl: '/app/login/login.html',
                controller: 'LoginController'
        }).state('dash', {
                url: '/dash',
                parent: 'base',
                templateUrl: '/app/dash/dash.html',
                controller: 'DashController'
        }).state('over', {
                url: '/over',
                parent: 'dash',
                templateUrl: '/app/dash/over.html',
                controller: 'OverController'
        }).state('pessoa', {
                url: '/pessoa',
                parent: 'dash',
                templateUrl: '/app/pessoa/pessoa.html',
                controller: 'PessoaController'
        });


}]);