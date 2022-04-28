package modelo;

import java.util.LinkedList;

public class GabineteSeguranca extends Divisao{
    private LinkedList<Seguranca> segurancas;

    public GabineteSeguranca(String nome, boolean portaAberta) {
        super(nome, portaAberta);
    }

    public LinkedList<Seguranca> getSegurancas() {
        return new LinkedList<Seguranca>(segurancas);

    }

    public void adicionar(Seguranca segurancas){

    }

    public void remover(Seguranca segurancas){

    }
}
