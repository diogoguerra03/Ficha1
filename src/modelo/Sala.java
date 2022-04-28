package modelo;

import java.util.LinkedList;

public class Sala extends Descritor{
    private boolean portaAberta;
    private LinkedList<Aula> aulas;

    public Sala(String nome) {
        super(nome);
    }

    public boolean isPortaAberta(){
        return portaAberta;
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario){
        return null;
    }

    public void abrir(){

    }

    public void fechar(){

    }

    public void remover(Aula aula){

    }
}
