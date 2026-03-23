/*
Nama File   : BangunDatar.java
Deskripsi   : Berisi atribut dan method untuk kelas BangunDatar
Pembuat     : Eileen 24060124140180
Tanggal     : 9 Maret 2026
*/
package praktikum;

abstract class BangunDatar {
    /********ATRIBUT*********/
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    //*******METHOD********/

    //Konstruktor untuk membuat BangunDatar tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    //Konstruktor untuk membuat BangunDatar dengan parameter jmlSisi,warna dan border
    public BangunDatar (int a, String b, String c){
        this.jmlSisi = a;
        this.warna = b;
        this.border = c;
        counterBangunDatar++;
    }

    //menampilkan jumlah bangun datar
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    //Mengembalikan jlmSisi
    public int getJmlSisi(){
        return this.jmlSisi;
    }

    //Mengembalikan warna
    public String getWarna(){
        return this.warna;
    }

    //Mengembalikan border
    public String getBorder(){
        return this.border;
    }

    //Mengeset jmlSisi
    public void setJmlSisi(int x){
        this.jmlSisi = x;
    }

    //Mengeset warna
    public void setWarna(String y){
        this.warna = y;
    }

    //Mengeset border
    public void setBorder(String z){
        this.border = z;
    }

    //Menampilkan Info BangunDatar
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    //abstract method
    public abstract double getLuas();

    //abstarct method
    public abstract double getKeliling();

    //Method tambahan untuk mengecek apakah sebuah objek bangyn datar memiliki luas yang sama dengan bangun datar lainnya
    public boolean isEqualLuas(BangunDatar X){ 
        return this.getLuas() == X.getLuas(); 
    } 
}