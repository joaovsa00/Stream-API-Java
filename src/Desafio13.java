import java.util.List;

public class Desafio13 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void exibirNumerosNoIntervalo(){
        numeros.stream().filter(n -> n > 4 && n < 11).forEach(System.out::println);
    }

    public static void main(String[] args) {
        exibirNumerosNoIntervalo();
    }
}
