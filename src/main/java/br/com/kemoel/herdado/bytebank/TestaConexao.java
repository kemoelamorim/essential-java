package br.com.kemoel.herdado.bytebank;

public class TestaConexao {

	public static void main(String[] args) {
		
		
		try(Conexao con = new Conexao()) {
			
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println(ex.getMessage() +": erro de conexao");
		}
	}

}
