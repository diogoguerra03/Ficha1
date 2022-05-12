package modelo;

import java.util.LinkedList;

public class GestorFuncionario {
    private LinkedList<Horario> horariosAtendimento;

    public LinkedList<Horario> getHorariosAtendimento(){
        return new LinkedList<>(horariosAtendimento);
    }

    public void adicionar(Horario horario){
        if(horario == null || horariosAtendimento.contains(horario)){
            return;
        }
        horariosAtendimento.add(horario);
    }

    public void remover(Horario horario){
        horariosAtendimento.remove(horario);
    }
}
