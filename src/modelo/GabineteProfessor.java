package modelo;

import java.util.LinkedList;

public class GabineteProfessor extends Divisao{
    private LinkedList<Professor> professores;

    public GabineteProfessor(String nome, boolean portaAberta) {
        super(nome, portaAberta);
        professores = new LinkedList<>();
    }

    public LinkedList<Professor> getProfessores(){
        return new LinkedList<>(professores);
    }

    public LinkedList<Professor> getProfessores(Horario horario){
        return null;
    }

    public void remover(Professor professor){
        if (!professores.contains(professor)){
            return;
        }
        professores.remove(professor);
        professor.desassociarGabinete();
    }

    public void adicionar(Professor professor){
        if (professor == null || professores.contains(professor)){
            return;
        }
        professores.add(professor);
        professor.setGabinete(this);
    }

}
