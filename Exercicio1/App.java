import java.util.Scanner;
/*
 * Os alunos da disciplina de Programação Orientada a Objetos da FCT/Unesp desenvolverão
dois trabalhos e duas provas ao longo do semestre. Considere que, nesse caso, a média final é
calculada pela média aritmética simples de todas as notas e que o aluno é aprovado somente
se obtiver média maior ou igual a cinco.
O Aluno possui como informação o RA, Nome e as notas – a média é calculada a partir das
notas e não precisa ser armazenada.
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        //Informações do aluno
        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira o RA do aluno: ");
        int RA = scanner.nextInt();

        // criando o objeto aluno
        Aluno aluno = new Aluno(nome, RA);// PRESTAR ATENÇÃO NA ORDEM

        //Informações métricas do aluno
        System.out.println("Digite o valor da p1: ");
        double p1 = scanner.nextDouble();
        System.out.println("Digite o valor da p2: ");
        double p2 = scanner.nextDouble();
        System.out.println("Digite o valor do t1: ");
        double t1 = scanner.nextDouble();
        System.out.println("Digite o valor do t2: ");
        double t2 = scanner.nextDouble();

        // definindo as notas no objeto aluno
        aluno.setNotas(p1, p2, t1, t2);
        aluno.exibir();


        scanner.close();
    }
}