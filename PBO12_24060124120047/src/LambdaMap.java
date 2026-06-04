/* Nama File    : LambdaMap.java
 * Deskripsi    : Implementasi lambda pada Map, digunakan untuk menampilkan key dan value
 * Pembuat      : Husein Avicenna
 * Tanggal      : 04 Juni 2026
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124120047", "Husein Avicenna");
        mahasiswaMap.put("24060124120001", "Adi");
        mahasiswaMap.put("24060124120002", "Bambang");
        mahasiswaMap.put("24060124120003", "Cici");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}