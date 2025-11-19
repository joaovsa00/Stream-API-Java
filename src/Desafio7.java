import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static void encontrarSegundoNumeroMaior(){
        int maiorNumero = numeros.stream().max(Integer::compare).orElse(0);

        int segundoMaiorNumero = numeros.stream().filter(n -> n < maiorNumero).max(Integer::compare).orElse(0);

        System.out.printf("O segundo maior número é %s", segundoMaiorNumero);
        System.out.println();

        //Versão ChatGPT:

        Optional<Integer> segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder())  // Ordena em ordem decrescente
                .distinct()  // Remove duplicatas (caso exista o maior número repetido)
                .skip(1)     // Pula o primeiro (o maior número)
                .findFirst(); // Pega o primeiro elemento após o skip (segundo maior)

        segundoMaior.ifPresentOrElse(
                valor -> System.out.println("Segundo maior número: " + valor),
                () -> System.out.println("Não há segundo maior número"));
    }

    public static void main(String[] args) {
        encontrarSegundoNumeroMaior();
    }
}
