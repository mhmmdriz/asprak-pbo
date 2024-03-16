// Nama : Muhammad Rizki
// NIM : 24060121130086
// Tanggal : 28 Februari 2024
// Deskripsi : Kelas yang berisi program class Titik

public class Titik {
	private float absis;
	private float ordinat;
	private static float counterTitik;

	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	// overloading konstruktor Titik
	public Titik(float absis, float ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
		Titik.counterTitik++;
	}

	public void setAbsis(float a){
		absis = a;
	}
	
	public void setOrdinat(float o){
		ordinat = o;
	}

	public float getAbsis(){
		return absis;
	}

	public float getOrdinat(){
		return ordinat;
	}

	public static float getCounterTitik(){
		return counterTitik;
	}

	public float getJarakPusat(){
		return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
	}

	public void refleksiX() {
		this.ordinat = -(this.ordinat);

	}

	public void refleksiY(){
		this.absis = this.absis*(-1);
	}

	public Titik getRefleksiX(){
		return new Titik(this.absis, -(this.ordinat));
	}

	public Titik getRefleksiY(){
		Titik t = new Titik(-(this.absis), this.ordinat);
		return t;
	}	

}
