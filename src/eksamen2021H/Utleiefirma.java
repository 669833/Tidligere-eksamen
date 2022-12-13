package eksamen2021H;

public class Utleiefirma {

	private String navn;
	private Hytte[] hytter;
	private int antall;
	private static final int START_ANTALL = 5;
	
	public Utleiefirma(String navn) {
		this.navn = navn;
		antall = 0;
		hytter = new Hytte[START_ANTALL];
	}
	
	public void leggTil(Hytte hytte) {
		
		if (antall == hytter.length) {
			utvid();
		}
		hytter[antall] = h;
		antall++;
	}
	
	public void utvid() {

		
	}
}
