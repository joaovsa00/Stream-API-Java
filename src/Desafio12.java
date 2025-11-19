import java.util.List;

public class Desafio12 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void encontrarProdutosNumeros(){
        System.out.println(numeros.stream().reduce((n1, n2) -> n1 * n2).orElse(0));
    }

    public static void main(String[] args) {
        encontrarProdutosNumeros();
    }
}
