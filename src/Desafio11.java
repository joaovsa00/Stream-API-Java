import java.util.List;

public class Desafio11 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void somarQuadradosNumeros(){
        //System.out.println(numeros.stream().mapToInt(n -> (int) Math.pow(n, 2)).sum());

        System.out.println(numeros.stream().reduce((n1, n2) -> (int) (n1 + Math.pow(n2, 2))).orElse(0));
    }

    public static void main(String[] args) {
        somarQuadradosNumeros();
    }
}
