# Fluxo de Estudo com Git

Este repositório deve registrar a evolução dos estudos de forma simples e organizada.

## Regra principal

Para exercícios, desafios e projetos pequenos, use uma branch própria e abra um pull request para a `main`.

```text
branch -> commit -> push -> pull request -> revisão -> merge
```

## Branches

Use nomes curtos e descritivos.

```text
resolucao/ex01-operacoes-basicas
resolucao/ex23-tabuada
study/condicionais
study/metodos
challenge/fibonacci
project/calculadora
docs/update-readme
```

## Commits

Use mensagens simples e descritivas.

Para exercícios:

```text
study(ex01): resolve operacoes basicas
study(ex12): resolve par ou impar
study(ex23): resolve tabuada
```

Para anotações:

```text
docs: add notes about conditional statements
docs: update logic exercises
```

Para desafios e projetos:

```text
feat: add fibonacci challenge
feat: add basic calculator project
```

Para correções:

```text
fix: correct loop condition
refactor: simplify prime number validation
```

## Pull requests

Cada PR deve ter um objetivo claro.

Sugestão de título:

```text
Exercício 01: Operações básicas
Estudo: Condicionais em Java
Desafio: Fibonacci
Projeto: Calculadora
```

Modelo simples de descrição:

```md
## O que foi feito

- Resolvi o exercício proposto
- Adicionei exemplos de execução
- Testei a compilação com javac

## Aprendizados

- Registre aqui o que ficou mais claro durante a prática

## Próximos passos

- Registre aqui o que ainda quer revisar ou melhorar
```

## Exemplo de fluxo

```bash
git switch main
git pull
git switch -c resolucao/ex01-operacoes-basicas
```

Depois de resolver o exercício:

```bash
javac Ex01OperacoesBasicas.java
java Ex01OperacoesBasicas
git add 01-logica/exercicios/ex01-operacoes-basicas/Ex01OperacoesBasicas.java
git commit -m "study(ex01): resolve operacoes basicas"
git push -u origin resolucao/ex01-operacoes-basicas
```

Em seguida, abra um pull request para a branch `main`.

## Boas práticas

* resolva um exercício por PR;
* evite misturar exercícios diferentes no mesmo commit;
* prefira código simples e claro;
* não adicione frameworks ou dependências sem necessidade;
* registre aprendizados quando fizer sentido;
* revise o diff antes de abrir o PR.

