
---

# Herança em Java — Eletrodomésticos

Esta aula foi criada com o objetivo de demonstrar meu aprendizado sobre **herança** na programação orientada a objetos com Java. Utilizei uma estrutura simples de classes para representar diferentes tipos de eletrodomésticos, mostrando como compartilhar atributos e comportamentos comuns entre eles.

## 📦 Estrutura do Projeto

O projeto está organizado em quatro classes principais:

### 🔹 `Eletrodomestico` (Superclasse)

Representa um eletrodoméstico genérico com os seguintes atributos:

- `nome`
- `cor`
- `preco`
- `tensao`
- `potencia`

Inclui métodos `get` e `set` para encapsulamento e um construtor para inicialização.

### 🔸 `Batedeira` (Subclasse)

Herde os atributos da superclasse `Eletrodomestico` e adiciona:

- `velocidade` — número de velocidades da batedeira

Também sobrescreve o método `toString()` para exibir as informações completas da batedeira.

### 🔸 `Microondas` (Subclasse)

Herde os atributos da superclasse `Eletrodomestico` e adiciona:

- `hasLight` — indica se o micro-ondas possui luz interna

Também sobrescreve o método `toString()` para exibir as informações completas do micro-ondas.

### 🔸 `MainProgram`

Classe principal que instancia objetos das subclasses e imprime suas informações no console.

## 🧪 Exemplo de Saída

```text
Batedeira Informações:
Nome: Batedeira Turbo
Cor: Branca
Preço: 199.9
Tensão: 220
Potência: 400
Velocidade: 5

Microondas Informações:
Nome: Microondas Grill
Cor: Preto
Preço: 499.9
Tensão: 220
Potência: 1000
Tem luz interna ? true
```

## 🚀 Aprendizado

Com este projeto, aprendi:

- Como usar **herança** para reutilizar código e evitar duplicação
- Como aplicar **encapsulamento** com métodos `get` e `set`
- Como sobrescrever métodos (`toString`) para personalizar a saída
- Como estruturar um programa orientado a objetos de forma clara e funcional

---
