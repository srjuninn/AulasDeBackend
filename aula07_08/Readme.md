
---

## 📚 Projeto: Gerenciador de Livros

Este projeto em Java permite visualizar uma lista de livros e alterar o número de páginas de um livro escolhido pelo usuário. Ele demonstra conceitos básicos de orientação a objetos, como encapsulamento, arrays de objetos e entrada de dados via `Scanner`.

---

### 🧩 Estrutura do Projeto

- **`Livro.java`**  
  Classe que representa um livro com título, autor e número de páginas.  
  Inclui métodos `get` para acessar os atributos e um método `setPageNum` com validação para impedir valores menores que 5.

- **`LivrosMain.java`**  
  Classe principal que:
  - Cria uma lista de livros.
  - Exibe os livros ao usuário.
  - Permite escolher um livro e alterar seu número de páginas.
  - Valida a entrada e atualiza a lista.

---

### 🛡️ Validações

- O número de páginas não pode ser menor que 5.
- O número escolhido pelo usuário deve estar entre 1 e 5.
- O programa exibe mensagens de erro apropriadas para entradas inválidas.

---

### 📌 Exemplo de Saída

```
Lista de livros:
1 - Título 'Harry Potter e a pedra filosofal' - Autor 'J. K. Rowling' - Quantidade de páginas '224'
...
Escolha um livro pra mudar o número de páginas(escolha por número): 2
Digite o número de páginas que deseja alterar:
Alterar páginas: 3
Erro.. você não pode colocar um número de páginas menor que 5!
```

---

## 🧙‍♂️ Projeto: Criador de Personagem RPG

Este projeto em Java permite ao usuário criar e personalizar um personagem de RPG, definindo atributos como nome, classe, nível e vida. Ele demonstra conceitos de orientação a objetos, entrada de dados com `Scanner`, e validações básicas.

---

### 🧩 Estrutura do Projeto

- **`PersonagemRPG.java`**  
  Classe que representa um personagem com:
  - `nome`, `classe`, `nivelAtual`, `vidaAtual`
  - Métodos `get` e `set` para cada atributo
  - Métodos para adicionar nível e vida (`adicionarNivel`, `adicionarVida`)

- **`PersonagemRPGMain.java`**  
  Classe principal que:
  - Solicita dados do personagem ao usuário
  - Exibe as informações iniciais
  - Permite alterar os dados com validações
  - Exibe os dados atualizados

---

### 🛡️ Validações

- **Nível** deve estar entre 1 e 100.
- **Vida** deve estar entre 1 e 100.
- Respostas devem começar com "S" ou "N" para indicar sim ou não.

---

### 📌 Exemplo de Saída

```
Seja bem vindo caro aventureiro insira seu nome
Nome: Arwen
Classe: Elfa arqueira

Suas informações:
Nome: Arwen
Classe: Elfa arqueira
Nível: 0
Vida: 20

Gostaria de mudar suas informações ?
S
Insira seu Nome: Arwen Evenstar
Insira sua Classe: Guardiã da floresta
Insira seu Nível: 50
Insira sua vida: 80

Suas informações:
Nome: Arwen Evenstar
Classe: Guardiã da floresta
Nível: 50
Vida: 80
```

---
