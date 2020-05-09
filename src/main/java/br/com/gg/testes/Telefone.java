package br.com.gg.testes;

public class Telefone {

	private String numero;

	public Telefone(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return numero;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + "]";
	}

}
