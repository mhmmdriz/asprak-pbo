package org.bangundatar;

import org.poligon.Poligon;

public class SegitigaSamaSisi extends Poligon{
    private double panjangSisi, tinggi;

    public SegitigaSamaSisi(double panjangSisi){
      this.panjangSisi = panjangSisi;
      this.jumlahSisi = 3;
      this.tinggi = Math.sqrt(Math.pow(panjangSisi, 2) - Math.pow(panjangSisi/2, 2));
    }

    public double getTinggi(){
      return tinggi;
    }

    public double hitungLuas(){
      return (panjangSisi * tinggi) / 2;
    }
}
