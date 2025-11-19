import java.util.List;

public class Desafio10 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void agruparValoresMultiplosImpares(){
        numeros.stream().filter(n1 -> n1 % 2 == 1 && (n1 % 3 == 0 || n1 % 5 == 0)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        agruparValoresMultiplosImpares();
    }
}
