package br.com.kemoel.herdado.bytebank;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
