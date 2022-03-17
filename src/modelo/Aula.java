package modelo;

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
        this.alunos = new LinkedList<>();
    }

    //metodos
    //acessores
    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getSumario() {
        return sumario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {

        if(professor == null || this.professor == professor){
            return;
        }

        // se a aula já tinha professor desassocia o professor da aula
        if(this.professor != null){
            this.professor.remover(this);
        }
        // ou desassociarProfessor()

        //atribuir professor
        this.professor = professor;
        //adicionar a aula ao professor
        professor.adicionar(this);
    }

    public void desassociarProfessor(){
        if(professor == null){
            return;
        }
        /*
        this.professor.remover(this);
        professor = null;
        */
        Professor professorARemover = this.professor;
        this.professor = null;
        professorARemover.remover(this);
    }

    public LinkedList<Aluno> getAlunos() {
        // return alunos;
        return new LinkedList<>(alunos); //faz copia de segurança para não conseguirem manipular todos os alunos
    }

    public void remover(Aluno aluno){

    }

    //funcionalidades
    public void atribuir(Professor professor){

    }

    public void adicionar(Aluno aluno){

    }

    public void adicionarLinhaSumario(String linha){

    }
}
