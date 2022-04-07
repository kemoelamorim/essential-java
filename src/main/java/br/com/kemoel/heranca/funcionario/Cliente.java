package br.com.kemoel.heranca.funcionario;

public class Cliente implements Autenticavel{

    private Autenticador autenticacaoUtil;

    public Cliente(){
        this.autenticacaoUtil = new Autenticador();
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
