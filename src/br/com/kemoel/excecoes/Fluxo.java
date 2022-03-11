package br.com.kemoel.excecoes;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Iniciano main");

        try{
            metodo1();
        }catch(NullPointerException | ArithmeticException ex){
            ex.printStackTrace(); // Imprime o rastro da pilha
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
        }
        System.out.println("Fim do método main");
    }

    private static void metodo1(){
        System.out.println("Iniciando método1");
        metodo2();
        System.out.println("Fim do método1");
    }

    private static void metodo2() {
        System.out.println("Iniciando médoto2");
        for (int i = 1; i < 5 ; i++){
            System.out.println(i);
            // NullTeste testa = null;
            // testa.testaNull();
            int a = i / 0;
        }
        System.out.println("Fim do método2");
    }
}
