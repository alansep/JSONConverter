package br.com.gg.core;

public class JsonConverter {

	private Conversor conversor;

	public JsonConverter() {
		this.conversor = new Conversor();
	}

	public String convert(Object object) {
		try {
			return conversor.executeConversion(object);
		} catch (Exception e) {
			System.out.println("Erro!!!");
			return null;
		}
	}

}
