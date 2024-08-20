import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Bem-vindo(a) ao Banco do brasil!!!");
            System.out.println("Por favor, digite seu nome!");
            nomeCliente = sc.nextLine();
            System.out.println("Por favor, digite o número da Agência!");
            agencia = sc.nextLine();
            System.out.println("Por favor, digite o número da conta!");
            numeroConta = sc.nextInt();
            System.out.println("Por favor, Informe o saldo que deseja sacar");
            saldo = sc.nextDouble();
        }

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
