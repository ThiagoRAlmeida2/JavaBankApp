# Sistema de Banco em Java

Este é um projeto Java para um sistema bancário que inclui conexão com banco de dados, gerenciamento de pessoas e outras funcionalidades essenciais. O projeto utiliza Maven para gerenciamento de dependências e MySQL como banco de dados.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Maven**: Gerenciador de dependências e build.
- **MySQL**: Sistema de gerenciamento de banco de dados.
- **JDBC**: API Java para conexão com bancos de dados.

## Dependências

O projeto utiliza Maven para gerenciar suas dependências. As principais dependências são:

```xml
<dependencies>
   <dependencies>
      <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
      <dependency>
         <groupId>mysql</groupId>
         <artifactId>mysql-connector-java</artifactId>
         <version>8.0.28</version>
      </dependency>
</dependencies>
```

## Configuração do Banco de Dados

1. Certifique de ter o MySQL intalado e em execução
2. Crie um Banco de dados no MySQL para o projeto
3. Configure as credenciais de conexao no arquivo `Conexao.java`
   
   ```java
   public class Conexao {

    public static Connection getConexao() throws Exception{
        Connection conn = null;
        String urlConexao = "jdbc:mysql://localhost/nome_do_seu_BD";
        String user = "Seu_Usuario";
        String psw= "Sua_Senha"; //se não houver senha é só colocar "null"

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        conn = DriverManager.getConnection(urlConexao, user, psw);

        return conn;
    }
   ```
   
## Compilação e Execução

Para compilar e executar o projeto, siga os seguintes passos:
   1. Compilação:
      ```bash
          mvn clean compile
      ```

   2. Execução:
      ```bash
      mvn exec:java -Dexec.mainClass="ui.MainFrame"
      ```

## Uso

1. Inicie a aplicação executando a Classe principal `Menu`

## Tratamento de Exeções

O projeto inclui tratamento de exceções personalizadas na classe BancoException para garantir uma maior robustez na gestão de erros relacionados ao banco de dados.

## Contribuição

Se você quiser contribuir para o projeto, por favor, faça um fork do repositório e envie um pull request com suas alterações. Agradecemos qualquer contribuição para melhorar a funcionalidade e a qualidade do projeto!

## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/thiago-ribeiro-139727260/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:thiagoralmeida23@gmail.com)
[![GitHub](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/ThiagoRAlmeida2)
