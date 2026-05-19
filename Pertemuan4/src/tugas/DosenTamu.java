package tugas;
/*
Nama File   : DosenTamu.java
Deskripsi   : Berisi atribut dan method untuk kelas Dosen Tamu
Pembuat     : Eileen 24060124140180
Tanggal     : 13 Maret 2026
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DosenTamu extends Dosen{
    //**********ATRIBUT***********/
    private LocalDate tanggalAkhirKontrak;
    private String NIDK;

    //**********METHODS************/
    //konstruktor untuk mrmbuat kelas dosen tamu tanpa parameter
    public DosenTamu(){

    }

    //konstruktor untuk membuat kelas dosen tamu dengan parameter nip, nama, tanggal lahir, tmt, gaji pokok, fakultas, NIDK, tanggal akhir kontark
    public DosenTamu(String a, String b, LocalDate c, LocalDate d, double e, String f, String g, LocalDate h){
        super(a,b,c,d,e,f);
        this.NIDK = g;
        this.tanggalAkhirKontrak = h;

    }

    //mengembalikan nilai NIDK
    public String getNIDK(){
        return this.NIDK;
    }

    //mengeset nilai NIDK
    public void setNIDK(String x){
        this.NIDK = x;
    }

    //mengembalikan tanggal akhir kontrak 
    public LocalDate gettanggalAkhirKontrak(){
        return this.tanggalAkhirKontrak;
    }

    //mengeset tanggal akhir kontrak
    public void settanggalAkhirKontrak(LocalDate y){
        this.tanggalAkhirKontrak = y;
    }

    //mengembalikan nilai tunjangan
    public double getTunjangan(){
        return 0.025 * getgajiPokok();
    }

    //mengembalikan nilai sisa kontrak
    public long getSisaKontrak(){
    return ChronoUnit.MONTHS.between(LocalDate.now(), tanggalAkhirKontrak);
}

    //override
    //menampilkan informasi detail dosen tamu
    public void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Tanggal Akhir Kontrak:"  + tanggalAkhirKontrak.format(format));
        System.out.println("sisa kontrak: " + getSisaKontrak() + " bulan");
        System.err.printf("Tunjangan : Rp %,.2f\n", getTunjangan());
    }
}
