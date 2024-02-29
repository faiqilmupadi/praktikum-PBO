/* Program   : MainProdukPenjual.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas produk dan penjual*/
/* NIM/Nama  : 24060122140116/Muhammad Faiq Asssajjad*/
/* Tanggal   : 28 Februari 2024*/
public class MainProdukPenjual {
    public static void main(String[] args) {
        Penjual penjual1 = new Penjual("Toko XYZ", "Jl. Raya 456", "0898787656");
        Produk produk1 = new Produk("Laptop", 9000000, 17, "Laptop merk Y", penjual1);
        System.out.println("Informasi Produk:");
        System.out.println(produk1.getInfoProduk());
        System.out.println("\nInformasi Penjual:");
        System.out.println("Nama: " + produk1.getPenjual().getNama());
        System.out.println("Alamat: " + produk1.getPenjual().getAlamat());
        System.out.println("Nomor Telepon: " + produk1.getPenjual().getNomorTelepon());
    }
}