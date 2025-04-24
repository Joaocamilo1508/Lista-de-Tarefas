TO-DO LIST API COM SPRING BOOT

Este é um projeto de To-Do List desenvolvido com Spring Boot como backend, com uma interface simples em HTML, CSS e JavaScript para demonstrar a funcionalidade da API. 
O foco principal deste projeto é a arquitetura backend, e o frontend foi criado apenas para testes e consumo da API.

##
🚀 Tecnologias
Spring Boot - Framework para o desenvolvimento de aplicações Java.

MySQL - Banco de dados.

HTML/CSS/JavaScript - Interface simples para testar a API (não é o foco do projeto).

Postman - Utilizado para testar os endpoints da API.

##
📝 Funcionalidades
Cadastro de Tarefas: Criação de novas tarefas com título, descrição, data de vencimento, prioridade e status.

Listagem de Tarefas: Exibição de todas as tarefas cadastradas ou listar por Status de pendente ou concluido ou por prioridade de baixa,media e alta .

Exclusão de Tarefas: Remoção de tarefas pelo ID.

##
Testar a API com o Postman

Você pode testar os endpoints da API usando o Postman com as seguintes rotas:

GET /tarefas, GET /tarefas/{id} - Lista todas as tarefas ou listar por ID

POST /tarefas - Cria uma nova tarefa (Body em JSON)

DELETE /tarefas/{id} - Deleta uma tarefa pelo ID

##
 Acessar o Frontend

Acesse o frontend simples via navegador em: http://localhost:8080/index.html.

Observação: O frontend foi desenvolvido apenas para testar a API. Não é o foco do projeto, mas pode ser útil para visualizar a aplicação funcionando.

