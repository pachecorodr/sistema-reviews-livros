# 📚 Sistema de Reviews de Livros
Bem-vindo ao Sistema de Reviews de Livros! Este projeto permite que os usuários gerenciem livros e compartilhem suas experiências de leitura por meio de reviews. Ideal para praticar conceitos de CRUD, autenticação e controle de permissões em sistemas.

## 🚀 Funcionalidades
### Usuários:

#### Administrador:

- Gerenciar (Criar, Ler, Atualizar e Excluir) usuários.
- Gerenciar o acervo de livros.
- Visualizar e moderar todas as reviews.
#### Comum:

- Cadastrar livros que leu.
- Visualizar os livros cadastrados por ele.
- Adicionar, editar e excluir suas próprias reviews.
- Atualizar seus dados pessoais e senha.

### Livros:

- Cadastro com atributos detalhados, incluindo título, autor, gênero, editora, e muito mais.
- Relacionamento com usuários para garantir acesso controlado.
### Reviews:
- Nota (de 1 a 5) e comentários sobre os livros.
- Exclusividade: cada usuário só pode editar ou excluir suas próprias reviews.

## 🛠️ Tecnologias Utilizadas
### Frontend:
- HTML, CSS e JavaScript
### Backend:
- Node.js com Express
### Banco de Dados:
- SQLite 
## 🗂️ Como Executar o Projeto
### Pré-requisitos
#### Certifique-se de ter instalado:

- Node.js 
- Git
- Um gerenciador de pacotes como npm ou yarn.
### Passo a Passo
#### Clone este repositório:
`git clone https://github.com/pachecorodr/sistema-reviews-livros.git
cd sistema-reviews-livros`

#### Instale as dependências:

`npm install`

#### Configure o banco de dados:

- Configure as credenciais no arquivo .env (exemplo incluído no repositório).
- Execute as migrações para criar as tabelas no banco:
`npm run migrate`

#### Inicie o servidor:

`npm start`

#### Acesse o sistema no navegador:

- URL padrão: http://localhost:3000

## 📖 Como Contribuir
1- Faça um fork deste repositório.

2- Crie uma branch para a sua feature:
`git checkout -b minha-feature`

3- Commit suas alterações:
`git commit -m "Adiciona nova funcionalidade`

4- Faça um push para sua branch:
`git push origin minha-feature`

5- Abra um Pull Request!

✨ Contato
- Autor: Rodrigo Pacheco de Almeida
- Email: r.pacheco@gsuite.iff.edu.br
