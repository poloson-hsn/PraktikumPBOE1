/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi main class Mahasiswa
 * Pembuat      : Husein Avicenna
 * Tanggal      : 5 Maret 2026
*/

public class MMahasiswa {
    public static void main(String[] args) {
        Matkul PBO = new Matkul("PBO", "Pemrograman Berorientasi Objek", 3);
        Matkul MBD = new Matkul("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = "+ M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = "+ M1.getJumlahSks());
    }
}