/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Husein Avicenna
 * Tanggal      : 18 Maret 2026
*/

public class Dosen extends Pegawai{
    public String fakultas;

    public Dosen(){
        super();
        this.fakultas = "";
    }

    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas Dosen : " + fakultas);
    }
}