# Como Estudar

Este guia define como usar o repositório durante os estudos.

O objetivo é treinar programação de verdade, não apenas acumular arquivos.

## Sessão padrão de 2h30

Use esta estrutura quando tiver um bloco completo:

```text
10 min - preparar ambiente e escolher exercício
35 min - estudar conceito
75 min - praticar em Java
20 min - revisar erros
10 min - registrar aprendizado e próximo passo
```

Se o dia estiver corrido, faça uma sessão curta:

```text
30 a 45 min - resolver 1 exercício + registrar erro principal
```

Consistência é mais importante que estudar muitas horas em um dia e sumir no outro.

## Fluxo para resolver exercícios

Antes de escrever código:

1. Leia o enunciado.
2. Reescreva o problema com suas palavras.
3. Liste entradas e saídas esperadas.
4. Pense em 2 ou 3 exemplos.
5. Escreva os passos em pseudocódigo.
6. Só depois implemente em Java.

Depois de implementar:

1. Compile.
2. Execute.
3. Teste casos simples.
4. Teste casos extremos.
5. Explique a solução em voz alta.
6. Registre erros relevantes.

## Regra de uso de IA

Durante exercícios, não peça solução completa de primeira.

Use este fluxo:

1. tentar sozinho;
2. pedir uma dica pequena;
3. tentar de novo;
4. pedir outra dica;
5. revisar onde travou;
6. ver solução completa somente se necessário;
7. reimplementar sozinho sem olhar.

Perguntas melhores que "me dá a resposta":

```text
Estou travado na interpretação. O que o enunciado quer?
Minha ideia faz sentido?
Qual caso de teste eu deveria tentar?
Onde meu loop pode estar errado?
Essa estrutura de dados faz sentido?
Qual seria uma dica pequena?
```

## Como pedir ajuda para debugging

Quando um código falhar, registre:

* o que você esperava;
* o que aconteceu;
* input usado;
* output recebido;
* trecho suspeito;
* mensagem de erro, se existir.

Evite reescrever tudo imediatamente. Primeiro descubra onde a quebra aconteceu.

Categorias possíveis:

```text
interpretação
algoritmo
Java/sintaxe
tipos
loop
condição
array/string
estrutura de dados
debug
edge case
complexidade
```

## Como organizar código no repo

Para exercícios resolvidos, use uma pasta por exercício:

```text
01-logica/exercicios/
  ex01-operacoes-basicas/
    Ex01OperacoesBasicas.java
    README.md
```

O `README.md` do exercício pode conter:

```text
Enunciado
Entrada
Saída
Exemplos
Raciocínio
Casos de teste
Erros encontrados
```

Não precisa criar estrutura exagerada. Se for um exercício pequeno, um arquivo `.java` com comentários mínimos já basta.

## Git durante estudos

Para treinar fluxo profissional:

```bash
git switch main
git pull
git switch -c resolucao/ex01-operacoes-basicas
```

Depois:

```bash
javac Ex01OperacoesBasicas.java
java Ex01OperacoesBasicas
git add .
git commit -m "study(ex01): resolve operacoes basicas"
git push -u origin resolucao/ex01-operacoes-basicas
```

Abra um pull request para a `main`.

## Quando abrir PR

Abra PR quando:

* resolveu um exercício;
* adicionou uma anotação relevante;
* finalizou um bloco de estudo;
* concluiu uma revisão semanal.

Evite misturar assuntos sem relação.

## Checklist de final de sessão

Antes de encerrar:

* O código compila?
* O programa executa?
* Testei pelo menos 3 entradas?
* Sei explicar minha solução?
* Registrei erro importante?
* Sei qual é o próximo exercício?

