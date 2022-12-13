package eksamen2020H;

public class Arrangement {
	
	private String navn;
	private Kontakt[] deltakere;
	private int antall;
	
	public Arrangement(String navn) {
		this.navn = navn;
		deltakere = new Kontakt[50];
		antall = 0;
	}
	
	public boolean leggTilKontakt(Kontakt k) {
		
		boolean plass = false;
		
		if ((antall < deltakere.length) && !plass) {
			deltakere[antall] = k;
			plass = true;
			antall++;
		}
		return plass;
	}

}
