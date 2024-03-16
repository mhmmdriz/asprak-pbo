/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MKeranjangPembeli {
    public static void main(String[] args){
        KeranjangPembeli P1 = new KeranjangPembeli("Ani");
        P1.addKeranjangPembeli(new Keranjang("Buku",3));
        P1.addKeranjangPembeli(new Keranjang("Penggaris",2));
        P1.addKeranjangPembeli(new Keranjang("Pulpen",3));
       
        P1.tampilKeranjangPembeli();
    }
}
