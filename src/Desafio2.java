import java.util.List;

public class Desafio2 {
    private static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    /*public static void somaNumerosPares(){
        int somaNumeros = numeros.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        }).mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer n) {
                return n;
            }
        }).sum();

        System.out.println(somaNumeros);
    }*/

    public static void somaNumerosPares(){
        //int somaNumeros = numeros.stream().filter(n -> n % 2 == 0).
        //        mapToInt(n -> n).sum();
        int somaNumeros = numeros.stream().filter(n -> n % 2 == 0).
                mapToInt(Integer::intValue).sum();

        System.out.println(somaNumeros);
    }

    public static void main(String[] args) {
        somaNumerosPares();
    }
}
