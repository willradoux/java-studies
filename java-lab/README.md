# Java Lab

Laboratório para praticar Java com estrutura de projeto real.

## Estrutura

```text
java-lab/
  pom.xml
  src/main/java/
  src/test/java/
```

## Sem Maven

Enquanto o Maven não estiver instalado, você pode compilar arquivos simples com `javac`:

```bash
javac -d out src/main/java/br/com/willradoux/javastudies/App.java
java -cp out br.com.willradoux.javastudies.App
```

## Com Maven

Depois que o Maven estiver instalado:

```bash
mvn test
```

## Bibliotecas preparadas

* JUnit 5 para testes.
* AssertJ para asserções mais legíveis.

Use este laboratório para exercícios que pedem teste automatizado ou mais de uma classe.
