package gargel;

public class ISS extends Imposto{

	@Override
	public float getImposto(float valor) {
		return valor * 0.50f;
	}

	
	public void gargel() {
		System.out.println("gargel");
	}
	
}
