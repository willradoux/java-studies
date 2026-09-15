# Exercícios de POO

Resolva sem procurar resposta pronta. Primeiro faça funcionar; depois refatore.

## Classes e objetos

1. Crie uma classe `Pessoa` com nome, idade e um método que apresente os dados.
2. Crie uma classe `Aluno` com nome, matrícula e curso.
3. Crie uma classe `Produto` com nome, preço e quantidade em estoque.
4. Crie uma classe `Livro` com título, autor e ano de publicação.
5. Crie uma classe `Carro` com modelo, marca, ano e velocidade atual.
6. Crie uma classe `ContaBancaria` com titular, número e saldo.
7. Crie uma classe `Retangulo` com largura e altura, calculando área e perímetro.
8. Crie uma classe `Circulo` com raio, calculando área e circunferência.
9. Crie uma classe `Funcionario` com nome, cargo e salário.
10. Crie uma classe `Filme` com título, duração e classificação indicativa.

## Encapsulamento e validação

11. Faça `Produto` impedir preço negativo.
12. Faça `Aluno` impedir matrícula vazia.
13. Faça `ContaBancaria` permitir saque apenas se houver saldo.
14. Faça `Carro` acelerar e frear sem permitir velocidade negativa.
15. Faça `Pessoa` impedir idade menor que zero.
16. Faça `Funcionario` aplicar aumento apenas se o percentual for positivo.
17. Faça `Livro` impedir ano maior que o ano atual.
18. Faça `Retangulo` impedir largura ou altura menor ou igual a zero.
19. Faça `Circulo` impedir raio menor ou igual a zero.
20. Faça uma classe `Senha` que valide tamanho mínimo e presença de número.

## Composição

21. Crie `Endereco` e use dentro de `Pessoa`.
22. Crie `Pedido` com uma lista de `ItemPedido`.
23. Crie `CarrinhoDeCompras` com vários produtos.
24. Crie `Turma` com professor e lista de alunos.
25. Crie `Biblioteca` com lista de livros.
26. Crie `Agenda` com lista de contatos.
27. Crie `Banco` com lista de contas.
28. Crie `Playlist` com lista de músicas.
29. Crie `Time` com lista de jogadores.
30. Crie `Boletim` com aluno e lista de notas.

## Herança e polimorfismo

31. Crie uma classe `Animal` e subclasses `Cachorro`, `Gato` e `Passaro`.
32. Crie `Funcionario` e subclasses `Desenvolvedor`, `Designer` e `Gerente`.
33. Crie `FormaGeometrica` com subclasses `Retangulo`, `Circulo` e `Triangulo`.
34. Crie `Conta` com subclasses `ContaCorrente` e `ContaPoupanca`.
35. Crie `Veiculo` com subclasses `Carro`, `Moto` e `Bicicleta`.
36. Crie uma lista de `FormaGeometrica` e calcule a área total.
37. Crie uma lista de `Funcionario` e calcule o pagamento total.
38. Crie um método que receba `Animal` e chame o comportamento específico.
39. Crie uma classe abstrata `Pagamento`.
40. Compare uma solução com herança e outra com composição.

## Interfaces

41. Crie a interface `Autenticavel` com método `autenticar`.
42. Crie a interface `Imprimivel` para relatórios.
43. Crie a interface `Calculavel` para formas geométricas.
44. Crie a interface `Notificavel` com e-mail e SMS.
45. Crie a interface `Persistivel` para salvar dados em memória.

## Enums, exceções e coleções

46. Crie enum `StatusPedido`.
47. Crie enum `NivelPrioridade`.
48. Lance exceção ao tentar sacar valor inválido.
49. Lance exceção ao cadastrar produto duplicado.
50. Use `ArrayList` para listar alunos aprovados.
51. Use `HashMap` para contar produtos por categoria.
52. Use `HashSet` para evitar e-mails repetidos.
53. Ordene uma lista de produtos por preço.
54. Ordene uma lista de alunos por nome.
55. Filtre funcionários com salário acima de um valor informado.

## Mini desafios de POO

56. Sistema de biblioteca com empréstimo e devolução.
57. Sistema de banco com contas, saques, depósitos e transferências.
58. Sistema de escola com alunos, turmas, disciplinas e notas.
59. Sistema de loja com produtos, carrinho e pedidos.
60. Sistema de tarefas com status, prioridade e prazo.
