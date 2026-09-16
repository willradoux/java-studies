// Calcule a media de 3 notas e retorne o resultado
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Double> notas = new ArrayList<>();

            System.out.println("====== CALCULO DE 3 MEDIAS ======");

            for (int i = 0; i < 3; ++i) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                double nota = scanner.nextDouble();
                if (nota instanceof Double && nota <= 10 && nota > 0) {
                    notas.add(nota);
                } else {
                    System.out.println("Valor inválido, ");
                    i = i-1;
                }
            }
            CalculaMedia calculaMedia = new CalculaMedia();

            double media = calculaMedia.Executar(notas);

            System.out.println(media);
        } catch (Exception e) {
            System.out.println("Valor inválido, porque voce é viado.");
        }
    }
}
