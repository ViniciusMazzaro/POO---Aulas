package Exercicio3;

import java.util.Scanner;

/*Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e
o saldo atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem
sacar somente enquanto a conta possuir saldo positivo. */
public class Cliente {

    Scanner scanner = new Scanner(System.in);

    private String nome;
    private int cpf;
    private int num_conta;
    private double saldo;

    //construtor que recebe nome e cpf usa métodos setter para definir valores
    public Cliente(String nome, int cpf){
        setNome(nome);
        setCpf(cpf);
    }

    //método auxiliar para definir número da conta e saldo usa setter tmb
    public void setDados(int num_conta, double saldo){
        setNum_Conta(num_conta);
        setSaldo(saldo);
    }

    //método para modificar os valores dos atributos privados
    //recebem um parâmetro e atribuem ao atributo correspondente
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setNum_Conta(int num_conta){
        this.num_conta = num_conta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Métodos para acessar os valores doa atributos privados
    //retornam o valor do atributo correspondetntes
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getNum_Conta() {
        return num_conta;
    }

    public double getSaldo() {
        return saldo;
    }


    //
        public void depositar() {
 
   
        System.out.println("Você deseja depositar algum valor? ");
        System.out.println("Se sim, digite 1. Se não, digite 2");
        int opcao = scanner.nextInt();


        if (opcao == 1) {
        System.out.print("Digite o valor que deseja depositar: ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + this.saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
        } else {
        System.out.println("Depósito não realizado.");
        }
}
        //falta realizar o saque
        public void sacar(){
        if (saldo >= 1) {
            System.out.println("Voce pode sacar!!");
            return;
        }else{
            System.out.println("Não e possivel sacar ");
        }
        }

        //exibe as infos do cliente
        //usa métodos getter para acessar os dados
        public void exibir(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Número da conta: " + getNum_Conta());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", getSaldo()));
    }

    
}
