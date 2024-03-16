public class MTitik {
  public static void main(String[] args) {
    Titik t1;
    Titik t2;

    t1 = new Titik();

    t1.setAbsis(5);
    t1.setOrdinat(6);

    System.out.println("Absis t1 : " + t1.getAbsis());
    System.out.println("Ordinat t1 : " + t1.getOrdinat());
    
    t2 = new Titik();

    t2.setAbsis(1);
    t2.setOrdinat(9);

    System.out.println("Absis t2 : " + t2.getAbsis());
    System.out.println("Ordinat t2 : " + t2.getOrdinat());

    
    System.out.println("Jumlah Titik yang sudah dibuat : " + Titik.getCounterTitik());



    


  }
}
