/*
Nama File   : Persegi.java
Deskripsi   : Berisi atribut dan method untuk kelas Persegi
Pembuat     : Eileen 24060124140180
Tanggal     : 9 Maret 2026
*/
package praktikum;

public class Persegi extends BangunDatar {
    /********ATRIBUT*********/
    private double sisi;
    private static int counterBangunDatar = 0;

    //*******METHOD********/

    //Konstruktor untuk membuat Persegi tanpa parameter
    public Persegi(){
        counterBangunDatar++;
    }

    //Konstruktor untuk membuat Persegi dengan parameter sisi,warna dan border
    public Persegi (double a, String b, String c){
        super(4,b,c);
        this.sisi = a;
        counterBangunDatar ++;
    }

    //Mengembalikan nilai sisi
    public double getSisi(){
        return this.sisi;
    }

    //Mengeset nilai sisi
    public void setSisi(double x){
        this.sisi = x;
    }

    //mengembalikan nilai luas
    public double getLuas(){
    return sisi * sisi;
    }

    //mengembalikan nilai keliling
    public double getKeliling(){
    return 4 * sisi;
    }   

    //mengembalikan nilai diagonal
    public double getDiagonal(){
    return sisi*Math.sqrt(2);
    }
    
    //Override
    //Menampilkan info persegi
    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    //Override
    //menampilkan jumlah bangun datar
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Persegi: " + counterBangunDatar);
    }
}
