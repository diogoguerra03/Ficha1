package modelo;

import java.util.LinkedList;

public class Pessoa extends Identificador {
    //atributos
    protected LinkedList<Aula> aulas;

    public Pessoa(String nome, long numero) {
        super(nome, numero);
        this.aulas = new LinkedList<>();
    }

    public LinkedList<Aula> getAulas() {
        //return aulas
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        //criar uma nova lista auxiliar
        LinkedList<Aula> listAuxiliar = new LinkedList<>();

        for (Aula aula : this.aulas) {
            if (horario.isSobre(aula.getHorario())) {
                listAuxiliar.add(aula);
            }
        }
        //devolver uma lista de aulas
        return listAuxiliar;
    }

    public void adicionar(Aula aula) {
        if (aula == null || this.aulas.contains(aula)) {
            return;
        }
        //adicionar a aula à lista de aulas
        this.aulas.add(aula);
        //associar a pessoa à aula
        associar(aula);
    }

    public abstract void associar(Aula aula);
}
