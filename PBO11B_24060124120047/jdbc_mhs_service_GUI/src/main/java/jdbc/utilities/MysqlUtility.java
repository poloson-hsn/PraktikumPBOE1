/*  Nama File   : MysqlUtility.java 
    Deskripsi   : Kelas ini digunakan untuk mengelola koneksi dengan basis data yang digunakan
    Pembuat     : Husein Avicenna - 24060124120047
    Tanggal     : 21/05/2026
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                // sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/pbo_modularisasi";
                
                // sesuaikan username dan password
                String user = "root";
                String password = "farhan137";
                koneksi = DriverManager.getConnection(url, user, password);            
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi: " + sqle.getMessage());
            }
        }
        
        return koneksi;
    }
}
