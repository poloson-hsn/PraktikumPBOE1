/* Nama File    : Dosen.java
 * Deskripsi    : class Dosen sebagai subclass dari class CivitasAkademika
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen() {
        super();
        this.NIP = "";
    }

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    public String getNIP() {
        return this.NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}