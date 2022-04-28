package modelo;

import java.util.LinkedList;

public class Sala extends Divisao {
    private LinkedList<Aula> aulas;

    public Sala(String nome) {
        super(nome);
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario){
        return null;
    }

    public void remover(Aula aula){

    }
}
