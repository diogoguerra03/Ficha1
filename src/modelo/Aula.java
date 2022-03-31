package modelo;

import java.util.LinkedList;

public class Aula {
    //atributos
    private String nome;
    private long numero;
    private StringBuilder sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;
    private Horario horario;

    //construtor
    public Aula(String nome, long numero, Horario horario){
        this(nome, numero, null, null, new LinkedList<>());
        /*this.nome = nome;
        this.numero = numero;
        //this.sumario ="";
        this.sumario = new StringBuilder();
        this.professor = null;
        this.alunos = new LinkedList<>();
         */
    }

    public Aula(String nome, long numero, Horario horario, Professor professor, LinkedList<Aluno> alunos){
        this.nome = nome;
        this.numero = numero;
        this.horario = horario;
        this.sumario = new StringBuilder();
        //this.professor = professor;
        setProfessor(professor);
        //this.alunos = alunos;
        this.alunos = new LinkedList<>();
        for (Aluno aluno: alunos) {
            adicionar(aluno);
        }
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
        //return sumario;
        return sumario.toString();
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

    public Horario getHorario() {
        return horario;
    }

    //funcionalidades
    public void remover(Aluno aluno){
        if (!alunos.contains(aluno)){
            return;
        }
        alunos.remove(aluno);
        aluno.remover(this);
    }

    public void adicionar(Aluno aluno){
        if(aluno == null || alunos.contains(aluno)){
            return;
        }
        alunos.add(aluno);
        aluno.adicionar(this);
    }

    public void atribuir(Professor professor){

    }

    public void adicionarLinhaSumario(String linha){
        //sumario = sumario + linha + "\n";
       /* StringBuilder sb = new StringBuilder(sumario);
        sb.append(linha).append("\n");

        sumario = sb.toString();
        */
        sumario.append(linha).append("\n");
    }
}
