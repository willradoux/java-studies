# Organização do Repositório

Este projeto deve ficar limpo o suficiente para servir como portfólio de estudo e simples o suficiente para continuar sendo usado no dia a dia.

## Pastas principais

```text
docs/
trilhas/
exercicios/
java-lab/
ucsal/
rascunhos/
```

## Quando criar uma pasta

Crie uma pasta nova quando ela tiver pelo menos um destes itens:

* um `README.md` explicando o objetivo;
* exercícios para resolver;
* código Java;
* material real de aula;
* um mini projeto.

Evite criar pastas vazias apenas para lembrar que o tema existe. Para isso, use as trilhas em Markdown.

## Onde colocar cada coisa

| Conteúdo | Local |
| --- | --- |
| PDF da faculdade | `ucsal/<disciplina>/aulas/` |
| Lista ou trabalho da faculdade | `ucsal/<disciplina>/atividades/` |
| Exercícios criados para treino | `exercicios/` |
| Plano de estudos | `trilhas/` ou `docs/` |
| Código experimental | `rascunhos/` |
| Código com Maven/JUnit | `java-lab/` |

## Padrão de exercício

Cada exercício importante deve ter:

```text
exNN-nome-do-exercicio/
  README.md
  codigo/
  fluxograma/
```

Para exercícios gerais que ainda não precisam de pasta própria, use os bancos em `exercicios/*.md`.

## Padrão de commit

Use commits pequenos:

```bash
study: solve POO exercise 03
study: practice stack implementation
docs: add Spring Boot study path
fix: correct average input validation
refactor: extract media calculation method
```
