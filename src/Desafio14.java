import java.util.List;
import java.util.stream.IntStream;

public class Desafio14 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void encontrarMaiorNumeroPrimo(){
        System.out.println(numeros.stream().filter(n -> n > 1 &&
                IntStream.range(2, (int) (Math.sqrt(n) + 1)).noneMatch(nr -> n % nr == 0))
                    .max(Integer::compare).orElse(0));
    }

    public static void main(String[] args) {
        encontrarMaiorNumeroPrimo();
    }
}
