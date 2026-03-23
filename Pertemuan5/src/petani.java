/*
Nama File   : PNS.java
Deskripsi   : Berisi atribut dan method untuk kelas petani
Pembuat     : Eileen 24060124140180
Tanggal     : 22 Maret 2026
*/


public class petani extends Manusia implements Pajak {
    /********ATRIBUT*****/
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 1; //digit nim ke 12

    /********METHOD*******/
    //konstruktor untuk membuat petani tanpa parameter
    public petani(){
        counterPetani++;
    }

    //konstruktor untuk membuat petani dengan parameter
    public petani(String a, String b, String c, double d, String e){
        super(a,b,c,d);
        this.asal_kota = e;
        counterPetani ++;
    }

    //mengembalikan jumlah objek petani
    public static int getCounterPetani(){
        return counterPetani;
    }

    //mengembalikan asal kota
    public String getAsalKota(){
        return asal_kota;
    }

    //mengeset asal kota
    public void setAsalKota(String x){
        this.asal_kota = x;
    }

    //override
    //menghitung masa kerja
    public int hitungMasaKerja() {
        return hitungSelisihTahun() + C;
    }

    //override
    //mengitung pajak
    public double hitungPajak(){
        return 0;
    }

    //override
     public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
     }

}
