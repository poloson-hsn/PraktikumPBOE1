/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam class Manusia
 * Pembuat      : Husein Avicenna
 * Tanggal      : 22 April 2026
*/

import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return this.tgl_mulai_kerja;
    }

    public void setTglMulaiKerja(LocalDate tanggal) {
        this.tgl_mulai_kerja = tanggal;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Tanggal Mulai Kerja : " + this.tgl_mulai_kerja);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Pendapatan : " + this.pendapatan);
    }

    public abstract int hitungMasaKerja();
}