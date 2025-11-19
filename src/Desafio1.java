import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Desafio1 {
    private static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    /*public static void numerosAsc(){
        numeros.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return Integer.compare(n1, n2);
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }*/

    /*public static void numerosAsc(){
        numeros.stream().sorted((n1, n2) -> Integer.compare(n1, n2)).forEach(integer -> System.out.println(integer));
    }*/

    public static void numerosAsc(){
        numeros.stream().sorted(Integer::compare).forEach(System.out::println);
    }

    public static void main(String[] args) {
        numerosAsc();
    }
}
