/* Nama File    : Anjing.java
 * Deskripsi    : class Anjing sebagai subclass dari class Anabul
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String Nama) {
        super(Nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}