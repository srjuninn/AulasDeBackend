
# 🧮 Cálculo de Área de Retângulos em Java

Este projeto apresenta um exercício simples de programação em Java com duas abordagens diferentes:

- 💡 **Programação Orientada a Objetos (POO)**
- 🔧 **Programação Estrutural**

O objetivo é comparar como as duas abordagens lidam com a entrada de dados e o cálculo da área de um retângulo.

---

## 📦 Estrutura do Projeto

```
aula30_07/
├── Retangulo.java              // Classe que representa um retângulo (POO)
├── RetanguloMain.java         // Executa a lógica utilizando orientação a objetos
└── RetanguloEstrutural.java   // Executa a lógica com abordagem estrutural
```

---

## 🧭 Objetivo do Exercício

Criar um programa que:
- Solicita ao usuário a base e a altura de **3 retângulos**
- Calcula e exibe a área de cada retângulo

---

## 🧱 Abordagens Utilizadas

### 1. Orientada a Objetos – `RetanguloMain.java` + `Retangulo.java`  
- Utiliza uma **classe Retangulo**, com atributos e método `calcularArea()`
- Instancia um objeto `rt` para acessar e manipular os dados
- Mostra como encapsular informações e reutilizar métodos

```java
public class Retangulo {
    public double base;
    public double altura;

    public double calcularArea() {
        return base * altura;
    }
}
```

### 2. Estrutural – `RetanguloEstrutural.java`  
- Utiliza um vetor de `double` para armazenar os dados
- Cálculo feito diretamente, sem uso de classes ou métodos personalizados
- Foca em lógica direta e manipulação de dados simples

```java
retangulo[2] = retangulo[0] * retangulo[1]; // área = base * altura
```

---

## 🎯 Aprendizados

✅ Compreensão das diferenças entre estrutura de dados orientada e estrutural  
✅ Prática com entrada de dados via `Scanner`  
✅ Uso de `for` e vetores para repetição de tarefas  
✅ Aplicação de princípios básicos da POO

---
