import java.util.LinkedList;

public class Aula {
    //atributos
    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    //construtor
    public Aula(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.sumario ="";
        this.professor = null;
    }

    //metodos
    public void atribuir(Professor professor){

    }

    public void adicionar(Aluno aluno){

    }

    public void adicionarLinhaSumario(String sumario){

    }
}
