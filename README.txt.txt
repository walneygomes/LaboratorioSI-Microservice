UNIFACISA - Centro Universitário
Alunos: WALNEY NEGREIROS GOMES, THIAGO DINIZ


Projeto LSI microservice UNIVERSIDADE XYZ
Exemplo de configuração usando o spring cloud

### Eureka server
!(https://github.com/walneygomes/microservice-LSI-PROJETO/esquema.png)[SpringClound]

Aqui apresentamos como esta nosso esquema. Temos os Alunos, Professores, Matriculas, Cursos, Disciplinas no centro da imagem representando os microservices,
com suas portas.Alunos:9010, Professores:9080, Matriculas:9091, Cursos:8080, Disciplinas:9092.


Ao abrir o projeto e da aplicationMain, voce vai acessar o eureka via navegador com http://localhost:8761/, 8761 é a porta dele.  Primeiro sempre devemos
iniciar o eureka, pois ele vai permitir a comunicação com os microservice e config server, http://localhost:8888/ 

(https://github.com/walneygomes/microservice-LSI-PROJETO/eurekaserviceaplication.png)![ConfigServer]


(https://github.com/walneygomes/microservice-LSI-PROJETO/configservice.png)![ConfigServer]
Aqui como deve ser o esquema na abstração. O eureka existe as alias e os ip´s do projeto. A alia faz com que os microservices comuniques com com o config-server
,que tem o objetivo de inserir no banco, e o banco de repositorio é o github. Segue o link onde esta o repositorio do gir : https://github.com/walneygomes/microservice-LSI-PROJETO/insurance-config-server
aqui vamos expor nossas  application.properties do server config.

E por fim ao iniciar o eureka, config server, esta na vez dos microservices. Os microservices vai ser identificado pelo eureka pela porta e o ip:
Lê as configurações do github dos projetos abaixo:

MicroService: 
http://localhost:9010/aluno/default
http://localhost:9090/professores/default
http://localhost:9091/matriculas/default
http://localhost:8080/cursos/default
http://localhost:9092/disciplinas/default

Eureka:
http://localhost:8761/

ConfigServer:
http://localhost:8888/actuator/default

No api gateway chamaos esses elementos ai em cima e retorna os elementos que estao inseridos no repositorio do projeto


 
