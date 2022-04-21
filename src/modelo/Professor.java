package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Professor extends Pessoa {

    //construtor(es)
    public Professor(String nome, long numero){
        //this.nome = nome;
        //this.numero = numero;
        super(nome,numero);
    }

    //funcionalidades
    @Override
    public void associar(Aula aula) {
        aula.setProfessor(this);
    }

    @Override
    protected void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }

    @Override
    protected void escreverSumario(Aula aula) {
        //adicionar o nome da aula
        aula.adicionarLinhaSumario(aula.getNome());
        //adicionar o numero da aula
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        //assinar com o nome do professor
        //aula.adicionarLinhaSumario(nome);
        //super.assinarSumario(Aula);
        assinarSumario(aula);
        //dar aos alunos a preencher o sumario
        //percorrer a lsta de alunos da aula
        for (Aluno aluno : aula.getAlunos()){
            aluno.preencherSumario(aula);
        }
    }
}
