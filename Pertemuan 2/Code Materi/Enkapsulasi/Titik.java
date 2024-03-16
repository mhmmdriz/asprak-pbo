public class Titik {
	private float absis;
	private float ordinat;
	private static float counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	// overloading konstruktor Titik
	Titik(float absis, float ordinat){
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
		return (float) Math.sqrt(absis*absis + ordinat*ordinat);
	}

	public void refleksiX(){
		ordinat = -ordinat;
	}

	public void refleksiY(){
		absis = -absis;
	}

	public Titik getRefleksiX(){
		return new Titik(absis, -ordinat);
	}

	public Titik getRefleksiY(){
		return new Titik(-absis, ordinat);
	}
}
