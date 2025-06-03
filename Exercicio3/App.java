package Exercicio3;
/*Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e
o saldo atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem
sacar somente enquanto a conta possuir saldo positivo. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        //Solicita e armazena os dados
        System.out.println("=== SISTEMA BANCÁRIO ===");
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Informe seu CPF: ");
        int cpf = scanner.nextInt();
        System.out.println("Informe o numero da sua conta: ");
        int num_conta = scanner.nextInt();
        System.out.println("Informe o saldo inicial da conta: ");
        double saldo_inicial = scanner.nextDouble();

        // Cria um objeto cliente e passa o nome/cpf para o construtur
        //usa o método setdados()para definir o número a conta e saldo
        Cliente cliente = new Cliente(nome, cpf);
        cliente.setDados(num_conta, saldo_inicial);

        // Menu principal
        //declara a variável opcao para armazenar a escolha do usuario
        //exibe o menu de opç~oes atraves do-while e captura a escolha
        int opcao = 0;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Ver informações da conta");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            //chama o método depositar
            //chama o método sacar
            //Exibe o saldo usando getSaldo()

            switch (opcao) {
                case 1:
                    System.out.println("\n--- DEPÓSITO ---");
                    cliente.depositar();
                    break;
                case 2:
                    System.out.println("\n--- SAQUE ---");
                    cliente.sacar();
                    break;
                case 3:
                    System.out.println("\n--- CONSULTA SALDO ---");
                    System.out.println("Saldo atual: R$ " + String.format("%.2f", cliente.getSaldo()));
                    break;
                case 4: 
                    System.out.println("Obrigado por usar nosso sistema bancário!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        // loop continua ate o usuario digitar 5
        } while (opcao != 5);

        //chama exibir para mostrar os dados finais e fecha o scanner
        cliente.exibir();

        scanner.close();
    }

    }

