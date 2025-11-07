
---

## 🧾 **Anotação técnica do sistema de cadastro e busca com cache**

### 🎯 **Objetivo do sistema**
O programa tem como finalidade simular um pequeno banco de dados de usuários, com um sistema de cache para otimizar buscas. Ele permite:
- Inserir dados de pessoas (nome, cidade, telefone, email, idade).
- Armazenar esses dados em uma lista chamada `banco`.
- Buscar pessoas pelo nome, primeiro no `cache` e, se não encontradas, no `banco`.
- Adicionar ao `cache` as pessoas que forem buscadas no banco, respeitando um limite de 10 elementos.

---

### 🧩 **Componentes principais**

#### 1. **Classe `Pessoa`**
- Contém os atributos básicos de um usuário: nome, cidade, número de telefone, email, idade e um identificador `id`.
- Possui métodos `get` e `set` para cada atributo.
- Implementa o método `toString()` para exibir os dados de forma formatada.

#### 2. **Classe `Main`**
- Contém o método `main()` que executa toda a lógica do programa.
- Utiliza duas listas:
  - `banco`: armazena todos os usuários cadastrados.
  - `cache`: armazena os últimos usuários buscados, com limite de 10.

---

### 🔄 **Fluxo de execução**

#### **Etapa 1: Cadastro de usuários**
- O programa pergunta se o usuário deseja inserir informações.
- Se a resposta for `"sim"`, ele coleta os dados via `Scanner` e cria um objeto `Pessoa`.
- Esse objeto é adicionado à lista `banco`.
- O identificador `id` é incrementado automaticamente a cada novo cadastro.

#### **Etapa 2: Busca de usuários**
- O programa solicita o nome da pessoa a ser buscada.
- Primeiro, verifica se essa pessoa está no `cache`:
  - Se estiver, exibe os dados e encerra a busca.
- Se não estiver no `cache`, busca no `banco`:
  - Se encontrar, exibe os dados e adiciona essa pessoa ao início do `cache`.
  - Se o `cache` já tiver 10 elementos, remove o último antes de adicionar o novo.
- Se não encontrar em nenhum dos dois, exibe uma mensagem de "Usuário não encontrado".

---

### ✅ **Pontos positivos do sistema**

- **Organização lógica clara**: separa bem cadastro e busca.
- **Uso de cache eficiente**: melhora a performance de buscas repetidas.
- **Limite de tamanho do cache**: evita sobrecarga de memória.
- **Mensagens amigáveis**: boa interação com o usuário.

---
