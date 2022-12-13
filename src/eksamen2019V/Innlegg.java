package eksamen2019V;

public class Innlegg {
	
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg(String bruker, String dato) {
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}
	
//	public String getBruker() {
//		return bruker;
//	}
//	public void setBruker(String Bruker) {
//		this.bruker = bruker;
//	}
//	public String getDato() {
//		return dato;
//	}
//	public void setDato(String dato) {
//		this.dato = dato;
//	}

	public void skrivUt() {
		String skrivut = "Bruker: " + bruker + "\nDato: " + dato + "\nAntall likes: " + likes + "\n";
		System.out.print(skrivut);
	}
	
	public class Bilde extends Innlegg {
		
		public String url;
		
		public Bilde(String url) {
			super(bruker, dato, likes);
			this.url = url;
		}
		
		public String bildeskrivUt() {
			String bildestr = super.toString() + "URL: " + url + "\n";
			return bildestr;
		}
	}
	
	public class Tekst extends Innlegg {
		
		public String tekst;
		
		public Tekst(String tekst) {
			super(bruker, dato, likes);
			this.tekst = tekst;
		}
		public String tekstskrivUt() {
			String tekststr = super.toString() + "Tekst: " + tekst + "\n";
			return tekststr;
		}
	}
}