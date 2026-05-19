package tugas;
/*
Nama File   : Pegawai.java
Deskripsi   : Berisi atribut dan method untuk kelas Pengawai
Pembuat     : Eileen 24060124140180
Tanggal     : 13 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    //********ATRIBUT********/
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private double gajiPokok;

    //********METHODS**********/
    //Konstruktor untuk membuat Pngawai tanpa parameter
    public Pegawai(){

    }

    //Konstruktor untuk membuat Pegawai dengan parameter NIP,nama,tanggal lahir, TMT, dan gaji pokok
    public Pegawai(String a, String b, LocalDate c, LocalDate d, double e){
        this.NIP = a;
        this.nama = b;
        this.tanggalLahir = c;
        this.TMT = d;
        this.gajiPokok = e;
    }

    //Mengembalikan nilai NIP
    public String getNIP(){
        return this.NIP;
    }

    //Mengeset nilai NIP
    public void setNIP(String a){
        this.NIP = a;
    }

    //mengembalikan nilai nama
    public String getNama(){
        return this.nama;
    }

    //mengeset nilai nama
    public void setnama(String b){
    this.nama = b;
    }

    //mengembalikan nilai tanggal lahir
    public LocalDate gettanggalLahir(){
        return this.tanggalLahir;
    }

    //mengeset nilai tanggal lahir
    public void settanggalLahir(LocalDate c){
        this.tanggalLahir = c;
    }

    //mengembalikan nilai TMT
    public LocalDate getTMT(){
        return this.TMT;
    }

    //mengeset nilai TMT
    public void setTMT(LocalDate d){
        this.TMT = d;
    }

    //mengembalikan nilai gaji pokok
    public double getgajiPokok(){
        return this.gajiPokok;
    }

    //mengeset nilai gaji pokok
    public void setgajiPokok(double e){
        this.gajiPokok = e;  
    }

    //mengembalikan masa kerja (waktu sekarang - TMT)
    public Period getmasaKerja (){
        return Period.between(getTMT(), LocalDate.now());
    }

    //menampilkan informasi dari pegawai
    public void printInfo(){
        Period p = getmasaKerja();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + NIP);
        System.out.println("tanggal lahir : " + tanggalLahir.format(format));
        System.out.println("TMT : " + TMT.format(format));
        System.out.printf("gaji pokok : Rp %,.2f\n", gajiPokok);
        System.out.println("masa kerja : " + p.getYears() + " tahun " + p.getMonths() + " bulan");
    }
}
