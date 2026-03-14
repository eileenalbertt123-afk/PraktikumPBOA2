package tugas;
/*
Nama File   : Tendik.java
Deskripsi   : Berisi atribut dan method untuk kelas Tendik
Pembuat     : Eileen 24060124140180
Tanggal     : 13 Maret 2026
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai{
    //**********Atribut*********/
    private String bidang;
    private static final int BUP = 55;

    //*********Methods***********/
    //konstruktor untuk membuat tendik tanpa parameter
    public Tendik(){

    }

    //konstruktor untuk membuat tendik dengan parameter NIP, nama, tanggal lahir, tmt, gaji pokok dan bidang
    public Tendik(String a, String b, LocalDate c, LocalDate d, double e, String f){
        super (a,b,c,d,e);
        this.bidang = f;
    }

    //mengembalikan nilai bidang
    public String getbidang(){
        return this.bidang;
    }
    
    //mengeset nilaoi bidang
    public void setbidang(String x){
        if (x.equalsIgnoreCase("Akademik") || x.equalsIgnoreCase("Kemahasiswaan") || x.equalsIgnoreCase("Sumber Daya")) //agar nilai bidang yang diinput hanya dapat akademik/kemahasiswaan/sumber daya sesuai syarat soal
            this.bidang = x;
        else {
            System.out.println("Tendik hanya dapat bekerja pada salah satu bidang, yaitu akademik, kemahasiswaan, atau sumber daya");
        }

    }

    //mengembalikan nilai tunjangan
    public double gettunjangan(){
        return (0.01) * getmasaKerja().getYears() *getgajiPokok();
    }

    //menampilkan nilai BUP
    public int getBUP(){
        return BUP;
    }

    //method untuk mengembalikan tanggal pensiun
    public LocalDate gettanggalPensiun(){
        LocalDate pensiun = gettanggalLahir().plusYears(getBUP());
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    //menampilkan informasi dari tendik
    //override
    public void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        super.printInfo();
        System.out.printf("tunjangan : Rp %,.2f\n ", gettunjangan());
        System.out.println("bidang : " + bidang);
        System.out.println("tanggal pensiun : " + gettanggalPensiun().format(format));
        System.out.println("Jabatan: Tendik");
    }
    
}
