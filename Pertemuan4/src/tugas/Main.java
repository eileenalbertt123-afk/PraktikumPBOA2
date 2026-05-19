package tugas;
/*
Nama File   : Main.java
Deskripsi   : Berisi main program untuk menguji class yang telah dibuat
Pembuat     : Eileen 24060124140180
Tanggal     : 13 Maret 2026
*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Membuat objek Dosen Tetap
        DosenTetap d1 = new DosenTetap(
                "9545647548",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika",
                "78647324"
        );

        // Membuat objek Dosen Tamu
        DosenTamu d2 = new DosenTamu(
                "8654321987",
                "Budi",
                LocalDate.of(1985,3,10),
                LocalDate.of(2022,2,1),
                4500000,
                "Fakultas Teknik",
                "99887766",
                LocalDate.of(2027,6,30)
        );

        // Membuat objek Tendik
        Tendik t1 = new Tendik(
                "1234567890",
                "Siti",
                LocalDate.of(1992,7,15),
                LocalDate.of(2018,3,1),
                3500000,
                "Akademik"
        );

        System.out.println("===== DATA DOSEN TETAP =====");
        d1.printInfo();

        System.out.println("\n===== DATA DOSEN TAMU =====");
        d2.printInfo();

        System.out.println("\n===== DATA TENDIK =====");
        t1.printInfo();
    }
}