# DevCalc API

API REST escrita em Java para disponibiliar operações matemáticas simples.

## Destaque

Use essa API de cálculo no seu próprio Browser e veja o código completo que descreve:

- Como criar uma API simples;
- Fazer testes de cobertura;
- Como implementar o CD/CI completo no Github utilizando Actions.


## Visão Geral

O propósito deste pequeno aplicativo API é demonstrar o desenvolvimento de uma API já integrada ao processo de CD/CI do git. Com a cobertura de teste aplicada. E foi desenvolvida por mim para o TP1 (TESTE DE PERFORMANCE) da Disciplina 26E1_3 Pipelines e CI/CD e DevOps da Faculdade Infnet.  


### Autor

Anderson Machado


## Uso

Quando a API está operacional, o resultado esperado pode ser feito em qualquer Browser acessando os seguintes recursos:


    GET /add?a=10&b=5 -> retorna 15
    GET /subtract?a=10&b=5 -> retorna 5
    GET /multiply?a=10&b=5 -> retorna 50
    GET /divide?a=10&b=5 -> retorna 2


## Instalação

A instalação da API, bem como a compilação e execução será descritas nas próximas Branch. Para fazer build instale o Java e execute o mvn clean install.