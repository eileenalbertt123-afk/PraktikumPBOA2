/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Eileen 240601241401880
 * Tanggal      : 23 Februari 206
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);   //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik();  //mencetak koordinat T1 ke layar
        T1.geser(3,4);    //menggeser T1 sejauh (3,4)
        T1.printTitik();  //menampilkan koordinat T1 setelah digeser

        Titik T2 = new Titik(3,-5);
        T2.printTitik();;
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println("jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println(" jarak T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("jarak antara T1 dan T2 = " + T1.getJarak(T2));
        System.out.println("T1 berada di kuadran ke- = " + T1.getKuadran());
        System.out.println("Refleksi X terhadap T2 = ");
        T2.getRefleksiX().printTitik();
        System.out.println("reflesi Y terhadap T2 = ");
        T2.getRefleksiY().printTitik();

    }

}