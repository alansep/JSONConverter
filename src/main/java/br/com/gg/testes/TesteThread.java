package br.com.gg.testes;

public class TesteThread {

	public static void main(String[] args) {

		Thread impressora1 = new Thread(new Impressora("1"));
		Thread impressora2 = new Thread(new Impressora("2"));
		Thread impressora3 = new Thread(new Impressora("3"));

		impressora1.start();
		impressora2.start();
		impressora3.start();

		
	}

	
}
