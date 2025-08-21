---

## 🚦 Simulador de Transporte — Projeto Java

### 🎯 Objetivo

Este projeto simula o tempo estimado de viagem para diferentes tipos de veículos em um trajeto de determinada distância. Cada veículo possui uma lógica própria para calcular o tempo, considerando sua velocidade média e características específicas (como paradas no caso do ônibus).

---

### 🧩 Estrutura do Projeto

O projeto está organizado em cinco classes:

```
aula21_08/
├── Veiculo.java
├── Carro.java
├── Bicicleta.java
├── Onibus.java
└── Trajeto100km.java
```

---

### 🚘 Classe `Veiculo`

Classe base que representa um veículo genérico. Contém:

- Atributo: `modelo`
- Método: `calcularTempo(float distancia)` → retorna tempo padrão com velocidade de 80 km/h
- Método: `setModelo()` e `getModelo()` para manipulação do nome do veículo

> Este método é sobrescrito nas subclasses para aplicar regras específicas de cada tipo de transporte.

---

### 🚗 Classe `Carro`

Subclasse de `Veiculo` com velocidade média de **80 km/h**. Sobrescreve o método `calcularTempo()` para retornar o tempo formatado em horas e minutos.

---

### 🚲 Classe `Bicicleta`

Subclasse de `Veiculo` com velocidade média de **20 km/h**. Também sobrescreve `calcularTempo()` com lógica própria.

---

### 🚌 Classe `Onibus`

Subclasse de `Veiculo` com velocidade média de **60 km/h**. Possui o atributo adicional:

- `numeroParadas`: cada parada adiciona **15 minutos (0.25h)** ao tempo total

O método `calcularTempo()` considera tanto a distância quanto o número de paradas para retornar o tempo estimado.

---

### 🧪 Classe `Trajeto100km`

Classe principal que executa o programa:

1. Recebe a distância do trajeto via `Scanner`
2. Solicita os modelos dos veículos
3. Solicita o número de paradas para o ônibus
4. Instancia os objetos `Carro`, `Bicicleta` e `Onibus`
5. Calcula e exibe o tempo estimado de viagem para cada veículo

---

### 💡 Exemplo de Saída

```text
Bem vindo ao trajtoEz!
Qual seria seu destino (insira em km)?
Distancia: 100

Insira o modelo do carro: Civic
Insira o modelo da bicicleta: Caloi
Insira o modelo d0 onibus: Mercedes
Insira a quantidade de paradas se fosse de ônibus: 2

Em um trajeto de 100,00km, você iria demorar:
Civic: 1 hora(s) e 15 minuto(s)
Caloi: 5 hora(s) e 00 minuto(s)
Mercedes: 2 hora(s) e 10 minuto(s)
```

---

### 📌 Conclusão

Este projeto é uma ótima aplicação dos princípios da **Programação Orientada a Objetos (POO)** em Java:

- Uso de **herança** para compartilhar atributos e métodos
- **Sobrescrita de métodos** para personalizar comportamentos
- **Encapsulamento** com atributos privados e métodos públicos
- Aplicação prática de **polimorfismo** ao tratar diferentes tipos de veículos
