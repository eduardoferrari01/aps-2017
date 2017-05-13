 app.controller('IndexController', ['$rootScope', '$scope', 'IndexService' , function($rootScope , $scope, IndexService) {
	
			self.getPage=0;
			self.totalPages = 0;
			self.totalElements = 0;
			$scope.maxResults = 15;

			
			listarporServicos(0,8);
			
   

			   

			function listarporServicos(pages, maxResults ) {
				console.log("OI");	
				self.totalPages = [];
				self.getPage=pages;	
				IndexService.listarporServicos(pages, maxResults).then(function(t) {
					$scope.servicos = t.content;
					$scope.totalPages = t.totalPages;
					self.totalElements = t.totalElements;
					for(i = 0; i < $scope.totalPages ; i++){
						self.totalPages.push(i);
					}
				}, function(errResponse) {
				});
			};
			
						
					
					
		
  }]);