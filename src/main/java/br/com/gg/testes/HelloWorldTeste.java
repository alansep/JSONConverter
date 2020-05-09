package br.com.gg.testes;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class HelloWorldTeste {

	public static void main(String[] args) {
		System.err.println("Gargéis");
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(new Telefone("(18) 91212-2314"));
		telefones.add(new Telefone("(18) 98111-1111"));
		Pessoa pessoa = new Pessoa("Gargel", 25, telefones);
		System.out.println(pessoa);
		Gson gson = new Gson();
		System.out.println(gson.toJson(pessoa));
	}
	
}
