/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Husein Avicenna
 * Tanggal      : 16 April 2026
*/

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        this.warna = warna;
        setBorder(border);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return 3.14 * (this.jari*this.jari);
    }

    public double getKeliling(){
        return 2 * 3.14 * this.jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}