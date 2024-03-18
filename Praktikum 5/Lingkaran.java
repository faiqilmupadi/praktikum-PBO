//Nama :Muhammad Faiq Assajjad
//Nim :24060122140116
//deskripsi:Lingkaran
class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return Math.PI * jejari * jejari; // Menggunakan Math.PI untuk konstanta pi
    }
}