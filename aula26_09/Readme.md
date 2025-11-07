---

# 📚 Sistema de Biblioteca — Projeto Java com POO

Este projeto foi desenvolvido como parte da disciplina de Backend, com o objetivo de aplicar os principais conceitos de **Programação Orientada a Objetos (POO)** em Java. O sistema simula uma biblioteca digital, permitindo o cadastro de livros e usuários, além do controle de empréstimos e devoluções.

## 🎯 Objetivo da Lição

A proposta do exercício é implementar um sistema completo utilizando os seguintes conceitos de POO:

- ✅ Classes e Objetos  
- ✅ Construtores  
- ✅ Encapsulamento  
- ✅ Herança  
- ✅ Polimorfismo  
- ✅ Interfaces  
- ✅ Abstração  
- ✅ Sobrecarga e Sobrescrita  
- ✅ Tratamento de Exceções  


## 🧱 Estrutura do Código

O sistema está dividido em várias classes, cada uma com uma responsabilidade específica:

- **`Livro`**  
  Representa um livro com código, título, autor e status (`DISPONIVEL` ou `EMPRESTADO`).  
  Implementa a interface `Emprestavel`.

- **`Usuario`**  
  Classe abstrata com atributos comuns: `id`, `nome`, `email`.  
  Possui o método abstrato `getLimiteEmprestimos()`.

- **`Aluno`**  
  Subclasse de `Usuario`.  
  Limite de empréstimos: **2 livros**.

- **`Professor`**  
  Subclasse de `Usuario`.  
  Limite de empréstimos: **5 livros**.

- **`Emprestavel`**  
  Interface que define os métodos:
  - `emprestar(Usuario u)`
  - `devolver()`

- **`Emprestimo`**  
  Relaciona um livro e um usuário.  
  Armazena a data do empréstimo e a data prevista de devolução.  
  Responsável por registrar operações de empréstimo e devolução.

- **`Biblioteca`**  
  Gerencia listas de livros e usuários.  
  Contém métodos para:
  - Cadastrar e remover livros e usuários
  - Realizar empréstimos e devoluções
  - Listar livros com status e informações

- **`Main`**  
  Classe principal que executa o sistema.  
  Possui um menu interativo para testar todas as funcionalidades.

- **`Status`**  
  Enum que define o estado de um livro:
  - `DISPONIVEL`
  - `EMPRESTADO`

---


## 🧪 Funcionalidades Testadas

O sistema já vem com usuários e livros cadastrados no `Main.java`, e oferece um menu interativo com as seguintes opções:

- 📘 Cadastrar e remover livros
- 👤 Cadastrar e remover usuários
- 🔄 Emprestar e devolver livros
- 📋 Listar livros com status e informações de empréstimo

### ⚠️ Validações implementadas

- Impede cadastro de usuários com ID duplicado
- Impede cadastro de livros com código já existente
- Impede empréstimo de livros já emprestados
- Impede empréstimo acima do limite do usuário
- Impede remoção de usuários com empréstimos ativos
- Impede remoção de livros que estão emprestados


## 📌 Exemplo de Uso

```bash
O que deseja fazer?
1. Cadastrar livro
2. Remover livro
3. Emprestar livro
4. Devolver livro
5. Cadastrar usuário
6. Remover usuário
7. Listar livros
8. Sair
Resposta: 3
Digite o ID do usuário: 4
Digite o código do livro: 101
📖 Empréstimo registrado com sucesso!
Livro: O Senhor dos Anéis
Usuário: Gabriel
Data de empréstimo: 2025-10-02
Data de devolução: 2025-10-17
```

## 🧠 Aprendizados

Este projeto reforça a importância da modelagem orientada a objetos para sistemas reais, além de demonstrar como aplicar conceitos como **interfaces**, **herança**, **abstração** e **exceções** de forma prática e funcional.

---
