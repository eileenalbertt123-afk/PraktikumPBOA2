/*
Nama File   :Mahasiswa.java
Deskripsi   :Atribut dan method dari class Mahasiswa
Pembuat     :Eileen 24060124140180
Tanggal     :2 Maret 2026
 */

public class Dosen {
    /********ATRIBUT*********/
    private String nip;
    private String nama;
    private String prodi;

    //*******METHOD********/

    //Konstruktor untuk membuat dosen tanpa parameter
    public Dosen(){
    }

    //Konstruktor untuk membuat dosen dengan parameter nip, nama dan prodi
    public Dosen (String a, String b, String c){
        this.nip = a;
        this.nama = b;
        this.prodi = c;
    }

    //Mengembalikan nip
    public String getNIP(){
        return this.nip;
    }

    //Mengembalikan nama
    public String getNama(){
        return this.nama;
    }

    //Mengembalikan prodi
    public String getProdi(){
        return this.prodi;
    }

    //Mengeset nip
    public void setNIP(String x){
        this.nip = x;
    }

    //Mengeset nama
    public void setNama(String y){
        this.nama = y;
    }

    //Mengeset prodi
    public void setProdi(String z){
        this.prodi = z;
    }
}
