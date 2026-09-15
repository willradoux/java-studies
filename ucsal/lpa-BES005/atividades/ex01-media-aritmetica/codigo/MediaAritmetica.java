import java.util.List;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== CALCULO DA MEDIA ARITMETICA ======");

        double nota1 = lerNota(scanner, 1);
        double nota2 = lerNota(scanner, 2);
        double nota3 = lerNota(scanner, 3);

        double media = CalculaMedia.executar(List.of(nota1, nota2, nota3));

        System.out.printf("Media final: %.2f%n", media);
        scanner.close();
    }

    private static double lerNota(Scanner scanner, int numeroDaNota) {
        while (true) {
            System.out.print("Digite a nota " + numeroDaNota + ": ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Valor invalido. Digite um numero entre 0 e 10.");
                scanner.next();
                continue;
            }

            double nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                return nota;
            }

            System.out.println("Nota invalida. Digite um valor entre 0 e 10.");
        }
    }
}
