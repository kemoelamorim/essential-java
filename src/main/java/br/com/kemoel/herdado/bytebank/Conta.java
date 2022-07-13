package br.com.kemoel.herdado.bytebank;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    Conta (int numero, int agencia){
        Conta.total++;
        this.numero = numero;
        this.agencia = agencia;
    }

    public abstract void deposita(double valor);

    void saca(double valor){
        if (this.saldo < valor){
        	throw new SaldoInsuficienteException("Saldo: " + this.saldo + ",Valor: " + valor + ". Saldo Insuficiente");
        }
        this.saldo -= valor;
    }

    void transfere(double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);
           
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não é permitido agencia com número menor ou igual a 0!");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Não é permitido numero de conta menor ou igual a 0!");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}
