package modelo;

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
    //acessores
    public String getNome(){
        return nome;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    //funcionalidades
    public void adicionar(Aula aula){
        if (aula == null || this.aulas.contains(aula)){
            return;
        }
        //adicionar a aula à lista de aulas
        this.aulas.add(aula);
        //atribuir o professor à aula
        aula.setProfessor(this);
    }

    public void remover(Aula aula){
        if (/*aula == null ||*/ !this.aulas.contains(aula)){
            return;
        }
        //remover a aula da lista
        this.aulas.remove(aula);
        //desassociar o professor da aula
        aula.desassociarProfessor();
    }

    public void preencherSumario(Aula aula){

    }
}
