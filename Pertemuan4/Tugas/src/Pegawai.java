/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Husein Avicenna
 * Tanggal      : 18 Maret 2026
*/

public class Pegawai {
    private String NIP;
    private String nama;
    private String tanggalLahir;
    private String TMT;
    private double gajiPokok;

    public Pegawai(){
        this.NIP = "";
        this.nama = "";
        this.tanggalLahir = "";
        this.TMT = "";
        this.gajiPokok = 0.0;
    }

    public Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return this.NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getTanggalLahir(){
        return this.tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public String getTMT(){
        return this.TMT;
    }

    public void setTMT(String TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public int getHitungMasaKerja(int tahunTMT){ // Menghitung masa kerja berdasarkan tahun TMT
        int masaKerja = 2026 - tahunTMT; // Asumsikan tahun saat ini adalah 2026
        
        if (masaKerja >= 0){
            return masaKerja;
        } else {
            return 0;
        }
    }

    public void printInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("NIP Pegawai: " + NIP);
        System.out.println("Tanggal Lahir Pegawai: " + tanggalLahir);
        System.out.println("TMT Pegawai: " + TMT);
        System.out.println("Gaji Pokok Pegawai: " + gajiPokok);
    }
}