//Nama :Muhammad Faiq Assajjad
//Nim :24060122140116
//deskripsi:MLingkaran

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan panjang jejari lingkaran: ");
        double jejari = scan.nextDouble();

        Lingkaran lingkaran1 = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + lingkaran1.hitungLuas());

        scan.close(); 
    }
}
