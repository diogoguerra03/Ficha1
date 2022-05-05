package modelo;

import java.util.LinkedList;

public class Sala extends Divisao implements RepositorioAulas{
    private LinkedList<Aula> aulas;

    public Sala(String nome, boolean portaAberta) {
        super(nome, portaAberta);
        aulas = new LinkedList<Aula>();
    }

    @Override
    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    @Override
    public LinkedList<Aula> getAulas(Horario horario){
        LinkedList<Aula> aulasAux = new LinkedList<>();
        for (Aula aula: aulas) {
            if (aula.getHorario().isSobre(horario)){
                aulasAux.add(aula);
            }
        }
        return aulasAux;
    }

    @Override
    public void adicionar(Aula aula){
        if(aula == null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
        aula.setSala(this);
    }

    @Override
    public void remover(Aula aula){
        if (!aulas.contains(aula)){
            return;
        }
        aulas.remove(aula);
        aula.desassociarSala();
    }
}
