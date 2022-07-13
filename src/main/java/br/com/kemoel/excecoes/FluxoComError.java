package br.com.kemoel.excecoes;

public class FluxoComError {
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
    	System.out.println("Iniciando método2");
        metodo2();
    	System.out.println("Iniciando método2");
    }
}
