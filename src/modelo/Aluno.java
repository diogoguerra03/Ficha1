package modelo;

import java.util.LinkedList;

public class Aluno {
    //Atributos
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    //construtor
    public Aluno(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    //Metodos
    public void adicionar(Aula aula){
        if (aula == null || this.aulas.contains(aula)){
            return;
        }
        //adicionar a aula à lista de aulas
        this.aulas.add(aula);
        //adicionar aluno
        aula.adicionar(this);
    }

    public void remover(Aula aula){
        if (!this.aulas.contains(aula)){
            return;
        }
        //remover a aula da lista
        this.aulas.remove(aula);
        //remover aluno da aula
        aula.remover(this);
    }

    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void preencherSumario(Aula aula){

    }
}
