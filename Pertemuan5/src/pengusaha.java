/*
Nama File   : pengusaha.java
Deskripsi   : Berisi atribut dan method untuk kelas pengusaha
Pembuat     : Eileen 24060124140180
Tanggal     : 22 Maret 2026
*/


public class pengusaha extends Manusia implements Pajak {
    //***********ATRIBUT*********/
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 8; //digit ke-13 nim

    //**********METHODS************/
    //konstruktor untuk mmebuat  pengusaha tanpa parameter
    public pengusaha(){
        counterPengusaha ++;
    }

    //konstruktor untuk membuat pengusaha dengan parameter
    public pengusaha(String a, String b, String c, double d, String e){
        super (a,b,c,d);
        this.npwp = e;
        counterPengusaha++;
    }

    //mengembalikan jumlah objek pengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    //mengembalikan nilai npwp
    public String getNPWP(){
        return npwp;
    }

    //mengeset nilai npwp
    public void setNPWP(String x){
        this.npwp = x;
    }
    
    //override
    //menghitung masa kerja 
    public int hitungMasaKerja(){
        return hitungSelisihTahun() + B;
    }

    //override
    //hitung nilai pajak
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    //override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }

}
