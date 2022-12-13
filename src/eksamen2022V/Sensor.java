package eksamen2022V;

public abstract class Sensor {

	//a
	private String navn;
	private int id;
	//b
	public Sensor(String navn, int id) {
		
		this.navn = navn;
		this.id = id;
	}
	//c
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//d
	public String toString() {
		String info = "Sensor [id=" + id + ", navn=" + navn + "]";
		return info;
	}
	//e
	public class TemperaturSensor extends Sensor {
		private double temperatur;

		public TemperaturSensor(String navn, int id, double temperatur) {
			super(navn, id);
			this.temperatur = temperatur;
		}
		
		public double getTemperatur() {
			return temperatur;
		}
		
		public void setTemperatur(double temperatur) {
			this.temperatur = temperatur;
		}
		
		//f
		public String toString() {
			String TempInfo = "[temperatur=" + temperatur + ", " + "Sensor [id=" + id + ", navn=" + navn + "]]";
			return TempInfo;
		}
	}

}
