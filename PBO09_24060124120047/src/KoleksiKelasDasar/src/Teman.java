/* Nama File    : Teman.java
 * Deskripsi    : class koleksi teman yang berfungsi sebagai antrian untuk menyimpan objek-objek Teman
 * Pembuat      : Husein Avicenna
 * Tanggal      : 7 Mei 2026
*/

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> lNama;

    public Teman() {
        lNama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        return lNama.get(indeks);
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            lNama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        lNama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (lNama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return lNama.contains(nama);
    }

    public void gantiNama(String namaLama, String namaBaru) {
        int idx = lNama.indexOf(namaLama);
        if (idx != -1) {
            lNama.set(idx, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : lNama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for (String nama : lNama) {
            System.out.println(nama);
        }
    }
}