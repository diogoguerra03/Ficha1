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

    }

    public void preencherSumario(Aula aula){

    }
}
