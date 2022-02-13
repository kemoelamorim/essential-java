package br.com.kemoel.sintaxe;

public class TestaConversao {
    public static void main(String[] args){
        double salario = 1290.94;
        int valor = (int) salario; // Fazendo um casting, e perdendo decimal
        System.out.println(valor);

        double x = 0.2;
        double y = 0.1;
        double total = x + y;
        System.out.println(total);

        // Outros tipos
        long numeroGrande = 39498493487l;
        short valorPequeno = 23892;
        byte eHByte = 127;
        float pontoFlutuante = 3.23f;

        byte a = 127;
        char b = (char) a;

    }
}
