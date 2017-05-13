app.factory('IndexService', function($rootScope, $http,$q){
	
	var url = '/rest/titulo';
	
	return{
		
		listarporServicos: function(page , maxResults, categoria){
			var config = {params: {page: page , maxResults : maxResults}};
			return $http.get(url, config)
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},	
		
	}
});