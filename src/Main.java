import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "Felipe";
        String tipoDaConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("Dados iniciais de cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da Conta: " + tipoDaConta);
        System.out.println("Saldo: " + saldo);

        System.out.println("""
                Operações
                
                1- Consultar Saldo
                2- Receber Valor
                3- Transferencia
                4- Sair
                """);
        while (opcao != 4){
            System.out.println("Digite a opção desejada: ");
            opcao = input.nextInt();


            if (opcao == 1) {
                System.out.println(saldo);
            }  else if (opcao == 2) {
                System.out.println("Quanto deseja receber: ");
                double receber = input.nextDouble();
                System.out.println(saldo = (saldo + receber));
            }  else if (opcao == 3) {
                System.out.println("Quanto deseja transferir: ");
                double transferir = input.nextDouble();
                if(transferir > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    System.out.println("Saldo atual " + (saldo - transferir));
                }
            } else if (opcao == 4) {
                System.out.println("Saindo");
            } else {
                System.out.println("Opção invalida");
            }
        }
        input.close();
    }
}