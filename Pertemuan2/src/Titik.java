/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Eileen 240601241401880
 * Tanggal      : 23 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    public Titik(double x, double y) {
    absis = x;
    ordinat = y;
    counterTitik++; 
}

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; 
        }
    }

    public double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    public double getJarak(Titik T) {
        double jarakX = this.absis - T.absis;
        double jarakY = this.ordinat - T.ordinat;
        return Math.sqrt((jarakX * jarakX) + (jarakY * jarakY));
    }

    public void refleksiX() {
        this.ordinat = this.ordinat * -1;
    }

    public void refleksiY() {
        this.absis = this.absis * -1;
    }

    public Titik getRefleksiX() {
        return new Titik(absis, ordinat * (-1));
    }

    public Titik getRefleksiY() {
        return new Titik(this.absis * -1, this.ordinat);
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik() {
        System.out.println(counterTitik);
    }
} //end class Titik