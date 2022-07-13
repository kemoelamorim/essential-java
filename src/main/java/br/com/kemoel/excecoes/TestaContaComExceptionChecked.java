package br.com.kemoel.excecoes;

public class TestaContaComExceptionChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
