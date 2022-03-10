import java.util.LinkedList;

public class Professor {
    //atributos
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    //construtor(es)
    public Professor(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    //Métodos
    public void adicionar(Aula aula){

    }

    public void preencherSumario(Aula aula){

    }
}
