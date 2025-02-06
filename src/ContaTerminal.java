import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        Double saldo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo ao sistema de conta do banco!!");
        System.out.println("--------------------------------------------------");
        System.out.println("Vamos começar!");
        
        System.out.println("Por favor, qual é o seu nome?");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência ! (ex.: 090-07)");
        agencia = scanner.nextLine();
        System.out.println("Digite o número da conta ! (ex.: 222 - somente números)");
        numero = scanner.nextInt();
        System.out.println("Digite o saldo! (ex.: 3007.97 - use ponto e não vírgula )");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
