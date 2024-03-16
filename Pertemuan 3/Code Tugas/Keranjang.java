/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Keranjang {
    //atribut
    private String nama;
    private int qty;
    
    //konstruktor
    public Keranjang(String nama, int qty){
        this.nama = nama;
        this.qty = qty;
    }
    
    //method
    public String getNama(){
        return nama;
    }
    
    public int getQty(){
        return qty;
    }
}
