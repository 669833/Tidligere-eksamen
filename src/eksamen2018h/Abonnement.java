package eksamen2018h;
//a
public abstract class Abonnement {

	private String navn;
	private int fodselsnummer;
	private int telefonnummer;
	private double minuttpris;
	//b
	public Abonnement(String navn, int fodselsnummer, int telefonnummer, double minuttpris) {
		super(); //ifølge løsningsforslag
		this.navn = navn;
		this.fodselsnummer = fodselsnummer;
		this.telefonnummer = telefonnummer;
		this.minuttpris = minuttpris;
	}
	//c
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getFodselsnummer() {
		return fodselsnummer;
	}
	public void setFodselsnummer(int fodselsnummer) {
		this.fodselsnummer = fodselsnummer;
	}
	public int getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public double getMinuttpris() {
		return minuttpris;
	}
	public void setMinuttpris(double minuttpris) {
		this.minuttpris = minuttpris;
	}
	//d
	public abstract double pris(int telefonnummer, int minuttpris);
	
	//e
	public class KontantAbn extends Abonnement {
		
		private double balanse;
		
		public KontantAbn(String navn, int fodselsnummer, int telefonnummer, double minuttpris, double balanse) {
			super(navn, fodselsnummer, telefonnummer, minuttpris);
			this.balanse = balanse;
			
		}
		//f
		public double pris(int telefonnummer, int lengde) {
			return super.getMinuttpris() * lengde;
		}
	}
	
	//g
	public class MaanedAbn extends Abonnement {
		
		private gratis[] gratis;
		
		public MaanedAbn(gratis gratis) {
			super(navn, fodselsnummer, telefonnummer, minuttpris);
			gratis = new gratis[4];
		}
		
		//h
		public double pris(int telefonnummer, int lengde) {
			int pos = 0;
			boolean finnes = false;
			
			while (pos < gratis.length && !funnet) {
				if (gratis[pos] != null && gratis[pos].getTelefonnummer() == nummer) {
					finnes = true;
				}
				pos++;
			}
			if (finnes) {
				return 0;
			} else {
				return super.getMinuttpris() * lengde;
			}
			
		}
	}
	
}
