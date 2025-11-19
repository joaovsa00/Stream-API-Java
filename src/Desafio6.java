import java.util.List;

public class Desafio6 {
    private static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void verificarMaiorQueDez(){
        boolean possuiMaiorQueDez = numeros.stream().anyMatch(n -> n > 10);

        System.out.println(possuiMaiorQueDez ? "Possui número maior que 10" : "Não Possui número maior que 10");
    }

    public static void main(String[] args) {
        verificarMaiorQueDez();
    }
}
