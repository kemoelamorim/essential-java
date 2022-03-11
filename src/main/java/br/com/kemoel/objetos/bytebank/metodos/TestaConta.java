package br.com.kemoel.objetos.bytebank.metodos;

public class TestaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1200.90;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        segundaConta.saldo += 100;

        System.out.println(segundaConta.saldo);

        System.out.println("O saldo da primeria conta é: " + primeiraConta.saldo);
        System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta");
        }else{
            System.out.println("Contas diferentes");
        }
        System.out.println("A referência da primeira conta é: " + primeiraConta);
        System.out.println("A refarência da segunda conta é: " + segundaConta);

    }
}
