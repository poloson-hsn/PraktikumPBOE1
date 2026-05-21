/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenceObject;

/*  Nama File   : Person.java 
    Deskripsi   : Person database model
    Pembuat     : Husein Avicenna - 24060124120047
    Tanggal     : 20 Mei 2026
*/

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public Person(int i, String n) {
        this.id = i;
        name = n;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }
}