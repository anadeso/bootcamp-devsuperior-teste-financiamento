# Dev Superior - Bootcamp Spring React 3.0 

<p>Implementado Testes automatizados no Back end</p>


### Funcionalidades
Um financiamento possui três dados:
- totalAmont: valor total de dinheiro financiado
- income: renda mensal do cliente que está financiando
- months: número de meses do financiamento

E dois métodos:
- entry: entrada do financiamento, igual a 20% do valor total
- quota: prestação mensal do financiamento (sem juros)

Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente. A seguir alguns exemplos de financiamentos para ajudar a entender a regra:

- Exemplo 1: { totalAmount: 100000, income: 2000, months: 20 }
Este exemplo é INVÁLIDO porque com esses dados a entrada seria 20000 e a prestação seria 4000. Porém a prestação não pode passar de 1000, que é a metade da renda do cliente.

- Exemplo 2: { totalAmount: 100000, income: 2000, months: 80 }
Já este exemplo é VÁLIDO porque a entrada seria 20000 e a prestação seria 1000. Neste caso, a prestação é menor ou igual a metade da renda do cliente, satisfazendo a regra.

### Implementar os testes:

- Construtor<br>
Deve criar o objeto com os dados corretos quando os dados forem válidos
Deve lançar IllegalArgumentException quando os dados não forem válidos

- setTotalAmount<br>
Deve atualizar o valor quando os dados forem válidos
Deve lançar IllegalArgumentException quando os dados não forem válidos

- setIncome<br>
Deve atualizar o valor quando os dados forem válidos
Deve lançar IllegalArgumentException quando os dados não forem válidos

- setMonths<br>
Deve atualizar o valor quando os dados forem válidos
Deve lançar IllegalArgumentException quando os dados não forem válidos

- entry<br>
Deve calcular corretamente o valor da entrada

- quota<br>
Deve calcular corretamente o valor da prestação

### Resultado
















### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java 8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- [JUnit]() 

### Autor
---
Feito com ❤️ por Ana Sousa 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Ana-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/ana-sousa-1841a6104/)](https://www.linkedin.com/in/ana-sousa-1841a6104/)

