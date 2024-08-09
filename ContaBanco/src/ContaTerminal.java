package src;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Olá! Por favor, me diga o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();
        
        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta  %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
        System.out.println(); 
    }
}
