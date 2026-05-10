// kelas anak: burung
public class Burung extends Anabul {
    // method
    //konstruktor
    public Burung(String a){
        this.panggilan = a;
    }

    // method gerak
    void gerak (){
        System.out.println("Burung bergerak dengan terbang");
    }

    // method suara
    void suara(){
        System.out.println("Burung bersuara cuit");
    }

}