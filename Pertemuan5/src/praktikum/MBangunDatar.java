/*
Nama File   : MBangunDatar.java
Deskripsi   : Main class untuk menguji class Persegi dan Lingkaran
Pembuat     : Eileen 24060124140180
Tanggal     : 9 Maret 2026
*/
package praktikum;

public class MBangunDatar {

    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi p1 = new Persegi(4, "Merah", "Hitam");

        System.out.println("===== PERSEGI =====");
        p1.printInfo();
        System.out.println("Sisi       : " + p1.getSisi());
        System.out.println("Luas       : " + p1.getLuas());
        System.out.println("Keliling   : " + p1.getKeliling());
        System.out.println("Diagonal   : " + p1.getDiagonal());

        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran l1 = new Lingkaran(10, "Biru", "Putih");

        System.out.println("===== LINGKARAN =====");
        l1.printInfo();
        System.out.println("Jari-jari  : " + l1.getJari());
        System.out.println("Luas       : " + l1.getLuas());
        System.out.println("Keliling   : " + l1.getKeliling());

        System.out.println();

        // Contoh objek lain
        Persegi p2 = new Persegi();
        p2.setSisi(6);

        System.out.println("===== PERSEGI 2 =====");
        System.out.println("Sisi       : " + p2.getSisi());
        System.out.println("Luas       : " + p2.getLuas());
        System.out.println("Keliling   : " + p2.getKeliling());

        //membandingkan bangun datar persegi p1 dan bangun datar l1

        System.out.println("Apakah sama? " + p1.isEqualLuas(l1));
    }   
}