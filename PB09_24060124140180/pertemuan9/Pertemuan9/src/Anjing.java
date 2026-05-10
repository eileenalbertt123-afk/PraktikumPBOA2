// kelas anak: anjing
public class Anjing extends Anabul {
    // method
    //konstruktor
    public Anjing(String a){
        this.panggilan = a;
    }
    
    // method gerak
    void gerak (){
        System.out.println("Anjing bergerak dengan melata");
    }

    // method suara
    void suara(){
        System.out.println("Anjing bersuara guk-guk");
    }

}