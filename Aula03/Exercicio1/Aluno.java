/*Os alunos da disciplina de Programação Orientada a Objetos da FCT/Unesp desenvolverão
dois trabalhos e duas provas ao longo do semestre. Considere que, nesse caso, a média final é
calculada pela média aritmética simples de todas as notas e que o aluno é aprovado somente
se obtiver média maior ou igual a cinco.
O Aluno possui como informação o RA, Nome e as notas – a média é calculada a partir das
notas e não precisa ser armazenada. */
public class Aluno {

    private String nome;
    private int RA;
    private double p1;
    private double p2;
    private double t1;
    private double t2;

    public Aluno(String nome, int RA){
        this.nome = nome;
        this.RA = RA;
    }

    public void setNotas(double p1, double p2, double t1, double t2){
        this.p1 = p1;
        this.p2 = p2;
        this.t1 = t1;
        this.t2 = t2;
    }

public double media(){
    return (p1+p2+t1+t2)/4;
}

public boolean aprovacao(){
    if (media()>=5) {
        return true;
    }
    return false;
}

public int getRA(){
    return RA;
}

public void setRA (int RA){
    this.RA = RA;
}

public String getnome(){
    return nome;
}

public void setnome (String nome){
    this.nome = nome;
}

public double getp1(){
    return p1;
}

public void setp1(double p1){
    this.p1 = p1;
}

public double getp2(){
    return p2;
}

public void setp2(double p2){
    this.p2 = p2;
}

public double gett1(){
    return t1;
}

public void sett1(double t1){
    this.t1 = t1;
}

public double gett2(){
    return t2;
}

public void sett2(double t2){
    this.t2 = t2;
}


public void exibir() {
    System.out.println("Nome: " + nome);
    System.out.println("RA: " + RA);
    System.out.println("Media: " + media());
    System.out.println("Aprovado: " + aprovacao());
}



}
