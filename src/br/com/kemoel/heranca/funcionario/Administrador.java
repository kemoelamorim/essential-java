package br.com.kemoel.heranca.funcionario;

public class Administrador extends Funcionario implements Autenticavel{

    private Autenticador autenticacaoUtil;

    public Administrador() {
        Autenticador autenticacaoUtil = new Autenticador();
    }

    @Override
    public double getBonificacao(){
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticacaoUtil.autentica(senha);
    }
}
