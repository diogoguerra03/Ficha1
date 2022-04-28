package modelo;

import java.util.LinkedList;

public abstract class PessoaComAulas extends Pessoa {
    //atributos
    protected LinkedList<Aula> aulas;

    public PessoaComAulas(String nome, long numero) {
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

    protected void assinarSumario(Aula aula) {
        aula.adicionarLinhaSumario(nome);
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

    protected abstract void associar(Aula aula);
    protected abstract void desassociar(Aula aula);
    protected abstract void escreverSumario(Aula aula);

    public void remover(Aula aula) {
        if (!this.aulas.contains(aula)) {
            return;
        }
        //remover a aula da lista
        this.aulas.remove(aula);
        //desassociar a pessoa da aula
        desassociar(aula);
    }

    public void preencherSumario(Aula aula) {
        if (!aulas.contains(aula)) {
            return;
        }
        //escrever o seu sumário
        escreverSumario(aula);
    }

}
