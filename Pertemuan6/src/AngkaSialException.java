/* Nama File    : AngkaSialException.java
 * Deskripsi    : eksepsi buatan sendiri, menolak input angka 13
 * Pembuat      : Husein Avicenna
 * Tanggal      : 16 April 2026
*/

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("Jangan memasukan angka 13 karena angka sial!!!");
    }
}