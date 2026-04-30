/* Nama File    : MManusia.java
 * Deskripsi    : berisi main class Manusia
 * Pembuat      : Husein Avicenna
 * Tanggal      : 22 April 2026
*/

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Husein", LocalDate.of(2005, 1, 1),"Jl. Teuku Umar", 12000000,"198302032006041002");
        Pengusaha pe1 = new Pengusaha("Avicenna", LocalDate.of(2000, 1, 1),"Jl. Antasena", 53000000,"000-556-773-212-000-5");
        Petani pt1 = new Petani("Umar", LocalDate.of(1997, 1, 1),"Jl. Harum 1 Banyumanik", 3000000,"Kendal");
        PNS p2 = new PNS("Karen", LocalDate.of(2010, 01, 01), "Jl. Merdeka 45", 12000000,"198004212010041002");
        p2.setAlamat("Jl. Pattimura 999 Tembalang");
        
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}