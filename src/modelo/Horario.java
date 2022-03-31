package modelo;

public class Horario {
    //atributos
    private DiaSemana diaSemana;
    private int horaDeInicio;
    private int duracao;

    //construtor(es)
    public Horario(DiaSemana diaSemana, int horaDeInicio, int duracao){
        this.diaSemana = diaSemana;
        this.horaDeInicio = horaDeInicio;
        this.duracao = duracao;
    }

    //metodos
    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public int getHoraDeInicio() {
        return horaDeInicio;
    }

    public int getDuracao() {
        return duracao;
    }

}
