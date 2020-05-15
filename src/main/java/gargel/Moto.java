package gargel;

public class Moto extends Veiculo {

	public Moto(String nome, int ano, int cilindradas) {	
		super(nome, ano);
		this.cilindradas = cilindradas;
	}
	
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
