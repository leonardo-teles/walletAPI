# API RESTfull com Spring Boot utilizando TDD, CI e CD

Tópicos Abordados:
   - Como construir uma API RESTFull utilizando Spring Boot e Java 8
   - Como fazer o deploy em um ambiente de produção
   - Utilizar o Travis CD para realizar deploy automatizado
   - Configurar Swagger para documentar os endpoints
   - Utilização de cache com Ehcache
   - Configurar e utilizar a nuvem do Heroku
   - Utilizar a técnica de Desenvolvimento Orientado a Testes (TDD)
   - Utilizar o Travis CI para realizar integração contínua
   - Autenticação via tokens JWT
   - Versionamento de Banco de Dados com Flyway
   - Como configurar e utilizar o Github

   
[![Build Status](https://travis-ci.org/leonardo-teles/walletAPI.svg?branch=master)](https://travis-ci.org/leonardo-teles/walletAPI)


Certificado: <a href="https://www.udemy.com/certificate/UC-3341e2a9-c7f2-4549-922d-e845d40ebb7f/" rel="noopener">Link</a>
   
Endpoinst Disponibilizados para Teste e Exemplos de Massa de Dados:

   <a href="https://my-walletapi.herokuapp.com/user">Criar Novo Usuário</a> | 
    {
  		"name" : "Usuario Admin - Heroku",
  		"email" : "admin@heroku.com",
  		"password" : "123456",
  		"role": "ROLE_ADMIN"
	}
      
   <a href="https://my-walletapi.herokuapp.com/auth">Gerar Novo Token de Acesso</a> | 
    {
  		"email" : "admin@heroku.com",
  		"password" : "123456"
	}
      
   <a href="https://my-walletapi.herokuapp.com/wallet">Criar Nova Carteita</a> |
    {
  		"name" : "Carteira 1 - Heroku",
  		"value" : 50
	}
	
   <a href="https://my-walletapi.herokuapp.com/user-wallet">Vincular um Usuário a uma Carteita</a> |	
    {
  		"wallet" : 1,
  		"users" : 1
	}
	
   <a href="https://my-walletapi.herokuapp.com/wallet-item">Adicionar Item a Carteita Existente</a> |		
    {
  		"wallet" : 1,
  		"date" : "02-04-2020",
  		"type" : "SAÍDA",
  		"description" : "item 1 da carteira 1 - Heroku",
  		"value" : 20
	}
   
   <a href="https://my-walletapi.herokuapp.com/wallet-item/1">Apagar Item de uma Carteita</a> |	 OBS: Somente para Usuário com Role 'ADMIN'  
