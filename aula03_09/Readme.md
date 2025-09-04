
---

## 📝 Sistema Bancário Simplificado

### 🎯 Objetivo
Desenvolver uma aplicação bancária capaz de lidar com três tipos de contas:
- **Conta Corrente (CC)**: tarifa mensal fixa de R$12,00.
- **Conta Poupança (CP)**: sem tarifa mensal.
- **Conta Pessoa Jurídica (PJ)**: tarifa mensal de R$20,00 + R$1,50 por saque.

---

### 🧱 Estrutura de Classes

#### ✅ `Conta` (classe abstrata)
- **Atributos**: `agencia`, `titular`, `numeroDaConta`, `saldo`.
- **Métodos concretos**:
  - `depositar(double valor)`
  - `sacar(double valor)` → precisa validar saldo antes de sacar.
  - `exibirSaldo()`
  - Getters e setters.
- **Método abstrato**:
  - `tarifasMensais()` → implementado pelas subclasses.

#### ✅ Subclasses:
- `ContaCorrente`: aplica tarifa de R$12,00 no saldo.
- `ContaPoupanca`: retorna tarifa zero.
- `ContaPJ`: aplica tarifa de R$20,00 e adiciona R$1,50 por saque.

---

### 🧠 Regras de Negócio Implementadas

- **Tarifa mensal** é aplicada logo após a criação da conta.
- **Saque com taxa adicional** na Conta PJ.
- **Validação de saldo** antes do saque.
- **Menu interativo** para operações bancárias: exibir saldo, depositar, sacar, sair.

---

