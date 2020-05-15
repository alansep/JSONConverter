package br.com.gg.testes;

public class Impressora implements Runnable {

	private String frase;

	public Impressora(String frase) {
		this.frase = frase;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				wait();
				System.out.print(frase);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
