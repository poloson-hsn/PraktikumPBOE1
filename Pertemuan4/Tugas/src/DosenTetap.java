/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Husein Avicenna
 * Tanggal      : 18 Maret 2026
*/

public class DosenTetap extends Dosen{
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(){
        super();
        this.NIDN = "";
    }

    public DosenTetap(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String Fakultas, String NIDN){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return this.NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public int getBUP(){
        return this.BUP;
    }

    public double getTunjangan(int tahunTMT){
        return 0.02 * getHitungMasaKerja(tahunTMT) * getGajiPokok();
    }

    public void printTunjangan(int tahunTMT){
        System.out.println("Tunjangan Dosen Tetap : " + getTunjangan(tahunTMT));
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN Dosen Tetap : " + NIDN);
        System.out.println("BUP Dosen Tetap : " + BUP);
    }
}