package br.com.kemoel.herdado.bytebank;

public class TestaContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(1290,899);
        cc.deposita(100.0);
        cc.saca(20);

        ContaPoupanca cp = new ContaPoupanca(1000, 201);
        cp.deposita(200.0);

        cp.transfere(10, cc);

        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupança: " + cp.getSaldo());

    }
}
