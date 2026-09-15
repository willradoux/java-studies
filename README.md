# Java Studies

Repositório dedicado aos meus estudos e à minha evolução com Java.

O projeto começou durante minha graduação em Engenharia de Software na UCSAL, mas também reúne estudos independentes, exercícios, desafios e pequenos projetos para evoluir em Java de forma organizada.

## Objetivo

Construir uma base forte em programação, lógica, Java, POO, estruturas de dados e frameworks do ecossistema Java, registrando a evolução com clareza.

## Estrutura

```text
java-studies/
  docs/          guias de organização, rotina e padrões do repo
  trilhas/       ordem sugerida de estudos por tema
  exercicios/    bancos de exercícios sem resposta pronta
  java-lab/      laboratório Java com estrutura Maven/JUnit
  ucsal/         conteúdos da faculdade
  rascunhos/     testes soltos antes de virarem estudo organizado
```

## Caminho inicial

1. Rever lógica básica com os exercícios da UCSAL.
2. Estudar POO com bastante prática: classes, objetos, encapsulamento, composição, herança, polimorfismo e interfaces.
3. Entrar em estruturas de dados usando primeiro a biblioteca padrão do Java e depois implementações próprias.
4. Aprender testes com JUnit e AssertJ.
5. Avançar para frameworks: Maven, Spring Boot, APIs REST, JPA/Hibernate e validação.

## Onde estudar

* [Guia de estudo](docs/guia-de-estudo.md)
* [Organização do repositório](docs/organizacao-do-repositorio.md)
* [Trilha de POO](trilhas/01-poo.md)
* [Trilha de estruturas de dados](trilhas/02-estruturas-de-dados.md)
* [Trilha de frameworks Java](trilhas/03-frameworks-java.md)
* [Exercícios de POO](exercicios/poo.md)
* [Exercícios de estruturas de dados](exercicios/estruturas-de-dados.md)
* [Exercícios de frameworks Java](exercicios/frameworks-java.md)
* [Projetos práticos](exercicios/projetos-praticos.md)

## Java lab

A pasta `java-lab/` é o espaço para praticar Java com estrutura de projeto real.

Sem Maven instalado:

```bash
javac -d java-lab/out java-lab/src/main/java/br/com/willradoux/javastudies/App.java
java -cp java-lab/out br.com.willradoux.javastudies.App
```

Com Maven instalado:

```bash
cd java-lab
mvn test
```

## UCSAL

A pasta `ucsal/` concentra apenas conteúdos diretamente ligados à faculdade. O PDF da aula de fluxograma e os exercícios extraídos dele ficam dentro da disciplina `lpa-BES005`.

## Filosofia

Este repositório funciona como um registro contínuo da minha evolução em programação. Os códigos representam diferentes etapas do aprendizado e podem ser refatorados ou revisitados conforme meus conhecimentos avançarem.

O objetivo não é apenas guardar código pronto, mas acompanhar o processo: tentar, errar, corrigir, refatorar e explicar melhor depois.

## Commits

As mensagens de commit devem ser simples e descritivas:

```bash
study: practice conditional statements
study: solve LPA exercise 01
study: practice object composition
feat: add fibonacci challenge
fix: correct loop condition
docs: add data structures exercise bank
```
