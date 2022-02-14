package br.com.kemoel.objetos.bytebak.composicao;

public class TestaReferencia {
    public static void main(String[] args) {
        Conta contaDoKemoel = new Conta();
        System.out.println(contaDoKemoel.saldo);
        contaDoKemoel.titular = new Cliente();
        contaDoKemoel.titular.nome = "Kemoel Miranda";
        System.out.println(contaDoKemoel.titular);
    }
}
