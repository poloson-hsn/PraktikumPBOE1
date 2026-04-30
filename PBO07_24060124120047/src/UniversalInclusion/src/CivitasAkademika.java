/* Nama File    : CivitasAkademika.java
 * Deskripsi    : class CivitasAkademika sebagai superclass dari class Dosen dan Mahasiswa
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public abstract class CivitasAkademika {
    private String Nama;

    public CivitasAkademika() {
        this.Nama = "";
    }

    public CivitasAkademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public abstract String getNomor();
}