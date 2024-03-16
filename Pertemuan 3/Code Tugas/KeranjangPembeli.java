/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class KeranjangPembeli {
    //atribut
    private String namaPembeli; 
    private Keranjang[] listKeranjang;
    
    //konstruktor
    public KeranjangPembeli(String nama){
        this.namaPembeli = nama;
        listKeranjang = new Keranjang[5];
    }
    
    //method
    public void addKeranjangPembeli(Keranjang k){
        int i =0;
        boolean found = false;
        while(i < listKeranjang.length && !found){
            if(listKeranjang[i] == null){
                listKeranjang[i] = k;
                found = true;
            }  
            i++;
        }
    }
    
    
    public void tampilKeranjangPembeli(){
        System.out.println("Nama : " + namaPembeli);
        int i = 0;
        if(listKeranjang[i] == null){
            System.out.println("Keranjang kosong!");
        }else{
            while(i < listKeranjang.length && listKeranjang[i] != null){
                System.out.println(listKeranjang[i].getNama() + " : " + listKeranjang[i].getQty());
                i++;
            }
        }
    }
}
