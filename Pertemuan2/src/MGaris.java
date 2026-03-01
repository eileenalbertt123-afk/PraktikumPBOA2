/* Nama File    : MGaris.java
 * Deskripsi    : Menjalankan class Garis
 * Pembuat      : Eileen 24060124140180
 * Tanggal      : 1 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {

        // Membuat dua titik
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);

        // Membuat garis dari T1 ke T2
        Garis G1 = new Garis(T1, T2);

        System.out.println("=== Garis G1 ===");
        G1.printGaris();
        System.out.println("Panjang garis = " + G1.getPanjang());
        System.out.println("Gradien = " + G1.getGradien());
        System.out.println("Titik tengah = ");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan garis = " + G1.getPersamaanGaris());

        // Membuat garis kedua
        Titik T3 = new Titik(1, 1);
        Titik T4 = new Titik(3, 5);
        Garis G2 = new Garis(T3, T4);

        System.out.println("\n=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Gradien = " + G2.getGradien());

        System.out.println("\nApakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("\nJumlah objek garis = " + Garis.getCounterGaris());
    }
}

      