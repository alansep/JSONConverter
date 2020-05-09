package br.com.gg.testes;

import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	private List<Telefone> telefone;

	public Pessoa(String nome, int idade, List<Telefone> telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}

}
