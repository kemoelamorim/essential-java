package br.com.kemoel.heranca.funcionario;

public class Gerente extends Funcionario implements Autenticavel{

    private Autenticador autenticacaoUtil;

    public Gerente() {
        Autenticador autenticacaoUtil = new Autenticador();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticacaoUtil.autentica(senha);
    }

    public double getBonificacao() {
        return super.getSalario();
    }
}
