/* File : Obat.java */
/* Deskripsi : Program untuk menunjukkan Exception */
/* Nama/Nim : Muhammad Faiq Assajjad /24060122140116 */
public class Obat {
    private String nama;
    private boolean tersedia;

    public Obat(String nama) {
        this.nama = nama;
        tersedia = true;
    }

    public String getNama() {
        return nama;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
