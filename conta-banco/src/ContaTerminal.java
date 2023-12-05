import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("-------------CONTA BANCÁRIA-------------");
        System.out.println();

        System.out.println("Por favor, digite o número da conta: (ex. 0123)");
        numero = sc.nextInt();

        System.out.println("Digite o número da Agência: (ex. 123-1)");
        agencia = sc.next();

        System.out.println("Me informe qual o seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Me informe seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, Agradecemos por criar uma conta em " + "nosso banco, sua agência é %s, " + "conta %d e seu saldo %.2f já está disponível" + " para saque, por favor informe:", numero, agencia, nomeCliente, saldo);

        sc.close();

    }
}
