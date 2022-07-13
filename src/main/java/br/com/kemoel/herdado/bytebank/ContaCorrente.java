package br.com.kemoel.herdado.bytebank;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int numero, int agencia){
        super(numero, agencia);
    }

    @Override
    void saca(double valor) throws SaldoInsuficienteException {
        double novoValor = valor + 0.2;
        super.saca(novoValor);
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
