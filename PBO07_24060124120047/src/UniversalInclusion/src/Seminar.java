/* Nama File    : Seminar.java
 * Deskripsi    : class Seminar untuk mengelola peserta seminar, yaitu Dosen dan Mahasiswa
 * Pembuat      : Husein Avicenna
 * Tanggal      : 25 April 2026
*/

public class Seminar {
    public CivitasAkademika[] pesertas;
    public int banyakPeserta;

    public Seminar() {
        this.pesertas = new CivitasAkademika[100];
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(CivitasAkademika peserta) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Kuota seminar sudah penuh");
        }
    }

    public void tampilPeserta() {
        int i;

        for (i = 0; i < banyakPeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor() + ", Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int i, count;

        count = 0;
        for (i = 0; i < pesertas.length; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }

        return count;
    }
}