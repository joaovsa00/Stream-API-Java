import java.util.List;

public class Desafio18 {
    public static List<Integer> numeros = ListaDeNumeros.NUMEROS;

    public static boolean isEquals(){
        return numeros.stream().distinct().count() <= 1;
    }

    public static void main(String[] args) {
        String isEquals = isEquals() ? "Todos os números são iguais" : "Nem todos os números são iguais";
        System.out.println(isEquals);
    }
}
