// Calcule a media de 3 notas e retorne o resultado

public class Fluxo01 {
    public static double solution(
            double averange1,
            double averange2,
            double averange3) {

        double result = (averange1 + averange2 + averange3) / 3;

        return result;
    }

    public static void main(String[] args) {
        System.out.printf("%.2f%n", solution(4, 9, 4));
    }
}