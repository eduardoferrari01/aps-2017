app.factory('IndexService', function($rootScope, $http,$q){
	
	
	return{
		salvar: function(postagem){
			return $http.post('rest/postagem',postagem)
			.then(function(response){
			return response.data;
			},function(errResponse){
				});
		},
		listar: function(){
			return $http.get('rest/postagem')
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},
				
		buscarPorId: function(param){
			return $http.get('rest/postagem/'+param)
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
			});
		},
		
		alterar: function(categoria){
			return $http.put('rest/postagem', categoria)
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
			});
		},
		
		listarNovidadesArtigos: function(){
			return $http.get('rest/postagem/novidades')
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},
		listarporCategoria: function(page , maxResults, categoria){
			var config = {params: {page: page , maxResults : maxResults}};
			return $http.get('rest/postagem/categoria/{categoria}/', config)
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},
		listarFrontArtigos: function(){
			return $http.get('rest/postagem/front')
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},
		listarBackArtigos: function(){
			return $http.get('rest/postagem/back')
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},
		listarBancoArtigos: function(){
			return $http.get('rest/postagem/banco')
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},
		listarSOArtigos: function(){
			return $http.get('rest/postagem/so')
			.then(function(response){
				return response.data;
			},function(errResponse){
				return $q.reject(errResponse);
				});
		},
		
	}
});