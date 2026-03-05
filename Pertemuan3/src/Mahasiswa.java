/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Husein Avicenna
 * Tanggal      : 5 Maret 2026
*/

import java.util.ArrayList;

public class Mahasiswa {
    // atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<Matkul> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // method
    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNIM(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public int getJumlahSks(){
        int i;
        int count = 0;

        for(i = 0; i <listMatkul.size(); i++){
            count = count + listMatkul.get(i).getSks();
        }

        return count;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    } 

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(Matkul newMatkul){
        listMatkul.add(newMatkul);
    }

    public void printMhs(){
        System.out.println("NIM :" + this.nim);
        System.out.println("Nama :" + this.nama);
        System.out.println("Prodi :" + this.prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM :" + this.nim);
        System.out.println("Nama :" + this.nama);
        System.out.println("Prodi :" + this.prodi);
        System.out.println("Detail mata kuliah: ");
        int i;
        for (i = 0; i < listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Nama dosen wali: " + dosenWali.getNama());
        System.out.println("NIP dosen wali: " + dosenWali.getNIP());
        System.out.println("Jenis kendaraan: " + kendaraan.getJenis());
        System.out.println("No plat kendaraan: " + kendaraan.getNoPlat());
    }
}