/* Nama File    : Kucing.java
 * Deskripsi    : class Kucing sebagai subclass dari class Anabul
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class Kucing extends Anabul {
    public Kucing() {
        super();
    }

    public Kucing(String Nama) {
        super(Nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
}