import java.util.ArrayList;

public class CalculaMedia {
    public static double Executar(ArrayList<Double> notas) {

        double resultado = (notas.get(0 ) + notas.get(1) + notas.get(2)) / 3;

        return resultado;
    }
}
