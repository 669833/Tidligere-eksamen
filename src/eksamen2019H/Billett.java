package eksamen2019H;

public abstract class Billett {
	
	private int soner;
	private Status status;
	private int soneaktivert;
	
	public Billett(int soner, Status status, int soneaktivert) {
		super();
		this.soner = soner;
		this.status = Status.IKKEAKTIV;
		this.soneaktivert = 0;
	}

	public int getSoner() {
		return soner;
	}

	public void setSoner(int soner) {
		this.soner = soner;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getSoneaktivert() {
		return soneaktivert;
	}

	public void setSoneaktivert(int soneaktivert) {
		this.soneaktivert = soneaktivert;
	}

	public void deaktiver() {
		this.status = Status.DEAKTIVERT;
	}
	
	public abstract boolean aktiver(int sone);
	
	public boolean erGyldig(int sone) {
		
		boolean gyldig = false;
		
		if
	}
	
}
