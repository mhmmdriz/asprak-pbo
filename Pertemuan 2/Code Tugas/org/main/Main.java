/**
  * File        : MKubus.java       15/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   : driver class untuk BujurSangkar dan Kubus
*/
package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class Main {
    public static void main(String[] args) {
        double volume, luasPermukaan;

        BujurSangkar bujurSangkar1 = new BujurSangkar(6);
        SegitigaSamaSisi segitiga1 = new SegitigaSamaSisi(6);

        LimasSegiempat limas1 = new LimasSegiempat(bujurSangkar1, segitiga1);
        volume = limas1.hitungVolume();
        luasPermukaan = limas1.hitungLuasPermukaan();
        System.out.println("Volume limas segiempat: " + volume);
        System.out.println("Luas permukaan limas segiempat: " + luasPermukaan);
    }
}
