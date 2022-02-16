package br.com.kemoel.herdado.bytebank;

public class TestaTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(121,887);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
