package br.com.kemoel.herdado.bytebank;

public class TesteSacaException {
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123,321);
		conta.deposita(200);
		
		try {
			conta.saca(200);			
		}catch(Exception e) {
			System.out.println("Ex: "+e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
