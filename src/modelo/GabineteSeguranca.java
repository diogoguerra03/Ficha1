package modelo;

import java.util.LinkedList;

public class GabineteSeguranca extends Descritor{
    private boolean portaAberta;
    private LinkedList<Seguranca> segurancas;

    public GabineteSeguranca(String nome) {
        super(nome);
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public LinkedList<Seguranca> getSegurancas() {
        return new LinkedList<Seguranca>(segurancas);

    }

    public void abrir(){

    }

    public void fechar(){

    }

    public void adicionar(Seguranca segurancas){

    }

    public void remover(Seguranca segurancas){

    }
}
