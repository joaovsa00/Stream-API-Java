import java.util.List;

public class Desafio19 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void somaNumerosDivisiveisPor3E5(){
        System.out.println(numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(Integer::sum).orElse(0));
    }

    public static void main(String[] args) {
        somaNumerosDivisiveisPor3E5();
    }
}
