/* Nama File    : MOperatorGenerik.java
 * Deskripsi    : berisi main class OperatorGenerik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 2 Mei 2026
*/

public class MOperatorGenerik {
    public static void main(String[] args) {
        OperatorGenerik OG;
        Datum<Integer> angka1; Datum<Integer> angka2; // Integer
        Datum<String> string1; Datum<String> string2; // String
        Datum<Anabul> anabul1; Datum<Anabul> anabul2; // Anabul
        Datum<Kucing> kucing1; Datum<Kucing> kucing2; // kucing

        OG = new OperatorGenerik();
        
        System.out.println("=== Integer ===");
        angka1 = new Datum<>(); angka2 = new Datum<>();
        angka1.setIsi(10); angka2.setIsi(11);
        System.out.println("Sebelum Tukar: " + angka1.getIsi() + ", " + angka2.getIsi());
        OG.Tukar(angka1, angka2);        
        System.out.println("Setelah Tukar: " + angka1.getIsi() + ", " + angka2.getIsi());

        System.out.println("\n=== String ===");
        string1 = new Datum<>(); string2 = new Datum<>();
        string1.setIsi("Meja"); string2.setIsi("Kursi");
        System.out.println("Sebelum Tukar: " + string1.getIsi() + ", " + string2.getIsi());
        OG.Tukar(string1, string2);
        System.out.println("Setelah Tukar: " + string1.getIsi() + ", " + string2.getIsi());

        System.out.println("\n=== Anabul ===");
        anabul1 = new Datum<>(); anabul2 = new Datum<>();
        anabul1.setIsi(new Kucing("Oliver", 5.5)); anabul2.setIsi(new Anjing("Charlie"));
        System.out.println("Sebelum Tukar: " + anabul1.getIsi().getNama() + ", " + anabul2.getIsi().getNama());
        OG.Tukar(anabul1, anabul2);
        System.out.println("Setelah Tukar: " + anabul1.getIsi().getNama() + ", " + anabul2.getIsi().getNama());

        System.out.println("\n=== Bobot2 ===");
        kucing1 = new Datum<>(); kucing2 = new Datum<>();
        kucing1.setIsi(new Kucing("Leo", 7.5)); kucing2.setIsi(new KembangTelon("Jack", 6.0));
        System.out.println("Hasil Penjumlahan Bobot: " + OG.Bobot2(kucing1, kucing2));
    }
}