package modelo;

import java.util.LinkedList;

public interface Funcionario {
    void desassociarGabinete();

    LinkedList<Horario> getHorariosAtendimento();

    void adicionar(Horario horario);

    void remover(Horario horario);

    void abrirGabinete();

    void fecharGabinete();
}
