 package Exercicio2;

import java.util.Scanner;

/*Uma academia mantem registro de seus alunos armazenando nome, idade, peso e altura. A
academia faz um desconto especial para menores de idade, portanto, é necessário saber
distinguir entre um aluno maior e menor. Além disso, a academia também tem interesse em
acompanhar o desempenho de seus alunos, por isso, ela também necessita conhecer o índice
de massa corporal (IMC) deles, sendo que o IMC = peso / altura ^ 2. */
public class App {

    public static void main(String[] args) {
        /* OUTRA FORMA DE SE FAZER
         * Aluno aluno1 = new Aluno("Pedro", 19);
        aluno1.setAltura(1.70);
        aluno1.setPeso(75);
        aluno1.exibir();
         */

        Scanner scanner = new Scanner(System.in);

        //Dados do aluno
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        //criando o obejto alunoPedro
        
        Aluno aluno = new Aluno(nome, idade);

        //infos métricas
        System.out.println("Informe o peso do aluno: ");
        double peso = scanner.nextDouble();
        System.out.println("Informe a altura do aluno: ");
        double altura = scanner.nextDouble();

        //definindo as caracteristicas do opbjeto
        aluno.setMetricas(peso, altura);

        aluno.imc();

        aluno.exibir();

        scanner.close();
    }
    
}