 app.controller('IndexController', ['$rootScope', '$scope', 'IndexService' , function($rootScope , $scope, IndexService) {
	
			self.getPage=0;
			self.totalPages = 0;
			self.totalElements = 0;
			$scope.maxResults = 15;

			listarNovidadesArtigos();
			//listarporCategoria(0,4, 'FRON_END');
			listarBackArtigos();
			listarBancoArtigos();
			listarSOArtigos();
			listarFrontArtigos();
   

			    function listarNovidadesArtigos() {
			    	IndexService.listarNovidadesArtigos().then(function(t) {
					$scope.listarNovidadesArtigo = t.content;
				}, function(errResponse) {
				});
			}
			;

			function listarporCategoria(pages, maxResults, categoria) {
				self.totalPages = [];
				self.getPage=pages;	
				IndexService.listarporCategoria(pages, maxResults, categoria).then(function(t) {
					$scope.listarFrontArtigos = t.content;
					$scope.totalPages = t.totalPages;
					self.totalElements = t.totalElements;
					for(i = 0; i < $scope.totalPages ; i++){
						self.totalPages.push(i);
					}
				}, function(errResponse) {
				});
			}
			;
			function listarFrontArtigos() {
				IndexService.listarFrontArtigos().then(function(t) {
					$scope.listarFrontArtigos = t.content;
				}, function(errResponse) {
				});
			}
			;
			function listarBackArtigos() {
				IndexService.listarBackArtigos().then(function(t) {
					$scope.listarBackArtigos = t.content;
				}, function(errResponse) {
				});
			}
			;

			function listarBancoArtigos() {
				IndexService.listarBancoArtigos().then(function(t) {
					$scope.listarBancoArtigos = t.content;
				}, function(errResponse) {
				});
			}
			;

			function listarSOArtigos() {
				IndexService.listarSOArtigos().then(function(t) {
					$scope.listarSOArtigos = t.content;
				}, function(errResponse) {
				});
			}
			;
						
					
					
		
  }]);