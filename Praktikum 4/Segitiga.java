// Nama      : MUhammad Faiq Assajjad
// NIM       : 24060122140116
// Tanggal   : 17 Maret 2024
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
