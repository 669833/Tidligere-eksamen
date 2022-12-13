package eksamen2022V;

public class Observasjoner {
//a	
	private Observasjon[] obs;
	private int antall;
	private int nr;
	
	//b
	public Observasjoner(int maksAntall) {
		obs = new Observasjon[maksAntall];
		antall = 0;
		nr = 0;
	}
	
	//c
	private boolean leggTil(Observasjon observasjon) {
		boolean insatt = false;
		
		if (antall < obs.length && !insatt) {
			obs[antall] = observasjon;
			antall++;
			insatt = true;
		}
		return insatt;
	}
	
	public boolean registrer(double t, double f, int co2) {
		
		boolean plass = false;

		if (antall < obs.length && !plass) {

			Observasjon obs = new Observasjon(nr, t, f, co2);
			antall++;
			nr++;
			plass = true;
		}
		return plass;
	}
	
	public void print() {
		Observasjon.toString();
	}
}
