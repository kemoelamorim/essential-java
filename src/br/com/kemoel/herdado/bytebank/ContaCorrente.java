package br.com.kemoel.herdado.bytebank;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int numero, int agencia){
        super(numero, agencia);
    }

    @Override
    boolean saca(double valor) {
        double novoValor = valor + 0.2;
        return super.saca(novoValor);
    }
    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
