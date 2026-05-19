package pertemuan10;

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            // Membuka file person.ser yang sudah dibuat sebelumnya
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            
            // Membaca objek dari dalam file dan melakukan casting ke class Person
            person = (Person) s.readObject();
            
            s.close();
            
            // Membuktikan bahwa objek berhasil dibaca
            System.out.println("Objek Person berhasil dibaca dari file!");
            System.out.println("Nama yang tersimpan adalah: " + person.getName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}