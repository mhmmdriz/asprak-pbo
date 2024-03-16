/**
  * File        : Kubus.java       15/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   : representasi dari objek Kubus yang merupakan agregasi dari BujurSangkar
*/
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangSisi();
        return permukaan.hitungLuas() * panjangSisi;
    }
    
    public double hitungLuasAlas(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
