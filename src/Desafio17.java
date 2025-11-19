import java.util.List;
import java.util.stream.IntStream;

public class Desafio17 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void exibirNumerosPrimos(){
        numeros.stream().filter(n -> n > 1 &&
           IntStream.range(2, (int) (Math.sqrt(n) + 1)).noneMatch(nr -> n % nr == 0))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        exibirNumerosPrimos();
    }
}
