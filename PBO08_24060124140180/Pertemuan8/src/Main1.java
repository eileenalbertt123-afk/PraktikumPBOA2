/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 27 April 2026
Keterangan: GENERIK PADA CLASS (no 1 dan 2)
 */

public class Main1 {
    public static void main(String[] args) {
    // membuat objek
        Anabul k = new Kucing();
        Anabul a = new Anjing();
        Anabul b = new Burung();

        // simulasi
        k.suara();
        k.gerak();

        a.suara();
        a.gerak();
        
        b.suara();
        b.gerak();

    //aplikasi kelas generik datum 
    Datum<Anabul> da = new Datum<>();

    //isi = Kucing
    da.setIsi(k);
    da.getIsi().gerak();

    //isi = Anjing
    da.setIsi(a);
    da.getIsi().suara();

    //pakai tipe Kucing (keturunan/anak dari tipe anabul)
    Datum<Kucing> dk = new Datum<>();
    //membuat objek ku baru karena dk hanya menerima objek kelas kucing atau keturunanya sedangkan k itu kelas anabul
    Kucing ku = new Kucing();
    dk.setIsi(ku);
    dk.getIsi().suara();





    
}
}
