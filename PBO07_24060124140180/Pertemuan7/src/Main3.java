/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 20 April 2026
Keterangan: No 3
 */

//kelas induk anabul
class Anabul {
    //atribut 
    String nama;

    //method
    //method gerak
    void gerak (){
    }

    //method suara
    void suara(){

    }
}

// kelas anak: kucing
class Kucing extends Anabul {
    //method
    //method gerak
    void gerak (){
        System.out.println("Kucing bergerak dengan melata");
    }

    //method suara
    void suara(){
        System.out.println("Kucing bersuara meong");
    }

}

// kelas anak: anjing
class Anjing extends Anabul {
    //method
    //method gerak
    void gerak (){
        System.out.println("Anjing bergerak dengan melata");
    }

    //method suara
    void suara(){
        System.out.println("Anjing bersuara guk-guk");
    }

}

// kelas anak: burung
class Burung extends Anabul {
    //method
    //method gerak
    void gerak (){
        System.out.println("Burung bergerak dengan terbang");
    }

    //method suara
    void suara(){
        System.out.println("Burung bersuara cuit");
    }

}

public class Main3 {
    public static void main(String[] args) {
    // membuat objek
        Anabul k = new Kucing();
        Anabul a = new Anjing();
        Anabul b = new Burung();

        // simulasi
        k.suara();
        k.gerak();

        a.suara();
        a.gerak();
        
        b.suara();
        b.gerak();
    
}
}
