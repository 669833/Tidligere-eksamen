package eksamen2019V;

public class Video {
	//a
	private String tittel;
	private String produsent;
	private int sekund;
	
	public Video(String tittel, String produsent, int sekund) {
		this.tittel = tittel;
		this.produsent = produsent;
		this.sekund = sekund;
	}
	
	public String getTittel() {
		return tittel;
	}
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	public String getProdusent() {
		return produsent;
	}
	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}
	public int getSekund() {
		return sekund;
	}
	public void setSekund(int sekund) {
		this.sekund = sekund;
	}
	
	public String toString() {
		int minutt = (sekund % 3600) / 60;
		int sekrest = (sekund % 3600) % 60;
		String dot = ".";
		boolean mindre = false;
				
		if (sekrest < 10 && !mindre) {
			dot = ".0";
			mindre = true;
		}
				
		String str = "Tittel: " + tittel + ", Produsent: " + produsent + ", Tid: " + minutt + dot + sekrest;
		return str;
	}
	

}
