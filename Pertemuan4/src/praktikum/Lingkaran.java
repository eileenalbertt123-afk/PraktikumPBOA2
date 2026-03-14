/*
Nama File   : Lingkaran.java
Deskripsi   : Berisi atribut dan method untuk kelas Lingkaran
Pembuat     : Eileen 24060124140180
Tanggal     : 9 Maret 2026
*/
package praktikum;

public class Lingkaran extends BangunDatar {
    /********ATRIBUT*********/
    private double jari;

    //*******METHOD********/

    //Konstruktor untuk membuat Lingkaran tanpa parameter
    public Lingkaran(){
    }

    //Konstruktor untuk membuat Persegi dengan parameter diameter,warna dan border
    public Lingkaran (double a, String b, String c){
        this.jari = a/2;
        setWarna(b);
        setBorder(c);
        setJmlSisi(1);
    }

    //Mengembalikan nilai jari-jari
    public double getJari(){
        return this.jari;
    }

    //Mengeset nilai jari
    public void setJari(double x){
        this.jari = x;
    }

    //mengembalikan nilai luas lingkaran
    public double getLuasLingkaran(){
    return Math.PI * jari * jari;
    }

    //mengembalikan nilai keliling lingkaran
    public double getKelilingLingkaran(){
    return 2* Math.PI * jari;
    }   

    //Override
    //Menampilkan info lingkaran
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}


