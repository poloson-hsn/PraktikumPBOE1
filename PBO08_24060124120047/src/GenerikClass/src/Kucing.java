/* Nama File    : Kucing.java
 * Deskripsi    : class Kucing sebagai subclass dari class Anabul
 * Pembuat      : Husein Avicenna
 * Tanggal      : 30 April 2026
*/

public class Kucing extends Anabul {
    private double Bobot;

    public Kucing() {
        super();
        this.Bobot = 0.0;
    }

    public Kucing(String Nama, double Bobot) {
        super(Nama);
        this.Bobot = Bobot;
    }

    public double getBobot() {
        return this.Bobot;
    }

    public void setBobot(double Bobot) {
        this.Bobot = Bobot;
    }
    
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
}