// kelas anak: kucing
public class Kucing extends Anabul {
    // atribut
    double bobot;
    // method
    //konstruktor
    public Kucing(String a, double b){
        this.panggilan = a;
        this.bobot = b;
    }
    
    // method gerak
    void gerak (){
        System.out.println("Kucing bergerak dengan melata");
    }

    // method suara
    void suara(){
        System.out.println("Kucing bersuara meong");
    }

    //mengembalikan bobot
    double getBobot(){
        return this.bobot;
    }
}