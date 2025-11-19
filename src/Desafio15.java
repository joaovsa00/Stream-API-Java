import java.util.List;

public class Desafio15 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static boolean isNegativo(){
        return numeros.stream().anyMatch(n -> n < 0);
    }

    public static void main(String[] args) {
        System.out.printf("%s\n", isNegativo() ? "Contém número negativo" : "Não contém números negativos");
    }
}
