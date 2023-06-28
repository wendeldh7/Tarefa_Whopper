import java.util.Scanner;

public class Tarefa {
    /**
     *  Classe Scanner para ler a entrada do usuário a partir do console. Primeiro, solicitamos ao usuário que digite um valor numérico. Em seguida, usamos o método nextInt() para ler um valor inteiro da entrada.
     *
     * Em seguida, fazemos a conversão do valor inteiro para Double usando a classe Double. Isso é conhecido como "boxing" e é usado para converter um tipo primitivo em um objeto do tipo wrapper.
     *
     * Por fim, imprimimos o valor convertido para Double no console usando System.out.println().
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor numérico: ");
        int valorInteiro = scanner.nextInt();

        Double valorDouble = Double.valueOf(valorInteiro);

        System.out.println("Valor convertido para Double: " + valorDouble);
    }
}