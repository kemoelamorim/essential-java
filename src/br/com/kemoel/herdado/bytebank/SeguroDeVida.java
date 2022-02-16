package br.com.kemoel.herdado.bytebank;

public class SeguroDeVida implements Tributavel{

    @Override
    public double getValorImposto() {
        return 42;
    }
}
