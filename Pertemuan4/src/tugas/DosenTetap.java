package tugas;
/*
Nama File   : DosenTetap.java
Deskripsi   : Berisi atribut dan method untuk kelas Dosen Tetap
Pembuat     : Eileen 24060124140180
Tanggal     : 13 Maret 2026
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen{
    //********Atribut***********/
    private String NIDN;
    private final static int BUP = 65;
    
    //********Methods***********/
    //konstruktor untuk membuat dosen tetap tanpa parameter
    public DosenTetap(){

    }

    //konstruktor untuk membuat dosen dengan parameter nip,nama,tanggal lahir, TMT, gaji pokok, fakultas dan NIDN
    public DosenTetap(String a, String b, LocalDate c, LocalDate d, double e, String f, String g){
        super(a,b,c,d,e,f);
        this.NIDN = g;
    }

    //mengembalikan nilai NIDN
    public String getNIDN(){
        return this.NIDN;
    }

    //mengeset nilai NIDN
    public void setNIDN(String x){
        this.NIDN = x;
    }

    //mengembalikan nilai BUP
    public int getBUP(){
        return BUP;
    }

     //method untuk mengembalikan tanggal pensiun
    public LocalDate gettanggalPensiun(){
        LocalDate pensiun = gettanggalLahir().plusYears(getBUP());
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }
    
    //mengembalikan nilai tunjangan
    //override
    public double getTunjangan(){
        return (0.02) * getmasaKerja().getYears() * getgajiPokok();
    }

    //menampilkan informasi dari dosen tetap
    //override
    public void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        super.printInfo();
        System.out.println("NIDN : " + NIDN);
        System.out.printf("Tunjangan : Rp %,.2f\n ", getTunjangan());
        System.out.println("tanggal pensiun : " + gettanggalPensiun().format(format));
        System.out.println("Jabatan : Dosen Tetap");
    }

}

