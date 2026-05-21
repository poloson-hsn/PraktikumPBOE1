/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PersistenceObject;

/*  Nama File   : PersonDAO.java 
    Deskripsi   : interface untuk person access object
    Pembuat     : Husein Avicenna - 24060124120047
    Tanggal     : 20 - 05 - 2026
*/

public interface  PersonDAO {
    public void savePerson(Person p) throws Exception;
}