/* Nama File    : Datum.java
 * Deskripsi    : class Datum sebagai generik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 30 April 2026
*/

public class Datum<G> {
    private G Isi;

    public G getIsi() {
        return Isi;
    }

    public void setIsi(G IsiClassGeneric) {
        this.Isi = IsiClassGeneric;
    }
}