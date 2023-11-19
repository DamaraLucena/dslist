# DSList - Intensivão Java Spring
<h3>Sistema de Gerenciamento de Jogos</h3>

Este projeto é um sistema de gerenciamento de jogos desenvolvido em Java Spring, utilizando H2 como banco de dados embutido, Postman para testes de API e Maven para gerenciamento de dependências.

<h3>Funcionalidades Principais</h3>

1. Coleção de Jogos de Aventura e RPG
O sistema possui uma funcionalidade para gerenciar uma coleção de jogos de aventura e RPG. Os jogos são armazenados no banco de dados e podem ser visualizados e atualizados por meio de endpoints da API.

2. Coleção de Jogos de Plataforma
Além da coleção de jogos de aventura e RPG, o sistema também suporta uma coleção separada para jogos de plataforma. Essa coleção é mantida independentemente da primeira e possui as mesmas operações CRUD.

3. Alteração de Posição dos Jogos
Uma funcionalidade exclusiva deste sistema é a capacidade de alterar a posição dos jogos em ambas as coleções. Isso permite uma classificação personalizada dos jogos conforme desejado pelo usuário.

<h3>Configuração do Projeto</h3>
  
  **Requisitos** <br>
  Certifique-se de ter os seguintes requisitos estabelecidos em sua máquina:

- Java 17 ou superior
- Maven
- Postman (para testes de API)

<h3>Configuração do Banco de Dados</h3>
  O projeto utiliza o banco de dados H2 embutido. Não é necessário configurar um banco de dados externo. Os dados são persistidos localmente no diretório datado projeto.

<h3>Execução do Projeto</h3>
1. Clone o repositório do GitHub: <br><br>
  <code>git clone https://github.com/seu-usuario/seu-projeto.git</code>
<br><br>
2. Navegue até o diretório do projeto:<br><br>
  <code>cd seu-projeto</code>
<br><br>
3. Compile o projeto com Maven:<br><br>
  <code>mvn clean install</code>
<br><br>
4. Execute o aplicativo:<br><br>
  <code>java -jar target/seu-projeto.jar</code>

O aplicativo será iniciado e estará disponível em http://localhost:8080 .

<h3>Testando uma API com Postman</h3> Utilize o Postman para testar os endpoints da API. Importe uma coleção de requisições localizadas no diretório postmando projeto.

<h3>Contribuindo</h3> Se desejar contribuir para este projeto, siga estas etapas:

- Fork do repositório
- Crie um galho ( git checkout -b feature/nova-feature)
- Faça commit das alterações ( git commit -am ‘Adiciona nova feature’)
- Faça push para um branch ( git push origin feature/nova-feature)
- Crie um novo pull request
- Faça commit das alterações ( git commit -am ‘Adiciona nova feature’)
- Faça push para um branch ( git push origin feature/nova-feature)
- Crie um novo pull request


