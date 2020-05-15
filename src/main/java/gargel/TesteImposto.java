package gargel;

import java.util.ArrayList;
import java.util.List;

public class TesteImposto {

	public static void main(String[] args) {

		// R$10,00 -> 1, 20,00 -> 2

		Imposto[] impostos = new Imposto[4];
		impostos[0] = new Imposto();
		impostos[1] = new ISS();
		impostos[2] = new ImpostoFofo();
		//criar uma implementação
		mostrarImpostos(impostos, 100); 
		
		Imposto imposto = new ISS();
		
		List<String> lista = new ArrayList<>();
		
	}

	public static void mostrarImpostos(Imposto[] impostos, float valor) {
		for (int i = 0; i < impostos.length; i++) {
			System.out.println(impostos[i].getImposto(valor));
		}
	}

}
