package eksamen2020H;
//a
public abstract class Vare {
	
	private String navn;
	private int nummer;
	private double pris;
	//b
	
	public Vare(String navn, int nummer, double pris) {
		this.navn = navn;
		this.nummer = nummer;
		this.pris = pris;
	}
	//c
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public double getPris() {
		return pris;
	}
	public void setPris(double pris) {
		this.pris = pris;
	}
	
	//d
	public String toString(String navn, int nummer, double pris) {
		String VareInfo = "Navn: " + navn + "\nVarenummer: " + nummer + "\nPris: " + pris + "\n";
		return VareInfo;
	}
	
	//e
	public class DigitalVare extends Vare {
		
		private String url;
		
		public DigitalVare(String navn, int nummer, double pris, String url, String VareInfo) {
			
			super(navn, nummer, pris);
			this.url = url;
		}
		//f
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String toString() {
			String DigitalInfo = "Navn: " + navn + "\nVarenummer: " + nummer + "\nPris: " + pris + "\nDownload: " + url + "\n";
			return DigitalInfo;
		}
	}
	
	//g
	public class FysiskVare extends Vare {
		
		private int antall;
		
		public FysiskVare(String navn, int nummer, double pris, int antall) {
			super(navn, nummer, pris);
			this.antall = antall;
		}
		
		public String toString() {
			String tilgjengelighet = "Ikke tilgjengelig";
			
			if (antall >= 50) {
				tilgjengelighet = "50+ tilgjengelig";
			}
			if ((antall > 0) && (antall < 50)) {
				tilgjengelighet = antall + "tiljengelig";
			}
			String FysiskInfo = "Navn: " + navn + "\nVarenummer: " + nummer + "\nPris: " + pris + "\n" + tilgjengelighet + "\n";
			return FysiskInfo;
		}
			
	}
		
	
	

}
