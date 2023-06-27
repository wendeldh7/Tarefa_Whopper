import java.util.Scanner;

public class Tarefa {
    /**
     *  Classe Scanner para ler a entrada do usuário a partir do console. Primeiro, solicitamos ao usuário que digite um valor numérico. Em seguida, usamos o método nextInt() para ler um valor inteiro da entrada.
     *
     * Em seguida, fazemos a conversão do valor inteiro para double usando (double) valorInteiro. Isso é conhecido como "casting" e é usado para converter um tipo de dado em outro tipo compatível.
     *
     * Por fim, imprimimos o valor convertido para double no console usando System.out.println().
     * @param args
     */
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um valor numérico: ");
            int valorInteiro = scanner.nextInt();

            double valorDouble = (double) valorInteiro;

            System.out.println("Valor convertido para double: " + valorDouble);
    }
}