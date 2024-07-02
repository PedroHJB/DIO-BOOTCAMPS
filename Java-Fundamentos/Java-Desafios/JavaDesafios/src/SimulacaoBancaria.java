import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite uma das opções");
            System.out.println("Um para Depositar");
            System.out.println("Dois para Sacar");
            System.out.println("Três exibir Saldo");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                     System.out.println("Digite o Valor a ser Depositado");
                     double desposito = scanner.nextDouble();
                     saldo += desposito;
                   
                      System.out.println("Saldo Atual: "+saldo);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                        System.out.println("Digite o Valor a ser SACADO");
                        double valorSerSacado = scanner.nextDouble();
                        if (saldo>=valorSerSacado) {
                            saldo -=valorSerSacado;
                            System.out.println("Valor exigido Sacado, Saldo Restante: "+ saldo);
                        }else{
                            System.out.println("valor Insuficiente Saldo: " + saldo + "   valor da tentativa do saque: "+valorSerSacado);
                        }
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                        System.out.println("Saldo Da Conta: "+saldo);
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }



}