package gargel;

public class Veiculo {

	private String nome;
	private int ano;

	public Veiculo(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void gargelLindo() {
		System.out.println("Gargel lindo");
	}
	
}
