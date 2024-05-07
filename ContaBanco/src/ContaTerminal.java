import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu primeiro nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da agência");
        String agenciaCliente = scanner.next();

        System.out.println("Por favor, digite o número da sua conta");
        int numeroCliente = scanner.nextInt(); 

        System.out.println("Por favor, digite o seu saldo atual");
        float saldoCliente = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaCliente +", conta " + numeroCliente + " e seu saldo " + saldoCliente + " já está disponível para saque.");
    }
}
