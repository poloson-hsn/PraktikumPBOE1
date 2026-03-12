/* Nama File    : Main.java
 * Deskripsi    : berisi main class BangunDatar, Persegi, dan Lingkaran
 * Pembuat      : Husein Avicenna
 * Tanggal      : 12 Maret 2026
*/

public class Main {
    public static void main(String[] args) {
        // Attribut
        Persegi persegi = new Persegi(4, "Merah", "Solid");
        Lingkaran lingkaran = new Lingkaran(10, 1, "Biru", "Dashed");

        // Method
        System.out.println("Persegi:");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());

        System.out.println("\nLingkaran:");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
    }
}