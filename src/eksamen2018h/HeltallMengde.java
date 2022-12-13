package eksamen2018h;

public class HeltallMengde {
	
	private boolean[] mengde;
	int n;
	
	//a
	public HeltallMengde(int n) {
		mengde = new boolean[n];
	}
	
	public String toString() {
		
		String str = "{";
		boolean forste = true;
		
		for (int i = 0; i < mengde.length; i++) {
			if (mengde[i] && !forste) {
				str = str + ", " + i;
			}
		}
		str = str + "}";
		return str;
	}

}
