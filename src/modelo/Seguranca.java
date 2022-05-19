package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa implements Funcionario {
    private GabineteSeguranca gabinete;
    private GestorFuncionario gestorFuncionario;

    public Seguranca(String nome, long numero, GabineteSeguranca gabinete) {
        super(nome, numero);
        //this.gabinete = gabinete;
        setGabinete(gabinete);
        gestorFuncionario = new GestorFuncionario();
    }

    public GabineteSeguranca getGabinete() {
        return gabinete;
    }

    public void setGabinete(GabineteSeguranca gabinete) {
        if(gabinete == null || this.gabinete == gabinete){
            return;
        }
        //ver se o segurança já tinha gabinete
        if (this.gabinete != null){
            this.gabinete.remover(this);
        }

        this.gabinete = gabinete;
        gabinete.adicionar(this);
    }

    @Override
    public void desassociarGabinete(){
        if (gabinete == null){
            return;
        }
        //gabinete.remover(this);
        //gabinete = null;
        GabineteSeguranca gabineteAremover = gabinete;
        gabinete = null;
        gabineteAremover.remover(this);
    }

    @Override
    public LinkedList<Horario> getHorariosAtendimento(){
        return gestorFuncionario.getHorariosAtendimento();
    }

    @Override
    public void adicionar(Horario horario){
        gestorFuncionario.adicionar(horario);
    }
    @Override
    public void remover(Horario horario){
        gestorFuncionario.remover(horario);
    }

    public void abrir(Divisao divisao){
        if (divisao == null || divisao.isPortaAberta()){
            return;
        }

        divisao.abrir();
    }

    public void fechar(Divisao divisao){
        if(divisao == null || !divisao.isPortaAberta()){
            return;
        }
        divisao.fechar();
    }

    @Override
    public void abrirGabinete(){
        if(gabinete == null || !gabinete.isPortaAberta()){
            return;
        }
        gabinete.abrir();
    }
    @Override
    public void fecharGabinete() {
        if(gabinete == null || !gabinete.isPortaAberta()){
            return;
        }
        gabinete.fechar();
    }

}
