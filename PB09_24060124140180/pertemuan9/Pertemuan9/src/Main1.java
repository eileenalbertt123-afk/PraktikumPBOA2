/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 4 Mei 2026
Keterangan: No 1 (Koleksi Kelas Dasar)
 */

import java.util.ArrayList;

class Teman {
    // atribut
    private int nbelm;
    private ArrayList<String> Lnama;

    // method
    // konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama(indeks)
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);}
        else{
            return "Indeks tidak valid";
        }
    }

    // c. setNama(indeks, nama)
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    // d. addNama(nama)
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }
   

    // e. delNama(nama)
    public void delNama(String nama){
        if (Lnama.remove(nama)){
            nbelm = nbelm-1;
        }
    }
    
    // f. isMember(nama)
    public boolean isMember (String nama){
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama, namabaru)
    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }

    // h. countNama(nama)
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // i. showTeman()
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String n : Lnama) {
            System.out.println(n);
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Teman t = new Teman();

        // tambah nama
        t.addNama("Andi");
        t.addNama("Budi");
        t.addNama("Cici");
        t.addNama("Andi");

        // tampil daftar teman
        t.showTeman();

        // jumlah elemen
        System.out.println("Jumlah teman: " + t.getNbelm());

        // ambil nama
        System.out.println("Index 1: " + t.getNama(1));

        // ganti nama
        t.gantiNama("Budi", "Dedi");

        // set nama
        t.setNama(0, "Ari");

        // apakah ada Andi?
        System.out.println("Apakah Andi ada: " + t.isMember("Andi"));

        // hitung nama
        System.out.println("Jumlah Andi: " + t.countNama("Andi"));

        // hapus nama
        t.delNama("Budi");

        // tampilkan lagi
        t.showTeman();
    }
}