public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    Titik(double x, double y) {
    absis = x;
    ordinat = y;
    counterTitik++; 
}

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    int getKuadran() {
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

    double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    double getJarak(Titik T) {
        double jarakX = this.absis - T.absis;
        double jarakY = this.ordinat - T.ordinat;
        return Math.sqrt((jarakX * jarakX) + (jarakY * jarakY));
    }

    void refleksiX() {
        this.ordinat = this.ordinat * -1;
    }

    void refleksiY() {
        this.absis = this.absis * -1;
    }

    Titik getRefleksiX() {
        return new Titik(absis, ordinat * (-1));
    }

    Titik getRefleksiY() {
        return new Titik(this.absis * -1, this.ordinat);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik() {
        System.out.println(counterTitik);
    }
} //end class Titik