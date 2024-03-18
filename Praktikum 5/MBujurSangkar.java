//Nama :Muhammad Faiq Assajjad
//Nim :24060122140116
//deskripsi:MBujurSangkar
import java.util.Scanner;

public class MBujurSangkar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();

        System.out.print("Masukkan sisi bujur sangkar: ");

        double sisi = scan.nextDouble();

        System.out.println("Luas bujur sangkar dengan sisi " + sisi +
                " satuan adalah " + bs.hitungLuas(sisi));

        scan.close(); 
    }
}

// apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi
// metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 

// Ketika sebuah kelas (misalnya BujurSangkar) diturunkan dari kelas abstrak (misalnya BangunDatar) yang memiliki metode abstrak (metode yang dideklarasikan tetapi tidak memiliki implementasi), maka kelas turunan tersebut harus memberikan implementasi untuk semua metode abstrak yang dideklarasikan dalam kelas abstrak tersebut.

// Jika kelas turunan (BujurSangkar) tidak memberikan implementasi untuk metode abstrak yang dideklarasikan dalam kelas abstrak (BangunDatar), maka Java tidak akan mengizinkannya untuk dikompilasi. Dalam hal ini, compiler akan menghasilkan pesan kesalahan yang menunjukkan bahwa kelas turunan (BujurSangkar) harus memberikan implementasi untuk metode abstrak yang dideklarasikan dalam kelas abstrak (BangunDatar).

// Jadi, untuk memastikan agar program dapat dikompilasi tanpa kesalahan, pastikan bahwa semua metode abstrak yang dideklarasikan dalam kelas abstrak telah diberikan implementasi dalam kelas turunannya.