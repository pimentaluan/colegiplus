

## 📝 Guia Rápido de Inicialização do Collegialis

### 1\. 🔑 Configuração do Banco de Dados

Você deve ajustar as configurações do PostgreSQL para que o Spring Boot possa se conectar e criar o esquema das tabelas.

  * **Arquivo:** `src/main/resources/application.properties`

<!-- end list -->

```properties
spring.datasource.url=jdbc:postgresql://localhost:_sua_porta_/nome_do_seu_banco
spring.datasource.username=seu_usuario_postgres
spring.datasource.password=sua_senha_postgres

-----
```

### 2\. 💾 Inserção de Dados Iniciais (Seed Data)

O sistema exige registros nas tabelas **`Aluno`** e **`Assunto`**. Você deve executar este script SQL no seu cliente de banco de dados **após** a aplicação ter rodado pela primeira vez (para garantir que as tabelas foram criadas).

```sql
--- DADOS DE TESTE PARA O PROJETO COLLEGIPLUS
-- -----------------------------------------

-- 1. Inserir um ALUNO (CRUCIAL para o ProcessoService)
INSERT INTO aluno (id, login, matricula, nome, senha, telefone) VALUES (2, 'aluno.teste@ifpb.edu.br', 123, 'Aluno Teste', '123', 12345678);

-- 2. Inserir Assuntos (Necessário para o formulário)
INSERT INTO assunto (id, nome)
VALUES 
    (2, 'Aproveitamento de Componente Curricular'),
    (3, 'Trancamento de Disciplina'),
    (4, 'Revisão de Média');
```
