/* Nama File    : Data.java
 * Deskripsi    : class Data sebagai generik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 2 Mei 2026
*/

public class Data<G> {
    private G[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (G[]) new Object[100];
        this.banyak = 0;
    }

    public G getIsi(int Posisi) {
        if (1 <= Posisi && Posisi <= 100) {
            return ruang[Posisi - 1];
        }
        return null;
    }

    public void setIsi(int Posisi, G Objek) {
        if (1 <= Posisi && Posisi <= 100) {
            ruang[Posisi - 1] = Objek;
            banyak += 1;
        }
    }

    public int getSize() {
        return banyak;
    }
    
}