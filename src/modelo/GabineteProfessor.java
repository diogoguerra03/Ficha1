package modelo;

import java.util.LinkedList;

public class GabineteProfessor extends Divisao{
    private LinkedList<Professor> professores;

    public GabineteProfessor(String nome, boolean portaAberta) {
        super(nome, portaAberta);
    }

    public LinkedList<Professor> getProfessores(){
        return new LinkedList<>(professores);
    }

    public LinkedList<Professor> getProfessores(Horario horario){
        return null;
    }

    public void remover(Aula aula){

    }

    public void adicionar(Aula aula){

    }

}
