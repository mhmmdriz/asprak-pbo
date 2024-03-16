public class Main {
  public static void main(String[] args) {
    Titik t1, t2, t3, t4;
    Garis g1, g2;

    t1 = new Titik(5,7);
    t2 = new Titik(2,1);
    t3 = new Titik(3,5);
    t4 = new Titik(9,2);

    g1 = new Garis(t1, t2);
    g2 = new Garis(t3, t4);

    System.out.println("Panjang g1: " + g1.getPanjang());
    System.out.println("Panjang g2: " + g2.getPanjang());
    System.out.println("Gradien g1: " + g1.getGradien());
    System.out.println("Gradien g2: " + g2.getGradien());
    System.out.println("g1 tegak lurus g2: " + g1.isTegakLurus(g2));

    g1.getRefleksiY();
    System.out.println("Titik awal g1 refleksi Y: " + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat());
    System.out.println("Titik akhir g1 refleksi Y: " + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat());

  }
}
