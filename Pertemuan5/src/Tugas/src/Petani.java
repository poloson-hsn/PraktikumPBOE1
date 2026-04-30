/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Husein Avicenna
 * Tanggal      : 22 April 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private final int C = 1;

    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return this.asal_kota;
    }

    public void setAsalKota(String asalKota) {
        this.asal_kota = asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override 
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTglMulaiKerja(), now);

        return selisih.getYears() + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota : " + this.asal_kota);
    }
}