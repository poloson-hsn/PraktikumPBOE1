/* Nama File    : Mahasiswa.java
 * Deskripsi    : class Mahasiswa sebagai subclass dari class CivitasAkademika
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class Mahasiswa extends CivitasAkademika{
    private String NIM;
    private String DosenWali;

    public Mahasiswa() {
        super();
        this.NIM = "";
        this.DosenWali = "";
    }

    public Mahasiswa(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
        this.DosenWali = "";
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getWali() {
        return this.DosenWali;
    }

    public void setWali(Dosen DosenWali) {
        this.DosenWali = DosenWali.getNama();
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("NIM: " + this.NIM);
        System.out.println("Dosen Wali: " + this.DosenWali);
    }

    @Override
    public String getNomor() {
        return this.NIM;
    }
}