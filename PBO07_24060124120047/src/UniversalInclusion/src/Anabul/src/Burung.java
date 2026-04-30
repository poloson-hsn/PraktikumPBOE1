/* Nama File    : Burung.java
 * Deskripsi    : class Burung sebagai subclass dari class Anabul
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String Nama) {
        super(Nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("Cuit");
    }
}