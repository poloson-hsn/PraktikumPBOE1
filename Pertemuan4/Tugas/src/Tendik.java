/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 18 Maret 2026
*/

public class Tendik extends Pegawai{
    private String bidang;
    private final int BUP = 55;

    public Tendik(){
        super();
        this.bidang = "";
    }

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return this.bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public int getBUP(){
        return this.BUP;
    }

    public double getTunjangan(int tahunTMT){
        return 0.01 * getHitungMasaKerja(tahunTMT) * getGajiPokok();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang Tendik : " + bidang);
        System.out.println("BUP Tendik : " + BUP);
    }

    public void printTunjangan(int tahunTMT){
        System.out.println("Tunjangan Tendik : " + getTunjangan(tahunTMT));
    }
}