/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialize;

/*  Nama File   : Serialize.java 
    Deskripsi   : program untuk serialisasi objek Person
    Pembuat     : Husein Avicenna - 24060124120047
    Tanggal     : 20 Mei 2026
*/

import java.io.*;

// class Person
class Person implements Serializable {
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Avicenna");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}