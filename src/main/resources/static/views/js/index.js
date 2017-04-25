app.config(['$stateProvider', '$httpProvider' , '$urlRouterProvider' , function($stateProvider,  $httpProvider, $urlRouterProvider) {
	
	$urlRouterProvider.otherwise('/');
     
     $stateProvider
    .state('home', {
      url: '/',
      templateUrl: 'views/home.html',
      controller: 'IndexController'
    })
    
}]);