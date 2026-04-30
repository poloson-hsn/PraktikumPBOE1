/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi main class BangunDatar
 * Pembuat      : Husein Avicenna
 * Tanggal      : 16 April 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(12, "Merah", "Putus-putus");
        Persegi P2 = new Persegi(15, "Hijau", "Putus-putus");
        BangunDatar L1 = new Lingkaran(9, "Biru", "Solid");
        Lingkaran L2 = new Lingkaran(7, "Putih", "Solid");

        System.out.println("Apakah luas P1 sama dengan P2 = " + P1.isEqualLuas(P2));
        
        L2.zoomIn();
        L2.zoomOut();
        L1.getLuas();

    }  
}