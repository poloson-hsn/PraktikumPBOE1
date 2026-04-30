/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : program penggunaan eksepsi menggunakan calss library Java
 * Pembuat      : Husein Avicenna
 * Tanggal      : 16 April 2026
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayIntegers = new Integer[4];
        try {
            arrayIntegers[2] = 1;
            arrayIntegers[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code ...");
        }
    }
}