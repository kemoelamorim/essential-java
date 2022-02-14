package br.com.kemoel.objetos.bytebak.encapsulamento;

public class TestaConstrutores {
    public static void main(String[] args) {
        Conta conta1 = new Conta(3117,101);
        Conta conta2 = new Conta(5992, 332);

        System.out.println("O número da conta 1: " + conta1.getNumero());
        System.out.println("O número da conta 2: " + conta2.getNumero());
        System.out.println("O total de contas: " + Conta.getTotal());
    }
}
