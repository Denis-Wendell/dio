import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe a sua agência:");
        String agencia = scanner.next();

        System.out.println("Informe seu número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Informe seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agênica é " + agencia + ", conta " + conta + " e seu saldo é de R$" + saldo + " já está disponível para saque." );



    }
}