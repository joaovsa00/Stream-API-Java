import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio8 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void somaNumeros(){
        //int soma = numeros.stream().mapToInt(n -> n).sum();

        int soma = numeros.stream().reduce(Integer::sum).orElse(0);

        System.out.println("A soma dos número da lista é: "+soma);
    }

    public static void main(String[] args) {
        somaNumeros();
    }
}
