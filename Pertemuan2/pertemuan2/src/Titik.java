/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 27 Februari 2026
*/

public class Titik {
    // Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // Konstruktor
    public Titik(){
        this(0,0);
        counterTitik++;
    }

    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Method
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public int getKuadran() {
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

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
}