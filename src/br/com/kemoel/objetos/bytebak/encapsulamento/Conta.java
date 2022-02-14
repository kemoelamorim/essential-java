package br.com.kemoel.objetos.bytebak.encapsulamento;


public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    Conta (int numero, int agencia){
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Estou criando uma conta com o número: " + this.numero);
        System.out.println("Estou criando uma conta com a agência: " + this.agencia);
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    boolean transfere(double valor,Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
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
