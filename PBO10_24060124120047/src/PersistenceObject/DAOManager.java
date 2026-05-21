/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenceObject;

/*  Nama File   : DAOManager.java 
    Deskripsi   : pengelola DAO dalam program
    Pembuat     : Husein Avicenna - 24060124120047
    Tanggal     : 20 Mei 2026
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        this.personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return this.personDAO;
    }
}