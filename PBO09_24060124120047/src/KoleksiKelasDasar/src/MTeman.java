/* Nama File    : MTeman.java
 * Deskripsi    : berisi main class Teman
 * Pembuat      : Husein Avicenna
 * Tanggal      : 7 Mei 2026
*/

public class MTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Bagas");
        teman.addNama("Cut");
        teman.addNama("Devin");
        teman.addNama("Budi");
        teman.addNama("Andi");

        System.out.println("Daftar teman setelah add:");
        teman.showTeman();
        System.out.println("Jumlah teman: " + teman.getNbelm());

        System.out.println("\nApakah Cut anggota? " + teman.isMember("Cut"));
        System.out.println("Jumlah nama Bagas: " + teman.countNama("Bagas"));

        teman.setNama(1, "Ubet");
        System.out.println("\nDaftar teman setelah mengganti index 1 menjadi Ubet:");
        teman.showTeman();

        teman.gantiNama("Budi", "Bambang");
        System.out.println("\nDaftar teman setelah ganti nama Budi menjadi Bambang:");
        teman.showTeman();

        teman.delNama("Devin");
        System.out.println("\nDaftar teman setelah menghapus Devin:");
        teman.showTeman();
        System.out.println("Jumlah teman sekarang: " + teman.getNbelm());
    }
}