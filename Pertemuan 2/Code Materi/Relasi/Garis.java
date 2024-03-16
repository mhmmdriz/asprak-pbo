public class Garis {
  private Titik titikAwal, titikAkhir;

  public Garis(){
    titikAwal = new Titik();
    titikAkhir = new Titik();
  }

  public Garis(Titik titikAwal, Titik titikAkhir){
    this.titikAwal = titikAwal;
    this.titikAkhir = titikAkhir;
  }

  public void setTitikAwal(Titik titikAwal){
    this.titikAwal = titikAwal;
  }

  public void setTitikAkhir(Titik titikAkhir){
    this.titikAkhir = titikAkhir;
  }

  public Titik getTitikAwal(){
    return titikAwal;
  }

  public Titik getTitikAkhir(){
    return titikAkhir;
  }

  public float getPanjang(){
    float absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
    float ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
    return (float) Math.sqrt(absis*absis + ordinat*ordinat);
  }

  public float getGradien(){
    float absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
    float ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
    return ordinat/absis;
  }

  public void getRefleksiY(){
    titikAwal.refleksiY();
    titikAkhir.refleksiY();
  }

  public boolean isTegakLurus(Garis g){
    float gradien1 = this.getGradien();
    float gradien2 = g.getGradien();
    if(gradien1*gradien2 == -1){
      return true;
    } else {
      return false;
    }
  }

}
