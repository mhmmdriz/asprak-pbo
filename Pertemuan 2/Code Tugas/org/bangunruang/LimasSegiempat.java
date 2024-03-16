package org.bangunruang;

import org.bangundatar.BujurSangkar;
import org.bangundatar.SegitigaSamaSisi;

public class LimasSegiempat {
  private BujurSangkar alas;
  private SegitigaSamaSisi selimut;

  public LimasSegiempat(BujurSangkar alas, SegitigaSamaSisi selimut){
    this.alas = alas;
    this.selimut = selimut;
  }

	public double hitungTinggiLimas(){
		double panjangSisiAlas = alas.getPanjangSisi();
		double tinggiSegitiga = selimut.getTinggi();
		return Math.sqrt(Math.pow(tinggiSegitiga, 2) - Math.pow(panjangSisiAlas/2, 2));
	}

	public double hitungLuasPermukaan(){
		double luasAlas = alas.hitungLuas();
		double luasSegitiga = selimut.hitungLuas();
		return luasAlas + (4 * luasSegitiga);
	}

	public double hitungVolume(){
		double luasAlas = alas.hitungLuas();
		double tinggiLimas = hitungTinggiLimas();
		return luasAlas * tinggiLimas / 3;
	}
}
