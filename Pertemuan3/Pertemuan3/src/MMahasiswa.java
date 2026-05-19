/*
Nama File   : MMahasiswa.java
Deskripsi   : Main program untuk menguji class Mahasiswa
Pembuat     : Eileen 24060124140180
Tanggal     : 2 Maret 2026
*/

public class MMahasiswa {

    public static void main(String[] args) {

        // Membuat objek dosen
        Dosen d1 = new Dosen("198765", "Pak Budi", "Informatika");

        // Membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Algoritma", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Pemrograman Berorientasi Objek", 4);

        // Membuat objek kendaraan
        Kendaraan k1 = new Kendaraan("H1234AB", "Motor");

        // Membuat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("24060124567879", "Andi", "Informatika");

        // Menghubungkan relasi
        m1.setDosenWali(d1);
        m1.setKendaraan(k1);

        // Menambahkan mata kuliah
        m1.addMatkul(mk1);
        m1.addMatkul(mk2);
        m1.addMatkul(mk3);

        // Menampilkan jumlah mata kuliah
        System.out.println("Jumlah Mata Kuliah: " + m1.getJumlahMatkul());

        // Menampilkan jumlah SKS
        System.out.println("Jumlah SKS: " + m1.getJumlahSKS());

        // Menampilkan detail mahasiswa
        System.out.println("\nDetail Mahasiswa:");
        m1.printDetailMhs();
    }
}