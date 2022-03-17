import modelo.Aluno;
import modelo.Aula;
import modelo.Professor;

public class Main {

    public Main(){
        //criar instancias
        //Professores
        Professor professor1 =
                new Professor("Sonia Luz", 1);
        Professor professor2 =
                new Professor("Carlos Urbano", 2);

        //modelo.Aula
        Aula aula1 =
                new Aula("Programação 2 PL5", 1);
        Aula aula2 =
                new Aula("Programação 2 TP3", 1);

        //Alunos
        Aluno aluno1 =
                new Aluno("Adriano Gomes",2211030);
        Aluno aluno2 =
                new Aluno("Bárbara Silva", 2210903);
    }

    public static void main(String[] args) {
        new Main();
    }
}
