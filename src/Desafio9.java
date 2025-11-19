import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio9 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static boolean hasRepeated() {
        //return numeros.size() != new HashSet<>(numeros).size();
        //return numeros.size() != numeros.stream().distinct().toList().size();
        return numeros.size() != numeros.stream().distinct().count();
    }

    public static void exibirRepetidos(){

        Map<Integer, Long> contagem = numeros.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        contagem.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filtra os números que aparecem mais de uma vez
                .forEach(entry -> System.out.println("Número repetido: " + entry.getKey()));
    }

    public static void main(String[] args) {
        System.out.println(hasRepeated() ? "Há números repetidos":"Não há números repetidos");
        exibirRepetidos();

        //Map<Integer, Long> contagem = numeros.stream()
        //        .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        //contagem.forEach((n1, n2) -> System.out.println(n1 +" - "+n2));
    }
}
