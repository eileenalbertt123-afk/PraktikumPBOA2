/*
Nama File   :Mahasiswa.java
Deskripsi   :Atribut dan method dari class Mahasiswa
Pembuat     :Eileen 24060124140180
Tanggal     :2 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /**********ATRIBUT**************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***********METHOD*************/

    //Konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>(); // inisialisasi ArrayList kosong
    }

    //Konstruktor untuk membuat mahasiswa dengan parameter nip,nama, prodi
    public Mahasiswa(String a, String b, String c){
        this.nim = a;
        this.nama = b;
        this.prodi = c;
        this.listMatkul = new ArrayList<>();
    }

    //Mengembalikan nama
    public String getNama(){
        return this.nama;
    }

    //mengembalikan nim
    public String getNIM(){
        return this.nim;
    }

    //mengembalikan prodi
    public String getProdi(){
        return this.prodi;
    }

    //mengeset string nama
    public void setNama(String a){
        this.nama = a;
    }

    //mengeset string nim
    public void setNim(String b){
        this.nim = b;
    }

    //mengeset string prodi
    public void setProdi(String c){
        this.prodi = c;
    }


    //Prosedur untuk menambah mata kuliah ke list matkul
    public void addMatkul (MataKuliah newMatkul) {
        listMatkul.add(newMatkul);}


    //Mengembalikan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int total = 0;

        for (int i = 0; i<listMatkul.size(); i++){
            total += listMatkul.get(i).getSks();
        }

        return total;
    }

    //Mengembalikan jumlah matakuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    //Menampilkan nim, nama, prodi mahasiswa
     public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    //Mengeset nilai dosen wali
    public void setDosenWali(Dosen d){
    this.dosenWali = d;
    }

    //Mengeset nilai kendaraan
    public void setKendaraan(Kendaraan k){
        this.kendaraan = k;
    }
    
    //Menampilkan detail Mahasiswa ke layar
    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        int i;
        for (i=0; i<listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());}
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getNoPlat());
        
    }


    }

