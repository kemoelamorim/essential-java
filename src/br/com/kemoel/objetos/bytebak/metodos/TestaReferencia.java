package br.com.kemoel.objetos.bytebak.metodos;

public class TestaReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
        Conta segundaConta = primeiraConta;

        System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
        segundaConta.saldo += 100;

        System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
        System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta");
        }else{
            System.out.println("Contas diferentes");
        }
        System.out.println("A referência da primeira conta é: " + primeiraConta);
        System.out.println("A refarência da segunda conta é: " + segundaConta);


    }
}
