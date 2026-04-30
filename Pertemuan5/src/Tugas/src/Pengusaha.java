/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Husein Avicenna
 * Tanggal      : 22 April 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private final int B = 3;

    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNPWP() {
        return this.npwp;
    }

    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTglMulaiKerja(), now);

        return selisih.getYears() + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + this.npwp);
    }
}