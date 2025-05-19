# 💻 Projeto: Simulação de Contas Bancárias (Treino)

> **⚠️ Aviso:** Este projeto é apenas um **treino** de programação com Java, voltado para praticar conceitos como orientação a objetos, herança, polimorfismo e uso de `enum`.

## 📋 Descrição

Este projeto simula o funcionamento básico de contas bancárias (Conta Corrente e Conta Poupança), permitindo realizar operações como:

- Depósito
- Consulta de saldo
- Transferência entre contas

O sistema é dividido entre contas do tipo **Corrente** e **Poupança**, com regras específicas para cada tipo.

---

## 🧠 Conceitos praticados

- Interfaces (`conta`)
- Classes abstratas (`ContaBancaria`)
- Herança (`ContaCorrente`, `ContaPoupanca`)
- Polimorfismo (métodos sobrescritos)
- `enum` (`TipoConta`)
- Encapsulamento de lógica de transferência e depósito

---

## 📂 Estrutura do projeto

```
NivelIntermediario/
└── Desafios/
    └── Desafio5/
        ├── Main.java
        ├── conta.java
        ├── ContaBancaria.java
        ├── ContaCorrente.java
        ├── ContaPoupanca.java
        └── TipoConta.java
```

---

## ▶️ Exemplo de execução

```java
ContaPoupanca p = new ContaPoupanca("Pedro", 1000, TipoConta.POUPANCA);
p.depositar(100); // aplica taxa de 10%
p.consultarSaldo();

ContaCorrente c = new ContaCorrente("Pedro", 1000, TipoConta.CORRENTE);
c.depositar(200);
c.consultarSaldo();

p.Transferido(0, c); // tentativa de transferência inválida (valor 0)
p.consultarSaldo();
c.consultarSaldo();
```

---

## ✅ Melhorias futuras (opcional)

Como se trata de um treino, aqui vão sugestões de melhorias para aprofundar o aprendizado:

- Tratar exceções ao invés de usar apenas `System.out.println`
- Criar um menu interativo via terminal
- Persistência em arquivo ou banco de dados
- Implementar testes automatizados

---

## 📚 Autor

- Feito por **Leonardo Sena** como **exercício de treino em Java**.