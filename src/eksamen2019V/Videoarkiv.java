package eksamen2019V;

public class Videoarkiv {

	private Video[] vTab; 
	private int antall; 

	public Videoarkiv(int maksAntal) { 
		vTab = new Video[maksAntal]; 
		antall = 0; 
	}
	
	public void leggTil(Video v) {
		
		if (antall == vTab.length) {
			System.out.println("ERROR!");
		} else {
			vTab[antall] = v;
			antall++;
		}
	}
	
	public int finnTotalTid() {
		int totaltid = 0;
		
		//for loop
		//totaltid øker og henter tid fra videoklassen, inne i loopen
		
		//returnerer
	}
	
	public void listAlle(String produsent) {
		
		//string med overskrift som sier hvem produsenten er
		//for loop
	}
}
