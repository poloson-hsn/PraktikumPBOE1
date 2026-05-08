/* Nama File    : Piaraan.java
 * Deskripsi    : class Piaraan yang berfungsi sebagai antrian untuk menyimpan objek-objek Anabul
 * Pembuat      : Husein Avicenna
 * Tanggal      : 7 Mei 2026
*/

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> lAnabul;

    public Piaraan() {
        lAnabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        lAnabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return lAnabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return lAnabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul temp = lAnabul.poll();
        if (temp != null) {
            nbelm--;
        }
        return temp;
    }

    public void showAnabul() {
        for (Anabul a : lAnabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : lAnabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for (Anabul a : lAnabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : lAnabul) {
            System.out.println(
                a.getNama() + " -> " +
                a.getClass().getSimpleName()
            );
        }
    }
}