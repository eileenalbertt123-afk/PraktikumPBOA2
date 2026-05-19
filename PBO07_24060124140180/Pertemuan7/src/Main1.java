/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 20 April 2026
Keterangan: No 1
 */

class Konversi {

    void tampil(int nilai) {
        System.out.println("Integer: " + nilai);
    }

    void tampil(double nilai) {
        System.out.println("Real: " + nilai);
    }

    void tampil(char nilai) {
        System.out.println("Karakter: " + nilai);
    }

    void tampil(String nilai) {
        System.out.println("String: " + nilai);
    }
}

public class Main1 {
    public static void main(String[] args) {

        Konversi tes = new Konversi();

       //a. ilustrasi polimorfisme
        int angka = 65;
        tes.tampil(angka);             // integer
        tes.tampil((double) angka);    // real
        tes.tampil((char) angka);      // karakter

        //b. int diubah jadi real, dikembalikan ke integer akan dikembalikan ke format int
        double real = (double) angka;
        int kembali = (int) real;

        System.out.println("\nDouble: " + real);
        System.out.println("Kembali ke int: " + kembali);

        //c. String X dan Y denggan String S hasil konkatenasi X dan Y. Sedangkan Integer Z hasil penjumlahan X dan Y
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("\nS (konkatenasi): " + S);
        System.out.println("Z (penjumlahan): " + Z);

        //d. String P dan Q dengan String R merupakan hasil konkatenasi P dan Q. Double D hasil penjumlahan P dan Q
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("\nR (konkatenasi): " + R);
        System.out.println("D (penjumlahan): " + D);

        //e. objek Int A yang diisi hasil konversi nilai S 
        Integer A = Integer.parseInt(S);
        System.out.println("\nA (Integer dari S): " + A);

        //f. objek String T yang diisi hasil konversi nilai A 
        String T = A.toString();
        System.out.println("T (String dari A): " + T);
    }
}