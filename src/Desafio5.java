import java.util.List;

public class Desafio5 {
    private static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void mediaNumerosMaioresQueCinto(){
        System.out.println(numeros.stream().filter(n -> n > 5).mapToInt(n -> n).average().orElse(0));
    }

    public static void main(String[] args) {
        mediaNumerosMaioresQueCinto();
    }
}
