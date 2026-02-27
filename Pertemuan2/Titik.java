/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 27 Februari 2026
*/

public class Titik {
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // Konstruktor
    Titik() {
        this(0,0);
        counterTitik++;
    }

    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Method
    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik t) {
        return Math.sqrt(Math.pow(absis - t.absis, 2) + Math.pow(ordinat - t.ordinat, 2));
    }

    void refleksiX() {
        ordinat = -ordinat;
    }

    void refleksiY() {
        absis = -absis;
    }

    Titik getRefleksiX() {
        return new Titik(-absis, ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(absis, -ordinat);
    }

    void printCounterTitik() {
        System.out.println(this.counterTitik);
    }
}