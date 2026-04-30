/* Nama File    : Anabul.java
 * Deskripsi    : class Anabul sebagai superclass dari class kucing, anjing, dan burung
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public abstract class Anabul {
    private String Nama;

    public Anabul() {
        this.Nama = "";
    }

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public abstract void Gerak();
    public abstract void Bersuara();
}