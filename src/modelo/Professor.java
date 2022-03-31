package modelo;

import java.util.ArrayList;
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

    public LinkedList<Aula> getAulas() {
        //return aulas
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        //criar uma nova lista auxiliar
        LinkedList<Aula> listAuxiliar = new LinkedList<>();

        for (Aula aula : this.aulas){ //percorrer todas as aulas
            //para cada aula
            if(aula.getHorario().isSobre(horario)){

            }
                //comparar os horarios
                //se horarios sobrepostos
                    //adicionar à nova lista

        }
        //devolver uma lista de aulas
        return listAuxiliar;
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
        //se não tiver a aula na lista não posso preencher sumario
        if (!aulas.contains(aula)){
            return;
        }
        //adicionar o nome da aula
        aula.adicionarLinhaSumario(aula.getNome());
        //adicionar o numero da aula
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        //assinar com o nome do professor
        aula.adicionarLinhaSumario(nome);
        //dar aos alunos a preencher o sumario
        //percorrer a lsta de alunos da aula
        for (Aluno aluno : aula.getAlunos()){
            aluno.preencherSumario(aula);
        }
    }
}
