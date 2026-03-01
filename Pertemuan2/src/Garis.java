/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Eileen 240601241401880
 * Tanggal      : 1 Maret 2026
 */
public class Garis {
    /***************ATRIBUT***************/
    Titik titik_awal;
    Titik titik_akhir;
    static int counterGaris = 0;
    
    /***************METHOD***************/
    //konstruktor untuk membuat Garis
    Garis() {
        titik_awal = new Titik(0,0);
        titik_akhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik T1, Titik T2) {
    titik_awal = T1;
    titik_akhir = T2; 
    counterGaris++;
}

    //mengembalikan nilai titik awal
    Titik getTitikAwal() {
        return titik_awal;
    }

    //mengembalikan nilai titik akhir
    Titik getTitikAkhir() {
        return titik_akhir;
    }
    static int getCounterGaris(){
        return counterGaris;
    }

    //mengeset titik awal dengan nilai baru T1
    void setTitikAwal(Titik T1) {
        titik_awal = T1;
    }

    //mengeset titik akhir dengan nilai baru T2
    void setTitikAkhir(Titik T2) {
        titik_akhir = T2;
    }

    //mendapatkan panjang sebuah garis
    double getPanjang () {
        double x1 = titik_awal.absis;
        double x2 = titik_akhir.absis;
        double y1 = titik_awal.ordinat;
        double y2 = titik_akhir.ordinat;
        return Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
    }

    //mendapatkan gradien sebuah garis
    double getGradien () {
        double x1 = titik_awal.absis;
        double x2 = titik_akhir.absis;
        double y1 = titik_awal.ordinat;
        double y2 = titik_akhir.ordinat;
        if (x2-x1 == 0){
            return Double.POSITIVE_INFINITY; //tak hingga
        }
        return (y2-y1)/(x2-x1);
    }

    //mendapatkan titik tengah sebuah garis
    Titik getTitikTengah () {
        double x1 = titik_awal.absis;
        double x2 = titik_akhir.absis;
        double y1 = titik_awal.ordinat;
        double y2 = titik_akhir.ordinat;
        return new Titik((x1+x2)/2, (y1+y2)/2);
    }

    //mengecek apakah garis tsb sejajar dengan garis lainnya 
    boolean isSejajar (Garis G) {
        return this.getGradien()==G.getGradien();
    }

    //mengecek apakah garis tsb tegak lurus dengan garis lainnya 
    boolean isTegakLurus (Garis G) {
        return this.getGradien()*G.getGradien() == -1;
    }

    //menampilkan ke layar titik awal dan titik akhir garis
    void printGaris () {
        System.out.println("Titik Awal : (" + titik_awal.absis + "," + titik_awal.ordinat + ")");
        System.out.println("Titik Akhir : (" + titik_akhir.absis + "," + titik_akhir.ordinat + ")");
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c.
    String getPersamaanGaris() {

    double x1 = titik_awal.absis;
    double y1 = titik_awal.ordinat;

    //garis vertikal
    if (getGradien() == Double.POSITIVE_INFINITY) {
        return "x = " + x1;
    }

    double m = getGradien();
    double c = y1 - m * x1;

    if (c >= 0) {
        return "y = " + m + "x + " + c;
    } else {
        return "y = " + m + "x - " + Math.abs(c);
    }
}
}