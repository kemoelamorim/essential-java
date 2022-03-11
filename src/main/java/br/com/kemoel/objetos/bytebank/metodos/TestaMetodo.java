package br.com.kemoel.objetos.bytebank.metodos;

public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaDoKemoel = new Conta();
        contaDoKemoel.saldo = 100;
        System.out.println("Saldo inicial: " + contaDoKemoel.saldo);
        contaDoKemoel.deposita(50);
        System.out.println("Saldo depois do depósito: " + contaDoKemoel.saldo);
        boolean conseguiuSacar = contaDoKemoel.saca(20);
        System.out.println("Conseguiu sacar: " + conseguiuSacar);
        System.out.println("Saldo depois do saque: " + contaDoKemoel.saldo);

        Conta contaDaThamiris = new Conta();
        contaDaThamiris.deposita(1000);
        boolean resultadoTranferencia = contaDaThamiris.transfere(1000, contaDoKemoel);
        if (resultadoTranferencia){
            System.out.println("Transferencia realizada com sucesso!");
        }else {
            System.out.println("Não foi possivel concluir a transferência!");
        }
        System.out.println(contaDoKemoel.saldo);
    }
}
