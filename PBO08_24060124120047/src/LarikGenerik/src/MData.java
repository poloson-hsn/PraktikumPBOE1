/* Nama File    : MData.java
 * Deskripsi    : berisi main class Data
 * Pembuat      : Husein Avicenna
 * Tanggal      : 2 Mei 2026
*/

public class MData {
    public static void main(String[] args) {
        Data<Anabul> D;
        Anabul anabul;
        Kucing K;

        D = new Data<>();
        K = new Kucing("Simba", 5.0);

        D.setIsi(1, K);
        System.out.println("Size D setelah setIsi ke-1: " + D.getSize());
        D.setIsi(2, new Anjing("Sadie"));
        System.out.println("Size D setelah setIsi ke-2: " + D.getSize());
        D.setIsi(5, new Burung("Kakatua"));
        System.out.println("Size D setelah setIsi ke-3: " + D.getSize());

        System.out.println("\n=== Data Posisi ke-1 ===");
        anabul = D.getIsi(1);
        System.out.println("Nama: " + anabul.getNama());
        System.out.print("Suara: "); anabul.Bersuara();
        System.out.print("Gerak: "); anabul.Gerak();

        System.out.println("\n=== Data Posisi ke-2 ===");
        anabul = D.getIsi(2);
        System.out.println("Nama: " + anabul.getNama());
        System.out.print("Suara: "); anabul.Bersuara();
        System.out.print("Gerak: "); anabul.Gerak();

        System.out.println("\n=== Data Posisi ke-3 ===");
        anabul = D.getIsi(3);
        System.out.println("Data posisi ke-3: " + anabul);

        System.out.println("\n=== Data Posisi ke-5 ===");
        anabul = D.getIsi(5);
        System.out.println("Nama: " + anabul.getNama());
        System.out.print("Suara: "); anabul.Bersuara();
        System.out.print("Gerak: "); anabul.Gerak();
    }
}