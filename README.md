# Pergunta 1 e 2 Zuul

[![Gps|Gustavopolarsa]()](http://www.gustavopolarsa.com)

O presente projeto tem como principal objetivo subir o server Zuul para que serva como enrutamento por fora dos microservicos registrados por eureka assim evitar fazer um acesso direto algum microservico:

  - Gradle para gerenciar as dependencias e executar os testes
  - Spring boot para subir o server tomcat embutido com o Eureka
  - Eureka Client para que se comunique o server de Eureka principal e possa fazer o enrutamento

# Porque Zuul

  Cómo falei no projeto anterior a ideia principal é fazer uma pequena arquitectura de microservices simulando um cenario real para isso Zuul faz um papel muito imporante, porque ele é um enrutador e pode servir como interface entre o usuario e o microservicos registrados dentro de Eureka, assim ele cria um alias, e não oferece o endereço real do microservice facilitando a manutenção dele e evitando comunicar algum cliente quando tenha algum cambio de endereço por exemplo( tudo isso ele faz com o eureka ao ser um centralizador de servicos)
  
# Execução
Para subir o projeto num algum IDE é executar o arquivo ApplicationZuul.java
Ele vai pegar a seguinte configuração
```sh
server:
    port: 8080 // porta que vai bater o usuario final
zuul:
  routes: // os routes são o nome que vou dar para meu servico registrado por Eureka(Ex: localhost:8080/campanha)
    campanha:
      path: /campanha/**
      serviceId: CAMPANHA-SERVICE // Service como aparece em eureka
      stripPrefix: false
    associacao:
      path: /associacao/**
      serviceId: CAMPANHA-SERVICE // Service como aparece em eureka
      stripPrefix: false
    socioTorcedor:
      path: /sociotorcedor/**
      serviceId: SOCIO-TORCEDOR-SERVICE // Service como aparece em eureka
      stripPrefix: false

eureka:
  client:
    registerWithEureka: false
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/  //Endereco onde fica o eureka
```
