/*
Nama File   :MataKuliah.java
Deskripsi   :Atribut dan method dari class MataKuliah
Pembuat     :Eileen 24060124140180
Tanggal     :8 Maret 2026
 */

public class MataKuliah {
    /********ATRIBUT*********/
    private String idMatkul;
    private String nama;
    private int sks;

    /********METHOD**********/
    // Konstruktor MataKuliah tanpa parameter
    public MataKuliah(){

    }
    //Konstruktor MataKuliah dengan paramater idMatkul, nama, dan sks
    public MataKuliah(String a, String b, int c){
        this.idMatkul = a;
        this.nama = b;
        this.sks = c;
    }

    //Mengembalikan nilai idMatkul
    public String getidMatkul(){
        return this.idMatkul;
    }

    //Mengembalikan nilai nama
    public String getNama(){
        return this.nama;
    }

    //Mengembalikan nilai sks
    public int getSks(){
        return this.sks;
    }

    //Mengeset nilai idMatkul
    public void setidMatkul(String x){
        this.idMatkul = x;
    }

    //Mengeset nilai nama
    public void setNama(String y){
        this.nama = y;
    }

    //Mengeset nilai sks
    public void setSks(int z){
        this.sks = z;
    }
    
}
