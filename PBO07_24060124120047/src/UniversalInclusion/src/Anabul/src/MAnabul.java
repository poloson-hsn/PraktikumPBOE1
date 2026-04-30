/* Nama File    : MAnabul.java
 * Deskripsi    : berisi main class Anabul
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class MAnabul {
    public static void main(String[] args) {
        Anabul A;
        
        A = new Kucing();
        A.Gerak(); // Melata
        A.Bersuara(); // Meong

        A = new Anjing();
        A.Gerak(); // Melata
        A.Bersuara(); // Guk-Guk

        A = new Burung();
        A.Gerak(); // Terbang
        A.Bersuara(); // Cuit
    }
}