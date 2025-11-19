import java.util.ArrayList;
import java.util.List;

public class Desafio4 {

    private static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void removerNumerosImpares(){
        /*numeros.removeIf(n -> n % 2 == 1);
        numeros.forEach(System.out::println);*/

        List<Integer> numerosPares = new ArrayList<>(numeros.stream().filter(n -> n % 2 == 0).toList());

        numerosPares.forEach(System.out::println);
    }

    public static void main(String[] args) {
        removerNumerosImpares();
    }
}
