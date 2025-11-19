import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void agruparValoresMultiplosImpares(){
        //numeros.stream().filter(n1 -> n1 % 2 == 1 && (n1 % 3 == 0 || n1 % 5 == 0)).forEach(System.out::println);

        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numeros.stream()
                .collect(Collectors.groupingBy(i -> (i % 2 == 1 && i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }

    public static void main(String[] args) {
        agruparValoresMultiplosImpares();
    }
}
