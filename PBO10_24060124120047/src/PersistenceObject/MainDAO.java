/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenceObject;

/*  Nama File   : MainDAO.java 
    Deskripsi   : Main program untuk akses DAO
    Pembuat     : Husein Avicenna - 24060124120047
    Tanggal     : 20 Mei 2026
*/

public class MainDAO {
    public static void main(String[] args) {
        Person person= new Person("Husein");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}