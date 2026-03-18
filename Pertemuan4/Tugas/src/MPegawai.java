/* Nama File    : MPegawai.java
 * Deskripsi    : berisi main class Pegawai
 * Pembuat      : Husein Avicenna
 * Tanggal      : 18 Maret 2026
*/

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("12345", "Dr. Husein Avicenna", "01-01-1980", "01-01-2010", 5000000, "Sains dan Matematika", "NIDN54321");
        DosenTamu dosenTamu = new DosenTamu("67890", "Dr. Joko Sawit", "15-05-1985", "01-02-2020", 4000000, "Sains dan Matematika", "NIDK12345", "31-12-2023");
        Tendik tendik = new Tendik("11223", "Siti Aminah", "20-10-1990", "01-03-2015", 3000000, "Administrasi");

        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        dosenTetap.printTunjangan(2010);

        System.out.println("\n=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();

        System.out.println("\n=== Informasi Tendik ===");
        tendik.printInfo();
        tendik.printTunjangan(2015);
    }
}