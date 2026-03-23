/*
Nama File   : PNS.java
Deskripsi   : Berisi atribut dan method untuk kelas PNS
Pembuat     : Eileen 24060124140180
Tanggal     : 22 Maret 2026
*/

public class PNS extends Manusia implements Pajak {
    /********ATRIBUT***********/
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 0; //digit nim ke-14

    /*******METHODS***********/
    //konstruktor untuk membuat kelas PNS tanpa parameter
    public PNS(){
        counterPNS++;
    }

    //konstruktor untuk membuat kelas PNS dengan parameter
    public PNS(String a, String b, String c, double d, String e){
    super (a,b,c,d);
    this.nip = e;
    counterPNS++;
    }

    //mengembalikan nilai nip
    public String getNIP(){
        return nip;
    }

    //mengeset nilai nip
    public void setNIP(String a){
        this.nip = a;
    }

    //mengembalikan jumlah objek PNS
    public static int getCounterPNS(){
        return counterPNS;
    }

    //override
    //menghitung masa kerja + digit ke-14 nim
    public int hitungMasaKerja(){
        return hitungSelisihTahun() + A;
    }

    //override
    //menghitung pajak
    public double hitungPajak(){
        return 0.10 * getPendapatan();
    }

    //override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }

}
