/* Nama File    : MDatum.java
 * Deskripsi    : berisi main class Datum
 * Pembuat      : Husein Avicenna
 * Tanggal      : 30 April 2026
*/

public class MDatum {
    public static void main(String[] args) {
        Kucing A;
        Datum<Anabul> anu;

        A = new Anggora("Milo", 5.5);
        anu = new Datum<>();

        System.out.println("\nTes 1");
        anu.setIsi(A); // Anggora
        anu.getIsi().Bersuara(); // Meong
        anu.getIsi().Gerak(); // Melata

        System.out.println("\nTes 2");
        anu.setIsi(new KembangTelon("Chloe", 8.0)); // KembangTelon
        anu.getIsi().Bersuara(); // Meong
        anu.getIsi().Gerak(); // Melata

        System.out.println("\nTes 3");
        anu.setIsi(new Anjing("Max")); // Anjing
        anu.getIsi().Bersuara(); // Guk-Guk
        anu.getIsi().Gerak(); // Melata

        System.out.println("\nTes 4");
        anu.setIsi(new Burung("Perkutut")); // Burung
        anu.getIsi().Bersuara(); // Cuit
        anu.getIsi().Gerak(); // Terbang
    }
}