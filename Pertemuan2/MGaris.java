/* Nama File    : MGaris.java
 * Deskripsi    : berisi program utama untuk menggunakan class Garis
 * Pembuat      : Husein Avicenna
 * Tanggal      : 27 Februari 2026
*/

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        G1.getTitikAwal();
        G1.getTitikAkhir();
        G1.printGaris();

        G1.setTitikAwal(new Titik(1,1));
        G1.setTitikAkhir(new Titik(2,2));
        G1.printGaris();

        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());

        System.out.println("Gradien G1 = " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.println("Titik tengah G1:");
        tengah.printTitik();

        Titik A = new Titik(1,0);
        Titik B = new Titik(2,1);
        Garis G2 = new Garis(A,B);

        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("Persamaan garis G1:");
        G1.getPersamaanGaris();
    }
}
