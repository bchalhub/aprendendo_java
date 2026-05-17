/*Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial. */

import java.util.Scanner;
public class contaBancariaMain {

    public final static Scanner scanner = new Scanner(System.in);       //criando o Scanner
    public static void main(String[] args){                             //criando o Main, ele inicia programa
    
    
    System.out.println("Informe o seu nome: ");                      //Pedindo dados do usuário
    var name = scanner.next();
        System.out.println("Informe sua saldo: ");
    var saldo = scanner.nextFloat();


    contaBancaria conta = new contaBancaria(name, saldo);               //criando objeto da classe contaBancaria

    var option = -1;
    do{
        System.out.println("===== Escolha uma opção =====");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Consultar Cheque Especial");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Sacar Dinheiro");
        System.out.println("5 - Pagar Boleto");
        System.out.println("6 - Verificar uso do Cheque Especial");
        System.out.println("0 - Sair");
        option = scanner.nextInt();

        switch (option) {
            case 1 -> conta.consultarSaldo();
            case 2 -> conta.consultarChequeEspecial();
            case 3 -> {
                System.out.println("Informe o valor do depósito: ");
                float valorDeposito = scanner.nextFloat();
                conta.depositar(valorDeposito);
                System.out.printf("Depósito realizado no valor de R$%.2f.\n", valorDeposito);
            }
            case 4 -> {
                System.out.println("Informe o valor que deseja sacar: ");
                float valorSaque = scanner.nextFloat();
                conta.saque(valorSaque);
            }
            case 5 -> {
                System.out.println("Informe o valor do boleto: ");
                float valorBoleto = scanner.nextFloat();
                conta.pagarBoleto(valorBoleto);
            }
            case 6 -> {
                if(conta.usandoChequeEspecial()){
                    System.out.println("Está usando o Cheque Especial.");
                }else {
                    System.out.println("Não está usando Cheque Especial.");
                }
            }
            case 0 -> System.out.println("Encerrando sistema...");
            default -> System.out.println("Opção Inválida.");
                   
        }
    
    }

        while(option != 0);

    }    
}
