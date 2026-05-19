/*
Nama File   :Kendaraan.java
Deskripsi   :Atribut dan method dari class Kendaraan
Pembuat     :Eileen 24060124140180
Tanggal     :8 Maret 2026
 */

public class Kendaraan {
    /*******ATRIBUT*********/
    private String noPlat;
    private String jenis;

    /*******METHOD**********/
    //Konstruktor Kendaraan tanpa parameter
    public Kendaraan(){

    }

    //Konstruktor Kendaraan dengan parameter noPlat dan jenis
    public Kendaraan(String a, String b){
        this.noPlat = a;
        if (b.equalsIgnoreCase("Motor")|| b.equalsIgnoreCase("Mobil")) //agar nilai yang dimasukan sesuai syarat yaitu hanya boleh motor/mobil
            this.jenis=b;
        else{
            System.out.println("Jenis Kendaraan hanya boleh Motor atau Mobil");
        }
    }

    //Mengembalikan nilai noPlat
    public String getNoPlat(){
        return this.noPlat;
    }

    //Mengembalikan nilai jenis kendaraan
    public String getJenis(){
        return this.jenis;
    }

    //Mengeset nilai noPlat
    public void setNoPlat(String x){
        this.noPlat = x;
    }

    //Mengeset nilai jenis kendaraan
    public void setJenis(String y){
        if (y.equalsIgnoreCase("Motor") || y.equalsIgnoreCase("Mobil")) //agar nilai yang dimasukan sesuai syarat yaitu hanya boleh motor/mobil
            this.jenis = y;
        else {
            System.out.println("Jenis kendaraan hanya boleh mobil atau motor");
        }
    }
}

