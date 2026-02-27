/* Nama File    : MTitik.java
 * Deskripsi    : berisi main class Titik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 27 Februari 2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        System.out.println("Titik T1: ");
        T1.printTitik();
        System.out.println("\nSet titik T1 menjadi x=2, y=3: ");
        T1.setAbsis(2);
        T1.setOrdinat(3);
        T1.printTitik();
        System.out.println("\nGeser titik T1 1 langkah ke kanan dan ke atas: ");
        T1.geser(1, 1);
        T1.printTitik();
        System.out.println("\nKuadran T1: " + T1.getKuadran());
        System.out.println("Jarak pusat ke T1: " + T1.getJarakPusat());

        Titik T2 = new Titik(9, 12);
        System.out.println("\nTitik T2: ");
        T2.printTitik();
        System.out.println("\nJarak T1 ke T2: " + T1.getJarak(T2));
        System.out.println("\nRefleksi Titik T1 terhadap X");
        T1.refleksiX();
        T1.printTitik();
        System.out.println("\nRefleksi Titik T1 terhadap Y");
        T1.refleksiY();
        T1.printTitik();
        System.out.println("\nFungsi Refleksi X T1 (Titik baru): ");
        T1.getRefleksiX().printTitik();
        System.out.println("\nFungsi Refleksi Y T1 (Titik Baru): ");
        T1.getRefleksiY().printTitik();
        System.out.println("\nJumlah Titik: " + Titik.getCounterTitik());
    }
}