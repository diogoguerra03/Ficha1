package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa{
    private GabineteSeguranca gabinete;
    private LinkedList<Horario> horarioAtendimento;

    public Seguranca(String nome, long numero) {
        super(nome, numero);
        gabinete = null;
        horarioAtendimento = new LinkedList<>();
    }

    public GabineteSeguranca getGabinete() {
        return gabinete;
    }

    public void setGabinete(GabineteSeguranca gabinete) {
        this.gabinete = gabinete;
    }

    public void desassociarGabinete(){

    }

    public LinkedList<Horario> getHorarioAtendimento(){
        return new LinkedList<>(horarioAtendimento);
    }

    public void adicionar(Horario horario){

    }
    public void remover(Horario horario){

    }

    public void abrir(GabineteProfessor gabineteProfessor){

    }

    public void fechar(GabineteProfessor gabineteProfessor){

    }

    public void abrir(GabineteSeguranca gabineteSeguranca){

    }

    public void fechar(GabineteSeguranca gabineteSeguranca){

    }

    public void abrirGabinete(){

    }
    public void fecharGabinete() {

    }

    public void abrir(Sala sala){

    }

    public void fechar(Sala sala){

    }

}
