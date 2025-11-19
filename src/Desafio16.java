import java.util.List;

public class Desafio16 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void exibirNumerosParesEImpares(){
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println();
        numeros.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
    }

    public static void main(String[] args) {
        exibirNumerosParesEImpares();
    }
}
