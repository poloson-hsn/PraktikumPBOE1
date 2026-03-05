/* Nama File    : Matkul.java
 * Deskripsi    : berisi atribut dan method dalam class Matkul
 * Pembuat      : Husein Avicenna
 * Tanggal      : 5 Maret 2026
*/

public class Matkul {
    private String idMatkul;
    private String nama;
    private int sks;

    public Matkul(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public Matkul(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}