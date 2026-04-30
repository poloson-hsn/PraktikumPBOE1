/* Nama File    : MSeminar.java
 * Deskripsi    : berisi main class Seminar
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class MSeminar {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Dr. Hendra", "NIP001");
        Dosen d2 = new Dosen("Dr. Angel", "NIP002");

        Mahasiswa m1 = new Mahasiswa("Ucup", "NIM100");
        Mahasiswa m2 = new Mahasiswa("Sarji", "NIM101");
        Mahasiswa m3 = new Mahasiswa("Arip", "NIM102");
        Mahasiswa m4 = new Mahasiswa("Doni", "NIM103");
        Mahasiswa m5 = new Mahasiswa("Slamet", "NIM104");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d2);

        Seminar seminar = new Seminar();
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        System.out.println("=== MENAMPILKAN PESERTA SEMINAR ===");
        seminar.tampilPeserta();

        System.out.println("\nJumlah Peserta Mahasiswa: " + seminar.countMahasiswa());
        System.out.println("Total Semua Peserta: " + seminar.countPeserta());

        System.out.println("\n=== DATA DETAIL MAHASISWA ===");
        m1.tampilDataMahasiswa();
        System.out.println();
        m2.tampilDataMahasiswa();
        System.out.println();
        m3.tampilDataMahasiswa();
        System.out.println();
        m4.tampilDataMahasiswa();
        System.out.println();
        m5.tampilDataMahasiswa();
    }
}