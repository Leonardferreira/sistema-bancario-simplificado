# Sistema Bancário Simplificado em Java 🏦

Projeto desenvolvido como parte dos estudos de **Programação Orientada a Objetos (POO)** em Java, aplicando conceitos fundamentais para a criação de um sistema de gerenciamento de contas correntes.

## 🚀 Funcionalidades Implementadas

* **Encapsulamento:** Proteção dos dados sensíveis da conta (`cpf`, `nomeCompleto` e `saldo`) utilizando modificadores de acesso privados (`private`).
* **Construtor:** Inicialização obrigatória dos dados do cliente ao instanciar uma nova conta.
* **Consulta de Saldo:** Métodos para visualizar o saldo atualizado da conta.
* **Depósito:** Validação de valores positivos e atualização do saldo.
* **Saque:** Validação contra saldos insuficientes e valores inválidos antes de debitar.
* **Transferência:** Lógica para transferir valores entre instâncias diferentes de `ContaCorrente`, garantindo a segurança e consistência das transações.
* **Getters e Setters:** Métodos de acesso controlados para manipulação segura de atributos quando necessário.

## 🛠️ Tecnologias Utilizadas

* **Java** (JDK 17 ou superior)
* **IDE:** IntelliJ IDEA (ou compatível)
* **Conceitos de POO:** Classes, Objetos, Métodos, Encapsulamento, Construtores e Relacionamento entre Objetos.

## 📂 Estrutura do Projeto

O projeto está dividido essencialmente em duas classes principais:

1. **`ContaCorrente.java`**: Contém os atributos do cliente, construtor, regras de negócio (saque, depósito, transferência) e validações.
2. **`Main.java`**: Classe principal (`main`) responsável por instanciar os objetos (contas) e executar os testes das operações bancárias.

## 💻 Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado na sua máquina.
2. Clone este repositório ou baixe os arquivos fonte.
3. Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse, VS Code).
4. Execute a classe `Main.java` para ver as operações bancárias simuladas no terminal.

---
Desenvolvido por **Leonardo dos Santos** 🚀
