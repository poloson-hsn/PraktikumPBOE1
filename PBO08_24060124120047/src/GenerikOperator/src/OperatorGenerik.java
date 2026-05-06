/* Nama File    : OperatorGenerik.java
 * Deskripsi    : berisi fungsi dan prosedur generik
 * Pembuat      : Husein Avicenna
 * Tanggal      : 2 Mei 2026
*/

public class OperatorGenerik {
    public <G> void Tukar(Datum<G> A, Datum<G> B) {
        G temp = A.getIsi();
        A.setIsi(B.getIsi());
        B.setIsi(temp);;
    }

    public <G extends Kucing> double Bobot2(Datum<G> K1, Datum<G> K2) {
        return K1.getIsi().getBobot() + K2.getIsi().getBobot();
    }
}