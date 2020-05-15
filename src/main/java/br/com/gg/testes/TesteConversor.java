package br.com.gg.testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.gg.core.JsonUtil;

public class TesteConversor {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		System.out.println(JsonUtil.isList(lista));
	
	}
	
}
