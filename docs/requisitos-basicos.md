# 📋 Requisitos Básicos de Negócio

## Objetivo do Sistema
O sistema tem como objetivo permitir que usuários avaliem livros e compartilhem suas experiências de leitura. Ele deve oferecer permissões diferenciadas entre administradores e usuários comuns.

---

## Funcionalidades Principais
### Gerenciamento de Usuários
- **Administrador**:
  - Gerenciar (CRUD) contas de outros usuários.
- **Comum**:
  - Atualizar seus próprios dados e senha.

### Gerenciamento de Livros
- **Administrador**:
  - Criar, editar, excluir e visualizar todos os livros.
- **Comum**:
  - Criar e gerenciar apenas os livros que cadastrou.

### Gerenciamento de Reviews
- **Administrador**:
  - Visualizar e excluir todas as reviews.
- **Comum**:
  - Criar, editar e excluir apenas suas próprias reviews.

---

## Regras de Negócio
1. **Cadastro de Usuários**:
   - Todos os usuários devem ter um email e senha únicos.
   - Apenas administradores podem criar contas de outros usuários.

2. **Permissões**:
   - Usuários comuns não podem acessar ou editar livros cadastrados por outros usuários.
   - Somente administradores têm acesso a todos os dados do sistema.

3. **Relatórios e Estatísticas (Opcional)**:
   - O sistema pode incluir relatórios básicos para administradores sobre a quantidade de livros cadastrados e reviews feitas.

---

## Restrições
1. Um livro não pode ser excluído se tiver reviews associadas.
2. Uma review deve estar vinculada a um livro existente.
3. A nota de uma review deve ser um valor entre 1 e 5.

---

## Tecnologias Planejadas
- **Frontend**: HTML, CSS, JavaScript.
- **Backend**: Node.js com Express.
- **Banco de Dados**: SQLite.
