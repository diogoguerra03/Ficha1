package modelo;

import java.util.LinkedList;

public class Professor extends PessoaComAulas implements Funcionario {
    private GabineteProfessor gabinete;
    private LinkedList<Horario> horariosAtendimento;

    //construtor(es)
    public Professor(String nome, long numero, GabineteProfessor gabinete){
        //this.nome = nome;
        //this.numero = numero;
        super(nome,numero);
        setGabinete(gabinete);
        horariosAtendimento = new LinkedList<>();
    }

    //funcionalidades
    @Override
    public void associar(Aula aula) {
        aula.setProfessor(this);
    }

    @Override
    public void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }

    @Override
    protected void escreverSumario(Aula aula) {
        //adicionar o nome da aula
        aula.adicionarLinhaSumario(aula.getNome());
        //adicionar o numero da aula
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        //assinar com o nome do professor
        //aula.adicionarLinhaSumario(nome);
        //super.assinarSumario(Aula);
        assinarSumario(aula);
        //dar aos alunos a preencher o sumario
        //percorrer a lsta de alunos da aula
        for (Aluno aluno : aula.getAlunos()){
            aluno.preencherSumario(aula);
        }
    }

    public GabineteProfessor getGabinete() {
        return gabinete;
    }

    public void setGabinete(GabineteProfessor gabinete) {
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
        GabineteProfessor gabineteAremover = gabinete;
        gabinete = null;
        gabineteAremover.remover(this);
    }

    @Override
    public LinkedList<Horario> getHorariosAtendimento() {
        return new LinkedList<>(horariosAtendimento);
    }

    public LinkedList<Horario> getHorarioAtendimento(){
        return new LinkedList<>(horariosAtendimento);
    }

    @Override
    public void adicionar(Horario horario){
        if(horario == null || horariosAtendimento.contains(horario)){
            return;
        }
        horariosAtendimento.add(horario);
    }

    @Override
    public void remover(Horario horario){
        horariosAtendimento.remove(horario);
    }

    public void abrir(Sala sala){
        if (sala == null || sala.isPortaAberta()){
            return;
        }

        sala.abrir();
    }

    public void fechar(Sala sala){
        if (sala == null || sala.isPortaAberta()){
            return;
        }

        sala.fechar();
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
