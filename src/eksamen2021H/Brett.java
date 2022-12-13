package eksamen2021H;

public class Brett {

	private int[][] brett;
	private int n;

	public Brett(int størrelse) {
		this.n = størrelse;
		brett = new int [n][n];
		fyllTall();
	}

	private void fyllTall() {

	}

	public boolean harKryss(int r, int k) {

		boolean kryss = false;

		if((brett[r][k] == 0) && !kryss) {
			kryss = true;
		}
		return kryss;
	}

	private boolean rekkeBingo(int r) {

		boolean rekke = true;


	}

	public boolean harTall(int tall) {

		boolean finnes = false;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (brett[i][j] == tall) {
					finnes = true;
				}
			}
		}
		return finnes;
	}
}
