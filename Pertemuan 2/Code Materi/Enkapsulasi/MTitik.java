public class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5,6);

		t1.setAbsis(5);
		t1.setOrdinat(7);
		t2.setAbsis(5);
		t2.setOrdinat(7);

		float counterTitik;
		float absis;
		float ordinat;

		counterTitik = Titik.getCounterTitik();
		System.out.println("Jumlah objek titik: " + counterTitik);

		absis = t1.getAbsis();
		ordinat = t1.getOrdinat();
		System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t1("+absis + ", " + ordinat + ")");
		
		absis = t2.getAbsis();
		ordinat = t2.getOrdinat();
		System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t2("+absis + ", " + ordinat + ")");

		// absis = t3.getAbsis();
		// ordinat = t3.getOrdinat();
		System.out.printf("t3(%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());
		System.out.println("t3("+t3.getAbsis() + ", " + t3.getOrdinat() + ")");

		System.out.println("Jarak t1 ke pusat: " + t1.getJarakPusat());
		System.out.println("Jarak t2 ke pusat: " + t2.getJarakPusat());
		System.out.println("Jarak t3 ke pusat: " + t3.getJarakPusat());

		t1.refleksiX();
		System.out.println("t1 refleksi X: " + t1.getAbsis() + ", " + t1.getOrdinat());
		t1.refleksiY();
		System.out.println("t1 refleksi Y: " + t1.getAbsis() + ", " + t1.getOrdinat());

		Titik t2_refleksiX, t2_refleksiY;
		t2_refleksiX = t2.getRefleksiX();
		System.out.println("t2 refleksi X: " + t2_refleksiX.getAbsis() + ", " + t2_refleksiX.getOrdinat());
		t2_refleksiY = t2.getRefleksiY();
		System.out.println("t2 refleksi Y: " + t2_refleksiY.getAbsis() + ", " + t2_refleksiY.getOrdinat());
	}
}
