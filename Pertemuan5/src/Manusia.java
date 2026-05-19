/*
Nama File   : Manusia.java
Deskripsi   : Berisi atribut dan method untuk kelas Manusia
Pembuat     : Eileen 24060124140180
Tanggal     : 22 Maret 2026
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Manusia {
    /*********ATRIBUT**********/
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMhs = 0;

    /*********METHODS**********/
    //konstruktor untuk membuat Manusia tanpa parameter
    public Manusia(){
        counterMhs ++;
    };

    //konstruktor untuk membuat Manusia dengan parameter nama, tgl mulai kerja, alamat, pendapatan
    public Manusia(String a, String b, String c, double d){
        this.nama = a;
        this.tgl_mulai_kerja = LocalDate.parse(b, DateTimeFormatter.ofPattern("dd-MM-yyyy"));;
        this.alamat = c;
        this.pendapatan = d;
        counterMhs++;
    }

    //Mengembalikan nilai nama
    public String getNama(){
        return nama;
    }

    //Mengeset nilai nama
    public void setNama(String x){
        this.nama = x;
    }

    //Mengembalikan nilai tanggal mulai kerja
    public LocalDate getTgl_Mulai_Kerja(){
        return tgl_mulai_kerja;
    }

    //Mengeset nilai tanggaal mulai kerja
    public void setTgl_Mulai_Kerja(LocalDate y){
        this.tgl_mulai_kerja = y;
    }

    //Mengembalikan nilai alamat
    public String getAlamat(){
        return alamat;
    }

    //Mengeset nilai alamat
    public void setAlamat(String z){
        this.alamat = z;
    }

    //Mengembalikan nilai pendapatn
    public double getPendapatan(){
        return pendapatan;
    }

    //Mengeset nilai pendapatan
    public void setPendapatan (double a){
        this.pendapatan = a;
    }

    //mengembalikan jumlah objek manusia
    public static int getCounterMhs(){
        return counterMhs;
    }

    // menampilkan info manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Mulai Kerja: " + tgl_mulai_kerja);
    }

    //menghitung lama kerja (dalam tahun)
    public int hitungSelisihTahun(){
        return LocalDate.now().getYear() - tgl_mulai_kerja.getYear();
    }

    //abstract method karena implementasinya berbeda untuk tiap subclass
    public abstract int hitungMasaKerja();
    
}
