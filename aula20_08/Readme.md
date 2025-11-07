
---

## 🚗 Projeto Java: Herança e Sobrescrita com Veículo e Carro

### 📌 Objetivo

Este projeto tem como finalidade demonstrar os conceitos de **herança** e **sobrescrita de métodos** em Java, utilizando duas classes principais: `Veiculo` e `Carro`. A ideia é mostrar como uma subclasse pode herdar atributos e comportamentos de uma superclasse, e ao mesmo tempo personalizar seu funcionamento.

---

### 🧩 Estrutura das Classes

#### 🔹 Classe `Veiculo`

Representa um veículo genérico com os seguintes atributos:

- `nome`: nome do veículo
- `modelo`: modelo do veículo
- `cor`: cor do veículo
- `ano`: ano de fabricação

**Métodos:**

- `iniciar()`: imprime `"O veículo está iniciando..."` 
- `toString()`: retorna uma descrição formatada do veículo

```java
public void iniciar() {
    System.out.println("O carro está iniciando...");
}
```

---

#### 🔹 Classe `Carro`

É uma subclasse de `Veiculo` que representa um carro específico. Ela herda todos os atributos e métodos da superclasse, mas **sobrescreve** o método `iniciar()` com uma mensagem personalizada:

```java
@Override
public void iniciar() {
    System.out.println("O carro está dando partida...");
}
```

---

### ▶️ Classe `Main`

Executa o programa principal. Cria uma instância da classe `Carro`, imprime suas informações e chama o método `iniciar()`:

```java
public static void main(String[] args) {
    Carro c1 = new Carro("Civicão", "G10", "All black", 2020);
    System.out.println(c1.toString());
    c1.iniciar();
}
```

---

### 💻 Exemplo de Saída

```text
Veiculo: Civicão
Modelo: G10
Cor: All black
Ano: 2020
O carro está dando partida...
```

---


### 📌 Conclusão

Este projeto é uma introdução prática à **Programação Orientada a Objetos (POO)** em Java, mostrando como utilizar herança e sobrescrita para criar estruturas reutilizáveis e flexíveis. A classe `Carro` herda de `Veiculo`, mas redefine seu comportamento para se adequar ao contexto específico de um carro.

