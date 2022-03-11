package br.com.kemoel.sintaxe;

public class TestaSomatoria {
    private static int total;

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        while(contador <= 10){
            total += contador;
            contador++;
        }
        System.out.println(total);
    }
}
