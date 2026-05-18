# 🚀 Desafios de Lógica: Simulando Situações Reais

Bem-vindo ao meu repositório de exercícios de lógica de programação! Aqui reuni **7 desafios práticos** que simulam situações do dia a dia — desde o funcionamento de um caixa eletrônico até um sistema de votação e controle de notas escolares.

O objetivo principal deste projeto é exercitar conceitos fundamentais como estruturas de repetição (`while`, `for`), condicionais (`if/else`) e manipulação de variáveis.

---

## 📋 Os Desafios

### 🔒 1. Validação de Senha (Caixa Eletrônico)

Simula o acesso a uma conta bancária com a senha `4321`. O usuário tem até 3 tentativas.

* **Sucesso:** Exibe "Acesso liberado".
* **Erro (3x):** Exibe "Conta bloqueada".

### 🎓 2. Média Escolar

Recebe 4 notas de 4 alunos diferentes, calcula a média final ($mf$) e exibe a situação de cada um:

* $mf \ge 7$: **Aprovado**
* $5 \le mf < 7$: **Recuperação**
* $mf < 5$: **Reprovado**

### 🛒 3. Caixa de Loja (Somatório)

O sistema vai recebendo os valores dos produtos por tempo indeterminado. Quando o usuário digita `0`, a compra é encerrada e o valor total é exibido.

### 🔢 4. Múltiplos de 3

Um script simples que varre os números de 1 a 100, identifica quais são múltiplos de 3, soma todos eles e mostra o resultado na tela.

### 📊 5. Estatísticas de Números

O programa lê 10 números e, ao final, gera um relatório completo contendo:

* Soma e média geral.
* O maior e o menor número digitado.
* Quantidade e soma dos números pares.
* Quantidade e soma dos números ímpares.

### 🗳️ 6. Minisistema de Votação

Lê 10 votos e contabiliza a disputa entre os candidatos `1 (João)` e `2 (Maria)`. Qualquer outro número é computado como nulo. No final, o sistema declara o grande vencedor.

### 💰 7. Simulador Bancário Completo

Um menu interativo de caixa eletrônico que começa com um saldo de R$ 500,00 e roda em loop até que o usuário decida sair (`0`).

* **Opções:** 1-Saque | 2-Depósito | 3-Saldo | 0-Sair
* *Regras de negócio:* Não é permitido sacar mais do que o saldo disponível e não são aceitos valores negativos ou inválidos.

---

## 🛠️ Tecnologias Utilizadas

* Lógica de Programação pura.
* [Java - jdk 21].

## 🧠 O que aprendi com isso?

Desenvolver esses exercícios me ajudou a entender melhor como controlar o fluxo de uma aplicação e como validar os dados que o usuário digita, evitando que o sistema quebre por bobeira.

*Fique à vontade para olhar o código, dar sugestões ou fazer um fork para treinar também!* ✨
