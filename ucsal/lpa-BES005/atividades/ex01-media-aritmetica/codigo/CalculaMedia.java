import java.util.List;

public class CalculaMedia {
    public static double executar(List<Double> notas) {
        if (notas == null || notas.size() != 3) {
            throw new IllegalArgumentException("Informe exatamente 3 notas.");
        }

        return (notas.get(0) + notas.get(1) + notas.get(2)) / 3;
    }
}
