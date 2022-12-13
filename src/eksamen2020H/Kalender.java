package eksamen2020H;

public class Kalender {

	private String[][] ukekalender; 

	private final static int DAGER = 5; 
	private final static int TIDSPUNKTER = 4; 

	public Kalender() { 

		ukekalender = new String[TIDSPUNKTER][DAGER]; 
	}

	public void noter(int dag, int tid, String str) {
		ukekalender[tid][dag] = str;
	}

	public String hentNotat(int dag, int tid) {
		return ukekalender[tid][dag];
	}

	public void slett(int dag, int tid) {
		ukekalender[tid][dag] = null;
	}

	public boolean harNotat(int dag, int tid) {
			
		boolean fylt = false;
		
		if ((ukekalender[tid][dag] != null) && !fylt) {
			fylt = true;
		}
		return fylt;
	}

	public void leggTil(int dag, int tid, String str) {
		
	}
		
	public void skrivUtTidspunkt(int tid, int dag) {
		
		String ut = hentNotat(dag, tid);
		
		for (int i = 0; i >= TIDSPUNKTER; i++) {
			for (int j = 0; j >= DAGER; j++) {
			
				if (ukekalender[tid][dag] != null) {
					System.out.print(ut);
				} else 
					System.out.print("-");
			}
		}
	}

}


