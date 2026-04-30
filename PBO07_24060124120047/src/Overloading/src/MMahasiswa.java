/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi main class Mahasiswa
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class MMahasiswa {
    public static void main(String[] args) {

        System.out.println("=== Bagian B dan C ===");
        Mahasiswa M1 = new Mahasiswa();
        System.out.println("Sebelum diisi");
        System.out.println("NIM : " + M1.getNIM());
        System.out.println("Nama : " + M1.getNama());
        System.out.println("Program Studi : " + M1.getProgramStudi());
        
        M1.setNIM("72847674572");
        M1.setNama("Husein Avicenna");
        System.out.println("\nSetelah diisi");
        System.out.println("NIM : " + M1.getNIM());
        System.out.println("Nama : " + M1.getNama());
        System.out.println("Program Studi (belum diisi): " + M1.getProgramStudi());

        System.out.println("\n=== Bagian D ===");
        Mahasiswa M2 = new Mahasiswa("72849574565", "Mamang Suherman", "Teknik Sipil");
        System.out.println("NIM : " + M2.getNIM());
        System.out.println("Nama : " + M2.getNama());
        System.out.println("Program Studi : " + M2.getProgramStudi());

        System.out.println("\n=== Bagian E ===");
        Mahasiswa M3 = new Mahasiswa(M2);
        System.out.println("NIM : " + M3.getNIM());
        System.out.println("Nama : " + M3.getNama());
        System.out.println("Program Studi : " + M3.getProgramStudi());

        System.out.println("\n=== Tes setProgramStudi ===");

        M1.setProgramStudi();
        System.out.println("Program Studi (tanpa parameter): " + M1.getProgramStudi());

        M1.setProgramStudi("Informatika");
        System.out.println("Program Studi (dengan parameter String): " + M1.getProgramStudi());

        M1.setProgramStudi(M2);
        System.out.println("Program Studi (dengan parameter Mahasiswa): " + M1.getProgramStudi());
    }
}