import java.util.List;

public class Desafio3 {
    private static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static boolean isNumerosPositivos(){
        return numeros.stream().allMatch(n -> n > 0);
    }

    public static void main(String[] args) {
        boolean positivos = isNumerosPositivos();

        if (positivos) {
            System.out.println("Todos os números são positivos");
        }else{
            System.out.println("Nem todos os números são positivos");
        }
    }
}
