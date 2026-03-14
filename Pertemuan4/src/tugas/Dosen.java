package tugas;
/*
Nama File   : Dosen.java
Deskripsi   : Berisi atribut dan method untuk kelas Dosen
Pembuat     : Eileen 24060124140180
Tanggal     : 13 Maret 2026
*/

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    //********ATRIBUT*********/
    private String fakultas;
    
    //*******METHODS**********/
    //konstruktor untuk membuat pegawai tanpa parameter
    public Dosen(){

    }

    //konstruktor untuk membuat pegawai dengan parameter nip, nama, tanggal lahir, tmt, gaji pokok dan fakultas
    public Dosen (String a, String b, LocalDate c, LocalDate d, double e, String f){
        super(a,b,c,d,e);
        this.fakultas = f;
    }

    //mengembalikan nilai fakultas
    public String getfakultas(){
        return this.fakultas;
    }

    //mengeset nilai fakultas
    public void setfakultas(String x){
        this.fakultas = x;
    }

    //menampilkan informasi dari dosen
    //override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
