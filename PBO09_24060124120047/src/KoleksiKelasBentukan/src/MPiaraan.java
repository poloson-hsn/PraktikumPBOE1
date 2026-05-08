/* Nama File    : Piaraan.java
 * Deskripsi    : berisi main class Piaraan
 * Pembuat      : Husein Avicenna
 * Tanggal      : 7 Mei 2026
*/

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();
        Anjing a1 = new Anjing("Buba");
        Burung b1 = new Burung("Tweety");
        Kucing k1 = new Kucing("Fluffy", 2.7);
        Anggora a2 = new Anggora("Kuro", 4.5);
        KembangTelon k2 = new KembangTelon("Sakura", 3.2);

        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);
        p.enqueueAnabul(k1);
        p.enqueueAnabul(a2);
        p.enqueueAnabul(k2);

        System.out.println("Daftar Anabul:");
        p.showAnabul();
        System.out.println("\nJumlah elemen:");
        System.out.println(p.getNbelm());
        System.out.println("\nAnabul pertama:");
        System.out.println(p.getAnabul().getNama());
        System.out.println("\nJumlah keluarga kucing:");
        System.out.println(p.countKucing());
        System.out.println("\nTotal bobot keluarga kucing:");
        System.out.println(p.bobotKucing() + " kg");
        System.out.println("\nJenis tiap Anabul:");
        p.showJenisAnabul();
        System.out.println("\nDequeue:");
        System.out.println(p.dequeueAnabul().getNama());
        System.out.println("\nIsi antrean sekarang:");
        p.showAnabul();
    }
}