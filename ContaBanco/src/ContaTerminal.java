
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM VINDOS AO BANCO DO NORDESTE DESEJA CRIAR CONTA? SIM OU NAO: ");
        String decisao = scanner.nextLine();
        if (decisao.equalsIgnoreCase("NAO")) {
            System.out.println("Obrigado por acessar nosso sistema. Tenha um ótimo dia!");
            scanner.close();
            return;
        } else if (!decisao.equalsIgnoreCase("SIM")) {
            System.out.println("Opção inválida. Por favor, reinicie o programa e escolha SIM ou NAO.");
            scanner.close();
            return;
        } else {
            System.out.println("Ótimo! Vamos começar o processo de criação da sua conta.");
        }
        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia
                + ", conta " + conta + " e seu saldo inicial é R$" + saldo + ".");

        scanner.close();
    }
}